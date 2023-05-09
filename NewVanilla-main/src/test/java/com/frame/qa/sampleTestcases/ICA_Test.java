package com.frame.qa.sampleTestcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.frame.qa.base.TestBase;
import com.frame.qa.utils.Excel;
import com.frame.qa.webpages.HBSO_Page;
import com.frame.qa.webpages.IM_Page;
import com.frame.qa.webpages.IrvineCompany_Page;

public class ICA_Test extends TestBase {

	IrvineCompany_Page page;

	public ICA_Test() {
		super();
	}

	@BeforeMethod
	public synchronized void setUp() {
		page = new IrvineCompany_Page();
	}

	
	  @Test(priority = 1) 
	  public synchronized void icoTest1() throws Exception {
	  test.assignAuthor("Srikanth").assignCategory("Smoke");
	  page.clickOnSearchIcon(); 
	  page.enterSearchCriteria();
	  page.clickScheduleTourButton(); 
	  page.fillDetailsForm(); }
	 

	  @Test(priority = 2) 
	  public synchronized void ica_TC01() throws Exception {
	  test.assignAuthor("Srikanth").
	  assignCategory("Smoke");
	  page.navigatetoMenu("Orange County","Irvine"); 
	  page.getCommunitiesCount();
	  page.clickOnMarkerIcon(); 
	  page.headerMenu();
	  page.isImagesLoaded("GRID VIEW"); 
	  page.clickScheduleTourButton();
	  page.fillDetailsForm();
	  
	  }
	 
		 
	 
	  
	  
	  
	  
	  
		 
	/*
	@Test(priority = 3)
	public synchronized void ico_TC02() throws Exception {
		test.assignAuthor("Srikanth").assignCategory("Smoke");
		 page.ICOclickOnSearchIcon(); 
		 page.clickAdvacedSearchButton();
		 page.advSearchForm();
		 page.changeView("LIST VIEW");
		 page.changeView("GROUP VIEW");
		 page.searchFilterResults();
		 page.changeView("MAP VIEW");
		 page.resultsPage();
		 page.clickDetails();

	}
*/
}
