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
    void fazerLogin(ActionEvent event) { // Método de ação para o evento de clicar no botão
        String usuario = campoUsuario.getText(); //armazena o texto inserido no campo usuario
        String senha = campoSenha.getText(); //armazena o texto inserido no campo senha

        //verifica se o usuário e a senha estão corretos
        if (usuario.equals("letsquicia") && senha.equals("123456")){  //O método equals() verifica se o conteúdo de duas strings é igual.
            System.out.println("Login funcionando!!!!");
        }else {
            System.out.println("Não deu :(");
        }
    }

}

/* Essa classe é chamada dentro do arquivo FXML, por isso não é necessário instacia-la na classe principal!! :) */
