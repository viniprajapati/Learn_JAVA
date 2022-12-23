package hibernate_project.hibernate;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate_project.hibernate.entity.Users;
import hibernate_project.hibernate.utility.HibernateUtil;

public class App {
	
	
	public static void main(String[] args) {
		
		System.out.println("\n====================CREATE RECORDS====================\n");
		App appObj = new App();
		
		Users user = new Users();
		user.setUsername("Priya");
		user.setEmail("priya@gmail.com");
		appObj.insertUser(user);
		
		System.out.println("\n====================READ RECORD====================\n");
		List<Users> userList = appObj.getUserList();
		System.out.println("User size : "+userList.size());
		userList.stream().forEach(System.out::println);
		
		System.out.println("\n====================USER BY ID====================\n");
		user = appObj.getUserById(13);
		System.out.println(user);
		
		System.out.println("\n====================UPDATE RECORD====================\n");
		user = appObj.updateUser(13);
		System.out.println(user);
		
		System.out.println("\n====================DELETE RECORD====================\n");
		appObj.deleteUserById(10);
		List<Users> userList1 = appObj.getUserList();
		System.out.println("User size : "+userList1.size());
		userList.stream().forEach(System.out::println);
	}

	private void deleteUserById(int i) {
		
		Session session = null;
		Transaction transaction = null;
		Users user = null;
		try {
			session = HibernateUtil.getSession();
			transaction = session.beginTransaction();
			
			user = session.get(Users.class, i);
			session.delete(user);
			
			transaction.commit();
		} catch (Exception e) {
			System.out.println("Exception "+e);
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	private Users updateUser(int i) {
		
		Session session = null;
		Transaction transaction = null;
		Users user = null;
		try {
			session = HibernateUtil.getSession();
			transaction = session.beginTransaction();
			
			user = session.get(Users.class, i);
			user.setEmail("prexa@gmail.com");
			
			transaction.commit();
		} catch (Exception e) {
			System.out.println("Exception "+e);
			e.printStackTrace();
		} finally {
			session.close();
		}
		return user;
	}

	private Users getUserById(int i) {
		
		Session session = null;
		Users user = null;
		try {
			session = HibernateUtil.getSession();
			user = session.get(Users.class, i);
		} catch (Exception e) {
			System.out.println("Exception "+e);
			e.printStackTrace();
		} finally {
			session.close();
		}
		return user;
	}

	private List<Users> getUserList() {
		Session session = null;
		List<Users> userList = null;
		
		try {
			session = HibernateUtil.getSession();
//			String queyStr = "Select * from Users";
			userList = session.createQuery("From Users").list();
		} catch (Exception e) {
			System.out.println("Exception "+e);
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		return userList;
	}

	private void insertUser(Users user) {
		Session session = null;
		Transaction transaction = null;
		
		try {
			session = HibernateUtil.getSession();
			transaction = session.beginTransaction();
			
			session.save(user);
			transaction.commit();
			
			System.out.println(user);
			
		} catch (HibernateException e) {
			
			System.out.println("Hibernate exception "+e);
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

}
