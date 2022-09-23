Feature: HomeTest Test Validation
   @Home
   Scenario: Valiadate the Home page Fuctionality
    Given load browser and hit the
    When enter the Username and password and loginclick
    And  click on the product 
    Then product details should open and Click Add to Cart button
    And  nevigate backward
    Then back to home page and Check cart
    
    