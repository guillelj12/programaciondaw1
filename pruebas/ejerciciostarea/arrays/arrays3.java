/* @author Guillermo López lo hice más rápido que los anteriores, no tuve problemas */

public class arrays3 {
  public static void main (String [] args){
  
    int [] num;
    num = new int [10];
    int i;
    
    System.out.println("Introduce 10 números enteros");
    
    for(i =0;i<10;i++){
      num[i]=Integer.parseInt(System.console().readLine());
    }
    for(i=10;i>0;i--){
      System.out.print(num[i-1]);
    }
  
  }
}
