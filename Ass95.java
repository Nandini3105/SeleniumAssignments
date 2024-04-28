package Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Launch GroTechMinds.com > register page > upload the file.
public class Ass95 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://grotechminds.com/registration/");
	WebElement file=driver.findElement(By.id("file"));
	file.sendKeys("C:\\Users\\NANDINI\\Desktop\\file upload.docx");
}
}
