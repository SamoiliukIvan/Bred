
package URLParametersServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

@WebServlet("/URLServlet")
public class URLServlet extends HttpServlet{
    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        // вывод значений параметров "one" и "two"
        
        String notOne = req.getParameter("one"); // получаем значение параметра "one"
        System.out.println(notOne);
        String notTwo = req.getParameter("two");
        System.out.println(notTwo);
        
        // вывод НЕСКОЛЬКИХ значений одного параметра - "one"
        
        String[] ones = req.getParameterValues("one");
        for(String s : ones) {
            System.out.println(s);
        }
        
        // вывод названий всех пареметров
        
        Enumeration<String> parameterNames = req.getParameterNames();
        while(parameterNames.hasMoreElements()) {
            System.out.println(parameterNames.nextElement());
        }
        
        // вывод названий и значений параметров
        
        Enumeration<String> parNameAndValue = req.getParameterNames();
        while(parNameAndValue.hasMoreElements()) {
            String elementName = parNameAndValue.nextElement();
            System.out.println(elementName + " = " + req.getParameter(elementName));
        }
        
        // вывод мапы параметра: первое значение - параметр, второе - массив значений параметра
        
        Map<String, String[]> parameterMap = req.getParameterMap();
        // посмотреть как выводить элементы мапы на консоль!!!
        
        // различные методы реквеста
        
        System.out.println(req.getRequestURL());
        System.out.println(req.getRequestURI());
        System.out.println(req.getServletPath());
        System.out.println(req.getRemoteHost());
        System.out.println(req.getLocalPort());
        
        // как достать параметр и значения как в строке браузера
        
        System.out.println(req.getQueryString());
        
        // ввод параметров и значений через формы (надо убрать все, что выше)
        resp.getWriter().write(
                "<html>"
                + "<head></head>"
                + "<body>"
                + "<form action = 'URLServlet' method = 'get'>"
                + "<input type = 'text' name = 'one'/>"
                + "<input type = 'text' name = 'two'/>"
                + "<input type = 'submit' name = 'submit'/>"
                + "</form>"
                + "</body>"
                + "</html>");
        
        // ввод параметров и значений через формы и установка значений (надо убрать все, что выше)
        String one = req.getParameter("one");
        String two = req.getParameter("two");
        resp.getWriter().write(                
                "<html>"
                + "<head></head>"
                + "<body>"
                + "one = " + one
                + " two = " + two        
                + "<form action = 'URLServlet' method = 'get'>"
                + "<input type = 'text' name = 'one'/>"
                + "<input type = 'text' name = 'two'/>"
                + "<input type = 'submit' name = 'submit'/>"
                + "</form>"
                + "</body>"
                + "</html>");
        
        // ввод логина и пароля через формы и установка значений (надо убрать все, что выше)
        // эти строки нужно раскомментить
        //String one = req.getParameter("one"); 
        //String two = req.getParameter("two");
        resp.getWriter().write(                
                "<html>"
                + "<head></head>"
                + "<body>"
                + "one = " + one
                + " two = " + two        
                + "<form action = 'URLServlet' method = 'post'>" // для ввода логина и пароля используется параметр post, но doGet() его не примет, поэтому мы перенаправляем метод doGet() в метод doPost()
                + "<input type = 'text' name = 'one'/>"
                + "<input type = 'text' name = 'two'/>"
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
