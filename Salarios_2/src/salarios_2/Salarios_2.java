/*Hacer una solución que calcule las deducciones, el auxilio de transporte 
y el salario neto a pagar a un empleado si el dato de entrada es el 
salario básico.
Nota: Recordar que las deducciones legales vigentes son las siguientes:
-	Si gana hasta 4 mínimos se le deduce el 8% del salario básico.
-	Si gana más de 4 mínimos se le deduce el 9% del salario básico.
-	Solo se le da auxilio de transporte a los que ganan hasta dos mínimos. 
-	suponer el salario mínimo y el valor del auxilio de transporte*/
package salarios_2;
import java.util.Scanner;

public class Salarios_2 {

    public static void main(String[] args) {
        // Definicion de objetos y variables
        Scanner objleer=new Scanner(System.in);
        ClsSalario objsalario=new ClsSalario();
        float deducciones,sal_neto;
        int sal_basico,transporte;
        
        //Ingresar datos
        System.out.print("Digite salario basico ");
        sal_basico=objleer.nextInt();
        
        //Operaciones
        deducciones=objsalario.Calcular_deducciones(sal_basico);
        transporte=objsalario.Calcular_aux_transporte(sal_basico);
        sal_neto=objsalario.Calcular_salario_neto(sal_basico, deducciones, transporte);
        
        //Impresion de resultados
        System.out.println("\n Las deducciones son de " + deducciones);
        System.out.println(" El auxilio de transporte es de " + transporte);
        System.out.println(" El salario neto es de " + sal_neto);
    }
    
}
