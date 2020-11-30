/* @author Guillermo López */

public class extra5 {
  public static void main (String [] args){
  
    // ULTIMA PARTE NO ME SALE
  
    System.out.print("Introduzca la altura: ");
    int altura = Integer.parseInt(System.console().readLine());
    System.out.println();
    int espacios  = 0;
    int espacios2 = 0;
    int espacios3 = 0;
    
    for (int i =1;i<=altura;i++){
      for(int j =0;j<espacios;j++){
        System.out.print(" ");
      }
      System.out.print(i);
      espacios++;
      System.out.println();
    }
    
    System.out.println();
    
    for(int k = 1;k<=altura;k++) {
      for (int l = 0;l<espacios2;l++) {
        System.out.print(" ");
      }
      for (int m= 1;m<=k;m++) {
        System.out.print(m);
      }
      System.out.println();
      espacios2++;
    }
    
    System.out.println();
  }
}
