/*Hacer un programa que lea cuatro números enteros 
n1,n2,n3,n4 y luego mediante un método halle el 
mayor de ellos*/
package mayor_cuatro_numerod;
import java.util.Scanner;

public class Mayor_cuatro_numerod {

    public static void main(String[] args) {
        // Definicion de objetos y variables
        Scanner objleer=new Scanner(System.in);
        ClsMayor objmayor=new ClsMayor();
        int n1,n2,n3,n4,may1,may2,mayor;
        
        //Ingresar datos
        System.out.print("Digite numero uno ");
        n1=objleer.nextInt();
        System.out.print("Digite numero dos ");
        n2=objleer.nextInt();
        System.out.print("Digite numero tres ");
        n3=objleer.nextInt();
        System.out.print("Digite numero cuatro ");
        n4=objleer.nextInt();
        
        //Operaciones
        may1=objmayor.Hallar_mayor(n1, n2);
        may2=objmayor.Hallar_mayor(n3, n4);
        mayor=objmayor.Hallar_mayor(may1, may2);
        
        //Imprimir el mayor
        System.out.println("\n El numero mayor es " + mayor);
    }
    
}
