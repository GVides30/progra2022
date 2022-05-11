
package com.mycompany.operacionesbasicas;

public class ProcesoOperacion {
    String operacion="";
    public static float Resolucion (double num1, double num2, String operacion){
        double resultado=0;
     
        if(operacion.equals("Suma")){
            resultado=num1+num2;
        }else if(operacion.equals("Resta")){
            resultado=num1-num2;
        }else if(operacion.equals("Multi")){
            resultado=num1*num2;
            System.out.println(resultado);
        }else if(operacion.equals("Div")){
            resultado=num1/num2;
        }
       
        return (float) resultado;
    }
}
