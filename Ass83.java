package Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//"Launch amazon India
//Click on Mobiles link using LinkText locator"
public class Ass83 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	driver.findElement(By.linkText("Mobiles")).click();
}
}
