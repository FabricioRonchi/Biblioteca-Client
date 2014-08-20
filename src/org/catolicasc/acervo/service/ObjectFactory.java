
package org.catolicasc.acervo.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.catolicasc.acervo.service package. 
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

    private final static QName _ListarLIvros_QNAME = new QName("http://service.acervo.catolicasc.org/", "listarLIvros");
    private final static QName _ListarLIvrosResponse_QNAME = new QName("http://service.acervo.catolicasc.org/", "listarLIvrosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.catolicasc.acervo.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarLIvros }
     * 
     */
    public ListarLIvros createListarLIvros() {
        return new ListarLIvros();
    }

    /**
     * Create an instance of {@link ListarLIvrosResponse }
     * 
     */
    public ListarLIvrosResponse createListarLIvrosResponse() {
        return new ListarLIvrosResponse();
    }

    /**
     * Create an instance of {@link Livro }
     * 
     */
    public Livro createLivro() {
        return new Livro();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarLIvros }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.acervo.catolicasc.org/", name = "listarLIvros")
    public JAXBElement<ListarLIvros> createListarLIvros(ListarLIvros value) {
        return new JAXBElement<ListarLIvros>(_ListarLIvros_QNAME, ListarLIvros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarLIvrosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.acervo.catolicasc.org/", name = "listarLIvrosResponse")
    public JAXBElement<ListarLIvrosResponse> createListarLIvrosResponse(ListarLIvrosResponse value) {
        return new JAXBElement<ListarLIvrosResponse>(_ListarLIvrosResponse_QNAME, ListarLIvrosResponse.class, null, value);
    }

}
