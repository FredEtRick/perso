package com.activite.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServCalculatrice
 */
public class ServCalculatrice extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServCalculatrice() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String nb1Text = request.getParameter("nombre1");
		String nb2Text = request.getParameter("nombre2");
		Double nb1;

		Double nb2;

		if (nb1Text.length() == 0) {
			nb1 = 0.0;
		} else {
			nb1 = Double.parseDouble(nb1Text);
		}
		if (nb2Text.length() == 0) {
			nb2 = 0.0;
		} else {
			nb2 = Double.parseDouble(nb2Text);
		}

		String operateur = request.getParameter("operation");
		String nomOp;

		double resultat = 0;

		if (operateur.equals("+")) {
			nomOp = "l'addition";
			resultat = nb1 + nb2;
		} else if (operateur.equals("-")) {
			resultat = nb1 - nb2;
			nomOp = "la soustraction";
		} else if (operateur.equals("*")) {
			resultat = nb1 * nb2;
			nomOp = "la multiplication";
		} else {
			if (nb2 != 0) {
				resultat = (double) nb1 / nb2;
				nomOp = "la division";
			} else {
				nomOp = "div0";
			}

		}

		request.setAttribute("resultat", resultat);
		request.setAttribute("nomOperation", nomOp);

		this.getServletContext().getRequestDispatcher("/calculatrice.jsp")
				.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
