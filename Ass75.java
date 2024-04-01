package Assign;

import org.openqa.selenium.chrome.ChromeDriver;
//"Launch a chrome browser and open google page

public class Ass75 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
    driver.get("https://www.google.in");
}
}
