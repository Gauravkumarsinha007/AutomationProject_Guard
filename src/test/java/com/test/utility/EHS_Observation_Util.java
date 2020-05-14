package com.test.utility;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader;

public class EHS_Observation_Util {

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
		
		for(int rowNum=2; rowNum <= reader.getRowCount("EHSObservation"); rowNum++)
		{
			String UserName = reader.getCellData("EHSObservation", "UserName", rowNum);
			String Password = reader.getCellData("EHSObservation", "Password", rowNum);
			String SubUnit = reader.getCellData("EHSObservation", "SubUnit", rowNum);
			String Department = reader.getCellData("EHSObservation", "Department", rowNum);
			String Contractor = reader.getCellData("EHSObservation", "Contractor", rowNum);
			String Area = reader.getCellData("EHSObservation", "Area", rowNum);
			String ExactLocation = reader.getCellData("EHSObservation", "ExactLocation", rowNum);
			String Severity = reader.getCellData("EHSObservation", "Severity", rowNum);
			String ObservationType = reader.getCellData("EHSObservation", "ObservationType", rowNum);
			String ObservationCategory = reader.getCellData("EHSObservation", "ObservationCategory", rowNum);
			String NoOfPersons = reader.getCellData("EHSObservation", "NoOfPersons", rowNum);
			String Descriptionofwhathappened = reader.getCellData("EHSObservation", "Descriptionofwhathappened", rowNum);
			String ImmediateContainmentAction = reader.getCellData("EHSObservation", "ImmediateContainmentAction", rowNum);
			String ReportedbyName = reader.getCellData("EHSObservation", "ReportedbyName", rowNum);
			String Attachments1 = reader.getCellData("EHSObservation", "Attachments1", rowNum);
			String Attachments2 = reader.getCellData("EHSObservation", "Attachments2", rowNum);
			String Attachments3 = reader.getCellData("EHSObservation", "Attachments3", rowNum);
			String Attachments4 = reader.getCellData("EHSObservation", "Attachments4", rowNum);
			String DepartmentHeadUsername = reader.getCellData("EHSObservation", "DepartmentHeadUsername", rowNum);
			String DepartmentHeadPassword = reader.getCellData("EHSObservation", "DepartmentHeadPassword", rowNum);
			String Clickonthat = reader.getCellData("EHSObservation", "Clickonthat", rowNum);
			String AuthorizationAction = reader.getCellData("EHSObservation", "AuthorizationAction", rowNum);
			String Comment = reader.getCellData("EHSObservation", "Comment", rowNum);
			String ActiontobeTaken = reader.getCellData("EHSObservation", "ActiontobeTaken", rowNum);
			String Responsibility = reader.getCellData("EHSObservation", "Responsibility", rowNum);
			String Priority1 = reader.getCellData("EHSObservation", "Priority1", rowNum);
					
			
			Object ob[]= { UserName,Password,SubUnit,Department,Contractor,Area,ExactLocation,Severity,ObservationType,ObservationCategory,NoOfPersons,
					Descriptionofwhathappened,ImmediateContainmentAction,ReportedbyName,Attachments1,Attachments2,Attachments3,Attachments4,DepartmentHeadUsername,
					DepartmentHeadPassword,Clickonthat,AuthorizationAction,Comment,ActiontobeTaken,Responsibility,Priority1
			};
			myData.add(ob);
		
			}

			return myData;
		
			}

	
}
