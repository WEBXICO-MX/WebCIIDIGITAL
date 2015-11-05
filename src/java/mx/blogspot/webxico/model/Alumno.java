/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.model;

import java.io.Serializable;
import java.util.Date;

public class Alumno extends Persona implements Serializable {

    private String matricula;

    public Alumno() {
        super();
        this.matricula = "";
    }

    public Alumno(String matricula, int cve_persona, String nombre, String ap_paterno, String ap_materno, String sexo, Date fecha_nacimiento, String foto, Date fecha_reg, Date fecha_mod, boolean activo) {
        super(cve_persona, nombre, ap_paterno, ap_materno, sexo, fecha_nacimiento, foto, fecha_reg, fecha_mod, activo);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Alumno{ matricual=" + matricula + ", cve_persona=" + cve_persona + ", nombre=" + nombre + ", ap_paterno=" + ap_paterno + ", ap_materno=" + ap_materno + ", sexo=" + sexo + ", fecha_nacimiento=" + fecha_nacimiento + ", foto=" + foto + ", fecha_reg=" + fecha_reg + ", fecha_mod=" + fecha_mod + ", activo=" + activo + '}';
    }

}