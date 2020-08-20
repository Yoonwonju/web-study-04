package unit02;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ActionTagServlet")
public class ActionTagServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userID = request.getParameter("userID");
		String userPwd = request.getParameter("userPwd");
		String loginCheck = request.getParameter("loginCheck");
		
		request.setCharacterEncoding("UTF-8");
		if(loginCheck.equals("user")) {
			request.setAttribute("userName", "유우저");
			request.setAttribute("userID", userID);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("userMain.jsp");
			dispatcher.forward(request, response);
		}else {
			request.setAttribute("userName", "관리자");
			request.setAttribute("userID", userID);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("managerMain.jsp");
			dispatcher.forward(request, response);
		}
		
	}
	
}
