/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */

package mx.blogspot.webxico.dao;

import mx.blogspot.webxico.dao.mysql.MySQLDAOFactory;


public abstract class DAOFactory {
    public static final int MySQL = 1;
    
    public abstract PersonaDAO getPersonaDAO();

    public static DAOFactory getDAOFactory(
            int whichFactory) {

        switch (whichFactory) {
            case MySQL:
                return new MySQLDAOFactory();
            default:
                return null;
        }
    }

}
