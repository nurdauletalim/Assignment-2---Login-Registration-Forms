import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        request.getRequestDispatcher("main.html").include(request, response);

        String name=request.getParameter("name");
        String password=request.getParameter("password");
        String password2 =request.getParameter("password2");

        if(password.equals(password2)){
            out.print("Welcome, "+name+ "! You're just registrate to the site");
            HttpSession session=request.getSession();
            session.setAttribute("name",name);
        }
        else{
            out.print("Error confirmation! Try again");
            request.getRequestDispatcher("register.html").include(request, response);
        }
        out.close();
    }
}  