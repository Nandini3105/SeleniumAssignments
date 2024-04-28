package Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//Launch google.com> inspect search by css selector with tag name and class name > search India
public class Ass109 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in");
	driver.findElement(By.cssSelector("textarea.gLFyf")).sendKeys("aswatha");
}
}
