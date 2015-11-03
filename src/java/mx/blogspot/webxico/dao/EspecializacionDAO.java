/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.dao;

import java.util.List;
import mx.blogspot.webxico.model.Especializacion;

public interface EspecializacionDAO {

    public boolean saveOrUpdate(Especializacion esp);

    public List<Especializacion> findAll();

    public Especializacion getById(int id);

    public void remove(int id);

}