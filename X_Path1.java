package RelativeXpath;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Path1 {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement element = driver.findElement(By.xpath("//a[@accesskey='8'][1]"));
		element.click();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File f=new File("C:\\Users\\Kavin\\eclipse-workspace\\ScreenShotDemo\\Google\\kams1.png");
		FileUtils.copyFile(screenshotAs, f);
		
		
		
		
				}

}
