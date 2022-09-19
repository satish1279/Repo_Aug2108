package pagesGoi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login2108 {


	private WebDriver driver;


	//============== Background ============//

	private By txt_usrname=By.xpath("//input[@name='username']");

	private By txt_password=By.xpath("//input[@name='password']");

	private By btn_login=By.cssSelector("#cred_sign_in_button");


	public Login2108(WebDriver driver1) {
		this.driver=driver1;
	}



	public void entrUsernam(String un) {
		driver.findElement(txt_usrname).sendKeys(un);
	}


	public void entrPassword(String pwd) {
		driver.findElement(txt_password).sendKeys(pwd);
	}

	public void clikButon() {
		driver.findElement(btn_login).click();

	}





	
	}


//	public String getPageTitle() {
//		return driver.getTitle();
//	}












