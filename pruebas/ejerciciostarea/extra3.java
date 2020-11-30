public class extra3 {
  public static void main (String[] args) {
    // Hecho por Guillermo López
    
    System.out.println("Introduzca la cantidad de números");
    int cantidad = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduzca el primer número");
    int primerNum = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduzca el salto entre los números");
    int salto = Integer.parseInt(System.console().readLine());
    
      for(int i =1;i<=cantidad;i++) {
        if(i!=cantidad){
        System.out.print(primerNum+"-");
        } else {
            System.out.print(primerNum);
          }
        primerNum+=salto;
      }
  }
}
