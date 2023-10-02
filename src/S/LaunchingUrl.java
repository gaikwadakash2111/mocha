package S;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingUrl {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\sel new files\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("harshit...sing");
		

	}

}
