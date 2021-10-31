
import java.util.Scanner;
import java.util.Vector;

import org.jfugue.*;


//import org.jfugue.Player;

//import javax.swing.JTextField;

public class caractere {
  Scanner caractere = new Scanner(System.in);

  public String receberEntrada(String entrada) {
    String caracDigitado = entrada;

    // System.out.println("digite um caractere valido ou uma frase: ");
    // caracdigitado = objcarac.nextLine();
    for (int j = 0; j < caracDigitado.length(); j++) {
      if ('a' != caracDigitado.charAt(j) && 'b' != caracDigitado.charAt(j) && 'c' != caracDigitado.charAt(j)
          && 'd' != caracDigitado.charAt(j) && 'e' != caracDigitado.charAt(j) && 'f' != caracDigitado.charAt(j)
          && 'g' != caracDigitado.charAt(j)) {
        System.out.println("digite um caractere valido ou uma frase: ");
        caracDigitado = caractere.nextLine();
        j = 0;
      }
    }

    return caracDigitado;
  }

  public void validarTocarCaractere(String caractere, Player player) {
    notas notas = new notas();
    int length = caractere.length();
    Vector<String> v= new Vector<String>(length);
  
    

    for (int i = 0; i < length; i++) {
      switch (caractere.charAt(i)) {
      case 'a':
        System.out.println("toca Nota La");
        v.add(i,"A"+" ");
        notas.tocarNotas("A", player, length, i,v);
        
        break;

      case 'b':
        System.out.println("tocar Nota Si");
        v.add(i,"B"+" ");
        notas.tocarNotas("B", player, length, i,v);
        
        break;

      case 'c':
        System.out.println("tocar Nota Do");
        v.add(i,"C"+" ");
        notas.tocarNotas("C", player, length, i,v);
        
        break;

      case 'd':
        System.out.println("tocar Nota Re");
        v.add(i,"D"+" ");
        notas.tocarNotas("D", player, length, i,v);
        
        break;

      case 'e':
        System.out.println("tocar Nota Mi");
        v.add(i,"E"+" ");
        notas.tocarNotas("E", player, length, i,v);
        
        break;

      case 'f':
        System.out.println("tocar Nota Fa");
        v.add(i,"F"+" ");
        notas.tocarNotas("F", player, length, i,v);
        
        break;

      case 'g':
        System.out.println("tocar Nota Sol");
        v.add(i,"G"+" ");
        notas.tocarNotas("G", player, length, i,v);
        
        break;
      }
    }
  
}
}
