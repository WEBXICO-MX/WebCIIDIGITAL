/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.dao;

import java.util.List;
import mx.blogspot.webxico.model.Domicilio;

public interface DomicilioDAO {

    public boolean saveOrUpdate(Domicilio domicilio);

    public List<Domicilio> findAll();

    public Domicilio getById(int id);

    public void remove(int id);

}