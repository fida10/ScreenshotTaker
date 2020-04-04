
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "//Users//fida10//selenium//drivers//chrome//chromedriver");
		WebDriver dr = new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		ScreenShotClasses.screenShot(dr, "http://facebook.com", "/Users/fida10/Documents/Lynda Hackalicious exercise files/JavaPractice/Screenshot/screenshots");
	}
}

