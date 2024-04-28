package Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//Launch an empty browser, Navigate to “grotechminds.com” registration page, 
//Enter email, password, present address, permanent address and pin code.
public class Ass81 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://grotechminds.com/registration/");
	driver.findElement(By.id("fname")).sendKeys("aswatha");
	driver.findElement(By.id("lname")).sendKeys("bhasskar");
	driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	driver.findElement(By.name("password")).sendKeys("abc123");
	driver.findElement(By.id("Female")).click();
	driver.findElement(By.id("Present-Address")).sendKeys("coimbatore ,tamilnadu");
	driver.findElement(By.name("Permanent-Address")).sendKeys("coimbatore");
	driver.findElement(By.id("Pincode")).sendKeys("641654");
	
	
}
}
