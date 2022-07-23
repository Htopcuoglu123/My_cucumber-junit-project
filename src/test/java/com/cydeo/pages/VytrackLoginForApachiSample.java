package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VytrackLoginForApachiSample {
    public VytrackLoginForApachiSample(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "prependedInput")
    public WebElement logInUser;

    @FindBy(id = "prependedInput2")
    public WebElement logInPassword;

    @FindBy(id = "_submit")
    public WebElement logInBtn;

    public void login(String username,String password){
       logInUser.sendKeys(username);
       logInPassword.sendKeys(password);
       logInBtn.click();
    }
}
