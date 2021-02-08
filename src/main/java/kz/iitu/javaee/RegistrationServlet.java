package kz.iitu.javaee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/register")
public class RegistrationServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        request.getRequestDispatcher("main.html").include(request, response);

        String name=request.getParameter("name");
        String password=request.getParameter("password");
        String confPassord=request.getParameter("confPassword");

        if(password.equals(confPassord)){
            out.print("Welcome, "+name);
            HttpSession session=request.getSession();
            session.setAttribute("name",name);
        }
        else{
            out.print("Error confirmation password!");
            request.getRequestDispatcher("register.html").include(request, response);
        }
        out.close();
    }

}
