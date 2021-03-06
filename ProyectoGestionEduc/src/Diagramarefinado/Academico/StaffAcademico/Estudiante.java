package Diagramarefinado.Academico.StaffAcademico;

import org.orm.PersistentException;

import Diagramarefinado.Persona.*;

/**
 * Clase Estudiante perteneciente a la capa de negocios
 * 
 * @author Heber Arratia
 *
 */
public class Estudiante extends Persona {
	public Estudiante(String nombre, String apellido, String rut) {
		super(nombre, apellido, rut);
		// TODO Auto-generated constructor stub
	}
	/**
	 * Metodo que registra un nuevo estudiante en la base datos y le asocia una
	 * matricla
	 * 
	 * @param nuevaPersona
	 *            la cual se agrega como un nuevo estudiante
	 * @param rutSecretaria
	 *            que asigna el estado actual de la matrícula
	 * @return la cadena de texto correspondiente al resultado de una validación
	 */
	public static String agregarNuevoEstudiante(Persona nuevaPersona,
			String rutSecretaria) {
		try {
			// Validar que los atributos asignados a la nueva persona puedan ser
			// aceptados
			if (nuevaPersona.validarAtributos()) {

				// Condicion de busqueda de la secretaria
				String condicionSecretaria = "persona.rut='" + rutSecretaria
						+ "'";
				// Asignar secretaria con el rut especificado
				orm.Secretaria lormSecretaria = orm.SecretariaDAO
						.loadSecretariaByQuery(condicionSecretaria, null);
				if (lormSecretaria != null) {

					// Se establece una condicion de busqueda
					String condicionPersona = "rut='" + nuevaPersona.getRut()
							+ "'";
					// Se asigna a la variable lormPersonaBuscar, la persona con
					// la condicion establecida
					orm.Persona lormPersonaBuscar = orm.PersonaDAO
							.loadPersonaByQuery(condicionPersona, null);
					// Si la persona no existe
					if (lormPersonaBuscar == null) {
						// Crear nueva persona
						orm.Persona lormPersona = orm.PersonaDAO
								.createPersona();
						// Enviar valores a persona encontrados en el objeto
						// Persona
						// recibido por parametro.
						lormPersona.setNombre(nuevaPersona.getNombre());
						lormPersona.setApellido(nuevaPersona.getApellido());
						lormPersona.setRut(nuevaPersona.getRut());
						// Guardar persona
						orm.PersonaDAO.save(lormPersona);

						// Crear un nuevo estudiante
						orm.Estudiante lormEstudiante = orm.EstudianteDAO
								.createEstudiante();
						// Asignar persona a estudiante
						lormEstudiante.setPersona(lormPersona);
						// Guardar Estudiante
						orm.EstudianteDAO.save(lormEstudiante);

						// Crear matricula
						orm.Matricula lormMatricula = orm.MatriculaDAO
								.createMatricula();
						// Enviar valores a matricula
						lormMatricula.setEstudiante(lormEstudiante);
						lormMatricula.setSecretaria(lormSecretaria);
						lormMatricula.setEstadoMatricula(0);
						lormMatricula.setMonto(0);

						// Guardar matricula
						orm.MatriculaDAO.save(lormMatricula);

						// Si todo se hace de manera correcta se retorna mensaje
						return "Se ingreso nuevo alumno correctamente";
					} else {
						return "La persona ya existe";
					}

				} else {
					return "La secretaria ingresada no existe";
				}
			} else {
				return "valor no permitido";
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void inscribirAlumnos() {
		// TODO - implement Estudiante.inscribirAlumnos
		throw new UnsupportedOperationException();
	}

	/**
	 * Metodo que busca un estudiante en la base de datos y lo retorna
	 * 
	 * @param rut
	 *            del estudiante
	 * @return estudiante buscado
	 */
	public static orm.Estudiante buscarEstudiate(String rut) {
		// Condicion de busqueda de el estudiante
		String condicionEstudiante = "persona.rut='" + rut + "'";
		orm.Estudiante lormEstudiante = null;
		try {
			// Asignar estudiante con el rut especificado
			lormEstudiante = orm.EstudianteDAO.loadEstudianteByQuery(
					condicionEstudiante, null);
			// Si el estudiante especificado existe, se puede proceder
			if (lormEstudiante != null) {
				return lormEstudiante;

			} else {
				return null;
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}