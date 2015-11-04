/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.action;

import static com.opensymphony.xwork2.Action.INPUT;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import mx.blogspot.webxico.dao.DAOFactory;
import mx.blogspot.webxico.dao.PersonaDAO;
import mx.blogspot.webxico.model.Persona;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;

public class PersonaAction extends ActionSupport implements ModelDriven, ServletRequestAware {

    private final PersonaDAO personaDAO = DAOFactory.getDAOFactory(DAOFactory.MySQL).getPersonaDAO();
    private Persona persona = new Persona();
    private List<Persona> personas = new ArrayList<Persona>();

    private File fileUpload;
    private String fileUploadFileName;
    private String fileUploadContentType;

    private HttpServletRequest servletRequest;

    public PersonaAction() {
    }

    @Override
    public String execute() {
        personas = personaDAO.findAll();
        return SUCCESS;
    }

    public String create() throws Exception {
        return SUCCESS;
    }

    public String saveOrUpdate() throws Exception {
        boolean grabo = personaDAO.saveOrUpdate(persona);
        System.out.println("Desde PersonaAction, grabo =" + grabo);
        if (!grabo) {
            addActionMessage("[ERROR] persona no guardada.");
            return ERROR;
        } else {
            addActionMessage("persona guardada con éxito.");
            return SUCCESS;
        }
    }

    public String edit() throws Exception {
        return SUCCESS;
    }

    public String show() throws Exception {
        // Debido a que implemento ModelDriven, el parametro llamado cve_persona que envio desde base/personas/index llamada al setter setCve_persona() del objeto persona
        int id = persona.getCve_persona();
        Persona tmp = personaDAO.getById(id);

        persona.setNombre(tmp.getNombre());
        persona.setAp_paterno(tmp.getAp_paterno());
        persona.setAp_materno(tmp.getAp_materno());
        persona.setSexo(tmp.getSexo());
        persona.setFecha_nacimiento(tmp.getFecha_nacimiento());
        persona.setFecha_reg(tmp.getFecha_reg());
        persona.setFecha_mod(tmp.getFecha_mod());
        persona.setActivo(tmp.isActivo());

        return SUCCESS;
    }

    public String remove() throws Exception {
        // Debido a que implemento ModelDriven, el parametro llamado cve_persona que envio desde base/personas/index llamada al setter setCve_persona() del objeto persona
        int id = persona.getCve_persona();
        personaDAO.remove(id);
        return SUCCESS;
    }

    public String form_upload() throws Exception {
        // Debido a que implemento ModelDriven, el parametro llamado cve_persona que envio desde base/personas/index llamada al setter setCve_persona() del objeto persona
        int id = persona.getCve_persona();
        Persona tmp = personaDAO.getById(id);

        persona.setNombre(tmp.getNombre());
        persona.setAp_paterno(tmp.getAp_paterno());
        persona.setAp_materno(tmp.getAp_materno());
        persona.setSexo(tmp.getSexo());
        persona.setFecha_nacimiento(tmp.getFecha_nacimiento());
        persona.setFecha_reg(tmp.getFecha_reg());
        persona.setFecha_mod(tmp.getFecha_mod());
        persona.setActivo(tmp.isActivo());
        return SUCCESS;
    }

    public String upload() throws Exception {
        try {
            //Debido a que implemento "ModelDriven" el parametro "id" es asignado a la propieda "id" del objeto actividad y el parametro "num" es asigando a la propidad "num" que se encuentra en este action, por lo que el
            //objeto HttpServletRequest ya no es requerido para obtener los valores de estos parametros, es un proceso automático que realiza struts2 quizas usando inyección de dependecias.

            //ANTES:
            //HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
            //int num = Integer.parseInt(request.getParameter("num"));
            //actividad = actividadDAO.findById(Integer.parseInt(request.getParameter("id")));
            int id = persona.getCve_persona();
            Persona tmp = personaDAO.getById(id);

            persona.setNombre(tmp.getNombre());
            persona.setAp_paterno(tmp.getAp_paterno());
            persona.setAp_materno(tmp.getAp_materno());
            persona.setSexo(tmp.getSexo());
            persona.setFecha_nacimiento(tmp.getFecha_nacimiento());
            persona.setFecha_reg(tmp.getFecha_reg());
            persona.setFecha_mod(tmp.getFecha_mod());
            persona.setActivo(tmp.isActivo());
            System.out.println("Entre a String upload(), " + persona);

            String path = "/img/personas";
            String fileName = String.valueOf(persona.getCve_persona()) + this.fileUploadFileName.subSequence(this.fileUploadFileName.lastIndexOf("."), fileUploadFileName.length());
            String filePath = servletRequest.getRealPath(path);
            persona.setFoto(path + "/" + fileName);

            File fileToCreate = new File(filePath, fileName);
            FileUtils.copyFile(this.fileUpload, fileToCreate);
            addActionMessage(tmp + " subida con éxito.");
        } catch (Exception e) {
            addActionError(e.getMessage());

            return INPUT;
        }
        return SUCCESS;
    }

    @Override
    public Persona getModel() {
        return persona;
    }

    public Persona getPersona() {
        return persona;
    }
    
    public List<Persona> getPersonas() {
        return personas;
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