package functional.testing;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class safariaccount_panel {
	WebDriver driver;

	@BeforeClass
	public void setUp() {
		// Initialize SafariDriver
		driver = new SafariDriver();
	}

	@Test(priority = 1)
	public void accountsDashboard() throws InterruptedException, IOException {
		driver.get("https://ledger.banksathi.com/");
		driver.manage().window().maximize();

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
		Thread.sleep(3000);
		driver.quit();
	}

	@Test(priority = 2)
	public void productCategory() throws InterruptedException {
		Instant startTime = Instant.now();
		driver.get("https://ledger.banksathi.com/");
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
	}

}

//        Instant endTime = Instant.now();
//
//        // Calculate and print the execution time
//        Duration duration = Duration.between(startTime, endTime);
//        System.out.println("Time taken for button click: " + duration.toMillis() + " milliseconds");
//
//        // ... other actions ...
//    }
//
//}

//	// TODO Auto-generated method stub
//	@Test
//    public void safariTest() {
//        // Initialize SafariDriver
//        WebDriver driver = new SafariDriver();
//
//        // Navigate to a website
//        driver.get("https://www.banksathi.com");
//
//        // Perform action
//
//        // Close the browser
//        driver.quit();
//    }
//}
