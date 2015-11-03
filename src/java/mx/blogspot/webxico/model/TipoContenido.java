/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.model;

import java.io.Serializable;
import java.util.Calendar;

public class TipoContenido implements Serializable {

    private int cve_tipo;
    private String nombre;
    private String img;
    private Calendar fecha_reg;
    private Calendar fecha_mod;
    private boolean activo;

    public TipoContenido() {
    }

    public TipoContenido(int cve_tipo, String nombre, String img, Calendar fecha_reg, Calendar fecha_mod, boolean activo) {
        this.cve_tipo = cve_tipo;
        this.nombre = nombre;
        this.img = img;
        this.fecha_reg = fecha_reg;
        this.fecha_mod = fecha_mod;
        this.activo = activo;
    }

    public int getCve_tipo() {
        return cve_tipo;
    }

    public void setCve_tipo(int cve_tipo) {
        this.cve_tipo = cve_tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
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
        return "TipoContenido{" + "cve_tipo=" + cve_tipo + ", nombre=" + nombre + ", img=" + img + ", fecha_reg=" + fecha_reg + ", fecha_mod=" + fecha_mod + ", activo=" + activo + '}';
    }

}