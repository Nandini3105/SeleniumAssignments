package assign3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
//How to click on a link without using click method?
public class Ass119 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.get("https://www.google.co.in");
	driver.findElement(By.linkText("Gmail")).sendKeys(Keys.ENTER);
}
}
