/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.model;

import java.io.Serializable;
import java.util.Calendar;

public class Modalidad implements Serializable {

    private int cve_modalidad;
    private String nombre;
    private Calendar fecha_reg;
    private Calendar fecha_mod;
    private boolean activo;

    public Modalidad() {
    }

    public Modalidad(int cve_modalidad, String nombre, Calendar fecha_reg, Calendar fecha_mod, boolean activo) {
        this.cve_modalidad = cve_modalidad;
        this.nombre = nombre;
        this.fecha_reg = fecha_reg;
        this.fecha_mod = fecha_mod;
        this.activo = activo;
    }

    public int getCve_modalidad() {
        return cve_modalidad;
    }

    public void setCve_modalidad(int cve_modalidad) {
        this.cve_modalidad = cve_modalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        return "Modalidad{" + "cve_modalidad=" + cve_modalidad + ", nombre=" + nombre + ", fecha_reg=" + fecha_reg + ", fecha_mod=" + fecha_mod + ", activo=" + activo + '}';
    }

}