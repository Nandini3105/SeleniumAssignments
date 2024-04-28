package Assign;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Launch flipkart.com > type shoe in search > select 4th auto suggestion and search
public class ass99 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	driver.findElement(By.name("q")).sendKeys("shoe");
	Thread.sleep(4000);
	List<WebElement> shoe=driver.findElements(By.xpath("//div[@class='_3NorZ0 _3jeYYh']//ul//li"));
	int count=shoe.size();
	Thread.sleep(3000);
	shoe.get(3).click();
}
}
