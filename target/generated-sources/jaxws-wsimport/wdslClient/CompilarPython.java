
package wdslClient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CompilarPython", targetNamespace = "http://WebService/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CompilarPython {


    /**
     * 
     * @param idUser
     * @param codigo
     * @return
     *     returns java.lang.String
     * @throws IOException_Exception
     */
    @WebMethod(operationName = "JavaRunCommand")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "JavaRunCommand", targetNamespace = "http://WebService/", className = "wdslClient.JavaRunCommand")
    @ResponseWrapper(localName = "JavaRunCommandResponse", targetNamespace = "http://WebService/", className = "wdslClient.JavaRunCommandResponse")
    @Action(input = "http://WebService/CompilarPython/JavaRunCommandRequest", output = "http://WebService/CompilarPython/JavaRunCommandResponse", fault = {
        @FaultAction(className = IOException_Exception.class, value = "http://WebService/CompilarPython/JavaRunCommand/Fault/IOException")
    })
    public String javaRunCommand(
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo,
        @WebParam(name = "idUser", targetNamespace = "")
        String idUser)
        throws IOException_Exception
    ;

}
