
package com.example.Api.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.api.generated package. 
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

    private final static QName _CustomerPersonOfficialId_QNAME = new QName("http://spp.se/model", "PersonOfficialId");
    private final static QName _CustomerLastUpdated_QNAME = new QName("http://spp.se/model", "LastUpdated");
    private final static QName _CustomerFirstName_QNAME = new QName("http://spp.se/model", "FirstName");
    private final static QName _CustomerLastName_QNAME = new QName("http://spp.se/model", "LastName");
    private final static QName _CustomerAddress_QNAME = new QName("http://spp.se/model", "Address");
    private final static QName _CustomerPersonType_QNAME = new QName("http://spp.se/model", "PersonType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.api.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://spp.se/model", name = "PersonOfficialId", scope = Customer.class)
    public JAXBElement<String> createCustomerPersonOfficialId(String value) {
        return new JAXBElement<String>(_CustomerPersonOfficialId_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://spp.se/model", name = "LastUpdated", scope = Customer.class)
    public JAXBElement<XMLGregorianCalendar> createCustomerLastUpdated(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CustomerLastUpdated_QNAME, XMLGregorianCalendar.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://spp.se/model", name = "FirstName", scope = Customer.class)
    public JAXBElement<String> createCustomerFirstName(String value) {
        return new JAXBElement<String>(_CustomerFirstName_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://spp.se/model", name = "LastName", scope = Customer.class)
    public JAXBElement<String> createCustomerLastName(String value) {
        return new JAXBElement<String>(_CustomerLastName_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://spp.se/model", name = "Address", scope = Customer.class)
    public JAXBElement<String> createCustomerAddress(String value) {
        return new JAXBElement<String>(_CustomerAddress_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://spp.se/model", name = "PersonType", scope = Customer.class)
    public JAXBElement<String> createCustomerPersonType(String value) {
        return new JAXBElement<String>(_CustomerPersonType_QNAME, String.class, Customer.class, value);
    }

}
