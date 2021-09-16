package ApachePOI.resources;

import gherkin.deps.net.iharder.Base64;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class _deneme {
    public static void main(String[] args) throws IOException {

        String path="src/test/java/ApachePOI/resources/WriteInTheExcelFile.xlsx";
        FileInputStream inputStream=new FileInputStream(path);
        Workbook workbook=WorkbookFactory.create(inputStream);
        Sheet sheet=workbook.getSheet("Sheet1");
        Row row=sheet.createRow(0);
        Cell cell=row.createCell(0);
        cell.setCellValue("helo esr how are you");

        for (int i=1;i<10;i++){
            cell=row.createCell(i);
            cell.setCellValue(i);
        }
        inputStream.close();
        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        outputStream.close();

     }
}



