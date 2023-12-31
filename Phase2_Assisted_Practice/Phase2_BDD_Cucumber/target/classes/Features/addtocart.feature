#Author: xxx@gmail.com
@FeatureTest 
Feature: Add to cart
  This feature will test functionality of adding different products to the user cart(basket) from different flow

  Background: User is logged in

  @tag1
  Scenario: Search a product and add the first product/result to basket
    Given User search for a product "Lenovo Laptop"
    When add the first laptop that appears in the  search results to the basket
    And user clicks on cart link
    Then user basket should display added 1 item
