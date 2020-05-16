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
		
		for(int rowNum=2; rowNum <= reader.getRowCount("EHSObservationNearMiss"); rowNum++)
		{
			String UserName = reader.getCellData("EHSObservationNearMiss", "UserName", rowNum);
			String Password = reader.getCellData("EHSObservationNearMiss", "Password", rowNum);
			String SubUnit = reader.getCellData("EHSObservationNearMiss", "SubUnit", rowNum);
			String Department = reader.getCellData("EHSObservationNearMiss", "Department", rowNum);
			String Contractor = reader.getCellData("EHSObservationNearMiss", "Contractor", rowNum);
			String Area = reader.getCellData("EHSObservationNearMiss", "Area", rowNum);
			String ExactLocation = reader.getCellData("EHSObservationNearMiss", "ExactLocation", rowNum);
			String Severity = reader.getCellData("EHSObservationNearMiss", "Severity", rowNum);
			String ObservationType = reader.getCellData("EHSObservationNearMiss", "ObservationType", rowNum);
			String NoOfPersons = reader.getCellData("EHSObservationNearMiss", "NoOfPersons", rowNum);
			String Descriptionofwhathappened = reader.getCellData("EHSObservationNearMiss", "Descriptionofwhathappened", rowNum);
			String ImmediateContainmentAction = reader.getCellData("EHSObservationNearMiss", "ImmediateContainmentAction", rowNum);
			String ReportedbyName = reader.getCellData("EHSObservationNearMiss", "ReportedbyName", rowNum);
			String Attachments1 = reader.getCellData("EHSObservationNearMiss", "Attachments1", rowNum);
			String Attachments2 = reader.getCellData("EHSObservationNearMiss", "Attachments2", rowNum);
			String Attachments3 = reader.getCellData("EHSObservationNearMiss", "Attachments3", rowNum);
			String Attachments4 = reader.getCellData("EHSObservationNearMiss", "Attachments4", rowNum);
			String DepartmentHeadUsername = reader.getCellData("EHSObservationNearMiss", "DepartmentHeadUsername", rowNum);
			String DepartmentHeadPassword = reader.getCellData("EHSObservationNearMiss", "DepartmentHeadPassword", rowNum);
			String Clickonthat = reader.getCellData("EHSObservationNearMiss", "Clickonthat", rowNum);
			String AuthorizationAction = reader.getCellData("EHSObservationNearMiss", "AuthorizationAction", rowNum);
			String Comment = reader.getCellData("EHSObservationNearMiss", "Comment", rowNum);
			String UnitMRusername = reader.getCellData("EHSObservationNearMiss", "UnitMRusername", rowNum);
			String UnitMRPassword = reader.getCellData("EHSObservationNearMiss", "UnitMRPassword", rowNum);
			String UnitMRAuthorizationaction = reader.getCellData("EHSObservationNearMiss", "UnitMRAuthorizationaction", rowNum);
			String UnitMRComment = reader.getCellData("EHSObservationNearMiss", "UnitMRComment", rowNum);
			String searchemployee = reader.getCellData("EHSObservationNearMiss", "searchemployee", rowNum);
			String operatorInvestigationUsername = reader.getCellData("EHSObservationNearMiss", "operatorInvestigationUsername", rowNum);
			String operatorInvestigationPassword = reader.getCellData("EHSObservationNearMiss", "operatorInvestigationPassword", rowNum);
			String ReasonofFailure = reader.getCellData("EHSObservationNearMiss", "ReasonofFailure", rowNum);
			String Actiontobetaken = reader.getCellData("EHSObservationNearMiss", "Actiontobetaken", rowNum);
			String Responsibility = reader.getCellData("EHSObservationNearMiss", "Responsibility", rowNum);
			String Priority = reader.getCellData("EHSObservationNearMiss", "Priority", rowNum);
			String AuthorizationActionoperatorInvestigation = reader.getCellData("EHSObservationNearMiss", "AuthorizationActionoperatorInvestigation", rowNum);
			String CommentoperatorInvestigation = reader.getCellData("EHSObservationNearMiss", "CommentoperatorInvestigation", rowNum);
			String ClusterEHSHeadUsername = reader.getCellData("EHSObservationNearMiss", "ClusterEHSHeadUsername", rowNum);
			String ClusterEHSHeadPassword = reader.getCellData("EHSObservationNearMiss", "ClusterEHSHeadPassword", rowNum);
			String AuthorizationActionClusterEHSHead = reader.getCellData("EHSObservationNearMiss", "AuthorizationActionClusterEHSHead", rowNum);
			String ClusterEHSHeadComment = reader.getCellData("EHSObservationNearMiss", "ClusterEHSHeadComment", rowNum);
			String InvstegationUnitMRUsername = reader.getCellData("EHSObservationNearMiss", "InvstegationUnitMRUsername", rowNum);
			String InvstegationUnitMRPassword = reader.getCellData("EHSObservationNearMiss", "InvstegationUnitMRPassword", rowNum);
			String AuthorizationActionInvstegationUnitMR = reader.getCellData("EHSObservationNearMiss", "AuthorizationActionInvstegationUnitMR", rowNum);
			String InvstegationUnitMRComment = reader.getCellData("EHSObservationNearMiss", "InvstegationUnitMRComment", rowNum);
			String InvstegationUnitHEADUsername = reader.getCellData("EHSObservationNearMiss", "InvstegationUnitHEADUsername", rowNum);
			String InvstegationUnitHEADPassword = reader.getCellData("EHSObservationNearMiss", "InvstegationUnitHEADPassword", rowNum);
			String AuthorizationActionInvstegationUnitHEAD = reader.getCellData("EHSObservationNearMiss", "AuthorizationActionInvstegationUnitHEAD", rowNum);
			String InvstegationUnitHEADComment = reader.getCellData("EHSObservationNearMiss", "InvstegationUnitHEADComment", rowNum);
			
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
