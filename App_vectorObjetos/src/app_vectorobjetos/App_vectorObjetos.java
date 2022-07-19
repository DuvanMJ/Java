package app_vectorobjetos;

import java.awt.BorderLayout;
import java.util.Scanner;

public class App_vectorObjetos {
static Scanner leer = new Scanner (System.in);

    public static void main(String[] args) {
        System.out.print("Digite número de productos: ");
        int num = leer.nextInt();
        Producto [] vector = new Producto [num];
        for (int i=0; i<num; i++){
            System.out.print("Digite código de producto: ");
            int cod = leer.nextInt();
            System.out.print("Digite precio de producto: ");
            float pre = leer.nextFloat();
            System.out.print("Digite cantidad en bodega: ");
            int cb = leer.nextInt();
            System.out.print("Digite cantidad mínima: ");
            int cm = leer.nextInt();
            vector[i] = new Producto(cod, pre, cb, cm);
        }
        
        /*Recorrer el vector y mostrar mensaje de alerta para pedido de producto*/
        for (int i=0; i<num; i++){
            vector[i].solicitarPedido();
        }
        
        /*Identificar código de producto con cantidad mínima*/
        int min = vector[0].getCantBodega();
        int codmin = vector[0].getCodigo();
        for (int j=0; j<num; j++) {
            if (vector[j].getCantBodega() < min){
                min = vector[j].getCantBodega();
                codmin = vector[j].getCodigo();
            }
        
        }
        System.out.println("Código de producto con menor cantidad de unidades en bodega: "+codmin);
        System.out.println("Cuenta con "+min+" unidades en bodega");
        
        
        
        
    }
    
}
