import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginControler {

    @FXML
    private TextField campoUsuario;

    @FXML
    private Button entrar;

    @FXML
    private TextField campoSenha;

    @FXML
    void fazerLogin(ActionEvent event) {
        String usuario = campoUsuario.getText();
        String senha = campoSenha.getText();

        if (usuario.equals("letsquicia") && senha.equals("123456")){
            System.out.println("Login funcionando!!!!");
        }else {
            System.out.println("Não deu :(");
        }
    }

}
