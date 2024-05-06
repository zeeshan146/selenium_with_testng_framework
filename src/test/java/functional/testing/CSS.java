package functional.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CSS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"/Users/mdzeeshanreza/Downloads/chromedriver-mac-arm64/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://tryfront.banksathi.com/credit-cards");
		
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1000);");
		WebElement element = driver.findElement(By.id("'apply+detail+ 1'"));

        // Get the CSS properties
        String fontSize = element.getCssValue("font-size");
        String height = element.getCssValue("height");
        String width = element.getCssValue("width");
        //String weight= element.getCssValue("weight");

        // Print the captured properties
        System.out.println("Font Size: " + fontSize);
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        //System.out.println("weight: " + weight);

		
		

	}

}
