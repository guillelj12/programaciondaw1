/* @author Guillermo López */

public class numerosalreves {
  public static void main (String [] args){
  
    System.out.println("Introduce el numero que quieres poner al revés");
    int numero= Integer.parseInt(System.console().readLine());
    String resultado;
    
    do{
      numero = numero/10;
      resultado = ""+numero;
        while(numero!=0){
          System.out.print(resultado);
        }
    }
  }
}
