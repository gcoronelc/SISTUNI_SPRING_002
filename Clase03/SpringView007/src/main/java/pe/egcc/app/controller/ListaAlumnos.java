package pe.egcc.app.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

public class ListaAlumnos extends AbstractExcelView {

  @Override
  protected void buildExcelDocument(Map<String, Object> model, HSSFWorkbook workbook, HttpServletRequest request,
      HttpServletResponse response) throws Exception {
    HSSFSheet sheet = workbook.createSheet("ALUMNOS");
    // Fila 1
    HSSFRow row = sheet.createRow(1);
    row.createCell(0).setCellValue("001");
    row.createCell(1).setCellValue("JUAN");
    row.createCell(2).setCellValue("RAMOS");
    row.createCell(3).setCellValue(15);
    // Fila 2
    row = sheet.createRow(2);
    row.createCell(0).setCellValue("002");
    row.createCell(1).setCellValue("KARLA");
    row.createCell(2).setCellValue("TORRES");
    row.createCell(3).setCellValue(20);
    // Fila 3
    row = sheet.createRow(3);
    row.createCell(0).setCellValue("003");
    row.createCell(1).setCellValue("GUSTAVO");
    row.createCell(2).setCellValue("CORONEL");
    row.createCell(3).setCellValue(20);
  }

}
