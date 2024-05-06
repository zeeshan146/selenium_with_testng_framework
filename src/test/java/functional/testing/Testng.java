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
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		// Specify the path to the ChromeDriver executable
		// System.setProperty("webdriver.chrome.driver",
		// "/Users/mdzeeshanreza/Downloads/chromedriv/chromedriver");
		System.setProperty("webdriver.chrome.driver", "/Users/mdzeeshanreza/Downloads/zeeshanmirza/chromedriver");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		// Pass the ChromeOptions to the ChromeDriver
		driver = new ChromeDriver(options);
	}

	@Test(priority = 1)
	public void testWithChromeOptions() throws InterruptedException {
		driver.get("https://tryfront.banksathi.com/credit-cards");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500);");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[contains(@src, 'ifpgxZXtD84sL02Upp1V6XLlakCJrOJY4Dmy9zIw.png')]")).click();
		WebElement button = driver.findElement(By.xpath(
				"//button[contains(@class, 'text-[#212529]') and contains(@class, 'bg-[#49D49D]') and text()='Apply now']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", button);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(
				"//*[@id=\"__next\"]/main/section/div[2]/div/div/div/div[2]/div[2]/div/div[2]/form/div[1]/div/div/div/input"))
				.click();
		driver.findElement(By.xpath(
				"//*[@id=\"__next\"]/main/section/div[2]/div/div/div/div[2]/div[2]/div/div[2]/form/div[1]/div/div/div/input"))
				.sendKeys("CODPR8592F");
		driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("6204845542");
		driver.findElement(By.xpath(
				"//*[@id=\"__next\"]/main/section/div[2]/div/div/div/div[2]/div[2]/div/div[2]/form/div[5]/button")).click();
				
	}

	@Test(priority = 2)
	public void searchfunctionality() throws InterruptedException {

		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/section/div[1]/div[2]/div/div[3]/div/div/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"modal\"]/div/div[2]/div/div[2]/div/div[1]/p")).click();
		driver.findElement(By.xpath("//*[@id=\"headlessui-listbox-option-7\"]/div/div/a")).click();
		driver.findElement(By.id("'apply+detail+ 3'")).click();
		driver.findElement(By.xpath(
				"//*[@id=\"__next\"]/main/section/div[2]/div/div/div/div[2]/div[2]/div/div[2]/form/div[1]/div/div/div/input"))
				.sendKeys("CODPR8592F");
		driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("6204845542");
		driver.findElement(By.xpath(
				"//*[@id=\"__next\"]/main/section/div[2]/div/div/div/div[2]/div[2]/div/div[2]/form/div[5]/button"))
				.click();

	}

	@Test(priority = 3)
	public void content() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/section/div[2]/div/div/div/div[1]/div/div[2]/p/a"))
				.click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 400);");
		Thread.sleep(5000);
	}

	@Test(priority = 4)
	public void scrolling() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 300);");
		driver.findElement(By.xpath("//*[@id=\"overall-rating\"]/div/div[1]/div[2]/div/form/div[2]/div/span[5]"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"review\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"review\"]")).sendKeys("Excellent");
		driver.findElement(By.xpath("//*[@id=\"overall-rating\"]/div/div[1]/div[2]/div/form/div[4]/button")).click();

	}

}

//		"//*[@id=\"__next\"]/main/section/div[3]/div/div/div/div[2]/div[2]/div/div[2]/form/div[1]/div/div/div/input"))
//				.sendKeys("ABCD");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"full_name\"]")).sendKeys("BANKSATHI");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9829813254");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//*[@id=\"__next\"]/main/section/div[3]/div/div/div/div[2]/div[2]/div/div[2]/form/div[4]/input"))
//				.click();
//		Thread.sleep(3000);
//		JavascriptExecutor zs = (JavascriptExecutor) driver;
//		zs.executeScript("window.scrollBy(0, 500);");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//*[@id=\"__next\"]/main/section/div[3]/div/div/div/div[2]/div[2]/div/div[2]/form/div[5]/button"))
//				.click();

//	@Test(priority = 2)
//	public void testWithbank() throws InterruptedException {
//		driver.get("https://tryfront.banksathi.com/credit-cards");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/section/div[1]/div[2]/div/div[3]/div/div/img")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"modal\"]/div/div[2]/div/div[2]/div/div[1]/p")).click();
//		driver.findElement(By.xpath("//*[@id=\"headlessui-listbox-option-7\"]/div/div/a")).click();

//	}
//@Test (priority =3)
//public void testWithtest() {
//	driver.get("https://www.selenium.dev/downloads/");
//
//	@AfterClass
//	public void tearDown() {
//		if (driver != null) {
//			driver.quit();
//		}
//	}
//
//}

// ChromeOptions opt= new ChromeOptions();
// opt.addArguments("--remote-allow-origins=*");
// System.setProperty("webdriver.chrome.driver",
// "/Users/mdzeeshanreza/Downloads/chromedriver-mac-arm64/chromedriver");
// WebDriver driver= new ChromeDriver (opt);
// driver.get("https://www.google.com/");
// System.out.println(driver.getTitle());
// driver.quit();
