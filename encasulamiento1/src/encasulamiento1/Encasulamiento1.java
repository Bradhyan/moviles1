/*
 */
package encasulamiento1;
import java.util.Scanner;

    
public class Encasulamiento1 {

    public static void main(String[] args) {
      
        Scanner objleer=new Scanner (System.in);
    ClsPaseo obj_paseo= new ClsPaseo();
    float val_persona,valor_extras;
    int cant_personas,tipo_cliente;
   
    System.out.print ("¿cuantas personas viajan?");
    cant_personas=objleer.nextInt();
     System.out.print ("¿cual es el valor por persona?");
     val_persona=objleer.nextFloat();
      System.out.print ("¿tipo de cliente?");
      tipo_cliente=objleer.nextInt();
       System.out.print ("¿cual esvalor extra a pagar?");
       valor_extras=objleer.nextFloat();
       //enviar información a la clase
       obj_paseo.setCant_personas(cant_personas);
       obj_paseo.setVal_persona(val_persona);
       obj_paseo.setTipo_cliente(tipo_cliente);
       obj_paseo.setCostos_adicionales(valor_extras);
       //operacion
       obj_paseo.valcular_valores_viaje();
       
       System.out.println(" \n el valor bruto es " + obj_paseo.getValor_bruto());
       System.out.println(" El descuento es de " + obj_paseo.getDescuento());
       System.out.println(" El iva es de   " + obj_paseo.getIva());
       System.out.println(" El valor neto a pagar es  "+ obj_paseo.getValor_neto());
    }
    
}
