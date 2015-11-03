/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.model;

import java.io.Serializable;

public class Estado implements Serializable {

    private int cve_estado;
    private String nombre;

    public Estado() {
    }

    public Estado(int cve_estado, String nombre) {
        this.cve_estado = cve_estado;
        this.nombre = nombre;
    }

    public int getCve_estado() {
        return cve_estado;
    }

    public void setCve_estado(int cve_estado) {
        this.cve_estado = cve_estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Estado{" + "cve_estado=" + cve_estado + ", nombre=" + nombre + '}';
    }

}