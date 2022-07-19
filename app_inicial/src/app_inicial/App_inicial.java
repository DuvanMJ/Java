
package app_inicial;

import java.util.Scanner;

public class App_inicial {
    static Scanner leer = new Scanner(System.in);
    static Producto objNuevoP = new Producto();
    public static void main(String[] args) {
        System.out.print("Digite código: ");
        int cod = leer.nextInt();
        objNuevoP.setCodigo(cod);
        System.out.print("Digite precio: ");
        float precio = leer.nextFloat();
        objNuevoP.setPrecio(precio);
        System.out.print("Digite cantidad en bodega: ");
        int cantidadB = leer.nextInt();
        objNuevoP.setcBodega(cantidadB);
        System.out.print("Digite cantidad mínima: ");
        int cantidadM = leer.nextInt();
        objNuevoP.setcMinima(cantidadM);
        objNuevoP.solictarPedido();
        
    }
    
}
