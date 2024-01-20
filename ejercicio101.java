

import java.util.Scanner;

/**
 * @author crsfz (Carlos Javier Ferrer Zapata)
 * Algoritmo que permita obtener el factorial de un número dado
 */

public class Factorial {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un número para calcular su factorial: ");
        int numero = scanner.nextInt();

        // Calcular el factorial del número ingresado
        long factorial = calcularFactorial(numero);

        // Mostrar el resultado
        System.out.println("El factorial de " + numero + " es: " + factorial);

        scanner.close();
    }

    // Método para calcular el factorial de un número
    public static long calcularFactorial(int n) {
        if (n < 0) {
            System.out.println("El factorial no está definido para números negativos.");
            return -1; // Valor indicativo de un resultado no válido
        }

        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }
}

  
