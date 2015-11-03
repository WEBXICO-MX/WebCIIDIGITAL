/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.dao;

import java.util.List;
import mx.blogspot.webxico.model.MeRespuesta;

public interface MeRespuestaDAO {

    public boolean saveOrUpdate(MeRespuesta me);

    public List<MeRespuesta> findAll();

    public MeRespuesta getById(int id);

    public void remove(int id);

}
