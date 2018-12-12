import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class tempo extends HttpServlet {

  public void doPost(HttpServletRequest req, HttpServletResponse res)
    throws IOException, ServletException {

    res.setContentType("text/html");
    PrintWriter out = res.getWriter();
    out.println("<html>");
    out.println("<head>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h3>Simulazione del meteo per 7 giorni:</h3>");

    out.println("Lunedì: nuvoloso");
    out.println("<br />");
    out.println("Mrtedì: temporale");
    out.println("<hr>");
    out.println("Mercoledì: pioggia");
    out.println("<br />");
    out.println("Giovedì: sereno");
	out.println("<br />");
	out.println("Venerdì: sereno");
	out.println("<br />");
	out.println("Sabato: nevicata");
	out.println("<br />");
	out.println("Domenica: nevicata");
   
    out.println("</body>");
    out.println("</html>");
  }
}