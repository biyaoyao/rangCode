package codeRand;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class getSesstion extends HttpServlet {
@Override
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();
	HttpRequest req=new HttpRequest();
	String ip=req.getRemortIP(request);
	
	System.out.println("ip:"+ip);
	out.println("{'code':"+request.getSession().getAttribute("code")+"}");
	out.flush();
	out.close();
}
}
