/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.dao;

import java.util.List;
import mx.blogspot.webxico.model.CefRespuesta;

public interface CefRespuestaDAO {

    public boolean saveOrUpdate(CefRespuesta cef);

    public List<CefRespuesta> findAll();

    public CefRespuesta getById(int id);

    public void remove(int id);

}