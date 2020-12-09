
//import static SimulacionSinEspera.costoInventario;
//import static SimulacionSinEspera.lista;

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
       public double Optimi(int q, int R, int N , int unidadesIniciales , int costoFaltante , int costoOrden , int CostoInventario) {
        Demanda demanda = new Demanda();
        TiempoEntrega tiempoDeEntrega = new TiempoEntrega();
        double inventarioInicial[];
        inventarioInicial = new double[N + 1];

        double inventarioFinal[];
        inventarioFinal = new double[N];

        double promedio[];
        promedio = new double[N];

        double inversionInicial = unidadesIniciales;

        inventarioInicial[0] = inversionInicial;

        double costoTotal = 0;
        double banderaUno = 0; // mes en el cual llega el pedido 
        double banderaDos = 0; //pedido en curso

        double pedido = 0; //cantidad de pedidos
        double faltante = 0; //cantidad de faltantes

        for (int mes = 0; mes < N; mes++) {

            if (mes == banderaUno && banderaDos == 1) {
                inventarioInicial[mes] = inventarioInicial[mes] + q;

                banderaDos = 0;
            }

            double aux = demanda.calcular(mes);

            inventarioFinal[mes] = inventarioInicial[mes] - aux;
            inventarioInicial[mes + 1] = inventarioFinal[mes];

            if (inventarioFinal[mes] < 0) {
                faltante = faltante + inventarioFinal[mes];

                inventarioInicial[mes + 1] = inventarioFinal[mes];
                promedio[mes] = inventarioInicial[mes] / 2 * inventarioInicial[mes] / aux;
                inventarioFinal[mes] = 0;

            } else {
                promedio[mes] = (inventarioInicial[mes] + inventarioFinal[mes]) / 2;

            }

            if (inventarioInicial[mes] < R && banderaDos == 0) {

                banderaUno = mes + tiempoDeEntrega.calcular();
                pedido = pedido + 1;
                banderaDos = 1;

            }

        }

        int total = 0;
        //total pedidos
        for (int contador = 0; contador < promedio.length; contador++) {
            total += promedio[contador];

        }
        double ordenar = costoOrden * pedido;
        //costos
        // System.out.println("El COSTO DE ORDENARMIENTO ES DE: " + ordenar + "Bs");
        double inventario = total * CostoInventario / N;
        // System.out.println("El COSTO DEL INVENTARIO ES DE: " + inventario + "Bs");
        double falto = costoFaltante * faltante * (-1);
        // System.out.println("El COSTO DEL FALTANTE ES DE: " + falto + "Bs");
        costoTotal = ordenar + inventario + falto;
        return costoTotal;

    }
}
