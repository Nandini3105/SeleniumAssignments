package Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//"Launch grotechminds.com
//Double click on course tab."
public class Ass104 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://grotechminds.com/");
	WebElement course=driver.findElement(By.linkText("Courses"));
	Actions a=new Actions(driver);
	a.doubleClick(course).perform();
	
}
}
