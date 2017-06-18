package com.loveholidays.WebPages;

import com.loveholidays.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Manage My Booking page functionality methods.
 */
public class ManageMyBookingPage extends Utils {

    //element to get word "Welcome To Manage My Booking"
    @FindBy(className = "mmb-login__heading")
    public WebElement _welcomeToManageMyBooking;

    //element for "Please Enter Your Full Booking Reference" field
    @FindBy(xpath = "//input[@id='js-reference-field-with-letters']")
    public WebElement _enterBookingReferenceNumberBox;

    //element for Lead Passenger surname box
    @FindBy(name = "surname")
    WebElement _leadPassengerSurnameBox;

    //element for sing in button
    @FindBy(className = "mmb-login__form__submit__button")
    WebElement _clickOnSignInButtonOnMMBPage;

    /*Element for error message displayed when User Enter booking reference number "LVE1702LCCCQV9H" and Lead passender surname"Test"*/
    @FindBy(xpath = "//form[@id='getBooking']/label/p")
    public WebElement _errorMessageWhenEnterReferenceAndSurname;

    //typing booking reference number at 'Please enter your full booking reference:'
    public void enterYourFullBookingReference(String bookingReference) {
        _enterBookingReferenceNumberBox.sendKeys(bookingReference);
    }

    //typing lead passenger's surname
    public void enterLeadPassengerSurname() {
        _leadPassengerSurnameBox.sendKeys("Test");
    }

    //click on 'Sign in' button on Manage My Booking page
    public void clickOnSignInButtonOnManageMyBookingPage() {
        _clickOnSignInButtonOnMMBPage.click();
    }


}
