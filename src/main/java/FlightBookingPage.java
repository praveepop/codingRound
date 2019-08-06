import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightBookingPage {

static WebDriver driver;
	public static By Oneway=By.id("OneWay");
	public static By From=By.id("FromTag");
	public static By To=By.id("ToTag");
	public static By originOption=By.id("ui-id-1");
	public static By tagName=By.xpath("//li[@class='list']");
	public static By Destination=By.id("ui-id-2");
	public static By Date=By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[7]/a");
	public static By SearchButton=By.id("SearchBtn");
	public static By SearchSummary=By.className("searchSummary");
	public static By MyTrip=By.linkText("Your trips");
	public static By SignIn=By.id("SignIn");
	public static By SignInButton=By.id("signInButton");

	public static By Error1=By.id("errors1");
	public static By Frame=By.id("modal_window");


	public FlightBookingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	}
