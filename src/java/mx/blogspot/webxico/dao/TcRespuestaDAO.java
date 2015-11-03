/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.dao;

import java.util.List;
import mx.blogspot.webxico.model.TcRespuesta;

public interface TcRespuestaDAO {

    public boolean saveOrUpdate(TcRespuesta tc);

    public List<TcRespuesta> findAll();

    public TcRespuesta getById(int id);

    public void remove(int id);

}