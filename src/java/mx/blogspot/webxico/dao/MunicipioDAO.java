/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.dao;

import java.util.List;
import mx.blogspot.webxico.model.Municipio;

public interface MunicipioDAO {

    public List<Municipio> findAll();

    public List<Municipio> findByEstado(int cve_estado);

    public Municipio getById(int cve_municipio, int cve_estado);

}