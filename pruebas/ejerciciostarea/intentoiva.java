/* @author Guillermo López */

public class intentoiva {
  public static void main (String [] args){
    
    double precioart = 0;
    double unidades = 0;
    int codigo = 0;
    double subtotal = 0;
    double descuento =0;
    
    System.out.print("Introduzca el precio del artículo (en Euros): ");
    precioart = Double.parseDouble(System.console().readLine());
    System.out.print("Indique el número de unidades: ");
    unidades = Double.parseDouble(System.console().readLine());
    System.out.print("Indique el codigo de descuento: ");
    codigo = Integer.parseInt(System.console().readLine());
    System.out.println("A continuación, se le muestra el precio desglosado del pedido: ");
    
    subtotal = precioart * unidades;
    
    switch(codigo){
      case 685:
        descuento = 15;
        break;
        
      case 778:
        if (unidades>= 20){
          descuento = precioart-(precioart*0.05);
        }
        break;
        
      case 219:
        if (unidades > 5){
          descuento = precioart *5;
        }
        break;
      default:
    }
    
    System.out.println("-------------------------------------------------");
    System.out.printf("%-28s %15.2f %1s\n","Precio del artículo:",precioart,"€");
    System.out.printf("%-28s %15.0f \n","Número de unidades:",unidades);
    System.out.printf("%-28s %15.2f %1s\n","Precio total unidades",subtotal,"€");
    System.out.printf("%-27s %-3d %12.2f %1s\n","Descuento aplicado: Código ",codigo,descuento,"€");
    System.out.printf("%-28s %15.2f %1s\n","Precio con descuento",subtotal-descuento,"€");
    System.out.printf("%-28s %15.2f %1s\n","IVA (21%)",(subtotal-descuento)*0.21,"€");
    System.out.println("-------------------------------------------------");
    System.out.printf("%-28s %15.2f %1s\n","PRECIO FINAL",(subtotal-descuento)*1.21,"€");
  
  }
}
