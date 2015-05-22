package controlador;

import java.rmi.RemoteException;
import java.util.Scanner;

import servico.ServicioMatriculaProxy;

public class AppConsola {

	public static void main(String[] args) {
		// Instancia de la clase ServicioMatriculaProxy
				ServicioMatriculaProxy ser = new ServicioMatriculaProxy();
				Scanner in = new Scanner(System.in);
				// Menu para el usuario
				System.out.println("***Bienvenido Director***" + 
				"\n" + "Ingese tarea: " + 
				"\n" + "1.- Pagar Matr�cula" + 
				"\n" + "2.- Obtener lista estudiantes morosos pago matr�cula");
				// Capturamos seleccion del usuario
				String dato = in.next();
				try {
					// Ejecutamos una accion dependiendo de la opcion del usuario
					switch (dato) {
					case "1":
						// Capturamos el rut del estudiante
						System.out.println("Ingrese rut del estudiante a pagar");
						String rut = in.next();
						// Llamamos al metodo que efectua el pago de matricula y le pasamos el rut
						System.out.println(ser.pagoDeMatricula(rut, "183511203", 20000));
						break;
					case "2":
						// Llamamos al metodo que devuelve la lista de estudiantes morosos
						System.out.println(ser.obtenerListaMorosos());
						break;
					default:
						// Si el usuario ingresa una opcion no existente, imprimimos un mensaje
						System.out.println("Debe ingresar una tarea existente");
						break;
					}
					// Termina la ejecucion
					System.out.println("Termina la ejecucion");
					
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}

}