package com.spring;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class HelloController {

	
	@RequestMapping("/")
	
	public String display()
	{
		HibernateUtil util=new HibernateUtil();
		util.createSessionFactory();
		return "index";
		
	}
	
	
	@RequestMapping("/hello")
	
	public String displayhello()
	{
		
		return "hello";
		
	}
	
	
	//@RequestMapping(value="/submit", method=RequestMethod.POST)
	@RequestMapping(value="/hello", method=RequestMethod.POST)
	public String displayName(@RequestParam("username") String username,@RequestParam("pwd") String pwd, Model m)
	{
	
		System.out.println(username); 
		System.out.println(pwd); 
		m.addAttribute("name", username);
		m.addAttribute("pwd", pwd);
		EmployeeDAO empdao = new EmployeeDAO();
		
		if(empdao.insertdata(username,pwd))
		{
		return "Registration";
		}
		else
		{	
		return "hello";
	}
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String addAttribute(@ModelAttribute Customer customer, Model model) {
		//model.addAttribute("msg", "Model Attribute");
		EmployeeDAO empdao = new EmployeeDAO();
		//empdao.insertCustomerData(customer);
		model.addAttribute("Customer", customer);
		empdao.insertCustomerData(customer);
		return "register";
		
	}
	
	
	
	


	@RequestMapping(value="/display", method=RequestMethod.POST)
	public String addAttribute(@ModelAttribute Customer customer, Model model, HttpServletRequest request) {
		EmployeeDAO empdao = new EmployeeDAO();
		model.addAttribute("Customer", customer);
		List<Customer> list=empdao.getcustomer();
		return "Display";
}
}