package Controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Diagramarefinado.Academico.StaffAcademico.Estudiante;
import Diagramarefinado.Finanza.Matricula;

/**
 * Servlet implementation class RegistrarPagoMatricula
 */
public class RegistrarPagoMatricula extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrarPagoMatricula() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Almacenar dato en variable rutregistro ingresado en input con propiedad "name=rutregistro"
	    String rutregistro = request.getParameter("rutregistro");
	   // Variable que almacena respuesta que se imprime al usuario
	 	String mensaje = "";
	    // Pagar la matricula del estudiante y guardar resultado en variable
	    String resultado = Matricula.pagarMatricula(rutregistro, "183511203", 20000);
	    // Se imprime un resultado dependiendo del valor de retorno de la funcion
	    if (resultado=="matricula pagada"){
	    	 mensaje = "<div class='alert alert-success' role='alert'><strong>Todo bien! </strong> Estudiante "
						+ "" + rutregistro + " registrado con exito. </div>";
	    } else if (resultado=="la matricula ya se encuentra pagada"){
	    	 mensaje = "<div class='alert alert-danger' role='alert'><strong>Oh no! </strong> El estudiante "
						+ "" + rutregistro + " posee matrícula pagada con anteioridad. </div>";
	    } else{
	    	mensaje = "<div class='alert alert-danger' role='alert'><strong>Oh no! </strong> Error! no se "
	    			+ "registro el pago de matrícula. </div>";
	    }
		
		// Incluir parámetro mensaje en el fichero jsp 
		request.setAttribute("mensajeregistro",  mensaje );  
		// Regresar la respuesta al mismo formulario
		request.getRequestDispatcher("/PagarMatricula.jsp").forward(request, response);
	}

}
