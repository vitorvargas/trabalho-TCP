
import java.util.Scanner;
import java.util.Vector;

import org.jfugue.*;

public class caractere {
  Scanner caractere = new Scanner(System.in);

  public String receberEntrada(String entrada) {
    String caracDigitado = entrada;
    return caracDigitado;
  }

  public void validarTocarCaractere(String caractere, Player player) {
    notas notas = new notas();
    int length = caractere.length();
    Vector<String> notasATocar = new Vector<String>(length);
    int charsTocados = -1;
    char anterior = caractere.charAt(0);

    for (int i = 0; i < length; i++) {
      if (charsTocados >= 0) {
        anterior = caractere.charAt(i - 1);
      }

      switch (caractere.charAt(i)) {
      case 'A':
        System.out.println("toca Nota La");
        notasATocar.add(i, "A" + " ");
        notas.tocarNotas("A", player, length, i, notasATocar);
        break;

      case 'B':
        System.out.println("tocar Nota Si");
        notasATocar.add(i, "B" + " ");
        notas.tocarNotas("B", player, length, i, notasATocar);
        break;

      case 'C':
        System.out.println("tocar Nota Do");
        notasATocar.add(i, "C" + " ");
        notas.tocarNotas("C", player, length, i, notasATocar);
        break;

      case 'D':
        System.out.println("tocar Nota Re");
        notasATocar.add(i, "D" + " ");
        notas.tocarNotas("D", player, length, i, notasATocar);
        break;

      case 'E':
        System.out.println("tocar Nota Mi");
        notasATocar.add(i, "E" + " ");
        notas.tocarNotas("E", player, length, i, notasATocar);
        break;

      case 'F':
        System.out.println("tocar Nota Fa");
        notasATocar.add(i, "F" + " ");
        notas.tocarNotas("F", player, length, i, notasATocar);
        break;

      case 'G':
        System.out.println("tocar Nota Sol");
        notasATocar.add(i, "G" + " ");
        notas.tocarNotas("G", player, length, i, notasATocar);
        break;

      default:
        // a regra para um caractere não definido na documentação é a mesma que a regra
        // para os caracteres a-g minúsculos, portanto fica tudo englobado nesse caso
        // default
        if (anterior == 'A' || anterior == 'B' || anterior == 'C' || anterior == 'D' || anterior == 'D'
            || anterior == 'E' || anterior == 'F' || anterior == 'G') {
          System.out.println("regra do caractere anterior");

          String s = String.valueOf(anterior);
          notasATocar.add(i, s + " ");
          notas.tocarNotas(s, player, length, i, notasATocar);
        } else {
          System.out.println("silencio");
          notas.pausar();
        }
        break;
      }
    }

    charsTocados++;
  }

}