package zautomation;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox {

	public static void main(String[]args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Ganesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
Thread.sleep(2000);
		
WebElement month=driver.findElement(By.xpath("//select[@aria-label='Month']"));

   month.click();
   
   

	Select s=new Select(month);	
		
	s.selectByIndex(1);
	
	
		List<WebElement>mon=s.getOptions();
		int all=mon.size();
	
		System.out.println(all);
		
		System.out.println("___________________________----------");
		
		
		for(int a=0;a<all;a++)
		{
			//WebElement s1=mon.get(a);
			//String ans=s1.getText();
			//System.out.println(ans);
			
			String answer=mon.get(a).getText();
			System.out.println(answer);
			//System.out.println(mon.get(a).getText());
			
		}
		
System.out.println("_________________________________________________");	


	for(WebElement web:mon) {
		
		System.out.println(web.getText());
	}
	
	
	System.out.println("__________________________________________________");
	
	
	boolean yes=s.isMultiple();
	
	System.out.println(yes);
	
WebElement first=	s.getFirstSelectedOption();
   String sel= first.getText();
  
	System.out.println(sel);
	
	
List<WebElement> list=	s.getAllSelectedOptions();
	
	int a=list.size();
	
System.out.println(a);	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
	}
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

