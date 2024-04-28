package Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Launch google.com > type India in search > press arrow down button 4 times and click on enter.
public class Ass93 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in");
	driver.manage().window().maximize();
	WebElement searchbox=driver.findElement(By.name("q"));
	searchbox.sendKeys("india");
	searchbox.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(2000);
	searchbox.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(2000);
	searchbox.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(2000);
	searchbox.sendKeys(Keys.ENTER);
}
}
