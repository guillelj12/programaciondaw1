/* @author Guillermo López  me equivoque al ponerle al nombrar un array en las operaciones del primer for
 * y estuve cerca de 20 minutos sin saber que estaba haciendo mal, por lo demás bien*/

public class arrays4 {
  public static void main (String [] args){
  
  int [] numero = new int [20];
  int [] cuadrado = new int [20];
  int [] cubo = new int [20];
  
  int i;
  
  for (i =0;i<20;i++){
    numero[i]=(int)(Math.random()*100);
    cuadrado[i]= numero[i] * numero[i];
    cubo[i] = cuadrado[i] * numero[i];  
  }
  
  System.out.println("Ahora se van a mostrar los números aleatorios, sus cuadrados y sus cubos respectivamente");
  
  for(i=0;i<20;i++){
    System.out.printf("%8d - %8d - %8d\n", numero[i], cuadrado[i], cubo[i]);
  }
  }
}
