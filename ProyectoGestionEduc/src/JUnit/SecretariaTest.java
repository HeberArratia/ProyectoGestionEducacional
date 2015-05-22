package JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

import Diagramarefinado.Persona.Persona;
import Diagramarefinado.StaffAdministracion.Secretaria;

public class SecretariaTest {

	@Test
	public void test() {
	
		// Verficicar si ingreso correctamente
		// String resultado = "";
		// resultado = resultado = Secretaria.agregarNuevaSecretatia(new
		// Persona("Carola","Vergara","187003105"));
		// Resultado esperado: "Se ingreso nueva secretaria correctamente"
		// assertTrue(resultado == "Se ingreso nueva secretaria correctamente");
		// --> Aprobado
		
		// Verificar si la persona existe
		// String resultado = "";
		// resultado = resultado = Secretaria.agregarNuevaSecretatia(new Persona("Carola","Vergara","187003105"));
		// Resultado esperado: "La persona ya existe"
		// assertTrue(resultado == "La persona ya existe");
		// --> Aprobado
		
		// Verificar datos invalidos: Nombre de largo mayor a 20
		// String resultado = "";
		// resultado = resultado = Secretaria.agregarNuevaSecretatia(new Persona("Carolacarolacarolacarolacarola","Vergara","187003105"));
		// Resultado esperado: "valor no permitido"
		// assertTrue(resultado == "valor no permitido");
		// --> Aprobado

		// Verificar datos invalidos: Apellido de largo mayor a 20
		// String resultado = "";
		// resultado = resultado = Secretaria.agregarNuevaSecretatia(new Persona("Carola","Vergaravergaravergaravergara","187003105"));
		// Resultado esperado: "valor no permitido"
		// assertTrue(resultado == "valor no permitido");
		// --> Aprobado

		// Verificar datos invalidos: Rut de solo letras
		// String resultado = "";
		// resultado = resultado = Secretaria.agregarNuevaSecretatia(new Persona("Carola","Vergara","asdfghjklñ"));
		// Resultado esperado: "valor no permitido"
		// assertTrue(resultado == "valor no permitido");
		// --> Aprobado

		// Verificar datos invalidos: Rut de largo mayor a 9
		// String resultado = "";
		// resultado = resultado = Secretaria.agregarNuevaSecretatia(new Persona("Carola","Vergara","1870031052323"));
		// Resultado esperado: "valor no permitido"
		// assertTrue(resultado == "valor no permitido");
		// --> Aprobado

		// Verificar datos invalidos: Rut de largo menor a 9
		// String resultado = "";
		// resultado = resultado = Secretaria.agregarNuevaSecretatia(new Persona("Carola","Vergara","1870"));
		// Resultado esperado: "valor no permitido"
		// assertTrue(resultado == "valor no permitido");
		// --> Aprobado

		// Verificar datos invalidos: Rut con numeros y letras
		// String resultado = "";
		// resultado = resultado = Secretaria.agregarNuevaSecretatia(new Persona("Carola","Vergara","a2d4f5g6h6"));
		// Resultado esperado: "valor no permitido"
		// assertTrue(resultado == "valor no permitido");
		// --> Aprobado

		// // Verificar datos invalidos: El nombre son numeros
		// String resultado = "";
		// resultado = resultado = Secretaria.agregarNuevaSecretatia(new Persona("1001203","Vergara","187003105"));
		// // Resultado esperado: "valor no permitido"
		// assertTrue(resultado == "valor no permitido");
		// // --> Aprobado

		// // Verificar datos invalidos: El apellido son numeros
		// String resultado = "";
		// resultado = resultado = Secretaria.agregarNuevaSecretatia(new Persona("Carola","039320","187003105"));
		// // Resultado esperado: "valor no permitido"
		// assertTrue(resultado == "valor no permitido");
		// // --> Aprobado
		
//		 // Verificar datos invalidos: El nombre son numeros y letras
//		 String resultado = "";
//		 resultado = resultado = Secretaria.agregarNuevaSecretatia(new Persona("C4ar3o22la","Vergara","187003105"));
//		 // Resultado esperado: "valor no permitido"
//		 assertTrue(resultado == "valor no permitido");
//		 // --> Aprobado
//		 
//		// Verificar datos invalidos: El nombre son numeros y letras
//		String resultado = "";
//		resultado = resultado = Secretaria.agregarNuevaSecretatia(new Persona("Carolsqdsa", "Vergara", "187003105"));
//		// Resultado esperado: "valor no permitido"
//		assertTrue(resultado == "valor no permitido");
//		// --> Aprobado

		// Verficicar si ingreso correctamente
		String resultado = "";
		resultado = Secretaria.agregarNuevaSecretatia(new Persona("Carola", "Vergara", "183511203"));
		// Resultado esperado: "Se ingreso nueva secretaria correctamente"
		assertTrue(resultado == "Se ingreso nueva secretaria correctamente");
		// --> Aprobado
	}


}
