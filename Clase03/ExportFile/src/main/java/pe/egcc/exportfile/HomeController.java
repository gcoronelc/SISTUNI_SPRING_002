package pe.egcc.exportfile;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

  private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

  /**
   * Simply selects the home view to render by returning its name.
   */
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String home(Locale locale, Model model) {
    logger.info("Welcome home! The client locale is {}.", locale);

    Date date = new Date();
    DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

    String formattedDate = dateFormat.format(date);

    model.addAttribute("serverTime", formattedDate);

    return "home";
  }

  @RequestMapping(value = "/getExcel", method = RequestMethod.GET)
  public void getExcel(HttpServletResponse response) 
      throws ServletException {
    try {
      response.setContentType("application/vnd.ms-excel");
      response.setHeader("Content-Disposition", "attachment; filename=sampleName.xls");

      WritableWorkbook w = Workbook.createWorkbook(response.getOutputStream());
      WritableSheet s = w.createSheet("Demo", 0);

      s.addCell(new Label(0, 0, "Hello World"));
      s.addCell(new Label(1, 0, "Todos somos Spring"));
      s.addCell(new Label(2, 0, "Vota por Spring"));
      
      w.write();
      w.close();

    } catch (Exception e) {
      throw new ServletException("Exception in Excel Sample Servlet", e);
    }
  }
  
  @RequestMapping(value = "/getPDF", method = RequestMethod.GET)
  public void getPDF(HttpServletResponse response)  {
    try {
      response.setContentType("application/pdf");
      response.setHeader("Content-Disposition", "attachment; filename=datos.pdf");
      Document document = new Document();
      PdfWriter.getInstance(document, response.getOutputStream());
      document.open();
      document.add(new Paragraph("Hola amigos de Gustavo."));
      document.add(new Paragraph("Hoy es: " + new Date().toString()));
      
      Table table = new Table(4);
      
      table.addCell("ID");
      table.addCell("NOMBRE");
      table.addCell("PRECIO");
      table.addCell("STOCK");
      
      table.addCell("001");
      table.addCell("TELEVISOR");
      table.addCell("2456.89");
      table.addCell("100");
      
      table.addCell("002");
      table.addCell("REFRIGERADORA");
      table.addCell("3760.99");
      table.addCell("250");
      
      document.add(table);
      
      document.close();
    } catch (Exception e) {
    }
  }
}
