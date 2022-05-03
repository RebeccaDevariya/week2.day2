package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ValidateButton {
	public static void main(String[] args) {
		// Driver setup
	    WebDriverManager.chromedriver().setup();
	    // Open Chrome Browser
	    ChromeDriver driver = new ChromeDriver();
	    // Load the URL
		driver.get("http://leafground.com/pages/Button.html");
	    // Maximize the window
	    driver.manage().window().maximize();

			// Navigate to home page
			driver.findElement(By.xpath("//label[@for='home']/following-sibling::button")).click();
			
			driver.navigate().back();

			// check the position of the button 
			System.out.println("The Position of button is " + driver.findElement(By.id("position")).getLocation());

			// Finding button color
			System.out.println("The Button colour is " + driver.findElement(By.id("color")).getCssValue("background-color"));

			// Finding height and width using getSize method
			System.out.println("The Height and Width is " + driver.findElement(By.id("size")).getSize());
}
}
