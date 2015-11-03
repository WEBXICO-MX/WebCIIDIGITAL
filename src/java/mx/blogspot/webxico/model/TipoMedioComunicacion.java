/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.model;

import java.io.Serializable;
import java.util.Date;

public class TipoMedioComunicacion implements Serializable {

    private int cve_tipo;
    private String nombre;
    private String img;
    private Date fecha_reg;
    private Date fecha_mod;
    private boolean activo;

    public TipoMedioComunicacion() {
    }

    public TipoMedioComunicacion(int cve_tipo, String nombre, String img, Date fecha_reg, Date fecha_mod, boolean activo) {
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
        return "TipoMedioComunicacion{" + "cve_tipo=" + cve_tipo + ", nombre=" + nombre + ", img=" + img + ", fecha_reg=" + fecha_reg + ", fecha_mod=" + fecha_mod + ", activo=" + activo + '}';
    }

}