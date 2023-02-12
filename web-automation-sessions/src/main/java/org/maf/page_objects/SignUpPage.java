package org.maf.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

  public SignUpPage(WebDriver driver) {PageFactory.initElements(driver,this);}

  @FindBy(xpath = "//label[@for='titles1']")
  private WebElement titleRadio;

  @FindBy(id = "first name")
  private WebElement firstName;

  @FindBy(id = "last name")
  private WebElement lastName;

  @FindBy(id = "email")
  private WebElement email;

  @FindBy(id = "phone number")
  private WebElement phoneNumber;

  @FindBy(xpath = "(//div[contains(@class,'absolute top-0')]/following-sibling::div)[3]")
  private WebElement dateOfBirth;

  @FindBy(xpath = "//h3[@class='text-left rtl:text-right cursor-pointer calendar-faint']")
  private WebElement year;

  @FindBy(xpath = "//div[@id='1997-calendar-year']")
  private WebElement selectYear;

  @FindBy(xpath = "//button[@value='6']")
  private WebElement selectMonth;

  @FindBy(xpath = "//td[normalize-space()='29']")
  private WebElement selectDay;


  @FindBy(xpath = "//button[@class='text-primary font-bold']")
  private WebElement saveDateButton;

  @FindBy(xpath = "//div[@id='app']/div[1]/div[1]/main[1]/div[1]/span[1]/form[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[2]")
  private WebElement nationalityField;

  @FindBy(xpath = "//input[@placeholder='Search']")
  private WebElement searchNationality;

  @FindBy(xpath = "//span[@class='nationality-bar ml-4 rtl:mr-4']")
  private WebElement selectNationality;

  @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/span[1]/form[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/span[1]/div[2]")
  private WebElement countryOfResidence;

  @FindBy(xpath = "//input[@placeholder='Search']")
  private WebElement searchField;

  @FindBy(xpath = "//span[normalize-space()='United Arab Emirates']")
  private WebElement selectCountry;

  @FindBy(xpath = "//input[@id='password']")
  private WebElement password;

  @FindBy(id = "submit-button")
  private  WebElement createAccountButton;

  @FindBy(xpath = "//div[@class='w-full mx-auto max-w-xs mt-5 mb-5']//button[@id='submit-button']")
  private WebElement validationPopup;

  @FindBy(xpath = "//div[@class='user-avatar']")
  private WebElement loggedInAvatar;


  public void selectTitle(){
  titleRadio.click();
  }

  public void enterFirstName(String firstName){
   this.firstName.sendKeys(firstName);
  }

  public void enterLastName(String lastName){
   this.lastName.sendKeys(lastName);
  }

  public void enterEmail(String Email){
  this.email.sendKeys(Email);
  }

  public void enterPhoneNumber(String phone){
  this.phoneNumber.sendKeys(phone);
  }

  public void clickOnBirthdayField(){
   dateOfBirth.click();
  }

  public void selectYear(){
   year.click();
  }
  public void chooseSpecificYear(){
  selectYear.click();
  }

  public void selectMonth(){
   selectMonth.click();
  }

  public void selectDay(){
   selectDay.click();
  }

  public void saveSelectedDate(){
   saveDateButton.click();
  }

  public void clickOnNationalityField(){
   nationalityField.click();
  }

  public void enterNationality(String nationality){
  searchNationality.sendKeys(nationality);
  }



  public void selectNationality(){
   selectNationality.click();
  }

  public void clickOnCountryOfResidence(){
  countryOfResidence.click();
  }

  public void enterCountryOfResidence(String country){
  this.searchField.sendKeys(country);
  }

  public void selectCountryOfResidence(){
   selectCountry.click();
  }

  public void enterPassword(String password){
   this.password.sendKeys(password);
  }

  public void clickOnCreateAccountButton(){
  createAccountButton.click();
  }

  public void clickOnValidationPopUp(){
    validationPopup.click();
  }

 public boolean checkAvatarIsDisplayed(){
  return loggedInAvatar.isDisplayed();
 }


}
