/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.model;

import java.io.Serializable;
import java.util.Date;

public class Instructor extends Persona implements Serializable {

    private String cedula_profesional;

    public Instructor() {
        super();
        this.cedula_profesional = "";
    }

    public Instructor(String cedula_profesional, int cve_persona, String nombre, String ap_paterno, String ap_materno, String sexo, Date fecha_nacimiento, String foto, Date fecha_reg, Date fecha_mod, boolean activo) {
        super(cve_persona, nombre, ap_paterno, ap_materno, sexo, fecha_nacimiento, foto, fecha_reg, fecha_mod, activo);
        this.cedula_profesional = cedula_profesional;
    }

    public String getCedula_profesional() {
        return cedula_profesional;
    }

    public void setCedula_profesional(String cedula_profesional) {
        this.cedula_profesional = cedula_profesional;
    }

    @Override
    public String toString() {
        return "Instructor{ cedula_profesional="+cedula_profesional + ", cve_persona=" + cve_persona + ", nombre=" + nombre + ", ap_paterno=" + ap_paterno + ", ap_materno=" + ap_materno + ", sexo=" + sexo + ", fecha_nacimiento=" + fecha_nacimiento + ", foto=" + foto + ", fecha_reg=" + fecha_reg + ", fecha_mod=" + fecha_mod + ", activo=" + activo + '}';
    }

}