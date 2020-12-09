
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MARCOS
 */
public class ReporteSinEspera extends javax.swing.JFrame {

    /**
     * Creates new form ReporteSinEspera
     */
     //ArrayList<ObjetoReporteSinEspera> lista = new ArrayList<ObjetoReporteSinEspera>();
    public ReporteSinEspera() {
        
        SimulacionSinEspera simu = new SimulacionSinEspera();
        
         ArrayList hola =       simu.res ;
        
        initComponents();
        
         // mostrar();
        
       // ReporteSinEspera reporte = new ReporteSinEspera() ; 
      //  reporte.costoTotal() ; 
        
    }
//    public void mostrar {
//    int matris[][] = new int [hola.size][];
//}
    
    
//    public double costoTotal (){
//        
//        SimulacionSinEspera simu = new SimulacionSinEspera();
//        int N = simu.meses ;
//        System.out.println(N);
//        int q = simu.orden ; 
//        System.out.println(q);
//        int R = simu.reorden ; 
//        System.out.println(R);
//         Demanda demanda = new Demanda();
//         TiempoEntrega tiempoDeEntrega = new TiempoEntrega();
//        double inventarioInicial[];
//        inventarioInicial = new double[N+1];
//        
//        double inventarioFinal[];
//        inventarioFinal = new double[N];
//        
//        double promedio[];
//        promedio = new double[N];
//         
//        //double inversionInicial = 150 ;
//        double inversionInicial = simu.unidadesIniciales ;
//        System.out.println(inversionInicial);
//        inventarioInicial[0] = inversionInicial ;
//        
//        
//        double costoTotal = 0;
//        double banderaUno = 0 ; // mes en el cual llega el pedido 
//        double banderaDos = 0; //pedido en curso
//        
//        double pedido = 0 ; //cantidad de pedidos
//        double faltante = 0 ; //cantidad de faltantes
//        
//   
//        
//        for (int mes = 0; mes < N; mes++) {
//             System.out.println("######################################");
//            System.out.println("Mes:" + mes);
//            System.out.println("Unidades en el inventario inicial:" + inventarioInicial[mes] );
//            //paso en el que se aumenta el pedido al mes
//           if(mes == banderaUno && banderaDos == 1 ){
//               inventarioInicial [mes] = inventarioInicial[mes] + q ;
//               System.out.println("Este Mes llegaron: " + q + " unidades");
//               System.out.println("Unidades en el inventario depues de la llegada de unidades:" + inventarioInicial[mes] );
//               banderaDos = 0 ;
//           }
//            //demanda del mes
//                double aux = demanda.calcular(mes);
//                 System.out.println("La demanda del Mes es de:" + aux);
//                inventarioFinal[mes] = inventarioInicial[mes] - aux; 
//                inventarioInicial[mes+1] = inventarioFinal[mes] ;
//                
//                
//                //cuando el inventario final se queda vacio
//                if (inventarioFinal[mes] < 0){
//                    faltante = faltante + inventarioFinal[mes] ;
//                    
//                    inventarioInicial[mes+1] = inventarioFinal[mes] ;
//                    promedio[mes] = inventarioInicial[mes]/2*inventarioInicial[mes]/aux;
//                    inventarioFinal[mes] = 0 ;
//                    System.out.println("Unidades en el inventario final: " + inventarioFinal[mes] );
//                }else{
//                    promedio[mes] = (inventarioInicial[mes] + inventarioFinal[mes])/2;
//                    System.out.println("Unidades en el inventario final: " + inventarioFinal[mes] );
//                   
//                }
//                //hacer pedido
//                if(inventarioInicial[mes] < R && banderaDos == 0){
//                    
//                    banderaUno = mes + tiempoDeEntrega.calcular() ;
//                    pedido = pedido + 1 ;
//                    banderaDos = 1 ;
//                    System.out.println("Se realizo un reorden llegara en el Mes: " + banderaUno );
//                }
//                
//            }
//        
//        int total = 0;
//        //total pedidos
//        for (int contador = 0; contador < promedio.length; contador++) {
//            total += promedio[contador];
//            
//        }
//        double ordenar = simu.costoOrden*pedido ;
//        System.out.println(simu.costoOrden);
//        //costos
//        System.out.println("El COSTO DE ORDENARMIENTO ES DE: " + ordenar + "Bs");
//        double inventario = total*(simu.costoInventario)/N;
//        System.out.println(simu.costoInventario);
//        System.out.println("El COSTO DEL INVENTARIO ES DE: " + inventario + "Bs");
//        double falto = (simu.costoFaltante)*faltante ;
//        System.out.println(simu.costoFaltante);
//        System.out.println("El COSTO DEL FALTANTE ES DE: " + falto + "Bs");
//        costoTotal = ordenar + inventario + falto;
//        return costoTotal ;
//                
//        
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        NuevaSimulacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("REPORTE SIMULACION");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        NuevaSimulacion.setText("Nueva Simulacion");
        NuevaSimulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaSimulacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(NuevaSimulacion)
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addGap(89, 89, 89)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(NuevaSimulacion)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevaSimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaSimulacionActionPerformed
        new SimulacionSinEspera().setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_NuevaSimulacionActionPerformed

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
            java.util.logging.Logger.getLogger(ReporteSinEspera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteSinEspera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteSinEspera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteSinEspera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteSinEspera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NuevaSimulacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
