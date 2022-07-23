package com.cydeo.tests;

import com.cydeo.pages.VytrackDashboardPageApachiSample;
import com.cydeo.pages.VytrackLoginForApachiSample;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.bs.A;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Vytrack_DDT_Test {
    VytrackLoginForApachiSample vytrackLoginForApachiSample=new VytrackLoginForApachiSample();
    VytrackDashboardPageApachiSample vytrackDashboardPageApachiSample=new VytrackDashboardPageApachiSample();

    @Before
    public void setUp(){
      Driver.getDriver().get(ConfigurationReader.getProperty("Vytrack_env"));
    }
    @After
    public void tearDown(){
        Driver.closeDriver();
    }
    @Test
    public void logInDDTTest() throws IOException {
        String filePath="Vytrack_data.xlsx";
        FileInputStream in=new FileInputStream(filePath);
        XSSFWorkbook workbook= new XSSFWorkbook(in);
        XSSFSheet sheet=workbook.getSheet("Vytrack_data");

        for (int i = 1; i <=sheet.getLastRowNum() ; i++) {
            String userName=sheet.getRow(i).getCell(0).toString();
            String password=sheet.getRow(i).getCell(1).toString();
            String firstName=sheet.getRow(i).getCell(2).toString();
            String lastName=sheet.getRow(i).getCell(3).toString();

            vytrackLoginForApachiSample.login(userName,password);
//            WebDriverWait wait=new WebDriverWait(Driver.getDriver(),30);
//            WebElement loaderMask=Driver.getDriver().findElement(By.cssSelector("div[class='loader-mask shown']"));
//            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
            BrowserUtils.waitFor(5);

            String actualFullName=vytrackDashboardPageApachiSample.fullName.getText();

            XSSFCell resultCell=sheet.getRow(i).getCell(4);

            if(actualFullName.contains(firstName)&&actualFullName.contains(lastName)){
                System.out.println("PASS");
                resultCell.setCellValue("PASS");
            }else{
                System.out.println("FAIL");
                resultCell.setCellValue("FAIL");
            }
            BrowserUtils.waitForClickablility(vytrackDashboardPageApachiSample.fullName,10);
            vytrackDashboardPageApachiSample.logOut();


        }

        FileOutputStream out=new FileOutputStream(filePath);
        workbook.write(out);

        in.close();
        out.close();
        workbook.close();





    }

}
