/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.model;

import java.io.Serializable;
import java.util.Calendar;

public class ContenidoTema implements Serializable {

    private int cve_contenido;
    private Tema cve_tema;
    private TipoContenido cve_tipo;
    private String valor;
    private Calendar fecha_reg;
    private Calendar fecha_mod;
    private boolean activo;

    public ContenidoTema() {
    }

    public ContenidoTema(int cve_contenido, Tema cve_tema, TipoContenido cve_tipo, String valor, Calendar fecha_reg, Calendar fecha_mod, boolean activo) {
        this.cve_contenido = cve_contenido;
        this.cve_tema = cve_tema;
        this.cve_tipo = cve_tipo;
        this.valor = valor;
        this.fecha_reg = fecha_reg;
        this.fecha_mod = fecha_mod;
        this.activo = activo;
    }

    public int getCve_contenido() {
        return cve_contenido;
    }

    public void setCve_contenido(int cve_contenido) {
        this.cve_contenido = cve_contenido;
    }

    public Tema getCve_tema() {
        return cve_tema;
    }

    public void setCve_tema(Tema cve_tema) {
        this.cve_tema = cve_tema;
    }

    public TipoContenido getCve_tipo() {
        return cve_tipo;
    }

    public void setCve_tipo(TipoContenido cve_tipo) {
        this.cve_tipo = cve_tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Calendar getFecha_reg() {
        return fecha_reg;
    }

    public void setFecha_reg(Calendar fecha_reg) {
        this.fecha_reg = fecha_reg;
    }

    public Calendar getFecha_mod() {
        return fecha_mod;
    }

    public void setFecha_mod(Calendar fecha_mod) {
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
        return "ContenidoTema{" + "cve_contenido=" + cve_contenido + ", cve_tema=" + cve_tema + ", cve_tipo=" + cve_tipo + ", valor=" + valor + ", fecha_reg=" + fecha_reg + ", fecha_mod=" + fecha_mod + ", activo=" + activo + '}';
    }

}