/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.dao.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import mx.blogspot.webxico.dao.AlumnoDAO;
import mx.blogspot.webxico.dao.DAOFactory;
import mx.blogspot.webxico.dao.PersonaDAO;

public class MySQLDAOFactory extends DAOFactory {

    public static Connection createConnection() {
        try {
            // load the PoolMan JDBC Driver
            Class.forName("com.codestudio.sql.PoolMan").newInstance();
        } catch (Exception e) {
            System.out.println("Could Not Find the PoolMan Driver. Is poolman.jar in your CLASSPATH?");
        }

        Connection con = null;
        try {

            con = DriverManager.getConnection("jdbc:poolman://control");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return con;
    }

    @Override
    public PersonaDAO getPersonaDAO() {
        return new PersonaDAOImpl();
    }

    @Override
    public AlumnoDAO getAlumnoDAO() {
        return new AlumnoDAOImpl();
    }

}