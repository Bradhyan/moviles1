/* Metodos para leer e imprimir el vector */
package contar_dato_vector;
import java.util.Scanner;

public class ClsVector {
    
    public int[] Leer_vector(int n){
        Scanner objleer=new Scanner(System.in); 
        int[] datos=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite elemento " + i + " ");
            datos[i]=objleer.nextInt();
        }
        return datos;
    }
    
    public void Imprimir_vector(int n,int[] datos){
        System.out.println("\n Datos del vector");
        for (int i = 0; i < n; i++) {
            System.out.print(datos[i] + "  ");        
        }
    }
}
