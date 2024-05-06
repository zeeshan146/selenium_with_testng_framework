package functional.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

public class get {
	public class FTbtoc {
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
		public void testWithChromeOptions() throws InterruptedException {
			driver.get("https://tryfront.banksathi.com/credit-cards");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 500);");
			Thread.sleep(500);
			driver.findElement(By.xpath(
					"//*[@id=\"__next\"]/main/div[1]/div[1]/div[1]/div[2]/div[2]/div/div[1]/div/div[3]/div[1]/div/label/input"))
					.click();
			JavascriptExecutor sc = (JavascriptExecutor) driver;
			sc.executeScript("window.scrollBy(0, 200);");
			WebElement button = driver.findElement(By.id("'apply+detail+ 1'"));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", button);

//	        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//	        WebElement dropdown = driver.findElement(By.xpath("//div[@class='relative mt-4 w-[90%] max-[1440px]:w-[100%] sm:w-3/5 mx-auto max-[576px]:w-full flex justify-center']"));
//	        dropdown.click();
//	        Select select = new Select(dropdown);
//	        select.selectByIndex(11);

			// Continue with your actions
		}

		@Test(priority = 2)
		public void test2() throws InterruptedException {

			driver.get("https://tryfront.banksathi.com/credit-cards");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"__next\"]/main/section/div[1]/div[2]/div/div[3]/div/div/img"))
					.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"modal\"]/div/div[2]/div/div[2]/div/div[1]/p")).click();
			driver.findElement(By.xpath(
					"//a[contains(@href, '/credit-cards/indusind-bank/indusind-bank-credit-card') and contains(@class, 'text-[#212529]')]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"//button[contains(@id, 'apply+detail+ 3') and contains(@class, 'cursor-pointer') and contains(@class, 'bg-[#49D49D]')]"))
					.click();
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

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			// Thread.sleep(6000);
			driver.findElement(By.xpath(
					"//*[@id=\"__next\"]/main/section/div[3]/div/div/div/div[2]/div[2]/div/div[2]/form/div[1]/div/div/div/input"))
					.sendKeys("CODPR8592F");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"full_name\"]")).sendKeys("MD.ZEESHANREZA");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("6204845542");
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"//*[@id=\"__next\"]/main/section/div[3]/div/div/div/div[2]/div[2]/div/div[2]/form/div[4]/input"))
					.click();
			Thread.sleep(3000);
			JavascriptExecutor JS = (JavascriptExecutor) driver;
			JS.executeScript("window.scrollBy(0, 500);");
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"//*[@id=\"__next\"]/main/section/div[3]/div/div/div/div[2]/div[2]/div/div[2]/form/div[5]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"//*[@id=\"__next\"]/main/section/div[3]/div/div/div/div[2]/div[2]/div/div[2]/div/div/div[2]/div/div/div/div/div/button[2]"))
					.click();

		}

	}
}