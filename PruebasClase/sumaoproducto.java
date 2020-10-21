public class sumaoproducto{
  public static void main (String[] args){
    
    int n;
    int suma =0;
    int producto =0;
    
    System.out.println("Introduce el número que quieras.");
    n = Integer.parseInt(System.console().readLine());
    
    int num = n%2;
    
    if (num==0) {
      //El número es par
      for (int x = 1;x<=10;x++){
        producto=n*x;
        System.out.println(n+"*"+x+"="+producto);
    } else {
      //El número es impar
        for (int i = 1; i<=10;i++) {
          suma =n+i;
          System.out.println(n+"+"+i+"="+suma);}
        }
  }
}
}
