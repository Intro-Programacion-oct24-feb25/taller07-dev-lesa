/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema02;

/**
 *
 * @author Luis
 */
public class Problema02 {
    public static void main(String[] args) {
        int incremento = 4;
        int contador = 1;
        int numero = 2;
        
        while (contador <=10){
            System.out.println(numero);
            numero= numero +incremento;
            incremento= incremento+2;
            contador=contador+1;
        }
        
    }
}
