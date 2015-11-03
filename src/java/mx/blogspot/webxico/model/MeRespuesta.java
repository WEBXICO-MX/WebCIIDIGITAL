/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.model;

import java.util.Date;

public class MeRespuesta extends Respuesta {

    private MePregunta cve_pregunta;

    public MeRespuesta() {
    }

    public MeRespuesta(MePregunta cve_pregunta, int cve_respuesta, String descripcion, boolean correcta, Date fecha_reg, Date fecha_mod, boolean activo) {
        super(cve_respuesta, descripcion, correcta, fecha_reg, fecha_mod, activo);
        this.cve_pregunta = cve_pregunta;
    }

    public MePregunta getCve_pregunta() {
        return cve_pregunta;
    }

    public void setCve_pregunta(MePregunta cve_pregunta) {
        this.cve_pregunta = cve_pregunta;
    }

    @Override
    public String toString() {
        return "MeRespuesta{" + "cve_pregunta=" + cve_pregunta + '}';
    }

}