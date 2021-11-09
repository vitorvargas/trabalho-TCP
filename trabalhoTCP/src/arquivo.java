import java.io.File;
import java.io.IOException;

import org.jfugue.Pattern;
import org.jfugue.Player;

public class arquivo {
    int indexArquivos = 0;

    public void salvarArquivoMid(String notasTocadas, Player player) {
        String nomeArquivo = String.format("arquivo_som_%d.mid", indexArquivos);
        File file = new File(nomeArquivo);

        try {
            player.saveMidi(new Pattern(notasTocadas), file);
            System.out.println("arquivo salvo com sucesso");
            indexArquivos++;
        } catch (IOException e) {
            System.out.println("ocorreu um erro ao salvar o arquivo mid");
            e.printStackTrace();
        }
    }

}
