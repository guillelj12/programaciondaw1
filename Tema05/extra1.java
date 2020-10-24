public class extra1 {
  public static void main (String [] args) {
    //Hecho por Guillermo López
    System.out.println("Introduzca la cantidad de números deseada");
    int num = Integer.parseInt(System.console().readLine());
    
    
    for(int i =1; i<=num;i++) {
      if(i!=num){
      System.out.print(i+"-");
      } else {
        System.out.print(i);
      }
    }
  }
}
