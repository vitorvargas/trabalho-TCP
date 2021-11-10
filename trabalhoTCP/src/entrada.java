
import java.util.Scanner;

import org.jfugue.*;

public class entrada {
  Scanner entrada = new Scanner(System.in);

  public void tocarEntrada(String entrada, Player player, boolean salvarArquivo) {
    notas objetoNotas = new notas();
    instrumento objetoInstrumento = new instrumento();
    volume objetoVolume = new volume();
    arquivo objetoArquivo = new arquivo();
    oitava objetoOitavas = new oitava();

    int comprimentoEntrada = entrada.length();
    String sequencia = "X[Volume]=8000 ";

    String token = "";

    for (int index = 0; index < comprimentoEntrada; index++) {
      switch (entrada.charAt(index)) {
      case 'A':
        token = String.format("A%s ", objetoOitavas.oitavaAtual);
        sequencia += token;
        break;

      case 'B':
        token = String.format("B%s ", objetoOitavas.oitavaAtual);
        sequencia += token;
        break;

      case 'C':
        token = String.format("C%s ", objetoOitavas.oitavaAtual);
        sequencia += token;
        break;

      case 'D':
        token = String.format("D%s ", objetoOitavas.oitavaAtual);
        sequencia += token;
        break;

      case 'E':
        token = String.format("E%s ", objetoOitavas.oitavaAtual);
        sequencia += token;
        break;

      case 'F':
        token = String.format("F%s ", objetoOitavas.oitavaAtual);
        sequencia += token;
        break;

      case 'G':
        token = String.format("G%s ", objetoOitavas.oitavaAtual);
        sequencia += token;
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
        objetoOitavas.aumentarUmaOitava();
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
    if (salvarArquivo)
      objetoArquivo.salvarArquivoMid(sequencia, player);
  }
}