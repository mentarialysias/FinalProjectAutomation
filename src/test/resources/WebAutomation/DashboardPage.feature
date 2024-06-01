Feature: Dashboard Feature in Swag Labs App
  Background:
    Given User login successfully and navigated to dashboard page

    Scenario: Verifikasi halaman dashboard dengan Filter With Name (A to Z)
        When User click on the Filter With "Name (Z to A)" button
        Then User should see the list of products sorted by name from Z to A

    Scenario: Menguji menambah 1 barang ke dalam cart
        When User clicks the Add to cart button in "Sauce Labs Backpack" item on the dashboard
        Then the cart icon showing 1 number of items
        And Add to Cart button in product which selected should change to Remove

      Scenario: Menguji menghapus 1 barang dari cart
        When User clicks the Add to cart button in "Sauce Labs Backpack" item on the dashboard
        And User clicks the Remove button in "Sauce Labs Backpack" item on the dashboard
        Then The cart icon not showing any number of items
        And Remove button in product which selected should change to Add to Cart