



package com.ltts.controller;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ltts.dao.PlayerDao;
import com.ltts.model.Player;

/**
 * Servlet implementation class InsertPlayerServlet
 */
@WebServlet("/UpdatePlayerServlet")
public class UpdatePlayerServlet extends HttpServlet {
	
    public UpdatePlayerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		doGet(request, response);
		int id=Integer.parseInt(request.getParameter("id"));
		String pname=request.getParameter("pname");
		String count=request.getParameter("pcountry");
		RequestDispatcher rd=null;
		PlayerDao po=new PlayerDao();
		try {
			po.updatePlayer(id,pname,count);
			rd=request.getRequestDispatcher("success.html");
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			rd=request.getRequestDispatcher("editplayer.jsp");
			rd.include(request, response);
			e.printStackTrace();
		}

	
}
}