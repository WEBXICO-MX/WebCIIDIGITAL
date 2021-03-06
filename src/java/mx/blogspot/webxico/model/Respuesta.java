/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.model;

import java.io.Serializable;
import java.util.Date;

public class Respuesta implements Serializable {

    private int cve_respuesta;
    private String descripcion;
    private boolean correcta;
    private Date fecha_reg;
    private Date fecha_mod;
    private boolean activo;

    public Respuesta() {
    }

    public Respuesta(int cve_respuesta, String descripcion, boolean correcta, Date fecha_reg, Date fecha_mod, boolean activo) {
        this.cve_respuesta = cve_respuesta;
        this.descripcion = descripcion;
        this.correcta = correcta;
        this.fecha_reg = fecha_reg;
        this.fecha_mod = fecha_mod;
        this.activo = activo;
    }

    public int getCve_respuesta() {
        return cve_respuesta;
    }

    public void setCve_respuesta(int cve_respuesta) {
        this.cve_respuesta = cve_respuesta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCorrecta() {
        return correcta;
    }

    public void setCorrecta(boolean correcta) {
        this.correcta = correcta;
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
        return "Respuesta{" + "cve_respuesta=" + cve_respuesta + ", descripcion=" + descripcion + ", correcta=" + correcta + ", fecha_reg=" + fecha_reg + ", fecha_mod=" + fecha_mod + ", activo=" + activo + '}';
    }

}