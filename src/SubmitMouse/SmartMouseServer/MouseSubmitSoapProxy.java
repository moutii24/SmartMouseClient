package SubmitMouse.SmartMouseServer;

public class MouseSubmitSoapProxy implements SubmitMouse.SmartMouseServer.MouseSubmitSoap {
  private String _endpoint = null;
  private SubmitMouse.SmartMouseServer.MouseSubmitSoap mouseSubmitSoap = null;
  
  public MouseSubmitSoapProxy() {
    _initMouseSubmitSoapProxy();
  }
  
  public MouseSubmitSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initMouseSubmitSoapProxy();
  }
  
  private void _initMouseSubmitSoapProxy() {
    try {
      mouseSubmitSoap = (new SubmitMouse.SmartMouseServer.MouseSubmitLocator()).getMouseSubmitSoap();
      if (mouseSubmitSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)mouseSubmitSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)mouseSubmitSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (mouseSubmitSoap != null)
      ((javax.xml.rpc.Stub)mouseSubmitSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public SubmitMouse.SmartMouseServer.MouseSubmitSoap getMouseSubmitSoap() {
    if (mouseSubmitSoap == null)
      _initMouseSubmitSoapProxy();
    return mouseSubmitSoap;
  }
  
  public int dumpData() throws java.rmi.RemoteException{
    if (mouseSubmitSoap == null)
      _initMouseSubmitSoapProxy();
    return mouseSubmitSoap.dumpData();
  }
  
  public boolean submitMouse() throws java.rmi.RemoteException{
    if (mouseSubmitSoap == null)
      _initMouseSubmitSoapProxy();
    return mouseSubmitSoap.submitMouse();
  }
  
  
}