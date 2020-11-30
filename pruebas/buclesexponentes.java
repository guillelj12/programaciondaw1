public class buclesexponentes {
  public static void main (String[] args)  {
    // Escrito por Guillermo López.
    
    System.out.println("Vamos a hacer una tabla exponencial");
    
    int base;
    int exponente;
    double potencia =1;
    
    System.out.println("¿De qué número la hacemos?");
    base = Integer.parseInt(System.console().readLine());
    System.out.println("¿A cuánto lo exponemos?");
    exponente = Integer.parseInt(System.console().readLine());
    
    if(exponente ==0){
      potencia =1;
      System.out.println(base + "^" + exponente + " = " + potencia);
    }
    
    if (exponente > 0){
      for(int i =0;i < exponente;i++) {
        potencia = potencia * base;
        System.out.println(base + "^" + exponente + " = " + potencia);
      }
    }
    
    if(exponente < 0) {
      for(int i=0;i < -exponente; i++) {
        potencia *= base;
      }
      potencia = 1/potencia;
      System.out.println(base + "^" + exponente + " = " + potencia);
    }
  }
}
