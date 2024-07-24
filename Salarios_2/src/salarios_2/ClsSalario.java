/* Metodos para hallar las deducciones, auxilio de transporte y salario neto*/
package salarios_2;

public class ClsSalario {
    
    int sal_minimo=1000000,val_aux_transporte=117172;
    
    public float Calcular_deducciones(int sal_basico){
        float deducciones;
        if (sal_basico <= 4 * sal_minimo)
            deducciones=(sal_basico * 8)/100;
        else
            deducciones=(sal_basico * 9)/100;
        return deducciones;
    }
            
    public int Calcular_aux_transporte(int sal_basico){
        int transporte=0;
        if (sal_basico <= 2 * sal_minimo)
            transporte=val_aux_transporte;
        return transporte;
    }
    
    public float Calcular_salario_neto(int sal_basico,float deducciones,int transporte){
        float sal_neto=sal_basico - deducciones + transporte;
        return sal_neto;
    }
    
}
