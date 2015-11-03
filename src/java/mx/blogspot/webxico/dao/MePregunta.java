/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.dao;

import java.util.List;

public interface MePregunta {

    public boolean saveOrUpdate(MePregunta me);

    public List<MePregunta> findAll();

    public MePregunta getById(int id);

    public void remove(int id);

}