package Assign;

import java.util.Arrays;

import org.openqa.selenium.chrome.ChromeDriver;

//Get the title of the Flipkart page and breakdown the title into an array
//so that each array index must contain each word
public class Ass77 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	String s=driver.getTitle();
	String a[]=s.split(",");
	for(int i=0;i<a.length-1;i++)
	{
		char arr[]=a[i].toCharArray();
		System.out.println(Arrays.toString(arr));
	}
	
}
}
