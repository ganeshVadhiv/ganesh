package zautomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup {

	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\Ganesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	TargetLocator td=driver.switchTo();
	
	Alert pop=td.alert();
	
	pop.accept();
	
	Thread.sleep(2000);
	
	//pop.dismiss();
	
	//
	pop.accept();
	
	System.out.println(pop.getText());
	//pop.sendKeys("");
	
	//pop.getText();
	
	
	
	
	
	
	
	
	
	
	

		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
