package functional.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;
import java.time.Instant;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Accountpanel {
	WebDriver driver;

	@BeforeClass
	public void setUp() {
		// Specify the path to the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver", "/Users/mdzeeshanreza/Downloads/chromedriv/chromedriver");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		// Pass the ChromeOptions to the ChromeDriver
		driver = new ChromeDriver(options);
	}

	@Test(priority = 1)
	public void accountsdashboard() throws InterruptedException, IOException {
		driver.get("https://ledger.banksathi.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sandeep@account.co");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345678");
		driver.findElement(By.xpath(
				"//*[@id=\"__next\"]/div/div[2]/div/div/div/div/div/div[2]/div/div[2]/div/div[1]/form/div[3]/button"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[3]/div/div/div/div[5]/div/div/div[1]/div/input"))
				.click();
		driver.findElement(By.xpath(
				"//*[@id=\"layout-wrapper\"]/div[3]/div/div/div/div[5]/div/div/div[1]/div/div/div/div[1]/div[1]/button[3]/span"))
				.click();

	}

	@Test(priority = 2)
	public void productcategory() throws InterruptedException {
		Instant startTime = Instant.now();
		driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[4]/a/span")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(
				By.xpath("//*[@id=\"layout-wrapper\"]/div[3]/div/div/div[2]/div/div[1]/div/div/div[2]/div/select"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//*[@id=\"layout-wrapper\"]/div[3]/div/div/div[2]/div/div[1]/div/div/div[2]/div/select/option[5]"))
				.click();
		Thread.sleep(4000);
		driver.findElement(
				By.xpath("//*[@id=\"layout-wrapper\"]/div[3]/div/div/div[2]/div/div[1]/div/div/div[6]/button[1]"))
				.click();
		Instant endTime = Instant.now();

		// Calculate and print the execution time
		Duration duration = Duration.between(startTime, endTime);
		System.out.println("Time taken for button click: " + duration.toMillis() + " milliseconds");

		// ... other actions ...
	}

	@Test(priority = 3)
	public void productrename() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/a")).click();

		//// *[@id="side-menu"]/li[3]/a
		// driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[3]/div/div/div[2]/div/div[1]/div/div/div[2]/div/select")).sendKeys("B");
//Thread.sleep(2000);
//driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[3]/div/div/div[2]/div/div[1]/div/div/div[6]/button[1]")).click();
	}

	@Test(priority = 4)
	public void searchfunctionality() throws InterruptedException {
		
		
		
		

	}
}
