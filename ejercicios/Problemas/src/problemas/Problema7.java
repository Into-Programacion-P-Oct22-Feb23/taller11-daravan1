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
public class Problema7 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String[] lista = obtenerCiudades();
        obtenerCaracteres(lista);
    }

    public static String[] obtenerCiudades() {
        int numero;
        System.out.println("Ingrese el numero de valores de su lista:\n");
        numero = entrada.nextInt();
        entrada.nextLine();
        String[] cadena = new String [numero];
        for (int i = 0; i < cadena.length; i++) {
            System.out.printf("Ingrese el valor de la posicion %d\n", i);
            cadena[i] = entrada.nextLine();
        }
        return cadena;
    }

    public static void obtenerCaracteres(String[] a) {
        for (int i = 0; i < a.length; i++) {
            int caracteres = a[i].length();
            if (caracteres == 4 || caracteres == 5) {
                System.out.println(a[i]);
            }

        }
    }
}
