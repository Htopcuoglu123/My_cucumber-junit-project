package com.cydeo.step_definitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CalculatorStepDef {
    int actualResult;
    int expectedResult;
    @Given("Calculator is open")
    public void calculator_is_open() {
        System.out.println("This is from given");
    }
    @When("I add {int} with {int}")
    public void i_add_with(Integer num1, Integer num2) {
        System.out.println("When I add "+num1+" with "+num2);
        actualResult=num1+num2;
    }
    @Then("I should get {int}")
    public void i_should_get(int expectedResult) {
        System.out.println("I should get "+ expectedResult);
        Assert.assertEquals(expectedResult,actualResult);
    }

}
