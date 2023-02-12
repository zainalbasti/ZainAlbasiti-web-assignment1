

package org.maf.utils.db;

import org.maf.core.enums.Databases;
import org.maf.utils.error_handlers.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * setup connection class
 * 
 *
 */
public class DbConnection {

	private static DbConnection dbConnection;
	private Connection con;

	public static DbConnection getInstance() {
		if (dbConnection == null) {
			dbConnection = new DbConnection();
		}
		return dbConnection;
	}

	private DbConnection() {
		init();
	}
	/**
	 * 
	 * Initiate connection based on value retrieved from the props file 
	 */

	private void init() {
		Databases dbName = Databases.fromString(DBpropertiesUtils.getProperty(DBpropertiesUtils.PROP_NAME_DB_VENDOR));
		String url = DBpropertiesUtils.getProperty(DBpropertiesUtils.PROP_NAME_DB_URL);
		String username = DBpropertiesUtils.getProperty(DBpropertiesUtils.PROP_NAME_DB_USER_NAME);
		String password = DBpropertiesUtils.getProperty(DBpropertiesUtils.PROP_NAME_DB_PASSWORD);


		try {
			Class.forName(dbName.getDbDriverClassName());
			Logger.info("Connecting to the " + url);
			con = DriverManager.getConnection(dbName.getUrlPrefix().concat(url), username, password);
			Logger.info(con + " Connection created");
		} catch (Exception e) {
			Logger.info("Error occurs while creating connection to mysql database using the following parameters "
					+ "username ".concat(username) + " password ".concat(password));
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		return con;
	}

	public void closeConnection() {
		try {
			if (con != null && !con.isClosed())
				con.close();
			con = null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
