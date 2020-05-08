package com.test.utility;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader;

public class Incident_investigation_Util {

	

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
		
		for(int rowNum=2; rowNum <= reader.getRowCount("Incident"); rowNum++)
		{
			String UserName = reader.getCellData("Incident", "UserName", rowNum);
			String Password = reader.getCellData("Incident", "Password", rowNum);
			String SubUnit = reader.getCellData("Incident", "SubUnit", rowNum);
			String Department = reader.getCellData("Incident", "Department", rowNum);
			String Contractor = reader.getCellData("Incident", "Contractor", rowNum);
			String Area = reader.getCellData("Incident", "Area", rowNum);
			String Shift = reader.getCellData("Incident", "Shift", rowNum);
			String ExactLocation = reader.getCellData("Incident", "ExactLocation", rowNum);
			String Descriptionofwhathappened = reader.getCellData("Incident", "Descriptionofwhathappened", rowNum);
			String ImmediateContainmentAction = reader.getCellData("Incident", "ImmediateContainmentAction", rowNum);
			String Employee = reader.getCellData("Incident", "Employee", rowNum);
			String Name = reader.getCellData("Incident", "Name", rowNum);
			String Age = reader.getCellData("Incident", "Age", rowNum);
			String DepartmentOP = reader.getCellData("Incident", "DepartmentOP", rowNum);
			String Gender = reader.getCellData("Incident", "Gender", rowNum);
			String Attachments1 = reader.getCellData("Incident", "Attachments1", rowNum);
			String Attachments2 = reader.getCellData("Incident", "Attachments2", rowNum);
			String Attachments3 = reader.getCellData("Incident", "Attachments3", rowNum);
			String Attachments4 = reader.getCellData("Incident", "Attachments4", rowNum);
			String DepartmentHeadUsername = reader.getCellData("Incident", "DepartmentHeadUsername", rowNum);
			String DepartmentHeadPassword = reader.getCellData("Incident", "DepartmentHeadPassword", rowNum);
			String Clickonthat = reader.getCellData("Incident", "Clickonthat", rowNum);
			String TypeofInjury = reader.getCellData("Incident", "TypeofInjury", rowNum);
			String NatureofInjury = reader.getCellData("Incident", "NatureofInjury", rowNum);
			String AuthorizationAction = reader.getCellData("Incident", "AuthorizationAction", rowNum);
			String Comment = reader.getCellData("Incident", "Comment", rowNum);
			String UnitMRUsername = reader.getCellData("Incident", "UnitMRUsername", rowNum);
			String UnitMRPassword = reader.getCellData("Incident", "UnitMRPassword", rowNum);
			String AuthorizationActionUnitMR = reader.getCellData("Incident", "AuthorizationActionUnitMR", rowNum);
			String CommentUnitMR = reader.getCellData("Incident", "CommentUnitMR", rowNum);
			String searchemployee = reader.getCellData("Incident", "searchemployee", rowNum);
			String operatorInvestigationUsername = reader.getCellData("Incident", "operatorInvestigationUsername", rowNum);
			String operatorInvestigationPassword = reader.getCellData("Incident", "operatorInvestigationPassword", rowNum);
			String Actiontobetaken = reader.getCellData("Incident", "Actiontobetaken", rowNum);
			String Responsibility = reader.getCellData("Incident", "Responsibility", rowNum);
			String Priority = reader.getCellData("Incident", "Priority", rowNum);
			String AuthorizationActionoperatorInvestigation = reader.getCellData("Incident", "AuthorizationActionoperatorInvestigation", rowNum);
			String CommentoperatorInvestigation = reader.getCellData("Incident", "CommentoperatorInvestigation", rowNum);
			String ClusterEHSHeadUsername = reader.getCellData("Incident", "ClusterEHSHeadUsername", rowNum);
			String ClusterEHSHeadPassword = reader.getCellData("Incident", "ClusterEHSHeadPassword", rowNum);
			String AuthorizationActionClusterEHSHead = reader.getCellData("Incident", "AuthorizationActionClusterEHSHead", rowNum);
			String ClusterEHSHeadComment = reader.getCellData("Incident", "ClusterEHSHeadComment", rowNum);
			String InvstegationUnitMRUsername = reader.getCellData("Incident", "InvstegationUnitMRUsername", rowNum);
			String InvstegationUnitMRPassword = reader.getCellData("Incident", "InvstegationUnitMRPassword", rowNum);
			String AuthorizationActionInvstegationUnitMR = reader.getCellData("Incident", "AuthorizationActionInvstegationUnitMR", rowNum);
			String InvstegationUnitMRComment = reader.getCellData("Incident", "InvstegationUnitMRComment", rowNum);
			String InvstegationUnitHEADUsername = reader.getCellData("Incident", "InvstegationUnitHEADUsername", rowNum);
			String InvstegationUnitHEADPassword = reader.getCellData("Incident", "InvstegationUnitHEADPassword", rowNum);
			String AuthorizationActionInvstegationUnitHEAD = reader.getCellData("Incident", "AuthorizationActionInvstegationUnitHEAD", rowNum);
			String InvstegationUnitHEADComment = reader.getCellData("Incident", "InvstegationUnitHEADComment", rowNum);
				
			
			Object ob[]= { UserName,Password,SubUnit,Department,Contractor,Area,Shift,ExactLocation,Descriptionofwhathappened,ImmediateContainmentAction,
				Employee,Name,Age,DepartmentOP,Gender,Attachments1,Attachments2,Attachments3,Attachments4,DepartmentHeadUsername,DepartmentHeadPassword,
				Clickonthat,TypeofInjury,NatureofInjury,AuthorizationAction,Comment,UnitMRUsername,UnitMRPassword,AuthorizationActionUnitMR,CommentUnitMR,
				searchemployee,operatorInvestigationUsername,operatorInvestigationPassword,Actiontobetaken,Responsibility,Priority,AuthorizationActionoperatorInvestigation,
				CommentoperatorInvestigation,ClusterEHSHeadUsername,ClusterEHSHeadPassword,AuthorizationActionClusterEHSHead,ClusterEHSHeadComment,InvstegationUnitMRUsername,
				InvstegationUnitMRPassword,AuthorizationActionInvstegationUnitMR,InvstegationUnitMRComment,InvstegationUnitHEADUsername,InvstegationUnitHEADPassword,
				AuthorizationActionInvstegationUnitHEAD,InvstegationUnitHEADComment
			};
			myData.add(ob);
		
			}

			return myData;
		
			}
	
}
