public class ColoreoConFormato {
  public static void main (String[] args) {
    
    System.out.printf (" %-10s | %6s\n","Articulo","Precio");
    System.out.println("--------------------");
    System.out.printf (" %s%-10s%s | %6.2f\n", "\033[36m", "Raton", "\033[37m",10.0);
    System.out.printf (" %s%-10s%s | %6.2f\n", "\033[35m", "Webcam", "\033[37m",30.5);
    System.out.printf (" %s%-10s%s | %6.2f\n", "\033[34m", "Teclado", "\033[37m",8.25);
    
  }
}
