package assign3;
//Write a program on Explicit wait Link-> https://www.google.com/
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ass116 {
public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");

WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
w.until(ExpectedConditions.titleContains("Mobiles"));
System.out.println(driver.getTitle());

}
}
