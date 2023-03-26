package excelAutomation;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class RealExcel {
    @Test
    public void Test() throws IOException {
        String yol="src/test/resources/bewerbungOrt.xlsx";
        FileInputStream file = new FileInputStream(yol);

        Workbook excel = WorkbookFactory.create(file);
        Sheet sheet = excel.getSheetAt(0);
        Row erstRow = sheet.getRow(1);
        Cell cell1 = erstRow.getCell(3);
        //System.out.println(cell.toString());

        // Exceldeki 2.satiri yazdirdik.
        for (Cell cell:sheet.getRow(2)) {
            System.out.println(cell.toString());
        }
    }
}
