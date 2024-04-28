package assign3;
import java.util.List;

import org.openqa.selenium.By;
//Get all the url of the links on web page.
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass123 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in");
	driver.manage().window().maximize();
	List<WebElement> ls=driver.findElements(By.tagName("a"));
	for(int i=0;i<ls.size();i++)
	{
		System.out.println(ls.get(i).getAttribute("href"));
	}
}
}
