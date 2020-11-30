/* @author Guillermo López estuve un tiempo haciendolo porque no me daba cuenta que tenía el array creado como int
   en cuanto lo cambie ya me funciono, y cuando dejas un elemento de un array de chars en blanco no se añade ningun valor a este
   es decir, que se queda en "blanco"*/

public class arrays2 {
  public static void main (String [] args){
  
  char [] simbolo;
  simbolo = new char [10];
  
  simbolo[0]= 'a';
  simbolo[1]= 'x';
  simbolo[4]= '@';
  simbolo[6]= ' ';
  simbolo[7]= '+';
  simbolo[8]= 'Q';
  
  for(int i =0;i<10;i++){
    System.out.printf("simbolo[" + i + "]: " + simbolo[i] + "\n");
  }
  }
}
