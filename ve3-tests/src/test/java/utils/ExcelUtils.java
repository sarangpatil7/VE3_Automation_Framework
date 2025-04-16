package utils;

//import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtils {
    public static String getCellData(String path, String sheetName, int row, int col) throws IOException {
        FileInputStream fis = new FileInputStream(path);
        Workbook wb = new XSSFWorkbook(fis);
        Sheet sheet = wb.getSheet(sheetName);
        String value = sheet.getRow(row).getCell(col).getStringCellValue();
        wb.close();  // Always close the workbook
        return value;
    }
}