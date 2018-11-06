
package HeadersServlet;

import java.io.IOException;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HeaderServlet")
public class HeaderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        // получение параметров хедера
        
        Enumeration<String> headerNames = req.getHeaderNames();
        while(headerNames.hasMoreElements()) {
            String s = headerNames.nextElement();
            System.out.println(s + " = " + req.getHeader(s));
        }
        
        // еще методы для получения парамеров хедера
        
        System.out.println(req.getAuthType());
        System.out.println(req.getContentLength());
        System.out.println(req.getContentType());
        System.out.println(req.getMethod());
        System.out.println(req.getRequestURI());
        System.out.println(req.getQueryString());
        System.out.println(req.getProtocol());
        
        // пример установки значения параметра хедера
        
        resp.setHeader("Content-Length:", "10"); // возможно нужно нижнее подчеркивание
    }  
}
