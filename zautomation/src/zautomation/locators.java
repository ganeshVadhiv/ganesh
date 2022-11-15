package zautomation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Ganesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
	    Options opt=driver.manage();
	    Window wd=opt.window();
	    wd.maximize();
        // method chaining-  driver.manage().window().maximize();
		
	  Thread.sleep(2000);
	  
	  WebElement facebook = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	  
	  facebook.click();
	  Thread.sleep(2000);
		
		 driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Ganesh");
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Tupe");
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("gtupe7696@gmail.com");
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("gtupe7696@gmail.com");
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//input[@type ='password'])[2]")).sendKeys("G@123nesh");
			
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//option[@value='1'])[1]")).click();
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//option[text()='Apr']")).click();
		 
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//option[text()='1997']")).click();
		
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
