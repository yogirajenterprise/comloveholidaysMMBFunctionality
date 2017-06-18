package com.loveholidays;

import com.loveholidays.WebPages.HomePage;
import com.loveholidays.WebPages.ManageMyBookingPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


/**
 * Created by Prakash Narola on 17/06/2017.
 */
public class MyStepdefs extends Utils {


    HomePage homePage = new HomePage();
    ManageMyBookingPage manageMyBookingPage = new ManageMyBookingPage();


    @Given("^that a user goes to MMB page$")
    public void thatAUserGoesToMMBPage() {

        //click on Manage My Booking on home page menu bar next to FAQs tab.
        homePage.clickOnManageMyBooking();

    }


    @When("^the user enters a reference number like 1702LCCCQV9H$")
    public void theUserEntersAReferenceNumberLikeLCCCQVH() {


        //To verify that user is navigated to Manage My Booking Page
        AssertionByGettingText(manageMyBookingPage._welcomeToManageMyBooking, "Welcome to Manage My Booking", "You are not on Manage Booking page");

        //enter reference number in "Please enter your full booking reference:" box
        manageMyBookingPage.enterYourFullBookingReference("1702LCCCQV9H");

        //click on Sign in button
        manageMyBookingPage.clickOnSignInButtonOnManageMyBookingPage();

    }

    @Then("^the message should contain this text “Your booking reference number starts with LVE or LOV and can be found on your booking summary”$")
    public void theMessageShouldContainThisTextYourBookingReferenceNumberStartsWithLVEOrLOVAndCanBeFoundOnYourBookingSummary() {

        /*To verify that once user enter wrong booking reference number and to check whether error message contain
        "Your booking reference number starts with LVE or LOV and can be found on your booking summary"*/
        AssertTrueByAttribute(manageMyBookingPage._enterBookingReferenceNumberBox, "oninValid",
                "Your booking reference number starts with LVE or LOV and can be found on your booking summary",
                "error message doesn't contain 'Your booking reference number starts with LVE or LOV and can be found on your booking summary'");
    }

    @When("^the user enters a reference number like LVE1702LCCCQV9H$")
    public void theUserEntersAReferenceNumberLikeLVELCCCQVH() {

        //To verify that user is navigated to Manage My Booking Page
        AssertionByGettingText(manageMyBookingPage._welcomeToManageMyBooking, "Welcome to Manage My Booking", "You are not on Manage Booking page");

        //enter reference number in "Please enter your full booking reference:" box
        manageMyBookingPage.enterYourFullBookingReference("LVE1702LCCCQV9H");

    }

    @And("^the user enters “Test” in the surname$")
    public void theUserEntersTestInTheSurname() {

        //enter Lead Passenger Surname
        manageMyBookingPage.enterLeadPassengerSurname();

        //click on Sign in button
        manageMyBookingPage.clickOnSignInButtonOnManageMyBookingPage();
    }

    @Then("^we show the error message that contains “Sorry this is not a valid booking reference, If you have booked within the last 24 hours please wait until you receive your LOV or LVE reference number by email before logging in”$")
    public void weShowTheErrorMessageThatContainsSorryThisIsNotAValidBookingReferenceIfYouHaveBookedWithinTheLastHoursPleaseWaitUntilYouReceiveYourLOVOrLVEReferenceNumberByEmailBeforeLoggingIn() {

        //To verify that error message contain ""Sorry this is not a valid booking reference. If you have booked within the last 24 hours please wait until you receive your LOV or LVE reference number by email before logging in.""
        //when user enter Reference number "LVE1702LCCCQV9H" and Surname as "Test"
        AssertTrueByAttribute(manageMyBookingPage._errorMessageWhenEnterReferenceAndSurname, "innerText",
                "Sorry this is not a valid booking reference. If you have booked within the last 24 hours please wait until you receive your LOV or LVE reference number by email before logging in.",
                "Error message doesn't contain 'Sorry this is not a valid booking reference. If you have booked within the last 24 hours please wait until you receive your LOV or LVE reference number by email before logging in.'");
    }
}
