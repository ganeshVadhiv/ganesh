package zautomation;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumclass2 {

public static void main(String[]args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\Ganesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	System.out.println(driver.getCurrentUrl());
	
	System.out.println(driver.getTitle());
	
	if ("https://www.google.com/".equalsIgnoreCase(driver.getCurrentUrl()))
	
	{
		System.out.println("google is open");
		
	}
	else 
	{
		System.out.println("google is not open");
		
	}
	
	Options opt=driver.manage();
	Window wd=opt.window();
	wd.maximize();
	// driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	Navigation nv=driver.navigate();
	
	nv.to("https://www.facebook.com/");
	
	Point pt=new Point(150, 350);
	
	driver.manage().window().setPosition(pt);
	
	Thread.sleep(3000);
	
	nv.back();
	Thread.sleep(1000);
	
	nv.refresh();
	Thread.sleep(2000);
	
	driver.quit();
	
}
		
}
