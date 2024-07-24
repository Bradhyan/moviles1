/*Hacer una aplicación que lea e imprima un vector de 
notas de tamaño N y luego con tres métodos encuentre 
el promedio de los elementos de las posiciones pares, 
mayor el elemento y la cantidad de números múltiplos de cinco*/
package vector_notas;
import java.util.Scanner;

public class Vector_notas {

    public static void main(String[] args) {
        // Definicion de objetos y variables
        Scanner objleer=new Scanner(System.in);
        ClsNotas objnotas=new ClsNotas();
        float promedio,mayor;
        int n,contador;
        
        //Leer cantidad de elementos del vector
        System.out.print("Digite cantidad de elementos ");
        n=objleer.nextInt();
        
        //Definir el vector
        float[] notas=new float[n];
        
        //Llenar e imprimir el vector 
        notas=objnotas.Leer_vector_notas(n);
        objnotas.Imprimir_vector_notas(n, notas);
        
        //Hallar e imprimir promedio
        promedio=objnotas.Calcular_promedio(n, notas);
        mayor=objnotas.Mayor_nota(n, notas);
        contador=objnotas.Cantidad_multiplos(n, notas);
        System.out.println("\n El promedio de las posiciones pares es " + promedio);
        System.out.println(" La mayor nota es " + mayor);
        System.out.println(" La cantidad de multiplos de cinco es " + contador);
    }
    
}
