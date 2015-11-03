/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.dao;

import java.util.List;
import mx.blogspot.webxico.model.Tema;

public interface TemaDAO {

    public boolean saveOrUpdate(Tema tema);

    public List<Tema> findAll();

    public Tema getById(int id);

    public void remove(int id);

}