package tests.web_tests;

import org.maf.core.instance.BetaDriver.base;
import org.maf.page_objects.LoginPage;
import org.maf.page_objects.PersonalProfile;
import org.maf.page_objects.ProfilePage;
import org.maf.page_objects.SignUpPage;
import org.maf.utils.ExtentReport.TestListener;
import org.maf.utils.common.SharedMethods;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({TestListener.class})
public class PersonalInfoTest extends base {

        @Test(description = "Validate personal info on profile page")
        public void checkPersonalDetails() throws InterruptedException {
        SignUpPage signUp=new SignUpPage(getDriver());
        LoginPage home=new LoginPage(getDriver());
        ProfilePage profile=new ProfilePage(getDriver());
        PersonalProfile info=new PersonalProfile(getDriver());
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
        Thread.sleep(40000);
        profile.clickOnProfileAvatar();
        profile.clickOnProfileButton();
        Thread.sleep(40000);
        info.clickOnChangeButton();
        Thread.sleep(15000);

        //to check that the entered date on sign up page matches with personal info on profile page
            Assert.assertEquals(info.firstName.getAttribute("value"),objXMLReader.getXMLData("firstName"));
            Assert.assertEquals(info.lastName.getAttribute("value"),objXMLReader.getXMLData("lastName"));
            Assert.assertEquals(info.phoneNumber.getAttribute("value"),objXMLReader.getXMLData("phone"));


    }
}
