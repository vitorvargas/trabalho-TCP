//codigo principal que chama as classes
import org.jfugue. *;

public class App {
    static String valorcarac; 

    public static void main(String[] args) {
       
        caractere objcaractere = new caractere();
        valorcarac = objcaractere.receberEntrada();
        System.out.println("valor eh: " + valorcarac);
        objcaractere.validarCaractere(valorcarac);
        Player player = new Player();
        Pattern pattern = new Pattern("C D E F G A B");
        player.play(pattern);
        
    }
}