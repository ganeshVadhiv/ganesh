package zautomation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class prametrizationclass {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\Ganesh\\Desktop\\PARAMETRIZATION2.xlsx");
		
		Workbook excel=WorkbookFactory.create(file);
		Sheet sheet1=excel.getSheet("sheet1");
		int totalRows=sheet1.getLastRowNum();
		
		
		
		for(int a=0;a<=totalRows;a++) {
			
			int totalCells=sheet1.getRow(a).getLastCellNum()-1;
			
			for(int b=0;b<=totalCells;b++) {
				
		Cell cells=sheet1.getRow(a).getCell(b);
		
		CellType types=cells.getCellType();
		
		
		
		
		if(types.equals(types.STRING))
				{
			
			String st=cells.getStringCellValue();
			System.out.print(st+" ");
		}else if(types.equals(types.BOOLEAN)) {
			boolean bl=cells.getBooleanCellValue();
			System.out.print(bl+" ");
		}else if(types.equals(types.NUMERIC)) {
			
			double db=cells.getNumericCellValue();
			System.out.print(db+" ");
		}
		
		
		System.out.println();
		
		
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
