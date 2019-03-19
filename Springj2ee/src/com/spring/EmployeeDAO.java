package com.spring;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;






public class EmployeeDAO {

	public boolean insertdata(String username, String pwd) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		LoginDetails Login  = new LoginDetails();
		Login.setUserId(Integer.parseInt(username));
		Login.setPassword(pwd);

		session.save(Login);
		
		tx.commit();
		session.close(); 
		return true;
	
	}

	public void insertCustomerData(Customer customer) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		
		session.save(customer);
		
		tx.commit();
		session.close(); 
		
		
	}

	public List<Customer> getcustomer() {
		// TODO Auto-generated method stub
		List<Customer> customer=new ArrayList<Customer>();
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		customer=session.createQuery("form Customer").list();
		session.close();
		return customer;
	}

	
}
