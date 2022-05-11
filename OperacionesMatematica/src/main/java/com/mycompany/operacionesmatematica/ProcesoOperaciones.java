/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.operacionesmatematica;

public class ProcesoOperaciones {
        public static float Convertir (double num1, double num2, String operaciones){
        double resultado=0;
    
       if(operaciones.equals("Suma")){
           resultado=num1+num2;
       }else if(operaciones.equals("Resta")){
         resultado=num1-num2;  
       }else if(operaciones.equals("Multi")){
           resultado=num1*num2;
       }else if(operaciones.equals("Div")){
           resultado=num1/num2;
       }
        
        return (float) resultado;
    }
}
