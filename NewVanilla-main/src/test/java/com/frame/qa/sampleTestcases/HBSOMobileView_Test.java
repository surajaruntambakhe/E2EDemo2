package com.frame.qa.sampleTestcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.frame.qa.base.TestBase;
import com.frame.qa.utils.Excel;
import com.frame.qa.webpages.HBSO_Page;
import com.frame.qa.webpages.IM_Page;

public class HBSOMobileView_Test extends TestBase{

	HBSO_Page page;
	
	public HBSOMobileView_Test() {
		super();
	}
	
	
	@BeforeMethod
	public synchronized void setUp() {
		page=new HBSO_Page();
	}
	
	
	@Test(priority = 1)
	public synchronized void mobileViewTest() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		page.mobileView();

	}
}
