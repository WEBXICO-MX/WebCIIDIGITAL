/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.dao;

import java.util.List;
import mx.blogspot.webxico.model.TcPregunta;

public interface TcPreguntaDAO {

    public boolean saveOrUpdate(TcPregunta tc);

    public List<TcPregunta> findAll();

    public TcPregunta getById(int id);

    public void remove(int id);

}