package hw.w6.d1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// open the workbook
		XSSFWorkbook wb = new XSSFWorkbook("./Data/CreateLead.xlsx");

		// locate the worksheet
		XSSFSheet ws = wb.getSheet("Lead");

		// To count the number of row
		// without the header
		int rowcount = ws.getLastRowNum();
		System.out.println(rowcount);

		// To count with the header
		int physicalNumberOfRows = ws.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);

		// counting the column
		short columncount = ws.getRow(0).getLastCellNum();
		System.out.println(columncount);

		// to retrieve a particular data
		String row1 = ws.getRow(1).getCell(1).getStringCellValue();
		System.out.println("row1 colum1 value is : " + row1);

		// To retrieve the entire data
		// row 1
		for (int i = 1; i <= rowcount; i++) {

			XSSFRow row = ws.getRow(i);
			for (int j = 0; j < columncount; j++) {
				// row (1).get(0).getStringvalue
				String allData = row.getCell(j).getStringCellValue();
				System.out.println("= "+allData);
				wb.close();
			
			}

		}
	}

}
