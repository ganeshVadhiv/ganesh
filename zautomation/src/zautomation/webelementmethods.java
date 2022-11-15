package zautomation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementmethods {



public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\Ganesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
driver.get("https://www.w3schools.com/js/default.asp");

driver.manage().window().maximize();
Thread.sleep(2000);

//driver.findElement(By.xpath("//a[@id='navbtn_menu']")).click();

Thread.sleep(2000);

//driver.findElement(By.xpath("//a[@class='w3-button w3-block'][1]")).click();
	
WebElement main=driver.findElement(By.xpath("//a[text()='Start learning JavaScript now »']"));
main.click();

	Thread.sleep(2000);
	
driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]")).click();
Thread.sleep(2000);


Set<String> allID=driver.getWindowHandles();


String Childst="https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_inner_html";
String Child2nd="https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_inner_html_quotes";
String Child3rd="https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_lightbulb";

String ACTId="null";

for(String Id: allID) {
	System.out.println(Id);
	driver.switchTo().window(Id);
	Thread.sleep(2000);
	String actURL=driver.getCurrentUrl();
	
	if(Childst.equals(actURL)) {
		
		System.out.println("correct");
		ACTId=Id;	
	}		
}

     driver.switchTo().window(ACTId);
     
     for(String Id: allID) {
    		System.out.println(Id);
    		driver.switchTo().window(Id);
    		Thread.sleep(2000);
    		String actURL=driver.getCurrentUrl();
    		
    		if(Child2nd.equals(actURL)) {
    			
    			System.out.println("correct");
    			break;
    		}		
    	}
     
     for(String Id: allID) {
 		System.out.println(Id);
 		driver.switchTo().window(Id);
 		Thread.sleep(2000);
 		String actURL=driver.getCurrentUrl();
 		
 		if(Child3rd.equals(actURL)) {
 			
 			System.out.println("correct");
 			break;
 		}		
 	}
     
     
     
     

//driver.findElement(By.xpath("//div[@class='CodeMirror-scroll']")).sendKeys("<ganesh>");
//driver.findElement(By.xpath("//button[text()='Click Me!']")).click();









//driver.findElement(By.xpath(""))

//String mainId=driver.getWindowHandle();

//driver.switchTo().window(mainId);



System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");		
	}	
}
