import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.sun.javafx.PlatformUtil;

public class HotelBookingTest {
	private WebDriver driver;
	
	public HotelBookingTest(){
	setDriverPath();
    driver = new ChromeDriver();
	 //This initElements method will create all WebElements

	  PageFactory.initElements(driver, this);

	    }
    @FindBy(linkText = "Hotels")
    public  WebElement hotelLink;

    @FindBy(id = "Tags")
    public WebElement localityTextBox;

    @FindBy(id = "SearchHotelsButton")
    public WebElement searchButton;

    @FindBy(id = "travellersOnhome")
    public WebElement travellerSelection;

    @Test
    public void shouldBeAbleToSearchForHotels() {
        driver.manage().window().maximize();

        driver.get("https://www.cleartrip.com/");
      //  driver.findElement(By.linkText("Hotels")).click();
        hotelLink.click();

        localityTextBox.sendKeys("Indiranagar, Bangalore");

        new Select(travellerSelection).selectByVisibleText("1 room, 2 adults");
        searchButton.click();

        driver.quit();

    }

	private void setDriverPath() {
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

}

