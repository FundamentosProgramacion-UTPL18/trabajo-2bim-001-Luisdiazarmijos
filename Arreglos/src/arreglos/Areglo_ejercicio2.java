/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author USUARIO
 */
public class Areglo_ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7};
        int multiplicar = 0;
        for (int contador = 0; contador < arreglo.length; contador++) {
            if (arreglo[contador]% 2 == 0) {
                for (int contador2 = 1; contador2 <= 12; contador2++) {
                    multiplicar = arreglo[contador] * contador2;
                    
                    System.out.printf("%d x %d = %d \n",arreglo[contador], contador2, multiplicar);
                }

            }   
        }
    }    
}