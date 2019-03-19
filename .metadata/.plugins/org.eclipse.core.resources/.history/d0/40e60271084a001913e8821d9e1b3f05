package com.login;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		Connection con = Login.getConnection();
	    int userId= Integer.parseInt(request.getParameter("userId"));
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String city = request.getParameter("city");	
		String[] technologies = request.getParameterValues("technologies");
	
	
		Customer customer = new Customer();
		customer.setUserId(userId);
		customer.setName(name);
		customer.setGender(gender);
		customer.setCity(city);
		customer.setTechnologies(technologies);
		
		UsersDAO dao =new UsersDAO();
		dao.addCustomer(customer);
	}
		
		/*Login.insertData(customer,con);
		ArrayList<Customer> a1=  Login.displayData(con);
		request.setAttribute("customerlist", a1);
		RequestDispatcher rd = request.getRequestDispatcher("Dis.jsp");
		rd.forward(request,response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
