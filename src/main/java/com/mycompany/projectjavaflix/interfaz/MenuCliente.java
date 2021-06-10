package com.mycompany.projectjavaflix.interfaz;
import com.mycompany.projectjavaflix.negocio.Cliente;

/**
 * Pantalla principal donde se muestan las opciones que puede realizar un usuario en la aplicacion
 * @author PRACTICA DE POO 
 */
public class MenuCliente extends javax.swing.JFrame {
    //Cliente que inicia sesion
    Cliente c;
    
   /**
    * constructor sin argumentos
    */
    public MenuCliente() {
        initComponents();
        //Centrar ventana
        this.setLocationRelativeTo(null);
    }

    /**
     * constructor con argumentos
     * @param c cliente que ha accedido a la aplicacion
     */
    public MenuCliente(Cliente c) {
        this.c = c;
        initComponents();
        //Centrar ventana
        this.setLocationRelativeTo(null);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BotonPago = new javax.swing.JButton();
        BotonBusqueda = new javax.swing.JButton();
        BotonListaSeguimiento = new javax.swing.JButton();
        BotonCalificacion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú de clientes - JavaPop");

        BotonVolver.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BotonVolver.setText("Volver");
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });

        BotonPago.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BotonPago.setText("Pago de suscripción");
        BotonPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPagoActionPerformed(evt);
            }
        });

        BotonBusqueda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BotonBusqueda.setText("Busqueda de contenido");
        BotonBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBusquedaActionPerformed(evt);
            }
        });

        BotonListaSeguimiento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BotonListaSeguimiento.setText("Lista de seguimiento");
        BotonListaSeguimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonListaSeguimientoActionPerformed(evt);
            }
        });

        BotonCalificacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BotonCalificacion.setText("Calificación de contenido");
        BotonCalificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCalificacionActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoJavaFlix2.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonVolver)
                    .addComponent(jLabel2))
                .addGap(99, 99, 99))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonListaSeguimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonCalificacion))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(BotonPago)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonBusqueda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonCalificacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonListaSeguimiento)
                .addGap(26, 26, 26)
                .addComponent(BotonVolver)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * boton que nos manda a la pantalla principal de la aplicacion
     * @param evt 
     */
    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        this.dispose();
        Acceso a = new Acceso();
        a.setVisible(true);
    }//GEN-LAST:event_BotonVolverActionPerformed

    /**
     * boton que nos manda a la pantalla para realizar el pago de la suscripcion de la aplicacion
     * @param evt 
     */
    private void BotonPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPagoActionPerformed
        this.dispose();
        Suscripcion n= new Suscripcion(this.c);
        n.setVisible(true);
    }//GEN-LAST:event_BotonPagoActionPerformed

    /**
     * boton que nos manda a la pantalla para realizar la busqueda de contenido de la aplicacion
     * @param evt 
     */
    private void BotonBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBusquedaActionPerformed
        this.dispose();
        ConsultaProductos a= new ConsultaProductos(c);
        a.setVisible(true);
        
    }//GEN-LAST:event_BotonBusquedaActionPerformed
    
    /**
     * boton que nos manda a la pantalla para puntuar un contenido de la aplicacion
     * @param evt 
     */
    private void BotonCalificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCalificacionActionPerformed
        this.dispose();
        CalificacionContenido a = new CalificacionContenido(c);
        a.setVisible(true);
    }//GEN-LAST:event_BotonCalificacionActionPerformed

    /**
     * boton que nos manda a la pantalla para añadir un contenido de la aplicacion a nuestra lista de favoritos de series o peliculas
     * @param evt 
     */
    private void BotonListaSeguimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListaSeguimientoActionPerformed
        this.dispose();
        ListaPreferencias a = new ListaPreferencias(c);
        a.setVisible(true);
    }//GEN-LAST:event_BotonListaSeguimientoActionPerformed

    /**
     * 
     * @param args 
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
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBusqueda;
    private javax.swing.JButton BotonCalificacion;
    private javax.swing.JButton BotonListaSeguimiento;
    private javax.swing.JButton BotonPago;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
