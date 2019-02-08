

Feature: 
  I want to use this template for my feature file

  
  Scenario: 
    Given The user page
    And The user click register to create the form 
    When The user-one fill in the form details
    |d1|karthi|
    |d2|rajan|
    |d3|95768956|
    |d4|tnjre|
    |d5|india|
    |d6|614-804|
    |d7|kajekarthi@gmail.com|
    |d8|karthi1007|
    
    And  The user-one submits the form
    Then The customer should see the id and password is generated
    

 
