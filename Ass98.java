package Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Launch google.com > type India by making sure that the component is displaying and enabled.
public class Ass98 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://grotechminds.com/is-selected/");
	driver.manage().window().maximize();
	WebElement checkbox=driver.findElement(By.xpath("//label[.=\" CheckBox1 \"]"));
	boolean selected=checkbox.isSelected();
	if(selected==true)
	{
		System.out.println("checkbox is selected");
	}
	else
	{
		System.out.println("checkbox is not selected");
		checkbox.click();
		
	}
}
}
