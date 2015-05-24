package JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

import Diagramarefinado.Academico.StaffAcademico.Estudiante;
import Diagramarefinado.Persona.Persona;

public class EstudianteTest {

	@Test
	public void test() {
		// Verificar si la persona existe
		// String resultado = "";
		// resultado = Estudiante.agregarNuevoEstudiante(new
		// Persona("Allan","Fernandez","184003103"),"183511203");
		// Resultado esperado: "La persona ya existe"
		// assertTrue(resultado == "La persona ya existe");
		// --> Aprobado

		 //Verficicar si ingreso correctamente
		 String resultado = "";
		 resultado = Estudiante.agregarNuevoEstudiante(new Persona("Katherine","Urzua","176548764"),"183511203");
		 // Resultado esperado: "Se ingreso nuevo alumno correctamente"
		 assertTrue(resultado == "Se ingreso nuevo alumno correctamente");
		 // --> Aprobado

		// Verificar datos invalidos: Nombre de largo mayor a 20
		// String resultado = "";
		// resultado = Estudiante.agregarNuevoEstudiante(new
		// Persona("Marcosmarcosmarcosmarcosmarcos","Reyes","186763"),"183511203");
		// Resultado esperado: "valor no permitido"
		// assertTrue(resultado == "valor no permitido");
		// --> Aprobado

		// Verificar datos invalidos: Apellido de largo mayor a 20
		// String resultado = "";
		// resultado = Estudiante.agregarNuevoEstudiante(new
		// Persona("Marcos","Reyesreyesreyesreyesreyes","186763"),"183511203");
		// Resultado esperado: "valor no permitido"
		// assertTrue(resultado == "valor no permitido");
		// --> Aprobado

		// Verificar datos invalidos: Rut de solo letras
		// String resultado = "";
		// resultado = Estudiante.agregarNuevoEstudiante(new
		// Persona("Marcos","Reyes","asdfghjkl"),"183511203");
		// Resultado esperado: "valor no permitido"
		// assertTrue(resultado == "valor no permitido");
		// --> Aprobado
		
		// Verificar datos invalidos: Rut de largo mayor a 9
		// String resultado = "";
		// resultado = Estudiante.agregarNuevoEstudiante(new
		// Persona("Marcos","Reyes","186763232233"),"183511203");
		// Resultado esperado: "valor no permitido"
		// assertTrue(resultado == "valor no permitido");
		// --> Aprobado
		
		// Verificar datos invalidos: Rut de largo menor a 9
		// String resultado = "";
		// resultado = Estudiante.agregarNuevoEstudiante(new
		// Persona("Marcos","Reyes","186763"),"183511203");
		// Resultado esperado: "valor no permitido"
		// assertTrue(resultado == "valor no permitido");
		// --> Aprobado
		
		// Verificar datos invalidos: Rut con numeros y letras
		// String resultado = "";
		// resultado = Estudiante.agregarNuevoEstudiante(new
		// Persona("Marcos","Reyes","1h2g3s6d7"),"183511203");
		// Resultado esperado: "valor no permitido"
		// assertTrue(resultado == "valor no permitido");
		// --> Aprobado
		
		// // Verificar datos invalidos: El nombre son numeros
		// String resultado = "";
		// resultado = Estudiante.agregarNuevoEstudiante(new Persona("1234",
		// "Machuca", "123456542"), "183511203");
		// // Resultado esperado: "valor no permitido"
		// assertTrue(resultado == "valor no permitido");
		// // --> Aprobado

		// // Verificar datos invalidos: El apellido son numeros
		// String resultado = "";
		// resultado = Estudiante.agregarNuevoEstudiante(new Persona("Javier",
		// "010101", "123456542"), "183511203");
		// // Resultado esperado: "valor no permitido"
		// assertTrue(resultado == "valor no permitido");
		// // --> Aprobado
		
		// // Verificar datos invalidos: El nombre son numeros y letras
		// String resultado = "";
		// resultado = Estudiante.agregarNuevoEstudiante(new Persona("0s1d0sa101",
		// "Machuca", "123456542"), "183511203");
		// // Resultado esperado: "valor no permitido"
		// assertTrue(resultado == "valor no permitido");
		// // --> Aprobado

		// // Verificar datos invalidos: El apellido son numeros y letras
		// String resultado = "";
		// resultado = Estudiante.agregarNuevoEstudiante(new Persona("Javier",
		// "0s1d0sa101", "123456542"), "183511203");
		// // Resultado esperado: "valor no permitido"
		// assertTrue(resultado == "valor no permitido");
		// // --> Aprobado
		
		// Verificar que secretaria exista
		// String resultado = "";
		// resultado = Estudiante.agregarNuevoEstudiante(new
		// Persona("Maximiliano","Toloza","186536322"),"18351122131203");
		// Resultado esperado: "La secretaria ingresada no existe"
		// assertTrue(resultado == "La secretaria ingresada no existe");
		// --> Aprobado
		
		
//		 // Buscar estudiante no existente
//		 String resultado = "";
//		 orm.Estudiante es = Estudiante.buscarEstudiate("187003105122");
//		 // Resultado esperado: "null"
//		 assertTrue(es == null);
//		 // --> Aprobado

	}

}
