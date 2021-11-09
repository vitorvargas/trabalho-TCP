
import java.util.Scanner;

import org.jfugue.*;

public class entrada {
  Scanner entrada = new Scanner(System.in);

  public void tocarEntrada(String entrada, Player player) {
    notas objetoNotas = new notas();
    instrumento objetoInstrumento = new instrumento();
    volume objetoVolume = new volume();
    arquivo objetoArquivo = new arquivo();

    int comprimentoEntrada = entrada.length();
    String sequencia = "X[Volume]=8000 ";

    for (int index = 0; index < comprimentoEntrada; index++) {
      switch (entrada.charAt(index)) {
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
        String tokenHarpsichord = objetoInstrumento.tokenHarpsichord();
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
        String tokenInstrumento = objetoInstrumento
            .tokenTrocaInstrumento(Character.getNumericValue(entrada.charAt(index)));
        sequencia += tokenInstrumento;
        break;

      case '?':
      case '.':
        // TODO
        System.out.println("aumentar uma oitava ou voltar ao default");
        break;

      case ' ':
        String tokenVolume = objetoVolume.dobrarVolume();
        sequencia += tokenVolume;
        break;

      case '!':
        String tokenAgogo = objetoInstrumento.tokenAgogo();
        sequencia += tokenAgogo;
        break;

      case '\n':
        String tokenTubularBells = objetoInstrumento.tokenTubularBells();
        sequencia += tokenTubularBells;
        break;

      case ';':
        String tokenPanFlute = objetoInstrumento.tokenPanFlute();
        sequencia += tokenPanFlute;
        break;

      case ',':
        String tokenChurchOrgan = objetoInstrumento.tokenChurchOrgan();
        sequencia += tokenChurchOrgan;
        break;

      default:
        // a regra para um caractere não definido na documentação é a mesma que a regra
        // para os caracteres a-g minúsculos e outras consoantes, portanto fica tudo
        // englobado nesse
        // processamento default
        if (index > 0) {
          char anterior = entrada.charAt(index - 1);

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

    objetoNotas.tocarSequencia(sequencia.toString(), player);
    objetoArquivo.salvarArquivoMid(sequencia, player);
  }
}