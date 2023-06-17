package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	
	public static void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
	public static void getURL() {
		driver.get("http://it.microtechlimited.com/");
	}
	public static void click() {
		driver.findElement(By.xpath("//li/a[@href='elogin.php']")).click();
	}
	
//	public static void sendkeys() {
		driver.findElement(By.name("mailuid")).sendKeys("testpilot@gmail.com");
	}
	
	

}
