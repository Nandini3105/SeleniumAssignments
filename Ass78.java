package Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Launch an empty browser, Navigate to “google.com”, Type India in search text field, Click on search button
public class Ass78 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
WebElement searchbox=	driver.findElement(By.name("q"));
searchbox.sendKeys("india");
searchbox.sendKeys(Keys.ENTER);
	
}
}
