package com.frame.qa.webpages;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.frame.qa.wrappers.BaseMethod;

public class KTtask_IrctcPage extends BaseMethod{

	@FindBy(xpath = "//img[@id='disha-banner-close']")
	WebElement closeDishaPopup;
	@FindBy(xpath = "//div[@id=\"askDishaLuncher\"]/img[1]")
	WebElement askDishaLauncher;
	@FindBy(xpath = "//h3[text()='DISHA']")
	WebElement askDishaTitle;
	@FindBy(xpath = "//iframe[@class=\"disha-frame\"]")
	WebElement iframeAskDishaBot;
	@FindBy(xpath = "//div[text()='Select Your Source Station']")
	WebElement selectSourceStation;
	@FindBy(xpath = "//div[text()='Select Your Destination Station']")
	WebElement selectDestinationStation;
	@FindBy(xpath = "//input[@placeholder='Search your Station or City']")
	WebElement searchStationTxt;
	@FindBy(xpath = "(//div[@class=\"stations\"]/div)[1]")
	WebElement selectFirstSearchResult;
	@FindBy(xpath = "//span[text()='Journey Date']/parent::div")
	WebElement journeyDate;
	@FindBy(xpath = "//span[text()='Journey Quota']/parent::div")
	WebElement selectJourneyQuota;
	@FindBy(xpath = "//div[@id=\"senior\"]")
	WebElement SeniorCitizenQuota;
	@FindBy(xpath = "//button[text()='Book Ticket']")
	WebElement bookTicketBtn;
	@FindBy(xpath = "((//div[contains(@class,\"tickets indiana-scroll-container indiana\")])[1]/div/div)[1]")
	WebElement selectFirstQuotaOfFirstTrain;
	@FindBy(xpath = "//div[@class=\"train-days\"]/div[1]")
	WebElement seatAvailabilityOfSelectedDate;
	@FindBy(xpath = "//iframe[@class=\"disha-frame\"]/following-sibling::img")
	WebElement closeAskDishaBot;
	@FindBy(xpath = "//label[text()=' BOOK TICKET ']")
	WebElement bookTicketTitle;

	public KTtask_IrctcPage() {
		PageFactory.initElements(driver_rw, this );
	}
	
	
	public void chatBotVerification() throws Exception {
		waitForPageLoad();
		//test.info("Verifying colour catalogue ..............");
		try {
			if(closeDishaPopup.isDisplayed())
			{
				click(closeDishaPopup);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		click(askDishaLauncher);
		Wait(2000);
		switchToFrameByWebElement(iframeAskDishaBot);
		Assert.assertTrue(isDisplayed(askDishaTitle));
		JSclick(selectSourceStation);
		sendKeys(searchStationTxt, "Pune Jn");
		Wait(1000);
		JSclick(selectFirstSearchResult);
		Wait(1000);
		JSclick(selectDestinationStation);
		sendKeys(searchStationTxt, "New Delhi");
		Wait(1000);
		JSclick(selectFirstSearchResult);
		
		JSclick(journeyDate);
		//selecting date, day after tomorrow ***************************************
		LocalDate date=LocalDate.now().plus(Period.ofDays(2));
//		LocalDate date = LocalDate.parse("2023-07-11");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM");
        String sd=formatter.format(date);
        //1 December 2018
        String[] da=sd.split(" ");
		scrollToElementLoc(driver_rw.findElement(By.xpath("//p[text()='"+da[1]+"']")));
		Wait(1000);
		WebElement dateEl=driver_rw.findElement(By.xpath("//p[text()='"+da[1]+"']/following-sibling::ul[@class='date']/li/span[text()='"+da[0]+"']"));
        click(dateEl);
		
        click(selectJourneyQuota);
        click(SeniorCitizenQuota);
        
        click(bookTicketBtn);
        Wait(3000);
        List<WebElement> trainList=driver_rw.findElements(By.xpath("//div[@class=\"sc-iVFRtF gfOghx\"]/div"));
        Assert.assertTrue(isDisplayed(trainList));
        click(selectFirstQuotaOfFirstTrain);
        Assert.assertTrue(isDisplayed(seatAvailabilityOfSelectedDate));
        Wait(2000);
        switchOutOfFrame();
        click(closeAskDishaBot);
        Wait(2000);
        Assert.assertTrue(isDisplayed(bookTicketTitle));
        
      
        
        
        
        
        
        
        
        
		
		
	
}

	
	
}