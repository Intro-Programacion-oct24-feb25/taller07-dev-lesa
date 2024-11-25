/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema04;

/**
 *
 * @author Luis
 */
public class Problema04 {

    public static void main(String[] args) {
        int denominador = 1;
        int signo = 1;
        double resultado = 0;
        double termino;
        
        System.out.println("Serie:");
        while (denominador <= 15) {
            termino = signo * (1.0 / denominador);
            if (signo == 1) {
                System.out.printf("+ 1/%d ", denominador);
            } else {
                System.out.printf("- 1/%d ", denominador);
            }
            resultado = resultado + termino;
            denominador = denominador + 2;
            signo = signo * -1;
        }
        System.out.printf("\nResultado de la serie: %.6f\n", resultado);
    }
}
