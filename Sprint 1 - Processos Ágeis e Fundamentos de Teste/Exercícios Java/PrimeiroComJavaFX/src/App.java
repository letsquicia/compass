import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch(App.class, args); 
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Funciona logo!!!!"); 
        Button botao = new Button("Clica");
        botao.setOnAction(new EventHandler<ActionEvent>() {   

            @Override
            public void handle(ActionEvent event) {
                System.out.println("FUNCIONOU!!!!!!!!!!!!!!!"); 
            }
            
        });

        
        StackPane app = new StackPane();
        app.getChildren().addAll(botao); 
        primaryStage.setScene(new Scene(app, 250, 200)); 
        primaryStage.show(); 
    }
}