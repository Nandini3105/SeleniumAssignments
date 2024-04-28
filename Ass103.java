package Assign;
//"Launch grotechminds.com/drag-and-drop/
//Perform drag  and drop action"
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Ass103 {
	public static void main(String[] args) {
		
	
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://grotechminds.com/drag-and-drop/");
WebElement json=driver.findElement(By.id("drag11"));
Actions a=new Actions(driver);
WebElement drop=driver.findElement(By.id("div2"));
a.dragAndDrop(json,drop).build().perform();
}
}
