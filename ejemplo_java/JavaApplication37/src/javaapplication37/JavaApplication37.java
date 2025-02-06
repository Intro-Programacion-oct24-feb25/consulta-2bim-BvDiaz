/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication37;

/**
 *
 * @author Edgar
 */
public class JavaApplication37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 5;
        System.out.printf("El factorial de %d es: %d\n", numero, 
                factorial(numero));
    }
    
    public static int factorial(int n) {
        if (n == 0 || n == 1) { // Caso base
            return 1;
        } else { // Caso recursivo
            return n * factorial(n - 1);
        }
    }
}
