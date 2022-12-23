package org.Learn_java.model;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.Learn_java.entity.User;

public class UsersModel {

	public List<User> listUser(DataSource dataSource) {
		
		List<User> listUsers = new ArrayList<>();
		String url = "jdbc:mysql://127.0.0.1:3306/learn_java";
		String username = "vini";
		String password = "123456";
		
		try {

			Connection connection = DriverManager.getConnection(url, username, password);
			String query = "Select * from users";
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			
			while (resultSet.next()) {
				listUsers.add(new User(resultSet.getInt("user_id"), resultSet.getString("username"), resultSet.getString("email")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listUsers;
	}

	public boolean addUser(User newUser, DataSource dataSource) {
		String url = "jdbc:mysql://127.0.0.1:3306/learn_java";
		String user_name = "vini";
		String password = "123456";
		
		try {
			Connection connection = DriverManager.getConnection(url, user_name, password);
			String username = newUser.getUsername();
			String email = newUser.getEmail();
			ArrayList<String> profile_img = (ArrayList<String>) newUser.getProfile_img();
			String imgs = profile_img.toString();
			imgs = imgs.replace("[", "").replace("]", "").replace(" " , "");
			String query = "Insert into users (username, email, profile_img) values (?, ?, ?)";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, username);
			statement.setString(2, email);
			statement.setString(3, imgs);
			return statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public boolean updateUser(DataSource dataSource, User updatedUser) {
		
		String url = "jdbc:mysql://127.0.0.1:3306/learn_java";
		String user_name = "vini";
		String password = "123456";
		
		try {
			Connection connection = DriverManager.getConnection(url, user_name, password);
			String username = updatedUser.getUsername();
			String email = updatedUser.getEmail();
			int user_id = updatedUser.getUser_id();
			String query = "update users set username = ? , email = ? where user_id = ?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, username);
			statement.setString(2, email);
			statement.setInt(3, user_id);
			
			return statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}

	public boolean deleteUser(DataSource dataSource, int user_id) {
		
		String url = "jdbc:mysql://127.0.0.1:3306/learn_java";
		String user_name = "vini";
		String password = "123456";
		
		try {
			Connection connection = DriverManager.getConnection(url, user_name, password);
			String query = "delete from users where user_id = ?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, user_id);
			
			return statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}
