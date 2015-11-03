/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.model;

import java.io.Serializable;
import java.util.Calendar;

public class Pregunta implements Serializable {

    private int cve_pregunta;
    private String descripcion;
    private boolean abierta;
    private Calendar fecha_reg;
    private Calendar fecha_mod;
    private boolean activo;

    public Pregunta() {
    }

    public Pregunta(int cve_pregunta, String descripcion, boolean abierta, Calendar fecha_reg, Calendar fecha_mod, boolean activo) {
        this.cve_pregunta = cve_pregunta;
        this.descripcion = descripcion;
        this.abierta = abierta;
        this.fecha_reg = fecha_reg;
        this.fecha_mod = fecha_mod;
        this.activo = activo;
    }

    public int getCve_pregunta() {
        return cve_pregunta;
    }

    public void setCve_pregunta(int cve_pregunta) {
        this.cve_pregunta = cve_pregunta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isAbierta() {
        return abierta;
    }

    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }

    public Calendar getFecha_reg() {
        return fecha_reg;
    }

    public void setFecha_reg(Calendar fecha_reg) {
        this.fecha_reg = fecha_reg;
    }

    public Calendar getFecha_mod() {
        return fecha_mod;
    }

    public void setFecha_mod(Calendar fecha_mod) {
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
        return "Pregunta{" + "cve_pregunta=" + cve_pregunta + ", descripcion=" + descripcion + ", abierta=" + abierta + ", fecha_reg=" + fecha_reg + ", fecha_mod=" + fecha_mod + ", activo=" + activo + '}';
    }

}