package hooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utility.ConfigReader;

public class Hooks {


	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;

	Properties prop;

	@Before (order=0)
	public void getProperty() {
		

		configReader =new ConfigReader();
		prop= configReader.init_prop() ;
	}

	@Before (order=1)
	public void launchBrowser() {
		String browserName= prop.getProperty("browser");

		driverFactory = new DriverFactory();
		driverFactory.init_driver(browserName);

	}
	
	@After (order=1)
	public void quitBrowser() {
		driver.quit();
	}
	
	

@After(order = 0)

public void tearDown(Scenario scenario) {


	if (scenario.isFailed()) {
// take screenshot:

String screenshotName = scenario.getName().replaceAll(" ", "_");

 byte[] sourcePath = ((TakesScreenshot) driver) .getScreenshotAs(OutputType.BYTES) ;

 scenario.attach(sourcePath, "image/png", screenshotName) ;
	
	

/*
	@BeforeStep
	public void beforeSteps() throws InterruptedException, IOException {
		Thread.sleep(1000);
		//2000
	}

	@AfterStep
	public void afterSteps() throws IOException, InterruptedException {
		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());


		Thread.sleep(2000);
		//5000
		TakesScreenshot ts= ((TakesScreenshot)driver);
		File source= ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("src/test/resources/Screenshots2108/" +  " " + timestamp + ".png");
		FileUtils.copyFile(source,dest );
		System.out.println("ss of " +	driver.getTitle() + " taken");

	}

*/
	}
	
	
}}

