/* @author Guillermo López */

public class contarnumeroswhile {
  public static void main (String [] args){
  
    System.out.println("Introduzca un número");
    int numero = Integer.parseInt(System.console().readLine());
    
    System.out.println("Cuanto se rota a la derecha");
    int desplazamiento = Integer.parseInt(System.console().readLine());
    
    int longitudNumero= 0;
    
    // longitudNumero
    
    int aux = numero;
    while(aux > 0) {
      longitudNumero++;
      aux = aux/10;
    }

    for (int i=0;i<desplazamiento;i++) {   //cuento el numero de desplazamientos por unidad
      aux = numero % 10;
      numero = numero / 10;
      for (int j =0;j<longitudNumero;j++) {
        aux= aux*10;
      }
      numero = aux + numero;
    }
    System.out.println("Resulta: "+ numero);
  }
}
