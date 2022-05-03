package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateLink {
	public static void main(String[] args) {

		// Driver setup
	    WebDriverManager.chromedriver().setup();
	    // Open Chrome Browser
	    ChromeDriver driver = new ChromeDriver();
	    
	    // Load the URL
		driver.get("http://leafground.com/pages/Link.html");

		// Maximize browser window
		driver.manage().window().maximize();

		// to go to home page
		driver.findElement(By.linkText("Go to Home Page")).click();

		driver.navigate().back();

		System.out.println("Page  is "+ driver.findElement(By.xpath("//a[contains(text(),'Find')]")).getAttribute("href"));

		//  verify the Page is broken
		driver.findElement(By.xpath("//a[contains(text(),'Verify')]")).click();
		String str1 = driver.findElement(By.tagName("h1")).getText();

		if (str1.contains("404")) {
			System.out.println("The Page is Broken");

		} else {
			System.out.println("The Page is Not Broken");
		}

		// back to previous page
		driver.navigate().back();
		
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.navigate().back();

		// To check No.of.Links in webpage
		int linksCount = driver.findElements(By.tagName("a")).size();
		System.out.println("The Total No.of.Links in this page = " + linksCount);

	}

}
