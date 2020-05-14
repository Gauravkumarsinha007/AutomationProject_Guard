package com.test.utility;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader;

public class EHS_Observation_Action_Util {
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
		
		for(int rowNum=2; rowNum <= reader.getRowCount("EHSObservationAction"); rowNum++)
		{
			String UserName = reader.getCellData("EHSObservationAction", "UserName", rowNum);
			String Password = reader.getCellData("EHSObservationAction", "Password", rowNum);
			String Clickonthat = reader.getCellData("EHSObservationAction", "Clickonthat", rowNum);
			String AuthorizationActionOperator = reader.getCellData("EHSObservationAction", "AuthorizationActionOperator", rowNum);
			String OperatorComment = reader.getCellData("EHSObservationAction", "OperatorComment", rowNum);
			String Attachments = reader.getCellData("EHSObservationAction", "Attachments", rowNum);
			String DepartmentHeadUsername = reader.getCellData("EHSObservationAction", "DepartmentHeadUsername", rowNum);
			String DepartmentHeadPassword = reader.getCellData("EHSObservationAction", "DepartmentHeadPassword", rowNum);
			String AuthorizationActionDepartmentHead = reader.getCellData("EHSObservationAction", "AuthorizationActionDepartmentHead", rowNum);
			String DepartmentHeadComment = reader.getCellData("EHSObservationAction", "DepartmentHeadComment", rowNum);
					
			
			Object ob[]= { UserName,Password,Clickonthat,AuthorizationActionOperator,OperatorComment,Attachments,DepartmentHeadUsername,
					DepartmentHeadPassword,AuthorizationActionDepartmentHead,DepartmentHeadComment

			};
			myData.add(ob);
		
			}

			return myData;
		
			}

}
