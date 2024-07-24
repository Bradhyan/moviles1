/*Crear un algoritmo que lea un vector de tamaño N de números enteros 
y un dato y devuelva la cantidad de veces que está dicho dato en el vector */
package contar_dato_vector;

import java.util.Scanner;

public class Contar_dato_vector {

    public static void main(String[] args) {
        // Definir objetos y variables
        Scanner objleer=new Scanner(System.in);
        ClsVector objvector=new ClsVector();
        int n;
        
        //Leer el tamaño del vector
        System.out.print("¿Cuantos elementos tiene el vector? ");
        n=objleer.nextInt();
        
        //Definir el vector
        int[] datos=new int[n];
        
        //Lectura e impresion del vector
        datos=objvector.Leer_vector(n);
        objvector.Imprimir_vector(n, datos);
    }
    
}
