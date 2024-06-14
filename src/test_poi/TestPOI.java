package test_poi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestPOI {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		//1. FileInputStream
		FileInputStream input = new FileInputStream("C:\\Users\\ishan\\git\\Selenium\\TestData\\selenium_test.xlsx");
		
		//2. WorkbookFactory.create()
		Workbook workbook = WorkbookFactory.create(input);
		
		//3. getSheet("credentials")
		Sheet sheet = workbook.getSheet("credentials");
		
		//4. getRow(0)
		Row row = sheet.getRow(0);
		
		//5. getCell(0)
		Cell cell = row.getCell(0);
		
		//6. getStringCellValue();
		String cellValue1 = cell.getStringCellValue();
		System.out.println(cellValue1);
		
	}

}
