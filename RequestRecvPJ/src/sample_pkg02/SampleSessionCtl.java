package sample_pkg02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SampleSessionCtl
 */
@WebServlet("/SampleSessionCtl")
public class SampleSessionCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SampleSessionCtl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
	    response.setContentType("text/html; charset=UTF-8");

	    String userName = request.getParameter("UserName");
	    String gameName = request.getParameter("GameName");

	    HttpSession session = request.getSession();
	    session.setAttribute("UserName", userName);
	    session.setAttribute("GameName", gameName);

		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();

		out.println("<html>");
	    out.println("<head>");
	    out.println("<title>セッションの生成</title>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<h1>セッションの生成(ページ1)</h1>");
	    out.println("<p>あなたの名前は「"+userName+"』です。</p>");
	    out.println("<p>好きなゲームは「"+gameName+"」です。</p>");
	    out.println("<p>セッションIDは『"+session.getId()+"』</p>");
	    out.println("<a href=\"SampleSessionGetServlet\">次のサーブレット呼び出し</a>");
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
