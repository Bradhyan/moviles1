package com.example.salarios_empleados;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText jetsalario,jethijos;
    TextView jtvdeducciones,jtvtransporte,jtvbonificacion,jtvneto;
    String salario_basico,nro_hijos;
    ClsSalarios obj_salarios=new ClsSalarios();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Ocultar la barra de titulo por defecto, asociar los objetos Java y Xml
        getSupportActionBar().hide();
        jetsalario=findViewById(R.id.etsalario);
        jethijos=findViewById(R.id.ethijos);
        jtvbonificacion=findViewById(R.id.tvbonificaciones);
        jtvdeducciones=findViewById(R.id.tvdeducciones);
        jtvneto=findViewById(R.id.tvneto);
        jtvtransporte=findViewById(R.id.tvtransporte);
    }//fin onCreater

    public void Calcular(View view){
        //Pasar la informacion de los objetos a variables
        salario_basico=jetsalario.getText().toString();
        nro_hijos=jethijos.getText().toString();
        //validacion de que los campos no estan vacios
        if (salario_basico.isEmpty() || nro_hijos.isEmpty()){
            Toast.makeText(this, "El salario basico y numero hijos es requerido", Toast.LENGTH_SHORT).show();
            jetsalario.requestFocus();
        }else{
            float deducciones,salario_bas,aux_transporte,bonificacion,salario_neto;
            int numero_hijos;
            //Conversiones de String a float
            salario_bas=Float.parseFloat(salario_basico);
            numero_hijos=Integer.parseInt(nro_hijos);
            //Operaciones
            deducciones=obj_salarios.Calcular_deducciones(salario_bas);
            aux_transporte= obj_salarios.Calcular_auxilio_transporte(salario_bas);
            bonificacion=obj_salarios.Calcular_bonificacion(numero_hijos,salario_bas);
            salario_neto= obj_salarios.Calcular_salario_neto(salario_bas,deducciones,aux_transporte,bonificacion);
            //Imprimir resultados
            jtvbonificacion.setText(String.valueOf(bonificacion));
            jtvtransporte.setText(String.valueOf(aux_transporte));
            jtvneto.setText(String.valueOf(salario_neto));
            jtvdeducciones.setText(String.valueOf(deducciones));
        }
    }//fin Calcular

    public void Limpiar(View view){

    }//fin limpiar
}