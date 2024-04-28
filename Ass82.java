package Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//"Launch google.com
//Click on Gmail link using LinkText locator"
public class Ass82 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in");
	driver.findElement(By.linkText("Gmail")).click();
}
}
