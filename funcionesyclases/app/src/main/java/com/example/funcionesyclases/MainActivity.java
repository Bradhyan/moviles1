package com.example.funcionesyclases;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Declaro las variables

    EditText jetnumber1, jetnumber2, jetnumber3, jetnumber4;
    TextView jtvResultado;
    String number1, number2, number3,number4;
    ClsMayor lea = new ClsMayor();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Oculto la barra de título por defecto

        getSupportActionBar().hide();

        //Asocio los objetos de java con los Xml

        jetnumber1=findViewById(R.id.etnumber1);
        jetnumber2=findViewById(R.id.etnumber2);
        jetnumber3=findViewById(R.id.etnumber3);
        jetnumber4=findViewById(R.id.etnumber4);
        jtvResultado=findViewById(R.id.tvResultado);

        //Genero el metodo del boton calcular

        public void Calcular(View view){
            number1=jetnumber1.getText().toString();
            number2=jetnumber2.getText().toString();
            number3=jetnumber3.getText().toString();
            number4=jetnumber4.getText().toString();

            //Validar que digito cuatro números

            if(number1.isEmpty()|| number2.isEmpty()|number3.isEmpty()||number4.isEmpty()){
                Toast.makeText(this,"Todos los números son requeridos", Toast.LENGTH_SHORT).show();
                jetnumber1.requestFocus();
            }else{
                int numero1,numero2,numero3, numero4, may1, may2, mayor;
                //conversiones

                numero1=Integer.parseInt(number1);
                numero2=Integer.parseInt(number2);
                numero3=Integer.parseInt(number3);
                numero4=Integer.parseInt(number4);
                //operaciones

                may1=lea.Hallar_mayor(numero1,numero2);
                may2=lea.Hallar_mayor(numero3,numero4);
                mayor=lea.Hallar_mayor(may1,may2);

                // Imprimimos resultados

                jtvResultado.setText(String.valueOf(mayor));

                //creamos las funciones del boton limpiar.


                public void Limpiar(View view){
                    jetnumber1.setText("");
                    jetnumber2.setText("");
                    jetnumber3.setText("");
                    jetnumber4.setText("");
                    jtvResultado.setText("");
                    jetnumber1.requestFocus();
            }

        }




    }
}