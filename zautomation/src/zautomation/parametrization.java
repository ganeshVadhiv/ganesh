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

public class parametrization {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	FileInputStream file=new FileInputStream("C:\\Users\\Ganesh\\Desktop\\PARAMETRIZATION2.xlsx");	
		
	Workbook excel=WorkbookFactory.create(file);
	Sheet sheet1=excel.getSheet("Sheet1");
	//int tr=sheet1.getLastRowNum();
	//System.out.println(tr);
	//Row rows=sheet1.getRow(0);
	//int tc=rows.getLastCellNum();
	//System.out.println(tc);
	
	System.out.println("__________");
	
	//Cell cells=rows.getCell(0);
	
	for(int a=0;a<=sheet1.getLastRowNum();a++) {
		
		Row rows=sheet1.getRow(a);
		//System.out.print(rows+"|");
		for(int b=0;b<rows.getLastCellNum();b++) {
		Cell cells=rows.getCell(b);
			System.out.print(cells+"|");
		
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	}
}
				
				
			
		
		
		
		
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

