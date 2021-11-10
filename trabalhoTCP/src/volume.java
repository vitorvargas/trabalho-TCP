public class volume {
    int volumeAtual = 4000;

    public String dobrarVolume() {
        String tokenVolume;

        int novoVolume = volumeAtual * 2;
        if (novoVolume > 16383) {
            tokenVolume = resetar();
        } else {
            volumeAtual = novoVolume;
            tokenVolume = "X[Volume]=" + volumeAtual + " ";
        }

        return tokenVolume;
    }

    private String resetar() {
        volumeAtual = 10200;
        String tokenVolume = "X[Volume]=" + volumeAtual + " ";
        return tokenVolume;
    }
}
