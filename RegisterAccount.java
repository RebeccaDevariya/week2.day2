package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterAccount {
	public static void main(String[] args) {

		// Setuping Browser property
		WebDriverManager.chromedriver().setup();

		// Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("https://www.opencart.com/index.php?route=account/register");

		// Maximize browser window
		driver.manage().window().maximize();

		// Selecting dropdown option using sendKeys method
		driver.findElement(By.id("input-country")).sendKeys("India");

	}

}
