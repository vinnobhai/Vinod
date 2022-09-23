Feature: Login Test Validation
   @Cart
   Scenario: Validate the Cart Functionality
    Given load browser and hit the url on browser
    When enter the Username and password and login click
    And we click on cart
    Then click on the remove button
    And back to Home Page
    Then check the no of products present on the homepage
    
    

    
