/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MARCOS
 */
public class OptimizacionHooke {

    public static void main(String[] args) {
        Optimizacion optimizacion = new Optimizacion();

        int OrdenPivote = 50;
        int ReordenPivote = 200;

        //  int OrdenOptimo = 0 ; 
        //  int ReordenOptimo = 0 ;
        int margen = 100;
        double valorMinimo = 0;
        double CostoTotal = optimizacion.costoTotal(OrdenPivote, ReordenPivote, 12);

        double CostoTotalPivote = optimizacion.costoTotal(OrdenPivote + 1, ReordenPivote - 1, 12);

        while (Math.abs(CostoTotal - CostoTotalPivote) > margen) {
            if (CostoTotal > CostoTotalPivote) {
                valorMinimo = CostoTotalPivote;
            } else {
                valorMinimo = CostoTotal;
            }
            OrdenPivote = OrdenPivote + 1;
            ReordenPivote = ReordenPivote - 1;

            CostoTotal = CostoTotalPivote;
            System.out.println("EL COSTO ES: " + CostoTotal + " CON ORDEN IGUAL A: " + OrdenPivote + " Y REORDEN IGUAL A: " + ReordenPivote);
            //  System.out.println("EL COSTO TOTAL ES" + CostoTotal);
            CostoTotalPivote = optimizacion.costoTotal(OrdenPivote, ReordenPivote, 12);
            // System.out.println( "EL COSTO ES: " + CostoTotalPivote + " CON ORDEN IGUAL A: " + OrdenPivote + " Y REORDEN IGUAL A: " + ReordenPivote);
            //  System.out.println("EL COSTO PIVOTE ES" + CostoTotalPivote);
        }
        System.out.println("######################################");
        System.out.println("EL COSTO MAS OPTIMO ES: " + valorMinimo + " CON ORDEN IGUAL A : " + OrdenPivote + " Y REORDEN IGUAL A : " + ReordenPivote);

    }
}
