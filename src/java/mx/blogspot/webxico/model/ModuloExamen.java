/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.model;

import java.util.Date;

public class ModuloExamen extends Examen {

    private Modulo cve_modulo;

    public ModuloExamen() {
    }

    public ModuloExamen(Modulo cve_modulo, int cve_examen, String nombre, String descripcion, Date fecha_reg, Date fecha_mod, boolean activo) {
        super(cve_examen, nombre, descripcion, fecha_reg, fecha_mod, activo);
        this.cve_modulo = cve_modulo;
    }

    public Modulo getCve_modulo() {
        return cve_modulo;
    }

    public void setCve_modulo(Modulo cve_modulo) {
        this.cve_modulo = cve_modulo;
    }

    @Override
    public String toString() {
        return "ModuloExamen{" + "cve_modulo=" + cve_modulo + '}';
    }

}