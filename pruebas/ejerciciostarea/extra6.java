/* @author Guillermo López */

public class extra6 {
  public static void main (String [] args){
  
    System.out.print("Introduzca la altura: ");
    int altura = Integer.parseInt(System.console().readLine());
    System.out.println();
    int espacios = 0;
    
    for (int i =1;i<=altura;i++){
      for(int j =0;j<espacios;j++){
        System.out.print(" ");
      }
      System.out.print(i);
      espacios++;
      System.out.println();
    }
  }
}
