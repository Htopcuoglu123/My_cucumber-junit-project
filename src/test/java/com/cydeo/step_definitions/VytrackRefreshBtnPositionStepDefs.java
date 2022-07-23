package com.cydeo.step_definitions;

import com.cydeo.pages.Vytrack_Login_Page;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VytrackRefreshBtnPositionStepDefs {
Vytrack_Login_Page page=new Vytrack_Login_Page();
    @When("user clicks on the vehicle option from fleet module dropdown")
    public void user_clicks_on_the_vehicle_option_from_fleet_module_dropdown() {
        BrowserUtils.waitForClickablility(page.fleetModule,15);
        page.fleetModule.click();
        BrowserUtils.waitForClickablility(page.vehiclesOption,15);
        page.vehiclesOption.click();
    }
    @Then("checks refresh button is on the left side of the reset button")
    public void checks_refresh_button_is_on_the_left_side_of_the_reset_button() {
        BrowserUtils.waitForClickablility(page.refresh,15);
        //JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
        int refreshPos=page.refresh.getLocation().getX();
        System.out.println("Refresh position:"+refreshPos );
        int resetPos=page.reset.getLocation().getX();
        System.out.println("Reset position:"+resetPos);
        Assert.assertTrue("Fails",refreshPos<resetPos);
    }
    @Then("check the refresh button is clickable")
    public void check_the_refresh_button_is_clickable() {
    //page.refresh.click();
        // BrowserUtils.waitForClickablility(page.refresh,15);
        Assert.assertTrue(page.refresh.isEnabled());
    }
}
