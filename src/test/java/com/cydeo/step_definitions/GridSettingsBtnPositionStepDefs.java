package com.cydeo.step_definitions;

import com.cydeo.pages.Vytrack_Login_Page;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GridSettingsBtnPositionStepDefs {
    Vytrack_Login_Page page=new Vytrack_Login_Page();
    @When("the user sees Grid Settings is on the right side of the Reset button")
    public void the_user_sees_grid_settings_is_on_the_right_side_of_the_reset_button() {
        BrowserUtils.waitForClickablility(page.gridSetting,15);
        int gridSettingBtnPos=page.gridSetting.getLocation().getX();
        System.out.println("Grid setting btn position: "+gridSettingBtnPos);
        BrowserUtils.waitForClickablility(page.reset,15);
        int resetBtnPos=page.reset.getLocation().getX();
        System.out.println("ResetBtnPosition: "+resetBtnPos);
        Assert.assertTrue(gridSettingBtnPos>resetBtnPos);
    }
    @When("the user sees Grid Setting button is on the right of the page")
    public void the_user_sees_grid_setting_button_is_on_the_right_of_the_page() {
        BrowserUtils.waitForClickablility(page.gridSetting,15);
        int gridSettingBtnPos=page.gridSetting.getLocation().getX();
        Assert.assertTrue("Fails",gridSettingBtnPos>0&&gridSettingBtnPos<2000);
    }

}
