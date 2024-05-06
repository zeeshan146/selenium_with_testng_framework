package functional.testing;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Hdfccreditcards {

	public static void main(String[] args) throws InterruptedException {
		

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"/Users/mdzeeshanreza/Downloads/chromedriver-mac-arm64/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://tryfront.banksathi.com/credit-cards");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("vehicle1")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 700);");
		WebElement button = driver.findElement(By.xpath("//*[@id=\"'apply+detail+ 1'\"]"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", button);
		//String screenshotPath = "/Users/mdzeeshanreza/Documents/test.png";
		//File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		
		
        try {
        	File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            // Save the screenshot to a file
        	FileHandler.copy(screenshotFile, new File("/Users/mdzeeshanreza/Documents/SELENIUM.png"));
            System.out.println("Screenshot captured and saved.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Close the WebDriver
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/section/div[3]/div/div/div/div[2]/div[2]/div/div[2]/form/div[1]/div/div/div/input")).sendKeys("ABCD");
		try {
        	File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            // Save the screenshot to a file
        	FileHandler.copy(screenshotFile, new File("/Users/mdzeeshanreza/Documents/SELENIUM.png"));
            System.out.println("Screenshot captured and saved.");
        } catch (IOException e) {
            e.printStackTrace();
        }

		
		
		
    }
}
