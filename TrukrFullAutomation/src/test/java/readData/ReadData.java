package readData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadData {
	public String tripId;
	public String deviceId;
	public void DataReadTest() throws IOException {
		File src=new File("C:\\Users\\DELL\\Downloads\\myTrip.xlsx");
		FileInputStream fileInputStream=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet=wb.getSheetAt(0);
		
		int rowCount=sheet.getLastRowNum();
		for(int i=1;i<=rowCount;i++) {
			XSSFRow row=sheet.getRow(i);
				XSSFCell cellTripId=row.getCell(0);
				XSSFCell cellDeviceId=row.getCell(1);
				tripId=cellTripId.toString();
				deviceId=cellDeviceId.toString();
				System.out.println(tripId);
				System.out.println(deviceId);
		}
	}

}
	