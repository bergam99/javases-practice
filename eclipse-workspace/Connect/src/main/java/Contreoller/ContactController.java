package Contreoller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/contact")
public class ContactController extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public ContactController() {
    	super();
    }
	protected void doGet(jakarta.servlet.http.HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("---in contact controller");
		request.getRequestDispatcher("/index.jsp").forward(request, response);
}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
