Feature: End to End Testing

  Background:
    Given User is on SwagLab Login page

  @LoginToSwagLab @LoginUntilNavigateToDashboard
  Scenario: Login with valid credentials
    When User open the swag labs browser
    And User verification the login page
    And User enter valid username and password
    Then User navigating to dashboard page

  @AddOneProduct @LoginUntilAddOneProductToCart
  Scenario: User Add 1 product to cart and check it
    Given User has on dashboard page
    When User clicks the Add to Cart button for the "Sauce Labs Backpack"
    Then There is 1 number of the cart icon


  @CheckingCart @LoginUntilCheckTheCart
  Scenario: Verification Cart Page when there is one item in the cart
    Given User has add one item to cart and cart icon showing 1
    When User click cart icon
    Then  user is navigated to the cart page which contains one product that has been added

  @AddMoreThan1Product @LoginUntilAddFourMoreItemToCart
  Scenario: Click on continue shopping button when the cart has item
    Given User has been navigated to the cart page, which contains one product
    When User click continue shopping button
    And user navigate to dashboard page and adding four other product
    Then The number of Icon cart change to 5

  @CheckingCartAndWantToCheckoutTheProduct @LoginUntilClickCheckoutFiveProduct
  Scenario: Add other item to cart and Checkout product
    Given User has add four other product and the cart number was 5
    When User click cart icon
    And User click cart button and clicks on checkout button
    Then The user is navigated to the checkout information page
    And There is a field to enter checkout information

  @FinishingOrder @LoginUntilFinishingCheckout
  Scenario:  user fills in the checkout information and finish the checkout process
    Given User has on checkout page
    When User fill the checkout information and click continue button
    And User navigate to checkout overview page and click finish button
    Then User is navigated to checkout complete

  @LogoutFromSwagLabs @LoginUntilLogoutAfterFinishingCheckout
  Scenario: User logs out of the application after completing the checkout process
    Given User has been navigated to the checkout compelete page
    When user logs out of the application
    Then user has been navigate to SwagLab Login page



