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
                    2) MOSTRAR INFORMACION DEL ULTIMO PRODUCTO AGREGADO
                    3) VER STOCK DEL PRODUCTO
                    4) AUMENTAR STOCK DEL PRODUCTO
                    5) DISMINUIR STOCK DE UN PRODUCTO
                    6) CALCULAR DESCUENTO DE UN PRODUCTO
                    7) SALIR
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
                    Producto p = inventario.getLast();
                    p.mostrarInformacion();
                }
                case 3 -> {
                    // Podemos ver estado del stock aqui
                    Producto p = inventario.getLast();
                    int stockActual = p.stock;

                    System.out.printf("Se tienen %d unidades%n", stockActual);
                    p.obtenerEstadoStock();
                }
                case 4 -> {
                    // Aumentamos stock aqui
                }
                case 5 -> {
                    // Disminuimos stock aqui
                }
                case 6 -> {
                    // Calculamos descuentos aqui
                }
                case 7 -> {
                    // Con esta opcion cerramos le bucle
                System.out.println("Gracias por usar nuestros servicios!");
                    condicion = false;
                }
            }

        }while(condicion);

    }

}