/* @author Guillermo López */

public class bucleasteriscosalreves {
  public static void main (String [] args){
    
    System.out.println("¿De cuantas filas hacemos la piramide?");
    int numero = Integer.parseInt(System.console().readLine());
  
    for (int j=numero;j>=1;j--) {
      for(int i =1;i<=j;i++) {
        System.out.print("*");
      }
      
      System.out.println();
    }
  }
}
