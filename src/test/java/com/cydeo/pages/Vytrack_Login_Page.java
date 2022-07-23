package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vytrack_Login_Page {


//    public void goToVytruck() {
//        Driver.getDriver().get("https://qa2.vytrack.com/user/login");}

    public Vytrack_Login_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "prependedInput")
    public WebElement usernameBox;

    @FindBy(id = "prependedInput2")
    public WebElement passwordBox;

    @FindBy(id = "_submit")
    public WebElement loginBtn;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement fleetModule;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement vehiclesOption;

    @FindBy(xpath = "//a[@title='Grid Settings']")
    public WebElement gridSetting;

    @FindBy(xpath = "//a[@title='Reset']")
    public WebElement reset;

    @FindBy(xpath = "//a[@title='Refresh']")
    public WebElement refresh;


//    public void setLogin_vytrack (String username, String password){
//        this.usernameBox.sendKeys(username);
//        this.passwordBox.sendKeys(password);
//        this.loginBtn.submit();
//        this.fleetModule.submit();
//        this.vehiclesOption.submit();
//        this.gridSetting.submit();
//    }

    public void login(String username, String password) {
        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginBtn.click();
    }
}