package ex1_lab2;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet(name = "MyServlet", urlPatterns = {"/MyFirstServlet"})
public class Servlet extends HttpServlet {
 
  private static final long serialVersionUID = -1915463532411657451L;
 
  @Override
  protected void doGet(HttpServletRequest request,
      HttpServletResponse response) throws ServletException, IOException 
  {     
     
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();



    try {
      // Write some content
      out.println("<html>");
      out.println("<head>");
      out.println("<title>Test Title</title>");
      out.println("</head>");
      out.println("<body>");
      out.println("<h2>Testing stuff</h2>");
      out.println("</body>");
      out.println("</html>");
    } finally {
      out.close();
    }
  }
   
  @Override
  protected void doPost(HttpServletRequest request,
      HttpServletResponse response) throws ServletException, IOException {
      //int x;
      //int y = x + x; null point exception
      String username = request.getParameter("username");  
      String password = request.getParameter("password");
      PrintWriter out = response.getWriter();
      out.println("<h2>Passord set to "+ password + "!</h2>");
      out.println("<h2>Welcome "+ username + "!</h2>");
      out.close();
  }
}
