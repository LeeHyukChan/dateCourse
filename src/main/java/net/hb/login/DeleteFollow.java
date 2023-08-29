package net.hb.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteFollow.do")
public class DeleteFollow extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		String name = request.getParameter("name");
		String following = request.getParameter("following");
		System.out.println("name: " + name);
		System.out.println("following: " + following);
      try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
          // Replace "your_database_url", "your_username", and "your_password" with your database credentials
          String databaseURL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
          String username = "system";
          String password = "1234";

          Connection conn = DriverManager.getConnection(databaseURL, username, password);
          
          String sql = "delete from follow where name = ? and following = ? ";
          PreparedStatement statement = conn.prepareStatement(sql);
          statement.setString(1, name);
          statement.setString(2, following);
          int rowsInserted = statement.executeUpdate();

          if (rowsInserted > 0) {
              response.setContentType("text/plain;charset=UTF-8");
              response.getWriter().write("Follow relationship delete saved successfully");
          } else {
              response.setContentType("text/plain;charset=UTF-8");
              response.getWriter().write("Failed to save follow relationship");
          }
          statement.close();
          conn.close();
          RequestDispatcher dis = request.getRequestDispatcher("follow");
  		  dis.forward(request, response);
      } catch (Exception e) {
          e.printStackTrace();
          response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error processing the request");
      }
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}