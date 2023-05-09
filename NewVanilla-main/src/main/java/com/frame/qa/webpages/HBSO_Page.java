package com.frame.qa.webpages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.markuputils.Markup;
import com.epam.reportportal.annotations.Step;
import com.frame.qa.utils.TestUtil;
import com.frame.qa.wrappers.BaseMethod;

public class HBSO_Page extends BaseMethod{


	@FindBy(xpath = "//header[@class='online-header site-header noindex white-bg sticky-header-cloned']//div/a[text()='Courses']")
	WebElement courseesLnk;
	@FindBy(xpath = "//a[@aria-label='Business Analytics']")
	WebElement businessAnalyticsCourseNameLnk;
	@FindBy(xpath = "//a[text()='Explore All Courses']")
	WebElement exploreAllCoursesLnk;
	@FindBy(xpath = "//a[@class='bx-close bx-close-link bx-close-inside']")
	WebElement closePopupBtn;
	@FindBy(xpath = "(//a[@class='universal-banner-menu-toggle'])[2]")
	WebElement hamburgerMenu;
	@FindBy(xpath = "//a[@id='slidernav-insights']")
	WebElement insightLnk;
	@FindBy(xpath = "(//*[@id='skipto-main']/div[2]/div[2]/div/div[2]/div[2]//a[@title='Read More'])[1]")
	WebElement firstInsightArtical;
	@FindBy(xpath = "//h1[@class=\"delta-uc mb12\"]")
	WebElement firstInsightArticalTitle;
	@FindBy(xpath = "//span[@class='eta blog-post-author-name']/a")
	WebElement authorName;
	@FindBy(xpath = "(//div[@class=\"mu ash mb20-mobile\"]/ul/li/a)[1]")
	WebElement tagLeadership;
	@FindBy(xpath = "//div[@class=\"facet-breadcrumb-pattern eta clearfix\"]/h1/a")
	WebElement tagTitle;
	@FindBy(xpath = "//div[@class=\"course-card-header\"]//a[text()='Business Essentials']")
	WebElement businessEssentialsLnk;
	@FindBy(xpath = "//h1[@class=\"beta card-title\"]")
	WebElement openedCourseTitle;
	@FindBy(xpath = "//a[text()='What you earn']")
	WebElement whatYouEarnLnk;
	@FindBy(xpath = "//a[text()='Syllabus']")
	WebElement syllabusLnk;
	@FindBy(xpath = "(//div[@class='card']/dl/dt/a)[1]")
	WebElement showDetailsSyllabus1;
	@FindBy(xpath = "((//div[@class=\"card\"]/dl/dd)[1]//div[@class='column zen']/ol/li/div[@class=\"list-text\"])[1]")
	WebElement conceptText1;
	@FindBy(xpath = "((//div[@class=\"card\"]/dl/dd)[1]//div[@class='column zen']/ol/li/div[@class=\"list-text\"])[2]")
	WebElement conceptText2;
	@FindBy(xpath = "((//div[@class=\"card\"]/dl/dd)[1]//div[@class='column zen']/ol/li/div[@class=\"list-text\"])[3]")
	WebElement conceptText3;
	@FindBy(xpath = "//a[text()='Enrollment']")
	WebElement enrolmentLnk;
	@FindBy(xpath = "//h2[text()='Dates & Eligibility']")
	WebElement enrollmentDetails;
	@FindBy(xpath = "(//a[text()='FAQs'])[1]")
	WebElement faqSLnk;
	@FindBy(xpath = "(//h2[text()='Business Analytics FAQs']/parent::div/div/div/a[@role=\"button\"])[1]")
	WebElement showFirstFaq;
	@FindBy(xpath = "//div[@class=\"play-overlay\"]/div")
	WebElement videoPlayButton;
	@FindBy(xpath = "//a[@class=\"comp largePlayBtn  largePlayBtnBorder icon-pause\"]")
	WebElement playPauseBtn;
	
	@FindBy(xpath = "//iframe[@title=\"Drift Widget Chat Controller\"]")
	WebElement chatBotControlFarme;
	@FindBy(xpath = "//div[@class='drift-widget-avatar circle drift-controller-icon--avatar-avatar']")
	WebElement chatBot;
	@FindBy(xpath = "//iframe[@title='Drift Widget Chat Window']")
	WebElement chatWindowFrame;
	@FindBy(xpath = "//button[text()='I would like to receive course information']")
	WebElement courseInfoChatChoiseBtn;
	@FindBy(xpath = "//button[text()='Analytics ']")
	WebElement analyticsChatChoise;
	@FindBy(xpath = "//textarea[@id='drift-widget-composer-input']")
	WebElement enterEmailInChat;
	@FindBy(xpath = "//button[@class=\"drift-widget-composer-send-button\"]")
	WebElement sendChatBtn;
	@FindBy(xpath = "//button[text()='Yes, start over.']")
	WebElement startOverChatChoise;
	@FindBy(xpath = "(//p[contains(text(),'Can I help you find something?')])[1]")
	WebElement cahtbotWelcomemsg1;
	@FindBy(xpath = "(//p[contains(text(),'Can I help you find something?')])[2]")
	WebElement cahtbotWelcomemsg2;
	
	
	//=------------------Demo
	@FindBy(xpath = "//input[@type=\"email\"]")
	WebElement emailtxt;
	@FindBy(xpath = "//input[@type=\"password\"]")
	WebElement passwrdtxt;
	@FindBy(xpath = "//input[@type=\"submit\"]")
	WebElement nextBtn;
//	@FindBy(xpath = "")
//	WebElement womenLabel;
//	@FindBy(xpath = "")
//	WebElement womenLabel;

	public HBSO_Page() {
		PageFactory.initElements(driver_rw, this );
	}


	public void demo1() throws Exception {
		waitForPageLoad();
		//waitUntilVisbility(emailtxt);
		sendKeys(emailtxt, "abhgfgfgfgf");		
//		JavascriptExecutor js = (JavascriptExecutor)getDriver();
//
//        js.executeScript(“document.getElementsById("jhjjh").value="Avinash Mishra";”);
//        
        JavascriptExecutor js = (JavascriptExecutor)driver;
  	  js.executeScript("arguments[0].value='Avinash Mishra';", nextBtn);
	}
	
	
	
	
	
	
	public void chatBotVerification1() throws Exception {
		waitForPageLoad();
		test.info("Verifying Chat BOT  ...................");
		//Assert.assertTrue(false);
	
		
		try {
		waitUntilVisible(closePopupBtn);
		click(closePopupBtn);
		}
		 catch (Exception e) {
				// TODO: handle exception
			 System.out.println("Popup is not displayed");
			}
		
		switchToFrameByWebElement(chatBotControlFarme);
		waitUntilVisible(chatBot);
		Assert.assertTrue(isDisplayed(chatBot));
		test.info("ChatBot is displayed on the Home Page");
		click(chatBot);
		Wait(2000);
		
	}
	
	
	public void mobileView1() throws Exception {
		waitForPageLoad();
		test.info("Executing test on Mobile View in Portrait mode ...................");
		try {
			waitUntilVisible(closePopupBtn);
			click(closePopupBtn);
			}
			 catch (Exception e) {
					// TODO: handle exception
				 System.out.println("Popup is not displayed");
				}
		Wait(1000);
		click(hamburgerMenu);
		click(insightLnk);
		Wait(2000);
		
		
		scrollDownWithCordinates(0, 300);
		
	}
	
	
	public void checkCourseDetails1() throws Exception {
		waitForPageLoad();
		test.info("Verifying course details ...................");
		try {
		waitUntilVisible(closePopupBtn);
		click(closePopupBtn);
		}
		 catch (Exception e) {
				// TODO: handle exception
			 System.out.println("Popup is not displayed");
			}
		
		Wait(1000);
		JSclick(exploreAllCoursesLnk);
		Wait(4000);
		
		
		List<WebElement> courcesList=driver_rw.findElements(By.xpath("//div[@class='course-card-header']/div/h2/a"));
		Assert.assertTrue(isDisplayed(courcesList));
		test.info("List of cource is displayed");
		
		click(businessEssentialsLnk);
		Wait(4000);
		scrollToElementLoc(businessAnalyticsCourseNameLnk);
		Wait(1000);
		List<WebElement> businessEssentialsCourcesList=driver_rw.findElements(By.xpath("//div[@class=\"card-deck \"]/div/a"));
		Assert.assertTrue(isDisplayed(businessEssentialsCourcesList));
		test.info("List of Business Essentials Cource is displayed");
		
		
	}
	
public void videoPlayValidation1() throws Exception{
		
		waitForPageLoad();
		test.info("Verifying Video play details ...................");
		try {
		waitUntilVisible(closePopupBtn);
		click(closePopupBtn);
		}
		 catch (Exception e) {
				// TODO: handle exception
			 System.out.println("Popup is not displayed");
			}
		
		JavascriptExecutor js = (JavascriptExecutor) driver_rw;
		WebElement elm=driver_rw.findElement(By.id("skipto-main"));
		WebElement VP=elm.findElement(By.className("video-container"));
		
		//Click on Playbutton
		VP.findElement(By.xpath("//div[contains(@class,'play-overlay')]/div")).click();
		Thread.sleep(3000);
		
		 //Switch to Frame using id of the frame
        driver_rw.switchTo().frame("video-embed-1_ifp");
        Thread.sleep(3000);
        
        Actions actions = new Actions(driver_rw);
		actions.moveToElement(driver_rw.findElement(By.cssSelector(".controlBarContainer"))).build().perform();
		
		Thread.sleep(3000);
		 
		WebElement newElm=driver_rw.findElement(By.cssSelector(".controlsContainer"));
		
		newElm.findElement(By.cssSelector(".btn.icon-expand.comp")).click();
		
		String pauseTime=newElm.findElement(By.cssSelector(".timers.comp.currentTimeLabel.display-high")).getText();
		
		Thread.sleep(2000);
		actions.moveToElement(driver_rw.findElement(By.cssSelector(".controlsContainer"))).build().perform();
		Thread.sleep(8000);
		
		String fullScreenPauseTime=newElm.findElement(By.cssSelector(".timers.comp.currentTimeLabel.display-high")).getText();
		System.out.println(fullScreenPauseTime+" full Screenpause");
       		
		newElm.findElement(By.cssSelector(".btn.comp.playPauseBtn")).click();
		System.out.println(newElm.findElement(By.cssSelector(".btn.comp.fullScreenBtn")).getAttribute("title"));
		
		if(newElm.findElement(By.cssSelector(".btn.comp.fullScreenBtn")).getAttribute("title").equalsIgnoreCase("Exit full screen")) {
			System.out.println("Screen Expanded to full screen Mode");
			newElm.findElement(By.cssSelector(".btn.comp.fullScreenBtn")).click();
		}
		
		boolean flag=false;
		
		if(!(pauseTime==fullScreenPauseTime)) {
			System.out.println("Pass Video is played");
			flag =true;
		}else {
			flag=false;
		}
		
		Assert.assertTrue(flag, "both are not equal");
		test.info("Video start time - "+pauseTime+" - Current time - "+fullScreenPauseTime);
		test.info("Video is playing");
    }
	
	
	
	public void checkSecondCourseDetails() throws Exception {
		waitForPageLoad();
		test.info("Verifying course details ...................");
		try {
			waitUntilVisible(closePopupBtn);
			click(closePopupBtn);
			}
			 catch (Exception e) {
					// TODO: handle exception
				 System.out.println("Popup is not displayed");
				}
		Wait(1000);
		JSclick(exploreAllCoursesLnk);
		Wait(4000);
		List<WebElement> courcesList=driver_rw.findElements(By.xpath("//div[@class='course-card-header']/div/h2/a"));
		Assert.assertTrue(isDisplayed(courcesList));
		test.info("List of cource is displayed");
		
		click(businessEssentialsLnk);
		Wait(2000);
		
		
	}
	
	public void checkThirdCourseDetails() throws Exception {
		waitForPageLoad();
		test.info("Verifying course details ...................");
		try {
			waitUntilVisible(closePopupBtn);
			click(closePopupBtn);
			}
			 catch (Exception e) {
					// TODO: handle exception
				 System.out.println("Popup is not displayed");
				}
		Wait(1000);
		JSclick(exploreAllCoursesLnk);
		Wait(4000);
		List<WebElement> courcesList=driver_rw.findElements(By.xpath("//div[@class='course-card-header']/div/h2/a"));
		Assert.assertTrue(isDisplayed(courcesList));
		test.info("List of cource is displayed");
		
		click(businessEssentialsLnk);
		Wait(2000);
		
		
	}
	
	public void checkFourthCourseDetails() throws Exception {
		waitForPageLoad();
		test.info("Verifying course details ...................");
		try {
			waitUntilVisible(closePopupBtn);
			click(closePopupBtn);
			}
			 catch (Exception e) {
					// TODO: handle exception
				 System.out.println("Popup is not displayed");
				}
		Wait(1000);
		JSclick(exploreAllCoursesLnk);
		Wait(4000);
		List<WebElement> courcesList=driver_rw.findElements(By.xpath("//div[@class='course-card-header']/div/h2/a"));
		Assert.assertTrue(isDisplayed(courcesList));
		test.info("List of cource is displayed");
		
		click(businessEssentialsLnk);
		Wait(2000);
		
		
	}
	
	public void verifyPopup() throws Exception {
		waitForPageLoad();
		test.info("Verifying popup  ...................");
		try {
			waitUntilVisible(closePopupBtn);
			click(closePopupBtn);
			}
			 catch (Exception e) {
					// TODO: handle exception
				 System.out.println("Popup is not displayed");
				}
		Wait(1000);
		JSclick(exploreAllCoursesLnk);
		Wait(4000);
}
	
	public void verifyInfo() throws Exception {
		waitForPageLoad();
		test.info("Verifying course info  ...................");
		try {
			waitUntilVisible(closePopupBtn);
			click(closePopupBtn);
			}
			 catch (Exception e) {
					// TODO: handle exception
				 System.out.println("Popup is not displayed");
				}
		Wait(1000);
		JSclick(exploreAllCoursesLnk);
		Wait(4000);
		
	}
	
	public void parallelTest() throws Exception {
		waitForPageLoad();
		test.info("Verifying parallel test  ...................");
		try {
			waitUntilVisible(closePopupBtn);
			click(closePopupBtn);
			}
			 catch (Exception e) {
					// TODO: handle exception
				 System.out.println("Popup is not displayed");
				}
		Wait(1000);
		JSclick(exploreAllCoursesLnk);
		Wait(4000);
		
	}
	
	
	
	
	
	
	public void chatBotVerification2() throws Exception {
		waitForPageLoad();
		test.info("Verifying Chat BOT  ...................");
		//Assert.assertTrue(false);
	
		
		try {
		waitUntilVisible(closePopupBtn);
		click(closePopupBtn);
		}
		 catch (Exception e) {
				// TODO: handle exception
			 System.out.println("Popup is not displayed");
			}
		
		switchToFrameByWebElement(chatBotControlFarme);
		waitUntilVisible(chatBot);
		Assert.assertTrue(isDisplayed(chatBot));
		test.info("ChatBot is displayed on the Home Page");
		click(chatBot);
		Wait(2000);
		
	}
	
	
	public void mobileView2() throws Exception {
		waitForPageLoad();
		test.info("Executing test on Mobile View in Portrait mode ...................");
		try {
			waitUntilVisible(closePopupBtn);
			click(closePopupBtn);
			}
			 catch (Exception e) {
					// TODO: handle exception
				 System.out.println("Popup is not displayed");
				}
		Wait(1000);
		click(hamburgerMenu);
		click(insightLnk);
		Wait(2000);
		
		
		scrollDownWithCordinates(0, 300);
		
	}
	
	
	public void checkCourseDetails2() throws Exception {
		waitForPageLoad();
		test.info("Verifying course details ...................");
		try {
		waitUntilVisible(closePopupBtn);
		click(closePopupBtn);
		}
		 catch (Exception e) {
				// TODO: handle exception
			 System.out.println("Popup is not displayed");
			}
		
		Wait(1000);
		JSclick(exploreAllCoursesLnk);
		Wait(4000);
		
		
		List<WebElement> courcesList=driver_rw.findElements(By.xpath("//div[@class='course-card-header']/div/h2/a"));
		Assert.assertTrue(isDisplayed(courcesList));
		test.info("List of cource is displayed");
		
		click(businessEssentialsLnk);
		Wait(4000);
		scrollToElementLoc(businessAnalyticsCourseNameLnk);
		Wait(1000);
		List<WebElement> businessEssentialsCourcesList=driver_rw.findElements(By.xpath("//div[@class=\"card-deck \"]/div/a"));
		Assert.assertTrue(isDisplayed(businessEssentialsCourcesList));
		test.info("List of Business Essentials Cource is displayed");
		
		
	}
	
public void videoPlayValidation2() throws Exception{
		
		waitForPageLoad();
		test.info("Verifying Video play details ...................");
		try {
		waitUntilVisible(closePopupBtn);
		click(closePopupBtn);
		}
		 catch (Exception e) {
				// TODO: handle exception
			 System.out.println("Popup is not displayed");
			}
		
		JavascriptExecutor js = (JavascriptExecutor) driver_rw;
		WebElement elm=driver_rw.findElement(By.id("skipto-main"));
		WebElement VP=elm.findElement(By.className("video-container"));
		
		//Click on Playbutton
		VP.findElement(By.xpath("//div[contains(@class,'play-overlay')]/div")).click();
		Thread.sleep(3000);
		
		 //Switch to Frame using id of the frame
        driver_rw.switchTo().frame("video-embed-1_ifp");
        Thread.sleep(3000);
        
        Actions actions = new Actions(driver_rw);
		actions.moveToElement(driver_rw.findElement(By.cssSelector(".controlBarContainer"))).build().perform();
		
		Thread.sleep(3000);
		 
		WebElement newElm=driver_rw.findElement(By.cssSelector(".controlsContainer"));
		
		newElm.findElement(By.cssSelector(".btn.icon-expand.comp")).click();
		
		String pauseTime=newElm.findElement(By.cssSelector(".timers.comp.currentTimeLabel.display-high")).getText();
		
		Thread.sleep(2000);
		actions.moveToElement(driver_rw.findElement(By.cssSelector(".controlsContainer"))).build().perform();
		Thread.sleep(8000);
		
		String fullScreenPauseTime=newElm.findElement(By.cssSelector(".timers.comp.currentTimeLabel.display-high")).getText();
		System.out.println(fullScreenPauseTime+" full Screenpause");
       		
		newElm.findElement(By.cssSelector(".btn.comp.playPauseBtn")).click();
		System.out.println(newElm.findElement(By.cssSelector(".btn.comp.fullScreenBtn")).getAttribute("title"));
		
		if(newElm.findElement(By.cssSelector(".btn.comp.fullScreenBtn")).getAttribute("title").equalsIgnoreCase("Exit full screen")) {
			System.out.println("Screen Expanded to full screen Mode");
			newElm.findElement(By.cssSelector(".btn.comp.fullScreenBtn")).click();
		}
		
		boolean flag=false;
		
		if(!(pauseTime==fullScreenPauseTime)) {
			System.out.println("Pass Video is played");
			flag =true;
		}else {
			flag=false;
		}
		
		Assert.assertTrue(flag, "both are not equal");
		test.info("Video start time - "+pauseTime+" - Current time - "+fullScreenPauseTime);
		test.info("Video is playing");
    }
	
	
	
	public void checkSecondCourseDetails2() throws Exception {
		waitForPageLoad();
		test.info("Verifying course details ...................");
		try {
			waitUntilVisible(closePopupBtn);
			click(closePopupBtn);
			}
			 catch (Exception e) {
					// TODO: handle exception
				 System.out.println("Popup is not displayed");
				}
		Wait(1000);
		JSclick(exploreAllCoursesLnk);
		Wait(4000);
		List<WebElement> courcesList=driver_rw.findElements(By.xpath("//div[@class='course-card-header']/div/h2/a"));
		Assert.assertTrue(isDisplayed(courcesList));
		test.info("List of cource is displayed");
		
		click(businessEssentialsLnk);
		Wait(2000);
		
		
	}
	
	public void checkThirdCourseDetails2() throws Exception {
		waitForPageLoad();
		test.info("Verifying course details ...................");
		try {
			waitUntilVisible(closePopupBtn);
			click(closePopupBtn);
			}
			 catch (Exception e) {
					// TODO: handle exception
				 System.out.println("Popup is not displayed");
				}
		Wait(1000);
		JSclick(exploreAllCoursesLnk);
		Wait(4000);
		List<WebElement> courcesList=driver_rw.findElements(By.xpath("//div[@class='course-card-header']/div/h2/a"));
		Assert.assertTrue(isDisplayed(courcesList));
		test.info("List of cource is displayed");
		
		click(businessEssentialsLnk);
		Wait(2000);
		
		
	}
	
	public void checkFourthCourseDetails2() throws Exception {
		waitForPageLoad();
		test.info("Verifying course details ...................");
		try {
			waitUntilVisible(closePopupBtn);
			click(closePopupBtn);
			}
			 catch (Exception e) {
					// TODO: handle exception
				 System.out.println("Popup is not displayed");
				}
		Wait(1000);
		JSclick(exploreAllCoursesLnk);
		Wait(4000);
		List<WebElement> courcesList=driver_rw.findElements(By.xpath("//div[@class='course-card-header']/div/h2/a"));
		Assert.assertTrue(isDisplayed(courcesList));
		test.info("List of cource is displayed");
		
		click(businessEssentialsLnk);
		Wait(2000);
		
		
	}
	
	public void verifyPopup2() throws Exception {
		waitForPageLoad();
		test.info("Verifying popup  ...................");
		try {
			waitUntilVisible(closePopupBtn);
			click(closePopupBtn);
			}
			 catch (Exception e) {
					// TODO: handle exception
				 System.out.println("Popup is not displayed");
				}
		Wait(1000);
		JSclick(exploreAllCoursesLnk);
		Wait(4000);
}
	
	public void verifyInfo2() throws Exception {
		waitForPageLoad();
		test.info("Verifying course info  ...................");
		try {
			waitUntilVisible(closePopupBtn);
			click(closePopupBtn);
			}
			 catch (Exception e) {
					// TODO: handle exception
				 System.out.println("Popup is not displayed");
				}
		Wait(1000);
		JSclick(exploreAllCoursesLnk);
		Wait(4000);
		
	}
	
	public void parallelTest2() throws Exception {
		waitForPageLoad();
		test.info("Verifying parallel test  ...................");
		try {
			waitUntilVisible(closePopupBtn);
			click(closePopupBtn);
			}
			 catch (Exception e) {
					// TODO: handle exception
				 System.out.println("Popup is not displayed");
				}
		Wait(1000);
		JSclick(exploreAllCoursesLnk);
		Wait(4000);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//-------------------------------- Complete test cases-----------------------------------------
	

	public void chatBotVerification() throws Exception {
		waitForPageLoad();
		test.info("Verifying Chat BOT  ...................");
		//Assert.assertTrue(false);
	
		
		try {
		waitUntilVisible(closePopupBtn);
		click(closePopupBtn);
		}
		 catch (Exception e) {
				// TODO: handle exception
			 System.out.println("Popup is not displayed");
			}
		
		switchToFrameByWebElement(chatBotControlFarme);
		waitUntilVisible(chatBot);
		Assert.assertTrue(isDisplayed(chatBot));
		test.info("ChatBot is displayed on the Home Page");
		click(chatBot);
		Wait(2000);
		
	
		switchOutOfFrame();
		switchToFrameByWebElement(chatWindowFrame);
		Assert.assertTrue(cahtbotWelcomemsg1.getText().contains("Can I help you find something"));
		test.info("ChatBot is Opened on the Home Page");
		click(courseInfoChatChoiseBtn);
		Wait(2000);
		click(analyticsChatChoise);
		Wait(2000);
		sendKeys(enterEmailInChat, "abcd@gmail.com");
		Wait(1000);
		click(sendChatBtn);
		Wait(2000);
		String startOverText=startOverChatChoise.getText();
		click(startOverChatChoise);
		Wait(2000);
		Assert.assertTrue(cahtbotWelcomemsg2.getText().contains("Can I help you find something"));
		test.info("Successfully clicked on - "+startOverText);
		
		
		
	}
	
	
	
	
	
	public void mobileView() throws Exception {
		waitForPageLoad();
		test.info("Executing test on Mobile View in Portrait mode ...................");
		try {
			waitUntilVisible(closePopupBtn);
			click(closePopupBtn);
			}
			 catch (Exception e) {
					// TODO: handle exception
				 System.out.println("Popup is not displayed");
				}
		Wait(1000);
		click(hamburgerMenu);
		click(insightLnk);
		Wait(2000);
		
		
		scrollDownWithCordinates(0, 300);
		List<WebElement> insightArtiaclList=driver_rw.findElements(By.xpath("//*[@id='skipto-main']/div[2]/div[2]/div/div[2]/div[2]//a[@title='Read More']"));
		Assert.assertTrue(isDisplayed(insightArtiaclList));
		test.info("List of Insight articals is displayed");
		String articalTitle=firstInsightArtical.getText();

		Map deviceMetrics = new HashMap()
		{{
			put("width", 851);
			put("height", 393);
			put("mobile", true);
			put("deviceScaleFactor", 50);
		}};
		((ChromiumDriver) driver_rw).executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);
		Thread.sleep(2000);
		test.info("Switch to Landscape mode");

		JSclick(firstInsightArtical);
		Wait(2000);
		scrollToElementLoc(authorName);
		Wait(2000);
		Assert.assertEquals(articalTitle, firstInsightArticalTitle.getText());
		test.info("The Artiacal - "+articalTitle+" -is opened");
		test.info("The Artiacal details is displayed for - "+articalTitle);
		String tagTitleExpect=tagLeadership.getText();
		JSclick(tagLeadership);
		Wait(2000);
		Assert.assertEquals(tagTitleExpect, tagTitle.getText());
		test.info("Clicked on tag - "+tagTitleExpect);
		scrollDownWithCordinates(0, 600);
		Wait(2000);


	}

	@Step
	public void checkCourseDetails() throws Exception {
		waitForPageLoad();
		test.info("Verifying course details ...................");
		logger.info("Verifying course details ...................");
		try {
		waitUntilVisible(closePopupBtn);
		click(closePopupBtn);
		}
		 catch (Exception e) {
				// TODO: handle exception
			 System.out.println("Popup is not displayed");
			}
		
		Wait(1000);
		JSclick(exploreAllCoursesLnk);
		Wait(4000);
		
		
		List<WebElement> courcesList=driver_rw.findElements(By.xpath("//div[@class='course-card-header']/div/h2/a"));
		Assert.assertTrue(isDisplayed(courcesList));
		test.info("List of cource is displayed");
		logger.info("List of cource is displayed");
		click(businessEssentialsLnk);
		Wait(4000);
		scrollToElementLoc(businessAnalyticsCourseNameLnk);
		Wait(1000);
		List<WebElement> businessEssentialsCourcesList=driver_rw.findElements(By.xpath("//div[@class=\"card-deck \"]/div/a"));
		Assert.assertTrue(isDisplayed(businessEssentialsCourcesList));
		test.info("List of Business Essentials Cource is displayed");
		logger.info("List of Business Essentials Cource is displayed");
		JSclick(businessAnalyticsCourseNameLnk);
		Wait(3000);
		scrollDownWithCordinates(0, 200);
		Assert.assertEquals("Business Analytics", openedCourseTitle.getText());
		test.info("The name of the course opened is - "+openedCourseTitle.getText());
		logger.info("The name of the course opened is - "+openedCourseTitle.getText());
		click(whatYouEarnLnk);
		Wait(2000);
		click(syllabusLnk);
		Wait(1000);
		click(showDetailsSyllabus1);
		Wait(2000);
		Assert.assertEquals(conceptText1.getText(), "Visualizing Data");
		test.info("Concept text - "+conceptText1.getText()+" - is displayed in the module 1");
		logger.info("Concept text - "+conceptText1.getText()+" - is displayed in the module 1");
		Assert.assertEquals(conceptText2.getText(), "Descriptive Statistics");
		test.info("Concept text - "+conceptText2.getText()+" - is displayed in the module 2");
		logger.info("Concept text - "+conceptText2.getText()+" - is displayed in the module 2");
		Assert.assertEquals(conceptText3.getText(), "Relationship Between Two Variables");
		test.info("Concept text - "+conceptText3.getText()+" - is displayed in the module 3");
		logger.info("Concept text - "+conceptText3.getText()+" - is displayed in the module 3");
		click(enrolmentLnk);
		Wait(1000);
		Assert.assertTrue(isDisplayed(enrollmentDetails));
		test.info("The Enrollment details are displayed");
		logger.info("The Enrollment details are displayed");
		click(faqSLnk);
		Wait(1000);
		click(showFirstFaq);
		Wait(2000);
		Assert.assertEquals(showFirstFaq.getAttribute("aria-expanded"), "true");
		test.info("First FAQs is expanded");
		logger.info("First FAQs is expanded");
		click(showFirstFaq);
		Wait(2000);
		Assert.assertEquals(showFirstFaq.getAttribute("aria-expanded"), "false");
		test.info("First FAQs is minimized");
		logger.info("First FAQs is minimized");
	}

	
	
	
	@Step
	public void videoPlayValidation() throws Exception{
		
		waitForPageLoad();
		test.info("Verifying Video play details ...................");
		try {
		waitUntilVisible(closePopupBtn);
		click(closePopupBtn);
		}
		 catch (Exception e) {
				// TODO: handle exception
			 System.out.println("Popup is not displayed");
			}
		
		JavascriptExecutor js = (JavascriptExecutor) driver_rw;
		WebElement elm=driver_rw.findElement(By.id("skipto-main"));
		WebElement VP=elm.findElement(By.className("video-container"));
		
		//Click on Playbutton
		VP.findElement(By.xpath("//div[contains(@class,'play-overlay')]/div")).click();
		Thread.sleep(3000);
		
		 //Switch to Frame using id of the frame
        driver_rw.switchTo().frame("video-embed-1_ifp");
        Thread.sleep(3000);
        
        Actions actions = new Actions(driver_rw);
		actions.moveToElement(driver_rw.findElement(By.cssSelector(".controlBarContainer"))).build().perform();
		
		Thread.sleep(3000);
		 
		WebElement newElm=driver_rw.findElement(By.cssSelector(".controlsContainer"));
		
		newElm.findElement(By.cssSelector(".btn.icon-expand.comp")).click();
		
		String pauseTime=newElm.findElement(By.cssSelector(".timers.comp.currentTimeLabel.display-high")).getText();
		
		Thread.sleep(2000);
		actions.moveToElement(driver_rw.findElement(By.cssSelector(".controlsContainer"))).build().perform();
		Thread.sleep(8000);
		
		String fullScreenPauseTime=newElm.findElement(By.cssSelector(".timers.comp.currentTimeLabel.display-high")).getText();
		System.out.println(fullScreenPauseTime+" full Screenpause");
       		
		newElm.findElement(By.cssSelector(".btn.comp.playPauseBtn")).click();
		System.out.println(newElm.findElement(By.cssSelector(".btn.comp.fullScreenBtn")).getAttribute("title"));
		
		if(newElm.findElement(By.cssSelector(".btn.comp.fullScreenBtn")).getAttribute("title").equalsIgnoreCase("Exit full screen")) {
			System.out.println("Screen Expanded to full screen Mode");
			newElm.findElement(By.cssSelector(".btn.comp.fullScreenBtn")).click();
		}
		
		boolean flag=false;
		
		if(!(pauseTime==fullScreenPauseTime)) {
			System.out.println("Pass Video is played");
			flag =true;
		}else {
			flag=false;
		}
		
		Assert.assertTrue(flag, "both are not equal");
		test.info("Video start time - "+pauseTime+" - Current time - "+fullScreenPauseTime);
		test.info("Video is playing");
    }
	
	
	
	
	
	
	
	
	
	
	
	
}
