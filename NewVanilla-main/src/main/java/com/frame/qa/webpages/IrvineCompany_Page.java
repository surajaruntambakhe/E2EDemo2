package com.frame.qa.webpages;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

//import org.apache.log4j.Logger;
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

import com.epam.reportportal.annotations.Step;
import com.frame.qa.wrappers.BaseMethod;

public class IrvineCompany_Page extends BaseMethod{


	@FindBy(id = "bergerMenu")
	WebElement menuLink;
	
	@FindBy(css=".nav.nav--mounted")
	WebElement navheader;
	
	@FindBy(css=".header-container")
	WebElement icoNavHeader;
	
	@FindBy(css=".apts-flyout__body")
	WebElement scheduleTourSection;
	
	@FindBy(xpath="//label[@for='first-name-field']/../input")
	WebElement firstNameField;
	
	@FindBy(xpath="//label[@for='last-name-field']/../input")
	WebElement lastNameField;

	@FindBy(xpath="//label[@for='email-field']/../input")
	WebElement emailField;

	@FindBy(xpath="//label[@for='phone-field']/../input")
	WebElement phoneNumberField;
	
	@FindBy(css=".prev")
	WebElement CAL_PREVIOUS_BUTTON;
	
	@FindBy(css=".next")
	WebElement CAL_NEXT_BUTTON;
	
	@FindBy(xpath="//label[contains(text(),'Move In Date')]")
	WebElement moveInDate;
	
	@FindBy(xpath="//label[contains(text(),'Tour Date')]")
	WebElement tourDate;
	
	@FindBy(id="sticky-header")
	WebElement stickyHeader;
	
	@FindBy(id="gallery")
	WebElement galleryObj;
	
	@FindBy(xpath="//button[@title='Close full view']")
	WebElement closeFullView;
	
	@FindBy(css = ".availabilities-viewer")
	WebElement availabilitesSection;
	
	//label[contains(text(),'Tour Date')]
	
	
	
//	public static final String CAL_PREVIOUS_BUTTON = "//button[contains(@class,'MuiPickersCalendarHeader-iconButton')][1]";
//	public static final String CAL_NEXT_BUTTON = "//button[contains(@class,'MuiPickersCalendarHeader-iconButton')][2]";
	
	
	//suraj
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
	
	public IrvineCompany_Page() {
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
	
	
	

	
	public void fillDetailsForm() throws Exception {
		firstNameField.sendKeys("testFirstName");
		lastNameField.sendKeys("testLastName");
		emailField.sendKeys("testabc@gmail.com");
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver_rw; 
		Thread.sleep(2000);
		jsExecutor.executeScript("arguments[0].value='123.345.5667'", phoneNumberField);
		
		selectDropDownValue("Tour Type","Self-Guided Tour");
		selectDateFromDatePicker(moveInDate, "15-June-2023");
		selectDropDownValue("Desired Floor Plan","1 bedroom");
		selectDropDownValue("Desired Floor Level","MIDDLE");
		selectDropDownValue("Pets","CAT");
		
		selectDateFromDatePicker(tourDate, "20-April-2023");
		
		Thread.sleep(2000);
		
		selectDropDownValue("Tour Time","10:30 AM");
		
		Thread.sleep(2000);
		
		driver_rw.findElement(By.xpath("//button[contains(@class,'schedule-btn')]")).click();
		
	}
	
	public void selectDropDownValue(String dropdown,String value) throws InterruptedException {
		WebElement element=driver_rw.findElement(By.xpath("//label[contains(text(),'"+dropdown+"')]//..//following-sibling::div[contains(@class,'nice-select')]"));
		element.click();
		List<WebElement> dropdownValues = element.findElement(By.cssSelector(".list")).findElements(By.tagName("li"));
		for (WebElement we : dropdownValues) {
				if (we.getText().trim().equalsIgnoreCase(value.trim())) {
					we.click();
					Thread.sleep(1000);
					break;

			}
		}
	}
	
	public void selectDateFromDatePicker(WebElement calanderObj, String calDate){
		String functionName="";
		try{
			//calDate="15-June-2023";
			String regex = "^0+(?!$)";
			String date=calDate;
			String dateMonthYear[]=date.split("-");
			String day=dateMonthYear[0].replaceAll(regex, "");
			String month=dateMonthYear[1];
			int actyear=Integer.parseInt(dateMonthYear[2]);
			int expyear;
			int expMonth;
			String calyear[]=null;
			calanderObj.click();
			WebElement dateContainerObj=driver_rw.findElement(By.xpath("//div[contains(@class,'datepicker datepicker-dropdown dropdown-menu')]"));
			String monthYear;
			
			while(true) {
				monthYear=dateContainerObj.findElement(By.cssSelector(".datepicker-switch")).getText();
				calyear = monthYear.split(" ");
				expyear = Integer.parseInt(calyear[1]); 
					 if(actyear<expyear){
						 CAL_PREVIOUS_BUTTON.click();
					 }else if (actyear>expyear){
						 CAL_NEXT_BUTTON.click();
					 }else if (actyear==expyear){
						 break;
					 }
	        }
			
			
			int actMonth=Month.valueOf(month.toUpperCase()).getValue();
			
			while(true) {
				monthYear=dateContainerObj.findElement(By.cssSelector(".datepicker-switch")).getText();
				String calmonth[]=monthYear.split(" ");
				expMonth=Month.valueOf(calmonth[0].toUpperCase()).getValue();
				 if(actMonth<expMonth){
					 CAL_PREVIOUS_BUTTON.click();
				 }else if (actMonth>expMonth){
					 CAL_NEXT_BUTTON.click();
				 }else if (actMonth==expMonth){
					 break;
				 }
				
			
			}
			
			List<WebElement> listofDays=dateContainerObj.findElement(By.xpath("//table[contains(@class,'table-condensed')]")).
					findElements(By.xpath("//tbody/tr/td[@class='day' or @class='today day'] "));
			
			for (WebElement value  : listofDays) {
				if(value.getText().equals(day)){
					value.click();
					break;
				}
				
			}
			
			
		}catch(Throwable t){
			
		}
	}
	
	
	public void selectDate() throws Exception{
		WebElement dateElement=driver_rw.findElement(By.xpath("//label[contains(text(),'Desired Move In Date')]"));
		dateElement.click();
		String date="04-15-2023";
		
		String[] newdateformat=date.split("-");
		
		
		System.out.println(newdateformat[1]);
		System.out.println(newdateformat[2]);
		System.out.println(newdateformat[3]);
		
		Month month = Month.of(Integer.parseInt(newdateformat[1]));

		// Get the full month name as a string
		String monthName = month.getDisplayName(TextStyle.FULL, Locale.getDefault());

		// Print the full month name
		System.out.println(monthName);
		
		WebElement elmCalander=driver_rw.findElement(By.cssSelector(".datepicker.datepicker-dropdown.dropdown-menu"));
		
		System.out.println(elmCalander.findElement(By.cssSelector(".datepicker-days")).findElement(By.cssSelector(".table-condensed"))
				.findElement(By.tagName("tr")).findElement(By.cssSelector(".datepicker-switch")).getText());
		
	}
	

	
	public void clickOnSearchIcon() throws Exception {
		navheader.findElement(By.cssSelector(".page-search-cta")).click();
		if(driver_rw.findElement(By.cssSelector(".page-search.page-search--mounted.page-search--show")).isDisplayed()) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
				
	}
	
	public void enterSearchCriteria() throws Exception {
		WebElement search=driver_rw.findElement(By.cssSelector(".search-input__wrapper")).findElement(By.tagName("input"));
		search.sendKeys("Irvine");
		Thread.sleep(3000);
		if(driver_rw.findElement(By.cssSelector(".dropdown__body.search-input__dropdown__body")).findElement(By.cssSelector(".predictive-results")).isDisplayed()) {
			List<WebElement>communtiesList=driver_rw.findElements(By.xpath("//div[contains(text(),'COMMUNITIES')]//../parent::ul//a/span[@class='predictive-results__link-text']"));
			for(WebElement commnuties:communtiesList) {
				if(commnuties.getText().trim().equalsIgnoreCase("Centerpointe at Irvine Spectrum")) {
					commnuties.click();
					Thread.sleep(3000);
					break;
					
				}
			}
			
		}
		
				
	}
	
	public void clickScheduleTourButton() throws Exception {
		driver_rw.findElement(By.xpath("//div/a[contains(text(),'Schedule a tour')]")).click();
		Thread.sleep(3000);
		waitUntilVisible(scheduleTourSection);
		if(scheduleTourSection.findElement(By.tagName("h2")).getText().equalsIgnoreCase("Schedule a Tour")) {
			System.out.println(scheduleTourSection.findElement(By.tagName("h2")).getText()+" is displayed--------Pass");
		}else {
			System.out.println(scheduleTourSection.findElement(By.tagName("h2")).getText()+" is not displayed--------Fail");
		}
	}
	
	
	public void navigatetoMenu(String Menu,String subMenu) throws Exception {
		WebElement nav=navheader.findElement(By.cssSelector(".menu__list")).findElement(By.cssSelector(".menu__list__item__link__text.menu__list__item__link__text--uppercase"));
		Actions actions = new Actions(driver_rw);
		actions.moveToElement(nav).build().perform();
		
		WebElement locationMenu=driver_rw.findElement(By.xpath("//span[text()='"+Menu+"']/parent::a[@target]/following-sibling::div[@class='menu__list__submenu']//ul"));
		List<WebElement> locationSubMenu=locationMenu.findElements(By.cssSelector(".menu__list__item--locations"));
		
		for(WebElement subMenuObj:locationSubMenu) {
			if(subMenuObj.findElement(By.tagName("a")).findElement(By.tagName("span")).getText().equalsIgnoreCase(subMenu)) {
				subMenuObj.findElement(By.tagName("a")).findElement(By.tagName("span")).click();
				Thread.sleep(2000);
				break;
			}
			
		}
				
	}
	
	
	public void getCommunitiesCount() throws Exception{
		Thread.sleep(2000);
		WebElement mapObj=driver_rw.findElement(By.xpath("//div[@class='search-results__container__map']"));
		List<WebElement>locCount=mapObj.findElements(By.xpath("//div[@title]"));
		int abc=0;
		int xyz=0;
		int cnt=0;
		for(WebElement elm:locCount) {
		try {
			xyz=Integer.parseInt(elm.findElement(By.tagName("span")).getText());
			abc=abc+xyz;
			} catch (Exception e) {
				cnt=1;
				abc=abc+cnt;
			}
		}
		
		System.out.println(abc);
		
	}
	
	public void clickOnMarkerIcon() throws Exception{
		Thread.sleep(2000);
		WebElement mapObj=driver_rw.findElement(By.xpath("//div[@class='search-results__container__map']"));
		List<WebElement>locCount=mapObj.findElements(By.xpath("//div[@title]"));
		Actions actions = new Actions(driver_rw);
		JavascriptExecutor js = (JavascriptExecutor) driver_rw;
		for(WebElement elm:locCount) {
		try {
				Integer.parseInt(elm.findElement(By.tagName("span")).getText());
			} catch (Exception e) {
				js.executeScript("arguments[0].click();", elm.findElement(By.tagName("img")));
				Thread.sleep(2000);
				WebElement cardSection=driver_rw.findElement(By.xpath("//div[@id='custom__infobox__inner']"));
				cardSection.findElement(By.cssSelector(".search-result-item-card__cta-container.search-result-item-card__cta-container--bottom")).click();
				break;
			}
		}
		
	}
	
	public void headerMenu() throws Exception{
		WebElement headerLink=stickyHeader.findElement(By.cssSelector(".sticky-header__links-wrap"));
		List<WebElement> headersList=headerLink.findElements(By.tagName("a"));
		for(WebElement headers:headersList) {
			if(headers.findElement(By.tagName("span")).getText().equalsIgnoreCase("PHOTOS & VIDEOS")) {
				headers.click();
				break;
			}
		}
		
		Thread.sleep(2000);
				
	}
	
	
	public WebElement galleryModes(String viewType) throws Exception{
		WebElement elm=galleryObj.findElement(By.cssSelector(".gallery-nav__modes"));
		WebElement view=null;
		  switch (viewType.trim().toUpperCase()) {
		  case "LIST VIEW":
			  elm.findElement(By.cssSelector(".apts-icon.apts-icon-swipe")).click();
			  if(galleryObj.findElement(By.cssSelector(".gallery.gallery--slide")).isDisplayed()) {
				  view=galleryObj.findElement(By.cssSelector(".gallery.gallery--slide"));
				  System.out.println("Select list view is displayed");
				  break;
			  }
		  case "GRID VIEW":
			  elm.findElement(By.cssSelector(".apts-icon.apts-icon-grid")).click();
			  if(galleryObj.findElement(By.cssSelector(".gallery.gallery--grid")).isDisplayed()) {
				  view=galleryObj.findElement(By.cssSelector(".gallery.gallery--grid"));
				  System.out.println("Selected Grid view is displayed");
				  break;
			  }
			  
		  }
		return view;
		  
	}
	
	public void isImagesLoaded(String viewType) throws Exception{
		JavascriptExecutor js = (JavascriptExecutor) driver_rw;
		WebElement imgLoad=galleryModes(viewType);
		List <WebElement> images=imgLoad.findElements(By.xpath("//div[@data-asset-type='image']//div[@class='gallery-asset__img-container']//img"));
		for(WebElement img:images) {
			Thread.sleep(200);
			if(!(img.getAttribute("data-src").equalsIgnoreCase("undefined"))) {
				Actions actions = new Actions(driver_rw);
				actions.moveToElement(img).build().perform();
					img.findElement(By.xpath("//span[@class='gallery-asset__cta btn btn-circular-with-icon']/span")).click();
					Thread.sleep(2000);
					if(closeFullView.isDisplayed()) {
						System.out.println("Image is displayed in Full Screen Mode");
						closeFullView.click();
						break;
					}
					
			}else {
				System.out.println("Failed to load Images");
			}
		}
		
	}
	
	public void clickElementByJavaScriptExecutor(WebElement w) {
		JavascriptExecutor js = (JavascriptExecutor) driver_rw;
		js.executeScript("arguments[0].click();", w);
	}
	
	@Step
	public void ICOclickOnSearchIcon() throws Exception {
		icoNavHeader.findElement(By.cssSelector(".search-cta")).click();
		if(driver_rw.findElement(By.cssSelector(".flyout-right-side-container.flown")).isDisplayed()) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		logger.info("Clicked on Search Icon");
		
				
	}
	
	
	public void clickAdvacedSearchButton() throws Exception {
		driver_rw.findElement(By.xpath("//div/a[contains(text(),'Go to Advanced Search')]")).click();
		if(driver_rw.findElement(By.xpath("//div[contains(@id,'adv-search')]")).isDisplayed()) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
				
	}
	
	@Step
	public void advSearchForm() throws Exception{
		String subMarket="Airport Area;Newport Center";
		WebElement searchForm=driver_rw.findElement(By.cssSelector(".adv-search__form__body"));
		List<WebElement>marketMenu=searchForm.findElements(By.xpath("//input[@name='market']//../ancestor::div[@class='adv-search__form__division__section__list']//label"));
		for(WebElement market:marketMenu) {
			if(market.getText().equalsIgnoreCase("ORANGE COUNTY")) {
				market.click();
				String subMarketList[]=subMarket.split(";");
				//selectSubmarket
				for(int j=0;j<=subMarketList.length-1;j++){
					List<WebElement> subMarkets=searchForm.findElements(By.xpath("//h5[contains(text(),'Sub-market')]//..//div[@class='adv-search__form__division__section__list']//label"));
					for(WebElement sub:subMarkets) {
						if(sub.getText().toUpperCase().trim().contains(subMarketList[j].toUpperCase().trim())) {
							sub.click();
							break;
						}
					}
				}		
				break;
			}
		}
		
		
	}
	
	public void changeView(String viewType) throws Exception{
		List<WebElement> views=availabilitesSection.findElements(By.xpath("//div[@class='availabilities-viewer__tabs__trigger']/ul/li/button"));
		for(WebElement tabs:views) {
			if(viewType.toUpperCase().trim().equalsIgnoreCase(tabs.getAttribute("aria-label").toUpperCase().trim())) {
				tabs.click();
				  switch (viewType.trim().toUpperCase()) {
				  case "LIST VIEW":
					  if( availabilitesSection.findElement(By.xpath("//div[@class='availabilities-viewer__tabs__item list-view']")).isDisplayed()) {
						  System.out.println("list View is displayed");
						  break;
					  }
				  case "GROUP VIEW":
					  if( availabilitesSection.findElement(By.xpath("//div[@class='availabilities-viewer__tabs__item group-view']")).isDisplayed()) {
						  System.out.println("Group View is displayed");
						  break;
					  }
				  case "MAP VIEW":
					  if( availabilitesSection.findElement(By.xpath("//div[@class='v2-availabilities__map__loader']")).isDisplayed()) {
						  System.out.println("Map View is displayed");
						  break;
					  }	  
					  
					  
				  }
				break;
			}
		}
	}
	
	public void searchFilterResults() throws Exception{
		String filterSearch="Airport Area;Newport Center";
		List<WebElement> searchResults=availabilitesSection.findElement(By.cssSelector(".availabilities-viewer__group-view__wrapper"))
				.findElements(By.cssSelector(".availabilities-viewer__group-view__item"));
		for(WebElement results:searchResults) {
			String market=results.findElement(By.cssSelector(".availabilities-viewer__group-view__item__content")).findElement(By.tagName("ul")).findElement(By.cssSelector(".left-panel.sub-market")).findElement(By.cssSelector(".detail-content")).getText();
			String subMarketList[]=filterSearch.split(";");
			
			for(int i=0;i<=subMarketList.length-1;i++) {
				if(market.toUpperCase().trim().contains(subMarketList[i].toUpperCase().trim())) {
					System.out.println("Filtered Results are displayed");
				}
			}
			
		}
				
	
		
	}
	
	public void resultsPage() throws Exception{
		List<WebElement> sideRail=driver_rw.findElements(By.xpath("//div[@class='v2-availabilities__map__side-rail__results__list__item' and not(@style='display: none;')]//button"));
		for(WebElement availibityButton:sideRail) {
			availibityButton.click();
			break;
		}
		
		if(driver_rw.findElement(By.xpath("//div[@class='availabilities-table modifier--is-group-panel-table']")).isDisplayed()) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
	}
	
	public void clickDetails() throws Exception{
		WebElement tableContainer=driver_rw.findElement(By.cssSelector(".availabilities-viewer__group-view__table-container"));
		List<WebElement>tableElements=tableContainer.findElements(By.cssSelector(".availabilities-table__body__wrapper"));
		for(WebElement tabEle:tableElements) {
			tabEle.findElement(By.xpath("//button[@aria-label='Expand Suite']")).click();
			break;
		}
		
		if(driver_rw.findElement(By.cssSelector(".suite-details")).isDisplayed()) {
			System.out.println("suite section is displayed");
			driver_rw.findElement(By.cssSelector(".btn-circular-with-icon--red.icon-minus")).click();
			
		}else {
			System.out.println("Failed to display suite section on clicking Expand Button");
		}
		
	}
	
}
