package org.maf.utils.db;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OptionsMapper {


    public static ProductOptions getProductOptions(String productID){
        return mapOptions(productID) ;

    }

private static ProductOptions mapOptions(String productID) {



    try {

        //todo use prepared statments
        ResultSet test = DBUtilities.getResultSet(

                "SELECT * FROM `marketplace-dev`.mp_product_options_combinations_option_values comv\n" +
                        "\n" +
                        "join `marketplace-dev`.mp_product_options_combinations com\n" +
                        "\n" +
                        "on comv.combination_id = com.id\n" +
                        "\n" +
                        "where com.product_id = "+productID+"");

        test.next();

                ProductOptions productOptions = new ProductOptions();
                productOptions.setOptionsID(Integer.parseInt(test.getString("id")));

             return productOptions;

    } catch (SQLException e) {
        e.printStackTrace();
    }
          return null;
}


}
