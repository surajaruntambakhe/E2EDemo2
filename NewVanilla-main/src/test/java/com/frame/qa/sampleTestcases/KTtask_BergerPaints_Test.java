package com.frame.qa.sampleTestcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.frame.qa.base.TestBase;
import com.frame.qa.webpages.IM_Page;
import com.frame.qa.webpages.KTtask_BergerPaints_Page;

public class KTtask_BergerPaints_Test extends TestBase{

	KTtask_BergerPaints_Page page;
	public KTtask_BergerPaints_Test() {
		super();
	}

	@BeforeMethod
	public synchronized void setUp() {
		page=new KTtask_BergerPaints_Page();
	}
	
	//@Test(priority = 1)
	public synchronized void virtualPainterTest() throws Exception {
		//test.assignAuthor("Suraj").assignCategory("Smoke");
		page.verifyVertualPainter();
	}
	
	//@Test(priority = 2)
	public synchronized void paintCalculatorTest() throws Exception {
		//test.assignAuthor("Suraj").assignCategory("Smoke");
		page.verifyPaintCalculator();
	}
	
	//@Test(priority = 3)
	public synchronized void videoVerificationTest() throws Exception {
		//test.assignAuthor("Suraj").assignCategory("Smoke");
		page.videoVerification();
	}
	
	@Test(priority = 4)
	public synchronized void mobileViewTest() throws Exception {
		//test.assignAuthor("Suraj").assignCategory("Smoke");
		page.mobileView_ColourCatalogueVerification();
	}
	
	

}
