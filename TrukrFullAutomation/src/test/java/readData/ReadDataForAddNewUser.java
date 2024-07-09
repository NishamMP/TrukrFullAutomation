package readData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataForAddNewUser {
	
	public static String userLoginId;
	public static String nameOfUser;
	public static String userEmail;
	public static String userPassword;
	public static String userType;
	public static String logisticsGroup;
	public static String groups;
	public void dataReadTest() throws IOException {
		File src=new File("C:\\Users\\DELL\\Downloads\\Trukr\\Admin\\newUser.xlsx");
		FileInputStream fileInputStream=new FileInputStream(src);
		try (XSSFWorkbook wb = new XSSFWorkbook(fileInputStream)) {
			XSSFSheet sheet=wb.getSheetAt(0);
			int rowCount=sheet.getLastRowNum();
			for(int i=1;i<=rowCount;i++) {
				XSSFRow row=sheet.getRow(i);
					XSSFCell cellUserLoginId=row.getCell(0);
					XSSFCell cellNameOfUser=row.getCell(1);
					XSSFCell cellEmailOfUSer=row.getCell(2);
					XSSFCell cellUserPassword=row.getCell(3);
					XSSFCell cellUserType=row.getCell(4);
					XSSFCell cellLogisticGroup=row.getCell(5);
					XSSFCell cellGroup=row.getCell(6);
					userLoginId=cellUserLoginId.toString();
					nameOfUser=cellNameOfUser.toString();
					userEmail=cellEmailOfUSer.toString();
					userPassword=cellUserPassword.toString();
					userType=cellUserType.toString();
					logisticsGroup=cellLogisticGroup.toString();
					groups=cellGroup.toString();
					System.out.println(userLoginId+" "+nameOfUser+" "+userEmail+" "+userPassword+" "+userType+" "+logisticsGroup+" "+groups);
			}
		}
	}
}