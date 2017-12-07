
package utng.dsoria.services.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the utng.dsoria.services.webservices package. 
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

    private final static QName _BuscarMedallistaResponse_QNAME = new QName("http://webservices.services.dsoria.utng/", "BuscarMedallistaResponse");
    private final static QName _IngresarMedallistaResponse_QNAME = new QName("http://webservices.services.dsoria.utng/", "IngresarMedallistaResponse");
    private final static QName _IngresarMedallista_QNAME = new QName("http://webservices.services.dsoria.utng/", "IngresarMedallista");
    private final static QName _BuscarMedallista_QNAME = new QName("http://webservices.services.dsoria.utng/", "BuscarMedallista");
    private final static QName _ConsultarMedallistasResponse_QNAME = new QName("http://webservices.services.dsoria.utng/", "ConsultarMedallistasResponse");
    private final static QName _ConsultarMedallistas_QNAME = new QName("http://webservices.services.dsoria.utng/", "ConsultarMedallistas");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: utng.dsoria.services.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarMedallistasResponse }
     * 
     */
    public ConsultarMedallistasResponse createConsultarMedallistasResponse() {
        return new ConsultarMedallistasResponse();
    }

    /**
     * Create an instance of {@link ConsultarMedallistas }
     * 
     */
    public ConsultarMedallistas createConsultarMedallistas() {
        return new ConsultarMedallistas();
    }

    /**
     * Create an instance of {@link BuscarMedallistaResponse }
     * 
     */
    public BuscarMedallistaResponse createBuscarMedallistaResponse() {
        return new BuscarMedallistaResponse();
    }

    /**
     * Create an instance of {@link IngresarMedallistaResponse }
     * 
     */
    public IngresarMedallistaResponse createIngresarMedallistaResponse() {
        return new IngresarMedallistaResponse();
    }

    /**
     * Create an instance of {@link IngresarMedallista }
     * 
     */
    public IngresarMedallista createIngresarMedallista() {
        return new IngresarMedallista();
    }

    /**
     * Create an instance of {@link BuscarMedallista }
     * 
     */
    public BuscarMedallista createBuscarMedallista() {
        return new BuscarMedallista();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarMedallistaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.services.dsoria.utng/", name = "BuscarMedallistaResponse")
    public JAXBElement<BuscarMedallistaResponse> createBuscarMedallistaResponse(BuscarMedallistaResponse value) {
        return new JAXBElement<BuscarMedallistaResponse>(_BuscarMedallistaResponse_QNAME, BuscarMedallistaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarMedallistaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.services.dsoria.utng/", name = "IngresarMedallistaResponse")
    public JAXBElement<IngresarMedallistaResponse> createIngresarMedallistaResponse(IngresarMedallistaResponse value) {
        return new JAXBElement<IngresarMedallistaResponse>(_IngresarMedallistaResponse_QNAME, IngresarMedallistaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarMedallista }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.services.dsoria.utng/", name = "IngresarMedallista")
    public JAXBElement<IngresarMedallista> createIngresarMedallista(IngresarMedallista value) {
        return new JAXBElement<IngresarMedallista>(_IngresarMedallista_QNAME, IngresarMedallista.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarMedallista }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.services.dsoria.utng/", name = "BuscarMedallista")
    public JAXBElement<BuscarMedallista> createBuscarMedallista(BuscarMedallista value) {
        return new JAXBElement<BuscarMedallista>(_BuscarMedallista_QNAME, BuscarMedallista.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarMedallistasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.services.dsoria.utng/", name = "ConsultarMedallistasResponse")
    public JAXBElement<ConsultarMedallistasResponse> createConsultarMedallistasResponse(ConsultarMedallistasResponse value) {
        return new JAXBElement<ConsultarMedallistasResponse>(_ConsultarMedallistasResponse_QNAME, ConsultarMedallistasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarMedallistas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.services.dsoria.utng/", name = "ConsultarMedallistas")
    public JAXBElement<ConsultarMedallistas> createConsultarMedallistas(ConsultarMedallistas value) {
        return new JAXBElement<ConsultarMedallistas>(_ConsultarMedallistas_QNAME, ConsultarMedallistas.class, null, value);
    }

}
