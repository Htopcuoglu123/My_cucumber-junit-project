Feature: Refresh button should be on the left side of Reset button
User Story: As a user when I am on Vytrack => Fleet => Vehicles,
I should be able to see Export Grid dropdown, Refresh, Reset and
Grid Settings Buttons

	@B26G32-58
	Scenario: Refresh button should be on the left side of Reset button
		Given user logins with valid credentials on the vytruck app
		When user clicks on the vehicle option from fleet module dropdown
		Then checks refresh button is on the left side of the reset button
		And  check the refresh button is clickable