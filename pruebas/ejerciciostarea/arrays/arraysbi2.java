/* @author Guillermo López */

public class arraysbi2 {
  public static void main (String [] args){
  
    int [] [] num = new int [4][5];
    int fila,columna;
    
    for(fila =0;fila<4;fila++){
      for(columna=0;columna<5;columna++){
        System.out.print("Fila "+fila+", columna "+ columna + " = ");
        num[fila][columna]=Integer.parseInt(System.console().readLine());
      }
    }
    
    int sumatorioF;
    
    for(fila=0;fila<4;fila++){
      sumatorioF = 0;
      for(columna=0;columna<5;columna++){
        System.out.printf("%8d  ", num[fila][columna]);
        sumatorioF= sumatorioF + num[fila][columna];
      }
      System.out.printf("%8d", sumatorioF);
      System.out.println(" Fila "+fila);
      
    }
    
    int sumatorioC;
    int sumatorioT =0;
    
    for(columna=0;columna<5;columna++){
      sumatorioC=0;
      for(fila=0;fila<4;fila++){
        sumatorioC=sumatorioC+num[fila][columna];
      }
      sumatorioT=sumatorioC+sumatorioT;
      System.out.printf("%8d  ", sumatorioC);
    }
    System.out.printf("%8d", sumatorioT);
    System.out.println(" Sumatorio Total");
    
    for(columna=0;columna<5;columna++){
      System.out.print("Columna "+ columna);
    }
  }
}
