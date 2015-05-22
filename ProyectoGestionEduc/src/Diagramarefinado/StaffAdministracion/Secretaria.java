package Diagramarefinado.StaffAdministracion;

import org.orm.PersistentException;

import Diagramarefinado.Persona.*;

/**
 * Clase Secretaria perteneciente a la capa de negocios
 * 
 * @author Heber Arratia
 * 
 */
public class Secretaria extends Persona {

	/**
	 * Metodo que registra una nueva Secretaria en la base de datos
	 * 
	 * @param nuevaPersona
	 *            la cual se agrega como una nueva secretaria
	 * @return la cadena de texto correspondiente al resultado de una validaci�n
	 */
	public static String agregarNuevaSecretatia(Persona nuevaPersona) {
		try {
			if (nuevaPersona.validarAtributos()) {
				// Se establece una condicion de busqueda
				String condicionPersona = "rut='" + nuevaPersona.getRut() + "'";
				// Se asigna a la variable lormPersonaBuscar, la persona con la
				// condicion establecida
				orm.Persona lormPersonaBuscar = orm.PersonaDAO
						.loadPersonaByQuery(condicionPersona, null);
				// Si la persona no existe
				if (lormPersonaBuscar == null) {
					// Crear nueva persona
					orm.Persona lormPersona = orm.PersonaDAO.createPersona();
					// Enviar valores a persona encontrados en el objto Persona
					// recibido por parametro.
					lormPersona.setNombre(nuevaPersona.getNombre());
					lormPersona.setApellido(nuevaPersona.getApellido());
					lormPersona.setRut(nuevaPersona.getRut());
					// Guardar persona
					orm.PersonaDAO.save(lormPersona);

					// Crear nueva secretaria
					orm.Secretaria lormSecretaria = orm.SecretariaDAO
							.createSecretaria();
					lormSecretaria.setPersona(lormPersona);
					// Guardar secretaria
					orm.SecretariaDAO.save(lormSecretaria);
					return "Se ingreso nueva secretaria correctamente";
				} else {
					return "La persona ya existe";
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

}