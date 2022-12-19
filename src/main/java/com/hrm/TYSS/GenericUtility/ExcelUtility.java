package com.hrm.TYSS.GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String GetTheDataFromExcelSheet(String Sheetname, int rowNum, int columnNum) throws Throwable, IOException {
		FileInputStream file=new FileInputStream(Iconstants.ExcelPath);
	Workbook workbook = WorkbookFactory.create(file);
	String value = workbook.getSheet(Sheetname).getRow(rowNum).getCell(columnNum).getStringCellValue();
	return value;
	}

}
