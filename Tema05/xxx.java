/* @author Guillermo López */

public class xxx {
  public static void main (String [] args){
  
    System.out.print("Por favor, introduzca la altura de la X: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    int altura = 1;
    int espaciosDelante = 0;
    int espaciosDetras = alturaIntroducida-1;
    int i =0;
    
    if(alturaIntroducida<3 || alturaIntroducida%2==0){
      System.out.print ("Mensaje de error");
    }
    while(altura<alturaIntroducida/2 +1) {
      for(i=1;i<=espaciosDelante;i++) {
        System.out.print(" ");
      }
      System.out.print("*");
      for(i=1;i<espaciosDetras;i++) {
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println();
      altura++;
      espaciosDelante++;
      espaciosDetras-=2;
    }
    espaciosDetras = 0;
    espaciosDelante = alturaIntroducida/2;
    altura = 1;
    
    while(altura <= alturaIntroducida/2 +1) {
      for(i =1;i<=espaciosDelante;i++){
        System.out.print(" ");
      }
      System.out.print("*");
      for(i=1;i<espaciosDetras;i++){
        System.out.print(" ");
      }
      if(altura>1){
        System.out.print("*");
      }
      System.out.println();
      altura++;
      espaciosDelante--;
      espaciosDetras+=2;
    }
  }
}
