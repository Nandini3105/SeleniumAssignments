package Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//"Launch flipkart.com
//Hoverover on Login > Click on Sign up button
//Enter your mobile number > click on continue."
public class Ass102 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	WebElement login=driver.findElement(By.linkText("Login"));
	Actions a=new Actions(driver);
	a.moveToElement(login).build().perform();
	Thread.sleep(3000);
	WebElement signup=driver.findElement(By.linkText("Sign Up"));
	signup.click();
	
	
	
}
}
