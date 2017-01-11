package SubmitMouse.WebService.ACK;

public class MouseAuthentificationServiceSoapProxy implements SubmitMouse.WebService.ACK.MouseAuthentificationServiceSoap {
  private String _endpoint = null;
  private SubmitMouse.WebService.ACK.MouseAuthentificationServiceSoap mouseAuthentificationServiceSoap = null;
  
  public MouseAuthentificationServiceSoapProxy() {
    _initMouseAuthentificationServiceSoapProxy();
  }
  
  public MouseAuthentificationServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initMouseAuthentificationServiceSoapProxy();
  }
  
  private void _initMouseAuthentificationServiceSoapProxy() {
    try {
      mouseAuthentificationServiceSoap = (new SubmitMouse.WebService.ACK.MouseAuthentificationServiceLocator()).getMouseAuthentificationServiceSoap();
      if (mouseAuthentificationServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)mouseAuthentificationServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)mouseAuthentificationServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (mouseAuthentificationServiceSoap != null)
      ((javax.xml.rpc.Stub)mouseAuthentificationServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public SubmitMouse.WebService.ACK.MouseAuthentificationServiceSoap getMouseAuthentificationServiceSoap() {
    if (mouseAuthentificationServiceSoap == null)
      _initMouseAuthentificationServiceSoapProxy();
    return mouseAuthentificationServiceSoap;
  }
  
  public java.lang.String mouseAuthentification() throws java.rmi.RemoteException{
    if (mouseAuthentificationServiceSoap == null)
      _initMouseAuthentificationServiceSoapProxy();
    return mouseAuthentificationServiceSoap.mouseAuthentification();
  }
  
  
}