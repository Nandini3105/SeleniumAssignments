package Assign;
//Launch a chrome browser and get the title of the Flip kart page
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass76 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	String title=driver.getTitle();
	System.out.println(title);
}
}
