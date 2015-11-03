/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.dao.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.blogspot.webxico.dao.PersonaDAO;
import mx.blogspot.webxico.model.Persona;

public class PersonaDAOImpl implements PersonaDAO {

    @Override
    public boolean saveOrUpdate(Persona persona) {
        boolean grabo = false;
        Connection conn = MySQLDAOFactory.createConnection();
        try {

            Calendar calendar = Calendar.getInstance();
            java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());

            String query = " INSERT INTO personas (nombre, ap_paterno, ap_materno, sexo, fecha_nacimiento, fecha_reg,fecha_mod,activo) VALUES (?, ?, ?, ?,?,?,NULL,?)";

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, persona.getNombre());
            preparedStmt.setString(2, persona.getAp_paterno());
            preparedStmt.setString(3, persona.getAp_materno());
            preparedStmt.setBoolean(4, persona.isSexo());
            preparedStmt.setDate(5, startDate);
            preparedStmt.setDate(6, startDate);
            preparedStmt.setBoolean(7, persona.isActivo());

            // execute the preparedstatement
            grabo = preparedStmt.execute();
            preparedStmt.close();

        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());

        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(PersonaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return grabo;

    }

    @Override
    public List<Persona> findAll() {
        List<Persona> personas = new ArrayList();
        Connection conn = null;
        try {
            conn = MySQLDAOFactory.createConnection();
            String query = "SELECT * FROM personas ORDER BY nombre, ap_paterno, ap_materno";
            // create the java statement
            Statement st = conn.createStatement();

            // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(query);

            // iterate through the java resultset
            while (rs.next()) {
                Persona p = new Persona();
                p.setCve_persona(rs.getInt("cve_persona"));
                p.setNombre(rs.getString("nombre"));
                p.setAp_paterno(rs.getString("ap_paterno"));
                p.setAp_materno(rs.getString("ap_materno"));
                p.setSexo(rs.getBoolean("sexo"));
                p.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
                p.setFecha_reg(rs.getDate("fecha_reg"));
                p.setFecha_mod(rs.getDate("fecha_mod"));
                p.setActivo(rs.getBoolean("activo"));
                personas.add(p);
            }
            st.close();

        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }

            } catch (SQLException e) {

            }
        }

        return personas;
    }

    @Override
    public Persona getById(int id) {
        Persona persona = new Persona();
        Connection conn = MySQLDAOFactory.createConnection();
        try {

            String query = "SELECT * FROM personas WHERE cve_persona = ?";

            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setInt(1, id);

            ResultSet rs = preparedStmt.executeQuery();

            while (rs.next()) {
                persona.setCve_persona(rs.getInt("id"));
                persona.setNombre(rs.getString("nombre"));
                persona.setAp_paterno(rs.getString("ap_paterno"));
                persona.setAp_materno(rs.getString("ap_materno"));
                persona.setSexo(rs.getBoolean("sexo"));
                persona.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
                persona.setFecha_reg(rs.getDate("fecha_reg"));
                persona.setFecha_mod(rs.getDate("fecha_mod"));
                persona.setActivo(rs.getBoolean("activo"));

            }
            rs.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(PersonaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return persona;
    }

    @Override
    public void remove(int id) {
        Connection conn = MySQLDAOFactory.createConnection();
        try {

            Calendar calendar = Calendar.getInstance();
            java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());

            String query = " DELETE FROM personas WHERE cve_persona = ?";

            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setInt(1, id);

            preparedStmt.execute();
            preparedStmt.close();

        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(PersonaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}