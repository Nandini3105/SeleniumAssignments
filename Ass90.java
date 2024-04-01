package Assign;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//"1.Launch amazon.in
//2.Type shoes on text area, click on  search button
//3. Select first shoe from the list using relative xpath using class name locator"
public class Ass90 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe");
	Thread.sleep(2000);
	List<WebElement> shoe=driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction' ]"));
	int count=shoe.size();
	shoe.get(0).click();
}
}
