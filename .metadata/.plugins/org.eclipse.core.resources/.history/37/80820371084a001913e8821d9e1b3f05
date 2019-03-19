package com.login;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UsersDAO {

	public boolean addUsers(int name,String passw) {
		
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		LoginDetails checkObject = session.get(LoginDetails.class, name);
		
		if(checkObject == null) {
		
		LoginDetails Login  = new LoginDetails();
		Login.setUserId( name);
		Login.setPassword(passw);
		
		System.out.println("object "+Login);

		session.save(Login);
		
		tx.commit();
		session.close(); 
		return true;
	}
	else 
	{
		return false;}
	}
	
	public void addCustomer(Customer customer) {
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		
		session.save(customer);
		tx.commit();
		session.close();
	}
}
