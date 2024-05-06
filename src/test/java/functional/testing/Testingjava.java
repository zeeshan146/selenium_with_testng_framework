package functional.testing;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Testingjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/mdzeeshanreza/Downloads/chromedriv/chromedriver");

ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");

		driver.get("https://tickets.paytm.com/flights/flightSearch/BLR-Bengaluru/DEL-Delhi/2/1/0/E/2024-02-15/2024-02-17");
		driver.manage.window.maximise();
		// Pass the ChromeOptions to the ChromeDriver
		Webdriver driver = new ChromeDriver(options);
		
		driver.findelementby.id("")

	}

}
