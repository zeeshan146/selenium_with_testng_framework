package functional.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Rewards {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/mdzeeshanreza/Downloads/chromedriv/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://tryfront.banksathi.com/credit-cards");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/section/div[1]/div[2]/div/div[2]/nav/ul/li[1]/a")).click();
		driver.findElement(By.linkText("Hdfc Bank")).click();
		WebElement button = driver.findElement(By.xpath("//button[@id='nullapply+detail']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", button);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/section/div[3]/div/div/div/div[2]/div[2]/div/div[2]/form/div[1]/div/div/div/input")).sendKeys("ABCD");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"full_name\"]")).sendKeys("BANKSATHI");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9829813254");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/section/div[3]/div/div/div/div[2]/div[2]/div/div[2]/form/div[4]/input")).click();
		Thread.sleep(3000);
		JavascriptExecutor zs = (JavascriptExecutor) driver;
		zs.executeScript("window.scrollBy(0, 500);");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/section/div[3]/div/div/div/div[2]/div[2]/div/div[2]/form/div[5]/button")).click();

	}

}
////button[@id='nullapply+detail']