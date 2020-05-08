package com.test.utility;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader;

public class Incident_Actions_Util {


	static Xls_Reader reader;
	
	
	
	public static ArrayList<Object[]> GetDataFromExcel()
	{
		ArrayList<Object[]> myData= new ArrayList<Object[]>();
		try {
			reader = new Xls_Reader("C:/Users/GAURAV/workspace/Vguard_Automation/src/main/java/com/textdata/Vguard_Automation.xlsx");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		for(int rowNum=2; rowNum <= reader.getRowCount("IncidentAction"); rowNum++)
		{
			String UserName = reader.getCellData("IncidentAction", "UserName", rowNum);
			String Password = reader.getCellData("IncidentAction", "Password", rowNum);
			String Clickonthat = reader.getCellData("IncidentAction", "Clickonthat", rowNum);
			String AuthorizationActionOperator = reader.getCellData("IncidentAction", "AuthorizationActionOperator", rowNum);
			String OperatorComment = reader.getCellData("IncidentAction", "OperatorComment", rowNum);
			String Attachments = reader.getCellData("IncidentAction", "Attachments", rowNum);
			String DepartmentHeadUsername = reader.getCellData("IncidentAction", "DepartmentHeadUsername", rowNum);
			String DepartmentHeadPassword = reader.getCellData("IncidentAction", "DepartmentHeadPassword", rowNum);
			String AuthorizationActionDepartmentHead = reader.getCellData("IncidentAction", "AuthorizationActionDepartmentHead", rowNum);
			String DepartmentHeadComment = reader.getCellData("IncidentAction", "DepartmentHeadComment", rowNum);
			String UnitMRUsername = reader.getCellData("IncidentAction", "UnitMRUsername", rowNum);
			String UnitMRPassword = reader.getCellData("IncidentAction", "UnitMRPassword", rowNum);
			String AuthorizationActionUnitMR = reader.getCellData("IncidentAction", "AuthorizationActionUnitMR", rowNum);
			String UnitMRComment = reader.getCellData("IncidentAction", "UnitMRComment", rowNum);
			
			Object ob[]= { UserName,Password,Clickonthat,AuthorizationActionOperator,OperatorComment,Attachments,DepartmentHeadUsername,
					DepartmentHeadPassword,AuthorizationActionDepartmentHead,DepartmentHeadComment,UnitMRUsername,UnitMRPassword,AuthorizationActionUnitMR,
					UnitMRComment

			};
			myData.add(ob);
		
			}

			return myData;
		
			}
	
	
	
	
}
