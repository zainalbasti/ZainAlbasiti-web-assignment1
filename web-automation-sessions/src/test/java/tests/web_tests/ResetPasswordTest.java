package tests.web_tests;

import org.maf.core.instance.BetaDriver.base;
import org.maf.page_objects.*;
import org.maf.utils.ExtentReport.TestListener;
import org.maf.utils.common.SharedMethods;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({TestListener.class})
public class ResetPasswordTest extends base {

    @Test(description = "to validate from toast message displayed when the user click on reset password")
    public void changeUserPassword() throws InterruptedException {

        SignUpPage signUp=new SignUpPage(getDriver());
        LoginPage home=new LoginPage(getDriver());
        ProfilePage profile=new ProfilePage(getDriver());
        PersonalProfile info=new PersonalProfile(getDriver());
        ResetPasswordPage resetPassword=new ResetPasswordPage(getDriver());
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
        Thread.sleep(25000);
        profile.clickOnProfileAvatar();
        profile.clickOnProfileButton();
        Thread.sleep(15000);
        info.clickOnChangeButton();
        Thread.sleep(6000);
        resetPassword.clickOnResetPassword();
        SharedMethods.waitUntilElementVisible(resetPassword.toastMessage);
        Assert.assertTrue(resetPassword.checkVisibilityOfToastMessage());


    }

}
