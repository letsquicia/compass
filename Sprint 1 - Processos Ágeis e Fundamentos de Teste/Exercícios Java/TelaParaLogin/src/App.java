import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch(App.class, args); 
    }


    @Override
public void start(Stage primaryStage) throws Exception {
    FXMLLoader fxmlLoader = new FXMLLoader();  //criação do objeto FXMLLoader para carregar o arquivo FXML
    URL resource = getClass().getResource("/tela.fxml"); //pega a URL do caminho relativo 
    fxmlLoader.setLocation(resource); //Define a localiza~çao do arquivo FXML para o FXMLLoader

    //construindo estrutura da interface
    Parent app = fxmlLoader.load();
    Scene tela = new Scene(app);

    primaryStage.setTitle("Abriu a janela!!!");
    primaryStage.setScene(tela);
    primaryStage.show();
}

}