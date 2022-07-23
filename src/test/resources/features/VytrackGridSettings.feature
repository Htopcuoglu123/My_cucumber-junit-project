@B26G24-50
Feature: Export Grid dropdown, Refresh, Reset and Grid Settings Buttons
    User Story: As a user when I am on Vytrack => Fleet => Vehicles,
    I should be able to see Export Grid dropdown, Refresh, Reset and Grid Settings Buttons

    Accounts are: Truck Driver, Store manager, Sale manager

    #Acceptance Criteria:

    # User should be able to click Export Grid dropdown
    # Export Grid dropdown is on the left of the page
    # User should be able to click refresh button
    # User should be able click reset button
    # User should be able to click Grid Settings button
    # Refresh button should be on the left side of Reset button
    # Grid Settings should be on the right side of the Reset button
    # Grid Setting button is on the right of the page

    @B26G24-50
        Scenario: Check grid setting button
        Given user logins with valid credentials on the vytruck app
        When user clicks on the fleet module
        And user clicks on the vehicle
        Then user click on the grid setting button