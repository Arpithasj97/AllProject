

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AssignServlet
 */

@WebServlet("/AssignServlet")
public class AssignServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AssignServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		PrintWriter pw =response.getWriter();
		//System.out.println("hello world");
		String uname=request.getParameter("name");
		String password=request.getParameter("password");
		HttpSession session=request.getSession();
		session.setAttribute("session",uname);
		System.out.println("session id:"+session.getId());

	//	Connection con=Login.getConnection();
		response.setContentType("text/html");
		
		


if(uname.toLowerCase().equals("admin") && password.toLowerCase().equals("admin")) {
			
				RequestDispatcher rd=request.getRequestDispatcher("Button.jsp");
			rd.forward(request, response);
			//response.sendRedirect("NewFile.jsp");
		}
		
		
		
		else if(uname.toLowerCase().equals("user1") && password.toLowerCase().equals("pwd1")) {
			RequestDispatcher rd=request.getRequestDispatcher("Registration.jsp");
		rd.include(request, response);
		}
		
		else if(uname.toLowerCase().equals("user2") && password.toLowerCase().equals("pwd2")) {
			RequestDispatcher rd=request.getRequestDispatcher("Registration.jsp");
		rd.include(request, response);
		}
		
		else {
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
			pw.println("<b> you have  entered wrong details please check</b>");
		}
		

	
	}

}
