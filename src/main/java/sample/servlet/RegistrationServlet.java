package sample.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.println("<h1>Registration Page Details</h1>");
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String mobile = request.getParameter("mobile_num");
		String email = request.getParameter("email_id");
		pw.println(first_name);
		pw.println(last_name);
		pw.println(mobile);
		pw.println(email);
	}

}
