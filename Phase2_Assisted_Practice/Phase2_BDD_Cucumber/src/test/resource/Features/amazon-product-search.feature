#Author: xxx@gmail.com
@Search
Feature: Search products on amazon
  User wants to search multiple products on amazon

  Scenario: Verification of search feature button with number of products
    Given Open chrome browser and Amazon application
    And Maximize browser window size
    Then Enter the product search
      | name              | title                         |
      | Iphone 15 pro max | Amazon.in : Iphone 15 pro max |
      | Apple Mac book    | Amazon.in : Apple Mac book    |
    Then Submit Search for the product
    And Clear search
