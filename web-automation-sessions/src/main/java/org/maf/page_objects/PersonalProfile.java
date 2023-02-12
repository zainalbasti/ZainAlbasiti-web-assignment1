package org.maf.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalProfile {

    public PersonalProfile(WebDriver driver) {PageFactory.initElements(driver,this);}

    @FindBy(xpath = "//button[@class='btn-change']")
    private WebElement changeButton;

    @FindBy(xpath = "//input[@id='first name']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='last name']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='mobile number']")
    public WebElement phoneNumber;


    public void clickOnChangeButton(){
     changeButton.click();
    }


}
