/**
 * MouseAuthentificationServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package SubmitMouse.WebService.ACK;

public class MouseAuthentificationServiceLocator extends org.apache.axis.client.Service implements SubmitMouse.WebService.ACK.MouseAuthentificationService {

    public MouseAuthentificationServiceLocator() {
    }


    public MouseAuthentificationServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MouseAuthentificationServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MouseAuthentificationServiceSoap
    private java.lang.String MouseAuthentificationServiceSoap_address = "http://localhost:58242/MouseAuthentificationService.asmx";

    public java.lang.String getMouseAuthentificationServiceSoapAddress() {
        return MouseAuthentificationServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MouseAuthentificationServiceSoapWSDDServiceName = "MouseAuthentificationServiceSoap";

    public java.lang.String getMouseAuthentificationServiceSoapWSDDServiceName() {
        return MouseAuthentificationServiceSoapWSDDServiceName;
    }

    public void setMouseAuthentificationServiceSoapWSDDServiceName(java.lang.String name) {
        MouseAuthentificationServiceSoapWSDDServiceName = name;
    }

    public SubmitMouse.WebService.ACK.MouseAuthentificationServiceSoap getMouseAuthentificationServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MouseAuthentificationServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMouseAuthentificationServiceSoap(endpoint);
    }

    public SubmitMouse.WebService.ACK.MouseAuthentificationServiceSoap getMouseAuthentificationServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            SubmitMouse.WebService.ACK.MouseAuthentificationServiceSoapStub _stub = new SubmitMouse.WebService.ACK.MouseAuthentificationServiceSoapStub(portAddress, this);
            _stub.setPortName(getMouseAuthentificationServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMouseAuthentificationServiceSoapEndpointAddress(java.lang.String address) {
        MouseAuthentificationServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (SubmitMouse.WebService.ACK.MouseAuthentificationServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                SubmitMouse.WebService.ACK.MouseAuthentificationServiceSoapStub _stub = new SubmitMouse.WebService.ACK.MouseAuthentificationServiceSoapStub(new java.net.URL(MouseAuthentificationServiceSoap_address), this);
                _stub.setPortName(getMouseAuthentificationServiceSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("MouseAuthentificationServiceSoap".equals(inputPortName)) {
            return getMouseAuthentificationServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ACK.WebService.SubmitMouse/", "MouseAuthentificationService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ACK.WebService.SubmitMouse/", "MouseAuthentificationServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MouseAuthentificationServiceSoap".equals(portName)) {
            setMouseAuthentificationServiceSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
