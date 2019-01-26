package in.srssprojects.keximbank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

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
		driver.get(url);
		driver.manage().window().maximize();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		initialize();
	}
}
