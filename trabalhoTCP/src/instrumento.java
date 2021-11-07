
public class instrumento {
    int instrumentoAtual = 0;

    public String trocarInstrumento(int acrescimo) {
        instrumentoAtual += acrescimo;

        String tokenInstrumento = construirTokenInstrumento();
        return tokenInstrumento;
    }

    public String trocarParaAgogo() {
        instrumentoAtual = 113;

        String tokenInstrumento = construirTokenInstrumento();
        return tokenInstrumento;
    }

    public String trocarParaChurchOrgan() {
        instrumentoAtual = 19;

        String tokenInstrumento = construirTokenInstrumento();
        return tokenInstrumento;
    }

    public String trocarParaHarpsichord() {
        instrumentoAtual = 6;

        String tokenInstrumento = construirTokenInstrumento();
        return tokenInstrumento;
    }

    public String trocarParaPanFlute() {
        instrumentoAtual = 75;

        String tokenInstrumento = construirTokenInstrumento();
        return tokenInstrumento;
    }

    public String trocarParaTubularBells() {
        instrumentoAtual = 14;

        String tokenInstrumento = construirTokenInstrumento();
        return tokenInstrumento;
    }

    private String construirTokenInstrumento() {
        String tokenInstrumento = "I[" + instrumentoAtual + "] ";
        return tokenInstrumento;
    }
}
