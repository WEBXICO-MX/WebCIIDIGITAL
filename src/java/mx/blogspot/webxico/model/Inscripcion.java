/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.model;

import java.io.Serializable;
import java.util.Date;

public class Inscripcion implements Serializable {

    private int cve_inscripcion;
    private CalendarioCurso cve_calendario;
    private Persona cve_persona;
    private Modalidad cve_modalidad;
    private Date fecha_reg;
    private Date fecha_mod;
    private boolean activo;

    public Inscripcion() {
    }

    public Inscripcion(int cve_inscripcion, CalendarioCurso cve_calendario, Persona cve_persona, Modalidad cve_modalidad, Date fecha_reg, Date fecha_mod, boolean activo) {
        this.cve_inscripcion = cve_inscripcion;
        this.cve_calendario = cve_calendario;
        this.cve_persona = cve_persona;
        this.cve_modalidad = cve_modalidad;
        this.fecha_reg = fecha_reg;
        this.fecha_mod = fecha_mod;
        this.activo = activo;
    }

    public int getCve_inscripcion() {
        return cve_inscripcion;
    }

    public void setCve_inscripcion(int cve_inscripcion) {
        this.cve_inscripcion = cve_inscripcion;
    }

    public CalendarioCurso getCve_calendario() {
        return cve_calendario;
    }

    public void setCve_calendario(CalendarioCurso cve_calendario) {
        this.cve_calendario = cve_calendario;
    }

    public Persona getCve_persona() {
        return cve_persona;
    }

    public void setCve_persona(Persona cve_persona) {
        this.cve_persona = cve_persona;
    }

    public Modalidad getCve_modalidad() {
        return cve_modalidad;
    }

    public void setCve_modalidad(Modalidad cve_modalidad) {
        this.cve_modalidad = cve_modalidad;
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
        return "Inscripciones{" + "cve_inscripcion=" + cve_inscripcion + ", cve_calendario=" + cve_calendario + ", cve_persona=" + cve_persona + ", cve_modalidad=" + cve_modalidad + ", fecha_reg=" + fecha_reg + ", fecha_mod=" + fecha_mod + ", activo=" + activo + '}';
    }

}