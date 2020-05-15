package com.test.utility;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader;

public class EHSObservation_NearMiss_Util {

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
			String SubUnit = reader.getCellData("IncidentAction", "SubUnit", rowNum);
			String Department = reader.getCellData("IncidentAction", "Department", rowNum);
			String Contractor = reader.getCellData("IncidentAction", "Contractor", rowNum);
			String Area = reader.getCellData("IncidentAction", "Area", rowNum);
			String ExactLocation = reader.getCellData("IncidentAction", "ExactLocation", rowNum);
			String Severity = reader.getCellData("IncidentAction", "Severity", rowNum);
			String ObservationType = reader.getCellData("IncidentAction", "ObservationType", rowNum);
			String NoOfPersons = reader.getCellData("IncidentAction", "NoOfPersons", rowNum);
			String Descriptionofwhathappened = reader.getCellData("IncidentAction", "Descriptionofwhathappened", rowNum);
			String ImmediateContainmentAction = reader.getCellData("IncidentAction", "ImmediateContainmentAction", rowNum);
			String ReportedbyName = reader.getCellData("IncidentAction", "ReportedbyName", rowNum);
			String Attachments1 = reader.getCellData("IncidentAction", "Attachments1", rowNum);
			String Attachments2 = reader.getCellData("IncidentAction", "Attachments2", rowNum);
			String Attachments3 = reader.getCellData("IncidentAction", "Attachments3", rowNum);
			String Attachments4 = reader.getCellData("IncidentAction", "Attachments4", rowNum);
			String DepartmentHeadUsername = reader.getCellData("IncidentAction", "DepartmentHeadUsername", rowNum);
			String DepartmentHeadPassword = reader.getCellData("IncidentAction", "DepartmentHeadPassword", rowNum);
			String Clickonthat = reader.getCellData("IncidentAction", "Clickonthat", rowNum);
			String AuthorizationAction = reader.getCellData("IncidentAction", "AuthorizationAction", rowNum);
			String Comment = reader.getCellData("IncidentAction", "Comment", rowNum);
			String UnitMRusername = reader.getCellData("IncidentAction", "UnitMRusername", rowNum);
			String UnitMRPassword = reader.getCellData("IncidentAction", "UnitMRPassword", rowNum);
			String UnitMRAuthorizationaction = reader.getCellData("IncidentAction", "UnitMRAuthorizationaction", rowNum);
			String UnitMRComment = reader.getCellData("IncidentAction", "UnitMRComment", rowNum);
			String searchemployee = reader.getCellData("IncidentAction", "searchemployee", rowNum);
			String operatorInvestigationUsername = reader.getCellData("IncidentAction", "operatorInvestigationUsername", rowNum);
			String operatorInvestigationPassword = reader.getCellData("IncidentAction", "operatorInvestigationPassword", rowNum);
			String ReasonofFailure = reader.getCellData("IncidentAction", "ReasonofFailure", rowNum);
			String Actiontobetaken = reader.getCellData("IncidentAction", "Actiontobetaken", rowNum);
			String Responsibility = reader.getCellData("IncidentAction", "Responsibility", rowNum);
			String Priority = reader.getCellData("IncidentAction", "Priority", rowNum);
			String AuthorizationActionoperatorInvestigation = reader.getCellData("IncidentAction", "AuthorizationActionoperatorInvestigation", rowNum);
			String CommentoperatorInvestigation = reader.getCellData("IncidentAction", "CommentoperatorInvestigation", rowNum);
			String ClusterEHSHeadUsername = reader.getCellData("IncidentAction", "ClusterEHSHeadUsername", rowNum);
			String ClusterEHSHeadPassword = reader.getCellData("IncidentAction", "ClusterEHSHeadPassword", rowNum);
			String AuthorizationActionClusterEHSHead = reader.getCellData("IncidentAction", "AuthorizationActionClusterEHSHead", rowNum);
			String ClusterEHSHeadComment = reader.getCellData("IncidentAction", "ClusterEHSHeadComment", rowNum);
			String InvstegationUnitMRUsername = reader.getCellData("IncidentAction", "InvstegationUnitMRUsername", rowNum);
			String InvstegationUnitMRPassword = reader.getCellData("IncidentAction", "InvstegationUnitMRPassword", rowNum);
			String AuthorizationActionInvstegationUnitMR = reader.getCellData("IncidentAction", "AuthorizationActionInvstegationUnitMR", rowNum);
			String InvstegationUnitMRComment = reader.getCellData("IncidentAction", "InvstegationUnitMRComment", rowNum);
			String InvstegationUnitHEADUsername = reader.getCellData("IncidentAction", "InvstegationUnitHEADUsername", rowNum);
			String InvstegationUnitHEADPassword = reader.getCellData("IncidentAction", "InvstegationUnitHEADPassword", rowNum);
			String AuthorizationActionInvstegationUnitHEAD = reader.getCellData("IncidentAction", "AuthorizationActionInvstegationUnitHEAD", rowNum);
			String InvstegationUnitHEADComment = reader.getCellData("IncidentAction", "InvstegationUnitHEADComment", rowNum);
			
			Object ob[]= { UserName,Password,SubUnit,Department,Contractor,Area,ExactLocation,Severity,ObservationType,NoOfPersons,Descriptionofwhathappened,
					ImmediateContainmentAction,ReportedbyName,Attachments1,Attachments2,Attachments3,Attachments4,DepartmentHeadUsername,DepartmentHeadPassword,
					Clickonthat,AuthorizationAction,Comment,UnitMRusername,UnitMRPassword,UnitMRAuthorizationaction,UnitMRComment,searchemployee,operatorInvestigationUsername,
					operatorInvestigationPassword,ReasonofFailure,Actiontobetaken,Responsibility,Priority,AuthorizationActionoperatorInvestigation,CommentoperatorInvestigation,
					ClusterEHSHeadUsername,ClusterEHSHeadPassword,AuthorizationActionClusterEHSHead,ClusterEHSHeadComment,InvstegationUnitMRUsername,InvstegationUnitMRPassword,
					AuthorizationActionInvstegationUnitMR,InvstegationUnitMRComment,InvstegationUnitHEADUsername,InvstegationUnitHEADPassword,AuthorizationActionInvstegationUnitHEAD,
					InvstegationUnitHEADComment

			};
			myData.add(ob);
		
			}

			return myData;
		
			}

}
