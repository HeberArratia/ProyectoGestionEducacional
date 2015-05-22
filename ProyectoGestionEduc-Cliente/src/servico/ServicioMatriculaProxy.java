package servico;

public class ServicioMatriculaProxy implements servico.ServicioMatricula {
  private String _endpoint = null;
  private servico.ServicioMatricula servicioMatricula = null;
  
  public ServicioMatriculaProxy() {
    _initServicioMatriculaProxy();
  }
  
  public ServicioMatriculaProxy(String endpoint) {
    _endpoint = endpoint;
    _initServicioMatriculaProxy();
  }
  
  private void _initServicioMatriculaProxy() {
    try {
      servicioMatricula = (new servico.ServicioMatriculaServiceLocator()).getServicioMatricula();
      if (servicioMatricula != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)servicioMatricula)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)servicioMatricula)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (servicioMatricula != null)
      ((javax.xml.rpc.Stub)servicioMatricula)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public servico.ServicioMatricula getServicioMatricula() {
    if (servicioMatricula == null)
      _initServicioMatriculaProxy();
    return servicioMatricula;
  }
  
  public java.lang.String obtenerListaMorosos() throws java.rmi.RemoteException{
    if (servicioMatricula == null)
      _initServicioMatriculaProxy();
    return servicioMatricula.obtenerListaMorosos();
  }
  
  public java.lang.String pagoDeMatricula(java.lang.String rutEstudiante, java.lang.String rutSecretaria, int monto) throws java.rmi.RemoteException{
    if (servicioMatricula == null)
      _initServicioMatriculaProxy();
    return servicioMatricula.pagoDeMatricula(rutEstudiante, rutSecretaria, monto);
  }
  
  
}