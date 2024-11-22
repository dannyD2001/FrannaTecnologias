package GUI;
import com.formdev.flatlaf.FlatDarkLaf;
import controlador.ctrl_provedor;
import controlador.ctrl_provedor.DatosGrafico;
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
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.DefaultCategoryDataset;
public class Grafico_Provedor extends javax.swing.JFrame {
    public Grafico_Provedor() {
        // Aplica el tema oscuro de FlatLaf
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
        }
        initComponents();
        mostrarGraficoSparkline();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_principal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panel_atras = new swing.PanelRound();
        atras = new javax.swing.JLabel();
        panel_provedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panel_principal.setBackground(new java.awt.Color(33, 37, 41));
        panel_principal.setMinimumSize(new java.awt.Dimension(1250, 750));
        panel_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(33, 37, 41));

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        jLabel1.setText("Tendecia Proveedor");

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
            .addComponent(atras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panel_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(462, 462, 462)
                .addComponent(jLabel1)
                .addContainerGap(533, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_atras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel_principal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 40));

        javax.swing.GroupLayout panel_provedorLayout = new javax.swing.GroupLayout(panel_provedor);
        panel_provedor.setLayout(panel_provedorLayout);
        panel_provedorLayout.setHorizontalGroup(
            panel_provedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1180, Short.MAX_VALUE)
        );
        panel_provedorLayout.setVerticalGroup(
            panel_provedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        panel_principal.add(panel_provedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 1180, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 1250, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseClicked
        if("compra".equals(ventanaOrigen)){
            Menu_Vista_Compra menucompra= new Menu_Vista_Compra();
            menucompra.setVisible(true);
            menucompra.setLocationRelativeTo(null);
            
        }else if("Proveedor".equals(ventanaOrigen)){
            Grafico_compra menucompra= new Grafico_compra();
            menucompra.setVisible(true);
            menucompra.setLocationRelativeTo(null);            
        }
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
            java.util.logging.Logger.getLogger(Grafico_Provedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grafico_Provedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grafico_Provedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grafico_Provedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Grafico_Provedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private swing.PanelRound panel_atras;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JPanel panel_provedor;
    // End of variables declaration//GEN-END:variables
    private void mostrarGraficoSparkline() {
    // Crear el dataset para gráficos de líneas
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    // Obtener los datos desde el controlador
    ctrl_provedor ctrl = new ctrl_provedor();
    DatosGrafico datosGrafico = null;
    try {
        // Obtener tanto los datos como el mes actual desde el controlador
        datosGrafico = ctrl.obtenerDatosGrafico_c();
        List<Object[]> datos = datosGrafico.getDatos();
        String mesActual = datosGrafico.getMesActual(); // Obtener el mes actual

        // Añadir los datos al dataset
        for (Object[] fila : datos) {
            String proveedor = (String) fila[0];
            double totalComprado = fila[1] != null ? ((Number) fila[1]).doubleValue() : 0.0;
            dataset.addValue(totalComprado, "Compras", proveedor);
        }

        // Crear el gráfico de líneas con el mes actual en el título
        JFreeChart lineChart = ChartFactory.createLineChart(
                "Tendencias de Actividad - " + mesActual, // Título con mes actual
                "Proveedores",                           // Etiqueta eje X
                "Compras",                               // Etiqueta eje Y
                dataset,                                 // Dataset
                PlotOrientation.VERTICAL,                // Orientación vertical
                false,                                   // Sin leyenda
                true,                                    // Mostrar tooltips
                false                                    // No URLs
        );
        
        // Personalizar el título y cambiar la fuente
        TextTitle title = lineChart.getTitle();
        title.setFont(new Font("Bell MT", Font.BOLD, 20));
        title.setPaint(new Color(0xDEDEDE)); 

        // Personalizar el gráfico
        CategoryPlot plot = lineChart.getCategoryPlot();
        plot.setBackgroundPaint(new Color(0x212529));
        plot.setRangeGridlinePaint(Color.WHITE);
        lineChart.setBackgroundPaint(new Color(0x212529));

        // Personalizar los ejes
        CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setTickLabelPaint(Color.WHITE);
        domainAxis.setLabelPaint(Color.WHITE);

        ValueAxis rangeAxis = plot.getRangeAxis();
        rangeAxis.setTickLabelPaint(Color.WHITE);
        rangeAxis.setLabelPaint(Color.WHITE);

        // Configurar el renderizador para gráficos de líneas
        LineAndShapeRenderer renderer = new LineAndShapeRenderer(true, true) {
            @Override
            public Paint getItemPaint(int row, int column) {
                Number valor = dataset.getValue(row, column);
                if (valor != null && valor.doubleValue() == 0) {
                    return Color.RED; // Puntos en rojo si valor == 0
                }
                return new Color(102, 255, 102); // Verde para otros valores
            }
        };

        // Mostrar puntos en la línea
        renderer.setSeriesShapesVisible(0, true); // Mostrar puntos
        renderer.setSeriesPaint(0, new Color(102, 255, 102)); // Línea verde
        renderer.setUseOutlinePaint(true);
        renderer.setSeriesToolTipGenerator(0, new StandardCategoryToolTipGenerator());

        // Habilitar las etiquetas de los puntos
        renderer.setSeriesItemLabelsVisible(0, true);  // Habilitar etiquetas de los puntos
        renderer.setSeriesItemLabelPaint(0, Color.WHITE); // Color blanco para las etiquetas

        plot.setRenderer(renderer);

        // Crear el panel del gráfico
        ChartPanel chartPanel = new ChartPanel(lineChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        chartPanel.setMouseWheelEnabled(true);

        // Agregar el gráfico al panel principal
        panel_provedor.removeAll();
        panel_provedor.setLayout(new java.awt.BorderLayout());
        panel_provedor.add(chartPanel, java.awt.BorderLayout.CENTER);
        panel_provedor.validate();

    } catch (Exception e) {
    }
    }    
    //extra para las ventanas
    private String ventanaOrigen; // Agrega esta línea
    public void setVentanaOrigen(String origen) {
    this.ventanaOrigen = origen;
    }
}
