/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.dao;

import java.util.List;
import mx.blogspot.webxico.model.Modalidad;

public interface ModalidadDAO {

    public boolean saveOrUpdate(Modalidad modalidad);

    public List<Modalidad> findAll();

    public Modalidad getById(int id);

    public void remove(int id);

}