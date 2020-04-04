import org.apache.commons.io.FileUtils; //need this to manage files, in this case, to save the screenshot
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShotClasses {
	public static void screenShot(WebDriver dr, String webURL, String pathToSaveScreenShot) throws IOException {
		dr.get(webURL);

		File src = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE); //takes the screenshot and stores it in the 'src' object
		FileUtils.copyFileToDirectory(src, new File(pathToSaveScreenShot)); //Stores it in the specified path
	}
}