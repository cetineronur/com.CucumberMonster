package excelAutomation;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class writeExcel {

    @Test
    public void TEst() throws IOException {
        String yol="src/test/resources/bewerbungOrt.xlsx";
        FileInputStream file = new FileInputStream(yol);


        Workbook excel = WorkbookFactory.create(file);
        FileOutputStream fileOutputStream = new FileOutputStream(yol);
        Sheet sheet = excel.getSheetAt(1);

        //yeni bir hucre olusturma ve icerisine data koyma
        sheet.getRow(0).createCell(8).setCellValue("YORUM");

        //satir silme. sheet ile satirlari yonetiyoruz.
        sheet.removeRow(sheet.getRow(1));



        //veriyi kaydetme
        excel.write(fileOutputStream);

    }
}
