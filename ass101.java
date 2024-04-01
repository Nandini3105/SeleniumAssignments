package Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//"Launch flipkart.com
//Hoverover on Login > Click on Sign up button
//Enter your mobile number > click on continue."
public class ass101 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	WebElement sigin=driver.findElement(By.xpath("//span[.=\"Hello, sign in\"]"));
	Actions a=new Actions(driver);
	a.moveToElement(sigin).build().perform();
	driver.findElement(By.linkText("Sign in")).click();
	driver.findElement(By.id("ap_email")).sendKeys("456789123");
	driver.findElement(By.id("continue")).click();
}
}
