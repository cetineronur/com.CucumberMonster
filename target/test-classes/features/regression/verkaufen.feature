  Feature:1

    Scenario Outline: Rechnung Erstellung

      Given Benutzer schreibt den "url"
      Given Benutzer klickt cookie
      Given Benutzer klickt Einloggen
      Given Benutzer schreibt eigene "<E-mail>" adresse
      Then  Benutzer schreibt eigene "<Password>"
      Then  Benutzer klickt die einloggen button
      Then  Benutzer bewegt den Mauszeiger im Menu uber die Schuhe
      And   Benutzer klickt im Dropdown-Menu auf Sandalen
      And   Benutzer klickt erste Product
      And   Benutzer wahlt Farbe von schuhe
      And   Benutzer wahlt Gorsse von schuhe
      And   Benutzer klickt in den warenkorb
      And   Benutzer klickt zum warenkorb
      And   Benutzer klickt zur kasse gehen

      Examples:
        |E-mail|Password|
        |onur_cetiner@outlook.de|Urfa2016|

    Scenario Outline: Meine Rechnungadresse

      And   Benutzer schreibt "<name>" in den "fname"
      And   Benutzer schreibt "<Nachname>" in den "lname"
      And   Benutzer schreibt "<street>" in den "street"
      And   Benutzer schreibt "<streetnr>" in den "streetnr"
      And   Benutzer schreibt "<zip>" in den "zip"
      And   Benutzer schreibt "<city>" in den "city"
      And   Benutzer wahlt den "<land>"
      And   Benutzer schreibt "<Tag>" in den "day" box
      And   Benutzer schreibt "<Monate>" in den "month" box
      And   Benutzer schreibt "<Jahr>" in den "year" box
      And   Benutzer klickt weiter zur zahlungsart
      And   Benutzer klickt sofort uberweisung
      And   Benutzer klickt bestellung uberprufen
      And   Benutzer kontrolliert strasse und strasse nummer
      And   Benutzer kontrolliert Plz und Ort

  Examples:
  |name|Nachname|street| land      |streetnr|zip  |city|Tag|Monate|Jahr|
  |o   |k       |      |Deutschland|        |     |    |07|03    |2021|
  |    |        |a     |Italien    |1       |     |*.  |07|03    |2021|
  |*.*/|cetin   |*.    |Belgien    |123456  |6431 |jahn|07|03    |2021|
