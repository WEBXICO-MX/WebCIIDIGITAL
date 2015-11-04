/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.model;

import java.io.Serializable;
import java.util.Date;

public class Persona implements Serializable {

    private int cve_persona;
    private String nombre;
    private String ap_paterno;
    private String ap_materno;
    private String sexo;
    private Date fecha_nacimiento;
    private String foto;
    private Date fecha_reg;
    private Date fecha_mod;
    private boolean activo;

    public Persona() {
        this.cve_persona = 0;
        this.nombre = "";
        this.ap_paterno = "";
        this.ap_materno = "";
        this.sexo = "";
        this.fecha_nacimiento = null;
        this.foto = "";
        this.fecha_reg = null;
        this.fecha_mod = null;
        this.activo = false;
    }

    public Persona(int cve_persona, String nombre, String ap_paterno, String ap_materno, String sexo, Date fecha_nacimiento, String foto, Date fecha_reg, Date fecha_mod, boolean activo) {
        this.cve_persona = cve_persona;
        this.nombre = nombre;
        this.ap_paterno = ap_paterno;
        this.ap_materno = ap_materno;
        this.sexo = sexo;
        this.fecha_nacimiento = fecha_nacimiento;
        this.foto = foto;
        this.fecha_reg = fecha_reg;
        this.fecha_mod = fecha_mod;
        this.activo = activo;
    }

    public int getCve_persona() {
        return cve_persona;
    }

    public void setCve_persona(int cve_persona) {
        this.cve_persona = cve_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAp_paterno() {
        return ap_paterno;
    }

    public void setAp_paterno(String ap_paterno) {
        this.ap_paterno = ap_paterno;
    }

    public String getAp_materno() {
        return ap_materno;
    }

    public void setAp_materno(String ap_materno) {
        this.ap_materno = ap_materno;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
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
        return "Persona{" + "cve_persona=" + cve_persona + ", nombre=" + nombre + ", ap_paterno=" + ap_paterno + ", ap_materno=" + ap_materno + ", sexo=" + sexo + ", fecha_nacimiento=" + fecha_nacimiento + ", foto=" + foto + ", fecha_reg=" + fecha_reg + ", fecha_mod=" + fecha_mod + ", activo=" + activo + '}';
    }

}