package functional.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BD {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		// Specify the path to the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver",
				"/Users/mdzeeshanreza/Downloads/chromedriver-mac-arm64/chromedriver");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-gpu");
		options.addArguments("--disable-dev-shm-usage"); // Add this line
		options.addArguments("--user-data-dir=/path/to/user/data/directory");

		// Pass the ChromeOptions to the ChromeDriver
		driver = new ChromeDriver(options);
		driver = new ChromeDriver(options);
	}

	@Test(priority = 1)
	public void testWithChromeOptions() throws InterruptedException {
		driver.get("https://tryfront.banksathi.com/credit-cards");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500);");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[contains(@src, 'ifpgxZXtD84sL02Upp1V6XLlakCJrOJY4Dmy9zIw.png')]")).click();
		WebElement button = driver.findElement(By.xpath(
				"//button[contains(@class, 'text-[#212529]') and contains(@class, 'bg-[#49D49D]') and text()='Apply now']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", button);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Thread.sleep(6000);
		driver.findElement(By.xpath(
				"//*[@id=\"__next\"]/main/section/div[3]/div/div/div/div[2]/div[2]/div/div[2]/form/div[1]/div/div/div/input"))
				.sendKeys("ABCD");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"full_name\"]")).sendKeys("BANKSATHI");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9829813254");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id=\"__next\"]/main/section/div[3]/div/div/div/div[2]/div[2]/div/div[2]/form/div[4]/input"))
				.click();
		Thread.sleep(3000);
		JavascriptExecutor zs = (JavascriptExecutor) driver;
		zs.executeScript("window.scrollBy(0, 500);");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//*[@id=\"__next\"]/main/section/div[3]/div/div/div/div[2]/div[2]/div/div[2]/form/div[5]/button"))
				.click();
	}
}