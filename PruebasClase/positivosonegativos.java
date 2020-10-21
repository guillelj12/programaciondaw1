public class positivosonegativos{
  public static void main (String[] args){
  
    System.out.println("Introduce 10 números");
    int positivos=0;
    int negativos=0;
    
    for (int i= 0;i<10;i++){
      System.out.println("Te faltan por añadir "+(10-i)+" numeros.");
      if(Integer.parseInt(System.console().readLine())<0){
        negativos++;
      } else {
        positivos++;
      }
    }
    System.out.println("Has escrito "+negativos+" numeros negativos y "+positivos+" numeros positivos.");
  
  }
}
