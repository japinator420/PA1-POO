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
}
