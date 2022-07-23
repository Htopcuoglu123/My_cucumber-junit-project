package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
    public GoogleSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
        //this will help see all the elements
    }
    @FindBy(name = "q")
    public WebElement searchBox;

    @FindBy(xpath = "//a[@class='FLP8od']")
    public WebElement capitalText;
}
