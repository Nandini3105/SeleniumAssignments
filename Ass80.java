package Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass80 {
//Launch an empty browser, Navigate to “facebook.com”, Enter user name, Enter password, Click on Login button
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("nandycse31@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("nandy");
	driver.findElement(By.name("login")).click();
}
}
