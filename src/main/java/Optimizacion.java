
public class Optimizacion {
    // q = cantidad ordenada
    // R = nivel de reorden
    // N = dias de simulacion

    public double costoTotal(int q, int R, int N) {
        Demanda demanda = new Demanda();
        TiempoEntrega tiempoDeEntrega = new TiempoEntrega();
        double inventarioInicial[];
        inventarioInicial = new double[N + 1];

        double inventarioFinal[];
        inventarioFinal = new double[N];

        double promedio[];
        promedio = new double[N];

        double inversionInicial = 150;

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
        double ordenar = 100 * pedido;
        //costos
        // System.out.println("El COSTO DE ORDENARMIENTO ES DE: " + ordenar + "Bs");
        double inventario = total * 20 / N;
        // System.out.println("El COSTO DEL INVENTARIO ES DE: " + inventario + "Bs");
        double falto = 50 * faltante * (-1);
        // System.out.println("El COSTO DEL FALTANTE ES DE: " + falto + "Bs");
        costoTotal = ordenar + inventario + falto;
        return costoTotal;

    }

    public static void main(String[] args) {
        Optimizacion optimizacion = new Optimizacion();

        int posibleOrden = 0;
        int posibleReorden = 0;
        double posibleTotal = 20000;
        for (int orden = 50; orden < 200; orden = orden + 1) {
            for (int reorden = 50; reorden < 200; reorden = reorden + 1) {
                double res = optimizacion.costoTotal(orden, reorden, 12);
                if (res < posibleTotal) {
                    posibleTotal = res;
                    posibleReorden = reorden;
                    posibleOrden = orden;

                }

                System.out.println("EL COSTO ES: " + res + " CON ORDEN IGUAL A: " + orden + " Y REORDEN IGUAL A: " + reorden);

            }
        }

        System.out.println("######################################");
        System.out.println("EL COSTO OPTIMO ES: " + posibleTotal + " CON ORDEN IGUAL A: " + posibleOrden + " Y REORDEN IGUAL A: " + posibleReorden);

    }
}
