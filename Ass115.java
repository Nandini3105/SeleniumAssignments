package assign3;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

//Write a program on Implicit wait Link-> https://www.google.com
public class Ass115 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.google.com");
}
}
