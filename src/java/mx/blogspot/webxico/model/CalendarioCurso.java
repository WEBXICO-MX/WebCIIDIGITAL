/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.model;

import java.io.Serializable;
import java.util.Calendar;

public class CalendarioCurso implements Serializable {

    private int cve_calendario;
    private Curso cve_curso;
    private Instructor cve_instructor;
    private Calendar fecha_inicio;
    private Calendar fecha_fin;
    private double costo;
    private Calendar fecha_reg;
    private Calendar fecha_mod;
    private boolean activo;

    public CalendarioCurso() {
    }

    public CalendarioCurso(int cve_calendario, Curso cve_curso, Instructor cve_instructor, Calendar fecha_inicio, Calendar fecha_fin, double costo, Calendar fecha_reg, Calendar fecha_mod, boolean activo) {
        this.cve_calendario = cve_calendario;
        this.cve_curso = cve_curso;
        this.cve_instructor = cve_instructor;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.costo = costo;
        this.fecha_reg = fecha_reg;
        this.fecha_mod = fecha_mod;
        this.activo = activo;
    }

    public int getCve_calendario() {
        return cve_calendario;
    }

    public void setCve_calendario(int cve_calendario) {
        this.cve_calendario = cve_calendario;
    }

    public Curso getCve_curso() {
        return cve_curso;
    }

    public void setCve_curso(Curso cve_curso) {
        this.cve_curso = cve_curso;
    }

    public Instructor getCve_instructor() {
        return cve_instructor;
    }

    public void setCve_instructor(Instructor cve_instructor) {
        this.cve_instructor = cve_instructor;
    }

    public Calendar getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Calendar fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Calendar getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Calendar fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
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
        return "CalendarioCurso{" + "cve_calendario=" + cve_calendario + ", cve_curso=" + cve_curso + ", cve_instructor=" + cve_instructor + ", fecha_inicio=" + fecha_inicio + ", fecha_fin=" + fecha_fin + ", costo=" + costo + ", fecha_reg=" + fecha_reg + ", fecha_mod=" + fecha_mod + ", activo=" + activo + '}';
    }

}