package file.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Smple {
     public static void main(String[] args) throws Exception {
		File f = new File(".\\Excel\\data.xlsx");
	
     // Read data from excel
		FileInputStream fl = new FileInputStream(f);
     // get excel sheet
		XSSFWorkbook book = new XSSFWorkbook(fl);
		Sheet sh = book.getSheet("data");
	// To fetch the row
		for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
			Row r = sh.getRow(i);
	// to fetch  the cell
		 for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			 Cell c = r.getCell(j);
   // to fetch cell type
			 int type = c.getCellType();
			 if (type==1) {
				 String str = c.getStringCellValue();
				 System.out.println(str);
				}
			 
			 else if(type!=1) {
				double d1 = c.getNumericCellValue();
				int l = (int)d1;
				String sd = String.valueOf(l);
				System.out.println(sd);
			}
			
		}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
     
     
     
     
     
     
     
     
     
     
     
     }
     

 