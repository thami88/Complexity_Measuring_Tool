package com.Weight;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ControlStructures.ComplexityMeasureCs;
import com.servlet.codeServlet;


@WebServlet("/WeightControlStructures")
public class WeightControlStructures extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public WeightControlStructures() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String button = request.getParameter("submit");
		
		
		String weightIf =  request.getParameter("weightIf");
		String weightCase =  request.getParameter("weightCase");
		String weightFor =  request.getParameter("weightFor");
		
		if(button.equals("save")) {
			ComplexityMeasureCs cs = new ComplexityMeasureCs();
			cs.weights(Integer.parseInt(weightIf), Integer.parseInt(weightCase),Integer.parseInt(weightFor));
		
		
		
		codeServlet cs = new codeServlet();
		String code = cs.returnCode();
		//System.out.println(code);
		//Coupling couling = new Coupling();
		cs.setCode(code);
		String tb =	cs.getTable();
		request.setAttribute("tb", tb);
		request.getRequestDispatcher("controll_structures.jsp").forward(request, response);
		
		}
		doGet(request, response);
	}


	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
