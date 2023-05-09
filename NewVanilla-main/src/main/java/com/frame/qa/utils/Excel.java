package com.frame.qa.utils;



import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCreationHelper;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFHyperlink;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.POIXMLDocument;

public class Excel {

	static final Logger logger = LogManager.getLogger(Excel.class);
	static String filePath = "";
	static Workbook workbook = null;

	//Newly added
	public static Map<String, String> excelTestData = new LinkedHashMap<String, String>();
	private static FileInputStream fileInputStream;
	private static XSSFWorkbook workbookTestData;
	private static XSSFSheet worksheetTestData;
	private static Map<String, String> testData;
	private static Integer intTotalRows;
	private static XSSFSheet worksheetOutputData;
	private static XSSFRow rowHeader;
	private static XSSFRow rowCurrent;
	private static Integer intCurrentRow;
	private static Integer intTotalColumns;
	
	
	
	@SuppressWarnings("resource")
	public static Sheet getDataSheet(String fileName, String sheetName) {
		Workbook testcase = null;
		File f = null;
		Sheet testdataSheet = null;
		try {
			f = new File(Environment.getProjectDir() + fileName);
//			f = new File(System.getProperty("user.dir") + fileName);

			FileInputStream inputStream = new FileInputStream(f);

			String fileExtensionName = fileName.substring(fileName.indexOf("."));
			if (fileExtensionName.equals(".xlsx")) {
				// If it is xlsx file then create object of XSSFWorkbook class
				testcase = new XSSFWorkbook(inputStream);
			} else if (fileExtensionName.equals(".xls")) {
				// If it is xls file then create object of XSSFWorkbook class
				testcase = new HSSFWorkbook(inputStream);
			}
			filePath = Environment.getProjectDir() + fileName;
			workbook = testcase;

			testdataSheet = testcase.getSheet(sheetName.toString().trim());
		} catch (Exception e) {
			logger.error("getDataSheet : Error occured while getting data from sheet " + e);
		}
		return testdataSheet;
	}

	

	public static Object getColumnValue(Sheet sheetObj, String columnName, int rowToBeExec) {

		Sheet shtObj = sheetObj;
		String colName = columnName;
		int colNumber = 0;
		String colValue = "";
		boolean colNameExists = false;
		Integer celltype;
		Object returnVal;

		Row row = shtObj.getRow(0);

		for (int i = 0; i < row.getLastCellNum(); i++) {
			if (colName.trim().equalsIgnoreCase(row.getCell(i).getStringCellValue())) {
				colNumber = i;
				colNameExists = true;
				break;
			}
		}

		DataFormatter objDefaultFormat = new DataFormatter();
		FormulaEvaluator objFormulaEvaluator = sheetObj.getWorkbook().getCreationHelper().createFormulaEvaluator();
		Row rowNeeded = shtObj.getRow(rowToBeExec);

		if (colNameExists && rowNeeded.getCell(colNumber) != null) {
			Cell cell = rowNeeded.getCell(colNumber);
			celltype = cell.getCellType();
			objFormulaEvaluator.evaluate(cell);
			colValue = objDefaultFormat.formatCellValue(cell, objFormulaEvaluator);
		} else {
			return "";
		}
		
		switch (celltype) {
		case 0:
			returnVal = Integer.parseInt(colValue);
			break;
		case 4:
			returnVal = Boolean.parseBoolean(colValue);
			break;

		default:
			returnVal = colValue;
			break;
		}

		return returnVal;
	}
	
	// returns true if data is set successfully else false
	public static boolean setCellData(Sheet sheet,String colName,int rowNum, String data) throws Throwable{		
		Row row   = null;
		int colNum = -1;
		Cell cell = null;
		try{
			//System.out.println("A");
			row=sheet.getRow(0);
			for(int i=0;i<row.getLastCellNum();i++){
				//System.out.println(row.getCell(i).getStringCellValue().trim());
				if(row.getCell(i).getStringCellValue().trim().equalsIgnoreCase(colName))
					colNum=i;
			}
			
			if(colNum==-1)
				return false;
			sheet.autoSizeColumn(colNum); 
			row = sheet.getRow(rowNum-1);
			if (row == null)
				row = sheet.createRow(rowNum-1);
			
			cell = row.getCell(colNum);	
			if (cell == null)
		        cell = row.createCell(colNum);
				
		    cell.setCellValue(data);
		   
		      
		    FileOutputStream fileOut = new FileOutputStream(filePath);
			workbook.write(fileOut);

		    fileOut.close();	

		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	//Newly added method
	public static Map<String, String> testdataaccess(String methodName, String sheetname)
	{
		
		//String[] testCaseID = methodName.split("_");
		System.out.println(methodName);
		excelTestData = getTestData(methodName,sheetname);
		for (String key : excelTestData.keySet()) {
			System.out.println(key + " :- " + excelTestData.get(key));
			
		}
//		try{String testdataprint=StringUtils.join(excelTestData);
//		testdataprint=testdataprint.replace(",","<br/>");
//		testdataprint=testdataprint.replace("=}", "");
//		testdataprint=testdataprint.replace("{", "");
//		testdataprint=testdataprint.replace("=", "  =  ");
//		String logText = "<p>" + testdataprint +"</p>";
//	    //Markup m = MarkupHelper.createLabel(logText, ExtentColor.LIME);
//		Markup m = MarkupHelper.createLabel(testdataprint, ExtentColor.BROWN);
//	    child.info(m);
//		
//		}catch(Exception e){}
		
		return excelTestData;
		
	}
	
	
	//Newly added method
	public static synchronized Map<String, String> getTestData(String TestCaseId, String sheetname) {
		try {
			String currentDir = System.getProperty("user.dir");
//			fileInputStream = new FileInputStream(currentDir + File.separator + "src" + File.separator + "test"
//					+ File.separator + "resources" + File.separator + "TestData" + File.separator + "Excel Files"
//					+ File.separator + "TestData.xlsx");
			
			fileInputStream = new FileInputStream(currentDir + File.separator + "testData" + File.separator + "testCases"
					+ File.separator + "test" + File.separator + "Smoke" + File.separator + "TestData.xlsx");
			workbookTestData = new XSSFWorkbook(fileInputStream);
			worksheetTestData = workbookTestData.getSheet(sheetname);
			testData = new LinkedHashMap<String, String>();

			intTotalRows = worksheetTestData.getLastRowNum();
			//intTotalColumns = worksheetTestData.getRow(0).getPhysicalNumberOfCells();

			for (int intRow = 1; intRow < intTotalRows; intRow++) {
				rowCurrent = worksheetTestData.getRow(intRow);
				if (rowCurrent.getCell(0).getStringCellValue().equalsIgnoreCase(TestCaseId)) {
					intCurrentRow = intRow;
					rowHeader = worksheetTestData.getRow(intCurrentRow - 1);
					intTotalColumns = worksheetTestData.getRow(intRow).getPhysicalNumberOfCells();
					break;
				}
			}

			rowCurrent = worksheetTestData.getRow(intCurrentRow);
			for (int intCol = 0; intCol < intTotalColumns; intCol++) {
				Cell cell = rowCurrent.getCell(intCol);
				cell.setCellType(Cell.CELL_TYPE_STRING);
				String value = cell.getStringCellValue();
				if (value.equalsIgnoreCase("END"))
					break;
				else
					testData.put(rowHeader.getCell(intCol).getStringCellValue().toString(), value);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

//		try {
//			(workbookTestData).close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		return testData;

	}

	
	
}
