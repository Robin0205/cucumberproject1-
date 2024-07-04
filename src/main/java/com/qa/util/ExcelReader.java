package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {
	public static String TESTDATA_PATH = "src\\main\\java\\com\\qa\\testdata\\flights.xlsx";
	static Workbook book;
	static Sheet sheet;
	static Cell cell;

	public static Object [][] getTestData(String sheetname)  
	{
		FileInputStream fis=null;
		
		try
		{
			fis=new FileInputStream(TESTDATA_PATH);

		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		try
		{
			book =WorkbookFactory.create(fis);
		} 
		catch(EncryptedDocumentException e)
		{
			e.printStackTrace();

		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

		sheet=book.getSheet(sheetname);

		//we have to read the data from excel based on type of cell.

		Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for(int i=0;i<sheet.getLastRowNum();i++)  //row wise

		{
			for(int j=0;j<sheet.getRow(i).getLastCellNum();j++) //colum or cell wise
			{
				cell=sheet.getRow(i+1).getCell(j);
				data[i][j]=null;
				switch(cell.getCellType())
				{
				case STRING: data[i][j]=cell.getRichStringCellValue();
				break;

				case NUMERIC:

					if(DateUtil.isCellDateFormatted(cell))
					{
						data[i][j]=String.valueOf(cell.getDateCellValue());
					}
					else
					{
						data[i][j]=String.valueOf((int) cell.getNumericCellValue());
					}
					break;

				case BOOLEAN:
					data[i][j]=String.valueOf(cell.getBooleanCellValue());
					break;

				case BLANK: 
					data[i][j]="";
					break;
				case ERROR:
					break;
				case FORMULA:
					break;
				case _NONE:
					break;
				default:
					break;


				}//switch closing
			} //j for closing
		}  //i for closing

		return data;

	}// closing method

	

}
