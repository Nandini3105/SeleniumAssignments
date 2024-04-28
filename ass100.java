package Assign;

import org.openqa.selenium.chrome.ChromeDriver;

public class ass100 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.google.com");
	driver.navigate().refresh();
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().back();
}
}
