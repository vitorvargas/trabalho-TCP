import org.jfugue.*;

public class notas {
   public void tocarSequencia(String sequenciaATocar, Player player) {
      System.out.println("sequenciaATocar:");
      System.out.println(sequenciaATocar);

      Pattern pattern = new Pattern(sequenciaATocar);
      player.play(pattern);
   }
}
