public class ejercicio2clase22oct {
  public static void main (String[] args) {
  
    System.out.println("¿De cuántos números hacemos la cadena?");
    int var1 = Integer.parseInt(System.console().readLine());
    String lista= "";
    for(int i =1;i<=var1;i++) {
      lista=lista+i+" ";
      System.out.println(lista);
    }
  }
}
