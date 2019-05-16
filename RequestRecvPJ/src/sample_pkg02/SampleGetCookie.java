package sample_pkg02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class SampleGetCookie
 */
@WebServlet("/SampleGetCookie")
public class SampleGetCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SampleGetCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
	    response.setContentType("text/html; charset=UTF-8");

		// TODO Auto-generated method stub
		Cookie[] cookies = request.getCookies();
		String gameTitle = "";
		String gameNumbering = request.getParameter("GameNumbering");

		if(cookies != null ) {
			for (Cookie cook:cookies) {
				if(cook.getName().equals("GameTitle")) {
					gameTitle = cook.getValue();
				}
			}
		}

		PrintWriter out = response.getWriter();

	    out.println("<html>");
	    out.println("<head>");
	    out.println("<title>クッキーサンプル</title>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<h1>クッキーサンプル</h1>");
	    out.println("好きなゲームは" + gameTitle + "です。<br />");
	    out.println("ナンバリングは" + gameNumbering + "です。<br />");
	    out.println("</body>");
	    out.println("</html>");

	}

}
