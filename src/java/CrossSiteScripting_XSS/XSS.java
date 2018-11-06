
package CrossSiteScripting_XSS;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/XSS")
public class XSS extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        // при вводе в форму <script> alert ('hello'); </script> можно украсть куки
        // код ниже от этого не защищает
        
        String one = req.getParameter("one");
        resp.getWriter().write(                
                "<html>"
                + "<head></head>"
                + "<body>"
                + "one = " + one
                + "<form action = 'XSS' method = 'post'>" // для ввода логина и пароля используется параметр post, но doGet() его не примет, поэтому мы перенаправляем метод doGet() в метод doPost()
                + "<textarea name = 'one'></textarea>"        
                + "<input type = 'submit' name = 'submit'/>"
                + "</form>"
                + "</body>"
                + "</html>");
        
        // а вот этот код защищает
        
        String two = req.getParameter("two");
        two = two == null ? "" : two.replaceAll("<", "&lt;").replaceAll(">", "&gt;");
        resp.getWriter().write(                
                "<html>"
                + "<head></head>"
                + "<body>"
                + "two = " + two
                + "<form action = 'XSS' method = 'post'>" // для ввода логина и пароля используется параметр post, но doGet() его не примет, поэтому мы перенаправляем метод doGet() в метод doPost()
                + "<textarea name = 'two'></textarea>"        
                + "<input type = 'submit' name = 'submit'/>"
                + "</form>"
                + "</body>"
                + "</html>");
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
    
}
