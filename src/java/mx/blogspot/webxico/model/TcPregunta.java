/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.model;

import java.util.Date;

public class TcPregunta extends Pregunta {

    private TemaExamen cve_examen;

    public TcPregunta() {
    }

    public TcPregunta(TemaExamen cve_examen, int cve_pregunta, String descripcion, boolean abierta, Date fecha_reg, Date fecha_mod, boolean activo) {
        super(cve_pregunta, descripcion, abierta, fecha_reg, fecha_mod, activo);
        this.cve_examen = cve_examen;
    }

    public TemaExamen getCve_examen() {
        return cve_examen;
    }

    public void setCve_examen(TemaExamen cve_examen) {
        this.cve_examen = cve_examen;
    }

    @Override
    public String toString() {
        return "TcPregunta{" + "cve_examen=" + cve_examen + '}';
    }

}