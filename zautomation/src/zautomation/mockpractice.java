package zautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mockpractice {

	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ganesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		
	WebElement newAccount =	driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		
	newAccount.click();
	Thread.sleep(2000);
	
		
		WebElement birthDate=driver.findElement(By.xpath("//select[@aria-label='Day']"));
		
		Select g=new Select(birthDate);
		
		g.selectByValue("1");
		
		WebElement birthMonth=driver.findElement(By.xpath("//select[@aria-label='Month']"));
		
		Select a=new Select(birthMonth);
		
		a.selectByVisibleText("Apr");
	
		WebElement birthYear=driver.findElement(By.xpath("//select[@aria-label='Year']"));
		
		Select n=new Select(birthYear);
		n.selectByIndex(25);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
