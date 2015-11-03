/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.model;

import java.io.Serializable;
import java.util.Date;

public class Especializacion implements Serializable {

    private int cve_especializacion;
    private String nombre;
    private String descripcion;
    private String img;
    private Date fecha_reg;
    private Date fecha_mod;
    private boolean activo;

    public Especializacion() {
    }

    public Especializacion(int cve_especializacion, String nombre, String descripcion, String img, Date fecha_reg, Date fecha_mod, boolean activo) {
        this.cve_especializacion = cve_especializacion;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.img = img;
        this.fecha_reg = fecha_reg;
        this.fecha_mod = fecha_mod;
        this.activo = activo;
    }

    public int getCve_especializacion() {
        return cve_especializacion;
    }

    public void setCve_especializacion(int cve_especializacion) {
        this.cve_especializacion = cve_especializacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
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
        return "Especializacion{" + "cve_especializacion=" + cve_especializacion + ", nombre=" + nombre + ", descripcion=" + descripcion + ", img=" + img + ", fecha_reg=" + fecha_reg + ", fecha_mod=" + fecha_mod + ", activo=" + activo + '}';
    }

}