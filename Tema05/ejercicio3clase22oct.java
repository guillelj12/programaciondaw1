public class ejercicio3clase22oct {
  public static void main (String[] args){
    //Escrito por Guillermo López
      System.out.print("Introduce un número ");
      String fila = "";
      int numero = Integer.parseInt(System.console().readLine());

      for(int i = 1;i<(numero*2);i++) {
        fila=fila+i+" ";
        if((i%2)!=0) {
          System.out.println(fila);
        }
      }
  }
}
