/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.convertirtemperatura;

public class conversorDeUnidades {
    public static String tipo1="";
    public static String tipo2="";
    public static float Convertir (float cantidad, String tipo1, String tipo2){
        double resultado=0;
        
        if(tipo1.equals("Kelvin") && tipo2.equals("Celsius")){
            resultado=cantidad-273.15;
        }else if(tipo1.equals("Celsius") && tipo2.equals("Kelvin")){
            resultado=cantidad+273.15;
        }else if(tipo1.equals("Celsius") && tipo2.equals("Fahrenheit")){
            resultado=(cantidad*1.8)+32;
        }else if(tipo1.equals("Fahrenheit") && tipo2.equals("Celsius")){
            resultado=((cantidad-32)*5)/9;
        }else if(tipo1.equals("Kelvin") && tipo2.equals("Fahrenheit")){
            resultado=(cantidad-273.15)*1.8+32;
        }else if(tipo1.equals("Fahrenheit") && tipo2.equals("Kelvin")){
            resultado=(((cantidad-32)*5)/9)+273.15;
        }
       
        return (float) resultado;
    }
}
