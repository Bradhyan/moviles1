/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bryan
 */
public class ClsPaseo {
    
     private int cant_personas;
     private float val_persona;
     private int tipo_cliente;
    private float costos_adicionales;
    private float valor_bruto;
    private float descuento;
    private float iva;
    private float valor_neto;

    public float getValor_bruto() {
        return valor_bruto;
    }

    public float getDescuento() {
        return descuento;
    }

    public float getIva() {
        return iva;
    }

    public float getValor_neto() {
        return valor_neto;
    }

    public void setCant_personas(int cant_personas) {
        this.cant_personas = cant_personas;
    }

    public void setVal_persona(float val_persona) {
        this.val_persona = val_persona;
    }

    public void setTipo_cliente(int tipo_cliente) {
        this.tipo_cliente = tipo_cliente;
    }

    public void setCostos_adicionales(float costos_adicionales) {
        this.costos_adicionales = costos_adicionales;
    }
     
     public void valcular_valores_viaje(){
         valor_bruto=cant_personas * val_persona;
         if(tipo_cliente ==1)
             descuento=(valor_bruto * 20) / 100;
         else
             if(tipo_cliente ==2)
             descuento=(valor_bruto * 10) / 100;
         else
                 descuento=0;
         iva=(valor_bruto - descuento + costos_adicionales)*19/100;
         valor_neto=valor_bruto - descuento + iva + costos_adicionales;
    }
}
