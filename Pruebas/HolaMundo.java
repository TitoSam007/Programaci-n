package Pruebas;

public class HolaMundo {

    public int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static void ImprimEdad() {
        System.out.println(edad);
    }
    public static void main(String[] args) {
        System.out.println("Hola mundo con más de " + HolaMundo.ImprimEdad + " años");
    }
}