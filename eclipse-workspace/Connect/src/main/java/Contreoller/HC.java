package Contreoller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HC
 */
@WebServlet({"", "/accueil"})
public class HC extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public HC() {
    	super();
    }

	protected void doGet(jakarta.servlet.http.HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("--- in home controller");
		
		if(request.getParameter("cat-femme") != null) {
			category = (String) request.getParameter("cat-femme");
			System.out.println("---" + category + "---");
		}else if(request.getParameter("cat-homme") != null) {
			category = (String) request.getParameter("cat-homme);
			System.out.println("---" + category + "---");
		}else if(request.getParameter("cat-enfant") != null) {
			category = (String) request.getParameter("cat-enfant);
			System.out.println("---" + category + "---");
		}
		
		request.getRequestDispatcher("/index.jsp").forward(request, response);
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

//
//package Contreoller;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest; 
//import jakarta.servlet.http.HttpServletResponse; 
//import java.io.IOException;
//
//
//import DAO.UserAcces; 
//import Entity.User;
//
//@WebServlet({"", "/accueil"})
//
//public class homecontroller extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//	public homecontroller() { 
//		super();
//	}
//	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	request.getRequestDispatcher("/index.jsp").forward(request, response);
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//			String login = ""; 
//			String pass = "";
//			
//			try {
//				
//				System.out.println("Je suis dans try"); 
//				login = request.getParameter("txt-login");
//				pass = request.getParameter("txt-pass"); 
//				System.out.println(login); 
//				System.out.println(pass);
//				
//				User user = UserAcces.ifUserExist(login, pass);
//				System.out.println(user.getLogin);
//				System.out.println(user.getPassword);
//
//				if(user != null) { 
//					response.sendRedirect(request.getContextPath() + "/catalogue");
//					System.out.println(sans user);
//				
//				} else {
//					request.getRequestDispatcher("/index.jsp").forward(request, response);
//					System.out.println(avec user);
//				}
//				
//			} catch(Exception e) {
//				e.printStackTrace();
//				System.out.println("pas de data dans le input de la jsp");
//				System.out.println("Je suis dans le catch"); 
//			}
//		} 
//	}
//	
//	
