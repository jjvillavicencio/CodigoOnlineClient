package ec.edu.utpl.codigoonlinews.codigoonlineclient;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.xml.ws.WebServiceRef;
import wdslClient.CompilarPython;
import wdslClient.CompilarPython_Service;

/**
 *
 * @author jjvillavicencio
 */

@ManagedBean(name="index")
@SessionScoped
public class IndexController implements Serializable{
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/CodigoOnlineWS-1.0-SNAPSHOT/CompilarPython.wsdl")
    
    private CompilarPython_Service service;
    private String codigo;
    private String id;
    private String consola;

    public String Ejecutar() {
        try { // Call Web Service Operation
            CompilarPython port = service.getCompilarPythonPort();
            // TODO process result here
            String ed = port.javaRunCommand(codigo, id);
            consola = ">_ " + ed;
            
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return "";
    }

    
    
    public CompilarPython_Service getService() {
        return service;
    }

    public void setService(CompilarPython_Service service) {
        this.service = service;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }
    
    
    
    
}
