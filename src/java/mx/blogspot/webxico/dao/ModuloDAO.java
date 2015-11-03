/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.dao;

import java.util.List;
import mx.blogspot.webxico.model.Modulo;

public interface ModuloDAO {

    public boolean saveOrUpdate(Modulo modulo);

    public List<Modulo> findAll();

    public Modulo getById(int id);

    public void remove(int id);

}