package com.frame.qa.sampleTestcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.frame.qa.base.TestBase;
import com.frame.qa.webpages.KTtask_BergerPaints_Page;
import com.frame.qa.webpages.KTtask_IrctcPage;

public class KTtask_IrctcTest extends TestBase{
	
	KTtask_IrctcPage page;
	public KTtask_IrctcTest() {
		super();
	}

	@BeforeMethod
	public synchronized void setUp() {
		page=new KTtask_IrctcPage();
	}
	
	@Test(priority = 1)
	public synchronized void virtualPainterTest() throws Exception {
		//test.assignAuthor("Suraj").assignCategory("Smoke");
		page.chatBotVerification();
	}

}
