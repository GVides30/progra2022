/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.operacionesmatematicas;


public class ProcesoOperaciones {
        public static float Resolucion (double num1,double num2, String operacion){
        double resultado=0;
        
        if(operacion.equals("Suma")){
            resultado=num1+num2;
        }else if(operacion.equals("Resta")){
            resultado=num1-num2;
        }else if(operacion.equals("Multi")){
            resultado=num1+num2;
        }else if(operacion.equals("Div")){
            resultado=num1/num2;
        }
        return (float) resultado;
    }
}
