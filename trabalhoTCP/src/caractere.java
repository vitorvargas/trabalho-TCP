import java.util.Scanner;

import org.jfugue.Player;

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

    for (int i = 0; i < length; i++) {
      switch (caractere.charAt(i)) {
      case 'a':
        System.out.println("toca Nota La");
        notas.tocarNotas("A", player);
        break;

      case 'b':
        System.out.println("tocar Nota Si");
        notas.tocarNotas("B", player);
        break;

      case 'c':
        System.out.println("tocar Nota Do");
        notas.tocarNotas("C", player);
        break;

      case 'd':
        System.out.println("tocar Nota Re");
        notas.tocarNotas("D", player);
        break;

      case 'e':
        System.out.println("tocar Nota Mi");
        notas.tocarNotas("E", player);
        break;

      case 'f':
        System.out.println("tocar Nota Fa");
        notas.tocarNotas("F", player);
        break;

      case 'g':
        System.out.println("tocar Nota Sol");
        notas.tocarNotas("G", player);
        break;
      }
    }

  }
}
