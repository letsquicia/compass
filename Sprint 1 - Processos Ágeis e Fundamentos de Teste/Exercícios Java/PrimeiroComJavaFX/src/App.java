import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch(App.class, args); //inicializando JavaFX
    }


    @Override // a utilização da anotação @Override é opcional nesse caso, pois ela é usada quando um método está sobrescrevendo um método da classe pai ou de uma interface, nesse caso não esta. 
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Priemira vez usando JavaFX"); //título da janela
        Button botao = new Button("Clica"); //criação do botão
        botao.setOnAction(new EventHandler<ActionEvent>() {   
            
            //criação do evento de clicar no botão
            @Override 
            public void handle(ActionEvent event) { 
                System.out.println("FUNCIONOU!!!!!!!!!!!!!!!"); //ação realizada após clicar no botão
            }
            
        });

        
        StackPane app = new StackPane(); //utilização da classe StacPane para criação do layout
        app.getChildren().addAll(botao); //inserindo o botão no layout
        primaryStage.setScene(new Scene(app, 250, 200)); //configurações da tela
        primaryStage.show(); // roda a exibição
    }
}