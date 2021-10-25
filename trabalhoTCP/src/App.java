//codigo principal que chama as classes
//teste
public class App {
    static String valorcarac; 

    public static void main(String[] args) {
       
        caractere objcaractere = new caractere();
        valorcarac = objcaractere.receberEntrada();
        System.out.println("valor eh: " + valorcarac);
        objcaractere.validarCaractere(valorcarac);
        
    }
}