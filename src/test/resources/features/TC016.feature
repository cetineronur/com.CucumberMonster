Feature: Automation Exercise


  Scenario: TC016: Place Order: Login before Checkout

   Given Launch browser, Navigate to "automationExerciseUrl"
   Then Verify that home page is visible successfully
   Then Click Signup/Login button
   Then Fill email, password and click Login button
   Then Verify Logged in as username at top
   Then Add products to cart
   Then Click Cart button
   Then Verify that cart page is displayed
   And Click Proceed To Checkout
   Then Verify Address Details and Review Your Order
   Then Enter description in comment text area and click Place Order
   Then Enter payment details: Name on Card, Card Number, CVC, Expiration date
   Then Click Pay and Confirm Order button
   Then Verify success message Your order has been placed successfully!
   Then Click Delete Account button
   Then Verify ACCOUNT DELETED! and click Continue button