import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse; 
import java.sql.*; 

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
       System.out.println("inside servlet"); // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Inside Servlet");
		String uname =request.getParameter("username");
		String passw =request.getParameter("password");
		

		
		Connection con=Login.getConnection();
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		pw.print("<b>you have entered wrong user name and password<b>");
		
	if(Login.validate(uname,passw,con)) {
		 RequestDispatcher rd=request.getRequestDispatcher("Button.jsp");
		 rd.forward(request,response);
	}
	else {
		RequestDispatcher rd=request.getRequestDispatcher("Login.html");
		rd.include(request,response);
	
	}
	  /*  PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		pw.print("<b>you have entered wrong user name and password<b>");
		}
	   if(uname.toLowerCase().equals("admin")&& passw.toLowerCase().equals("admin"))
		{
		  RequestDispatcher rd=request.getRequestDispatcher("NextServlet");
		  rd.forward(request,response);
		 // response.sendRedirect("Fileone.jsp");
		}
		else {
			 RequestDispatcher rd=request.getRequestDispatcher("index.html");
			 
			 rd.include(request,response);
		}


	pw.print("<html>");
	pw.print("<body>");
	pw.print("<span id = time></span>");
	pw.print("<h1>hello</h1>"+"<input type=text value="+uname+"/>");
	pw.print("<form action=NextServlet>");
	pw.print("<form>");
	pw.print("<h1>hello </h1>");
	pw.print("<input type= text value=admin>");
	pw.print("<input type=submit> ");
	pw.print("</form>");
	pw.print("<script>");
	pw.print("setInterval(getTime,1000);");
	pw.print("function getTime() {document.getElementById('time').innerHTML=new Date()};");
	pw.print("</script>");
	pw.print("</body>");
	
	pw.print("</html>");
	System.out.println("inside doGet" + request);
	*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}


