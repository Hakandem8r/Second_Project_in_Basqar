Feature: Notation Functionalty

  Scenario: Login to Basqar
    Given Navigate to Basqar
    When Enter username and password and Click Login button
    Then User should login succesfully

  Scenario: View Notation Keys page
    When click Human Resources button
    Then click the Setup button
    And click the Notation Keys

  Scenario: Create a new Notation Key
    When Click the Add button
    Then Write the NameA
    And Click the Short Name line
    Then Write the Short Name
    Then Click the Multiplier line
    And Write the Multiplier number
    Then Click the applyFirst button

  Scenario: Edit Notation Key
    When Click the editNameLine
    And Write the NameB
    And Click the Search button
    Then Click the Edit button
    Then Write the newName
    Then Click the applyEdit button

  Scenario: Delete the Notation Key
    When Click the Delete button
    And Click the Yes button
