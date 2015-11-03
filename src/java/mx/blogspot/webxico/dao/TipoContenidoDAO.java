/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.dao;

import java.util.List;
import mx.blogspot.webxico.model.TipoContenido;

public interface TipoContenidoDAO {

    public boolean saveOrUpdate(TipoContenido tipo);

    public List<TipoContenido> findAll();

    public TipoContenido getById(int id);

    public void remove(int id);

}