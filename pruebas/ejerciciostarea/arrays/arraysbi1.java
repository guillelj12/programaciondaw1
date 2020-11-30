/* @author Guillermo López sacado por mí, excepto la parte de los printf que no entendía como mostrar por pantalla la tabla
 * todo el tinglado de los bucles lo hice yo solo.*/

public class arraysbi1 {
  public static void main (String [] args){
  
    int [] [] num = new int [3][6];
    
    num[0][0]= 0;
    num[0][1]= 30;
    num[0][2]= 2;
    num[0][5]= 5;
    num[1][0]= 75;
    num[1][4]= 0;
    num[2][2]= -2;
    num[2][3]= 9;
    num[2][5]= 11;
    
    int i,j;
    
    System.out.print("     ");
    
    for(j=0;j<6;j++){
      System.out.print("  Columna " + j);
    }
    
    for(i=0;i<3;i++){
      System.out.print("\nFila "+i);
      for(j=0;j<6;j++){
        System.out.printf("%8d   ",num[i][j]);
      }
      System.out.println();
    }
  
  }
}
