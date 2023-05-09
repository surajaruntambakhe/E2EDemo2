package com.frame.qa.sampleTestcases;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.frame.qa.base.TestBase;
import com.frame.qa.utils.Excel;
import com.frame.qa.utils.TestUtil;
import com.frame.qa.webpages.BooksAndMusicPage;
import com.frame.qa.webpages.IM_Page;
import com.frame.qa.webpages.StoreCartPage;
import com.frame.qa.webpages.StoreHomePage;

public class IM_Test extends TestBase {
	IM_Page imPage;
	public static Map<String, String> excelTestData = new LinkedHashMap<String, String>();


	public IM_Test() {
		super();
	}

	@BeforeMethod
	public synchronized void setUp() {
		imPage=new IM_Page();
	}

	

	@Test(priority = 1)
	public synchronized void accordianTest() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		String methodName = new IM_Test() {
		}.getClass().getEnclosingMethod().getName();
		excelTestData = Excel.testdataaccess(methodName, "IMTest");
		
		imPage.verifyAccordian(excelTestData);

	}

	/*
	@Test(priority = 2)
	public synchronized void tabsTest() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		imPage.verifyTabs();

	}

	@Test(priority = 3)
	public synchronized void teaserTest() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		imPage.verifyTeaser();

	}

	@Test(priority = 4)
	public synchronized void textTest() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		imPage.verifyText();

	}

	@Test(priority = 5)
	public synchronized void imageTest() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		imPage.verifyImage();

	}

	@Test(priority = 6)
	public synchronized void formContainersTest() throws Exception {
		test.assignAuthor("Suraj").assignCategory("Smoke");
		imPage.verifyFormContainer();

	}
*/
	
	
	
	
	
	
//	@Test(priority = 0)
	//	public synchronized void testDataTest() throws Exception {
	//		test.assignAuthor("Suraj").assignCategory("Smoke");
	//		
	//		String methodName = new IM_Test() {
	//		}.getClass().getEnclosingMethod().getName();
	//		
	//		excelTestData = Excel.testdataaccess(methodName, "IMTest");
	//		
	//		System.out.println("***************************UserID"+excelTestData.get("userid"));
	//		System.out.println("***************************Password"+excelTestData.get("password"));
	//		
	//		
	//	//	imPage.verifyTabs();
	//		
	//	}

}
