Feature: Testing https://www.automationexercise.com/


  Scenario:Sepete gönderilen ürünü dogrulama


    Given Launch browser
    Then Navigate to url 'http://automationexercise.com'
    And verify that home page is visible successfully
    Then Click 'View Product' for any product on home page
    And Verify product detail is opened
    Then Increase quantity to 4
    And click 'Add to cart' button
    Then click 'View Cart' button
    And Verify that product is displayed in cart page with exact quantity

    #Browser starten
    #Navigieren Sie zur URL „http:automationexercise.com“.
    #Stellen Sie sicher, dass die Startseite erfolgreich sichtbar ist
    #Klicken Sie für jedes Produkt auf der Startseite auf „Produkt anzeigen“.
    #Vergewissern Sie sich, dass das Produktdetail geöffnet ist
    #Menge auf 4 erhöhen
    #Klicken Sie auf die Schaltfläche "In den Warenkorb".
    #Klicken Sie auf die Schaltfläche "In den Warenkorb".
    #Klicken Sie auf die Schaltfläche „Warenkorb anzeigen“.
    #Vergewissern Sie sich, dass das Produkt auf der Warenkorbseite mit der genauen Menge angezeigt wird
