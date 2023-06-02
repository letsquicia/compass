import java.util.Date;
import java.util.Locale;
import java.awt.Dimension;
import java.awt.Toolkit; //acessa infos do sistema

public class App {
    public static void main(String[] args) throws Exception {
        // Obtem a hora atual do sistema criando um instanciamento da classe Date
        Date relogio = new Date();
        System.out.println("A hora do sistema é: ");
        System.out.println(relogio.toString());
        
        // Faz o mesmo para obter o idioma padrão, mas utilizando a classe Locale
        Locale loc = Locale.getDefault();
        System.out.println("Seu idioma é: ");
        System.out.println(loc.getDisplayLanguage(loc));
       
        // Busca a resolução da tela do sistema usando as classes Toolkit e Dimension
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        System.out.println("A resolução do seu sistema é: " + width + " x " + height);
       
    
    }
}