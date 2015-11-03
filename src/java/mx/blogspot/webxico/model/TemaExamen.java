/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.model;

import java.util.Date;

public class TemaExamen extends Examen {

    private Tema cve_tema;

    public TemaExamen() {
    }

    public TemaExamen(Tema cve_tema, int cve_examen, String nombre, String descripcion, Date fecha_reg, Date fecha_mod, boolean activo) {
        super(cve_examen, nombre, descripcion, fecha_reg, fecha_mod, activo);
        this.cve_tema = cve_tema;
    }

    public Tema getCve_tema() {
        return cve_tema;
    }

    public void setCve_tema(Tema cve_tema) {
        this.cve_tema = cve_tema;
    }

    @Override
    public String toString() {
        return "TemaExamen{" + "cve_tema=" + cve_tema + '}';
    }

}