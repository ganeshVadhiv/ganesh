package zautomation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PRAMETRIZATION {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	FileInputStream file=new FileInputStream("C:\\Users\\Ganesh\\Desktop\\PARAMETRIZATION.xlsx");	
		
	Workbook wb=WorkbookFactory.create(file);	
		Sheet sh=wb.getSheet("Sheet1");
		Row rw=sh.getRow(1);
		Cell cl=rw.getCell(0);
		
		String st=cl.getStringCellValue();
		
		System.out.print(st+"|");
		
		Row rw2=sh.getRow(1);
		Cell cl2=rw2.getCell(1);
		double db=cl2.getNumericCellValue();
		System.out.print(db+"|");
		
		Row rw3=sh.getRow(1);
		Cell cl3=rw3.getCell(2);
		boolean bl=cl3.getBooleanCellValue();
		System.out.print(bl+"|");
		
		Row rw4=sh.getRow(1);
		Cell cl4=rw4.getCell(3);
		boolean bl2=cl4.getBooleanCellValue();
		System.out.println(bl2+"|");
		
		
		
		Row re1=sh.getRow(0);
		Cell cll1=re1.getCell(0);
		String st1=cll1.getStringCellValue();		
		System.out.print(st1+"|");
		
		Row re2=sh.getRow(0);
		Cell cll2=re2.getCell(1);
		double db2=cll2.getNumericCellValue();	
		System.out.print(db2+"|");
		
        Row re3=sh.getRow(0);
		Cell cll3=re3.getCell(2);
		boolean bo2=cll3.getBooleanCellValue();
		System.out.print(bo2+"|");
		
		Row re4=sh.getRow(0);
		Cell cll4=re4.getCell(3);
		boolean bo3=cll4.getBooleanCellValue();
		
		System.out.print(bo3+"|");
		
		
	}


	}
	
	
	
	

