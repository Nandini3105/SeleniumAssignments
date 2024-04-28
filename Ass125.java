package assign3;



import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

//WAP to take Screenshot, so that file name followed by current date.
public class Ass125 {
public static void main(String[] args) throws IOException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	Date d1=new Date();
	Date d2=new Date(d1.getTime());
	System.out.println(d2);
	String s=d2.toString();
	String date=s.substring(4,10);
	TakesScreenshot ts=driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src,new File("C:\\Users\\NANDINI\\eclipse-workspace\\Assignments\\Scrrenshots " + date +".png"));
	
	
}
}
