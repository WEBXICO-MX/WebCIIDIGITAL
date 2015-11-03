/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.model;

import java.io.Serializable;
import java.util.Date;

public class Domicilio implements Serializable {

    private int cve_domicilio;
    private Persona cve_persona;
    private Municipio cve_municipio;
    private String colonia;
    private String calle;
    private String numero;
    private Date fecha_reg;
    private Date fecha_mod;
    private boolean activo;

    public Domicilio() {
    }

    public Domicilio(int cve_domicilio, Persona cve_persona, Municipio cve_municipio, String colonia, String calle, String numero, Date fecha_reg, Date fecha_mod, boolean activo) {
        this.cve_domicilio = cve_domicilio;
        this.cve_persona = cve_persona;
        this.cve_municipio = cve_municipio;
        this.colonia = colonia;
        this.calle = calle;
        this.numero = numero;
        this.fecha_reg = fecha_reg;
        this.fecha_mod = fecha_mod;
        this.activo = activo;
    }

    public int getCve_domicilio() {
        return cve_domicilio;
    }

    public void setCve_domicilio(int cve_domicilio) {
        this.cve_domicilio = cve_domicilio;
    }

    public Persona getCve_persona() {
        return cve_persona;
    }

    public void setCve_persona(Persona cve_persona) {
        this.cve_persona = cve_persona;
    }

    public Municipio getCve_municipio() {
        return cve_municipio;
    }

    public void setCve_municipio(Municipio cve_municipio) {
        this.cve_municipio = cve_municipio;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFecha_reg() {
        return fecha_reg;
    }

    public void setFecha_reg(Date fecha_reg) {
        this.fecha_reg = fecha_reg;
    }

    public Date getFecha_mod() {
        return fecha_mod;
    }

    public void setFecha_mod(Date fecha_mod) {
        this.fecha_mod = fecha_mod;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Domicilio{" + "cve_domicilio=" + cve_domicilio + ", cve_persona=" + cve_persona + ", cve_municipio=" + cve_municipio + ", colonia=" + colonia + ", calle=" + calle + ", numero=" + numero + ", fecha_reg=" + fecha_reg + ", fecha_mod=" + fecha_mod + ", activo=" + activo + '}';
    }

}