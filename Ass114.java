package assign3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//How to automate the applicaion where the rightclick is prohibited? Link -> 
//https://retail.onlinesbi.sbi/retail/login.htm(function f12)
public class Ass114 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.id("username")).sendKeys("nan123");
		driver.findElement(By.id("label2")).sendKeys("assfg");
		
		
	}

}
