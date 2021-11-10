import org.jfugue.*;

public class notas {
   public void tocarSequencia(String sequenciaATocar, Player player) {
      System.out.printf("[SEQUENCIA]: %s", sequenciaATocar);
      Pattern pattern = new Pattern(sequenciaATocar);
      player.play(pattern);
   }
}
