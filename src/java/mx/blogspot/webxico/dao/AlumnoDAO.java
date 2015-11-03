/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.dao;

import java.util.List;
import mx.blogspot.webxico.model.Alumno;

public interface AlumnoDAO {

    public boolean saveOrUpdate(Alumno alumno);

    public List<Alumno> findAll();

    public Alumno findById(int id);

    public void remove(int id);

}