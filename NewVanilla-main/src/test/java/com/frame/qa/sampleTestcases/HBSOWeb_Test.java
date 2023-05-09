package com.frame.qa.sampleTestcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.frame.qa.base.TestBase;
import com.frame.qa.webpages.HBSO_Page;

public class HBSOWeb_Test extends TestBase{

	HBSO_Page page;

	public HBSOWeb_Test() {
		super();
	}


	@BeforeMethod
	public synchronized void setUp() {
		page=new HBSO_Page();
	}

	@Test(priority = 1)
	public synchronized void courseDetailsTest() throws Exception {
		//test.assignAuthor("Suraj").assignCategory("Smoke");
		page.demo1();
	}

	/*
	@Test(priority = 1)
	public synchronized void courseDetailsTest() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		page.checkCourseDetails();

	}
	
	//@Test(priority = 2)
	public synchronized void videoPlayValidationTest() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		page.videoPlayValidation();

	}
	
	//@Test(priority = 3)
	public synchronized void chatBotTest() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		page.chatBotVerification();

	}
	
	*/
	
	
	
	//-------------------------------------------------------------------
	/*
	
	@Test(priority = 4)
	public synchronized void courseDetailsTest1() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		page.checkCourseDetails1();

	}
	
	@Test(priority = 5)
	public synchronized void videoPlayValidationTest1() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		page.videoPlayValidation1();

	}
	
	@Test(priority = 6)
	public synchronized void chatBotTest1() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		page.chatBotVerification1();

	}
	
	/*
	
	@Test(priority = 7)
	public synchronized void secondCourseDetailsTest() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		page.checkSecondCourseDetails();

	}
	
	@Test(priority = 8)
	public synchronized void thirdCourseDetailsTest() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		page.checkThirdCourseDetails();

	}
	
	@Test(priority = 9)
	public synchronized void fourthCourseDetailsTest() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		page.checkFourthCourseDetails();

	}

	
	@Test(priority = 10)
	public synchronized void mobileViewTest() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		page.mobileView1();

	}
	
	@Test(priority = 11)
	public synchronized void verifyPopupTest() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		page.verifyPopup();

	}

	@Test(priority = 12)
	public synchronized void verifyinfoTest() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		page.verifyInfo();

	}
	
	@Test(priority = 13)
	public synchronized void parallelVerification() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		page.parallelTest();

	}
	
	
	
	@Test(priority = 14)
	public synchronized void courseDetailsTest2() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		page.checkCourseDetails2();

	}
	
	@Test(priority = 15)
	public synchronized void videoPlayValidationTest2() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		page.videoPlayValidation2();

	}
	
	@Test(priority = 16)
	public synchronized void chatBotTest2() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		page.chatBotVerification2();

	}
	
	
	
	@Test(priority = 17)
	public synchronized void secondCourseDetailsTest2() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		page.checkSecondCourseDetails2();

	}
	
	@Test(priority = 18)
	public synchronized void thirdCourseDetailsTest2() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		page.checkThirdCourseDetails2();

	}
	
	@Test(priority = 19)
	public synchronized void fourthCourseDetailsTest2() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		page.checkFourthCourseDetails2();

	}

	
	@Test(priority = 20)
	public synchronized void mobileViewTest2() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		page.mobileView2();

	}
	
	@Test(priority = 21)
	public synchronized void verifyPopupTest2() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		page.verifyPopup2();

	}

	@Test(priority = 22)
	public synchronized void verifyinfoTest2() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		page.verifyInfo2();

	}
	
	@Test(priority = 23)
	public synchronized void parallelVerification2() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		page.parallelTest2();

	}
	
	*/
	
	
	
	/*
	@Test
	public synchronized void chatBotTest2() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		page.checkCourseDetails22();

	}
	
	@Test
	public synchronized void chatBotTest3() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		page.checkCourseDetails22();

	}
	
	@Test
	public synchronized void chatBotTest4() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		page.checkCourseDetails22();

	}
	
	@Test
	public synchronized void chatBotTest5() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		page.checkCourseDetails22();

	}
	
	@Test
	public synchronized void chatBotTest6() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		page.checkCourseDetails22();

	}
	
	@Test
	public synchronized void chatBotTest7() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		page.checkCourseDetails22();

	}
	
	@Test
	public synchronized void chatBotTest8() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		page.checkCourseDetails22();

	}
	
	@Test
	public synchronized void chatBotTest9() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		page.checkCourseDetails22();

	}
	
	@Test
	public synchronized void chatBotTest10() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		page.checkCourseDetails22();

	}
	
	@Test
	public synchronized void chatBotTest11() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		page.checkCourseDetails22();

	}
	*/
		
}
