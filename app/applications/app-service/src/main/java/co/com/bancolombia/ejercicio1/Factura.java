package co.com.bancolombia.ejercicio1;
//Manejar Listas , el cual es un vector.

import java.util.List;
import java.util.ArrayList;

public class Factura {
    //Atributos
    private String numeroFactura;
    private String cliente;
    private List<Pagable> items;

    //Constructor
    public Factura(String numeroFactura, String cliente, List<Pagable> items) {
        this.numeroFactura = numeroFactura;
        this.cliente = cliente;
        this.items = new ArrayList<>();
    }

    //Metodo 1
    public void agregarItem(Pagable item) {
        this.items.add(item);
        System.out.println("item agregado " + item.descripcion());
    }

    //Metodo 2
    public double calcularGrandTotal(){
        double grandTotal = (double)0.0F;
        for (Pagable item : items){
            grandTotal +=item.calcularPago();
        }
        return grandTotal;
    }

    //Metodo 3 : Imprimir Factura
    public void imprimirFactura() {

        System.out.println("\n |--------------------------------------|");
        System.out.println("|            FACTURA                   |");
        System.out.println("|--------------------------------------|");
        System.out.println("\nNúmero de Factura: " + this.numeroFactura);
        System.out.println("Cliente: " + this.cliente);
        System.out.println("Items:");
        for (Pagable item : items) {
            System.out.println("- " + item.descripcion() + ": $" + item.calcularPago());
        }
        System.out.println("Total a pagar: $" + calcularGrandTotal());
    }
    //Metodo 5 :
    public void serializarItems () {
        System.out.println("\nSerializando items de la factura...");
        for (Pagable item : this.items) {
            if (item instanceof Serializable) {
                System.out.println(" " + ((Serializable) item).serializar());
            }
        }
    }

    //Metodo 6 :
    public List<Pagable> getItems() {
        return this.items;
    }

    //Metodo 7 :
    public String getNumeroFactura() {
        return this.numeroFactura;
    }

    //Metodo 8 :
    public String getCliente() {
        return this.cliente;
    }




}
