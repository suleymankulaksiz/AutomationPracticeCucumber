Feature: Contact Us Test

  Scenario: Go to website and test Contact us page


    Given Navigate to website
    And click on contact us button
    And type name
    And type Email
    And select subject heading
    And type a message
    When click on submit button
    Then verify success message