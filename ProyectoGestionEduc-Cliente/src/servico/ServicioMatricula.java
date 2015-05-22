/**
 * ServicioMatricula.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package servico;

public interface ServicioMatricula extends java.rmi.Remote {
    public java.lang.String obtenerListaMorosos() throws java.rmi.RemoteException;
    public java.lang.String pagoDeMatricula(java.lang.String rutEstudiante, java.lang.String rutSecretaria, int monto) throws java.rmi.RemoteException;
}
