/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema01;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Problema01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombre;
        String posicion;
        int edad;
        double estatura;
        boolean salida = true;
        String listadoJugadores = "Listado de Jugadores\n";
        String listadoEdades = "Listado de Edades\n";
        double sumaEdades = 0;
        double sumaEstaturas = 0;
        int contador = 1;
        String respuesta;

        while (salida) {
            System.out.println("Ingrese el nombre del jugador");
            nombre = entrada.nextLine();

            System.out.println("Ingrese la posición en el campo de juego");
            posicion = entrada.nextLine();

            System.out.println("Ingrese la edad del jugador");
            edad = entrada.nextInt();

            System.out.println("Ingrese la estatura del jugador");
            estatura = entrada.nextDouble();
            entrada.nextLine();

            listadoJugadores = String.format("%s%d. %s -%s-, edad %d, estatura "
                    + "%.2f\n", listadoJugadores, contador, nombre, posicion,
                    edad, estatura);
            listadoEdades = String.format("%s%d\n", listadoEdades, edad);

            sumaEdades = sumaEdades + edad;
            sumaEstaturas = sumaEstaturas + estatura;
            contador = contador + 1;

            System.out.println("Desea ingresar otro jugador? (Escriba 'no' "
                    + "para salir)");
            respuesta = entrada.nextLine();

            if (respuesta.equals("no")) {
                salida = false;
            }
        }
        double promedioEdades = sumaEdades / (contador - 1);
        double promedioEstaturas = sumaEstaturas / (contador - 1);
        System.out.printf("\n%s\n%sPromedio de edades: %.1f\nPromedio de estaturas: %.2f\n",
                listadoJugadores, listadoEdades, promedioEdades, promedioEstaturas);
    }
}
