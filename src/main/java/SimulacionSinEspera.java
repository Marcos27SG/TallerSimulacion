/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList ; 
import javafx.application.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.chart.ChartFrame;

/**
 *
 * @author MARCOS
 */
public class SimulacionSinEspera extends javax.swing.JFrame {

    /**
     * Creates new form SimulacionSinEspera
     */
    public SimulacionSinEspera() {
         
        initComponents();
         this.setLocationRelativeTo(null);
         botonOptimizacion.setEnabled(false);
         botonGrafico.setEnabled(false);
    }
        
    public static int costoInventario ; 
    public static int costoOrden ; 
    public static int costoFaltante ; 
    public static int unidadesIniciales ; 
    public static int orden ; 
     public static int reorden ;
       public static int meses ; 
       public static ArrayList res ; 
       public static double resultadoOrdenInt ; 
       public static double restultadoInventarioInt ; 
       public static double resultadoFaltanteInt ; 
       public static double restultadoTotalInt ; 
      double costoTotal = 0;
       double ordenarResultado = 0;
        double faltoResultado = 0;
        double InventarioResultado = 0;
      double  optimizacionValorMinimo = 0 ; 
      double optimizacionOrden = 0 ; 
       double optimizacionReorden = 0 ; 
    public static ArrayList<ObjetoReporteSinEspera> lista = new ArrayList<ObjetoReporteSinEspera>();
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        IniciarSimulacion = new javax.swing.JButton();
        CostoInventariotxt = new javax.swing.JTextField();
        CostoOrdentxt = new javax.swing.JTextField();
        CostoFaltantetxt = new javax.swing.JTextField();
        UnidadesInicialestxt = new javax.swing.JTextField();
        Ordentxt = new javax.swing.JTextField();
        Reordentxt = new javax.swing.JTextField();
        Mesestxt = new javax.swing.JTextField();
        Atras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        resultadoOrden = new javax.swing.JLabel();
        resultadoInventario = new javax.swing.JLabel();
        resultadoFaltante = new javax.swing.JLabel();
        resultadoTotal = new javax.swing.JLabel();
        esteEsResultadoOrdenar = new javax.swing.JLabel();
        botonOptimizacion = new javax.swing.JButton();
        ordenOptimotxt = new javax.swing.JLabel();
        reordenOptimotxt = new javax.swing.JLabel();
        costoOptimotxt = new javax.swing.JLabel();
        botonGrafico = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        interpretacion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("INVENTARIO");

        jLabel2.setText("Costo de Inventario");

        jLabel3.setText("Costo de Orden ");

        jLabel4.setText("Costo de Faltante   ");

        jLabel6.setText("Unidades Iniciales");

        jLabel7.setText("Orden");

        jLabel8.setText("Reorden");

        jLabel9.setText("Meses a Simular");

        IniciarSimulacion.setText("INICIAR SIMULACION");
        IniciarSimulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarSimulacionActionPerformed(evt);
            }
        });

        UnidadesInicialestxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnidadesInicialestxtActionPerformed(evt);
            }
        });

        Atras.setText("Atras");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mes", "I. Inicial", "Demanda", "I. Final", "Faltante", "Orden"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        resultadoOrden.setText("Costo de Ordenar:");

        resultadoInventario.setText("Costo de llevar Inventario:");

        resultadoFaltante.setText("Costo de Faltante:");

        resultadoTotal.setText("Costo Total:");

        botonOptimizacion.setText("Optimizacion");
        botonOptimizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOptimizacionActionPerformed(evt);
            }
        });

        ordenOptimotxt.setText("Orden Optimo");

        reordenOptimotxt.setText("Reorden Optimo: ");

        costoOptimotxt.setText("Costo Optimo: ");

        botonGrafico.setText("Ver Grafico");
        botonGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGraficoActionPerformed(evt);
            }
        });

        interpretacion.setColumns(20);
        interpretacion.setRows(5);
        jScrollPane2.setViewportView(interpretacion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(380, 380, 380))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reordenOptimotxt)
                            .addComponent(costoOptimotxt)
                            .addComponent(ordenOptimotxt))
                        .addGap(250, 250, 250))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(resultadoInventario)
                                    .addComponent(resultadoFaltante)
                                    .addComponent(resultadoTotal)
                                    .addComponent(resultadoOrden)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(30, 30, 30)
                                        .addComponent(CostoFaltantetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(CostoOrdentxt, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(29, 29, 29)
                                            .addComponent(CostoInventariotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Reordentxt, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Ordentxt, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(IniciarSimulacion))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(UnidadesInicialestxt, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(38, 38, 38)
                                            .addComponent(jLabel9)
                                            .addGap(42, 42, 42)
                                            .addComponent(Mesestxt, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Atras)
                                .addGap(40, 40, 40)
                                .addComponent(botonGrafico)
                                .addGap(18, 18, 18)
                                .addComponent(botonOptimizacion))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(esteEsResultadoOrdenar)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CostoInventariotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(UnidadesInicialestxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(Mesestxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CostoOrdentxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ordentxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IniciarSimulacion)
                    .addComponent(jLabel7))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CostoFaltantetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reordentxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(esteEsResultadoOrdenar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resultadoOrden)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultadoInventario)
                    .addComponent(ordenOptimotxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultadoFaltante)
                    .addComponent(reordenOptimotxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costoOptimotxt)
                    .addComponent(resultadoTotal))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Atras)
                    .addComponent(botonGrafico)
                    .addComponent(botonOptimizacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UnidadesInicialestxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnidadesInicialestxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UnidadesInicialestxtActionPerformed

    private void IniciarSimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarSimulacionActionPerformed
        lista.clear();
         costoInventario = Integer.parseInt(CostoInventariotxt.getText());
         costoOrden = Integer.parseInt(CostoOrdentxt.getText());
         costoFaltante = Integer.parseInt(CostoFaltantetxt.getText());
         unidadesIniciales = Integer.parseInt(UnidadesInicialestxt.getText());
         orden = Integer.parseInt(Ordentxt.getText());
         reorden = Integer.parseInt(Reordentxt.getText());
         meses = Integer.parseInt(Mesestxt.getText());
       
       //resultadoOrden.setText("Costo de Ordenar fdsafdsa:" );
       //simulacion.esteEsResultadoOrdenar.setText("Costo de Ordenar fdsafdsa:" );
       SimulacionSinEspera simulacion = new SimulacionSinEspera(); 
      simulacion.costoTotal(orden, reorden, meses, unidadesIniciales, costoFaltante, costoOrden, costoInventario) ;
       mostrar();
       resultadoOrden.setText("Costo de Ordenar: " + simulacion.ordenarResultado);
       resultadoInventario.setText("Costo de llevar Inventario: " + simulacion.InventarioResultado);
       resultadoFaltante.setText("Costo de Faltante: " + simulacion.faltoResultado);
       resultadoTotal.setText("Costo Total: " + simulacion.costoTotal);
        //new ReporteSinEspera().setVisible(true);
       // this.setVisible(false);
        botonOptimizacion.setEnabled(true);
         botonGrafico.setEnabled(true);
         interpretacion.setText("");
         interpretacion();
    }//GEN-LAST:event_IniciarSimulacionActionPerformed
    public void interpretacion(){
     for (int i = 0 ; i < lista.size() ; i++){
           interpretacion.append("######################" + "\n");  
           interpretacion.append("MES NRO:" + lista.get(i).getMes()+ "\n");  
           interpretacion.append("La cantidad de unidades en el inventario inicial es: " +   lista.get(i).getInventarioInicial() + " Unidades\n" );  
           interpretacion.append("En este mes realizan un pedido de: " + lista.get(i).getDemanda() + " Unidades\n"  );  
           interpretacion.append("La cantidad de unidades en el inventario final es: " +   lista.get(i).getInventarioFinal() + " Unidades\n");  
          
           interpretacion.append("Existe un total de: " + lista.get(i).getFaltante()+ " Unidades Faltantes\n");
           
          
          
           if (lista.get(i).getOrden() == ""){
           }else{
                 interpretacion.append("Este mes se realiza un pedido\n");
           }
           
         
            
             
           
           // lista.get(i).getOrden()
            
            
            
        }
    
    }
    public void mostrar(){
        System.out.print(lista.size());
        String matris [][] = new String[lista.size()][6];
        
        for (int i = 0 ; i < lista.size() ; i++){
            matris[i][0] = lista.get(i).getMes();
            matris[i][1] = lista.get(i).getInventarioInicial();
            matris[i][2] = lista.get(i).getDemanda();
            matris[i][3] = lista.get(i).getInventarioFinal();
            matris[i][4] = lista.get(i).getFaltante();
            matris[i][5] = lista.get(i).getOrden();
            
            
            
        }
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
    matris,
    new String [] {
        "Mes", "I. Inicial", "Demanda", "I. Final", "Faltante", "Orden"
    }
));
    
    }
  
    public void costoTotal (int q, int R ,int N , int unidadesIniciales , int costoFaltante , int costoOrden , int CostoInventario){
        //SimulacionSinEspera simulacion = new SimulacionSinEspera();
         //ArrayList<ObjetoReporteSinEspera> lista = new ArrayList<ObjetoReporteSinEspera>();
         Demanda demanda = new Demanda();
         TiempoEntrega tiempoDeEntrega = new TiempoEntrega();
        double inventarioInicial[];
        inventarioInicial = new double[N+1];
        
        double inventarioFinal[];
        inventarioFinal = new double[N];
        
        double promedio[];
        promedio = new double[N];
         
        double inversionInicial = unidadesIniciales ;
        
        inventarioInicial[0] = inversionInicial ;
        
        
        //double costoTotal = 0;
        double banderaUno = 0 ; // mes en el cual llega el pedido 
        double banderaDos = 0; //pedido en curso
        
        double pedido = 0 ; //cantidad de pedidos
        double faltante = 0 ; //cantidad de faltantes
        double banderaFaltante = 0 ; //variable para la grafica
        int orden = 0 ;
        
        for (int mes = 0; mes < N; mes++) {
 //            System.out.println("######################################");
 //           System.out.println("Mes:" + mes);
 //           System.out.println("Unidades en el inventario inicial:" + inventarioInicial[mes] );
            //paso en el que se aumenta el pedido al mes
           if(mes == banderaUno && banderaDos == 1 ){
               inventarioInicial [mes] = inventarioInicial[mes] + q ;
   //            System.out.println("Este Mes llegaron: " + q + " unidades");
  //             System.out.println("Unidades en el inventario depues de la llegada de unidades:" + inventarioInicial[mes] );
               banderaDos = 0 ;
           }
            //demanda del mes
                double aux = demanda.calcular(mes);
 //                System.out.println("La demanda del Mes es de:" + aux);
                inventarioFinal[mes] = inventarioInicial[mes] - aux; 
                inventarioInicial[mes+1] = inventarioFinal[mes] ;
                
                
                //cuando el inventario final se queda vacio
                if (inventarioFinal[mes] < 0){
                    faltante = faltante + inventarioFinal[mes] ;
                    banderaFaltante = aux - inventarioInicial[mes] ;
                   // inventarioInicial[mes+1] = inventarioFinal[mes] ;
                   //Que el inventario inicial salga de 0 si es que se consume todas las unidades 
                   inventarioInicial[mes+1] = 0 ;
                    promedio[mes] = inventarioInicial[mes]/2*inventarioInicial[mes]/aux;
                    inventarioFinal[mes] = 0 ;
 //                   System.out.println("Unidades en el inventario final: " + inventarioFinal[mes] );
                }else{
                    promedio[mes] = (inventarioInicial[mes] + inventarioFinal[mes])/2;
 //                   System.out.println("Unidades en el inventario final: " + inventarioFinal[mes] );
                   
                }
                //hacer pedido
                if(inventarioInicial[mes] < R && banderaDos == 0){
                    orden = orden + 1 ; 
                    banderaUno = mes + tiempoDeEntrega.calcular() ;
                    pedido = pedido + 1 ;
                    banderaDos = 1 ;
                     ObjetoReporteSinEspera reporte = new ObjetoReporteSinEspera(mes+1+"" , inventarioInicial[mes]+"" , aux+"" , inventarioFinal[mes]+"" ,banderaFaltante+"" , orden+"");
//                    System.out.println("Se realizo un reorden llegara en el Mes: " + banderaUno );
                    lista.add(reporte);
                    banderaFaltante = 0; 
                }else{
                ObjetoReporteSinEspera reporte = new ObjetoReporteSinEspera(mes+1+"" , inventarioInicial[mes]+"" , aux+"" , inventarioFinal[mes]+"" ,banderaFaltante+"" , "");
                lista.add(reporte);
                banderaFaltante = 0 ; 
                }
                
                
                
            }
        
        int total = 0;
        //total pedidos
        for (int contador = 0; contador < promedio.length; contador++) {
            total += promedio[contador];
            
        }
         ordenarResultado = costoOrden*pedido ;
        //costos
       // System.out.println("El COSTO DE ORDENARMIENTO ES DE: " + ordenar + "Bs");
         InventarioResultado = total*costoInventario/N;
       // System.out.println("El COSTO DEL INVENTARIO ES DE: " + inventario + "Bs");
        //double falto = costoFaltante*faltante *(-1);
         faltoResultado = costoFaltante*faltante *(-1);
       // System.out.println("El COSTO DEL FALTANTE ES DE: " + falto + "Bs");
        costoTotal = ordenarResultado + InventarioResultado + faltoResultado;
        
        //return lista ;
                
        
    }
    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        new Inicio().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AtrasActionPerformed

    private void botonOptimizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOptimizacionActionPerformed
        SimulacionSinEspera simu = new SimulacionSinEspera (); 
        OptimizacionHooke optimizacion = new OptimizacionHooke();

        int OrdenPivote = orden - 50;
        int ReordenPivote = reorden + 50;

        //  int OrdenOptimo = 0 ; 
        //  int ReordenOptimo = 0 ;
        int margen = 100;
        double valorMinimo = 0;
        double CostoTotal = optimizacion.Optimi(orden, reorden, meses, unidadesIniciales, costoFaltante, costoOrden, costoInventario);

        double CostoTotalPivote = optimizacion.Optimi(OrdenPivote+ 1, ReordenPivote - 1, meses, unidadesIniciales, costoFaltante, costoOrden, costoInventario);

        while (Math.abs(CostoTotal - CostoTotalPivote) > margen) {
            if (CostoTotal > CostoTotalPivote) {
                valorMinimo = CostoTotalPivote;
            } else {
                valorMinimo = CostoTotal;
            }
            OrdenPivote = OrdenPivote + 1;
            ReordenPivote = ReordenPivote - 1;

            CostoTotal = CostoTotalPivote;
            //System.out.println("EL COSTO ES: " + CostoTotal + " CON ORDEN IGUAL A: " + OrdenPivote + " Y REORDEN IGUAL A: " + ReordenPivote);
            //  System.out.println("EL COSTO TOTAL ES" + CostoTotal);
            CostoTotalPivote = optimizacion.Optimi(orden, reorden, meses, unidadesIniciales, costoFaltante, costoOrden, costoInventario);
            // System.out.println( "EL COSTO ES: " + CostoTotalPivote + " CON ORDEN IGUAL A: " + OrdenPivote + " Y REORDEN IGUAL A: " + ReordenPivote);
            //  System.out.println("EL COSTO PIVOTE ES" + CostoTotalPivote);
        }
       // System.out.println("######################################");
       optimizacionValorMinimo = valorMinimo ; 
       optimizacionOrden = OrdenPivote ; 
       optimizacionReorden = ReordenPivote ; 
       System.out.println("EL COSTO MAS OPTIMO ES: " + valorMinimo + " CON ORDEN IGUAL A : " + OrdenPivote + " Y REORDEN IGUAL A : " + ReordenPivote);
       
       
     ordenOptimotxt.setText("Orden Optimo: " +  optimizacionOrden);
       reordenOptimotxt.setText("Reorden Optimo: " + optimizacionReorden);
       costoOptimotxt.setText("Costo Optimo: " + optimizacionValorMinimo);

        
        
    }//GEN-LAST:event_botonOptimizacionActionPerformed

    private void botonGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGraficoActionPerformed
     
       DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0 ; i < lista.size() ; i++){
            dataset.setValue(new Double(lista.get(i).getInventarioInicial()), "Unidades", "Mes" + (i+1));
        }
           for (int i = 0 ; i < lista.size() ; i++){
            dataset.setValue(new Double(reorden), "Reorden", "Mes" + (i+1));
        }
       
        JFreeChart chart = ChartFactory.createLineChart("INVENTARIO SIN ESPERA", "Mes", "Unidades", dataset, PlotOrientation.VERTICAL, false, true, true);
//        BarRenderer renderer = null ; 
//        CategoryPlot plot = null ; 
//        renderer = new BarRenderer();
        ChartFrame frame =  new ChartFrame("INVENTARIO SIN ESPERA", chart );
        //CategoryPlot p = chart.getCategoryPlot();
          
        frame.setVisible(true);
        frame.setSize (774,645);
    }//GEN-LAST:event_botonGraficoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SimulacionSinEspera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimulacionSinEspera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimulacionSinEspera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimulacionSinEspera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimulacionSinEspera().setVisible(true);
            }
        });
    }
     public double corrida(int q, int R, int N) {
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JTextField CostoFaltantetxt;
    private javax.swing.JTextField CostoInventariotxt;
    private javax.swing.JTextField CostoOrdentxt;
    private javax.swing.JButton IniciarSimulacion;
    private javax.swing.JTextField Mesestxt;
    private javax.swing.JTextField Ordentxt;
    private javax.swing.JTextField Reordentxt;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField UnidadesInicialestxt;
    private javax.swing.JButton botonGrafico;
    private javax.swing.JButton botonOptimizacion;
    private javax.swing.JLabel costoOptimotxt;
    private javax.swing.JLabel esteEsResultadoOrdenar;
    private javax.swing.JTextArea interpretacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel ordenOptimotxt;
    private javax.swing.JLabel reordenOptimotxt;
    private javax.swing.JLabel resultadoFaltante;
    private javax.swing.JLabel resultadoInventario;
    private javax.swing.JLabel resultadoOrden;
    private javax.swing.JLabel resultadoTotal;
    // End of variables declaration//GEN-END:variables
}
