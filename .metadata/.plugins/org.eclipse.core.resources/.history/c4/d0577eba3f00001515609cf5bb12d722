package Controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import Diagramarefinado.Academico.StaffAcademico.Estudiante;
import Diagramarefinado.Finanza.Matricula;

/**
 * Servlet implementation class BuscarEstudiante
 */
public class BuscarEstudiante extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscarEstudiante() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Almacenar valor en variable rut ingresado en input con propiedad "name=rut"
				String rutcap = request.getParameter("rut");
				orm.Estudiante est = Estudiante.buscarEstudiate(rutcap);
				
				if (est!=null){
					// Capturar valores del estudiante
					String nombre = est.getPersona().getNombre();
					String apellido = est.getPersona().getApellido();
					int  estado = +est.getMatricula().getEstadoMatricula();
					// Incluir valores en el fichero jsp 
					request.setAttribute("nombre",  nombre );  
					request.setAttribute("apellido",  apellido );  
					request.setAttribute("rut",  rutcap );  
					if (estado==1){
						request.setAttribute("estado",  "Pagada" ); 
					} else {
						request.setAttribute("estado",  "Por pagar" ); 
					}		
					
				} else{
					request.setAttribute("error",  "<div class='alert alert-danger' role='alert'><strong>Rut invalido!"
							+ " </strong> El rut ingresado no pertenece "
							+ "a un estudiante registrado. </div>" );
				}
				
				
				// Volver la respuesta al mismo formulario
				request.getRequestDispatcher("/PagarMatricula.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
