package org.maf.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResetPasswordPage {
    public ResetPasswordPage(WebDriver driver) {PageFactory.initElements(driver,this);}

    @FindBy(xpath = "//button[normalize-space()='Reset password']")
    private WebElement resetPasswordButton;

    @FindBy(xpath = "//p[normalize-space()='Password reset code sent!']")
    public WebElement toastMessage;


    public void clickOnResetPassword(){
     resetPasswordButton.click();
    }

    public boolean checkVisibilityOfToastMessage(){
     return toastMessage.isDisplayed();
    }
}
