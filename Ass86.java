package Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//"1.Launch amazon.in
//2.Type shoes on text area, click on  search button
//3.Select first shoe from the list using relative xpath"
public class Ass86 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	driver.findElement(By.xpath("(//body//div//input)[5]")).sendKeys("shoe");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@role='button' and @class='s-suggestion s-suggestion-ellipsis-direction'])[1]")).click();
	
}
}
