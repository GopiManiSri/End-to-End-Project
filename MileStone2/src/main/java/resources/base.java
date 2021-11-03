package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	
	public static WebDriver driver;
	public Properties pro;
	public WebDriver initilizeDriver() throws IOException {
		
		pro=new Properties();
		FileInputStream fis = new FileInputStream("D:\\Selenium\\selenium-programs\\MileStone2\\src\\main\\java\\resources\\configure.properties");
		pro.load(fis);
		String browserName=pro.getProperty("browser");
		if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\selenium-programs\\MileStone2\\drivers\\chromedriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\selenium-programs\\MileStone2\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("internet explorer")){
			System.setProperty("webdriver.ie.driver", "D:\\Selenium\\selenium-programs\\MileStone2\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else if(browserName.equalsIgnoreCase("Edge")){
			System.setProperty("webdriver.edge.driver", "D:\\Selenium\\selenium-programs\\MileStone2\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
}
