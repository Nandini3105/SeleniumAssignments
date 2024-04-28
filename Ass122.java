package assign3;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//How to get the link text of all the links present on a web page? 
//Out of all links how many links have link text as null or empty?
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass122 {
public static void main(String[] args) {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.google.co.in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	List<WebElement> ls=driver.findElements(By.tagName("a"));
	int count=0;
	for(int i=0;i<ls.size();i++)
	{
		String s=ls.get(i).getText();
		System.out.println(s);
		if(s.isEmpty()!=true)
		{
			count++;
			
		}
		
	}
	System.out.println("totals links with no text "+count);
		
	
}
}
