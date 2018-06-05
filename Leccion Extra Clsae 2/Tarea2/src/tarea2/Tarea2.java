/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author USUARIO
 */
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Arreglos globales inicialiazados.
        //Declaracion de variables del arreglo
        double arreglo1[] = {110, 220, 430, 140, 250, 460};
        double arreglo2[] = {10, 20, 30, 40, 50, 60};

        //Arreglo global no inicializado
        double arreglo3[] = new double[6];

        //Declaramos una cadena basia para el formateo de cadenas
        String cadena;
        double suma = 0;
        //Valores de encabezado de la variable cadena
        cadena = String.format("\n%30s\n\n%-15s%-15s%s\n", "REPORTE DE PROMEDIOS: ", "Arreglo 1", "Arreglo 2", "Resultado");

        //Ciclo que permite recorrer el arreglo
        for (int contador = 0; contador < arreglo1.length; contador++) {
            arreglo3[contador] = arreglo1[contador] / arreglo2[contador];
            cadena = String.format("%s%-15.0f%-15.0f%.0f\n", cadena, arreglo1[contador], arreglo2[contador], arreglo3[contador]);
        }

        //Ciclo que permite calcular el promedio
        for (int contador = 0; contador < arreglo3.length; contador++) {
            suma +=  arreglo3[contador];
        }
        double promedio = suma / arreglo3.length;
        // Presentamos en pantalla lo que contiene la variable cadena
        cadena = String.format("%s\n%s %.1f\n%35s\n", cadena, "El promedio es:", promedio, "");
        System.out.println(cadena);
    }

}
