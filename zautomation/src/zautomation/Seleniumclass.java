package zautomation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumclass {

	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"\\Users\\Ganesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		driver.getCurrentUrl();
		
		String a=driver.getCurrentUrl();
		System.out.println(a);
		String b=driver.getTitle();
		
		System.out.println(b);
		
		if ("https://www.youtube.com/".equalsIgnoreCase(a)) {
			System.out.println("correct");
		}
		else {
			System.out.println("not");
		}
		
		
		
        Thread.sleep(3000);
        
        Dimension D=new Dimension(150, 350);
        
        Options opt=driver.manage();
        Window wd=opt.window();
        wd.setSize(D);
        
        
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
}
