public class oitava {
    int oitavaAtual = 5;

    public void aumentarUmaOitava() {
        oitavaAtual++;
        if (oitavaAtual > 9)
            resetar();
    }

    private void resetar() {
        oitavaAtual = 5;
    }
}
