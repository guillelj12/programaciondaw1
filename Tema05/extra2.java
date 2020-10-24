public class extra2 {
  public static void main (String[] args) {
    // Hecho por Guillermo López
    
    System.out.println("Introduzca la cantidad de números");
    int cantidad = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduzca el primer número");
    int primerNum = Integer.parseInt(System.console().readLine());
    
      for (int j = primerNum;j<(primerNum+cantidad);j++){
        if(j!=(primerNum+cantidad)-1){
          System.out.print(j+"-");
        } else {
            System.out.print(j);
          }
      }
  }
}
