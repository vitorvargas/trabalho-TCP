import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

import org.jfugue.Pattern;
import org.jfugue.Player;

public class arquivo {
    int indexArquivos = 0;

    public void salvarArquivoMid(String notasTocadas, Player player) {
        String nomeArquivo = String.format("arquivo_som_%d.mid", indexArquivos);
        File file = new File(nomeArquivo);

        // TODO talvez colocar labels de sucesso/erro
        try {
            player.saveMidi(new Pattern(notasTocadas), file);
            System.out.println("\nArquivo salvo com sucesso");
            indexArquivos++;
        } catch (IOException e) {
            System.out.println("\nOcorreu um erro ao salvar o arquivo mid");
            e.printStackTrace();
        }
    }

    public String carregarArquivoTxt(JFrame frame) {
        String conteudo = "";

        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(frame);

        if (result == JFileChooser.APPROVE_OPTION) {
            File arquivo = fileChooser.getSelectedFile();

            String extensao = arquivo.getName().substring(arquivo.getName().length() - 4);
            if (!extensao.equals(".txt")) {
                return "extensao_invalida";
            }

            try {
                FileReader leitorArquivo = new FileReader(arquivo);
                BufferedReader bufferArquivo = new BufferedReader(leitorArquivo);
                String linhaAtual = bufferArquivo.readLine();

                // linhaAtual recebe null quando o final do arquivo texto é atingido
                while (linhaAtual != null) {
                    System.out.printf("linha atual: %s\n", linhaAtual);
                    conteudo += linhaAtual;

                    linhaAtual = bufferArquivo.readLine();
                }
                leitorArquivo.close();
            } catch (Exception ex) {
                ex.printStackTrace();
                return "erro_leitura";
            }
        }
        return conteudo;
    }

}
