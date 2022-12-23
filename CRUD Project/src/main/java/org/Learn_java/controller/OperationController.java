package org.Learn_java.controller;

import jakarta.servlet.http.HttpServlet;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.sql.DataSource;

import org.Learn_java.entity.User;
import org.Learn_java.model.UsersModel;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.servlet.ServletRequestContext;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("/operation")
@MultipartConfig(fileSizeThreshold = 1024 * 1024, 
				maxFileSize = 1024 * 1024 * 5, 
				maxRequestSize = 1024 * 1024 * 5 * 5)
public class OperationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DataSource dataSource;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String page = request.getParameter("page");
		page = page.toLowerCase();
		
		switch (page) {

		case "listuser":
			listUser(request, response);
			break;
			
		case "adduser":
			addUserFormLoader(request, response);
			break;
			
		case "updateuser":
			updateUserFormLoader(request, response);
			break;
			
		case "deleteuser":
			deleteUser(dataSource, Integer.parseInt(request.getParameter("userId")));
			listUser(request, response);
			break;
			
		default:
			error(request, response);
			break;
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String operation = request.getParameter("form");
		operation = operation.toLowerCase();
		
		switch (operation) {
		case "adduseroperation":
//			String uploadPath = getServletContext().getRealPath("") + File.separator + "profile_img";
			String uploadPath = "G:\\JAVA\\upload_img\\profile_img";
			File uploadDir = new File(uploadPath);
			if(!uploadDir.exists()) uploadDir.mkdir();
			String fileName;
			List<String> img_names = new ArrayList<>();
			for(Part part : request.getParts()) {
				fileName = getFileName(part);
				if(fileName != null)
				{					
					part.write(uploadPath + File.separator + fileName);
					img_names.add(fileName);
				}
			}
			User newUser = new User(request.getParameter("username"), request.getParameter("email"), img_names);
			addUserOperation(newUser);
			listUser(request, response);
			break;

		case "updateuseroperation":
			User updatedUser = new User(Integer.parseInt(request.getParameter("user_id")), request.getParameter("username"), request.getParameter("email"));
			updateUserOperation(dataSource, updatedUser);
			listUser(request, response);
			break;

		default:
			error(request, response);
			break;
		}
	}

	private String getFileName(Part part) {
		for (String content : part.getHeaders("content-disposition")) {
			if(content.substring(content.lastIndexOf(";")+2, content.lastIndexOf("=")).equals("filename")) 
				return content.substring(content.lastIndexOf("=") + 2 , content.length() - 1);
		}
		return null;
	}

	public void listUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<User> listUsers = new ArrayList<>();
		listUsers = new UsersModel().listUser(dataSource);
		System.out.println(listUsers);
		request.setAttribute("listUsers", listUsers);
		request.setAttribute("title", "List of Users");
		request.getRequestDispatcher("listUser.jsp").forward(request, response);
		
	}
	
	public void addUserFormLoader(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("title", "Add Users");
		request.getRequestDispatcher("addUser.jsp").forward(request, response);
		
	}
	
	public void addUserOperation(User newUser) {
		new UsersModel().addUser(newUser, dataSource);
		return;
	}
	
	private void updateUserFormLoader(HttpServletRequest request, HttpServletResponse response) {
		
		request.setAttribute("title", "Update Users");
		try {
			request.getRequestDispatcher("updateUser.jsp").forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	private void updateUserOperation(DataSource dataSource ,User updatedUser) {
		
		new UsersModel().updateUser(dataSource, updatedUser);
		return;
		
	}
	

	private void deleteUser(DataSource dataSource , int user_id) {
		
		new UsersModel().deleteUser(dataSource, user_id);
		return;
		
	}
	
	public void error(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("title", "Error");
		request.getRequestDispatcher("error.jsp").forward(request, response);
		
	}

}
