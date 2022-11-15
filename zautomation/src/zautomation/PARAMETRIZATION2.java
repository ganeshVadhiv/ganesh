package zautomation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PARAMETRIZATION2 {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
	FileInputStream file=new FileInputStream("C:\\Users\\Ganesh\\Desktop\\PARAMETRIZATION2.xlsx");
	
	Workbook excel=WorkbookFactory.create(file);//open the excel file
	
	Sheet sheet1=excel.getSheet("Sheet1");//select the particular sheet
	//int ab=sheet1.getLastRowNum();//method of sheet interface return total number of rows
	//System.out.println(ab);
	
	Row rows =sheet1.getRow(0);
	//int ba=rows.getLastCellNum();//method of Row interface returns total column count 
	//System.out.println(ba);
	
	Cell ccount;
	
	for(int a=0; a<=sheet1.getLastRowNum();a++) {
		
		sheet1.getRow(a).getLastCellNum();
		
		for(int b=0;b<rows.getLastCellNum();b++) {
			
			ccount=sheet1.getRow(a).getCell(b);
			
			CellType ct=ccount.getCellType();
			
			if(ccount.getCellType().equals(ct.STRING)) {
				
				String st=ccount.getStringCellValue();
				System.out.print(st+"|");
			}
			else if(ccount.getCellType().equals(ct.NUMERIC)) {
				double db=ccount.getNumericCellValue();
				System.out.print(db+"|");
			}
			else if(ccount.getCellType().equals(ct.BOOLEAN)) {
				boolean blt=ccount.getBooleanCellValue();
				System.out.print(blt+"|");
				
			}
				
				System.out.println();
				
				
				
			}
			
			
		}
		
	}
	
	
	
//for(int a=0; a<sheet1.getLastRowNum();a++) {
//Row row1=sheet1.getRow(a);
//System.out.println(row1+"|");
//for(int b=0; b<row1.getLastCellNum();b++) {
//Cell cl=row1.getCell(b);	
//System.out.print(cl+" | ");	
//}
//System.out.println();
//}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

