package assign3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//Launch google.com > inspect search by
//css selector with tag name,class name ,attribute name and attribute value > search India
public class Ass112 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://google.co.in");
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("textarea.gLFyf[class='gLFyf']")).sendKeys("india");
}
}
