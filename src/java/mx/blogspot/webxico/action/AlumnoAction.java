/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */

package mx.blogspot.webxico.action;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.INPUT;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import mx.blogspot.webxico.dao.DAOFactory;
import mx.blogspot.webxico.dao.AlumnoDAO;
import mx.blogspot.webxico.model.Alumno;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;

public class AlumnoAction extends ActionSupport implements ModelDriven, ServletRequestAware {

    private final AlumnoDAO alumnoDAO = DAOFactory.getDAOFactory(DAOFactory.MySQL).getAlumnoDAO();
    private Alumno alumno = new Alumno();
    private List<Alumno> alumnos = new ArrayList<Alumno>();

    private File fileUpload;
    private String fileUploadFileName;
    private String fileUploadContentType;

    private HttpServletRequest servletRequest;

    public AlumnoAction() {
    }

    @Override
    public String execute() {
        alumnos = alumnoDAO.findAll();
        return SUCCESS;
    }

    public String create() throws Exception {
        return SUCCESS;
    }

    public String saveOrUpdate() throws Exception {
        boolean grabo = alumnoDAO.saveOrUpdate(alumno);
        if (!grabo) {
            addActionMessage("[ERROR] alumno no guardada.");
            return ERROR;
        } else {
            addActionMessage("alumno guardada con éxito.");
            return SUCCESS;
        }
    }

    public String edit() throws Exception {
        return SUCCESS;
    }

    public String show() throws Exception {
        // Debido a que implemento ModelDriven, el parametro llamado cve_alumno que envio desde base/alumnos/index llamada al setter setCve_alumno() del objeto alumno
        int id = alumno.getCve_persona();
        Alumno tmp = alumnoDAO.findById(id);

        alumno.setNombre(tmp.getNombre());
        alumno.setAp_paterno(tmp.getAp_paterno());
        alumno.setAp_materno(tmp.getAp_materno());
        alumno.setSexo(tmp.getSexo());
        alumno.setFecha_nacimiento(tmp.getFecha_nacimiento());
        alumno.setFecha_reg(tmp.getFecha_reg());
        alumno.setFecha_mod(tmp.getFecha_mod());
        alumno.setActivo(tmp.isActivo());
        alumno.setMatricula(tmp.getMatricula());

        return SUCCESS;
    }

    public String remove() throws Exception {
        // Debido a que implemento ModelDriven, el parametro llamado cve_alumno que envio desde base/alumnos/index llamada al setter setCve_alumno() del objeto alumno
        int id = alumno.getCve_persona();
        alumnoDAO.remove(id);
        return SUCCESS;
    }

    public String form_upload() throws Exception {
        // Debido a que implemento ModelDriven, el parametro llamado cve_alumno que envio desde base/alumnos/index llamada al setter setCve_alumno() del objeto alumno
        int id = alumno.getCve_persona();
        Alumno tmp = alumnoDAO.findById(id);

        alumno.setNombre(tmp.getNombre());
        alumno.setAp_paterno(tmp.getAp_paterno());
        alumno.setAp_materno(tmp.getAp_materno());
        alumno.setSexo(tmp.getSexo());
        alumno.setFecha_nacimiento(tmp.getFecha_nacimiento());
        alumno.setFecha_reg(tmp.getFecha_reg());
        alumno.setFecha_mod(tmp.getFecha_mod());
        alumno.setActivo(tmp.isActivo());
        alumno.setMatricula(tmp.getMatricula());
        return SUCCESS;
    }

    public String upload() throws Exception {
        try {
            int id = alumno.getCve_persona();
            Alumno tmp = alumnoDAO.findById(id);

            alumno.setNombre(tmp.getNombre());
            alumno.setAp_paterno(tmp.getAp_paterno());
            alumno.setAp_materno(tmp.getAp_materno());
            alumno.setSexo(tmp.getSexo());
            alumno.setFecha_nacimiento(tmp.getFecha_nacimiento());
            alumno.setFecha_reg(tmp.getFecha_reg());
            alumno.setFecha_mod(tmp.getFecha_mod());
            alumno.setActivo(tmp.isActivo());
            alumno.setMatricula(tmp.getMatricula());

            String path = "/img/personas";
            String fileName = String.valueOf(alumno.getCve_persona()) + this.fileUploadFileName.subSequence(this.fileUploadFileName.lastIndexOf("."), fileUploadFileName.length());
            String filePath = servletRequest.getRealPath(path);
            alumno.setFoto(path + "/" + fileName);

            File fileToCreate = new File(filePath, fileName);
            FileUtils.copyFile(this.fileUpload, fileToCreate);
            addActionMessage(fileName + " subida con éxito.");
        } catch (Exception e) {
            addActionError(e.getMessage());

            return INPUT;
        }
        return SUCCESS;
    }

    @Override
    public Alumno getModel() {
        return alumno;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    
    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public File getFileUpload() {
        return fileUpload;
    }

    public void setFileUpload(File fileUpload) {
        this.fileUpload = fileUpload;
    }

    public String getFileUploadFileName() {
        return fileUploadFileName;
    }

    public void setFileUploadFileName(String fileUploadFileName) {
        this.fileUploadFileName = fileUploadFileName;
    }

    public String getFileUploadContentType() {
        return fileUploadContentType;
    }

    public void setFileUploadContentType(String fileUploadContentType) {
        this.fileUploadContentType = fileUploadContentType;
    }

    @Override
    public void setServletRequest(HttpServletRequest hsr) {
        this.servletRequest = hsr;
    }

}