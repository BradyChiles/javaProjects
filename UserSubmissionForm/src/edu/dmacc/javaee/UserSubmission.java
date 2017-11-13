package edu.dmacc.javaee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserSubmission
 */
@WebServlet("/userSubmission")
public class UserSubmission extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserSubmission() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>User Information</title>");
		out.println("<body>");
		out.println("<h2>User Information<h2>");
		
		String firstName = request.getParameter("firstname");
		
		if(firstName == null || (firstName = htmlFilter(firstName.trim())).length() == 0) {
			out.println("<p>First Name: *Missing*</p>");
		} else {
			out.println("<p>First Name: " + firstName + "</p>");
		}
		
		String lastName = request.getParameter("lastname");
		
		if(lastName == null || (lastName = htmlFilter(lastName.trim())).length() == 0) {
			out.println("<p>Last Name: *Missing*</p>");
		} else {
			out.println("<p>Last Name: " + lastName + "</p>");
		}
		
		String address = request.getParameter("address");
		
		if(address == null || (address = htmlFilter(address.trim())).length() == 0) {
			out.println("<p>Address: *Missing*</p>");
		} else {
			out.println("<p>Address: " + address + "</p>");
		}
		
		
		String city = request.getParameter("city");
		
		if(city == null || (firstName = htmlFilter(city.trim())).length() == 0) {
			out.println("<p>City: *Missing*</p>");
		} else {
			out.println("<p>City: " + city + "</p>");
		}
		
		
		String state = request.getParameter("state");
		
		if(state == null || (state = htmlFilter(state.trim())).length() == 0) {
			out.println("<p>State: *Missing*</p>");
		} else {
			out.println("<p>State: " + state + "</p>");
		}
		
		
		String zip = request.getParameter("zip");
		
		if(zip == null || (zip = htmlFilter(zip.trim())).length() == 0) {
			out.println("<p>Zip: *Missing*</p>");
		} else {
			out.println("<p>Zip: " + zip + "</p>");
		}
		
		
		String email = request.getParameter("email");
		
		if(email == null || (email = htmlFilter(email.trim())).length() == 0) {
			out.println("<p>Email: *Missing*</p>");
		} else {
			out.println("<p>Email: " + email + "</p>");
		}
		
		
		String phone = request.getParameter("phone");
		
		if(phone == null || (phone = htmlFilter(phone.trim())).length() == 0) {
			out.println("<p>Phone: *Missing*</p>");
		} else {
			out.println("<p>Phone: " + phone + "</p>");
		}
		
		
		String [] cooking = request.getParameterValues("cooking");
		
		if (cooking == null || cooking.length == 0) {
			out.println("<p>Additional Cooking Information: None</p>");
			
		} else {
			out.println("<p>Additional Cooking Information: ");
			
			for (String info : cooking) {
				if(info.equals("newsletter")) {
					out.println("Newsletter ");
				}else if(info.equals("classes")) {
					out.println("Classes ");
				}else if(info.equals("recipes")) {
					out.println("Recipes ");
				}else if(info.equals("private")) {
					out.println("Private-Chefs ");
				}
			}
			out.println("</p>");
		}
		
		
		String comments = request.getParameter("comments");
		
		if(comments == null || (comments = htmlFilter(comments.trim())).length() == 0) {
			out.println("<p>Comments: None</p>");
		} else {
			out.println("<p>Comments: " + comments + "</p>");
		}
		
		
		out.println("<a href ='index.jsp'>Back</a>");
		
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}
	//This code block was taken from ntu.edu.sg
	//https://www.ntu.edu.sg/home/ehchua/programming/java/JavaServlets.html
	 private static String htmlFilter(String message) {
	      if (message == null) return null;
	      int len = message.length();
	      StringBuffer result = new StringBuffer(len + 20);
	      char aChar;
	 
	      for (int i = 0; i < len; ++i) {
	         aChar = message.charAt(i);
	         switch (aChar) {
	             case '<': result.append("&lt;"); break;
	             case '>': result.append("&gt;"); break;
	             case '&': result.append("&amp;"); break;
	             case '"': result.append("&quot;"); break;
	             default: result.append(aChar);
	         }
	      }
	      return (result.toString());
	   }

}
