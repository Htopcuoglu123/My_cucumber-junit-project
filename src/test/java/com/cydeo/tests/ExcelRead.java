package com.cydeo.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelRead {
    @Test
    public void read_from_excel_file() throws IOException {
        String path="SampleData1.xlsx";
        //to read from excel we need to load it to FileInput Stream
        FileInputStream fileInputStream=new FileInputStream(path);

        //workbook>sheet>row>cell

        //<1>Create a workbook
        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);

        //<2>We need to get specific sheet from currently opened workbook
        XSSFSheet sheet=workbook.getSheet("Employees");

        //<3>Select row and cell
        //Print out Marry's cell
        //Indexes starts from 0
        System.out.println(sheet.getRow(1).getCell(0));//Marry's cell is row 1 and column 0 since
        // indexes starting from 0

        //Print out Developer
        System.out.println(sheet.getRow(3).getCell(2));

        //Returns the count of used cells only and it starts from 1
        int usedRows=sheet.getPhysicalNumberOfRows();
        System.out.println(usedRows);

        //returns the number of cells from top the bottom, index starts from 0
        //does not care of the cell is empty or full
        int lastUsedRow=sheet.getLastRowNum();
        System.out.println(lastUsedRow);

        //TODO:Create a logic to print Vinod's name
        for (int rowNum = 0; rowNum < usedRows; rowNum++) {
            if(sheet.getRow(rowNum).getCell(0).toString().equals("Vinod")){
                System.out.println(sheet.getRow(rowNum).getCell(0));

            }
        }

        //TODO:Create a logic to print Linda's Job_ID
        //Check if name is Linda, if so print the Job_ID
        for (int rowNum = 0; rowNum <usedRows ; rowNum++) {
            if(sheet.getRow(rowNum).getCell(0).toString().equals("Mansoor")){
                System.out.println("Mansoor's Job_ID: "+sheet.getRow(rowNum).getCell(2));
            }
        }

    }

}
