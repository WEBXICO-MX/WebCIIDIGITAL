/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.model;

import java.io.Serializable;
import java.util.Calendar;

public class Tema implements Serializable {

    private int cve_tema;
    private Modulo cve_modulo;
    private String nombre;
    private String dexcripcion;
    private Calendar fecha_reg;
    private Calendar fecha_mod;
    private boolean activo;

    public Tema() {
    }

    public Tema(int cve_tema, Modulo cve_modulo, String nombre, String dexcripcion, Calendar fecha_reg, Calendar fecha_mod, boolean activo) {
        this.cve_tema = cve_tema;
        this.cve_modulo = cve_modulo;
        this.nombre = nombre;
        this.dexcripcion = dexcripcion;
        this.fecha_reg = fecha_reg;
        this.fecha_mod = fecha_mod;
        this.activo = activo;
    }

    public int getCve_tema() {
        return cve_tema;
    }

    public void setCve_tema(int cve_tema) {
        this.cve_tema = cve_tema;
    }

    public Modulo getCve_modulo() {
        return cve_modulo;
    }

    public void setCve_modulo(Modulo cve_modulo) {
        this.cve_modulo = cve_modulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDexcripcion() {
        return dexcripcion;
    }

    public void setDexcripcion(String dexcripcion) {
        this.dexcripcion = dexcripcion;
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
        return "Tema{" + "cve_tema=" + cve_tema + ", cve_modulo=" + cve_modulo + ", nombre=" + nombre + ", dexcripcion=" + dexcripcion + ", fecha_reg=" + fecha_reg + ", fecha_mod=" + fecha_mod + ", activo=" + activo + '}';
    }

}