/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import javax.swing.JOptionPane;


/**
 *
 * @author Erasmo
 */
public class CalculadoraClase {
    public double sumar(double valor1,double valor2){
        return valor1 + valor2;
    }
    public double restar(double valor1,double valor2){
        return valor1 - valor2;
    }
    public double multiplicar(double valor1,double valor2){
        return valor1 * valor2;
    }
    public double dividir(double valor1,double valor2){
        
        if(valor2==0){
            JOptionPane.showMessageDialog(null, "El divisor no puede ser 0");
            return 0;
        }else{
            return  valor1 /valor2;
        }
    }
    public double convertirAFarenheit(double valor){
        return (valor * 9/5) + 32;
    }
    public double convertirACelsius(double valor){
        return  (valor - 32) * 5/9;
    }
}
