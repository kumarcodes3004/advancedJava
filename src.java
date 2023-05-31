

import java.io.IOException;
import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class src
 */
public class src extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public src() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
//		String gender=request.getParameter("gender");
		String kamai=request.getParameter("income");
		String tax=request.getParameter("tax");
		PrintWriter pw=response.getWriter();
		pw.println("<h2> Hi! "+name);
		pw.println("<h2> Salary is: "+kamai+"<h2>Tax Looted is: "+tax);
		File f=new File("C:/Users/pande/OOADP_Lab/JAVA_Lab/Practice/q6/src/main/java/kachra.txt");
		f.createNewFile();
		FileOutputStream fout=new FileOutputStream(f);
		fout.write(("Hello"+name+" "+"Your Earning is: "+kamai+" Out of which "+tax+" is looted by the government.").getBytes());
		fout.close();
		pw.close();
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
