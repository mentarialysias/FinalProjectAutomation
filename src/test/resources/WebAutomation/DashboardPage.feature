Feature: Dashboard Feature in Swag Labs App
  Background:
    Given User login successfully and navigated to dashboard page

    @DashboardPageWithFilterNameZtoA
    Scenario: Verifikasi halaman dashboard dengan Filter With Name (Z to A)
        When User click on the Filter With "Name (Z to A)" button
        Then User should see the list of products sorted by name from Z to A

    @AddOneItemToCart
    Scenario: Menguji menambah 1 barang ke dalam cart
        When User clicks the Add to cart button in "Sauce Labs Backpack" item on the dashboard
        Then the cart icon showing 1 number of items
        And Add to Cart button in "Sauce Labs Backpack" product should change to Remove

   @AddFourItemsToCart
    Scenario: Menguji menambah 4 barang ke dalam cart
        When User clicks the Add to cart button in "Sauce Labs Bike Light" item on the dashboard
        And User clicks the Add to cart button in "Sauce Labs Bolt T-Shirt" item on the dashboard
        And User clicks the Add to cart button in "Sauce Labs Fleece Jacket" item on the dashboard
        And User clicks the Add to cart button in "Sauce Labs Onesie" item on the dashboard
        Then the cart icon showing 4 number of items
        And Add to Cart button in "Sauce Labs Bike Light" product should change to Remove
        And Add to Cart button in "Sauce Labs Bolt T-Shirt" product should change to Remove
        And Add to Cart button in "Sauce Labs Fleece Jacket" product should change to Remove
        And Add to Cart button in "Sauce Labs Onesie" product should change to Remove

    @RemoveOneItemFromCart
    Scenario: Menguji menghapus 1 barang dari cart
        When User clicks the Add to cart button in "Sauce Labs Backpack" item on the dashboard
        And User clicks the Remove button in "Sauce Labs Backpack" item on the dashboard
        Then The cart icon not showing any number of items
        And Remove button in "Sauce Labs Backpack" product should change to Add to Cart