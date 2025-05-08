package hw.w6.d1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelForTwoStringCreatLead {

	public static String[][] readData()  throws IOException {
		//To open the workbook
				XSSFWorkbook wb=new XSSFWorkbook("./Data/CreateLead.xlsx");
				
		        //Locate the worksheet
				XSSFSheet ws = wb.getSheet("Lead");
				
				//To count the number of rows
				//without header
				int rowCount = ws.getLastRowNum();
				
			
				//To count the column
				int columnCount = ws.getRow(0).getLastCellNum();
				
			
				//To retrieve the entire data
				
				
				String[][] data=new String[rowCount][columnCount];
				
				for (int i = 1; i <= rowCount; i++) {
					
					XSSFRow row = ws.getRow(i);
				
					for (int j = 0; j < columnCount; j++) {
						String allData = row.getCell(j).getStringCellValue();
						// String allData =row(1).getCell(2).getStringCellValue
						data[i-1][j]=allData;    
					    System.out.println("All data are: "+allData);
						}
					}
				wb.close();
				return data;
	}

}
