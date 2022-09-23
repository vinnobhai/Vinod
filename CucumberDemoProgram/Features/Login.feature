@tag
  @Login @Homepage
  Scenario Outline: Validate Login Functionality
    Given load browser and hit the url
    When enter the Username <username> and password <password>
    And click on login button 
    Then validate the home page 
 Examples: 
      | username        | password      | 
      | problem_user    |  secret_sauce | 
      | standard_user   | secret_sauce  |
     
  @Homepage
  Scenario: Valiadate the Home page Fuctionality
    When click on the product 
    Then product details should open and Click Add to Cart button
    And  nevigate backward
    Then back to home page and Check cart
    
    @tag3
     Scenario: Valiadate the Cart Pack
    When we click on cart
    Then click on the remove button 
    And  back to Home Page
    Then check the no of products present on the homepage

   
