package sample_pkg02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestRecv
 */
@WebServlet("/RequestRecv")
public class RequestRecv extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestRecv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
	    response.setContentType("text/html; charset=UTF-8");

		String gameName = request.getParameter("GAME");
		String hardName = request.getParameter("Hard");


		PrintWriter out = response.getWriter();


		out.println("<html>");
		out.println("<head>");
	    out.println("<title>あなたの回答</title>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<h1>あなたの回答</h1>");
	    out.println("好きなゲームは" + gameName + "です。");
	    out.println("初めて購入したハードは" + hardName + "です。");
	    out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
