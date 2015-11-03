/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.dao;

import java.util.List;
import mx.blogspot.webxico.model.MedioComunicacion;

public interface MedioComunicacionDAO {

    public boolean saveOrUpdate(MedioComunicacion medio);

    public List<MedioComunicacion> findAll();

    public MedioComunicacion getById(int id);

    public void remove(int id);

}