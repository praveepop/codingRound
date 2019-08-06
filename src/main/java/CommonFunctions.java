import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.javafx.PlatformUtil;

public class CommonFunctions {

	public static WebDriver driver;
	
	public static void webDriverWait(WebDriver driver,By elementLocator, int TIMEOUT) {
	    WebDriverWait wait = new WebDriverWait(driver,TIMEOUT);
	    wait.until(ExpectedConditions.presenceOfElementLocated(elementLocator));
	    }
	public static void webDriverWaitforTexttoPresent(WebDriver driver,WebElement element, int TIMEOUT,String text) {
	    WebDriverWait wait = new WebDriverWait(driver,TIMEOUT);
	    wait.until(ExpectedConditions.textToBePresentInElementValue(element, text));
	    }
	
	public static void setDriverPath() {
	        if (PlatformUtil.isMac()) {
	            System.setProperty("webdriver.chrome.driver", "chromedriver");
	        }
	        if (PlatformUtil.isWindows()) {
	            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	        }
	        if (PlatformUtil.isLinux()) {
	            System.setProperty("webdriver.chrome.driver", "chromedriver_linux");
	        }
}
	
	public static  boolean isElementPresent(WebDriver driver,By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;        }
    }

	public static void waitFor(int durationInMilliSeconds) {
	        try {
	            Thread.sleep(durationInMilliSeconds);
	        } catch (InterruptedException e) {
	            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
	        }
	    }
	}
	

}
	
