package zautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtableshandling {

	
public static void main(String[]args) {
	
System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\Ganesh\\Downloads\\chromedriver_win32\\chromedriver.exe"	);

WebDriver driver=new ChromeDriver();
	
driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
	//driver.manage().window().maximize();
List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']//tr"));
	
	System.out.println(rows.size());
	
	for(int a=0; a<rows.size(); a++) {
		
		System.out.println(rows.get(a).getText());
		
		
	}
	
	System.out.println("|||||||||||||||||||||||||||||||||||||||||");
	
	
	for(int i=1; i<=rows.size(); i++) {
		
		List<WebElement> allrows;
		
if(i==1)
		{
allrows=driver.findElements(By.xpath("//table[@id='customers']//tr["+ i +"]//th"));
		}
else
		{
allrows=driver.findElements(By.xpath("//table[@id='customers']//tr["+ i +"]//td"));
		}


		
     for(int j=1; j<=allrows.size(); j++) {
    	WebElement cells;
    	
if(i==1) {
	
    cells=driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]//th["+ j +"]"));

}
else
{ 	

	cells=driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]//td["+ j + "]"));

} 
    System.out.print(cells.getText()+ "|");	
               }
		
System.out.println();

	                                  }
	
}
}
