package Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Launch amazon.in > select books from drop-down, search world and enter, select the first book.
public class Ass91 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
	Select s=new Select(dropdown);
	s.selectByVisibleText("Books");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("world");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div//div[text()='world' and @aria-label='world atlas']")).click();
}
}
