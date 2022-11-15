package zautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class listboxhandle {
// this class contains methods of webelement and how to use
	public static void main(String[]args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", 
"C:\\Users\\Ganesh\\Downloads\\chromedriver_win32\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com/");
driver.manage().window().maximize();

WebElement logbutt=driver.findElement(By.xpath("//button[@value='1']"));

boolean log=logbutt.isSelected();

if(log) 
{
	System.out.println("button is selected");
}
else {
	System.out.println("button is not selected");
}

System.out.println("???????????????????????????????????????????????????");

WebElement create=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
create.click();
Thread.sleep(2000);
//System.out.println(create.getText());
String newaccount=create.getText();
System.out.println(newaccount);


WebElement radio=driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
radio.click();
System.out.println(radio.getAttribute("type"));
System.out.println(radio.isSelected());
boolean button =radio.isSelected();
if(button) {
	System.out.println("selected");
}
else {
	System.out.println("not selected");
}


System.out.println("??????????????????????????????????????");
//male button

WebElement male=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
male.click();

System.out.println(male.isSelected());
System.out.println("????????????????????????????????????????");
WebElement female=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
female.click();
System.out.println(female.isSelected());

//Thread.sleep(2000);

//System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");


//System.out.println(radio.isDisplayed());

//Thread.sleep(2000);
//System.out.println("//////////////////////////////////////////////");
//driver.get("https://www.youtube.com/");
//WebElement searchbox=driver.findElement(By.xpath("//ytd-searchbox[@id='search']"));

//System.out.println(searchbox.isEnabled());

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
