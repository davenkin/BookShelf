package bookshelf.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Davenkin on 10/4/14.
 */
public class HelloWorldJspServlet extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("hello", "Hello World!");
        RequestDispatcher dispatcher = request.getRequestDispatcher("HelloWorld.jsp");
        dispatcher.forward(request, response);
    }
}
