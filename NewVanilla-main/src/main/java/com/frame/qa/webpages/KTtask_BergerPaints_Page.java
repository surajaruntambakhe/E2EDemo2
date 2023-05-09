package com.frame.qa.webpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.frame.qa.wrappers.BaseMethod;

public class KTtask_BergerPaints_Page extends BaseMethod{

	@FindBy(xpath = "//*[@id='bergerMenu']")
	WebElement hamBergerMenu;
	@FindBy(xpath = "(//a[text()='Home Users'])[1]")
	WebElement homeUserslnk;
	@FindBy(xpath = "(//a[text()='Virtual Painter'])[1]")
	WebElement virtualPainterlnk;
	@FindBy(xpath = "//a[@class='main-interior']")
	WebElement interiorImage;
	@FindBy(xpath = "//h3[contains(text(),'Living Room')]")
	WebElement livingRoomSelectImg;
	@FindBy(xpath = "//div[@class='mainRoom']/div[@id='room']/div")
	WebElement virtualPainterImg;
	@FindBy(css = "#room > div > svg > g:nth-child(1) > path:nth-child(1)")
	WebElement selectLeftWall;
	@FindBy(xpath = "//ul[@class='color-pallet-selector list-unstyled color-pallet-list wallPallet']/li[@data-id='3']")
	WebElement selectYellowColour;
	@FindBy(xpath = "//li[@data-toggle='tooltip']/div[@data-shadename='YELLOW ZODIAC']")
	WebElement yellowZodiacClourPallet;
	@FindBy(xpath = "(//a[@title='Paint Calculator'])[1]")
	WebElement paintCalculatorLnk;
	@FindBy(xpath = "//h1[text()='Paint Calculator']")
	WebElement paintCalculatorTitle;
	@FindBy(xpath = "//span[text()='Re-Paint']")
	WebElement paintTypeRe_Paint;
	@FindBy(xpath = "//input[@id='slidercarpetinput']")
	WebElement carpetAreaTxt;
	@FindBy(xpath = "//button[@data-id='doorsCount']")
	WebElement selectDoorCountDrp;
	@FindBy(xpath = "//button[@data-id='doorsCount']/following-sibling::div/ul/li[@data-original-index='2']/a")
	WebElement selectDoorCount2;
	@FindBy(xpath = "//input[@id=\"doors-height\"]/parent::span/a[@class='ui-spinner-button ui-spinner-up ui-corner-tr']")
	WebElement doorLengthPlusBtn;
	@FindBy(xpath = "//input[@id=\"doors-height\"]")
	WebElement doorLengthAreavalue;
	@FindBy(xpath = "//input[@name=\"doorsWidth\"]")
	WebElement doorsWidthAreavalue;
	@FindBy(xpath = "//input[@name=\"doorsWidth\"]/parent::span/a[@class=\"ui-spinner-button ui-spinner-up ui-corner-tr\"]")
	WebElement doorWidthhPlusBtn;
	@FindBy(xpath = "//button[@data-id=\"windowsCount\"]")
	WebElement selectWindowCountDrp;
	@FindBy(xpath = "//button[@data-id=\"windowsCount\"]/following-sibling::div/ul/li[@data-original-index=\"3\"]/a")
	WebElement selectWindowCount3;
	@FindBy(xpath = "//input[@id=\"windows-height\"]")
	WebElement windowHightAreaValue;
	@FindBy(xpath = "//input[@id=\"windows-height\"]/following-sibling::a[@class=\"ui-spinner-button ui-spinner-up ui-corner-tr\"]")
	WebElement windowHightPlusBtn;
	@FindBy(xpath = "//input[@id=\"windows-width\"]")
	WebElement windowWidthAreaValue;
	@FindBy(xpath = "//input[@id=\"windows-width\"]/following-sibling::a[@class=\"ui-spinner-button ui-spinner-up ui-corner-tr\"]")
	WebElement windowWidthPlusBtn;
	@FindBy(xpath = "//a[@class=\"btn btn-download2 bg-firebrick btn-paintcalc-submit\"]")
	WebElement contineuBtn;
	@FindBy(xpath = "//div[@class=\"owl-stage\"]/div[6]/div/div/div/div[2]/a[contains(text(),'Select Product')]")
	WebElement select6thProduct;
	@FindBy(xpath = "//div[@class=\"owl-controls\"]/div/div[text()='next']")
	WebElement nextBtn;
	@FindBy(xpath = "//div[@id=\"expressPaintingFormPopup\"]/div/div/div/button[@class=\"close\"]")
	WebElement closedPopupBtn;
	@FindBy(xpath = "//strong[contains(text(),'estimation is ready')]")
	WebElement finalResultTitle;
	@FindBy(xpath = "//div[@class=\"final-istimate text-right\"]/p/strong")
	WebElement totalIstimatedCost;
	@FindBy(xpath = "//div[@class=\"owl-stage\"]/div[6]/div/div/h3")
	WebElement sixthProductTitle;
	@FindBy(xpath = "//a[@title=\"Home Users\"]/parent::li/ul/li/a[text()='Express Painting']")
	WebElement expressPaintingLnk;
	@FindBy(xpath = "//h2[text()='Explore The World of ']")
	WebElement exploreTheWorldVideoTitle;
	@FindBy(xpath = "(//div[@class=\"video-block\"]/a/i[@class=\"fa fa-play\"])[1]")
	WebElement firstVideoPlayBtn;
	@FindBy(xpath = "//button[@class='ytp-play-button ytp-button']")
	WebElement videoPlayPauseBtn;
	@FindBy(xpath = "//div[@class=\"ytp-time-display notranslate\"]/span/span[@class=\"ytp-time-current\"]")
	WebElement currentTime;
	@FindBy(xpath = "//div[@class=\"fancybox-content\"]/iframe")
	WebElement videoIframe;
	@FindBy(xpath = "(//a[@title=\"Utility Tools\"])[1]")
	WebElement utilityToolsLnk;
	@FindBy(xpath = "(//a[@title=\"Utility Tools\"])[1]/parent::li/ul/li/ul/li/a[@title=\"Colour Catalogue\"]")
	WebElement colourCataloguelnk;
	@FindBy(xpath = "//div[@class='color-navigation']")
	WebElement colourNavigationBar;
	@FindBy(xpath = "//a[@data-color=\"violet\"]")
	WebElement violetColourLnk;
	@FindBy(xpath = "//a[@data-name=\"INFINITE GRACE\"]")
	WebElement infiniteGraceColourLnk;
	@FindBy(xpath = "//a[@data-color=\"yellow\"]")
	WebElement yellowColourLnk;
	@FindBy(xpath = "//h4[contains(text(),'Selected Colour')]")
	WebElement selectedColourPopupTitle;
	@FindBy(xpath = "//h4[contains(text(),'Selected Colour')]/preceding-sibling::button[@class='close']")
	WebElement closeSelectedColourPopup;
//	@FindBy(xpath = "")
//	WebElement womenLabel;
//	@FindBy(xpath = "")
//	WebElement womenLabel;
//	@FindBy(xpath = "")
//	WebElement womenLabel;
//	@FindBy(xpath = "")
//	WebElement womenLabel;

	public KTtask_BergerPaints_Page() {
		PageFactory.initElements(driver_rw, this );
	}
	
	
	public void mobileView_ColourCatalogueVerification() throws Exception {
		waitForPageLoad();
		changeMobileViewOrientationToPortrait();
		//test.info("Application opened in mobile view");
		//test.info("Verifying colour catalogue ..............");
		click(hamBergerMenu);
		click(utilityToolsLnk);
		click(colourCataloguelnk);
		Wait(2000);
		Assert.assertTrue(isDisplayed(colourNavigationBar));
		//test.info("Colour navigation bar is displayed");
		changeMobileViewOrientationToLandscape();
		JSclick(violetColourLnk);
		Wait(1000);
		scrollToElementLoc(infiniteGraceColourLnk);
		Wait(1000);
		Assert.assertTrue(isDisplayed(infiniteGraceColourLnk));
		//test.info("Infinite Grace colour is visible in violet colour catalogue");
		JSclick(yellowColourLnk);
		Wait(2000);
		List<WebElement> listel=driver_rw.findElements(By.xpath("//div[@class=\"colour-catalogue\"]/ul/li/a"));
		JSclick(listel.get(listel.size()-2));
		Assert.assertTrue(isDisplayed(colourNavigationBar));
		//test.info("Selected colour popup is displayed");
		changeMobileViewOrientationToPortrait();
		Wait(2000);
		click(closeSelectedColourPopup);
		Wait(1000);
		
	}
	
	
	
	public void videoVerification() throws Exception {
		waitForPageLoad();
		//test.info("Verifying video play ..............");
		click(hamBergerMenu);
		click(homeUserslnk);
		click(expressPaintingLnk);
		Wait(2000);
		scrollToElementLoc(exploreTheWorldVideoTitle);
		Wait(1000);
		click(firstVideoPlayBtn);
		Wait(1000);
		switchToFrameByWebElement(videoIframe);
		click(videoPlayPauseBtn);
		String startTime=currentTime.getText();
		System.out.println("Video start time is - "+startTime);
		click(videoPlayPauseBtn);
		Wait(5000);
		click(videoPlayPauseBtn);
		String currTime=currentTime.getText();
		System.out.println("Video current time is - "+currTime);
		Assert.assertFalse(startTime.equals(currTime));
		//test.info("Video is playing, Video start time is:-"+startTime+" ,current time is:-"+currTime);
		
		
	}
	
	

	public void verifyPaintCalculator() throws Exception {
		waitForPageLoad();
		//test.info("Verifying paint calculator  ...................");
		click(hamBergerMenu);
		click(homeUserslnk);
		click(paintCalculatorLnk);
		Wait(2000);
		Assert.assertTrue(isDisplayed(paintCalculatorTitle));
		//test.info("Paint Calculator is visible");
		click(paintTypeRe_Paint);
		clear(carpetAreaTxt);
		sendKeys(carpetAreaTxt, "1000");
		JSclick(selectDoorCountDrp);
		click(selectDoorCount2);
		click(doorLengthPlusBtn);
		while(!doorLengthAreavalue.getAttribute("aria-valuenow").equals("6"))
		{
			click(doorLengthPlusBtn);
		}
		click(doorWidthhPlusBtn);
		while(!doorsWidthAreavalue.getAttribute("aria-valuenow").equals("3"))
		{
			click(doorWidthhPlusBtn);
		}
		JSclick(selectWindowCountDrp);
		click(selectWindowCount3);
		click(windowHightPlusBtn);
		while(!windowHightAreaValue.getAttribute("aria-valuenow").equals("3"))
		{
			click(windowHightPlusBtn);
		}
		click(windowWidthPlusBtn);
		while(!windowWidthAreaValue.getAttribute("aria-valuenow").equals("3"))
		{
			click(windowWidthPlusBtn);
		}
		Wait(1000);
		JSclick(contineuBtn);
		Wait(1000);
		while(!isDisplayed(select6thProduct))
		{
			click(nextBtn);
		}
		scrollToElementLoc(sixthProductTitle);
		Wait(1000);
		JSclick(select6thProduct);
		Wait(3000);
		//try {
			isDisplayed(closedPopupBtn);
			click(closedPopupBtn);
		//} catch (Exception e) {	}
		Assert.assertTrue(isDisplayed(finalResultTitle));
		//test.info("Final result is displayed, Total Estimated Material Cost is :- "+totalIstimatedCost.getText());
		System.out.println("Final result is displayed, Total Estimated Material Cost is :- "+totalIstimatedCost.getText());
		
	}
	
	
	
	
	public void verifyVertualPainter() throws Exception {
		waitForPageLoad();
		//test.info("Verifying Virtual painter  ...................");
		click(hamBergerMenu);
		Wait(1000);
		click(homeUserslnk);
		Wait(1000);
		click(virtualPainterlnk);
		Wait(2000);
		scrollToElementLoc(interiorImage);
		JSclick(interiorImage);
		Wait(1000);
		Assert.assertTrue(isDisplayed(livingRoomSelectImg));
		//test.info("Interior selection options is visible");
		JSclick(livingRoomSelectImg);
		Wait(1000);
		Assert.assertTrue(isDisplayed(virtualPainterImg));
		//test.info("Virtual painter image is visible");
		click(selectLeftWall);
		Wait(1000);
		JSclick(selectYellowColour);
		Wait(1000);
		JSclick(yellowZodiacClourPallet);
		Wait(1000);
		Assert.assertTrue(yellowZodiacClourPallet.getAttribute("style").contains(selectLeftWall.getAttribute("fill")));
		//test.info("Selected colour is visible in the Virtual painter image");
		
		
	}
	
	
	
	
	
	
}
