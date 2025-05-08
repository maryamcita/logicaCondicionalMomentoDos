import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese el valor de compra del producto (valor mayorista)");
        double valorMayorista = sc.nextDouble();
        System.out.println("Por favor ingrese el valor de venta del producto (Valor al cliente)");
        double valorVenta = sc.nextDouble();
        System.out.println("Por favor ingrese la cantidad de productos que vendió");
        double cantidadProductos = sc.nextDouble();
        double ingresoTotal;
        ingresoTotal = cantidadProductos * valorVenta;
        double costoTotal;
        costoTotal = valorMayorista*cantidadProductos;
        double utilidadTotal;
        utilidadTotal = ingresoTotal - costoTotal;
        double porcentajeGanancia;
        porcentajeGanancia = (utilidadTotal/ingresoTotal)*100;
        System.out.println("Este fue el ingreso total: " + ingresoTotal);
        System.out.println("Este fue el costo total: " + costoTotal);
        System.out.println("Esta fue la utilidad total del producto: " + utilidadTotal);
        System.out.println("Y este fue el porcentaje de ganancia: " + porcentajeGanancia + "%");
        if (utilidadTotal > 300000) {
            System.out.println("Excelente parce, mera venta");
        }else{
            System.out.println("Bro, metele pues ganas a la publicidad porque asi te vas a quebrar");
        }
    }
}
