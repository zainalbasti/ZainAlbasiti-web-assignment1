package org.maf.core.selenium_drivers;

import org.maf.core.enums.HeadlessStrategyOperator;
import org.maf.core.instance.SelInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Safari implements SelDriverProvider{


    @Override
    public WebDriver getBrowser(boolean isHeadless) {
        WebDriver driver = new SafariDriver();

        if (isHeadless) {
            return HeadlessStrategyOperator.SAFARI.execute ();
        } else {
        }
        return driver;


    }
}
