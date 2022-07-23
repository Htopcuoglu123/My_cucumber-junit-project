package com.cydeo.step_definitions;

import com.cydeo.pages.AdidasPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;

public class AdidasStepDefs {
    AdidasPage adidasPage=new AdidasPage();

    @Given("User is on the HomePage")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("adidasUrl"));
    }
    @Then("Under {string} category User should be able to see the list of following products")
    public void under_category_user_should_be_able_to_see_the_list_of_following_products(String category, List<String> expectedProducts) {

    }
}
