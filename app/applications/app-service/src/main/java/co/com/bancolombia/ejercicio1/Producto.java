package co.com.bancolombia.ejercicio1;

public class Producto implements Pagable, Serializable{
    //Atributos
private String nombre;
private double precio;
private int cantidad;

//Constructor
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    //Metodo
    public double calcularTotal(){
        return this.precio * (double) this.cantidad;
    }

    public double aplicarDescuento(double porcentaje){
        double total = this.calcularTotal();
        return total - (total * porcentaje/100);
    }

    public String descripcion(){
        return String.format("Producto: %s | Precio:$%.2f | Cantidad: %d| Total con descuento : $%.2f", this.nombre, this.precio,this.cantidad, this.aplicarDescuento(10));
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }


    public int getCantidad() {
        return this.cantidad;
    }

    public String toString(){
    return this.descripcion();
    }
}
