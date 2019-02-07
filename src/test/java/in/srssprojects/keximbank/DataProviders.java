package in.srssprojects.keximbank;

import org.testng.annotations.DataProvider;

public class DataProviders {
	ExcelHelper excel;
	
	@DataProvider(name = "roles")
	public Object[][] getRoleData(){
		excel = new ExcelHelper();
		return excel.getExcelData("testdata.xls", "roleData");
	}
	
	@DataProvider(name = "employee")
	public Object[][] getEmployeeData(){
		excel = new ExcelHelper();
		return excel.getExcelData("testdata.xls", "employeeData");
	}
	

}
