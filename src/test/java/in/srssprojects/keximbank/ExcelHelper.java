package in.srssprojects.keximbank;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.Test;

public class ExcelHelper {
	Workbook book;
	Sheet sheet;

	// set an excel file to read the data
	public void setExcel(String filename, String sheetName) {
		try {
			FileInputStream fis = new FileInputStream(".//" + filename);
			book = new HSSFWorkbook(fis);
			sheet = book.getSheet(sheetName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// count the number of rows
	public int getRowCount() {
		return sheet.getLastRowNum();
	}

	// count the number of columns
	public int getColumnCount() {
		return sheet.getRow(0).getLastCellNum();
	}

	// read the data from the given cell
	public String readCellData(int rnum, int cnum) {
		String value = null;

		Cell cell = sheet.getRow(rnum).getCell(cnum);
		CellType cellType = cell.getCellType();
		switch (cellType) {
		case STRING:
			value = cell.getStringCellValue();
			break;
		case NUMERIC:
			value = Double.toString(cell.getNumericCellValue());
			break;
		default:
			System.out.println("invalid data format");
		}
		return value;
	}

	public void closeFile() {
		try {
			book.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String[][] getExcelData(String filename, String sheetName) {
		this.setExcel(filename, sheetName);
		int nor = this.getRowCount();
		int noc = this.getColumnCount();
		String[][] data = new String[nor][noc];
		for (int i = 1; i < nor + 1; i++) {
			for (int j = 0; j < noc; j++) {
				data[i - 1][j] = this.readCellData(i, j);
			}
		}
		return data;
	}

//	@Test
//	public void testExcel() {
//		ExcelHelper obj = new ExcelHelper();
//		String[][] excelData = obj.getExcelData("testdata.xls", "roleData");
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.print(excelData[i][j] + "\t\t");
//			}
//			System.out.println();
//		}
//	}

}
