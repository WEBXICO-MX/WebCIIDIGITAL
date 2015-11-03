/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.dao;

import java.util.List;
import mx.blogspot.webxico.model.Respuesta;

public interface RespuestaDAO {

    public boolean saveOrUpdate(Respuesta respuesta);

    public List<Respuesta> findAll();

    public Respuesta getById(int id);

    public void remove(int id);

}