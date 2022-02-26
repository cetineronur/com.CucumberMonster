Feature: Automation Exercise

  Scenario: TC017: Remove Products From Cart

   Given Launch browser, Navigate to "automationExerciseUrl"
   Then Verify that home page is visible successfully
   Then Add products to cart
   And Click Cart button
   Then Verify that cart page is displayed
   And Click X button corresponding to particular product
   Given Verify that product is removed from the cart