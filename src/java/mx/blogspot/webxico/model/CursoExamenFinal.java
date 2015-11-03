/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.model;

import java.util.Calendar;

public class CursoExamenFinal extends Examen {

    private Curso cve_curso;

    public CursoExamenFinal() {
    }

    public CursoExamenFinal(Curso cve_curso, int cve_examen, String nombre, String descripcion, Calendar fecha_reg, Calendar fecha_mod, boolean activo) {
        super(cve_examen, nombre, descripcion, fecha_reg, fecha_mod, activo);
        this.cve_curso = cve_curso;
    }

    public Curso getCve_curso() {
        return cve_curso;
    }

    public void setCve_curso(Curso cve_curso) {
        this.cve_curso = cve_curso;
    }

    @Override
    public String toString() {
        return "CursoExamenFinal{" + "cve_curso=" + cve_curso + '}';
    }

}