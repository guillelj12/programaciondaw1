public class ejercicio16bucles {
  public static void main (String[] args){
    //Escrito por Guillermo López
      System.out.println("Comprueba si un número es primo");
      boolean esPrimo = true;
      int numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      for (int i = 2;i< numeroIntroducido;i++) {
        if ((numeroIntroducido % i) == 0) {
          esPrimo = false;
        }
      }
      if(esPrimo) {
        System.out.println("El número sí es primo");
      } else {
          System.out.println("El número no es primo");
        }
  }
}
