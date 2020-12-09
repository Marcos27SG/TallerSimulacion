/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MARCOS
 */
public class SegundoInventario {
    // q = cantidad ordenada
    // R = nivel de reorden
    // N = dias de simulacion
    public double costoTotal (int q, int R ,int N){
         Demanda demanda = new Demanda();
         TiempoEntrega tiempoDeEntrega = new TiempoEntrega();
        double inventarioInicial[];
        inventarioInicial = new double[N+1];
        
        double inventarioFinal[];
        inventarioFinal = new double[N];
        
        double promedio[];
        promedio = new double[N];
         
        double inversionInicial = 150 ;
        
        inventarioInicial[0] = inversionInicial ;
        
        
        double costoTotal = 0;
        double banderaUno = 0 ; // mes en el cual llega el pedido 
        double banderaDos = 0; //pedido en curso
        
        double pedido = 0 ; //cantidad de pedidos
        double faltante = 0 ; //cantidad de faltantes
        
   
        
        for (int mes = 0; mes < N; mes++) {
             System.out.println("######################################");
            System.out.println("Mes:" + mes);
            System.out.println("Unidades en el inventario inicial:" + inventarioInicial[mes] );
            //paso en el que se aumenta el pedido al mes
           if(mes == banderaUno && banderaDos == 1 ){
               inventarioInicial [mes] = inventarioInicial[mes] + q ;
               System.out.println("Este Mes llegaron: " + q + " unidades");
               System.out.println("Unidades en el inventario depues de la llegada de unidades:" + inventarioInicial[mes] );
               banderaDos = 0 ;
           }
            //demanda del mes
                double aux = demanda.calcular(mes);
                 System.out.println("La demanda del Mes es de:" + aux);
                inventarioFinal[mes] = inventarioInicial[mes] - aux; 
                inventarioInicial[mes+1] = inventarioFinal[mes] ;
                
                
                //cuando el inventario final se queda vacio
                if (inventarioFinal[mes] < 0){
                    faltante = faltante + inventarioFinal[mes] ;
                    
                    inventarioInicial[mes+1] = inventarioFinal[mes] ;
                    promedio[mes] = inventarioInicial[mes]/2*inventarioInicial[mes]/aux;
                    inventarioFinal[mes] = 0 ;
                    System.out.println("Unidades en el inventario final: " + inventarioFinal[mes] );
                }else{
                    promedio[mes] = (inventarioInicial[mes] + inventarioFinal[mes])/2;
                    System.out.println("Unidades en el inventario final: " + inventarioFinal[mes] );
                   
                }
                //hacer pedido
                if(inventarioInicial[mes] < R && banderaDos == 0){
                    
                    banderaUno = mes + tiempoDeEntrega.calcular() ;
                    pedido = pedido + 1 ;
                    banderaDos = 1 ;
                    System.out.println("Se realizo un reorden llegara en el Mes: " + banderaUno );
                }
                
            }
        
        int total = 0;
        //total pedidos
        for (int contador = 0; contador < promedio.length; contador++) {
            total += promedio[contador];
            
        }
        double ordenar = 100*pedido ;
        //costos
        System.out.println("El COSTO DE ORDENARMIENTO ES DE: " + ordenar + "Bs");
        double inventario = total*20/N;
        System.out.println("El COSTO DEL INVENTARIO ES DE: " + inventario + "Bs");
        double falto = 50*faltante ;
        System.out.println("El COSTO DEL FALTANTE ES DE: " + falto + "Bs");
        costoTotal = ordenar + inventario + falto;
        return costoTotal ;
                
        
    }
    

    
  public static void main(String[] args) {
      Inventario inventario = new Inventario();
      Double res = inventario.costoTotal(200, 100, 12);
          System.out.println("El COSTO TOTAL ES DE " + res + "Bs");
          
    
  }
}
