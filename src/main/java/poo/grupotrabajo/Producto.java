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

    //
}
