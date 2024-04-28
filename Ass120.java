package assign3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//Count the number of options in a dropdown
public class Ass120 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://grotechminds.com/dropdown/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
WebElement dd=driver.findElement(By.id("Choice1"));
	Select s=new Select(dd);
	List<WebElement> ls=s.getOptions();
	for(int i=0;i<ls.size();i++)
	{
		System.out.println(ls.get(i).getText());
	}
	
	
}
}
