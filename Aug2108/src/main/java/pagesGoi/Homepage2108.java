package pagesGoi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage2108 {



	private	WebDriver driver;

	
	 
	//============== All Pages ============//

	By link_Homepage=By.xpath("//a[@class='cursorPointer'][@href='Home/Index']//span[@class='ng-binding'][contains(text(),'Home')]");

	By link_recognize=By.xpath("//a[@class='cursorPointer'and @href='Recognize/Recognize']//span[@class='ng-binding'][contains(text(),'Recognize')]");

	By link_skillInsight=By.xpath("//a[@class='cursorPointer'][@href='Feedback/Index']//span[@class='ng-binding'][contains(text(),'Skill Insight')]");

	By link_wellness=By.xpath("//a[@class='cursorPointer'][@href='Wellness/index']//span[@class='ng-binding'][contains(text(),'Wellness')]");

	By link_survey=By.xpath("//a[@class='cursorPointer'][@href='Survey/Index']//span[@class='ng-binding'][contains(text(),'Survey')]");

	By link_jobReferral=By.xpath("//a[@class='cursorPointer'][@href='managejob/index']//span[@class='ng-binding'][contains(text(),'Job Referral')]");

	By link_mySummary=By.xpath("//a[@class='cursorPointer'][@href='Home/viewProfile']//span[@class='ng-binding'][contains(text(),'My Summary')]");

	By link_dashboard=By.xpath("//a[@class='cursorPointer'][@href='Dashboard/Dashboard']//span[@class='ng-binding'][contains(text(),'Dashboard')]");

	By link_redeem=By.xpath("//a[@class='cursorPointer'][@href='Redeem/RedeemPlus']//span[@class='ng-binding'][contains(text(),'Redeem')]");




	public Homepage2108(WebDriver driver1) {
		this.driver=driver1;
	}



	public void clikHomepage() {	
		driver.findElement(link_Homepage).click();		
	}


	public void clikRecognize() {	
		driver.findElement(link_recognize).click();
	}

	
	public void clikSkillInsight() {	
		driver.findElement(link_skillInsight).click();
	}

	public void clikWellness() {	
		driver.findElement(link_wellness).click();
	}
	 
	public void clikSurvey() {	
		driver.findElement(link_survey).click();
	}
	
	public void clikJob() {	
		driver.findElement(link_jobReferral).click();
	}

	public void clikMySummary() {	
		driver.findElement(link_mySummary).click();
	}

	public void clikDashboard() {	
		driver.findElement(link_dashboard).click();
	}

	public void clikRedeem() {	
		driver.findElement(link_redeem).click();
	}
	 
}
