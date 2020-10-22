public class ejercicioclase22oct {
  public static void main (String[] args) {
  //Escrito por Guillermo López.
    System.out.println("Introduce un número");
    int var1 = Integer.parseInt(System.console().readLine());
    
    for(int i =1;i <=var1;i++) {
      for(int a =1;a<=i;a++){
        System.out.print(" "+a);
      }
      System.out.println("");
    }
  }
}
