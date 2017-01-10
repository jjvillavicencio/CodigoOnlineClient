
package wdslClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wdslClient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _IOException_QNAME = new QName("http://WebService/", "IOException");
    private final static QName _JavaRunCommand_QNAME = new QName("http://WebService/", "JavaRunCommand");
    private final static QName _JavaRunCommandResponse_QNAME = new QName("http://WebService/", "JavaRunCommandResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wdslClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JavaRunCommandResponse }
     * 
     */
    public JavaRunCommandResponse createJavaRunCommandResponse() {
        return new JavaRunCommandResponse();
    }

    /**
     * Create an instance of {@link JavaRunCommand }
     * 
     */
    public JavaRunCommand createJavaRunCommand() {
        return new JavaRunCommand();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JavaRunCommand }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "JavaRunCommand")
    public JAXBElement<JavaRunCommand> createJavaRunCommand(JavaRunCommand value) {
        return new JAXBElement<JavaRunCommand>(_JavaRunCommand_QNAME, JavaRunCommand.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JavaRunCommandResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "JavaRunCommandResponse")
    public JAXBElement<JavaRunCommandResponse> createJavaRunCommandResponse(JavaRunCommandResponse value) {
        return new JAXBElement<JavaRunCommandResponse>(_JavaRunCommandResponse_QNAME, JavaRunCommandResponse.class, null, value);
    }

}
