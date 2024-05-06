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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Rerun {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		// Specify the path to the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver", "/Users/mdzeeshanreza/Downloads/chromedriv/chromedriver");

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		// Create a ChromeOptions object to customize Chrome browser behavior

		// Pass the ChromeOptions to the ChromeDriver
		driver = new ChromeDriver(option);
	}

	@Test(priority = 2)
	public void functionaltesting() throws InterruptedException {
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
		try {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			// Save the screenshot to a file
			FileHandler.copy(screenshotFile, new File("/Users/mdzeeshanreza/Documents/functionality.png"));
			System.out.println("Screenshot captured and saved.");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 1)
	public void searchfunctionalitytesting() throws InterruptedException {
		driver.get("https://tryfront.banksathi.com/credit-cards");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/section/div[1]/div[2]/div/div[3]/div/div/img")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"modal\"]/div/div[2]/div/div[2]/div/div[1]/p")).click();
		driver.findElement(By.xpath(
				"//a[contains(@href, '/credit-cards/indusind-bank/indusind-bank-credit-card') and contains(@class, 'text-[#212529]')]"))
				.click();
		Thread.sleep(3000);

		// WebElement button = driver.findElement(By.xpath("//*[@id=\"'apply+detail+
		// 3'\"]"));
		// JavascriptExecutor executor = (JavascriptExecutor) driver;
		// executor.executeScript("arguments[0].click();", button);

		// driver.findElement(By.xpath("'apply+detail+ 3'")).click();

		try {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			// Save the screenshot to a file
			FileHandler.copy(screenshotFile, new File("/Users/mdzeeshanreza/Documents/Searchfunctionality.png"));
			System.out.println("Screenshot captured and saved.");
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

}
