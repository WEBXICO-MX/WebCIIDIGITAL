/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.model;

import java.io.Serializable;
import java.util.Date;

public class Curso implements Serializable {

    private int cve_curso;
    private String descripcion;
    private String img;
    private String video;
    private Date fecha_reg;
    private Date fecha_mod;
    private boolean activo;

    public Curso() {
    }

    public Curso(int cve_curso, String descripcion, String img, String video, Date fecha_reg, Date fecha_mod, boolean activo) {
        this.cve_curso = cve_curso;
        this.descripcion = descripcion;
        this.img = img;
        this.video = video;
        this.fecha_reg = fecha_reg;
        this.fecha_mod = fecha_mod;
        this.activo = activo;
    }

    public int getCve_curso() {
        return cve_curso;
    }

    public void setCve_curso(int cve_curso) {
        this.cve_curso = cve_curso;
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

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
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
        return "Curso{" + "cve_curso=" + cve_curso + ", descripcion=" + descripcion + ", img=" + img + ", video=" + video + ", fecha_reg=" + fecha_reg + ", fecha_mod=" + fecha_mod + ", activo=" + activo + '}';
    }

}