package Com.Sample.utilities;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShots {
	public static String takeScreenShot(WebDriver driver, String name) {
		// screen capture 
		String path = System.getProperty("user.dir") + "/ScreenCaptures/" + name + System.currentTimeMillis() + ".jpg";

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {

			FileUtils.copyFile(scrFile, new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return path;
	}

}
