/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here

        int opcion;
        int cedula;
        String nombre;
        boolean bandera = true;
        while (bandera) {
            System.out.println("Ingrese su nombre: ");
            nombre = entrada.nextLine();
            System.out.println("Ingrese su cedula:");
            cedula = entrada.nextInt();
            System.out.println("Ingrese 1 para obtener el valor de la planilla"
                    + "de luz o 2 para obtener el predio del inmueble");
            opcion = entrada.nextInt();
            if (opcion == 1) {
                calcularValorLuz(nombre, cedula);
            }
            if (opcion == 2) {
                calcularPredio(nombre, cedula);
            }
            System.out.println("Ingrese cualquier numero para salir:");
            opcion = entrada.nextInt();
            if (opcion != 1 && opcion != 2) {
                bandera = false;                
            }           
        }
    }

    public static void calcularValorLuz(String a, int b) {
        double valork;
        double numerok;
        double valor;
        System.out.println("Ingrese el valor del kw");
        valork = entrada.nextDouble();
        System.out.println("Ingrese el numero de kw");
        numerok = entrada.nextDouble();
        valor = valork * numerok;
        System.out.printf("Cliente %s con cedula %d debe cancelar el valor de"
                + " %.2f\n", a, b, valor);
    }
    
    public static void calcularPredio(String a, int b) {
        double valori;
        double valorp;
        System.out.println("Ingrese el valor del inmueble:");
        valori = entrada.nextDouble();
        valorp = valori * 0.02;
        System.out.printf("Cliente %s con cedula %d tiene un bien inmueble"
                + " valorado en %.2f y tiene que pagar un predio de %.2f\n", a, b,
                valori , valorp);
    }
   
}
