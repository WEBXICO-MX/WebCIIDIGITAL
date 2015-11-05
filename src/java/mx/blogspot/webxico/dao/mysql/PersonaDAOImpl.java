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
        String q = "";
        PreparedStatement ps = null;
        try {
            if (persona.getCve_persona() != 0) {
                q = "UPDATE personas SET nombre = ?, ap_paterno = ?, ap_materno = ?, sexo = ?, fecha_nacimiento = ?,foto = ?,fecha_mod = ?,activo = ? WHERE cve_persona = ?";
                ps = conn.prepareStatement(q);
                ps.setString(1, persona.getNombre());
                ps.setString(2, persona.getAp_paterno());
                ps.setString(3, persona.getAp_materno());
                ps.setString(4, persona.getSexo());
                ps.setDate(5, new java.sql.Date(persona.getFecha_nacimiento().getTime()));
                ps.setString(6, persona.getFoto());
                ps.setObject(7, new java.sql.Timestamp(new java.util.Date().getTime()));
                ps.setBoolean(8, persona.isActivo());
                ps.setInt(9, persona.getCve_persona());
            } else {
                q = "INSERT INTO personas (nombre, ap_paterno, ap_materno, sexo, fecha_nacimiento, foto,fecha_reg,fecha_mod,activo) VALUES (?, ?, ?, ?,?,NULL,?,NULL,?)";

                ps = conn.prepareStatement(q);
                ps.setString(1, persona.getNombre());
                ps.setString(2, persona.getAp_paterno());
                ps.setString(3, persona.getAp_materno());
                ps.setString(4, persona.getSexo());
                ps.setDate(5, new java.sql.Date(persona.getFecha_nacimiento().getTime()));
                ps.setObject(6, new java.sql.Timestamp(new java.util.Date().getTime()));
                ps.setBoolean(7, persona.isActivo());
            }

            ps.execute();
            int count = ps.getUpdateCount();
            if (count > 0) {
                grabo = true;
            }
            ps.close();

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
            String q = "SELECT * FROM personas ORDER BY nombre, ap_paterno, ap_materno";

            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery(q);

            while (rs.next()) {
                Persona p = new Persona();
                p.setCve_persona(rs.getInt("cve_persona"));
                p.setNombre(rs.getString("nombre"));
                p.setAp_paterno(rs.getString("ap_paterno"));
                p.setAp_materno(rs.getString("ap_materno"));
                p.setSexo(rs.getString("sexo"));
                p.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
                p.setFoto(rs.getString("foto"));
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

            String q = "SELECT * FROM personas WHERE cve_persona = ?";

            PreparedStatement ps = conn.prepareStatement(q);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                persona.setCve_persona(rs.getInt("cve_persona"));
                persona.setNombre(rs.getString("nombre"));
                persona.setAp_paterno(rs.getString("ap_paterno"));
                persona.setAp_materno(rs.getString("ap_materno"));
                persona.setSexo(rs.getString("sexo"));
                persona.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
                persona.setFoto(rs.getString("foto"));
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
            String q = " DELETE FROM personas WHERE cve_persona = ?";

            PreparedStatement ps = conn.prepareStatement(q);
            ps.setInt(1, id);

            ps.execute();
            ps.close();

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
