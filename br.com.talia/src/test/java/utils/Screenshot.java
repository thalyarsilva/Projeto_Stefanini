package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.util.Date;

public class Screenshot {

	public void screen() throws IOException {

		Date d = new Date();

		SimpleDateFormat data = new SimpleDateFormat("yyyy-MM-dd HHmmss");
		File scrFile = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("src/test/resources/screenshot/" + data.format(d) + ".png"));

	}
}