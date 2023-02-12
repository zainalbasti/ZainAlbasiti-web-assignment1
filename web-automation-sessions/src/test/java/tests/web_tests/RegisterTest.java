package tests.web_tests;

import org.maf.core.instance.BetaDriver.base;
import org.maf.page_objects.LoginPage;
import org.maf.page_objects.ProfilePage;
import org.maf.page_objects.SignUpPage;
import org.maf.utils.ExtentReport.TestListener;
import org.maf.utils.common.SharedMethods;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners({TestListener.class})
public class RegisterTest extends base {

 @Test(description = "Register a new user and navigate to personal details page ")
 public void signUp() throws InterruptedException {
  LoginPage home=new LoginPage(getDriver());
  SignUpPage signUp=new SignUpPage(getDriver());
  ProfilePage profile=new ProfilePage(getDriver());
  home.clickOnAcceptButton();
  home.clickOnSignInButton();
  home.clickOnSignUpButton();
  signUp.selectTitle();
  signUp.enterFirstName(objXMLReader.getXMLData("firstName"));
  signUp.enterLastName(objXMLReader.getXMLData("lastName"));
  signUp.enterEmail("zainalbasiti+" + SharedMethods.generateRandomNumber() +"@hotmail.com");
  signUp.enterPhoneNumber(objXMLReader.getXMLData("phone"));
  signUp.clickOnBirthdayField();
  signUp.selectYear();
  signUp.chooseSpecificYear();
  signUp.selectMonth();
  signUp.selectDay();
  signUp.saveSelectedDate();
  signUp.clickOnNationalityField();
  signUp.enterNationality(objXMLReader.getXMLData("nationality"));
  signUp.selectNationality();
  signUp.clickOnCountryOfResidence();
  signUp.enterCountryOfResidence(objXMLReader.getXMLData("nationality2"));
  signUp.selectCountryOfResidence();
  signUp.enterPassword(objXMLReader.getXMLData("passWord1"));
  signUp.clickOnCreateAccountButton();
  signUp.clickOnValidationPopUp();
  signUp.clickOnCreateAccountButton();
  Thread.sleep(20000);
  //SharedMethods.waitUntilElementVisible(profile.profileAvatar);
  //Verify that profile avatar is displayed
  Assert.assertTrue(signUp.checkAvatarIsDisplayed());
  profile.clickOnProfileAvatar();
  profile.clickOnProfileButton();
  //Verify that personal details label is displayed
  Assert.assertTrue(profile.checkLabelIsDisplayed());

 }

}
