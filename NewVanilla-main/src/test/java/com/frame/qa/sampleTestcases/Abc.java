package com.frame.qa.sampleTestcases;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

public class Abc {


	public static void main(String[] args) throws IOException, ParseException {

		//System.out.println(System.getProperty("user.dir"));
		//			
		//			File f=new File("pom.xml");
		//			System.out.println(f.getCanonicalPath());




		// System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		//  WebDriverManager.chromedriver().setup();
		//			  driver.close();

		//		 ChromeDriver  driver = new ChromeDriver();
		//			 DevTools devTools = driver.getDevTools();
		//			driver.get("https://www.amazon.in/");
		//			driver.manage().window().maximize();

		//		LocalDate date=LocalDate.now().plus(Period.ofDays(2));
		//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
		//        String sd=formatter.format(date);
		//        System.out.println(sd);
		//        
		//		System.out.println(date);
		//		String d=date.toString();
		//		
		//		SimpleDateFormat dt = new SimpleDateFormat("yyyyy-mmmmm-dd"); 
		//		Date date1 = dt.parse(d); 
		//		//System.out.println(date1);
		//		SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-mmmmm-dd");
		//		System.out.println(dt1.format(date1));
		//		
		//	System.out.println(d);

		LocalDate dt = LocalDate.parse("2018-12-01");
		System.out.println(dt);
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("d MMMM");
		String sd1=formatter1.format(dt);
		System.out.println(sd1);
		String[] da=sd1.split(" ");
		System.out.println(da[0]);
		System.out.println(da[1]);
		
	}



}
