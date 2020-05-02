package com.test.utility;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader;

public class TestUtilEmployeecompanydetails {
	
	
	
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
		for(int rowNum=2; rowNum <= reader.getRowCount("Employeecompanydetails"); rowNum++)
		{
			
			String ReviewerName = reader.getCellData("Employeecompanydetails", "ReviewerName", rowNum);
			
			String Reviewerdegination = reader.getCellData("Employeecompanydetails", "Reviewerdegination", rowNum);
			
			String Revieweruploadphoto = reader.getCellData("Employeecompanydetails", "Revieweruploadphoto", rowNum);
			
			String EmpAadhaarnumber = reader.getCellData("Employeecompanydetails", "EmpAadhaarnumber", rowNum);
			
			String Empname = reader.getCellData("Employeecompanydetails", "Empname", rowNum);
			
			String Empcalender = reader.getCellData("Employeecompanydetails", "Empcalender", rowNum);
			
			String EmpUploadphoto = reader.getCellData("Employeecompanydetails", "EmpUploadphoto", rowNum);
									
			String EmpFathername = reader.getCellData("Employeecompanydetails", "EmpFathername", rowNum);
			
			String EmpMothername = reader.getCellData("Employeecompanydetails", "EmpMothername", rowNum);
			
			//===========================================upper fill lower not ===============================
			
			String Empcontact = reader.getCellData("Employeecompanydetails", "Empcontact", rowNum);
			
			String Percountry = reader.getCellData("Employeecompanydetails", "Percountry", rowNum);
			
			String Prestate = reader.getCellData("Employeecompanydetails", "Prestate", rowNum);
			
			String Precity = reader.getCellData("Employeecompanydetails", "Precity", rowNum);
			
			String Prepincode = reader.getCellData("Employeecompanydetails", "Prepincode", rowNum);
			
			String Prestreetaddress = reader.getCellData("Employeecompanydetails", "Prestreetaddress", rowNum);
			
			String Prejobtitle = reader.getCellData("Employeecompanydetails", "Prejobtitle", rowNum);
			
			String PreDurationfromdatecalender = reader.getCellData("Employeecompanydetails", "PreDurationfromdatecalender", rowNum);
			
			String PreDurationtodatecalender = reader.getCellData("Employeecompanydetails", "PreDurationtodatecalender", rowNum);
			
			String PreCTC = reader.getCellData("Employeecompanydetails", "PreCTC", rowNum);
			
			String Currentcountry = reader.getCellData("Employeecompanydetails", "Currentcountry", rowNum);
			
			String Currentstate = reader.getCellData("Employeecompanydetails", "Currentstate", rowNum);
			
			String Currentcity = reader.getCellData("Employeecompanydetails", "Currentcity", rowNum);
			
			String CurrentPincode = reader.getCellData("Employeecompanydetails", "CurrentPincode", rowNum);
			
			String Currentstreetaddresss = reader.getCellData("Employeecompanydetails", "Currentstreetaddresss", rowNum);
			
			String Emptechnicalskills = reader.getCellData("Employeecompanydetails", "Emptechnicalskills", rowNum);
									
			String Emphowmanyproject = reader.getCellData("Employeecompanydetails", "Emphowmanyproject", rowNum);
			
			String Empnameofproject = reader.getCellData("Employeecompanydetails", "Empnameofproject", rowNum);
			
			String durationfrom = reader.getCellData("Employeecompanydetails", "durationfrom", rowNum);
			
			String durationto = reader.getCellData("Employeecompanydetails", "durationto", rowNum);
			
			String teamsize = reader.getCellData("Employeecompanydetails", "teamsize", rowNum);
			
			String Employeeroleresponcebilities = reader.getCellData("Employeecompanydetails", "Employeeroleresponcebilities", rowNum);
			
			String Evalutionpotential = reader.getCellData("Employeecompanydetails", "Evalutionpotential", rowNum);
			
			String Evalutionhonesty = reader.getCellData("Employeecompanydetails", "Evalutionhonesty", rowNum);
			
			String EvalutionTechnicalskills = reader.getCellData("Employeecompanydetails", "EvalutionTechnicalskills", rowNum);
			
			String EvalutionQualtyofwork = reader.getCellData("Employeecompanydetails", "EvalutionQualtyofwork", rowNum);
			
			String Evalutioncoworker = reader.getCellData("Employeecompanydetails", "Evalutioncoworker", rowNum);
			
			String EvalutionCreativity = reader.getCellData("Employeecompanydetails", "EvalutionCreativity", rowNum);
			
			String EvalutionPresonality = reader.getCellData("Employeecompanydetails", "EvalutionPresonality", rowNum);
			
			String EvalutionJobknoweledge = reader.getCellData("Employeecompanydetails", "EvalutionJobknoweledge", rowNum);
			
			String EvalutionWorkConsistency = reader.getCellData("Employeecompanydetails", "EvalutionWorkConsistency", rowNum);
			
			String EvalutionAchivementofgoals = reader.getCellData("Employeecompanydetails", "EvalutionAchivementofgoals", rowNum);
			
			String Descipline = reader.getCellData("Employeecompanydetails", "Descipline", rowNum);
			
			String Attandance = reader.getCellData("Employeecompanydetails", "Attandance", rowNum);
			
			String TakeIntiative = reader.getCellData("Employeecompanydetails", "TakeIntiative", rowNum);
			
			String IndependentWork = reader.getCellData("Employeecompanydetails", "IndependentWork", rowNum);
			
			String Contributiontogroup = reader.getCellData("Employeecompanydetails", "Contributiontogroup", rowNum);
			
			String Punctuality = reader.getCellData("Employeecompanydetails", "Punctuality", rowNum);
			
			String Productivity = reader.getCellData("Employeecompanydetails", "Productivity", rowNum);
			
			String Dependability = reader.getCellData("Employeecompanydetails", "Dependability", rowNum);
			
			String ManagementAbility = reader.getCellData("Employeecompanydetails", "ManagementAbility", rowNum);
			
			String CommunicationSkill = reader.getCellData("Employeecompanydetails", "CommunicationSkill", rowNum);
			
			String strongestpointofemployee = reader.getCellData("Employeecompanydetails", "strongestpointofemployee", rowNum);
			
			String WeakestPointsofEmployee = reader.getCellData("Employeecompanydetails", "WeakestPointsofEmployee", rowNum);
									
			String effectiveormakeimprovements = reader.getCellData("Employeecompanydetails", "effectiveormakeimprovements", rowNum);
			
			String Anytraining = reader.getCellData("Employeecompanydetails", "Anytraining", rowNum);
			
			String Reason = reader.getCellData("Employeecompanydetails", "Reason", rowNum);
			
			String workindetail = reader.getCellData("Employeecompanydetails", "workindetail", rowNum);
			
			
			Object ob[]= {  ReviewerName, Reviewerdegination, Revieweruploadphoto, EmpAadhaarnumber, Empname, Empcalender, EmpUploadphoto, 
					EmpFathername, EmpMothername, Empcontact, Percountry, Prestate, Precity, Prepincode, Prestreetaddress, Prejobtitle, 
					PreDurationfromdatecalender, PreDurationtodatecalender, PreCTC, Currentcountry, Currentstate
					, Currentcity, CurrentPincode, Currentstreetaddresss, Emptechnicalskills, Emphowmanyproject, Empnameofproject
					, durationfrom, durationto, teamsize, Employeeroleresponcebilities, Evalutionpotential, Evalutionhonesty, EvalutionTechnicalskills, EvalutionQualtyofwork
					, Evalutioncoworker, EvalutionCreativity, EvalutionPresonality, EvalutionJobknoweledge, EvalutionWorkConsistency, EvalutionAchivementofgoals, Descipline
					, Attandance, TakeIntiative, IndependentWork, Contributiontogroup, Punctuality, Productivity, Dependability, ManagementAbility
					, CommunicationSkill, strongestpointofemployee, WeakestPointsofEmployee, effectiveormakeimprovements, Anytraining, Reason, workindetail};
			myData.add(ob);
		}

		return myData;
		
	}
	


}
