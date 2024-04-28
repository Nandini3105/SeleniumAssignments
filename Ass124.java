package assign3;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

//How to take screenshot of any program in selenium?
public class Ass124 {
public static void main(String[] args) throws IOException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.co.in");
	TakesScreenshot ts=driver;
File src=	ts.getScreenshotAs(OutputType.FILE);
FileHandler.copy(src, new File("C:\\Users\\NANDINI\\eclipse-workspace\\Assignments\\Scrrenshots" + Math.random() + ".png"));
	
	
			
}
}
