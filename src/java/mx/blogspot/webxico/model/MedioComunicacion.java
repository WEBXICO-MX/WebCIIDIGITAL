/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.model;

import java.io.Serializable;
import java.util.Date;

public class MedioComunicacion implements Serializable {

    private int cve_medio;
    private Persona cve_persona;
    private TipoMedioComunicacion cve_tipo;
    private Date fecha_reg;
    private Date fecha_mod;
    private boolean activo;

    public MedioComunicacion() {
    }

    public MedioComunicacion(int cve_medio, Persona cve_persona, TipoMedioComunicacion cve_tipo, Date fecha_reg, Date fecha_mod, boolean activo) {
        this.cve_medio = cve_medio;
        this.cve_persona = cve_persona;
        this.cve_tipo = cve_tipo;
        this.fecha_reg = fecha_reg;
        this.fecha_mod = fecha_mod;
        this.activo = activo;
    }

    public int getCve_medio() {
        return cve_medio;
    }

    public void setCve_medio(int cve_medio) {
        this.cve_medio = cve_medio;
    }

    public Persona getCve_persona() {
        return cve_persona;
    }

    public void setCve_persona(Persona cve_persona) {
        this.cve_persona = cve_persona;
    }

    public TipoMedioComunicacion getCve_tipo() {
        return cve_tipo;
    }

    public void setCve_tipo(TipoMedioComunicacion cve_tipo) {
        this.cve_tipo = cve_tipo;
    }

    public Date getFecha_reg() {
        return fecha_reg;
    }

    public void setFecha_reg(Date fecha_reg) {
        this.fecha_reg = fecha_reg;
    }

    public Date getFecha_mod() {
        return fecha_mod;
    }

    public void setFecha_mod(Date fecha_mod) {
        this.fecha_mod = fecha_mod;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "MedioComunicacion{" + "cve_medio=" + cve_medio + ", cve_persona=" + cve_persona + ", cve_tipo=" + cve_tipo + ", fecha_reg=" + fecha_reg + ", fecha_mod=" + fecha_mod + ", activo=" + activo + '}';
    }

}