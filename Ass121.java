package assign3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Calculate the total number of links in any web page.
public class Ass121 {
public static void main(String[] args) {
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.google.co.in/");
			List<WebElement> ls=driver.findElements(By.tagName("a"));
			System.out.println(ls.size());
}
}
