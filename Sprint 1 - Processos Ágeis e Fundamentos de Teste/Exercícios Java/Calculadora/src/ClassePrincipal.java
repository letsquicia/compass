import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ClassePrincipal extends Application{
    public static void main(String[] args) throws Exception {
        launch(ClassePrincipal.class, args); 
    }


    @Override
public void start(Stage primaryStage) throws Exception {
    FXMLLoader fxmlLoader = new FXMLLoader();  //criação do objeto FXMLLoader para carregar o arquivo FXML
    URL resource = getClass().getResource("/telaCalc.fxml"); //pega a URL do caminho relativo 
    fxmlLoader.setLocation(resource); //Define a localização do arquivo FXML para o FXMLLoader

    //construindo estrutura da interface
    Parent app = fxmlLoader.load();
    Scene tela = new Scene(app);

    primaryStage.setTitle("Calculadora bem específica");
    primaryStage.setScene(tela);
    primaryStage.show();
}

}