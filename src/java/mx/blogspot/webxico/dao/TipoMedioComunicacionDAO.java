/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.dao;

import java.util.List;
import mx.blogspot.webxico.model.TipoMedioComunicacion;

public interface TipoMedioComunicacionDAO {

    public boolean saveOrUpdate(TipoMedioComunicacion tipo);

    public List<TipoMedioComunicacion> findAll();

    public TipoMedioComunicacion getById(int id);

    public void remove(int id);

}