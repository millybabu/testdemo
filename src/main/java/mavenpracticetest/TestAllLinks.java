package mavenpracticetest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestAllLinks {

	public static void main(String[] args) throws InterruptedException{
		ChromeOptions options = new ChromeOptions();
        options.setCapability("browserVersion", "116.0.5845.111");
		System.setProperty(
	            "webdriver.chrome.driver",
	            "C:\\Users\\002G1B744\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
	        WebDriver driver = new ChromeDriver();
	        
	        driver.get("https://www.geeksforgeeks.org/");
	  
	        // Maximize window size of browser
	        driver.manage().window().maximize();
	        //Thread.sleep(5000);
	        List<WebElement> elementName =driver.findElements(By.partialLinkText("en.wikipedia.org/wiki/"));
	        System.out.println("Number of elements:" +elementName.size());
	        
	  

	}

}
