import org.jfugue.*;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

public class notas {

   public void tocarNotas(String sequenciaATocar, Player player) {
      Pattern pattern = new Pattern(sequenciaATocar);
      player.play(pattern);
   }

   public void pausar() {
      System.out.println("silencio");
      try {
         Thread.sleep(500);
      } catch (InterruptedException e) {
         Thread.currentThread().interrupt();
         e.printStackTrace();
      }
   }

   public void salvarArquivo(Vector<String> notasTocadas, Player player) {
      File file = new File("arquivosom.mid");
      StringBuffer v1 = new StringBuffer();

      for (String nota : notasTocadas) {
         v1.append(nota);
      }
      // for (int j = 0; j < notasTocadas.size(); j++) {
      // v1.append(notasTocadas.get(j));
      // }

      Pattern pattern2 = new Pattern(v1.toString());
      System.out.println("arquivo salvo com sucesso");

      try {
         player.saveMidi(pattern2, file);
      } catch (IOException e) {
         System.out.println("ocorreu um erro ao salvar o arquivo mid");
         e.printStackTrace();
      }
   }

}
