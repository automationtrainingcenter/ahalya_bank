package in.srssprojects.keximbank;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.xml.stream.EventFilter;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringKeyboard;

public class BaseClass {
	WebDriver driver;
	BankHomePage bankHomePage;
	AdminHomePage adminHomePage;
	RoleDetailsPage roleDetailsPage;
	RoleCreationPage roleCreationPage;
	BranchDetailsPage branchDetailsPage;
	BranchCreationPage branchCreationPage;
	EmployeeDetailsPage employeeDetailsPage;
	EmployeeCreationPage employeeCreationPage;
	
	
	public void initialize() {
		bankHomePage = new BankHomePage(driver);
		adminHomePage = new AdminHomePage(driver);
		roleDetailsPage = new RoleDetailsPage(driver);
		roleCreationPage = new RoleCreationPage(driver);
		branchDetailsPage = new BranchDetailsPage(driver);
		branchCreationPage = new BranchCreationPage(driver);
		employeeDetailsPage = new EmployeeDetailsPage(driver);
		employeeCreationPage = new EmployeeCreationPage(driver);
				
	}
	

	public void launchBrowser(String browserName, String url) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".//drivers//geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			throw new RuntimeException("Invalid brwoser name");
		}
		EventFiringWebDriver edriver = new EventFiringWebDriver(driver);
		LIstener listener = new LIstener();
		edriver.register(listener);
		driver = edriver;
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		initialize();
	}
	
	public void launchBrowser(String browserName, String url, String nodeURL) {
		DesiredCapabilities caps = new DesiredCapabilities();
		if (browserName.equalsIgnoreCase("chrome")) {
			caps = DesiredCapabilities.chrome();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			caps = DesiredCapabilities.firefox();
		}
		caps.setPlatform(Platform.WINDOWS);
//		if(os.equals("windows")) {
//			caps.setPlatform(Platform.WIN10);
//		}else if(os.equals("mac")) {
//			caps.setPlatform(Platform.EL_CAPITAN);
//		}
		try {
			driver = new RemoteWebDriver(new URL(nodeURL), caps);
			EventFiringWebDriver edriver = new EventFiringWebDriver(driver);
			LIstener listener = new LIstener();
			edriver.register(listener);
			driver = edriver;
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		initialize();
	}
	
	
	public String acceptAlert() {
		String text = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return text;
	}
}
