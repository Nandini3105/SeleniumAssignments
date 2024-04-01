package Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//Launch amazon.in> click on Mobiles using text
public class Ass88 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	driver.findElement(By.xpath("//a[.=\"Mobiles\"]")).click();
}
}
