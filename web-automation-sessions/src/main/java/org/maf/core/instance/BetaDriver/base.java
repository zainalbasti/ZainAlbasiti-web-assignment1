package org.maf.core.instance.BetaDriver;
import org.maf.core.instance.SelInstance;
import org.maf.utils.PropReader;
import org.maf.utils.handler.ReengineeringXMLReader;
import org.maf.utils.handler.WaitHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class base extends SelInstance {

public static final String xmlPathName = "reengineering";


    public base ()
    {
        super(new ReengineeringXMLReader(xmlPathName));
    }

    @BeforeMethod
    public void navigateToLEcURL(){

    //get URL
    WebDriver driver = doBrowserSetup();
    WaitHelper.handleImplicit (driver);
    threadLocalDriver.set(driver);
    threadLocalDriver.get ().get ("https://abd-stg.skidxb.com/en-ae/ski-dubai/");

}
    //get thread-safe driver

    @AfterMethod
    public void tearDown(){
        getDriver().quit();
        threadLocalDriver.remove();
    }

    }
