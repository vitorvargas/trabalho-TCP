import org.jfugue.*;
import java.io.File;
import java.io.IOException;

public class notas {

   public void tocar(String sequenciaATocar, Player player) {
      System.out.println("sequenciaATocar:");
      System.out.println(sequenciaATocar);

      Pattern pattern = new Pattern(sequenciaATocar);
      player.play(pattern);
   }

   public void salvarArquivo(String notasTocadas, Player player) {
      File file = new File("arquivosom.mid");

      try {
         player.saveMidi(new Pattern(notasTocadas), file);
         System.out.println("arquivo salvo com sucesso");
      } catch (IOException e) {
         System.out.println("ocorreu um erro ao salvar o arquivo mid");
         e.printStackTrace();
      }
   }

}
