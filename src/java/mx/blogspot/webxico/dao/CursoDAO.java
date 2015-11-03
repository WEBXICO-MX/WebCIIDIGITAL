/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.dao;

import java.util.List;
import mx.blogspot.webxico.model.Curso;

public interface CursoDAO {

    public boolean saveOrUpdate(Curso curso);

    public List<Curso> findAll();

    public Curso getById(int id);

    public void remove(int id);

}