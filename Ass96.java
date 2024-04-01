package Assign;

import org.openqa.selenium.chrome.ChromeDriver;
//Handle java script popup in file:///C:/Users/DELL/OneDrive/Documents/learningHTML1.html
public class Ass96 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/NANDINI/Desktop/JSAM.html");
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
}
}
