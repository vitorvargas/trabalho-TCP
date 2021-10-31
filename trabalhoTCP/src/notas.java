import org.jfugue.*;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

public class notas {
   
   public void tocarNotas(String nota, Player player, int tamanho, int posatual, Vector<String> v) {
      
      Pattern pattern = new Pattern(nota);
      
      player.play(pattern);

     if(((tamanho-1)-posatual)==0){

     File file = new File("arquivosom.mid");
     StringBuffer v1 = new StringBuffer();
     String v2;
     for(int j=0;j<tamanho;j++){
      v1.append(v.get(j));
     }v2=v1.toString();
     Pattern pattern2 = new Pattern(v2);
    
     try {
      player.saveMidi(pattern2, file);
      System.out.println("arquivo eh os guri pattern2");
  
    } catch (IOException e) {
      //TODO Auto-generated catch block
      e.printStackTrace();} 

  }
}


   public void pausar() {
   }
}
