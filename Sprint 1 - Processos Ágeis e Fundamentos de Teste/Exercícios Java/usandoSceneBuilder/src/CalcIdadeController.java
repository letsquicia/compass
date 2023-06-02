import java.awt.event.ActionEvent;
import java.time.LocalDate;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalcIdadeController {

    @FXML
    private Button botaoCalc;

    @FXML
    private Label resultado;

    @FXML
    private TextField campoAnoNasc;

    @FXML
    void f80909(ActionEvent event) {

    }

    @FXML
    void calcularIdade(ActionEvent event) {
        int anoNascimento = Integer.parseInt(campoAnoNasc.getText());
        int anoAtual = LocalDate.now().getYear();
    
        int idade = anoAtual - anoNascimento;
    
        resultado.setText(String.valueOf(idade));
    }

}

