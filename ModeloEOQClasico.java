import java.text.DecimalFormat;
import java.util.Scanner;

public class ModeloEOQClasico {
public static void main(String[]args){
    Scanner lector = new Scanner(System.in);
    double n,le;
    double cantidad,to;
    System.out.println("Datos");
    System.out.println("Ingrese el indice de demanda del producto: ");
    int demanda = lector.nextInt();
    System.out.println("Ingrese el costo:");
    int costo = lector.nextInt();
    System.out.println("Ingrese el costo de almacenamiento: ");
    double almacenamiento = lector.nextDouble();
    System.out.println("Ingrese el tiempo de entrega: ");
    int dias = lector.nextInt();

    cantidad = (double)Math.sqrt(2*demanda*costo/almacenamiento);
    to =cantidad/demanda;
    DecimalFormat df = new DecimalFormat("#.##");
    System.out.println("Y= "+df.format(cantidad)+" to= "+df.format(to));

    //Punto de reorden
    n=dias/to;
    int n1=(int)Math.floor(n);
    le=(dias-n1*(to));

    //reorden
    int reorden = (int)(le*demanda);

    //Resultados
    System.out.println("Pedido optimo (Modelo EOQ Clasico) es: " + Math.round(cantidad));
    System.out.println("El tiempor de entrega estimada es : "+df.format(to));
    System.out.println("El valor de n: "+n1);
    System.out.println("El punto de reorden es: "+reorden);
  }
}