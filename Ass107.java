package Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//Launch google.com> inspect search by css selector with class name> search India
//syntax=.classnamevalue
public class Ass107 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.in");
	driver.findElement(By.cssSelector(".gLFyf")).sendKeys("india");
	
}
}
