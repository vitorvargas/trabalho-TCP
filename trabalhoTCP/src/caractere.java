import java.util.Scanner;

public class caractere {
  Scanner objcarac = new Scanner(System.in);

  public String receberEntrada() {
    String caracdigitado;
    do{ 
      System.out.println("digite um caractere valido: ");
      caracdigitado = objcarac.nextLine();
  
  }while("a" != caracdigitado.intern() && "b" != caracdigitado.intern() 
  && "c" != caracdigitado.intern() && "d" != caracdigitado.intern()
  && "e" != caracdigitado.intern()); return caracdigitado;} 
  
  public void validarCaractere(String validacarac) {
            switch (validacarac) {
            case "a":  System.out.println("tocar Nota La"); //trocar esse print por uma variavel
                     break;                                 //que chama o metodo tocarNotas da classe notas
            case "b":  System.out.println("tocar Nota Si"); //passando como parametro a variavel validacarac
                     break;                                 
            case "c":  System.out.println("tocar Nota Do");
                     break;
            case "d":  System.out.println("tocar Nota Re");
                     break;
            case "e":  System.out.println("tocar Nota Mi");
                     break;
  }

  

  }
}
