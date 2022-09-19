package pagesGoi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pagesGoi.Homepage2108;

public class MySummary2108 {
	
	WebDriver driver;
	
	
	
	//============== My Summary ============//


		By tab_NominationSent=By.xpath("//*[@class='horizontal_tab_menu recognition_switch_mysum clearfix']/li[2]");

		By tab_DirectRecognized=By.xpath("//*[@class='horizontal_tab_menu recognition_switch_mysum clearfix']/li[3]");

		By tab_Approved=By.xpath("//*[@class='horizontal_tab_menu recognition_switch_mysum clearfix']/li[4]");

		By tab_Declined=By.xpath("//*[@class='horizontal_tab_menu recognition_switch_mysum clearfix']/li[5]");

		By tab_UnclaimedReward=By.xpath("//*[@class='horizontal_tab_menu recognition_switch_mysum clearfix']/li[6]");

		By link_PendingApproval=By.xpath("//*[@class='pending_summary ng-scope']/ul[1]/li[1]/span[1]");

		By link_OrderHistory=By.xpath("//*[@class='btn_link btn_link_primary'][contains(text(), 'Order History')]");

		
		

		public MySummary2108(WebDriver driver1) {
			this.driver=driver1;
		}


		public void clikNominationSent() {	
			driver.findElement(tab_NominationSent).click();	
		}


		public void clikDirectRecognized() {	
			driver.findElement(tab_DirectRecognized).click();	
		}

		public void clikApproved() {	
			driver.findElement(tab_Approved).click();	
		}

		public void clikDeclined() {	
			driver.findElement(tab_Declined).click();	
		}

		public void clikUnclaimedReward() {	
			driver.findElement(tab_UnclaimedReward).click();	
		}

		public void clikPendingApproval() {	
			driver.findElement(link_PendingApproval).click();		
		}

		public void clikOrderHistory() {	
			driver.findElement(link_OrderHistory).click();	
		}



}
