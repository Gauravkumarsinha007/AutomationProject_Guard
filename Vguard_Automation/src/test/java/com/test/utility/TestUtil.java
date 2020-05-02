package com.test.utility;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader;

public class TestUtil {

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
		for(int rowNum=2; rowNum <= reader.getRowCount("signup"); rowNum++)
		{
			String companyname = reader.getCellData("signup", "companyname", rowNum);
			
			String businessemailid = reader.getCellData("signup", "businessemailid", rowNum);
			
			String businessphoneno = reader.getCellData("signup", "businessphoneno", rowNum);
			
			String password = reader.getCellData("signup", "password", rowNum);
			
			String repeatpwd = reader.getCellData("signup", "repeatpwd", rowNum);
			
			Object ob[]= { companyname, businessemailid, businessphoneno, password, repeatpwd};
			myData.add(ob);
		}

		return myData;
		
	}
	
}
