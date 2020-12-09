/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList ; 
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(380, 380, 380))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
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
                        .addComponent(Atras))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resultadoInventario)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(resultadoOrden)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(esteEsResultadoOrdenar))
                            .addComponent(resultadoFaltante)
                            .addComponent(resultadoTotal))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(jLabel8)
                    .addComponent(Ordentxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IniciarSimulacion))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CostoFaltantetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(Reordentxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultadoOrden)
                    .addComponent(esteEsResultadoOrdenar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultadoInventario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultadoFaltante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultadoTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(Atras)
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
      simulacion.costoTotal(orden, reorden, meses, unidadesIniciales, costoFaltante, costoOrden, costoInventario, simulacion) ;
       mostrar();
       resultadoOrden.setText("Costo de Ordenar: " + simulacion.ordenarResultado);
       resultadoInventario.setText("Costo de llevar Inventario: " + simulacion.InventarioResultado);
       resultadoFaltante.setText("Costo de Faltante: " + simulacion.faltoResultado);
       resultadoTotal.setText("Costo Total: " + simulacion.costoTotal);
        //new ReporteSinEspera().setVisible(true);
       // this.setVisible(false);
        
    }//GEN-LAST:event_IniciarSimulacionActionPerformed
   
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
    public void costoTotal (int q, int R ,int N , int unidadesIniciales , int costoFaltante , int costoOrden , int CostoInventario,SimulacionSinEspera simulaciond){
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
                    
                    inventarioInicial[mes+1] = inventarioFinal[mes] ;
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
                     ObjetoReporteSinEspera reporte = new ObjetoReporteSinEspera(mes+1+"" , inventarioInicial[mes]+"" , aux+"" , inventarioFinal[mes]+"" ,faltante+"" , orden+"");
//                    System.out.println("Se realizo un reorden llegara en el Mes: " + banderaUno );
                    lista.add(reporte);
                }
                
                ObjetoReporteSinEspera reporte = new ObjetoReporteSinEspera(mes+1+"" , inventarioInicial[mes]+"" , aux+"" , inventarioFinal[mes]+"" ,faltante+"" , "");
                lista.add(reporte);
                
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
    private javax.swing.JLabel esteEsResultadoOrdenar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel resultadoFaltante;
    private javax.swing.JLabel resultadoInventario;
    private javax.swing.JLabel resultadoOrden;
    private javax.swing.JLabel resultadoTotal;
    // End of variables declaration//GEN-END:variables
}
