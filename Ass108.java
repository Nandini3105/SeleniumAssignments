package Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//Launch google.com> inspect search by css selector with tag name and id > search India
//syntax tagname#id
public class Ass108 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in");
	driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("chennai");
}
}
