/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem4;

import java.util.Scanner;

/**
 *
 * @author Bryan Lopez Avila
 */
public class Problem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos la variable donde almacenamos el número de entrada
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número: ");
        //Asignamos el número de entrada a la variable
        n = sc.nextInt();
        
        //Creamos un objeto de la misma clase para hacer uso de la función para calcular el factorial
        Problem4 p4 = new Problem4();
        //Guardamos el resultado en tipo de dato Long
        long fac = p4.factorial(n);
        //Imprimimos el resultado de ceros
        System.out.println("La cantidad de los últimos ceros son: " + p4.getZeros(fac));
    }
    
    /*
    * Función encargada de realizar el factorial del número
    */
    public long factorial(int n){
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            //Mutiplicamos y asignamos a factorial 
            factorial *= i;
        }
        
        return factorial;
    }
    
    /*
    * Función para calcular la cantidad de ceros en el número
    */
    public int getZeros(long factorial){
        int zeros = 0;
        //Recorremos mientras el numero sea divisible por 10
        while(factorial % 10 == 0){
            //Aumentamos en 1 la cantidad de ceros
            zeros++;
            //Reducimos el factorial
            factorial /= 10;
        }
        return zeros;
    }
}
