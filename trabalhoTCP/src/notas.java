import org.jfugue.*;

public class notas {
   public void tocarNotas(String nota, Player player) {
      Pattern pattern = new Pattern(nota);
      player.play(pattern);
   }

   public void pausar() {
   }
}
