package poo.grupotrabajo;

public class Main {

    //primer producto
    public static void main(String[] args) {
        // Primer producto
        Producto producto1 = new Producto("Caramel Macchiato", 16.5, 0);

        System.out.println("Nombre: " + producto1.nombre);
        System.out.println("Precio: " + producto1.precio);
        System.out.println("Stock: " + producto1.stock);

        // Comprobar si tiene stock
        producto1.obtenerEstadoStock();

        // Aumentar stock
        producto1.aumentarStock(10);
        System.out.println("Stock después de aumentar: " + producto1.stock);

        System.out.println("----------------------------------");

        // Segundo producto
        Producto producto2 = new Producto("Cheesecake de fresa", 18, 30);

        // Mostrar información
        producto2.mostrarInformacion();

        // Disminuir stock
        producto2.disminuirStock(5);
        System.out.println("Stock después de disminuir: " + producto2.stock);

        // Calcular descuento
        double precioFinal = Producto.calcularDescuento(producto2.precio, 10);
        System.out.println("Precio final: " + precioFinal);
    }
}
