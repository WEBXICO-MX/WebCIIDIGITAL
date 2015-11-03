/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.dao;

import java.util.List;

public interface CursoExamenFinal {

    public boolean saveOrUpdate(CursoExamenFinal curso);

    public List<CursoExamenFinal> findAll();

    public CursoExamenFinal getById(int id);

    public void remove(int id);

}