package Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//"Launch google.com
//Type India using relative xpath"
public class Ass85 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//body//div//textarea")).sendKeys("india");
	}
}
