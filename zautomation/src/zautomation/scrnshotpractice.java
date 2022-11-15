package zautomation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class scrnshotpractice {
	
	static TakesScreenshot teaching;
	
     public static void star(String rename) throws IOException {
		
     File source=teaching.getScreenshotAs(OutputType.FILE);
		
     File dest=new File("C:\\Users\\Ganesh\\eclipse-workspace\\zautomation\\scrnshot\\"+rename);
		
     FileHandler.copy(source, dest);	



	}
	
	
    public static void main(String[]args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Ganesh\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.99images.com/photos/celebrities/amruta-khanvilkar/amruta-khanvilkar-hot-hd-photos-mobile-wallpapers-1080p-jyza.jpg?v=1612005609");
		
		driver.manage().window().maximize();
		
		teaching=((TakesScreenshot)driver);
		scrnshotpractice.star("amruta.jpg");
		
		
	}
	
	
	
	
	
	
	
}
