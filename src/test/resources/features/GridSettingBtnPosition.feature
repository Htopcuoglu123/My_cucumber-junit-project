Feature: Grid Setting button is on the right of the page
	User Story: As a user when I am on Vytrack => Fleet => Vehicles,
	I should be able to see Export Grid dropdown, Refresh, Reset and
	Grid Settings Buttons

	@B26G32-59
	Scenario: Hilal-TC8-Grid Setting button is on the right of the page
		Given user logins with valid credentials on the vytruck app
		When user clicks on the vehicle option from fleet module dropdown
		And the user sees Grid Settings is on the right side of the Reset button
		And the user sees Grid Setting button is on the right of the page