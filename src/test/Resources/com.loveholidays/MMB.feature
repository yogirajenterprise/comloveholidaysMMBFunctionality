Feature: Manage My Booking Error message when Wrong Reference and surname given

  As a user I user when I go to the Manage My Booking Page (MMB) I should get proper error
  message:

  @test
  Scenario:
    Given that a user goes to MMB page
    When the user enters a reference number like 1702LCCCQV9H
    Then the message should contain this text “Your booking reference number starts with LVE or LOV and can be found on your booking summary”

  @test1
  Scenario:
    Given that a user goes to MMB page
    When the user enters a reference number like LVE1702LCCCQV9H
    And the user enters “Test” in the surname
    Then we show the error message that contains “Sorry this is not a valid booking reference, If you have booked within the last 24 hours please wait until you receive your LOV or LVE reference number by email before logging in”