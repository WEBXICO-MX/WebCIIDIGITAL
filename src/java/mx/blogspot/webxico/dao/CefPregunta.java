/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.dao;

import java.util.List;

public interface CefPregunta {

    public boolean saveOrUpdate(CefPregunta cef);

    public List<CefPregunta> findAll();

    public CefPregunta getById(int id);

    public void remove(int id);

}