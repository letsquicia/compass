import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculadoraController {

    @FXML
    private Button btnCalc;

    @FXML
    private TextField txtNum;

    @FXML
    private Label elevCubo;

    @FXML
    private Label restDivDois;

    @FXML
    private Label raizQuad;

    @FXML
    private Label raizCub;

    @FXML
    private Label valorAbs;

    @FXML
    void calculando(ActionEvent event) {
    String input = txtNum.getText(); // obtém o valor inserido no campo de texto
    int valor = Integer.parseInt(input); // converte o valor para inteiro

    int restoDivisao = valor % 2;  //calcula o resto da divisão
    int elevadoCubo = valor * valor * valor; // calcula a exponencial 
    double raizQuadrada = Math.sqrt(valor); // calcula a raiz quadrada
    double raizCubica = Math.cbrt(valor);  // calcula a raiz cubica
    int valorAbsoluto = Math.abs(valor); // calcula o valor absoluto

    // fazendo as conversões para mostrar os resultados
    restDivDois.setText(Integer.toString(restoDivisao));
    elevCubo.setText(Integer.toString(elevadoCubo));
    raizQuad.setText(Double.toString(raizQuadrada));
    raizCub.setText(Double.toString(raizCubica));
    valorAbs.setText(Integer.toString(valorAbsoluto));
}


}
