package functional.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Lounge {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/mdzeeshanreza/Downloads/chromedriv/chromedriver");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
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
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.id("'apply+detail+ 1'"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", button);
		Thread.sleep(6000);
}
}