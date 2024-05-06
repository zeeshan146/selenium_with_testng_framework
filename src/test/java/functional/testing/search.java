package functional.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class search {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		// Specify the path to the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver", "/Users/mdzeeshanreza/Downloads/chromedriv/chromedriver");

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		// Create a ChromeOptions object to customize Chrome browser behavior

		// Pass the ChromeOptions to the ChromeDriver
		driver = new ChromeDriver(option);
	}

	@Test
	public void searchfunctionalitytesting() throws InterruptedException {
		driver.get("https://tryfront.banksathi.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/section/div[1]/div[2]/div/div[3]/div/div/img")).click();
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
