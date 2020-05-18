package com.test.utility;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader;

public class EHSObservation_NearMiss_Action_Util {

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
		
		for(int rowNum=2; rowNum <= reader.getRowCount("ObservationNearMissAction"); rowNum++)
		{
			String UserName = reader.getCellData("ObservationNearMissAction", "UserName", rowNum);
			String Password = reader.getCellData("ObservationNearMissAction", "Password", rowNum);
			String Clickonthat = reader.getCellData("ObservationNearMissAction", "Clickonthat", rowNum);
			String AuthorizationActionOperator = reader.getCellData("ObservationNearMissAction", "AuthorizationActionOperator", rowNum);
			String OperatorComment = reader.getCellData("ObservationNearMissAction", "OperatorComment", rowNum);
			String Attachments = reader.getCellData("ObservationNearMissAction", "Attachments", rowNum);
			String DepartmentHeadUsername = reader.getCellData("ObservationNearMissAction", "DepartmentHeadUsername", rowNum);
			String DepartmentHeadPassword = reader.getCellData("ObservationNearMissAction", "DepartmentHeadPassword", rowNum);
			String AuthorizationActionDepartmentHead = reader.getCellData("ObservationNearMissAction", "AuthorizationActionDepartmentHead", rowNum);
			String DepartmentHeadComment = reader.getCellData("ObservationNearMissAction", "DepartmentHeadComment", rowNum);
			String UnitMRUsername = reader.getCellData("ObservationNearMissAction", "UnitMRUsername", rowNum);
			String UnitMRPassword = reader.getCellData("ObservationNearMissAction", "UnitMRPassword", rowNum);
			String AuthorizationActionUnitMR = reader.getCellData("ObservationNearMissAction", "AuthorizationActionUnitMR", rowNum);
			String UnitMRComment = reader.getCellData("ObservationNearMissAction", "UnitMRComment", rowNum);
			
			Object ob[]= { UserName,Password,Clickonthat,AuthorizationActionOperator,OperatorComment,Attachments,DepartmentHeadUsername,
					DepartmentHeadPassword,AuthorizationActionDepartmentHead,DepartmentHeadComment,UnitMRUsername,UnitMRPassword,AuthorizationActionUnitMR,
					UnitMRComment

			};
			myData.add(ob);
		
			}

			return myData;
		
			}

}
