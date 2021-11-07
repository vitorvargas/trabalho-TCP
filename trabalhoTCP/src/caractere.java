
import java.util.Scanner;
import java.util.Vector;

import org.jfugue.*;

public class caractere {
  Scanner caractere = new Scanner(System.in);

  public String receberEntrada(String entrada) {
    String caracDigitado = entrada;
    return caracDigitado;
  }

  public void validarTocarCaractere(String caractere, Player player) {
    notas notas = new notas();
    int length = caractere.length();
    Vector<String> v= new Vector<String>(length);
    int k=-1;
    char anterior=caractere.charAt(0);

    for (int i = 0; i < length; i++) {
      if(k>=0){
      anterior = caractere.charAt(i-1);}
      
        if(caractere.charAt(i)=='A') {
        System.out.println("toca Nota La");
        v.add(i,"A"+" ");
        notas.tocarNotas("A", player, length, i,v);}
        
        else if(caractere.charAt(i)=='B'){
        System.out.println("tocar Nota Si");
        v.add(i,"B"+" ");
        notas.tocarNotas("B", player, length, i,v);}
        
        else if(caractere.charAt(i)=='C'){
        System.out.println("tocar Nota Do");
        v.add(i,"C"+" ");
        notas.tocarNotas("C", player, length, i,v);}
        
        else if(caractere.charAt(i)=='D') {
        System.out.println("tocar Nota Re");
        v.add(i,"D"+" ");
        notas.tocarNotas("D", player, length, i,v);}
        
        else if(caractere.charAt(i)=='E'){ 
        System.out.println("tocar Nota Mi");
        v.add(i,"E"+" ");
        notas.tocarNotas("E", player, length, i,v);}

        else if(caractere.charAt(i)=='F'){ 
        System.out.println("tocar Nota Fa");
        v.add(i,"F"+" ");
        notas.tocarNotas("F", player, length, i,v);}
        

        else if(caractere.charAt(i)=='G'){
        System.out.println("tocar Nota Sol");
        v.add(i,"G"+" ");
        notas.tocarNotas("G", player, length, i,v);}
        

        else if(caractere.charAt(i)=='a' || caractere.charAt(i)=='b' || caractere.charAt(i)=='c' ||
        caractere.charAt(i)=='d' || caractere.charAt(i)=='e' || caractere.charAt(i)=='f' ||
        caractere.charAt(i)=='g'){
          if(anterior=='A' || anterior=='B' || anterior=='C' || anterior=='D' ||
          anterior=='D' || anterior=='E' || anterior=='F' || anterior=='G'){
          
            String s=String.valueOf(anterior);
            v.add(i,s+" ");
            notas.tocarNotas(s, player, length, i,v);
            System.out.println("regra do caractere anterior");

          }else{System.out.println("implementar pausa/silencio");}
          }
        }
            
      k++;
    }
  
}