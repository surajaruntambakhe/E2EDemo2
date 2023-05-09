package com.frame.qa.webpages;

import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.frame.qa.utils.Excel;
import com.frame.qa.utils.TestUtil;
import com.frame.qa.wrappers.BaseMethod;

import io.appium.java_client.ScreenshotState.ScreenshotComparisonError;

public class IM_Page extends BaseMethod{

	@FindBy(xpath = "(//span[text()='Informa'])[1]")
	WebElement infarmaLogo;

	@FindBy(xpath = "(//*[@id=\"qa\"]/div/div/h2/span)[1]")
	WebElement firstAccordian;

	@FindBy(xpath = "(//*[@id=\"qa\"]/div/div/h2/span)[2]")
	WebElement secondAccordian;

	@FindBy(xpath = "(//li[@role='tab'])[1]")
	WebElement tab1;

	@FindBy(xpath = "//button[@class='close-banner']")
	WebElement closedAdvrtBtn;

	@FindBy(xpath = "//h2[@class='cmp-teaser__title']")
	WebElement teaserTitle;

	@FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[4]")
	WebElement mobilelnk;

	@FindBy(xpath = "/html/body/div[2]/div/div[3]/div/div/div[2]/div/div/div/div[4]/div/h1")
	WebElement textElement;

	@FindBy(xpath = "//div[@class=\"cmp-image__modal modal fade\"]/parent::div/img")
	WebElement imageContents;
	@FindBy(xpath = "//input[@name='personalemail']")
	WebElement emailTxt;
	@FindBy(xpath = "//input[@name='firstname']")
	WebElement firstNameTxt;
	@FindBy(xpath = "//input[@name='surname']")
	WebElement lastNameTxt;
	@FindBy(xpath = "//select[@name='countryofresidence']")
	WebElement countryOfResidenceDropdown;
	@FindBy(xpath = "//input[@name='formSubmit']")
	WebElement formSubmitBtn;
	@FindBy(xpath = "//input[@name='formReset']")
	WebElement formResetBtn;
	@FindBy(xpath = "//span[@class=\"cmp-form-container__title\"]")
	WebElement formContainerTitle;
	@FindBy(xpath = "//input[@name=\"subscriptionrelaxedcombination\"]")
	WebElement acceptPrivacyCheckBox;
	@FindBy(xpath = "(//h2[@class='cmp-title__text animated delay- out-view'])[1]")
	WebElement thankYouMsg;
	@FindBy(xpath = "//h2[text()='THANK YOU!']")
	WebElement verifyThankYoumsg;
	@FindBy(xpath = "//span[@title='I Agree']")
	WebElement acceptCookies;
	@FindBy(xpath = "//div[@data-cmp-is=\"accordion\"]")
	WebElement accordionContents;
	@FindBy(xpath = "(//a[@class=\"cmp-accordion__heading-link \"]/h4)[1]")
	WebElement firstAccordionExpand;
	@FindBy(xpath = "(//a[@class=\"cmp-accordion__heading-link \"]/h4)[2]")
	WebElement secondAccordionExpand;
	@FindBy(xpath = "//div[@class=\"cmp-tabs__tabpanel cmp-tabs__tabpanel--active\"]/div/div/p")
	WebElement currentTabContaints;
	@FindBy(xpath = "//ol[@class=\"cmp-tabs__tablist\"]/parent::div/parent::div")
	WebElement tabsContents;
	@FindBy(xpath = "//div[@class=\"cmp-teaser__image\"]/parent::div/parent::div")
	WebElement teaserContents;
	@FindBy(xpath = "//div[@class=\"cmp-teaser__image\"]/div/img")
	WebElement teaserImg;
	@FindBy(xpath = "//div[@class=\"cmp-teaser__action-container\"]/a")
	WebElement teaserDataLink;
	@FindBy(xpath = "//h1[text()='This is an Very Important Text']/parent::div/parent::div")
	WebElement textContents;
				@FindBy(xpath = "")
				WebElement womenLabel;
	//			@FindBy(xpath = "")
	//			WebElement womenLabel;
	//			@FindBy(xpath = "")
	//			WebElement womenLabel;
	//			@FindBy(xpath = "")
	//			WebElement womenLabel;
	//			@FindBy(xpath = "")
	//			WebElement womenLabel;
	//			@FindBy(xpath = "")
	//			WebElement womenLabel;
	//			@FindBy(xpath = "")
	//			WebElement womenLabel;
	//			@FindBy(xpath = "")
	//			WebElement womenLabel;
	//			@FindBy(xpath = "")
	//			WebElement womenLabel;

	public IM_Page() {
		PageFactory.initElements(driver_rw, this );
	}

	public void verifyAccordian(Map<String, String> testData) throws Exception {
		waitForPageLoad();
		waitForElementToBePresent("Element is displayed", infarmaLogo);
		isDisplayed(infarmaLogo);
		test.info("Infarma logo is displayed on the Publisher page");
		
//		TestUtil.ScreenShotToReportPortal();
//		System.out.println("RP screenshot added**********************");
		
		
		/*
		try {
			if(driver_rw.findElement(By.xpath("//button[@class='close-banner']")).isDisplayed())
			{
				click(closedAdvrtBtn);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		Wait(2000);
		try {
			if(driver_rw.findElement(By.xpath("//span[@title='I Agree']")).isDisplayed())
			{
				click(acceptCookies);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		Assert.assertTrue(accordionContents.getAttribute("class").contains("accordion"));
		test.info("The Accordion contents are visible on the Publisher page");
		test.info("Verifying the Accordion Components...................");
		if(firstAccordionExpand.getAttribute("aria-expanded").equalsIgnoreCase("false"))
		{
			click(firstAccordionExpand);
			Wait(2000);
		}
		Assert.assertEquals(firstAccordian.getText(), testData.get("accordion1"));
		test.info("The Accordion -"+firstAccordian.getText()+" -is displayed on Publisher page");
		Wait(2000);

		if(secondAccordionExpand.getAttribute("aria-expanded").equalsIgnoreCase("false"))
		{
			click(secondAccordionExpand);
			Wait(2000);
		}
		Assert.assertEquals(secondAccordian.getText(), testData.get("accordion2"));
		test.info("The Accordion -"+secondAccordian.getText()+" -is displayed on Publisher page");
		*/
		Wait(4000);
	}


	public void verifyTabs() throws Exception {
		waitForPageLoad();
		waitForElementToBePresent("Element is displayed", infarmaLogo);
		isDisplayed(infarmaLogo);
		test.info("Infarma logo is displayed on the Publisher page");
		try {
			if(driver_rw.findElement(By.xpath("//button[@class='close-banner']")).isDisplayed())
			{
				click(closedAdvrtBtn);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		Wait(2000);
		
		try {
			if(driver_rw.findElement(By.xpath("//span[@title='I Agree']")).isDisplayed())
			{
				click(acceptCookies);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		scrollDownWithCordinates(0, 500);
		Assert.assertTrue(tabsContents.getAttribute("class").contains("tabs"));
		test.info("The Tab contents are visible on the Publisher page");
		test.info("Verifying the Tab Components...................");
		List<WebElement> tabList=driver_rw.findElements(By.xpath("//li[@role='tab']"));
		Assert.assertTrue(isDisplayed(tabList));
		test.info("List of tabs is displayed");
		int count=1;
		for(WebElement tab:tabList)
		{
			click(tab);
			Assert.assertEquals(tab.getAttribute("aria-selected"), "true");
			test.info(tab.getText()+"- is displayed on the Publisher page");
			test.info("Successfully clicked on tab -"+tab.getText());
			count++;
			if(count>3)
			{
				//Wait(2000);
				Assert.assertEquals(currentTabContaints.getText(), "This is "+tab.getText());
				test.info("---- "+tab.getText()+" contains a text -"+currentTabContaints.getText());
			}
		}
		Wait(2000);
	}



	public void verifyTeaser() throws Exception {
		waitForPageLoad();
		waitForElementToBePresent("Element is displayed", infarmaLogo);
		isDisplayed(infarmaLogo);
		test.info("Infarma logo is displayed on the Publisher page");
		try {
			if(driver_rw.findElement(By.xpath("//button[@class='close-banner']")).isDisplayed())
			{
				click(closedAdvrtBtn);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		Wait(2000);
		try {
			if(driver_rw.findElement(By.xpath("//span[@title='I Agree']")).isDisplayed())
			{
				click(acceptCookies);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		Wait(1000);
		//Newly added method
		scrollDownWithCordinates(0, 500);
		Wait(1000);
		Assert.assertTrue(teaserContents.getAttribute("class").contains("teaser"));
		test.info("The Teaser contents are visible on the Publisher page");
		test.info("Verifying the Teaser Components...................");
		Assert.assertEquals(teaserTitle.getText().trim(), "Teaser");
		test.info("The Teaser Title -"+teaserTitle.getText().trim()+"- is displayed on the Publisher page");
		List<WebElement> taeserList=driver_rw.findElements(By.xpath("//div[@class=\"cmp-teaser__description\"]/h2/span"));
		String teaserText="";
		for(WebElement text:taeserList)
		{
			teaserText=teaserText+""+text.getText()+" ";
		}
		teaserText=teaserText.trim();
		Assert.assertEquals(teaserText, "This is an Teaser");
		test.info("The Teaser text -"+teaserText+"- displayed on the Publisher page");
		Assert.assertTrue(teaserImg.getAttribute("class").contains("image"));
		test.info("The Teaser Image Displayed on the publisher page");
		Assert.assertTrue((teaserDataLink.getText().equalsIgnoreCase("Data"))&&(teaserDataLink.getAttribute("class").contains("link")));
		test.info("The Teaser link -"+teaserDataLink.getText()+"- is displayed on the Publisher page");
		Wait(1000);
		click(teaserDataLink);
		Wait(4000);
	}


	public void verifyText() throws Exception {
		waitForPageLoad();
		waitForElementToBePresent("Element is displayed", infarmaLogo);
		isDisplayed(infarmaLogo);
		test.info("Infarma logo is displayed on the Publisher page");
		try {
			if(driver_rw.findElement(By.xpath("//button[@class='close-banner']")).isDisplayed())
			{
				click(closedAdvrtBtn);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		Wait(2000);
		try {
			if(driver_rw.findElement(By.xpath("//span[@title='I Agree']")).isDisplayed())
			{
				click(acceptCookies);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		Wait(1000);
		scrollDownWithCordinates(0, 600);
		Assert.assertTrue(textContents.getAttribute("class").contains("text"));
		test.info("The Text contents are visible on the Publisher page");
		test.info("Verifying the Text Components...................");
		Assert.assertEquals(textElement.getText(), "This is an Very Important Text");
		test.info("The Text -"+textElement.getText()+"- displayed on the Publisher page");
		Wait(4000);
	}

	public void verifyImage() throws Exception {
		waitForPageLoad();
		waitForElementToBePresent("Element is displayed", infarmaLogo);
		isDisplayed(infarmaLogo);
		test.info("Infarma logo is displayed on the Publisher page");
		try {
			if(driver_rw.findElement(By.xpath("//button[@class='close-banner']")).isDisplayed())
			{
				click(closedAdvrtBtn);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		Wait(2000);
		try {
			if(driver_rw.findElement(By.xpath("//span[@title='I Agree']")).isDisplayed())
			{
				click(acceptCookies);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		Wait(1000);
		scrollDownWithCordinates(0, 900);
		Assert.assertTrue(imageContents.getAttribute("class").contains("image"));
		test.info("The Image contents are visible on the Publisher page");
		test.info("Verifying the Image Components...................");
		Assert.assertTrue(imageContents.isDisplayed());
		Assert.assertTrue((imageContents.getAttribute("src").contains(".png"))||(imageContents.getAttribute("src").contains(".jpeg")));
		test.info("The Image components are displayed on the Publisher page");
		Wait(4000);

	}

	public void verifyFormContainer() throws Exception {
		waitForPageLoad();
		waitForElementToBePresent("Element is displayed", infarmaLogo);
		isDisplayed(infarmaLogo);
		test.info("Infarma logo is displayed on the Publisher page");
		try {
			if(driver_rw.findElement(By.xpath("//button[@class='close-banner']")).isDisplayed())
			{
				click(closedAdvrtBtn);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		Wait(2000);
		try {
			if(driver_rw.findElement(By.xpath("//span[@title='I Agree']")).isDisplayed())
			{
				click(acceptCookies);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		scrollDownWithCordinates(0, 1200);
		
		Assert.assertTrue(formContainerTitle.getAttribute("class").contains("form-container"));
		test.info("The form-container contents are visible on the Publisher page");
		test.info("Verifying the form-container Components...................");
		
		Assert.assertTrue(formContainerTitle.isDisplayed());
		test.info("The form container Title is displayed on the Publisher page");
		sendKeys(emailTxt, "abcd@gmail.com");
		sendKeys(firstNameTxt, "Suraj");
		//sendKeys(lastNameTxt, "xyz");	
		selectByVisibleText(countryOfResidenceDropdown, "India");
		scrollDownWithCordinates(1200, 1550);
		Wait(2000);
		JSclick(formSubmitBtn);
		try {
			//isDisplayed(verifyThankYoumsg);
			verifyThankYoumsg.isDisplayed();
			test.info("form get submitted, Without filling the mandatory fields.");
			Assert.assertTrue(false);
		} catch (Exception e) {
			test.info("Without filling the mandatory fields form is not getting submitted.");
		}
		scrollDownWithCordinates(1200, 1650);
		Wait(2000);
		JSclick(formResetBtn);
		Wait(2000);
		scrollDownWithCordinates(0, 1200);
		Wait(1000);
		sendKeys(emailTxt, "abcd@gmail.com");
		sendKeys(firstNameTxt, "Suraj");
		sendKeys(lastNameTxt, "Tam");	
		selectByVisibleText(countryOfResidenceDropdown, "India");
		Wait(3000);
		JSclick(acceptPrivacyCheckBox);
		Wait(1000);
		scrollDownWithCordinates(1200, 1650);
		Wait(1000);
		JSclick(formSubmitBtn);
		waitForPageLoad();
		Assert.assertEquals(thankYouMsg.getText(), "THANK YOU!");
		test.info("The Thank you page is displayed after submitting the form by filling all the mandatory fields");
		Wait(4000);

	}





}
