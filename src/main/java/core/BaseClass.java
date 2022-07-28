package core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	// Properties class from Java.util package
	// Properties is sub-class of Hashtable
	// Properties class: we can also use it to store our test data
	public static Properties properties;

	// Logger is used to log our test cases and test steps
	// So we can see the result in the console
	// It will also make a record of our test log, so later on we can revisit it
	// Logger is a reliable, fast, and flexible logging framework(APIs)
	// It is responsible for capturing logging information
	// appenders: It is responsible for publishing logging information to different
	// destination
	// layout: It is responsible for formating logging information
	public static Logger logger;

	// We will store the path to property.properties file
	public static String propertyPath = ".\\src\\test\\resources\\input\\property.properties";

	// We will store the path to log4j.properties file
	public static String log4jPath = ".\\\\src\\\\test\\\\resources\\\\input\\log4j.properties";

	public BaseClass() {
		
		try {
			
			//read the property.properties file so we wrote method to read the data from property.properties
			//file and to make sure we handle both of the exceptions, we surrounded our method with try/catch block
			
			BufferedReader reader = new BufferedReader(new FileReader(propertyPath));
			properties = new Properties();
			properties.load(reader);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		logger = Logger.getLogger("logger_File");
		PropertyConfigurator.configure(log4jPath);
	}
	//we will write a method to get the url from property.properties file
	public static String getUrl() {

		String url = properties.getProperty("url");
		return url;
	}

	// //we will write a method to get the browser name from property.properties file
	public static String getBrowser() {
		String browser = properties.getProperty("browser");
		return browser;

	}

	//we will write a method to launch the browser
	public static void openBrowser() {
		driver.get(getUrl());
	}

	//we will close one/all of the browsers opened by selenium
	public static void tearDown() {

		driver.close();
		driver.quit();
	}

	public static void browser() {

		String browserName = getBrowser();

		switch (browserName) {

		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "ie":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;

		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}

}
