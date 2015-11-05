/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.dao;

import java.util.List;
import mx.blogspot.webxico.model.Persona;

public interface PersonaDAO {

    public boolean saveOrUpdate(Persona persona);

    public List<Persona> findAll();

    public Persona findById(int id);

    public void remove(int id);

}