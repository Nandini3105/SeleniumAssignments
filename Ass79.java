package Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass79 {
//La//launch an empty browser, Navigate to “amazon.in” login page, Enter user name > click on continue,
	//Enter password > click on continue, Click on Login button
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Dlogin%2Bamazon%2Baccount%26adgrpid%3D59671903835%26ext_vrnc%3Dhi%26gclid%3DCj0KCQjw-_mvBhDwARIsAA-Q0Q653MOQO_MQ_GOPfXd-ocGM24ByH61U1Oy9SuT5zixb1-Kn0AnBQgcaAsvaEALw_wcB%26hvadid%3D590652406969%26hvdev%3Dc%26hvlocphy%3D1007810%26hvnetw%3Dg%26hvqmt%3De%26hvrand%3D475217025217130194%26hvtargid%3Dkwd-837441119212%26hydadcr%3D24542_2265395%26tag%3Dgooginhydr1-21%26ref%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	driver.findElement(By.id("ap_email")).sendKeys("nandycse31@gmail.com");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.name("password")).sendKeys("nandy");
	driver.findElement(By.id("signInSubmit")).click();
	
}
}
