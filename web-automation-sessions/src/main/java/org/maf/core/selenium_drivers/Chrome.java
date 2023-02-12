package org.maf.core.selenium_drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.bytecode.Throw;
import org.maf.core.enums.Drivers;
import org.maf.core.enums.HeadlessStrategyOperator;
import org.maf.core.instance.SelInstance;
import org.maf.utils.PropReader;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Chrome implements SelDriverProvider {

    public static final String TRUE = "true";
    ChromeOptions options = (ChromeOptions) OptionsFactory.getOptions (Drivers.CHROME);

    @Override
    public WebDriver getBrowser(boolean isHeadless) {
        if (PropReader.readConfig ("isSpecificVersion").equalsIgnoreCase (TRUE)) {
            WebDriverManager.chromedriver ().driverVersion (PropReader.readConfig ("ChromeVersion")).setup ();

        }
        else {

            WebDriverManager.chromedriver ().setup ();
        }


        if (isHeadless) {
            return HeadlessStrategyOperator.CHROME.execute ();

        } else {
            return new ChromeDriver(options);
        }
    }
}