package zautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselectorpract {

	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\Ganesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
		
	driver.get("http://practice.cybertekschool.com/dropdown");
	Navigation nv=driver.navigate();
	
	Options opt=driver.manage();
	Window wd=opt.window();
    wd.maximize();
   
	//driver.manage().window().maximize();
    
  WebElement multibox=  driver.findElement(By.xpath("//select[@name='Languages']"));
    
    Select s=new Select(multibox);
    Thread.sleep(1000);
    s.selectByVisibleText("JavaScript");
    
    
    Thread.sleep(1000);
    s.selectByIndex(3);
    
		
    Thread.sleep(2000);
    
	//s.deselectAll();
    //s.deselectByIndex(0);
	//s.deselectByValue("");
	//s.deselectByVisibleText("JavaScript");
    System.out.println(s.isMultiple());   /// return type boolean
    
   WebElement text= s.getFirstSelectedOption();
   System.out.println(text.getText());
		
   List <WebElement> wl=s.getAllSelectedOptions();
   System.out.println(wl.size());
    System.out.println(text.getText());	
		

   
   
   for(int a=0; a<wl.size();a++) {
  	   
  	   System.out.println(wl.get(a).getText());
  	  // System.out.println();
     }
  			
 
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
