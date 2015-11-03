/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.model;

import java.util.Calendar;

public class MePregunta extends Pregunta {

    private ModuloExamen cve_modulo;

    public MePregunta() {
    }

    public MePregunta(ModuloExamen cve_modulo, int cve_pregunta, String descripcion, boolean abierta, Calendar fecha_reg, Calendar fecha_mod, boolean activo) {
        super(cve_pregunta, descripcion, abierta, fecha_reg, fecha_mod, activo);
        this.cve_modulo = cve_modulo;
    }

    public ModuloExamen getCve_modulo() {
        return cve_modulo;
    }

    public void setCve_modulo(ModuloExamen cve_modulo) {
        this.cve_modulo = cve_modulo;
    }

    @Override
    public String toString() {
        return "MePregunta{" + "cve_modulo=" + cve_modulo + '}';
    }

}