package Pruebas.UD6;

public class ArticuloMain {
    
    public static void main(String[] args) {
        
        Articulo a1 = new Articulo("TV", 300.0, 21, 0);
        Articulo a2 = new Articulo("Zapas", 300.0, 21, 0);
        Articulo a3 = new Articulo("Camiseta", 300.0, 21, 0); 
        
        a1.vender(5, 10);

        /*System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);*/
    }
}
