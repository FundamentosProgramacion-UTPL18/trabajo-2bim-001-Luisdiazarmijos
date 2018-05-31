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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double [] calificaciones_programacion = {18, 19, 15, 16, 17, 10 };
        double [] calificaciones_bd ={10, 12, 13, 20, 17, 20};
        double[] promedios = new double[6];
        // declaramos una cadena basia para el formateo de cadenas
        String cadena ="";
        // declaramos una variable estudiante para que valla incrementando 
        int estudiantes = 0;
        //ponemos un ciclo repetitivo para recorrer el arreglo 
        for (int contador = 0; contador<calificaciones_bd.length; contador++) {
            double suma = calificaciones_programacion[contador] + calificaciones_bd[contador];
            double promedio = suma/2;
            //System.out.printf("Estudiante %d\t%f%f", contador);
            promedios[contador] = promedio;
            
            
        }
        // un ciclo repetitivo para imprimir el promedio 
        for (int contador = 0; contador < calificaciones_programacion .length; contador++) {
            estudiantes = estudiantes + 1;
            // invocamos el emtodo cadena para presentar en pantalla
          cadena = String.format("%s%s %-15d %-15.2f%-15.2f%.2f\n",cadena,"Estudiante",estudiantes,
                  calificaciones_programacion[contador],calificaciones_bd[contador],
                  promedios[contador]);
            
            
        }
        // Presentamos en pantalla
        System.out.println(cadena);
    }
    
}
