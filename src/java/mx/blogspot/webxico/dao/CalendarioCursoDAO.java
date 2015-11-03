/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.dao;

import java.util.List;
import mx.blogspot.webxico.model.CalendarioCurso;

public interface CalendarioCursoDAO {

    public boolean saveOrUpdate(CalendarioCurso calendario);

    public List<CalendarioCurso> findAll();

    public CalendarioCurso getById(int id);

    public void remove(int id);

}