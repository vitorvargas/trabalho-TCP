
public class instrumento {
    int instrumentoAtual = 0;

    public String tokenTrocaInstrumento(int acrescimo) {
        instrumentoAtual += acrescimo;

        String tokenInstrumento = construirTokenInstrumento();
        return tokenInstrumento;
    }

    public String tokenAgogo() {
        instrumentoAtual = 113;

        String tokenInstrumento = construirTokenInstrumento();
        return tokenInstrumento;
    }

    public String tokenChurchOrgan() {
        instrumentoAtual = 19;

        String tokenInstrumento = construirTokenInstrumento();
        return tokenInstrumento;
    }

    public String tokenHarpsichord() {
        instrumentoAtual = 6;

        String tokenInstrumento = construirTokenInstrumento();
        return tokenInstrumento;
    }

    public String tokenPanFlute() {
        instrumentoAtual = 75;

        String tokenInstrumento = construirTokenInstrumento();
        return tokenInstrumento;
    }

    public String tokenTubularBells() {
        instrumentoAtual = 14;

        String tokenInstrumento = construirTokenInstrumento();
        return tokenInstrumento;
    }

    private String construirTokenInstrumento() {
        String tokenInstrumento = "I[" + instrumentoAtual + "] ";
        return tokenInstrumento;
    }
}
