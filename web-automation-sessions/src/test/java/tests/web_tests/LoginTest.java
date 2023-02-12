package tests.web_tests;

import org.maf.core.instance.BetaDriver.base;
import org.maf.page_objects.LoginPage;
import org.maf.utils.ExtentReport.TestListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({TestListener.class})
public class LoginTest extends base {

 @Test(description = "Validate that user able to login")
 public void signIn() throws InterruptedException {
 LoginPage login=new LoginPage(getDriver());
 login.clickOnAcceptButton();
 login.clickOnSignInButton();
 Thread.sleep(4000);
 login.enterUserName(objXMLReader.getXMLData("email2"));
 login.enterPassword(objXMLReader.getXMLData("password3"));
 login.clickOnLoginButton();
 Thread.sleep(7000);
 Assert.assertTrue(login.checkAvatarIsDisplayed());
 }




}
