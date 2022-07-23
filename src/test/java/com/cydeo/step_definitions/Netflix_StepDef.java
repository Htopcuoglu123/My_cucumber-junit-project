package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class Netflix_StepDef {
    @Given("I like {string}")
    public void i_like(String string) {
        System.out.println("This is from Given String Parameter");
    }

    @Given("I like")
    public void i_like(List<String>movieTypes) {
        System.out.println("This is from Given String Data Table"+movieTypes);
    }


    @Given("I like below favorite movie with certain type")
    public void i_like_below_favorite_movie_with_certain_type(Map<String,String>favoriteMovies) {
        System.out.println(favoriteMovies);
        System.out.println("favoriteMovies.get(\"drama\") = " + favoriteMovies.get("drama"));
    }

    @When("I get to homepage")
    public void i_get_to_homepage() {

    }
    @Then("I should get the right recommendation")
    public void i_should_get_the_right_recommendation() {

    }


}
