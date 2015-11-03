/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.dao;

import java.util.List;
import mx.blogspot.webxico.model.Instructor;

public interface InstructorDAO {

    public boolean saveOrUpdate(Instructor instructor);

    public List<Instructor> findAll();

    public Instructor getById(int id);

    public void remove(int id);

}