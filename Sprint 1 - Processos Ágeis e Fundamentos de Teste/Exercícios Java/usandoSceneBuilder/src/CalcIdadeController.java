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
    void calcularIdade(ActionEvent event) { //método de ação que será executado quando o botão for clicado, recebe um evento ActionEvent como parâmetro
        int anoNascimento = Integer.parseInt(campoAnoNasc.getText()); //conversão da string do campo de texto para inteiro referente ao ano de nasc
        int anoAtual = LocalDate.now().getYear(); // pega o ano atua
    
        int idade = anoAtual - anoNascimento; // cria a lógica do calculo
    
        resultado.setText(String.valueOf(idade)); //mostra na tela
    }

}

