Feature: Retail Home Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email ' John123@gmail.com ' and password 'Kabul759339$'
    And User click on login button
    And User should be logged in into Account
    When User click on Account option

  Scenario: Verify Shop by Department sidebar
    When User click on All section
    Then below options are present in Shop by Department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  Scenario Outline: Verify department sidebar options
    When User click on All section
    And User is on '<department>'
    Then below options are present in department
      | <optionOne> | <optionTwo> |

  @additem
  Scenario: Verify User can add an item to cart
    And User change the category to 'smarHome'
    And User search for an itme 'KasaOutdoor'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then The cart icon quantity should change to '2'

  @placeAnOrder
  Scenario: Verify User can place an order without Shipping address and payment Method on file
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click Add a new address link for shipping address
    And User fill the new address form with below information
      | Country       | FullName | PhoneNumber | StreetAddress    | Apt | City       | State | ZipCode |
      | United States | KhanAgha |  9163334455 | 3060 Bell Street |  15 | Sacramento | CA    |   95821 |
    And User click Add Your Address  button
    And User click Add a credit card or Debit Card for Payment method
    And User fill the Debit or credit card information
      | CardNumber       | NameOnCard | ExpirationMonth | ExpirationYear | SecurityCode |
      | 1122334455667788 | KhanAgha   |              04 |           2026 |          456 |
    And User click on Add your card button
    And User click on Place Your Order
    Then a message should be displayed Order Placed, Thanks

  @OrderAdded
  Scenario: Verify User can place an order with Shipping address and payment Method on file
    When User click on Sign in option
    And User enter email ' WriteYourEmail ' and password ''WriteYourPassword'
    And User click on login button
    And User should be logged in into Account
    And user change the category to 'Electronics'
    And User search for the item 'Apex Legends'
    And User click on search icon
    And User click on Item
    And user select quantity '5'
    And User click add to cart button
    Then The cart icon quantity should change to '5'
    And User click on cart option
    And User click on proceed to Checkout button
    And User click on place Your Order
    Then A message should be displayed Order Placed, Thanks

  @updateProfile
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Bahar' and Phone '9165556666''
    And User click on Update button
    Then user profile information should be updated

  @changePass
  Scenario: Verify User can Update password
    And User enter below information
      | previousPassword | newPassword  | confirmPassword |
      | Kabul759339$     | Kabul326564$ | Kabul326564$    |
    And User click on Change Password button
    Then a message should be displayed Password Updated Successfully

  @payment
  Scenario: Verify User can add a payment method
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1234567899876543 | Mike Logan | May             |           2025 |          123 |
    And User click on Add your card button
    Then a message should be displayed Payment Method added successfully

  @updateCrad
  Scenario: Verify User can edit Debit or Credit card
    And User select the payment Card
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 7362859654958555 | Naqeeb     |              12 |           2025 |          321 |
    And user click on Update Your Card button
    Then a message should be displayed Payment Method updated Successfully

  @removeCard
  Scenario: Verify User can remove Debit or Credit card
    And User select the payment Card
    And User click on remove option of card section
    Then payment details should be removed

  @addAddress
  Scenario: Verify User can add an Address
    And User click on Add address option
    And user fill new address form with below information
      | country     | fullName  | phoneNumber  | streetAddress | apt | city | state       | zipCode |
      | Afghanistan | Ahmad Zia | +93700173273 | 3rd street    | 500 |      | Khair-Khana |   26000 |
    And User click on Add Your Address button
    Then a message should be displayed Address Added Successfully

  @EditAddress
  Scenario: Verify User can edit an Address added on account
    And User click on edit address option
    And User fill new address form with below information
      | country     | fullName   | phoneNumber | streetAddress | apt | city  | state | zipCode |
      | Afghanistan | Safi Ahamd |  9165555555 | Kolala Poshta | 456 | kabul | Kabul |   25000 |
    And User click update Your Address button
    Then a message should be displayed Address Updated Successfully
    
    
    --continue from Here
      @removeOldAddress
  Scenario: Verify User can remove Address from Account
    And User click on remove option of Address section
    Then Address details should be removed
    
