package zautomation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class seleniumclass3 {

	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Ganesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		if("https://www.google.com/".equalsIgnoreCase(driver.getCurrentUrl()))
		{
			System.out.println("google open");
			
		}
		else
		{
			System.out.println("invalid");
			
		}
		
		Thread.sleep(2000);
		
		Options opt=driver.manage();
		
		Window wd=opt.window();
		wd.maximize();
		
		// driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		Dimension d=new Dimension(200, 400);
		
		
		
		driver.manage().window().setSize(d);
		
		Thread.sleep(3000);
		
		Point pt=new Point(100, 500);
		
		driver.manage().window().setPosition(pt);
		
		Thread.sleep(2000);
		
		wd.maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://www.youtube.com/");
		
		Thread.sleep(3000);
		
		Navigation nv=driver.navigate();
         nv.to("https://www.youtube.com/");

		Thread.sleep(3000);
		
		nv.back();
		Thread.sleep(1000);
		
		nv.refresh();
		Thread.sleep(2000);
		
		nv.forward();
		Thread.sleep(2000);
		
		driver.quit();
		
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Ganesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.youtube.com/");
		
		
		Thread.sleep(2000);
		
		nv.refresh();
		
		Thread.sleep(1000);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
