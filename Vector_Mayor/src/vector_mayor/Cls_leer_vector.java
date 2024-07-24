
package vector_mayor;

import java.util.Random;

public class Cls_leer_vector {
 
    Random rnd=new Random();
    
    public int[]  leer_vector(int x){
        
    int[] datos= new int [x];
    
    for (int i=0; i<x ;i++){
    
        datos[i]=rnd.nextInt(100);
        return datos;
                
                
                }
    
    

