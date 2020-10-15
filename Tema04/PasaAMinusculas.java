public class PasaAMinusculas {
  
  public static void main (String [] args) {
    String datoEntrada;
    System.out.print ("Escriba una palabra: ");
    datoEntrada = System.console().readLine();
    
    datoEntrada = datoEntrada.toLowerCase();
    
    System.out.println(datoEntrada);
  }
}
