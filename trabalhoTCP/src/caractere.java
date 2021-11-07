
import java.util.Scanner;
import java.util.Vector;

import org.jfugue.*;

public class caractere {
  Scanner caractere = new Scanner(System.in);

  public void tocarEntrada(String caractere, Player player) {
    notas notas = new notas();
    int comprimentoEntrada = caractere.length();
    Vector<String> notasTocadas = new Vector<String>(comprimentoEntrada);

    for (int i = 0; i < comprimentoEntrada; i++) {
      switch (caractere.charAt(i)) {
      case 'A':
        System.out.println("A: toca Nota La");
        notasTocadas.add("A" + " ");
        notas.tocarNotas("A", player);
        break;

      case 'B':
        System.out.println("B: tocar Nota Si");
        notasTocadas.add("B" + " ");
        notas.tocarNotas("B", player);
        break;

      case 'C':
        System.out.println("C: tocar Nota Do");
        notasTocadas.add("C" + " ");
        notas.tocarNotas("C", player);
        break;

      case 'D':
        System.out.println("D: tocar Nota Re");
        notasTocadas.add("D" + " ");
        notas.tocarNotas("D", player);
        break;

      case 'E':
        System.out.println("E: tocar Nota Mi");
        notasTocadas.add("E" + " ");
        notas.tocarNotas("E", player);
        break;

      case 'F':
        System.out.println("F: tocar Nota Fa");
        notasTocadas.add("F" + " ");
        notas.tocarNotas("F", player);
        break;

      case 'G':
        System.out.println("G: tocar Nota Sol");
        notasTocadas.add("G" + " ");
        notas.tocarNotas("G", player);
        break;

      case 'i':
      case 'I':
      case 'o':
      case 'O':
      case 'u':
      case 'U':
        // TODO
        System.out.println("trocando para instrumento harpsichord");
        break;

      case '0':
      case '1':
      case '2':
      case '3':
      case '4':
      case '5':
      case '6':
      case '7':
      case '8':
      case '9':
        // TODO
        System.out.println("trocando de instrumento");
        break;

      case '?':
      case '.':
        // TODO
        System.out.println("aumentar uma oitava ou voltar ao default");
        break;

      case ' ':
        // TODO
        System.out.println("dobrar volume ou voltar ao default");
        break;

      case '!':
        // TODO
        System.out.println("trocando para instrumento agogo");
        break;

      case '\n':
        // TODO
        System.out.println("trocando para tubular bells");
        break;

      case ';':
        // TODO
        System.out.println("trocando para pan flute");
        break;

      case ',':
        // TODO
        System.out.println("trocando para church organ");
        break;

      default:
        // a regra para um caractere não definido na documentação é a mesma que a regra
        // para os caracteres a-g minúsculos, portanto fica tudo englobado nesse
        // processamento default
        if (i > 0) {
          char anterior = caractere.charAt(i - 1);

          if (anterior == 'A' || anterior == 'B' || anterior == 'C' || anterior == 'D' || anterior == 'D'
              || anterior == 'E' || anterior == 'F' || anterior == 'G') {
            System.out.println("regra do caractere anterior");

            String s = String.valueOf(anterior);
            notasTocadas.add(s + " ");
            notas.tocarNotas(s, player);
          } else {
            notasTocadas.add("R ");
            notas.pausar();
          }
        } else {
          notasTocadas.add("R ");
          notas.pausar();
        }
        break;
      }
    }

    notas.salvarArquivo(notasTocadas, player);
  }
}