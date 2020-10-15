public class pequeñafactura{
  public static void main (String [] args){
    // Soy de Guillermo López //
    
    System.out.println("Vamos a introducir una batería de datos");
    System.out.println("El nombre de su primer artículo");
    String nombre1 = (System.console().readLine());
    System.out.println("La cantidad que posee de este");
    int x = Integer.parseInt(System.console().readLine());
    System.out.println("¿Cuánto vale cada unidad de este producto?");
    double y = Double.parseDouble(System.console().readLine());
    int z = (int) (x * y);
    
    System.out.println("El nombre de su segundo artículo");
    String nombre2 = (System.console().readLine());
    System.out.println("La cantidad que posee de este");
    int a = Integer.parseInt(System.console().readLine());
    System.out.println("¿Cuánto vale cada unidad de este producto?");
    double b = Double.parseDouble(System.console().readLine());
    int c = (int) (a * b);
    
    System.out.println("El nombre de su tercer artículo");
    String nombre3 = (System.console().readLine());
    System.out.println("La cantidad que posee de este");
    int m = Integer.parseInt(System.console().readLine());
    System.out.println("¿Cuánto vale cada unidad de este producto?");
    double n = Double.parseDouble(System.console().readLine());
    int o = (int) (m * n);
    
    int total = (z+c+o);
    
    System.out.println(z+", "+c+", "+o+" y el total de dinero es "+total);
  
  }
}
