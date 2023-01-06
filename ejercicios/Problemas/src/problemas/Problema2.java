/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

public class Problema2 {

    static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int opcion;
        System.out.println("Ingrese 1 para calcular el area de un cuadrado, 2"
                + " para calcular el area de un trianguo o 3 para el area de un"
                + " rectangulo");
        opcion = entrada.nextInt();
        if (opcion == 1) {
            obtenerAreaCuadrado();
        }
        if (opcion == 2) {
            obtenerAreaTriangulo();
        }
        if (opcion == 3) {
            obtenerAreaRectangulo();
        }
    }

    public static void obtenerAreaCuadrado() {
        double lado;
        double area;
        System.out.println("Ingrese el valor del lado");
        lado = entrada.nextDouble();
        area = lado * lado * lado * lado;
        System.out.printf("El area del cuadrado es: %.2f", area);
    }

    public static void obtenerAreaTriangulo() {

        double altura;
        double base;
        double area;
        System.out.println("Ingrese la altura");
        altura = entrada.nextDouble();
        System.out.println("Ingrese la base");
        base = entrada.nextDouble();
        area = (base * altura) / 2;
        System.out.printf("El area de la triangulo es: %.2f", area);
    }

    public static void obtenerAreaRectangulo() {
        double altura;
        double base;
        double area;
        System.out.println("Ingrese la altura");
        altura = entrada.nextDouble();
        System.out.println("Ingrese la base");
        base = entrada.nextDouble();
        area = (base * altura);
        System.out.printf("El area del rectangulo es: %.2f", area);
    }

}
