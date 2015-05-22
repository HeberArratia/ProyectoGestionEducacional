package servico;

import Diagramarefinado.Finanza.Matricula;

public class ServicioMatricula {
	/**
	 * Este metodo permite pagar una matricula
	 * 
	 * @param rutEstudiante al cual se le paga la matricula
	 * @param rutSecretaria quien paga la matricula
	 * @param monto 
	 * @return Devuelve el mensaje de confirmacion del metodo "Matricula.pagarMatricula()"
	 */
	public String pagoDeMatricula(String rutEstudiante,String rutSecretaria, int monto){
		// Se llama al metodo contenido en la libreria jar y se la pasan los parametros correspondientes
		return Matricula.pagarMatricula(rutEstudiante, rutSecretaria, monto);
	}
	
	/**
	 * Metodo que permite conocer una lista de estudiantes morosos en los pagos de matricula
	 * 
	 * @return Devuelve el mensaje de confirmacion del metodo "Matricula.obtenerListMorososMatricula()"
	 */
	public String obtenerListaMorosos(){
		String cadena = "";
		// Se llama al metodo contenido en la libreria jar y se la pasan los parametros correspondientes
		// Este metodo devuelve un arreglo de estudiantes 
		orm.Estudiante[] est = Matricula.obtenerListMorososMatricula();	
		// Se reccore el arreglo y se almacena c/u de los datos de un estudiante
		for(int i=0;i<est.length;i++){ 	
			cadena += est[i].getPersona().getNombre() +" " +est[i].getPersona().getApellido()+
					" "+est[i].getPersona().getRut() +" "+ est[i].getMatricula().getEstadoMatricula()+"\n";
		} 
		// Se retorna la cadena con la lista de estudiantes
		return cadena;
	}
}
