/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.dao;

import java.util.List;
import mx.blogspot.webxico.model.Estado;

public interface EstadoDAO {

    public List<Estado> findAll();

    public Estado getById(int id);

}