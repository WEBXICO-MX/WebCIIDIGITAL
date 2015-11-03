/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.dao;

import java.util.List;
import mx.blogspot.webxico.model.ContenidoTema;

public interface ContenidoTemaDAO {

    public boolean saveOrUpdate(ContenidoTema contenido);

    public List<ContenidoTema> findAll();

    public ContenidoTema getById(int id);

    public void remove(int id);

}