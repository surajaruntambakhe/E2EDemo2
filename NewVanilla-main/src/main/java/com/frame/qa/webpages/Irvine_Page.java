package com.frame.qa.webpages;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.frame.qa.wrappers.BaseMethod;

public class Irvine_Page extends BaseMethod{

	
	@FindBy(xpath = "(//a[contains(text(),'Locations')])[1]")
	WebElement locationsLnk;
	@FindBy(xpath = "//li[@class=\"main-menu-list-item\"]/a[contains(text(),'Airport Area')]")
	WebElement airportAreaLnk;
	@FindBy(xpath = "//a[text()='Availability']")
	WebElement availabilityLnk;
	@FindBy(xpath = "//div[@class=\"grid-icons__item-container\"]/div[text()='Notes']")
	WebElement notesIcon;
	@FindBy(xpath = "//div[@class=\"grid-icons__item-container\"]/div[text()='Photos']")
	WebElement photosIcon;
	@FindBy(xpath = "//div[@class=\"grid-icons__item-container\"]/div[text()='VR Tours']")
	WebElement vrToursIcon;
	@FindBy(xpath = "//div[@class=\"grid-icons__item-container\"]/div[text()='Video']")
	WebElement videoIcon;
	@FindBy(xpath = "//div[@class=\"grid-icons__item-container download\"]/div[text()='Pdf']")
	WebElement pdfIcon;
	@FindBy(xpath = "//button[@aria-label=\"list view\"]")
	WebElement listViewBtn;
	@FindBy(xpath = "(//span[@class='hovered-red ico-icon-heart-outline-red fav-icon'])[1]")
	WebElement AddfirstItemToFavorite;
	@FindBy(xpath = "//div[@class=\"availabilities-viewer__header-btns\"]/span[@class=\"favorites-button-wrap\"]/button[@class=\"btn secondary-btn\"]/a")
	WebElement favoritesSection;
	@FindBy(xpath = "//span[text()='Download']/parent::button")
	WebElement downloadBtn;
	@FindBy(xpath = "//span[text()='Download Now']/parent::button")
	WebElement downloadNowBtn;
	@FindBy(xpath = "(//div[@class=\"address-container\"]/a[@class=\"building-address-title\"])[1]")
	WebElement buildingAddressTitle;
	@FindBy(xpath = "(//span[@class='suite-address'])[1]")
	WebElement FavoritesItems;

	
	
	public Irvine_Page() {
		PageFactory.initElements(driver_rw, this );
	}

	public void verifyFavorites() throws Exception {
	
		waitForPageLoad();
		mousehover(locationsLnk);
		click(airportAreaLnk);
		Wait(3000);
		click(availabilityLnk);
		Wait(2000);
		Assert.assertTrue(isDisplayed(notesIcon));
		test.info("Notes Icon is displayed");
		Assert.assertTrue(isDisplayed(photosIcon));
		test.info("Photos Icon is displayed");
		Assert.assertTrue(isDisplayed(vrToursIcon));
		test.info("VR Tours Icon is displayed");
		Assert.assertTrue(isDisplayed(videoIcon));
		test.info("Video Icon is displayed");
		Assert.assertTrue(isDisplayed(pdfIcon));
		test.info("PDF Icon is displayed");
		click(listViewBtn);
		Wait(1000);
		click(AddfirstItemToFavorite);
		click(favoritesSection);
		Wait(3000);
		Assert.assertTrue(isDisplayed(FavoritesItems));
		test.info("Properties added to favorite is visible in favorites page");
		//Deleting existing file from local dir
		deleteFileFromDir("/Users/10688467/Downloads", "ICO-TourPackage");
		click(downloadBtn);
		Wait(1000);
		click(downloadNowBtn);
		Wait(2000);
		//Verifying if file is downloaded
		boolean isFileDownloaded=waitAndVerifyIfFileDownloaded("/Users/10688467/Downloads", "ICO-TourPackage");
		Assert.assertTrue(isFileDownloaded);
		System.out.println("");
		test.info("File is downloaded successfully");
		
	}
	
	
	
	
		
		
}
