public class ejemplofrase{
  public static void main (String [] args){
      // Estoy escrito por Guillermo López.
      System.out.println("¿Qúe frase quieres repetir?");
      String frase = System.console().readLine();
      // Inicializo la variable String "frase" y le doy el valor que escriba por teclado.
      System.out.println("¿Cuántas veces se repetirá?");
      int contador= Integer.parseInt(System.console().readLine());
      // Inicializo la variable entera "contador", la capturo por teclado, y esto mismo lo convierto también en entero.
        for(int i=1;i<=contador;i++){
          System.out.println(frase);
      }
      // Repito "frase" las veces que "contador" valga. 
  }
}
