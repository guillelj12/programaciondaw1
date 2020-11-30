/* @author Guillermo López es el ejercicio 09 de arrays unidimensionales, este lo hice para practicar ifs y elses, 
 * es bastante facil*/

public class arrays6 {
  public static void main (String [] args){
  
    int [] num = new int [8];
    int i;
    
    System.out.println("Introduzca 8 números enteros");
    for (i = 0; i < 8; i++) {
      num[i] = Integer.parseInt(System.console().readLine());
    }
    for (i = 0; i < 8; i++) {
      if (num[i] % 2 == 0) {
        System.out.println(num[i] + " par");
      } else {
          System.out.println(num[i] + " impar");
        }
    }
  }
}
