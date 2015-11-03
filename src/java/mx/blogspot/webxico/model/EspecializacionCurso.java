/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.model;

import java.io.Serializable;
import java.util.Date;

public class EspecializacionCurso implements Serializable {

    private Especializacion cve_especializacion;
    private Curso cve_curso;
    private Date fecha_reg;
    private Date fecha_mod;
    private boolean activo;

    public EspecializacionCurso() {
    }

    public EspecializacionCurso(Especializacion cve_especializacion, Curso cve_curso, Date fecha_reg, Date fecha_mod, boolean activo) {
        this.cve_especializacion = cve_especializacion;
        this.cve_curso = cve_curso;
        this.fecha_reg = fecha_reg;
        this.fecha_mod = fecha_mod;
        this.activo = activo;
    }

    public Especializacion getCve_especializacion() {
        return cve_especializacion;
    }

    public void setCve_especializacion(Especializacion cve_especializacion) {
        this.cve_especializacion = cve_especializacion;
    }

    public Curso getCve_curso() {
        return cve_curso;
    }

    public void setCve_curso(Curso cve_curso) {
        this.cve_curso = cve_curso;
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
        return "EspecializacionCurso{" + "cve_especializacion=" + cve_especializacion + ", cve_curso=" + cve_curso + ", fecha_reg=" + fecha_reg + ", fecha_mod=" + fecha_mod + ", activo=" + activo + '}';
    }

}