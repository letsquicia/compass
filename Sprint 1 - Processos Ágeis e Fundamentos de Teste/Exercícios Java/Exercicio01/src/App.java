import java.util.Date;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {

        Date relogio = new Date();
        System.out.println("A hora do sistema é: ");
        System.out.println(relogio.toString());

        Locale loc = Locale.getDefault();
        System.out.println("Seu idioma é: ");
        System.out.println(loc.getDisplayLanguage(loc));

        /* Não funcionou, analisar
        yhToolkit t = Toolkit.getDefaultToolkit();
        Dimension d = t.getScreenSize();
        System.out.println( "A resolução do seu sistema é: " + d.width +" X " + d.height);    
        */
    
    }
}