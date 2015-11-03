/**
 *
 * @author Roberto Eder Weiss Juárez
 * @see {@link http://webxico.blogspot.mx/}
 */
package mx.blogspot.webxico.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import java.util.ArrayList;
import java.util.List;
import mx.blogspot.webxico.dao.DAOFactory;
import mx.blogspot.webxico.dao.PersonaDAO;
import mx.blogspot.webxico.model.Persona;

public class PersonaAction extends ActionSupport implements ModelDriven {

    private final PersonaDAO personaDAO = DAOFactory.getDAOFactory(DAOFactory.MySQL).getPersonaDAO();
    private Persona persona = new Persona();
    private List<Persona> personas = new ArrayList<Persona>();

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
        return SUCCESS;
    }

    public String remove() throws Exception {
        return SUCCESS;
    }

    @Override
    public Persona getModel() {
        return persona;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

}