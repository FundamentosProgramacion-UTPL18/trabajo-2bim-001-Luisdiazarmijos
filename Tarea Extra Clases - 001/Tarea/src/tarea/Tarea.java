/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

/**
 *
 * @author USUARIO
 */
public class Tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] meses = {"Agosto", "Octubre", "Diciembre"};
        String[] sucursales = {"sucursal 1", "sucursal 2", "sucursal 3", "sucursal 4"};
        double[] ventas_mes_1 = {4500.2, 5500.2, 6500.2, 2500.1};
        double[] ventas_mes_2 = {1500.2, 2500.2, 3500.2, 1500.1};
        double[] ventas_mes_3 = {2300.2, 1200.2, 4700.2, 3200.1};
        double[] venta_total_sucursal = new double[4];
        double[] venta_promedio_sucursal = new double[4];
        // declaramos una cadena basia para el formateo de cadenas
        String cadena = "Reporte\n\n\t\t\t Agosto\t\t Octubre\tDiciembre\t Total\t\t Promedio\n\n";

        // declaramos una variable Sucursal para que valla incrementando 
        int sucursal = 0;
        double total_final = 0;
        //ponemos un ciclo repetitivo para recorrer el arreglo 
        for (int contador = 0; contador < ventas_mes_1.length; contador++) {
            double suma = ventas_mes_1[contador] + ventas_mes_2[contador] + ventas_mes_3[contador];
            venta_total_sucursal[contador] = suma;
            double promedio = suma / 3;
            venta_promedio_sucursal[contador] = promedio;
            total_final += suma;
        }
        // un ciclo repetitivo para imprimir el promedio 
        for (int contador = 0; contador < ventas_mes_3.length; contador++) {
            sucursal = sucursal + 1;
            // invocamos el emtodo cadena para presentar en pantalla
            cadena = String.format("%s%s %-15d %-15.2f %-15.2f %-15.2f %-15.2f %.2f\n", cadena, "Sucursal", sucursal,
                    ventas_mes_1[contador], ventas_mes_2[contador], ventas_mes_3[contador],
                    venta_total_sucursal[contador], venta_promedio_sucursal[contador]);

        }
        // Presentamos en pantalla

        System.out.println(cadena);
        System.out.printf("Totales de ventas de todas las sucursales en  :%.1f\n ", total_final);
    }
}
