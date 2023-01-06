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
public class Problema3 {
    static Scanner entrada = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        String resultado;
        System.out.println("Ingrese la nota 1 ");
        nota1 = entrada.nextDouble();
        System.out.println("Ingrese la nota 2");
        nota2 = entrada.nextDouble();
        System.out.println("Ingrese la nota 3");
        nota3 = entrada.nextDouble();
        System.out.println("Ingrese la nota 4");
        nota4 = entrada.nextDouble();
        
        resultado = obtenerPromedio(nota1, nota2, nota3, nota4);
        System.out.println("El promedio de las notas es " + resultado);
    }
    
    public static String obtenerPromedio(double a, double b, double c, double d) {
        double promedio;
        double suma;
        String promedio2 = "";
        suma = a + b + c + d;
        promedio = suma / 4;
        
        if (promedio > 0 && promedio < 5 ) {
            promedio2 = "regular";
        }    
        if (promedio > 5.1 && promedio <= 8 ) {
            promedio2 = "bueno";   
         }  
        if (promedio > 8.1 && promedio <= 9 ) {
            promedio2 = "muy bueno";   
         } 
        if (promedio > 9.1 && promedio <= 10 ) {
            promedio2 = "sobresaliente";   
         }
        
        return promedio2;
      }  
        
    }