import org.jfugue. *;

public class notas {
   public void tocarNotas(String notatocar){
        Player player = new Player();
        Pattern pattern = new Pattern(notatocar);
        player.play(pattern);
   }

   public void pausar() {} 
}
