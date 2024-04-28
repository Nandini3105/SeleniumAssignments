package assign3;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//Launch amazon.in  > type shoes in search > select first shoe > 
//click on add to cart.click on proceed to buy
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass118 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe");
	Thread.sleep(4000);
	List<WebElement> ls=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
	Thread.sleep(4000);
	System.out.println(ls.size());
	ls.get(3).click();
	driver.findElement(By.linkText("Active Aura Peach Women Running Shoes")).click();
	driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
}
}
