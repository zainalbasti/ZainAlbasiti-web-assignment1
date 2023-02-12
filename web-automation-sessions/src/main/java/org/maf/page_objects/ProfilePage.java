package org.maf.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

    public ProfilePage(WebDriver driver) {PageFactory.initElements(driver,this);}

    @FindBy(xpath = "//div[@class='user-avatar']")
    public WebElement profileAvatar;

   @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/header[1]/div[1]/nav[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/a[1]/span[1]/img[1]")
    private WebElement profileButton;

   @FindBy(xpath = "//h1[@class='title']")
   private WebElement personalDetailsLabel;


   public void clickOnProfileAvatar(){
   profileAvatar.click();
   }

   public void clickOnProfileButton(){
   profileButton.click();
   }

   public boolean checkLabelIsDisplayed(){
     return personalDetailsLabel.isDisplayed();
   }


}
