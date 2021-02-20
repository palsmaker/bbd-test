package page;

import java.io.File;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TakesScreenshot;

public class BasePage {

	public static void waitForElement(WebDriver driver, int timeInSeconds, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public static void dropDown(WebElement string, String visibleText) {
		Select sel = new Select(string);
		sel.selectByVisibleText(visibleText);
	}

	public static int randomNumGenerator1(String string, String visibleText) {
		Random rnd =new Random();
		int randomNum = rnd.nextInt(999);
		return randomNum ;
	}

	public void screenShot(WebDriver driver, String fileWithPath) throws Exception {
	TakesScreenshot scrShot = ((TakesScreenshot)driver);
	File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);// Create output file of the screenshot
	File DestFile = new File(fileWithPath);// where to save it 
	FileUtils.copyFile(SrcFile, DestFile);// saving to the local machine,copying scrfile to destfile
}
	
}

