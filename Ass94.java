package Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//copy and paste the address
public class Ass94 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://grotechminds.com/registration/");
	WebElement presentaddress=driver.findElement(By.id("Present-Address"));
	presentaddress.sendKeys("coimbatore,india");
	presentaddress.sendKeys(Keys.CONTROL+"A");
	presentaddress.sendKeys(Keys.CONTROL+"c");
	driver.findElement(By.name("Permanent-Address")).sendKeys(Keys.CONTROL+"v");
}
}
