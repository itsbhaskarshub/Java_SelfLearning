package pdf15_JavaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Question_10 {

/*
* 10. Write a program to read data from excel
 */
	public static void main(String[] args) throws IOException {
		
		String Input = "..//JalaAcademy/TextFile/inputExcel.xlsx";
		FileInputStream fis = new FileInputStream(Input);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int num_row = sheet.getLastRowNum();
		int last_cell = sheet.getRow(num_row).getLastCellNum();
		
		String username = null;
		String password = null;
		for(int i = 0; i<=num_row;i++) 
		{
				XSSFRow row = sheet.getRow(i);
				XSSFCell cell = row.getCell(0);
				username = cell.getStringCellValue();
				System.out.println(username);

		}
		for(int i = 0; i<=num_row;i++) 
		{
				XSSFRow row = sheet.getRow(i);
				XSSFCell cell = row.getCell(1);
				password = cell.getStringCellValue();
				System.out.println(password);

		}
		
		}
			
		
		
	}


