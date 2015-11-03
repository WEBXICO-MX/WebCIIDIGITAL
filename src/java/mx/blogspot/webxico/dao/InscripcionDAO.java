/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.dao;

import java.util.List;
import mx.blogspot.webxico.model.Inscripcion;

public interface InscripcionDAO {

    public boolean saveOrUpdate(Inscripcion insc);

    public List<Inscripcion> findAll();

    public Inscripcion getById(int id);

    public void remove(int id);

}