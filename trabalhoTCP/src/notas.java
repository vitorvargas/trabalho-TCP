import org.jfugue.*;

public class Notas {
   public void tocarNotas(String nota, Player player) {
      Pattern pattern = new Pattern(nota);
      player.play(pattern);
   }

   public void pausar() {
   }
}
