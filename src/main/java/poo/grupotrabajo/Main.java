package poo.grupotrabajo;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    //primer producto
    public static void main(String[] args) {

        // Creamos el menu persistente y sus elementos
        Scanner sc = new Scanner(System.in);
        ArrayList<Producto> inventario = new ArrayList<>(); // Nuestro almacen virtual
        Producto nuevoProducto;
        int opcionUsuario;

        boolean condicion = true;
        do{
            System.out.println("""
                    BIENVENIDO, SELECCIONE UNA OPCION PARA CONTINUAR
                    --------------------------------------
                    1) REGISTRAR PRODUCTO
                    2) MOSTRAR INFORMACION DE UN PRODUCTO
                    3) VER STOCK DEL PRODUCTO
                    4) AUMENTAR STOCK DEL PRODUCTO
                    5) DISMINUIR STOCK DE UN PRODUCTO
                    6) CALCULAR DESCUENTO DE UN PRODUCTO
                    7) VER LISTA DE PRODUCTOS
                    8) SALIR
                    """);
            opcionUsuario = sc.nextInt();
            sc.nextLine();

            switch (opcionUsuario){
                case 1 -> {
                    // Registramos el producto aqui|
                    System.out.println("Ingrese el nombre del producto: ");
                    String nombreProducto = sc.nextLine();

                    System.out.println("Ingrese el precio del producto");
                    double precioProducto = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Ingrese el stock inicial del producto: ");
                    int stockProducto = sc.nextInt();
                    sc.nextLine();

                    // Creamos el producto nuevo
                    nuevoProducto = new Producto(nombreProducto, precioProducto, stockProducto);

                    // Almacenamos el producto
                    inventario.add(nuevoProducto);
                }
                case 2 -> {
                    // Mostramos el producto aqui
                    if(inventario.isEmpty()){
                        System.out.println("Aun no se han agregado productos");
                    }else{
                        System.out.println("Ingrese el numero del producto (consulte la lista con la opcion 7)");
                        int indiceProducto = sc.nextInt();
                        sc.nextLine();

                        Producto p = inventario.get(indiceProducto-1);
                        p.mostrarInformacion();
                    }
                }
                case 3 -> {
                    // Podemos ver estado del stock aqui
                    if(inventario.isEmpty()){
                        System.out.println("Aun no se han agregado productos");
                    }else{
                        System.out.println("Ingrese el numero del producto (consulte la lista con la opcion 7)");
                        int indiceProducto = sc.nextInt();
                        sc.nextLine();

                        Producto p = inventario.get(indiceProducto-1);
                        int stockActual = p.stock;

                        System.out.printf("Se tienen %d unidades%n", stockActual);
                        p.obtenerEstadoStock();
                    }
                }
                case 4 -> {
                    System.out.println("Ingrese el numero del producto (consulte la lista con la opcion 7)");
                    int indiceProducto = sc.nextInt();
                    sc.nextLine();

                    Producto p = inventario.get(indiceProducto-1);
                    System.out.println("Ingrese en cuanto desea aumentar el stock del producto: ");
                    int stockAdicional = sc.nextInt();
                    sc.nextLine();

                    p.aumentarStock(stockAdicional);
                }
                case 5 -> {
                    // Disminuimos stock aqui
                    System.out.println("Ingrese el numero del producto (consulte la lista con la opcion 7)");
                    int indiceProducto = sc.nextInt();
                    sc.nextLine();

                    Producto p = inventario.get(indiceProducto-1);
                    System.out.println("Ingrese en cuanto desea disminuir el stock del producto: ");
                    int stockRemovido = sc.nextInt();
                    sc.nextLine();

                    p.aumentarStock(stockRemovido);
                }
                case 6 -> {
                    // Calculamos descuentos aqui
                    Producto p = inventario.getLast();
                    System.out.println("Ingrese el monto incial: ");
                    double montoInicial = sc.nextDouble();
                    System.out.println("Ingrese el descuento a calcular (Ejemplo: 10.5 = 10.5%)");
                    double descuentoAplicado = sc.nextDouble();

                    double montoFinal = Producto.calcularDescuento(montoInicial, descuentoAplicado);

                    System.out.printf("El monto resultante luego del descuento será: %.2f", montoFinal);
                }
                case 7 -> {
                    System.out.println(inventario.size());
                    for(int i=0; i<inventario.size(); i++){
                        System.out.println(i+1 + ")");
                        inventario.get(i).mostrarInformacion();
                        System.out.println("---------------");
                    }
                }
                case 8 -> {
                    // Con esta opcion cerramos el bucle
                System.out.println("Gracias por usar nuestros servicios!");
                    condicion = false;
                }
            }

        }while(condicion);

    }

}