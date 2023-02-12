package org.maf.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver) {PageFactory.initElements(driver,this);}

    @FindBy(xpath = "//button[@class='btn-sign-in']")
    private WebElement signInButton;

    @FindBy(xpath = "//span[text()='Sign Up']")
    private WebElement signUpButton;

    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElement acceptButton;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//button[@id='submit-login-form']")
    private WebElement loginButton;

    @FindBy(xpath = "//div[@class='user-avatar']")
    private WebElement loggedInAvatar;



    public void clickOnSignInButton(){
     signInButton.click();
    }

    public void clickOnSignUpButton(){
     signUpButton.click();
    }

    public void clickOnAcceptButton(){
     acceptButton.click();
    }

    public void enterUserName(String userName){
     this.userName.sendKeys(userName);
    }

    public void enterPassword(String password){
     this.password.sendKeys(password);
    }

    public void clickOnLoginButton(){
     this.loginButton.click();
    }

    public boolean checkAvatarIsDisplayed(){
        return loggedInAvatar.isDisplayed();
    }
}
