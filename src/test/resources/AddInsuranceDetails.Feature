

Feature: 
  I want to use this template for my feature file

  
  Scenario: 
    Given The user page
    And The user click register to create the form 
    When The user-one fill in the form details
    |karthi|rajan|95768956|tnjre|tnjre|india|614-804|kajekarthi@gmail.com|karthi1007|karthi1007|
    And  The user-one submits the form
    Then The customer should see the id and password is generated
    

 
