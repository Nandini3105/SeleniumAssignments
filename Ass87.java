package Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//Launch facebook.com > Enter username > enter password > 
//click on login button using relative xpath with attribute name and attribute value.
public class Ass87 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input [@name='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("ahahb");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
