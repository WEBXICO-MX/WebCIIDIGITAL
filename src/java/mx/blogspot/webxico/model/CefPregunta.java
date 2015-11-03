/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.model;

import java.util.Calendar;

public class CefPregunta extends Pregunta {

    private CursoExamenFinal cve_examen;

    public CefPregunta() {
    }

    public CefPregunta(CursoExamenFinal cve_examen, int cve_pregunta, String descripcion, boolean abierta, Calendar fecha_reg, Calendar fecha_mod, boolean activo) {
        super(cve_pregunta, descripcion, abierta, fecha_reg, fecha_mod, activo);
        this.cve_examen = cve_examen;
    }

    public CursoExamenFinal getCve_examen() {
        return cve_examen;
    }

    public void setCve_examen(CursoExamenFinal cve_examen) {
        this.cve_examen = cve_examen;
    }

    @Override
    public String toString() {
        return "CefPregunta{" + "cve_examen=" + cve_examen + '}';
    }

}