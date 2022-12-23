package org.Learn_java;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo
 */
@WebServlet("/Demo")
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String url = "jdbc:mysql://127.0.0.1:3306/learn_java";
		String username = "vini";
		String password = "123456";
		
		out.println("Connecting database");
		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			out.print("Database connected!");
			
			String query = "Select username, email from users";
			Statement stmt = connection.createStatement();
			
			ResultSet rs = stmt.executeQuery(query);
			
			out.print("<html><body><h2>Employee Details</h2>");
			  out.print("<table border=\"1\" cellspacing=10 cellpadding=5>");
			  out.print("<th>Employee Username</th>");
			  out.print("<th>Employee Email</th>");
			while(rs.next()) {
				out.print("<tr>"); 
				  out.print("<td>" +rs.getString("username") + "</td>"); 
				  out.print("<td>" + rs.getString("email")+ "</td>"); 
				  out.print("</tr>");
			}
			out.print("</table></body><br/>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			out.println("Cannot connect the database! ");
		}
		
	}
	
	

}
