

import java.util.Scanner;

/**
 * @author crsfz (Carlos Javier Ferrer Zapata)
 * Algoritmo que permita obtener el factorial de un número dado
 */

public class ejercicio101 {
    
    public static void main(String []args){

        Scanner entrada = new Scanner (System.in);
        System.out.println("ingrese numero");
        int x = entrada.nextInt();
        int fact=1; int i=0;
        for (i=1;i<x+1;i++){
            fact=fact*i;
        }
        System.out.println("Muestrame el factorial del número: "+fact);

    }
}
