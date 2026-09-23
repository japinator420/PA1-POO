package poo.grupotrabajo;

public class Producto {
    String nombre;
    double precio;
    int stock;

    public Producto(){
        nombre = "Capuccino";
        precio = 17.5;
        stock = 20;
    }

    public Producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Métodos

    // Mostrar Información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
    }

    // Obtener el estado del stock
    public void obtenerEstadoStock() {
        if (stock > 0) {
            System.out.println("El producto tiene stock disponible.");
        } else {
            System.out.println("El producto está agotado.");
        }
    }
    // Permite aumentar la cantidad disponible del producto cuando
    // se recibe nueva mercancía o se realiza una reposición de stock.
    public void aumentarStock(int cantidad) {
        stock = stock + cantidad;
    }
    // Permite disminuir la cantidad disponible del producto después
    // de una venta o salida de inventario.
    public void disminuirStock(int cantidad) {
        stock = stock - cantidad;
    }
    // Calcula el precio final del producto aplicando un descuento según el porcentaje indicado.
    public static double calcularDescuento(double monto, double porcentaje) {
        return monto - (monto * porcentaje / 100);
    }
}
