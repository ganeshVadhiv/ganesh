package zautomation;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class arraylist {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver",
"C:\\Users\\Ganesh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
WebDriver driver=new ChromeDriver();	

driver.get("https://www.w3schools.com/js/js_intro.asp");
driver.manage().window().maximize();
		
driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]")).click();
Thread.sleep(2000);

//driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]")).click();
//.sleep(2000);

driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]")).click();
Set<String> allchild=driver.getWindowHandles();






Thread.sleep(2000);


ArrayList<String> allbrow=new ArrayList<String> (allchild);

//driver.switchTo().window(allbrow.get(0));
//driver.switchTo().window(allbrow.get(2));
//driver.switchTo().window(allbrow.get(3));

//3rd child browser handled
WebElement rdbrow = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
driver.switchTo().frame(rdbrow);

//driver.switchTo().window(allbrow.get(3));

//driver.switchTo().frame("iframeResult");
//.sleep(3000);

driver.findElement(By.xpath("//button[text()='Click Me!']")).click();
//driver.switchTo().defaultContent();
//driver.close();

//2nd child browser handled
driver.switchTo().window(allbrow.get(2));

WebElement click=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
driver.switchTo().frame(click);

driver.findElement(By.xpath("//button[text()='Turn on the light']")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//button[text()='Turn off the light']")).click();

//driver.close();
//1st child browser handled

driver.switchTo().window(allbrow.get(1));

driver.switchTo().frame(1);
Thread.sleep(2000);

driver.findElement(By.xpath("//button[text()='Click Me!']")).click();





//driver.close();


	}
	
}
