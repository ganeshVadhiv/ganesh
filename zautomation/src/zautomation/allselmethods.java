package zautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class allselmethods {

	public static void main(String[]args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\Ganesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
//Navigation nv=driver.navigate();
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().forward();
Thread.sleep(2000);
driver.navigate().refresh();
Thread.sleep(2000);

//Options opt=driver.manage();
//Window wd=opt.window();
//wd.maximize();
driver.manage().window().maximize();
Thread.sleep(2000);

driver.manage().window().minimize();
Thread.sleep(2000);

driver.manage().window().maximize();
Thread.sleep(2000);

//driver.navigate().to("");

Dimension dm=new Dimension(150,300);
driver.manage().window().setSize(dm);
Thread.sleep(2000);

Point pt=new Point(50, 100);
driver.manage().window().setPosition(pt);
Thread.sleep(2000);

driver.manage().window().maximize();

String title=driver.getTitle();
System.out.println(title);

if(title.equalsIgnoreCase(title)) {
	
	System.out.println("navigate to correct page");
	
}
else
{
	System.out.println("navigate to correct");

}

String url=driver.getCurrentUrl();

if(url.equalsIgnoreCase(url)) {
	
	System.out.println("correct url");
}
else
{
	System.out.println("not correct");
	
}

//WebElement textBox=driver.findElement(By.tagName("input"));		
//textBox.sendKeys("gtupe7696@gmail.com");		

//WebElement textBox=driver.findElement(By.name(""));

//driver.findElement(By.className("class")).sendKeys("gtupe7696@gmail.com");
	
WebElement textBox=driver.findElement(By.id("email"));
textBox.sendKeys("gtupe7696@gmail.com");

driver.findElement(By.xpath("//input[@type='password']")).sendKeys("G@1234nesh");

driver.findElement(By.xpath("//button[@value='1']")).click();

driver.findElement(By.xpath
("(//span[@class='f7rl1if4 adechonz f6oz4yja "
		+ "dahkl6ri axrg9lpx rufpak1n qtovjlwq qbmienfq "
		+ "rfyhaz4c rdmi1yqr ohrdq8us nswx41af fawcizw8 l1aqi3e3 "
		+ "sdu1flz4'])[7]")).click();



Thread.sleep(5000);

driver.findElement(By.xpath("(//span[@dir='auto'])[27]")).click();


driver.close();


	}
	
	
	
	
}
