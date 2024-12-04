package GUI;
import com.formdev.flatlaf.FlatDarkLaf;
import controlador.ctrl_compra;
import java.awt.Color;
import java.awt.Font;
import java.awt.Paint;
import java.util.List;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.ui.RectangleEdge;
public class Grafico_compra extends javax.swing.JFrame {
    public Grafico_compra() {
        // Aplica el tema oscuro de FlatLaf
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
        }
        initComponents();
        total_compras();
        actualizarGrafico();
        total_materiales();
        total_prove();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel_barra = new javax.swing.JPanel();
        panel_atras = new swing.PanelRound();
        atras = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panel_provedor = new swing.PanelRound();
        label_prove = new javax.swing.JLabel();
        panel_comparacion_compra = new swing.PanelRound();
        label_p = new javax.swing.JLabel();
        panel_grafico_c = new javax.swing.JPanel();
        btn_compras_r = new swing.PanelRound();
        label_compras = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_materiales = new swing.PanelRound();
        label_material = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_provedor = new swing.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        label_provedor = new javax.swing.JLabel();
        panel_grafico = new swing.PanelRound();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 600));
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(33, 37, 41));
        jPanel1.setMaximumSize(new java.awt.Dimension(1250, 750));
        jPanel1.setMinimumSize(new java.awt.Dimension(1250, 750));
        jPanel1.setPreferredSize(new java.awt.Dimension(1250, 750));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_barra.setBackground(new java.awt.Color(33, 37, 41));

        panel_atras.setBackground(new java.awt.Color(33, 37, 41));
        panel_atras.setPreferredSize(new java.awt.Dimension(70, 40));
        panel_atras.setRoundBottomLeft(100);
        panel_atras.setRoundBottomRight(100);
        panel_atras.setRoundTopLeft(100);
        panel_atras.setRoundTopRight(100);

        atras.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        atras.setForeground(new java.awt.Color(255, 255, 255));
        atras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        atras.setText(" ");
        atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atrasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                atrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                atrasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_atrasLayout = new javax.swing.GroupLayout(panel_atras);
        panel_atras.setLayout(panel_atrasLayout);
        panel_atrasLayout.setHorizontalGroup(
            panel_atrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(atras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        panel_atrasLayout.setVerticalGroup(
            panel_atrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(atras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(224, 224, 224));
        jLabel2.setText("Tendencia en Compras");

        panel_provedor.setBackground(new java.awt.Color(33, 37, 41));
        panel_provedor.setRoundBottomLeft(5);
        panel_provedor.setRoundBottomRight(5);
        panel_provedor.setRoundTopLeft(5);
        panel_provedor.setRoundTopRight(5);

        label_prove.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        label_prove.setForeground(new java.awt.Color(255, 255, 255));
        label_prove.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_prove.setText("COMPARACIÓN");
        label_prove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_prove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_proveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_proveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_proveMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_provedorLayout = new javax.swing.GroupLayout(panel_provedor);
        panel_provedor.setLayout(panel_provedorLayout);
        panel_provedorLayout.setHorizontalGroup(
            panel_provedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_prove, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panel_provedorLayout.setVerticalGroup(
            panel_provedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_prove, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panel_comparacion_compra.setBackground(new java.awt.Color(33, 37, 41));
        panel_comparacion_compra.setRoundBottomLeft(5);
        panel_comparacion_compra.setRoundBottomRight(5);
        panel_comparacion_compra.setRoundTopLeft(5);
        panel_comparacion_compra.setRoundTopRight(5);

        label_p.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        label_p.setForeground(new java.awt.Color(255, 255, 255));
        label_p.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_p.setText("PROVEEDOR ACTIVO");
        label_p.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_p.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_pMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_pMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_pMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_comparacion_compraLayout = new javax.swing.GroupLayout(panel_comparacion_compra);
        panel_comparacion_compra.setLayout(panel_comparacion_compraLayout);
        panel_comparacion_compraLayout.setHorizontalGroup(
            panel_comparacion_compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_comparacion_compraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_p))
        );
        panel_comparacion_compraLayout.setVerticalGroup(
            panel_comparacion_compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_p, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_barraLayout = new javax.swing.GroupLayout(panel_barra);
        panel_barra.setLayout(panel_barraLayout);
        panel_barraLayout.setHorizontalGroup(
            panel_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_barraLayout.createSequentialGroup()
                .addComponent(panel_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(431, 431, 431)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 322, Short.MAX_VALUE)
                .addComponent(panel_provedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(panel_comparacion_compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        panel_barraLayout.setVerticalGroup(
            panel_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_atras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_barraLayout.createSequentialGroup()
                .addGroup(panel_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_provedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_comparacion_compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(panel_barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 40));

        panel_grafico_c.setBackground(new java.awt.Color(51, 50, 55));

        javax.swing.GroupLayout panel_grafico_cLayout = new javax.swing.GroupLayout(panel_grafico_c);
        panel_grafico_c.setLayout(panel_grafico_cLayout);
        panel_grafico_cLayout.setHorizontalGroup(
            panel_grafico_cLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        panel_grafico_cLayout.setVerticalGroup(
            panel_grafico_cLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        jPanel1.add(panel_grafico_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 570, 490));

        btn_compras_r.setBackground(new java.awt.Color(74, 144, 226));
        btn_compras_r.setPreferredSize(new java.awt.Dimension(130, 70));
        btn_compras_r.setRoundBottomLeft(10);
        btn_compras_r.setRoundBottomRight(10);
        btn_compras_r.setRoundTopLeft(10);
        btn_compras_r.setRoundTopRight(10);

        label_compras.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label_compras.setForeground(new java.awt.Color(0, 0, 0));
        label_compras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_compras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tienda-online.png"))); // NOI18N
        label_compras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_compras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Compras");

        javax.swing.GroupLayout btn_compras_rLayout = new javax.swing.GroupLayout(btn_compras_r);
        btn_compras_r.setLayout(btn_compras_rLayout);
        btn_compras_rLayout.setHorizontalGroup(
            btn_compras_rLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
            .addComponent(label_compras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_compras_rLayout.setVerticalGroup(
            btn_compras_rLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_compras_rLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(label_compras, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
        );

        jPanel1.add(btn_compras_r, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        btn_materiales.setBackground(new java.awt.Color(33, 136, 56));
        btn_materiales.setPreferredSize(new java.awt.Dimension(130, 70));
        btn_materiales.setRoundBottomLeft(10);
        btn_materiales.setRoundBottomRight(10);
        btn_materiales.setRoundTopLeft(10);
        btn_materiales.setRoundTopRight(10);

        label_material.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label_material.setForeground(new java.awt.Color(0, 0, 0));
        label_material.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_material.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caja-de-reciclaje.png"))); // NOI18N
        label_material.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_material.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel3.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Materiales Usados");

        javax.swing.GroupLayout btn_materialesLayout = new javax.swing.GroupLayout(btn_materiales);
        btn_materiales.setLayout(btn_materialesLayout);
        btn_materialesLayout.setHorizontalGroup(
            btn_materialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_material, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addGroup(btn_materialesLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btn_materialesLayout.setVerticalGroup(
            btn_materialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_materialesLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(label_material, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
        );

        jPanel1.add(btn_materiales, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 150, -1));

        btn_provedor.setBackground(new java.awt.Color(200, 35, 51));
        btn_provedor.setRoundBottomLeft(10);
        btn_provedor.setRoundBottomRight(10);
        btn_provedor.setRoundTopLeft(10);
        btn_provedor.setRoundTopRight(10);

        jLabel4.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Proveedores");

        label_provedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label_provedor.setForeground(new java.awt.Color(0, 0, 0));
        label_provedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_provedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/camion-de-reparto.png"))); // NOI18N
        label_provedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_provedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout btn_provedorLayout = new javax.swing.GroupLayout(btn_provedor);
        btn_provedor.setLayout(btn_provedorLayout);
        btn_provedorLayout.setHorizontalGroup(
            btn_provedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
            .addComponent(label_provedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_provedorLayout.setVerticalGroup(
            btn_provedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_provedorLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addComponent(label_provedor, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
        );

        jPanel1.add(btn_provedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 120, 70));

        panel_grafico.setBackground(new java.awt.Color(51, 51, 51));
        panel_grafico.setRoundBottomLeft(20);
        panel_grafico.setRoundBottomRight(20);
        panel_grafico.setRoundTopLeft(20);
        panel_grafico.setRoundTopRight(20);

        javax.swing.GroupLayout panel_graficoLayout = new javax.swing.GroupLayout(panel_grafico);
        panel_grafico.setLayout(panel_graficoLayout);
        panel_graficoLayout.setHorizontalGroup(
            panel_graficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        panel_graficoLayout.setVerticalGroup(
            panel_graficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        jPanel1.add(panel_grafico, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 600, 490));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tendencia Mensual");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 270, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1250, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseClicked
        Menu_Vista_Compra menucompra= new Menu_Vista_Compra();
        menucompra.setVisible(true);
        menucompra.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_atrasMouseClicked

    private void atrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseEntered
        // TODO add your handling code here: 999999
        panel_atras.setBackground(new Color(0xA0A580));
        atras.setForeground(Color.WHITE);
    }//GEN-LAST:event_atrasMouseEntered

    private void atrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseExited
        // TODO add your handling code here:
        panel_atras.setBackground(new Color(0x212529));
        atras.setForeground(Color.WHITE);
    }//GEN-LAST:event_atrasMouseExited

    private void label_pMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_pMouseClicked
        // TODO add your handling code here:
        Grafico_Provedor GP = new Grafico_Provedor();
        GP.setVentanaOrigen("Proveedor");
        GP.setVisible(true);
        GP.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_label_pMouseClicked

    private void label_pMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_pMouseEntered
        // TODO add your handling code here:
        panel_comparacion_compra.setBackground(new Color(0x4a6b7b));
        label_p.setForeground(Color.GRAY);
    }//GEN-LAST:event_label_pMouseEntered

    private void label_pMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_pMouseExited
        // TODO add your handling code here:
        panel_comparacion_compra.setBackground(new Color(0x212529));
        label_p.setForeground(Color.WHITE);
    }//GEN-LAST:event_label_pMouseExited

    private void label_proveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_proveMouseEntered
        // TODO add your handling code here:
        panel_provedor.setBackground(new Color(0x4a6b7b));
        label_prove.setForeground(Color.GRAY);
    }//GEN-LAST:event_label_proveMouseEntered

    private void label_proveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_proveMouseExited
        // TODO add your handling code here:
        panel_provedor.setBackground(new Color(0x212529));
        label_prove.setForeground(Color.WHITE);
    }//GEN-LAST:event_label_proveMouseExited

    private void label_proveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_proveMouseClicked
        // TODO add your handling code here:
        Grafico_Comparativa gp = new Grafico_Comparativa();
        gp.setVisible(true);
        gp.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_label_proveMouseClicked

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
            java.util.logging.Logger.getLogger(Grafico_compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grafico_compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grafico_compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grafico_compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafico_compra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atras;
    private swing.PanelRound btn_compras_r;
    private swing.PanelRound btn_materiales;
    private swing.PanelRound btn_provedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_compras;
    private javax.swing.JLabel label_material;
    private javax.swing.JLabel label_p;
    private javax.swing.JLabel label_prove;
    private javax.swing.JLabel label_provedor;
    private swing.PanelRound panel_atras;
    private javax.swing.JPanel panel_barra;
    private swing.PanelRound panel_comparacion_compra;
    private swing.PanelRound panel_grafico;
    private javax.swing.JPanel panel_grafico_c;
    private swing.PanelRound panel_provedor;
    // End of variables declaration//GEN-END:variables
    private void mostrarGrafico() {
    // Crear el dataset
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();

    // Obtener los datos desde el controlador
    ctrl_compra ctrl = new ctrl_compra();
    try {
        List<Object[]> datos = ctrl.obtenerDatosGrafico(); // Ajustado al tipo Object[] de tu método
        for (Object[] fila : datos) {
            String material = (String) fila[0];
            double totalComprado = fila[1] != null ? ((Number) fila[1]).doubleValue() : 0.0; // Asegurar conversión correcta
            dataset.addValue(totalComprado, material, ""); // Cada barra es etiquetada por material
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    // Crear el gráfico de barras
    JFreeChart barChart = ChartFactory.createBarChart3D(
            "Tendencias Total Peso Material",   // Título del gráfico
            "Materiales",                         // Etiqueta del eje X
            "Total Comprado",                     // Etiqueta del eje Y
            dataset,                              // Dataset
            PlotOrientation.VERTICAL,             // Orientación
            true,                                 // Mostrar leyenda
            true,                                 // Mostrar tooltips
            false                                 // No usar URLs
    );

    // Personalizar el gráfico
    CategoryPlot plot = barChart.getCategoryPlot();
    plot.setBackgroundPaint(new Color(0x212529)); // Fondo gris oscuro
    plot.setRangeGridlinePaint(Color.WHITE);      // Líneas de cuadrícula blancas
    barChart.setBackgroundPaint(new Color(0x212529)); // Fondo del gráfico

    // Personalizar el título y cambiar la fuente
    TextTitle title = barChart.getTitle();
    title.setFont(new Font("Bell MT", Font.BOLD, 18));
    title.setPaint(Color.WHITE); 
    
    LegendTitle legend = barChart.getLegend();
    legend.setBackgroundPaint(new Color(0x212529));
    legend.setItemPaint(Color.WHITE);

    // Cambiar los colores de los textos de los ejes
    CategoryAxis domainAxis = plot.getDomainAxis(); // Eje X
    domainAxis.setTickLabelPaint(Color.WHITE); // Cambiar color de los nombres de materiales
    domainAxis.setLabelPaint(Color.WHITE);     // Cambiar color del título "Materiales"

    ValueAxis rangeAxis = plot.getRangeAxis(); // Eje Y
    rangeAxis.setTickLabelPaint(Color.WHITE); // Cambiar color de los valores numéricos
    rangeAxis.setLabelPaint(Color.WHITE);     // Cambiar color del título "Total Comprado"

    // Cambiar los colores de las barras
    BarRenderer renderer = (BarRenderer) plot.getRenderer();
    renderer.setItemMargin(0.02); // Espaciado entre las barras

    // Asignar colores diferentes a cada barra
    Paint[] colores = {
        new Color(255, 102, 102), // Rojo claro
        new Color(102, 102, 255), // Azul claro
        new Color(102, 255, 102), // Verde claro
        new Color(255, 255, 102), // Amarillo claro
        new Color(255, 153, 255), // Rosa claro
        new Color(153, 255, 255)  // Celeste claro
    };
    for (int i = 0; i < dataset.getRowCount(); i++) {
        renderer.setSeriesPaint(i, colores[i % colores.length]); // Ciclo de colores
    }

    // Configurar la leyenda en la parte inferior
    barChart.getLegend().setPosition(RectangleEdge.BOTTOM);
    barChart.getLegend().setItemPaint(Color.WHITE);

    // Crear el panel del gráfico
    ChartPanel chartPanel = new ChartPanel(barChart);
    chartPanel.setPreferredSize(new java.awt.Dimension(800, 600)); // Tamaño del gráfico
    chartPanel.setMouseWheelEnabled(false); // Habilitar zoom con la rueda del ratón
    //chartPanel.setPopupMenu(null); //Deshabilitar el menú contextual:
    


    // Agregar el gráfico al panel principal
    panel_grafico.removeAll(); // Limpiar el panel
    panel_grafico.setLayout(new java.awt.BorderLayout()); // Configurar el layout
    panel_grafico.add(chartPanel, java.awt.BorderLayout.CENTER); // Agregar gráfico
    panel_grafico.validate(); // Validar el panel para que se actualice
    }

    public void total_compras(){
        ctrl_compra ctrl = new ctrl_compra();
        int total_compra = ctrl.obtenerTotalCompras();
        label_compras.setText(String.valueOf(total_compra));
    }
   public void total_materiales(){
       ctrl_compra ctrl = new ctrl_compra();
       int total_materiales = ctrl.CantidadMaterial();
       label_material.setText(String.valueOf(total_materiales));
   }
   public void total_prove(){
       ctrl_compra ctrl = new ctrl_compra();
       int total_provedor = ctrl.CantidadProvedor();
       label_provedor.setText(String.valueOf(total_provedor));
   }
   
   //para cantidades
   private void mostrarGrafico_c() {
    // Crear el dataset
    DefaultPieDataset dataset = new DefaultPieDataset();
    // Obtener los datos desde el controlador
    ctrl_compra ctrl = new ctrl_compra();
    try {
        List<Object[]> datos = ctrl.obtenerDatosGrafico_c();
        for (Object[] fila : datos) {
            String material = (String) fila[0];
            int numeroCompras = (int) fila[1];
            dataset.setValue(material, numeroCompras); // Agregar cada material y su valor al dataset
        }
    } catch (Exception e) {
        //e.printStackTrace();
    }

    // Crear el gráfico de pastel
    JFreeChart pieChart = ChartFactory.createPieChart(
            "Tendencias Compras por Material",   // Título del gráfico
            dataset,                  // Dataset
            true,                     // Mostrar leyenda
            true,                     // Usar tooltips
            false                     // No usar URLs
    );
    // Personalizar los colores de las secciones
    PiePlot plot = (PiePlot) pieChart.getPlot();
    plot.setSectionPaint("Gaseosa KR", new Color(255, 102, 102)); // Rojo claro
    plot.setSectionPaint("Frugos", new Color(102, 102, 255));     // Azul claro
    plot.setLabelLinkPaint(Color.WHITE);

    // Cambiar el fondo del gráfico
    pieChart.setBackgroundPaint(new Color(0x212529)); // Fondo gris claro
    // Personalizar el título y cambiar la fuente
    pieChart.getLegend().setItemPaint(new Color(0x212529));
    TextTitle title = pieChart.getTitle();
    title.setFont(new Font("Bell MT", Font.BOLD, 18)); // Cambiar la fuente a Arial, negrita, tamaño 18
    plot.setBackgroundPaint(new Color(0x212529));                 // Fondo blanco del gráfico
    plot.setOutlineVisible(false);                        // Eliminar bordes alrededor del gráfico
    title.setPaint(Color.WHITE);  
    // Crear el panel del gráfico
    ChartPanel chartPanel = new ChartPanel(pieChart);
    chartPanel.setPreferredSize(new java.awt.Dimension(800, 600)); // Tamaño del gráfico
    chartPanel.setMouseWheelEnabled(true); // Habilitar zoom con la rueda del ratón
    //chartPanel.setBackground(new Color(0x212529));
    //aca
    LegendTitle legend = pieChart.getLegend();
    legend.setBackgroundPaint(new Color(0x212529));
    legend.setItemPaint(Color.WHITE);

    panel_grafico_c.removeAll();
    panel_grafico_c.repaint();
    panel_grafico_c.setLayout(new java.awt.BorderLayout());
    panel_grafico_c.add(chartPanel, java.awt.BorderLayout.CENTER);
    panel_grafico_c.validate();

    }
   //para actualiza
       // Método que actualiza el gráfico (para ser llamado desde otra vista)
    public void actualizarGrafico() {
        mostrarGrafico();  // Vuelve a mostrar el gráfico con los datos actualizados
        mostrarGrafico_c();
    }
}
