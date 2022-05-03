package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateImage {
	public static void main(String[] args) {

		// Driver setup
	    WebDriverManager.chromedriver().setup();
	    // Open Chrome Browser
	    ChromeDriver driver = new ChromeDriver();
	    // Load the URL
		driver.get("http://leafground.com/pages/Image.html");

		// Maximize browser window
		driver.manage().window().maximize();
		//Navigate to home page
		driver.findElement(By.xpath("//label[@for='home']/following::img[@src='../images/home.png']")).click();

		driver.navigate().back();

		// Checking image is Broken
		String str = driver.findElement(By.xpath("//label[@for='position']/following::img[@src='../images/abcd.jpg']"))
				.getAttribute("onclick");

		if (str == null) {

			System.out.println("The Image is Broken");
		}

		else {
			System.out.println("The image is not Broken");
		}

		// clicking using keyboard
		driver.findElement(By.xpath("//label[@for='position']/following::img[@src='../images/keyboard.png']")).click();

		
		driver.navigate().back();

		// clicking using Mouse
		WebElement element = driver
				.findElement(By.xpath("//label[@for='position']/following::img[@src='../images/keyboard.png']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).doubleClick().build().perform();
	}
}
