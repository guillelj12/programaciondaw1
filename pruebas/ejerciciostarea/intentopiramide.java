/* @author Guillermo López */

public class intentopiramide {
  public static void main (String [] args){
  
    System.out.println("Introduce la altura");
    int altura = Integer.parseInt(System.console().readLine());
    int espacios = altura;
    int asteriscos= 1;
    
    for(int i=0;i<altura;i++){
      for(int j=0;j<(espacios-1);j++){
        System.out.print(" ");
      }
      for (int l=1;l<=asteriscos;l++) {
        System.out.print("*");
      }
      espacios--;
      asteriscos=asteriscos+2;
      System.out.println();
    }
  }
}
