
public class ClsSalario {

int sal_minimo=1070000, aux_transp=117172;

public float cal_ded(int sal_basico)
{
    float ded;
    
    if (sal_basico<=4*sal_minimo)
        {       
            ded=(sal_basico*8)/100;
        }else {
        
        
            ded=(sal_basico*9)/100;
            
      
 return ded;   
}
        
    public int cal_aux_trans(int sal_basico){
        int transporte=0;
        
        if (sal_basico<=2*sal_minimo)
            transporte =aux_transp;
        
        return transporte;
    }
}
}
