package Pruebas.UD6;

public class Articulo {
    
    private final String nombre;
    private double precio;
    private static double iva = 21;
    private int QuantasQuedan;

    public Articulo(String nombre, double precio, int QuantasQuedan) {
        this.nombre = nombre;
        this.precio = precio;
        this.QuantasQuedan = QuantasQuedan;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio <= 0) {
            System.out.println("ERROR, el precio no puede ser menor de 0");
        }else{
        this.precio = precio;
        }
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public int getQuantasQuedan() {
        return QuantasQuedan;
    }

    public void setQuantasQuedan(int quantasQuedan) {
        QuantasQuedan = quantasQuedan;
    }

    public String toString(){
        String str = "";
        str  = "Nombre: " + nombre + "\n" + 
                "Precio: " + precio + "\n" +
                "iva: " + iva + "\n" +
                "Cuantos quedan: " + QuantasQuedan;
        return str;
    }

    public void vender(int quantasQuedan, int cuantos){

        if (quantasQuedan <= cuantos) {
            System.out.println("ERROR, no se puede vender");
        } else {
            quantasQuedan -= cuantos;
            System.out.println("Se han vendido");
        }
        
    }

}
