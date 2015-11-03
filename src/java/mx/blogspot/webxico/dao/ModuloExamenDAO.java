/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.dao;

import java.util.List;
import mx.blogspot.webxico.model.ModuloExamen;

public interface ModuloExamenDAO {

    public boolean saveOrUpdate(ModuloExamen modulo);

    public List<ModuloExamen> findAll();

    public ModuloExamen getById(int id);

    public void remove(int id);

}