
import java.util.Scanner;

import org.jfugue.*;

public class caractere {
  Scanner caractere = new Scanner(System.in);

  public void tocarEntrada(String caractere, Player player) {
    notas notas = new notas();
    instrumento instrumentos = new instrumento();
    volume volume = new volume();

    int comprimentoEntrada = caractere.length();
    String sequencia = "X[Volume]=8000 ";

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
        String tokenHarpsichord = instrumentos.trocarParaHarpsichord();
        sequencia += tokenHarpsichord;
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
        String tokenVolume = volume.dobrarVolume();
        sequencia += tokenVolume;
        break;

      case '!':
        String tokenAgogo = instrumentos.trocarParaAgogo();
        sequencia += tokenAgogo;
        break;

      case '\n':
        String tokenTubularBells = instrumentos.trocarParaTubularBells();
        sequencia += tokenTubularBells;
        break;

      case ';':
        String tokenPanFlute = instrumentos.trocarParaPanFlute();
        sequencia += tokenPanFlute;
        break;

      case ',':
        String tokenChurchOrgan = instrumentos.trocarParaChurchOrgan();
        sequencia += tokenChurchOrgan;
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