package com.example.salarios_empleados;

public class ClsSalarios {

    private float salario_minimo=1160000, auxilio_transporte=140606;

    public float Calcular_deducciones(float sal_basico){
        float deducciones;
        if (sal_basico <= 4 * salario_minimo)
            deducciones=sal_basico * 8/100;
        else
            deducciones=sal_basico * 9/100;
        return deducciones;
    }//fin deducciones

    public float Calcular_auxilio_transporte(float sal_basico){
        float valor_auxilio_transporte=0;
        if (sal_basico <= 2 * salario_minimo)
            valor_auxilio_transporte=auxilio_transporte;
        return valor_auxilio_transporte;
    }//fin auxilio de transporte

    public float Calcular_bonificacion(int nro_hijos,float sal_basico){
        float bonificacion=0;
        if (nro_hijos >= 2)
            bonificacion=sal_basico * 5/100;
        return bonificacion;
    }// fin bonificacion

    public float Calcular_salario_neto(float sal_basico,float deducciones,
           float auxilio_transporte,float bonificacion){
        return sal_basico - deducciones + auxilio_transporte + bonificacion;
    }
}
