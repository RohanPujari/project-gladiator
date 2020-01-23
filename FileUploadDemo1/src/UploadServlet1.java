
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartRequest;

public class UploadServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init() {
		System.out.println("---------------------------");
		System.out.println("Init nethod is called in " + this.getClass().getName());
		System.out.println("---------------------------");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		MultipartRequest multipartRequest = new MultipartRequest(request,"C:\\chips");
		out.println("Successfully loaded");

	}

	public void destroy() {
		System.out.println("---------------------------");
		System.out.println("Init nethod is called in " + this.getClass().getName());
		System.out.println("---------------------------");
	}

}
