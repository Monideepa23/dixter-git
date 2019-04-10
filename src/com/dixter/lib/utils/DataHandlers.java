package com.dixter.lib.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataHandlers {

	public static void setDataToExcel(String filename,String sheetname,int rowIndex, 
								int cellIndex,String data) throws Exception
	{
		try
		{
		File f = new File("./test-data/"+filename+".xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(f);
		Sheet s = wb.getSheet(sheetname);
		Row r = s.getRow(rowIndex);
		Cell c = r.getCell(cellIndex);
		c.getDateCellValue();
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
	
	public static String getDataFromExcel(String filename,String sheetname,int rowIndex, 
								int cellIndex)
	{
		String data = null;
		try
		{
			File f = new File("./test-data/"+filename+".xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = WorkbookFactory.create(f);
			Sheet s = wb.getSheet(sheetname);
			Row r = s.getRow(rowIndex);
			Cell c = r.getCell(cellIndex);
			data = c.toString();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return data;
	}
	
	public static void setDataToPropeties(String filename,String key,String value,String commentMsg)
	{
		try
		{
			File f = new File("./config-data/"+filename+".properties");
			FileInputStream fis = new FileInputStream(f);
			Properties prop = new Properties();
			prop.load(fis);
			prop.put(key, value);
			FileOutputStream fos = new FileOutputStream(f);
			prop.store(fos, commentMsg);
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static String getDataFromProperties(String filename,String key)
	{
		String data = null;
		try
		{
			File f = new File("./config-data/"+filename+".properties");
			FileInputStream fis = new FileInputStream(f);
			Properties prop = new Properties();
			prop.load(fis);
			data = prop.get(key).toString();
			System.out.println(data);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return data;
	}
}
