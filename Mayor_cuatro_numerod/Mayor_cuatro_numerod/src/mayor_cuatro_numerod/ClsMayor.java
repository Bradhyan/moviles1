/* Metodo para hallar el mayor de dos numeros enteros*/
package mayor_cuatro_numerod;

public class ClsMayor {
    
    public int Hallar_mayor(int dato1,int dato2){
        int mayor;
        if (dato1 > dato2)
            mayor=dato1;
        else
            mayor=dato2;
        return mayor;
    }
}
