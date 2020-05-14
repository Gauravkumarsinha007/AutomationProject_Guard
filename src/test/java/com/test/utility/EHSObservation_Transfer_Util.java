package com.test.utility;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader;

public class EHSObservation_Transfer_Util {
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
		
		for(int rowNum=2; rowNum <= reader.getRowCount("EHSObservationTransfer"); rowNum++)
		{
			String DepartmentHeadUsername = reader.getCellData("EHSObservationTransfer", "DepartmentHeadUsername", rowNum);
			String DepartmentHeadPassword = reader.getCellData("EHSObservationTransfer", "DepartmentHeadPassword", rowNum);
			String Clickonthat = reader.getCellData("EHSObservationTransfer", "Clickonthat", rowNum);
			String AuthorizationAction = reader.getCellData("EHSObservationTransfer", "AuthorizationAction", rowNum);
			String SubUnit = reader.getCellData("EHSObservationTransfer", "SubUnit", rowNum);
			String Department = reader.getCellData("EHSObservationTransfer", "Department", rowNum);
			String Area = reader.getCellData("EHSObservationTransfer", "Area", rowNum);
			String Comment = reader.getCellData("EHSObservationTransfer", "Comment", rowNum);
			String TransferUsername = reader.getCellData("EHSObservationTransfer", "TransferUsername", rowNum);
			String TransferPassword = reader.getCellData("EHSObservationTransfer", "TransferPassword", rowNum);
			String TransferAuthorizationAction = reader.getCellData("EHSObservationTransfer", "TransferAuthorizationAction", rowNum);
			String Comment1 = reader.getCellData("EHSObservationTransfer", "Comment1", rowNum);
			String AfetrRejectUsername = reader.getCellData("EHSObservationTransfer", "AfetrRejectUsername", rowNum);
			String AfetrRejectPassword = reader.getCellData("EHSObservationTransfer", "AfetrRejectPassword", rowNum);
			String DiscardUsername = reader.getCellData("EHSObservationTransfer", "DiscardUsername", rowNum);
			String DiscardPassword = reader.getCellData("EHSObservationTransfer", "DiscardPassword", rowNum);
			String DiscardAuthorizationAction = reader.getCellData("EHSObservationTransfer", "DiscardAuthorizationAction", rowNum);
			String DiscardComment = reader.getCellData("EHSObservationTransfer", "DiscardComment", rowNum);
			
					
			
			Object ob[]= { DepartmentHeadUsername,DepartmentHeadPassword,Clickonthat,AuthorizationAction,SubUnit,Department,Area,Comment,
					TransferUsername,TransferPassword,TransferAuthorizationAction,Comment1,AfetrRejectUsername,AfetrRejectPassword,DiscardUsername,
					DiscardPassword,DiscardAuthorizationAction,DiscardComment


			};
			myData.add(ob);
		
			}

			return myData;
		
			}
}
