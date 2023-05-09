package com.frame.qa.sampleTestcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.frame.qa.base.TestBase;
import com.frame.qa.utils.Excel;
import com.frame.qa.webpages.HBSO_Page;
import com.frame.qa.webpages.IM_Page;
import com.frame.qa.webpages.IrvineCompany_Page;

public class ICO_Test extends TestBase {

	IrvineCompany_Page page;

	public ICO_Test() {
		super();
	}

	@BeforeMethod
	public synchronized void setUp() {
		page = new IrvineCompany_Page();
	}

	
	//@Test(priority = 1)
	public synchronized void ico_TC01() throws Exception {
		//test.assignAuthor("Suraj").assignCategory("Smoke");
		page.verifyFavorites();
	}
	
	@Test(priority = 2)
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
	
	

}
