package com.cybertek.tests.day14_excel_io;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;

public class ReadExcelFile {
    public static void main(String[] args) throws IOException {
        String path="vytrack_testusers.xlsx";
        File file=new File(path);

        //STEP 1: CREATE EXCEL FILE OBJECT
        //workbook object represents excel file -- it has spreadsheets that we're going to read as well
        Workbook workbook= WorkbookFactory.create(file);
        int numOfSheets= workbook.getNumberOfSheets();
        System.out.println("Number of sheets: "+numOfSheets);

        //STEP 2: CREATE OBJECT OF SPREADSHEET
        Sheet sheet=workbook.getSheet("QA3-short"); //you can use specific page name in excel file
        //can use method that returns sheet by name or index

        //STEP 3: READ A ROW
        Row row1=sheet.getRow(0);

        //STEP 4: READ A CELL
        Cell cell1 = row1.getCell(0);

        //Step 5. Extract value
        String value1 = cell1.getStringCellValue();

        //Step 6. Use value
        System.out.println("Value of 1st row 1st column: " + value1);


    }
}
