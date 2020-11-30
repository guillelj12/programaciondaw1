/* @author Guillermo López */

public class piramideasteriscos {
  public static void main (String [] args){
  
    int espacios = 3;
    int asteriscos = 1;
    
    for (int i = 1;i<=4;i++) {
      for (int j = 1;j<=espacios;j++){
        System.out.print(" ");
      }
      for (int k = 1;k<=asteriscos;k++) {
        System.out.print("*");
      }
      
      System.out.println();
      espacios = espacios -1;
      asteriscos = asteriscos +2;
  }
}
}
