/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.model;

import java.io.Serializable;
import java.util.Calendar;

public class Examen implements Serializable {

    private int cve_examen;
    private String nombre;
    private String descripcion;
    private Calendar fecha_reg;
    private Calendar fecha_mod;
    private boolean activo;

    public Examen() {
    }

    public Examen(int cve_examen, String nombre, String descripcion, Calendar fecha_reg, Calendar fecha_mod, boolean activo) {
        this.cve_examen = cve_examen;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_reg = fecha_reg;
        this.fecha_mod = fecha_mod;
        this.activo = activo;
    }

    public void setCve_examen(int cve_examen) {
        this.cve_examen = cve_examen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha_reg(Calendar fecha_reg) {
        this.fecha_reg = fecha_reg;
    }

    public void setFecha_mod(Calendar fecha_mod) {
        this.fecha_mod = fecha_mod;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Examen{" + "cve_examen=" + cve_examen + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fecha_reg=" + fecha_reg + ", fecha_mod=" + fecha_mod + ", activo=" + activo + '}';
    }

}