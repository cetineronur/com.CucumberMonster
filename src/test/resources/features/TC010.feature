Feature: https://www.automationexercise.com/ sitesi
 @exercise
  Scenario Outline: : TC_10:Verify Subscription in home page


  Given Launch browser, Navigate to "url"
  Then Verify that home page is visible successfully
  And Scroll down to footer
    And Verify text SUBSCRIPTION
  Then Enter "<email address>" in input and click arrow button
   And Verify success message 'You have been successfully subscribed!' is visible

   Examples:
   |email address|
   |cetineronur44@gmail.com|
