package StepDefinitions;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ssLoginSteps {




WebDriver driver= null;


@Given ("^user is on ssLogin page$")
public void ssLoginPage() {


	String projectPath	=	System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/chromeDriver/chromedriver.exe");

	driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.navigate().to("https://goinfinity.beyond360test.com/");

}





@When ("^user enters (.*) and (.*)")
public void ssCredentials(String ssUsername, String ssPassword)throws InterruptedException {
	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(ssUsername);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(ssPassword);



	Thread.sleep(2000);



}




@And ("^user click on ssLogin button$")
public void ssLoginButton() {

	driver.findElement(By.cssSelector("#cred_sign_in_button")).sendKeys(Keys.ENTER);
}


@Then ("^User navigates to ssHomepage$")
public void ssHomepage() throws IOException, InterruptedException {

	String pageTitle= driver.getTitle();
	System.out.println("This is Homepage Method" + pageTitle);

	
//	TakesScreenshot ts= (TakesScreenshot)driver;
//	File source= ts.getScreenshotAs(OutputType.FILE);
//	
//	FileUtils.copyFile(source, new File("src/test/resources/ssScreenshots/abc.png"));
//	
//	System.out.println("ss taken");
//	
	

}

}