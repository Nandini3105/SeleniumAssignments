package assign3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//Launch google.com inspect search by 
//css selector with tag name,attribute name and attribute value > search India
public class Ass111 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in");
	driver.findElement(By.cssSelector("textarea[class='gLFyf']")).sendKeys("bangalore");
}
}
