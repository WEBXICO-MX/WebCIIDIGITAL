/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.dao;

import java.util.List;
import mx.blogspot.webxico.model.Pregunta;

public interface PreguntaDAO {

    public boolean saveOrUpdate(Pregunta pregunta);

    public List<Pregunta> findAll();

    public Pregunta getById(int id);

    public void remove(int id);

}