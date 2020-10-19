public class buclesumas1 {
  public static void main (String args[]) {
    // Escrito por Guillermo López.
    int a;
    int b;
    int suma;
    
    for(int i=0;i<=10;i++){
      
      System.out.println("¿Primer número?");
      a = Integer.parseInt(System.console().readLine());
      
      System.out.println("¿Segundo número?");
      b = Integer.parseInt(System.console().readLine());
      
      suma = a+b;
      System.out.println("El resultado es "+suma);
    }
  }
}
