package Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Launch google.com > type India by making sure that the component is displaying and enabled.
public class Ass97 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in");
	WebElement searchbox=driver.findElement(By.name("q"));
	if(searchbox.isDisplayed()==true && searchbox.isEnabled()==true)
	{
		searchbox.sendKeys("india");
	}
	searchbox.sendKeys(Keys.ENTER);
}
}
