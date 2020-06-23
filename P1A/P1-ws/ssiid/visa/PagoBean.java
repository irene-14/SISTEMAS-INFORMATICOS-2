
package ssiid.visa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pagoBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pagoBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codRespuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idAutorizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idComercio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="importe" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="rutaRetorno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tarjeta" type="{http://dao.visa.ssii2/}tarjetaBean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pagoBean", propOrder = {
    "codRespuesta",
    "idAutorizacion",
    "idComercio",
    "idTransaccion",
    "importe",
    "rutaRetorno",
    "tarjeta"
})
public class PagoBean {

    protected String codRespuesta;
    protected String idAutorizacion;
    protected String idComercio;
    protected String idTransaccion;
    protected double importe;
    protected String rutaRetorno;
    protected TarjetaBean tarjeta;

    /**
     * Gets the value of the codRespuesta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodRespuesta() {
        return codRespuesta;
    }

    /**
     * Sets the value of the codRespuesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodRespuesta(String value) {
        this.codRespuesta = value;
    }

    /**
     * Gets the value of the idAutorizacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAutorizacion() {
        return idAutorizacion;
    }

    /**
     * Sets the value of the idAutorizacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAutorizacion(String value) {
        this.idAutorizacion = value;
    }

    /**
     * Gets the value of the idComercio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdComercio() {
        return idComercio;
    }

    /**
     * Sets the value of the idComercio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdComercio(String value) {
        this.idComercio = value;
    }

    /**
     * Gets the value of the idTransaccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTransaccion() {
        return idTransaccion;
    }

    /**
     * Sets the value of the idTransaccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTransaccion(String value) {
        this.idTransaccion = value;
    }

    /**
     * Gets the value of the importe property.
     * 
     */
    public double getImporte() {
        return importe;
    }

    /**
     * Sets the value of the importe property.
     * 
     */
    public void setImporte(double value) {
        this.importe = value;
    }

    /**
     * Gets the value of the rutaRetorno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRutaRetorno() {
        return rutaRetorno;
    }

    /**
     * Sets the value of the rutaRetorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRutaRetorno(String value) {
        this.rutaRetorno = value;
    }

    /**
     * Gets the value of the tarjeta property.
     * 
     * @return
     *     possible object is
     *     {@link TarjetaBean }
     *     
     */
    public TarjetaBean getTarjeta() {
        return tarjeta;
    }

    /**
     * Sets the value of the tarjeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link TarjetaBean }
     *     
     */
    public void setTarjeta(TarjetaBean value) {
        this.tarjeta = value;
    }

}
