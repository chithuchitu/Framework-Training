package sample.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Batch {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\KEERTHI\\eclipse-workspace\\Chithra\\Excel\\student.xlsx");
   //Read  data from excel
		FileInputStream fin = new FileInputStream(f);
   //Get Excel Sheet
		Workbook book = new XSSFWorkbook(fin);
		Sheet sh = book.getSheet("batch");
	
		Row r = sh.createRow(0);
 		 
		Cell c = r.createCell(0);
		Cell c1 = r.createCell(1);
	 
		c.setCellValue("panila");
		c1.setCellValue("selenium");
		
		FileOutputStream f1 = new FileOutputStream(f);
		book.write(f1);
		
		
	    Row row = sh.getRow(0);
		int colNum = row.getLastCellNum();
		System.out.println("No of Columns :"+colNum);
		int rowNum = sh.getLastRowNum();
		System.out.println("No of Rows:"+rowNum);
   
					
						 
		}
		}
		
		
		
		
		
		
		

 

 
