 package zautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multilistbox {

	private static WebElement WebElement;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
	   "C:\\Users\\Ganesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
driver.get("http://practice.cybertekschool.com/dropdown");
		
driver.manage().window().maximize();

WebElement multibox =driver.findElement(By.xpath("//select[@name='Languages']"));

Select s=new Select(multibox);
		
s.selectByIndex(0);
Thread.sleep(2000);

s.selectByValue("python");
Thread.sleep(2000);

s.selectByVisibleText("C");
Thread.sleep(2000);


//s.deselectByIndex(0);

//s.deselectByVisibleText("C");

//s.deselectByIndex(0);

//s.deselectAll();




System.out.println(s.isMultiple());


System.out.println(s.getFirstSelectedOption());

//textname.getText();


		
		
		
		
		
		
	}
}
