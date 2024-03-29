package co.edureka.khalid.webservices;

public class NumsProxy implements co.edureka.khalid.webservices.Nums {
  private String _endpoint = null;
  private co.edureka.khalid.webservices.Nums nums = null;
  
  public NumsProxy() {
    _initNumsProxy();
  }
  
  public NumsProxy(String endpoint) {
    _endpoint = endpoint;
    _initNumsProxy();
  }
  
  private void _initNumsProxy() {
    try {
      nums = (new co.edureka.khalid.webservices.NumsServiceLocator()).getNums();
      if (nums != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)nums)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)nums)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (nums != null)
      ((javax.xml.rpc.Stub)nums)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public co.edureka.khalid.webservices.Nums getNums() {
    if (nums == null)
      _initNumsProxy();
    return nums;
  }
  
  public float sub(float x, float y) throws java.rmi.RemoteException{
    if (nums == null)
      _initNumsProxy();
    return nums.sub(x, y);
  }
  
  public int add(int x, int y) throws java.rmi.RemoteException{
    if (nums == null)
      _initNumsProxy();
    return nums.add(x, y);
  }
  
  
}