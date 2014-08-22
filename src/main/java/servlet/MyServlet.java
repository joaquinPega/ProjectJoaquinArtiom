package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.EventManager;

@SuppressWarnings("serial")
public class MyServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		EventManager.createAndStoreAderezo(req.getParameter("nombre"),req.getParameter("descripcion"));
		resp.getWriter().write("LLEGO; MIRA LA BASE DE DATOS");
	}
	
}
