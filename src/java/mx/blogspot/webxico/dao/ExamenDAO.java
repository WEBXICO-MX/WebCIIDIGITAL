/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.dao;

import java.util.List;
import mx.blogspot.webxico.model.Examen;

public interface ExamenDAO {

    public boolean saveOrUpdate(Examen examen);

    public List<Examen> findAll();

    public Examen getById(int id);

    public void remove(int id);

}
