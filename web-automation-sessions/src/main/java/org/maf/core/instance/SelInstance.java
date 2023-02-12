package org.maf.core.instance;

import org.maf.core.enums.BrowserEnumParser;
import org.maf.core.enums.Drivers;
import org.maf.core.selenium_drivers.*;
import org.maf.utils.PropReader;
import org.maf.utils.error_handlers.Logger;
import org.maf.utils.handler.XMLReader;
import org.openqa.selenium.WebDriver;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class SelInstance {

    public static final String IS_HEADLESS = "is-headless";
    private final static Map<Drivers, SelDriverProvider> map;
    private final static String browser = PropReader.readConfig("browser");
    private static final Drivers driverType = BrowserEnumParser.parse(browser);
    protected static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();
    public static XMLReader objXMLReader;


    static {
        map = new HashMap<>();
        map.put(Drivers.CHROME, new Chrome());
        map.put(Drivers.FIREFOX, new Firefox());
        map.put(Drivers.EDGE, new Edge());
        map.put(Drivers.IE, new IE());
        map.put(Drivers.CHROMEREMOTE, new ChromeRemote());
        map.put(Drivers.SAFARI,new Safari());
    }

    public SelInstance(XMLReader objXMLReader) {

        this.objXMLReader=objXMLReader;
    }

    public SelInstance() {


    }

    private static boolean getHeadlessFlag() {
        try {
            return Boolean.parseBoolean(PropReader.readConfig(IS_HEADLESS));

        } catch (RuntimeException e) {
            Logger.info("Error while reading headless value, value will be set to false as default");
        }
        return false;
    }

    public static WebDriver doBrowserSetup () {
        WebDriver driver = map.get (driverType).getBrowser (getHeadlessFlag ());
        driver.manage ().window ().maximize ();
        driver.manage()
                .timeouts().implicitlyWait (10, TimeUnit.SECONDS);
        return driver;

    }


    public static WebDriver getDriver(){

        return threadLocalDriver.get();

    }

}