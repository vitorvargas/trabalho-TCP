import java.util.Scanner;
import javax.swing.JTextField;

public class caractere {
  Scanner objcarac = new Scanner(System.in);

  public String receberEntrada(String textobotao) {
    //GUI gui = new GUI();
    String caracdigitado = textobotao;
       
      //System.out.println("digite um caractere valido ou uma frase: ");
      //caracdigitado = objcarac.nextLine();
      for(int j=0;j<caracdigitado.length();j++){
        if('a' != caracdigitado.charAt(j) && 'b' != caracdigitado.charAt(j) 
  && 'c' != caracdigitado.charAt(j) && 'd' != caracdigitado.charAt(j)
  && 'e' != caracdigitado.charAt(j) && 'f' != caracdigitado.charAt(j) 
  && 'g' != caracdigitado.charAt(j)){
    System.out.println("digite um caractere valido ou uma frase: ");
      caracdigitado = objcarac.nextLine();
      j=0;

  } 

      }
      
    return caracdigitado;} 
  
  public void validarCaractere(String validacarac) {
            notas objnotas = new notas();
            for(int i=0;i<validacarac.charAt(i);i++){
            switch (validacarac.charAt(i)) {
            case 'a':  System.out.println("tocar Nota La");
                      
                      objnotas.tocarNotas("A");
                     break;                                 
            case 'b':  System.out.println("tocar Nota Si");
            objnotas.tocarNotas("B");
                     break;                                 
            case 'c':  System.out.println("tocar Nota Do");
            objnotas.tocarNotas("C");
                     break;
            case 'd':  System.out.println("tocar Nota Re");
            objnotas.tocarNotas("D");
                     break;
            case 'e':  System.out.println("tocar Nota Mi");
            objnotas.tocarNotas("E");
                     break;
            case 'f':  System.out.println("tocar Nota Fa");
            objnotas.tocarNotas("F");
                     break;
            case 'g':  System.out.println("tocar Nota Sol");
            objnotas.tocarNotas("G");
                     break;
  }
}

  

  }
}
