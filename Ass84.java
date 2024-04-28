package Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//"Launch amazon India
//Click on Customer Services link using partialLinkText locator"
public class Ass84 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	driver.findElement(By.partialLinkText("Customer")).click();
}
}
