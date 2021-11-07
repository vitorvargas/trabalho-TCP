
public class instrumento {
    int instrumentoAtual = 0;

    public String trocarInstrumento(int acrescimo) {
        int valorNovoInstrumento = instrumentoAtual + acrescimo;
        String tokenInstrumento = "I[" + valorNovoInstrumento + "] ";

        return tokenInstrumento;
    }

}
