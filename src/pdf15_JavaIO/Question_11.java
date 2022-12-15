package pdf15_JavaIO;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Question_11 {

/*
11. Write a program to write data to excel
*/
	public static void main(String[] args) throws IOException {
		
		String output = "..//JalaAcademy/TextFile/outputExcel.xlsx";
		FileOutputStream fos = new FileOutputStream(output);
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		XSSFRow row= sheet.createRow(0);
		
		row.createCell(0).setCellValue("EmployeeID");
		row.createCell(1).setCellValue("FirstName");
		row.createCell(2).setCellValue("LastName");
		row.createCell(3).setCellValue("FirstName.LastName@Org.Org");
		row.createCell(4).setCellValue("PhoneNumber");
		
		wb.write(fos);
		wb.close();

		
		
		
		
		
		
		
		}
			
		
		
	}


