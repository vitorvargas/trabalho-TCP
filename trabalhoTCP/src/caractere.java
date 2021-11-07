
import java.util.Scanner;

import org.jfugue.*;

public class caractere {
  Scanner caractere = new Scanner(System.in);

  public void tocarEntrada(String caractere, Player player) {
    notas notas = new notas();
    instrumento instrumentos = new instrumento();

    int comprimentoEntrada = caractere.length();
    String sequencia = "";

    for (int index = 0; index < comprimentoEntrada; index++) {
      switch (caractere.charAt(index)) {
      case 'A':
        System.out.println("A: Nota La");
        sequencia += "A ";
        break;

      case 'B':
        System.out.println("B : Nota Si");
        sequencia += "B ";
        break;

      case 'C':
        System.out.println("C : Nota Do");
        sequencia += "C ";
        break;

      case 'D':
        System.out.println("D : Nota Re");
        sequencia += "D ";
        break;

      case 'E':
        System.out.println("E : Nota Mi");
        sequencia += "E ";
        break;

      case 'F':
        System.out.println("F : Nota Fa");
        sequencia += "F ";
        break;

      case 'G':
        System.out.println("G : Nota Sol");
        sequencia += "G ";
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
        String tokenInstrumento = instrumentos.trocarInstrumento(Character.getNumericValue(caractere.charAt(index)));
        sequencia += tokenInstrumento;
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
        // para os caracteres a-g minúsculos e outras consoantes, portanto fica tudo
        // englobado nesse
        // processamento default
        if (index > 0) {
          char anterior = caractere.charAt(index - 1);

          if (anterior == 'A' || anterior == 'B' || anterior == 'C' || anterior == 'D' || anterior == 'E'
              || anterior == 'F' || anterior == 'G') {
            System.out.println("regra do caractere anterior");

            sequencia += (String.valueOf(anterior) + " ");
          } else {
            sequencia += "R ";
          }
        } else {
          sequencia += "R ";
        }
        break;
      }
    }

    notas.tocar(sequencia.toString(), player);
    notas.salvarArquivo(sequencia, player);
  }
}