/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.dao;

import java.util.List;
import mx.blogspot.webxico.model.EspecializacionCurso;

public interface EspecializacionCursoDAO {

    public boolean saveOrUpdate(EspecializacionCurso esp);

    public List<EspecializacionCurso> findAll();

    public EspecializacionCurso getById(int cve_especializacion, int cve_curso);

    public void remove(int id);

}