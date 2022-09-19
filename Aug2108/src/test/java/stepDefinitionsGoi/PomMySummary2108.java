package stepDefinitionsGoi;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pagesGoi.MySummary2108;
import pagesGoi.Homepage2108;

/*
public class PomMySummary2108 {

	

	
	@When ("^Clicks on My Summary link$")
	public void mySummarypage() throws InterruptedException {

		Homepage2108.clikMySummary();
	}


	@And ("^Scroll down to see Goals & Values section$")
	public void goalsAndValues() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
	}

	@When ("^Scroll down to see Skills Review Insight section$")
	public void skillsReviewInsight() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,950)");
	}

	@And ("^Scroll down to see Survey section$")
	public void surveySection() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	}

	@When ("^Scroll up to see Recognitions section to go on Recognition Received tab$")
	public void recognitionsSection() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-810)");

	}
	
	@And ("^Clicks on Nomination Sent tab$")
	public void nominationSent() {
		
		mySummary.clikNominationSent();
	}

	@When ("^Clicks on Direct Recognized tab$")
	public void directRecognized() {
		
		mySummary.clikDirectRecognized();
	}

	@And ("^Clicks on Approved tab$")
	public void approved() {
		
		mySummary.clikApproved();
	}

	@When ("^Clicks on Declined tab$")
	public void declined() throws InterruptedException {
		
		Homepage2108.clikMySummary();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(1000);
		
		mySummary.clikDeclined();
	}

	

	@And ("^Clicks on Pending Approval link$")
	public void pending() throws InterruptedException {
		
		Homepage2108.clikMySummary();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(1000);
		
		mySummary.clikPendingApproval();
	}

	@When ("^Clicks on Order History link$")
	public void orderHistory() throws InterruptedException {
		
		Homepage2108.clikMySummary();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		
		mySummary.clikOrderHistory();
	}
	
	@And ("^Clicks on Unclaimed Reward tab$")
	public void unclaimed() throws InterruptedException {
		
		Homepage2108.clikMySummary();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(1000);
		
		mySummary.clikUnclaimedReward();
	}
	
*/

