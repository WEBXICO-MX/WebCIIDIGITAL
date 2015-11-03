/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.dao;

import java.util.List;
import mx.blogspot.webxico.model.TemaExamen;

public interface TemaExamenDAO {

    public boolean saveOrUpdate(TemaExamen tema);

    public List<TemaExamen> findAll();

    public TemaExamen getById(int id);

    public void remove(int id);

}