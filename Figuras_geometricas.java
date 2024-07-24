
package figuras_geometricas;
// heredamos la clase Clsareas.

import java.util.Scanner;

/**/

public class Figuras_geometricas {

  
    public static void main(String[] args) {
        //Definición de objetos y variables
        Scanner objleer=new Scanner(System.in);
        ClsAreas objareas=new ClsAreas() extends_ClsPerimetro;
        // ClsPerimetro objperimetro=new ClsPerimetro(); No la llamo por que vamos a poner a heredar todo lo de esta clase en la clase ClsAreas.
        int lado,base,altura,opc=10;
        float radio, area, perimetro;
        
        //menú
        
        while (opc !=4){
            System.out.println("/n/t Menú de opciones");
            System.out.println("1. Area y perimétro de un círculo:");
            System.out.println("2. Area y perimétro de un cuadrado ");
            System.out.println("2. Area y perimétro de un rectángulo:");
            System.out.println(" 4. salir");
            System.out.print("Seleccione entre 1 y 4");
            opc=objleer.nextInt();
            
            switch (opc){
                case 1: System.out.print("Digite el radio del circulo");
                    radio=objleer.nextFloat();
                    area=objareas.hallar_area_circulo(radio);
                    perimetro=objperimetro.perimetro_circulo(area);
                    
                    System.out.println("/n El área del circulo es: " +area+ "/n y el perimétro del circulo es: "+ perimetro);
                    break;
                    
                
                case 2: System.out.print("Digite el lado del cuadrado"); 
                lado=objleer.nextInt();
                area=objareas.hallar_area_cuadrado(lado);
                    System.out.println("/n El área del cuadrado es: "+area);
                    break;
                    
                case 3: System.out.println("Digite la base del rectángulo");
                base=objleer.nextInt();
                    System.out.print("Digite altura del rectángulo");
                    altura=objleer.nextInt();
                    area=objareas.hallar_area_rectangulo(base, altura);
                    System.out.println("El área del rectángulo es: "+area);
                    break;
                    
            
            }//fin caso
            
        }//fin mientras
    }
    
}
