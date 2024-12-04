package GUI;
import com.formdev.flatlaf.FlatDarkLaf;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JTextFieldDateEditor;
import com.toedter.calendar.JYearChooser;
import controlador.ctrl_compra;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Paint;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.RectangleEdge;

public class Grafico_Comparativa extends javax.swing.JFrame {
    

    public Grafico_Comparativa() {
        // Aplica el tema oscuro de FlatLaf
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
        }
        initComponents();
        mostrar_grafico_mes();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_principal = new javax.swing.JPanel();
        panel_barra = new javax.swing.JPanel();
        panel_atras = new swing.PanelRound();
        atras = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panel_mes1 = new javax.swing.JPanel();
        panel_mes2 = new javax.swing.JPanel();
        panelRound1 = new swing.PanelRound();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mes1 = new com.toedter.calendar.JMonthChooser();
        mes2 = new com.toedter.calendar.JMonthChooser();
        panel_buscar = new swing.PanelRound();
        btn_buscar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1250, 750));
        setMinimumSize(new java.awt.Dimension(1250, 750));
        setUndecorated(true);
        setResizable(false);

        panel_principal.setBackground(new java.awt.Color(33, 37, 41));
        panel_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
            .addComponent(atras, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        panel_atrasLayout.setVerticalGroup(
            panel_atrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(atras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        jLabel1.setText("Tendencia Compra");

        javax.swing.GroupLayout panel_barraLayout = new javax.swing.GroupLayout(panel_barra);
        panel_barra.setLayout(panel_barraLayout);
        panel_barraLayout.setHorizontalGroup(
            panel_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_barraLayout.createSequentialGroup()
                .addComponent(panel_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(459, 459, 459)
                .addComponent(jLabel1)
                .addContainerGap(563, Short.MAX_VALUE))
        );
        panel_barraLayout.setVerticalGroup(
            panel_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_atras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel_principal.add(panel_barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 40));

        panel_mes1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_mes1Layout = new javax.swing.GroupLayout(panel_mes1);
        panel_mes1.setLayout(panel_mes1Layout);
        panel_mes1Layout.setHorizontalGroup(
            panel_mes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        panel_mes1Layout.setVerticalGroup(
            panel_mes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        panel_principal.add(panel_mes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 590, 490));

        panel_mes2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_mes2Layout = new javax.swing.GroupLayout(panel_mes2);
        panel_mes2.setLayout(panel_mes2Layout);
        panel_mes2Layout.setHorizontalGroup(
            panel_mes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        panel_mes2Layout.setVerticalGroup(
            panel_mes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        panel_principal.add(panel_mes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 590, 490));

        panelRound1.setBackground(new java.awt.Color(33, 37, 40));
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);

        jPanel1.setBackground(new java.awt.Color(33, 37, 41));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Elige el Mes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mes");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Mes");

        mes1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        mes2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        panel_buscar.setBackground(new java.awt.Color(92, 189, 110));
        panel_buscar.setRoundBottomLeft(10);
        panel_buscar.setRoundBottomRight(10);
        panel_buscar.setRoundTopLeft(10);
        panel_buscar.setRoundTopRight(10);

        btn_buscar.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(0, 0, 0));
        btn_buscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_buscar.setText("Buscar");
        btn_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_buscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_buscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_buscarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_buscarLayout = new javax.swing.GroupLayout(panel_buscar);
        panel_buscar.setLayout(panel_buscarLayout);
        panel_buscarLayout.setHorizontalGroup(
            panel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        panel_buscarLayout.setVerticalGroup(
            panel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(mes1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(mes2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(panel_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panel_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mes1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(mes2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_principal.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 570, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseClicked
        Grafico_compra menucompra= new Grafico_compra();
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

    private void btn_buscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscarMouseEntered
        // TODO add your handling code here:
        panel_buscar.setBackground(new Color(0x499758));
        btn_buscar.setForeground(Color.BLACK);
    }//GEN-LAST:event_btn_buscarMouseEntered

    private void btn_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscarMouseClicked
        // TODO add your handling code here:    
        mostrar_grafico_mes();
    }//GEN-LAST:event_btn_buscarMouseClicked

    private void btn_buscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscarMouseExited
        // TODO add your handling code here:
        panel_buscar.setBackground(new Color(0x5CBD6E));
        btn_buscar.setForeground(Color.WHITE);
    }//GEN-LAST:event_btn_buscarMouseExited

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
            java.util.logging.Logger.getLogger(Grafico_Comparativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grafico_Comparativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grafico_Comparativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grafico_Comparativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafico_Comparativa().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atras;
    private javax.swing.JLabel btn_buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JMonthChooser mes1;
    private com.toedter.calendar.JMonthChooser mes2;
    private swing.PanelRound panelRound1;
    private swing.PanelRound panel_atras;
    private javax.swing.JPanel panel_barra;
    private swing.PanelRound panel_buscar;
    private javax.swing.JPanel panel_mes1;
    private javax.swing.JPanel panel_mes2;
    private javax.swing.JPanel panel_principal;
    // End of variables declaration//GEN-END:variables
    public void mostrar_grafico_mes() {
    // Crear datasets para ambos meses
    DefaultCategoryDataset datasetMes1 = new DefaultCategoryDataset();
    DefaultCategoryDataset datasetMes2 = new DefaultCategoryDataset();

    // Obtener el mes seleccionado
    int mesInicio = mes1.getMonth() + 1;  // El mes comienza desde 0, por eso sumamos 1
    int mesFin = mes2.getMonth() + 1;     // El mes comienza desde 0, por eso sumamos 1

    // Obtener el año actual
    int añoActual = Calendar.getInstance().get(Calendar.YEAR);

    // Si el mes no está seleccionado correctamente, pedir al usuario que lo seleccione
    if (mesInicio == -1 || mesFin == -1) {
        JOptionPane.showMessageDialog(null, "Por favor selecciona ambos meses.");
        return;
    }

    // Instanciar el controlador para obtener los datos
    ctrl_compra ctrl = new ctrl_compra();
    try {
        // Obtener los datos de cada mes
        List<Object[]> datosMes1 = ctrl.obtenerDatosPorMes(mesInicio, añoActual);
        List<Object[]> datosMes2 = ctrl.obtenerDatosPorMes(mesFin, añoActual);

        // Llenar el dataset del primer mes
        for (Object[] fila : datosMes1) {
            String material = (String) fila[0];
            double totalVendido = (double) fila[1];
            datasetMes1.addValue(totalVendido, "Mes " + mesInicio, material);
        }

        // Llenar el dataset del segundo mes
        for (Object[] fila : datosMes2) {
            String material = (String) fila[0];
            double totalVendido = (double) fila[1];
            datasetMes2.addValue(totalVendido, "Mes " + mesFin, material);
        }

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al obtener los datos del gráfico: " + e.getMessage());
        return;
    }

    // Crear gráficos para ambos meses
    JFreeChart barChartMes1 = ChartFactory.createBarChart(
        "Tendencias Total Peso por Material - Mes " + mesInicio + "/" + añoActual, // Título
        "Materiales",                                               // Etiqueta X
        "Total Vendido",                                            // Etiqueta Y
        datasetMes1,                                                // Dataset
        PlotOrientation.VERTICAL,                                   // Orientación
        true,                                                       // Mostrar leyenda
        true,                                                       // Mostrar tooltips
        false                                                       // URLs
    );

    JFreeChart barChartMes2 = ChartFactory.createBarChart(
        "Tendencias Total Peso por Material - Mes " + mesFin + "/" + añoActual,      // Título
        "Materiales",                                                // Etiqueta X
        "Total Vendido",                                             // Etiqueta Y
        datasetMes2,                                                 // Dataset
        PlotOrientation.VERTICAL,                                    // Orientación
        true,                                                        // Mostrar leyenda
        true,                                                        // Mostrar tooltips
        false                                                        // URLs
    );

    // Personalizar los gráficos con el diseño especificado
    // Personalizar los gráficos con el diseño especificado
    personalizarGrafico(barChartMes1, datasetMes1);
    personalizarGrafico(barChartMes2, datasetMes2);

    // Crear paneles para mostrar los gráficos
    ChartPanel chartPanelMes1 = new ChartPanel(barChartMes1);
    chartPanelMes1.setPreferredSize(new java.awt.Dimension(800, 600));
    ChartPanel chartPanelMes2 = new ChartPanel(barChartMes2);
    chartPanelMes2.setPreferredSize(new java.awt.Dimension(800, 600));

    // Mostrar gráficos en los paneles correspondientes
    panel_mes1.removeAll();
    panel_mes1.setLayout(new java.awt.BorderLayout());
    panel_mes1.add(chartPanelMes1, java.awt.BorderLayout.CENTER);
    panel_mes1.validate();

    panel_mes2.removeAll();
    panel_mes2.setLayout(new java.awt.BorderLayout());
    panel_mes2.add(chartPanelMes2, java.awt.BorderLayout.CENTER);
    panel_mes2.validate();
    }

    private void personalizarGrafico(JFreeChart chart, DefaultCategoryDataset dataset) {
    // Cambiar colores y fondo
    chart.setBackgroundPaint(new Color(0x212529));  // Fondo oscuro para el gráfico

    // Personalizar el título y cambiar la fuente
    TextTitle title = chart.getTitle();
    title.setFont(new Font("Bell MT", Font.BOLD, 18));
    title.setPaint(Color.WHITE);  // Color blanco para el título

    // Cambiar los colores de los textos de los ejes
    CategoryPlot plot = (CategoryPlot) chart.getPlot();
    plot.setBackgroundPaint(new Color(0x212529)); // Fondo gris oscuro
    plot.setRangeGridlinePaint(Color.WHITE);       // Líneas de cuadrícula blancas

    CategoryAxis domainAxis = plot.getDomainAxis();  // Eje X
    domainAxis.setTickLabelPaint(Color.WHITE);      // Nombres de materiales en blanco
    domainAxis.setLabelPaint(Color.WHITE);          // Título del eje X en blanco

    ValueAxis rangeAxis = plot.getRangeAxis();      // Eje Y
    rangeAxis.setTickLabelPaint(Color.WHITE);       // Números de la Y en blanco
    rangeAxis.setLabelPaint(Color.WHITE);           // Título del eje Y en blanco

    // Personalizar la leyenda
    LegendTitle legend = chart.getLegend();
    legend.setBackgroundPaint(new Color(0x212529));
    legend.setItemPaint(Color.WHITE);

    // Cambiar los colores de las barras
    BarRenderer renderer = (BarRenderer) plot.getRenderer();
    renderer.setItemMargin(0.02);  // Espaciado entre barras

    // Asignar colores a las barras cíclicamente
    Color[] colores = {Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE, Color.CYAN};
    // Recorrer las series del dataset para asignar los colores
    for (int i = 0; i < dataset.getRowCount(); i++) {
        renderer.setSeriesPaint(i, colores[i % colores.length]);  // Colores cíclicos
    }
    }
//revisa aca quedamos el la grafica de compativa checa la cosnulta el compras quedo raro
}
