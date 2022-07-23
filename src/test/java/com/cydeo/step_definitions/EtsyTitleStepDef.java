package com.cydeo.step_definitions;

import com.cydeo.pages.EtsyPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class EtsyTitleStepDef {
    EtsyPage etsyPage=new EtsyPage();
    @Given("user on the Etsy homepage")
    public void user_on_the_etsy_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("Etsy_url"));
    }
    @Then("user see the title as expected")
    public void user_see_the_title_as_expected() {
        String expectedTitle="Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @When("User types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
    etsyPage.searchBox.sendKeys("Wooden Spoon");
    }
    @When("User clicks search button")
    public void user_clicks_search_button() {
        etsyPage.searchBox.submit();
    }

    @Then("User sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {
    String actualTitle=Driver.getDriver().getTitle();
    Assert.assertTrue(actualTitle.contains("Wooden spoon"));
    }
    @When("User types {string} in the search box")
    public void user_types_in_the_search_box(String itemName) {
        etsyPage.searchBox.sendKeys("Wooden Spoon");
    }
    @Then("User sees {string} is in the title")
    public void user_sees_is_in_the_title(String itemText) {
       String actualTitle=Driver.getDriver().getTitle();
       Assert.assertTrue(actualTitle.contains("Wooden spoon"));
    }

}
