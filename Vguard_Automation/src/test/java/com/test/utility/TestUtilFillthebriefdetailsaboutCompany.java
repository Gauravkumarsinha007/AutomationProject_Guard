package com.test.utility;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader;

public class TestUtilFillthebriefdetailsaboutCompany {
	
	
	
static Xls_Reader reader;
	
	
	
	public static ArrayList<Object[]> GetDataFromExcel()
	{
		ArrayList<Object[]> myData= new ArrayList<Object[]>();
		try {
			reader = new Xls_Reader("C:\\Users\\AJN\\eclipse-workspace\\MavenEMP\\src\\test\\java\\com\\textdata\\EmployeeFeedbackDataDrivenTestingExcelSheet.xlsx");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		for(int rowNum=2; rowNum <= reader.getRowCount("FillthebriefdetailsaboutCompany"); rowNum++)
		{
			
			String CIN = reader.getCellData("FillthebriefdetailsaboutCompany", "CIN", rowNum);
			
			String foundername = reader.getCellData("FillthebriefdetailsaboutCompany", "foundername", rowNum);
			
			String GST = reader.getCellData("FillthebriefdetailsaboutCompany", "GST", rowNum);
			
			String PAN = reader.getCellData("FillthebriefdetailsaboutCompany", "PAN", rowNum);
			
			String Directorname = reader.getCellData("FillthebriefdetailsaboutCompany", "Directorname", rowNum);
			
			String DIN = reader.getCellData("FillthebriefdetailsaboutCompany", "DIN", rowNum);
			
			String website = reader.getCellData("FillthebriefdetailsaboutCompany", "website", rowNum);
									
			String companysize = reader.getCellData("FillthebriefdetailsaboutCompany", "companysize", rowNum);
			
			String Turnover = reader.getCellData("FillthebriefdetailsaboutCompany", "Turnover", rowNum);
			
			String officehour = reader.getCellData("FillthebriefdetailsaboutCompany", "officehour", rowNum);
			
			String workingdays = reader.getCellData("FillthebriefdetailsaboutCompany", "workingdays", rowNum);
			
			String leavespermonths = reader.getCellData("FillthebriefdetailsaboutCompany", "leavespermonths", rowNum);
			
			String country = reader.getCellData("FillthebriefdetailsaboutCompany", "country", rowNum);
			
			String state = reader.getCellData("FillthebriefdetailsaboutCompany", "state", rowNum);
			
			String city = reader.getCellData("FillthebriefdetailsaboutCompany", "city", rowNum);
			
			String pincode = reader.getCellData("FillthebriefdetailsaboutCompany", "pincode", rowNum);
			
			String streetaddress = reader.getCellData("FillthebriefdetailsaboutCompany", "streetaddress", rowNum);
			
			String copyverificationlink = reader.getCellData("FillthebriefdetailsaboutCompany", "copyverificationlink", rowNum);
			
			
			
			
			Object ob[]= {  CIN, foundername, GST, PAN, Directorname, DIN, website, 
					companysize, Turnover, officehour, workingdays, leavespermonths, country, state, city, pincode, streetaddress, copyverificationlink};
			myData.add(ob);
		}

		return myData;
		
	}
	

}
