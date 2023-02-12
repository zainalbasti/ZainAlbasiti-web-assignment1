package org.maf.utils.Common_steps;

import com.github.javafaker.Faker;
import org.maf.page_objects.*;
import org.maf.utils.common.SharedMethods;
import org.openqa.selenium.WebElement;

import static org.apache.commons.lang3.time.DateUtils.parseDate;
import static org.maf.core.instance.SelInstance.getDriver;
import static org.maf.core.instance.SelInstance.objXMLReader;
/*
public class SharedSteps {

    public static void userLogInToTheSite(String userName, String passWord) {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        // sKiHomePage.getAcceptCookiesButton ().click ();
        SharedMethods.waitTillClickAble(sKiHomePage.getSignInButton());
        sKiHomePage.getSignInButton().click();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.getUserName().sendKeys(userName);
        loginPage.getPassword().sendKeys(passWord);
        loginPage.getLoginCTA().click();
        SharedMethods.threadSleep(12000);
    }

    public static void userFillCCPayment(String Card, String cardExp, String cardCSV) {
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage(getDriver());
        paymentDetailsPage.getCardNumberField().sendKeys(Card);
        paymentDetailsPage.getCardExpiry().sendKeys(cardExp);
        paymentDetailsPage.getCardCSV().sendKeys(cardCSV);
    }

    public static void userFillPromoCodePayment(String code) {
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage(getDriver());
        SharedMethods.clickOn(paymentDetailsPage.getPromoCodeLabel());
        paymentDetailsPage.getCouponCodeInput().sendKeys(code);
        SharedMethods.clickOn(paymentDetailsPage.getApplyPromoCode());
    }

    public static void userFillCCInfo(String cardExp, String cardCSV) {
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage(getDriver());
        paymentDetailsPage.getCardExpiry().sendKeys(objXMLReader.getXMLData("cardExp"));
        paymentDetailsPage.getCardCSV().sendKeys(objXMLReader.getXMLData("cardCSV"));
    }

    public static void userApplyPromoCode(String promoCode) {
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage(getDriver());
        SharedMethods.clickAction(paymentDetailsPage.getPromoCodeRadio());
        paymentDetailsPage.getPromoCodeField().sendKeys(objXMLReader.getXMLData("promoCode"));
        paymentDetailsPage.getApplyPromoCode().click();

    }

    public static void userBookPassForm(WebElement tab, WebElement passCard) {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        SharedMethods.waitUntilElementVisible(sKiHomePage.getPassesAndPackages());
        SharedMethods.clickAction(sKiHomePage.getPassesAndPackages());
        SharedMethods.waitUntilElementVisible(tab);
        SharedMethods.clickOn(tab);
        SharedMethods.threadSleep(1000);
        SharedMethods.jsScrollDown (passCard);
        SharedMethods.waitUntilElementVisible(passCard);
        SharedMethods.waitUntilElementClickable(passCard);
        SharedMethods.jsScrollDown(passCard);
        SharedMethods.mouseClickAction(passCard);
    }

    public static void userFillGuestFormWithRandomData() {
        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage(getDriver());
        Faker faker = new Faker();
        personalDetailsPage.clickingMissRadioButton();
        personalDetailsPage.getFirstName().sendKeys(faker.name().firstName());
        personalDetailsPage.getLastName().sendKeys(faker.name().lastName());
        personalDetailsPage.getMobileNum().sendKeys(faker.numerify("50#######"));
        personalDetailsPage.getEmail().sendKeys(faker.internet().emailAddress());
        personalDetailsPage.getCountryDropDownList().click();
        SharedMethods.threadSleep(2000);
        SharedMethods.mouseClickAction(personalDetailsPage.getUAECountry());
        SharedMethods.mouseClickAction(personalDetailsPage.getBookingInformation());
        SharedMethods.mouseClickAction(personalDetailsPage.getTermsConditonsCheckbox());
    }

    public static void userAddGuestsAs(int Adults, int Junior, int Children) {
        ActivitiesPage activityPage = new ActivitiesPage(getDriver());
        SharedMethods.waitUntilElementVisible(activityPage.getGuestsDropDownList());
        SharedMethods.waitUntilElementClickable(activityPage.getGuestsDropDownList());
        SharedMethods.clickOn(activityPage.getGuestsDropDownList());
        for (int i = 0; i < Adults; i++) {
            SharedMethods.waitUntilElementClickable(activityPage.getAddAdultGuest());
            SharedMethods.mouseClickAction(activityPage.getAddAdultGuest());
        }
        for (int i = 0; i < Junior; i++) {
            SharedMethods.waitUntilElementClickable(activityPage.getNumberOfJuniors());
            SharedMethods.mouseClickAction(activityPage.getNumberOfJuniors());
        }
        for (int i = 0; i < Children; i++) {
            SharedMethods.waitUntilElementClickable(activityPage.getAddChildGuest());
            SharedMethods.mouseClickAction(activityPage.getAddChildGuest());
        }
    }

    public static String userSearchCalendarForDate(){
        AddOnsScreen addOnsScreen= new AddOnsScreen(getDriver()) ;
        SharedMethods.threadSleep (4000);

        SharedMethods.clickOn(addOnsScreen.getCalendarButton());
        SharedMethods.threadSleep (4000);
        SharedMethods.clickOn(addOnsScreen.getNextMonthButton());
        Integer loop = 3;
        addOnsScreen= new AddOnsScreen(getDriver());

        while (loop>0) {
            try {
                SharedMethods.threadSleep (5000);
                SharedMethods.clickOn(addOnsScreen.getCalenderFirstEnabledDate());
                loop = 0;
            } catch (Exception e) {
                SharedMethods.clickOn(addOnsScreen.getNextMonthButton());
                --loop;
            }
        }
        addOnsScreen.getCalendarSelectedDate().getText();
        SharedMethods.threadSleep(1000);
        String date = addOnsScreen.getCalendarSelectedDate().getText();
        String[] _date = date.split(" ");
        date = _date[0] + " " + _date[1].substring(0,3) + " " + _date[2];

        return date;
    }

}
*/