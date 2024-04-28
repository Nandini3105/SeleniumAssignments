package assign3;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//WAP on Parent and child pop-ups a)getWindowHandle   Link-> https://www.google.com  
//b)getWindowHandles Link-> https://www.naukri.com/registration/createAccount?othersrcp=22636 
import org.openqa.selenium.chrome.ChromeDriver;


public class Ass117 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.get("https://www.google.com");
	WebElement search=driver.findElement(By.name("q"));
	search.sendKeys("naukri");
	search.sendKeys(Keys.ENTER);
	//driver.findElement(By.xpath("//span[.='Naukri.com - No.1 Job Portal']"));
	driver.navigate().to("https://www.naukri.com/registration/createAccount?othersrcp=22636");
	/*Set<String> w=driver.getWindowHandles();
	Iterator<String> it=w.iterator();
	String parent=it.next();
	String child=it.next();
	driver.switchTo().window(child);*/
	
}
}
