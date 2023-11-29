package beans;

import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;
import model.Autor;
import model.Usuario;
import service.IDAO;
import service.ImplIDAO;

import java.io.Serializable;
import java.util.List;

@Named("usuarioBean")
@ViewScoped
@Getter
@Setter
public class usuarioBean implements Serializable {

    private IDAO dao = new ImplIDAO();
    private Usuario usuario = new Usuario();  // Usa la nueva entidad Usuario

    // Constructor y getters/setters

    public String redirectMapa() {
        // Inserta el nuevo usuario en la base de datos
        dao.insert(usuario);

        return "hola";
    }

    public void redirectInicio(){

    }

}
