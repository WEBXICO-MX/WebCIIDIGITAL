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
import mx.blogspot.webxico.dao.AlumnoDAO;
import mx.blogspot.webxico.model.Alumno;

public class AlumnoDAOImpl implements AlumnoDAO {

    @Override
    public boolean saveOrUpdate(Alumno alumno) {
     
        boolean grabo = false;
        int last_id = 0;
        Connection conn = MySQLDAOFactory.createConnection();
        String q = "";
        PreparedStatement ps = null;
        try {
            if (alumno.getCve_persona() != 0) {
                q = "UPDATE personas SET nombre = ?, ap_paterno = ?, ap_materno = ?, sexo = ?, fecha_nacimiento = ?,foto = ?,fecha_mod = ?,activo = ? WHERE cve_persona = ?";
                ps = conn.prepareStatement(q);
                ps.setString(1, alumno.getNombre());
                ps.setString(2, alumno.getAp_paterno());
                ps.setString(3, alumno.getAp_materno());
                ps.setString(4, alumno.getSexo());
                ps.setDate(5, new java.sql.Date(alumno.getFecha_nacimiento().getTime()));
                ps.setString(6, alumno.getFoto());
                ps.setObject(7, new java.sql.Timestamp(new java.util.Date().getTime()));
                ps.setBoolean(8, alumno.isActivo());
                ps.setInt(9, alumno.getCve_persona());

                ps.execute();
                ps.close();

                q = "UPDATE alumnos SET matricula = ? WHERE cve_persona = ?";

                ps = conn.prepareStatement(q);
                ps.setString(1, alumno.getMatricula());
                ps.setInt(2, alumno.getCve_persona());

            } else {
                q = "INSERT INTO personas (nombre, ap_paterno, ap_materno, sexo, fecha_nacimiento, foto,fecha_reg,fecha_mod,activo) VALUES (?, ?, ?, ?,?,NULL,?,NULL,?)";
                ps = conn.prepareStatement(q);
                ps.setString(1, alumno.getNombre());
                ps.setString(2, alumno.getAp_paterno());
                ps.setString(3, alumno.getAp_materno());
                ps.setString(4, alumno.getSexo());
                ps.setDate(5, new java.sql.Date(alumno.getFecha_nacimiento().getTime()));
                ps.setObject(6, new java.sql.Timestamp(new java.util.Date().getTime()));
                ps.setBoolean(7, alumno.isActivo());
                ps.execute();
                ps.close();
                
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("select last_insert_id() as last_id from personas");
                if(rs.next())
                { last_id = Integer.parseInt(rs.getString("last_id")); }
                rs.close();

                q = "INSERT INTO alumnos (cve_persona,matricula) VALUES(?,?)";

                ps = conn.prepareStatement(q);
                ps.setInt(1, last_id);
                ps.setString(2, alumno.getMatricula());

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
    public List<Alumno> findAll() {

        List<Alumno> alumnos = new ArrayList();
        Connection conn = null;
        try {
            conn = MySQLDAOFactory.createConnection();
            String q = "SELECT p.cve_persona,p.nombre,p.ap_paterno,p.ap_materno,p.sexo,p.fecha_nacimiento,p.foto,p.fecha_reg,p.fecha_mod,p.activo,a.matricula FROM alumnos AS a INNER JOIN personas AS p ON p.cve_persona = a.cve_persona WHERE p.activo = 1 ORDER BY p.nombre,p.ap_paterno,p.ap_materno";

            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery(q);

            while (rs.next()) {
                Alumno a = new Alumno();
                a.setCve_persona(rs.getInt("cve_persona"));
                a.setNombre(rs.getString("nombre"));
                a.setAp_paterno(rs.getString("ap_paterno"));
                a.setAp_materno(rs.getString("ap_materno"));
                a.setSexo(rs.getString("sexo"));
                a.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
                a.setFoto(rs.getString("foto"));
                a.setFecha_reg(rs.getDate("fecha_reg"));
                a.setFecha_mod(rs.getDate("fecha_mod"));
                a.setActivo(rs.getBoolean("activo"));
                a.setMatricula(rs.getString("matricula"));
                alumnos.add(a);
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

        return alumnos;
    }

    @Override
    public Alumno findById(int id) {

        Alumno alumno = new Alumno();
        Connection conn = null;
        try {
            conn = MySQLDAOFactory.createConnection();
            String q = "SELECT p.cve_persona,p.nombre,p.ap_paterno,p.ap_materno,p.sexo,p.fecha_nacimiento,p.foto,p.fecha_reg,p.fecha_mod,p.activo,a.matricula FROM alumnos AS a INNER JOIN personas AS p ON p.cve_persona = a.cve_persona WHERE p.cve_persona = ?";

            PreparedStatement ps = conn.prepareStatement(q);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                alumno.setCve_persona(rs.getInt("cve_persona"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setAp_paterno(rs.getString("ap_paterno"));
                alumno.setAp_materno(rs.getString("ap_materno"));
                alumno.setSexo(rs.getString("sexo"));
                alumno.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
                alumno.setFoto(rs.getString("foto"));
                alumno.setFecha_reg(rs.getDate("fecha_reg"));
                alumno.setFecha_mod(rs.getDate("fecha_mod"));
                alumno.setActivo(rs.getBoolean("activo"));
                alumno.setMatricula(rs.getString("matricula"));

            }
            ps.close();

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

        return alumno;
    }

    @Override
    public void remove(int id) {
        Connection conn = MySQLDAOFactory.createConnection();
        try {
            String q = " UPDATE personas SET activo = 0 WHERE cve_persona = ?";

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