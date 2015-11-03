/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.model;

import java.io.Serializable;

public class Municipio implements Serializable {

    private int cve_municipio;
    private Estado cve_estado;
    private String nombre;

    public Municipio() {
    }

    public Municipio(int cve_municipio, Estado cve_estado, String nombre) {
        this.cve_municipio = cve_municipio;
        this.cve_estado = cve_estado;
        this.nombre = nombre;
    }

    public int getCve_municipio() {
        return cve_municipio;
    }

    public void setCve_municipio(int cve_municipio) {
        this.cve_municipio = cve_municipio;
    }

    public Estado getCve_estado() {
        return cve_estado;
    }

    public void setCve_estado(Estado cve_estado) {
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
        return "Municipio{" + "cve_municipio=" + cve_municipio + ", cve_estado=" + cve_estado + ", nombre=" + nombre + '}';
    }

}