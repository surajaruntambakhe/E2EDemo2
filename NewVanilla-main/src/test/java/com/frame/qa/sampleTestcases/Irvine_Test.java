package com.frame.qa.sampleTestcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.frame.qa.base.TestBase;
import com.frame.qa.webpages.Irvine_Page;
import com.frame.qa.webpages.KTtask_BergerPaints_Page;

public class Irvine_Test extends TestBase{

	Irvine_Page page;
	public Irvine_Test() {
		super();
	}

	@BeforeMethod
	public synchronized void setUp() {
		page=new Irvine_Page();
	}
	
	@Test(priority = 1)
	public synchronized void favoritesTest() throws Exception {
		//test.assignAuthor("Suraj").assignCategory("Smoke");
		page.verifyFavorites();
	}
}
