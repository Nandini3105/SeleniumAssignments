package Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//Work on GroTechMinds registration page > dropdowns
public class Ass92 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://grotechminds.com/registration/");
	WebElement skills=driver.findElement(By.id("Skills"));
	Select s=new Select(skills);
	s.selectByVisibleText("Non-Technical Skills");
	WebElement country=driver.findElement(By.name("Country"));
	Select s1=new Select(country);
	s1.selectByValue("France");
}
}
