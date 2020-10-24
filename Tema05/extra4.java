/* @author Guillermo López */

public class extra4 {
  public static void main (String [] args){
  
    System.out.println("Introduzca el número más alto");
    int numAlto = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduzca el número más bajo");
    int numBajo = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduzca el salto entre los números");
    int salto = Integer.parseInt(System.console().readLine());
    
      for(int i = numAlto;i>=numBajo;i-=salto) {
        if((i-numBajo)>=salto){
          System.out.print(i+"-");
        } else {
            System.out.print(i);
          }
      }
  }
}
