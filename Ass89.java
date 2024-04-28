package Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//Launch flipkart.com > click on Mobiles using text.
public class Ass89 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.findElement(By.xpath("//span[.=\"Mobiles\"]")).click();
}
}
