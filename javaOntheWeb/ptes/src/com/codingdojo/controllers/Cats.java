package com.codingdojo.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingdojo.models.cat;

@WebServlet("/Cats")
public class Cats extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Cats() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("cname");
		String breed = request.getParameter("cbreed");
		int weight = Integer.parseInt(request.getParameter("cweight"));
		
		
		System.out.println("name" +  name );
		System.out.println("weight" +  weight );
		
		cat cat1= new cat(name, breed, weight);
		request.setAttribute("cat1",cat1);
		RequestDispatcher view  = request.getRequestDispatcher("/WEB-INF/cat.jsp");
		view.forward(request, response);

	} 

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);


	}

}
