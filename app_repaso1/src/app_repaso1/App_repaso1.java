package app_repaso1;

import java.util.Scanner;


public class App_repaso1 {
static int [] vector;
static Scanner leer = new Scanner(System.in);

    public static void fn_mostrarVector(int dim){
        System.out.println("El vector digitado es:");
        for (int i=0; i<dim; i++){
            System.out.print(vector[i]+" ");
        }
            
    }

    
    public static void main(String[] args) {
        System.out.print("Digite el tamaño del vector: ");
        int dim = leer.nextInt();
        vector = new int [dim];
        for (int i=0; i<dim; i++){
            System.out.print("Ingrese el valor de la posición "+(i+1)+ ": ");
            vector[i]= leer.nextInt();
        }
        fn_mostrarVector(dim);
    }
    
}
