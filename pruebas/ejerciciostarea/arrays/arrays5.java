/* @author Guillermo López al principio estaba un poco perdido con lo de sacar los minimos y el maximo
 * y que se fuese autoajustando pero me base en la solucion para cogerlos y ya lo saque rapido el ejercicio. */

public class arrays5 {
  public static void main (String [] args){
  
    System.out.println("Introduzca 10 números y le diremos el máximo y el mínimo");
    
    int [] num = new int [10];
    
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    
    int i;
    
    for (i =0; i<10;i++){
      num[i]=Integer.parseInt(System.console().readLine());
      
      if (num[i] < minimo) {
        minimo = num[i];
      }
      
      if (num[i] > maximo) {
        maximo = num[i];
      }
    }
    
    for (i =0;i<10;i++){
      System.out.print(num[i]);
      
      if (num[i]==maximo) {
        System.out.print(" maximo");
      }
      if (num[i]==minimo) {
        System.out.print(" minimo");
      }
      System.out.println();
    }
  }
}
