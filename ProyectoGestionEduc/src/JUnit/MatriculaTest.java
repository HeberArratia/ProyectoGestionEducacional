package JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

import Diagramarefinado.Finanza.Matricula;

public class MatriculaTest {

	@Test
	public void test() {
		 //Verificar si se paga una matricula
		 String resultado = "";
		 resultado = Matricula.pagarMatricula("187003105", "183511203", 20000);
		 //Resultado esperado: "matricula pagada"
		 assertTrue(resultado == "matricula pagada");
		 //--> aprobada
		
		// Verificar si no existe estudiante o secretaria
		// String resultado = "";
		// resultado = Matricula.pagarMatricula("1834532132122",
		// "183511213203",20000);
		// Resultado esperado: "no existe estudiante o secretaria"
		// assertTrue(resultado == "no existe estudiante o secretaria");
		// --> aprobado

		// Verificar si matricula se encuentra pagada
		// String resultado = "";
		// resultado = Matricula.pagarMatricula("187003105", "183511203",20000);
		// Resultado esperado: "valor no permitido"
		// assertTrue(resultado == "la matricula ya se encuentra pagada");
		// --> aprobado

//		for(int i=0;i<Matricula.obtenerListMorososMatricula().length;i++){
//			JOptionPane.showMessageDialog(null, Matricula.obtenerListMorososMatricula()[i].getPersona().getNombre());
//		}
	}

}
