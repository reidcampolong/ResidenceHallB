package me.reid.Servlets.Login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import me.reid.Preferences.Log;
import me.reid.Preferences.Preferences;

/**
 * Servlet implementation class Verification
 * This class will handle the logic verification
 * of a login as well as log the user in to the
 * website
 */
@WebServlet("/Verification")
public class Verification extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Verification() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String passkey = request.getParameter("passkey");
		Log.i("Received passkey: " + passkey);

		if (validateLogin(passkey)) {
			// Allow login to home page
			HttpSession session = request.getSession();
			session.setAttribute("passkey", passkey);
			response.sendRedirect("home.jsp");
		} else {
			// Redirect to login page
			response.sendRedirect("error.jsp");
		}
	}
	
	protected boolean validateLogin(String passkey) {
		return passkey.equals(Preferences.key);
	}

}
