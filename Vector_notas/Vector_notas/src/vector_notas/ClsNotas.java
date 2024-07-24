/* metodos para leer e imprimir un vector de notas
   - método que encuentre el promedio de los elementos 
     de las posiciones pares
   - mayor el elemento
   - cantidad de números múltiplos de cinco*/
package vector_notas;
import java.util.Random;

public class ClsNotas {
    
    Random rnd=new Random();
    public float[] Leer_vector_notas(int n){
        float[] notas=new float[n];
        for (int i = 0; i < n; i++) {
            notas[i]=(float)rnd.nextInt(51)/10;
        }
        return notas;
    }
    
    public void Imprimir_vector_notas(int n,float[] notas){
        System.out.println("\n Datos del vector notas");
        for (int i = 0; i < n; i++) {
            System.out.print(notas[i] + "  ");
        }
    }
    
    public float Calcular_promedio(int n,float[] notas){
        float acum=0,prom;
        int pos=0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0){
                acum+=notas[i];//acum=acum + notas[i];
                pos++;
            }
        }
        prom=acum/pos;
        return prom;
    }
    
    public float Mayor_nota(int n,float[] notas){
        float mayor=notas[0];
        for (int i = 1; i < n; i++) {
            if (notas[i] > mayor)
                mayor=notas[1];
        }
        return mayor;
    }
    
    public int Cantidad_multiplos(int n,float[] notas){
        int contador=0;
        for (int i = 0; i < n; i++) {
            if (notas[i] % 5 == 0)
                contador++;
        }
        return contador;
    }
}
