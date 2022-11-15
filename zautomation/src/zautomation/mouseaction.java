package zautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class mouseaction {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ganesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
	driver.navigate().to("https://www.youtube.com/");	
	
	WebElement music =driver.findElement(By.xpath("//yt-formatted-string[text()='Music']"));
	
	
	Actions act=new Actions(driver);
		
	/*act.moveToElement(music);
	Thread.sleep(2000);
	act.click().perform();		
		
	act.click(music).perform();	
	
	act.contextClick(music).perform();*/
	
	//act.click(music).contextClick(music).build().perform();	
	
	driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
	
	Thread.sleep(2000);
	
	WebElement source=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	Thread.sleep(2000);
	WebElement target=driver.findElement(By.xpath("(//ol[@align='center'])[2]"));
	
	act.dragAndDrop(source, target).perform();
	
	
	/*WebElement source1=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
	Thread.sleep(2000);
	WebElement target1=driver.findElement(By.xpath("(//ol[@align='center'])[4]"));
	Thread.sleep(2000);
	
	act.clickAndHold(source1).perform();
	Thread.sleep(2000);
	
	act.release(target1).perform();
	Thread.sleep(2000);*/
	
	
	
	
	
	
	
	}	
}
