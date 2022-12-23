package org.Learn_java.entity;

import java.util.List;

public class User {
	
	private int user_id;
	private String username;
	private String email;
	private List<String> profile_img;
	public User(int user_id, String username, String email) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.email = email;
	}
	
	public User(String username, String email) {
		super();
		this.username = username;
		this.email = email;
	}

	public User(int parseInt, String parameter, String parameter2, List<String> img_names) {
		// TODO Auto-generated constructor stub
	}

	public User(String username, String email, List<String> profile_img) {
		super();
		this.username = username;
		this.email = email;
		this.profile_img = profile_img;
	}

	public int getUser_id() {
		return user_id;
	}
	
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getProfile_img() {
		return profile_img;
	}

	public void setProfile_img(List<String> profile_img) {
		this.profile_img = profile_img;
	}
	
	

}
