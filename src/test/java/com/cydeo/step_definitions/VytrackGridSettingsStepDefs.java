package com.cydeo.step_definitions;

import com.cydeo.pages.Vytrack_Login_Page;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VytrackGridSettingsStepDefs {
    Vytrack_Login_Page page = new Vytrack_Login_Page();
    @Given("user logins with valid credentials on the vytruck app")
    public void user_logins_with_valid_credentials_on_the_vytruck_app() {
        Driver.getDriver().get("https://qa2.vytrack.com/user/login");
        page.usernameBox.sendKeys("User185");
        page.passwordBox.sendKeys("UserUser123");
        page.loginBtn.click();
    }
    @When("user clicks on the fleet module")
    public void user_clicks_on_the_fleet_module()  {
        BrowserUtils.waitFor(5);
       page.fleetModule.click();
    }
    @When("user clicks on the vehicle")
    public void user_clicks_on_the_vehicle() {
        BrowserUtils.waitFor(5);
        page.vehiclesOption.click();

    }
    @Then("user click on the grid setting button")
    public void user_click_on_the_grid_setting_button() {
        BrowserUtils.waitFor(5);
        page.gridSetting.click();

    }

}
