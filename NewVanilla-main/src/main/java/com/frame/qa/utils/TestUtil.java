package com.frame.qa.utils;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
//import org.apache.log4j.BasicConfigurator;
//import org.apache.log4j.Level;
//import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.epam.reportportal.message.ReportPortalMessage;
import com.frame.qa.base.TestBase;


public class TestUtil extends TestBase {

//	static Logger logger = Logger.getLogger(TestUtil.class.getName());
	
	
	
	public static long PAGE_LOAD_TIMEOUT = 60;
	public static long IMPLICIT_WAIT = 60;

	public static String TESTDATA_SHEET_PATH = "/Users/naveenkhunteta/Documents/workspace"
			+ "/FreeCRMTest/src/main/java/com/crm/qa/testdata/FreeCrmTestData.xlsx";

	static Workbook book;
	static Sheet sheet;
	static JavascriptExecutor js;

	
//	public static void ScreenShotToReportPortal() {
//
//		BasicConfigurator.configure(); //enough for configuring log4j
//	      
//		logger.getRootLogger().setLevel(Level.INFO); 
//		
//		
//		 ReportPortalMessage message = null;
//		    try {
//		    	TakesScreenshot ts = (TakesScreenshot)driver_rw;
//		    	File srcFile = ts.getScreenshotAs(OutputType.FILE);
//		    	java.util.Date d= new java.util.Date();
//		    	 org.apache.commons.io.FileUtils.copyFile(srcFile, new File("./ScreenShots/"+d.toString().replace(":", "_")+".png"));
//		    	String rp_message = "test message for ReportPortal*****";
//		        message = new ReportPortalMessage(srcFile, rp_message);
//		    } catch (IOException e) {
//		        e.printStackTrace();
//		    }
//		   // logger.info(message);
//		    logger.info(message.getMessage());
//		    
//	}
	
	
	public void switchToFrame() {
		driver.switchTo().frame("mainpanel");
	}

	public static Object[][] getTestData(String sheetName) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				// System.out.println(data[i][k]);
			}
		}
		return data;
	}

	public static String takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		File destFile = new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png");
		
		FileUtils.copyFile(scrFile, destFile);
		System.out.println("*****************8  " + destFile.getAbsolutePath().toString());
		return  destFile.getAbsolutePath().toString();

	}

	public  void runTimeInfo(String messageType, String message) throws InterruptedException {
		js = (JavascriptExecutor) driver;
		// Check for jQuery on the page, add it if need be
		js.executeScript("if (!window.jQuery) {"
				+ "var jquery = document.createElement('script'); jquery.type = 'text/javascript';"
				+ "jquery.src = 'https://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js';"
				+ "document.getElementsByTagName('head')[0].appendChild(jquery);" + "}");
		Thread.sleep(5000);

		// Use jQuery to add jquery-growl to the page
		js.executeScript("$.getScript('https://the-internet.herokuapp.com/js/vendor/jquery.growl.js')");

		// Use jQuery to add jquery-growl styles to the page
		js.executeScript("$('head').append('<link rel=\"stylesheet\" "
				+ "href=\"https://the-internet.herokuapp.com/css/jquery.growl.css\" " + "type=\"text/css\" />');");
		Thread.sleep(5000);

		// jquery-growl w/ no frills
		js.executeScript("$.growl({ title: 'GET', message: '/' });");
//'"+color+"'"
		if (messageType.equals("error")) {
			js.executeScript("$.growl.error({ title: 'ERROR', message: '"+message+"' });");
		}else if(messageType.equals("info")){
			js.executeScript("$.growl.notice({ title: 'Notice', message: 'your notice message goes here' });");
		}else if(messageType.equals("warning")){
			js.executeScript("$.growl.warning({ title: 'Warning!', message: 'your warning message goes here' });");
		}else
			System.out.println("no error message");
		// jquery-growl w/ colorized output
//		js.executeScript("$.growl.error({ title: 'ERROR', message: 'your error message goes here' });");
//		js.executeScript("$.growl.notice({ title: 'Notice', message: 'your notice message goes here' });");
//		js.executeScript("$.growl.warning({ title: 'Warning!', message: 'your warning message goes here' });");
		Thread.sleep(5000);
	}
	
	public static String getTestCaseFolderPath(String testType){
		return PropertyManager.getTestCaseProperty("testcase.folder.path")+testType+"\\";    	
	}

}
