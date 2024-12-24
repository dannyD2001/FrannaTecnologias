/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Util.AppContext;
import com.formdev.flatlaf.FlatDarkLaf;
import conexion.conexion;
import controlador.ctrl_compra;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import modelo.DetalleCompra;
import modelo.usuario;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
public class Detalles_compra_realizadas extends javax.swing.JFrame {
    DefaultTableModel modelo;

    public Detalles_compra_realizadas() {
        // Aplica el tema oscuro de FlatLaf
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
        }
        initComponents();
        //Para el usuario Actual
        usuario usuarioActual = AppContext.getUsuarioActual();
        //para el usuario
        nombre_usuario_actual.setText(usuarioActual.getNombre());                     
        informacion_panel();
        Personalizar_tabla();       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_principal = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panel_atras = new swing.PanelRound();
        atras = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombre_usuario_actual = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelRound1 = new swing.PanelRound();
        scroll_detalle = new javax.swing.JScrollPane();
        tabla_detalles = new javax.swing.JTable();
        panel_btnç = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panel_btn_pdf = new swing.PanelRound();
        label_btn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 600));
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setUndecorated(true);
        setResizable(false);

        panel_principal.setBackground(new java.awt.Color(92, 189, 110));
        panel_principal.setMaximumSize(new java.awt.Dimension(1200, 600));
        panel_principal.setMinimumSize(new java.awt.Dimension(1200, 600));
        panel_principal.setPreferredSize(new java.awt.Dimension(1200, 600));
        panel_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(92, 189, 110));
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 40));

        panel_atras.setBackground(new java.awt.Color(92, 189, 110));
        panel_atras.setPreferredSize(new java.awt.Dimension(70, 40));
        panel_atras.setRoundBottomLeft(100);
        panel_atras.setRoundBottomRight(100);
        panel_atras.setRoundTopLeft(100);
        panel_atras.setRoundTopRight(100);

        atras.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        atras.setForeground(new java.awt.Color(0, 0, 0));
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

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Detalle de la Compra");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(panel_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 445, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(335, 335, 335))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_atras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel_principal.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 40));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Esto son los detalles de la Compra..");
        panel_principal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 60, 290, 40));

        nombre_usuario_actual.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        nombre_usuario_actual.setForeground(new java.awt.Color(204, 0, 0));
        panel_principal.add(nombre_usuario_actual, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, 120, 40));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hombre (1).png"))); // NOI18N
        jLabel4.setText("Hola Buenas!");
        panel_principal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 130, 40));

        panelRound1.setBackground(new java.awt.Color(51, 50, 55));

        scroll_detalle.setBackground(new java.awt.Color(51, 50, 55));

        tabla_detalles.setBackground(new java.awt.Color(51, 50, 55));
        tabla_detalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Folio ", "Material Granel", "Peso Bruto(kg)", "Peso Tara(kg)", "Peso Neto(kg)", "Descuento en (%)", "Precio($)", "Observación", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scroll_detalle.setViewportView(tabla_detalles);
        if (tabla_detalles.getColumnModel().getColumnCount() > 0) {
            tabla_detalles.getColumnModel().getColumn(0).setResizable(false);
            tabla_detalles.getColumnModel().getColumn(1).setResizable(false);
            tabla_detalles.getColumnModel().getColumn(2).setResizable(false);
            tabla_detalles.getColumnModel().getColumn(3).setResizable(false);
            tabla_detalles.getColumnModel().getColumn(4).setResizable(false);
            tabla_detalles.getColumnModel().getColumn(5).setResizable(false);
            tabla_detalles.getColumnModel().getColumn(6).setResizable(false);
            tabla_detalles.getColumnModel().getColumn(7).setResizable(false);
            tabla_detalles.getColumnModel().getColumn(8).setResizable(false);
        }

        panel_btnç.setBackground(new java.awt.Color(0, 142, 0));
        panel_btnç.setPreferredSize(new java.awt.Dimension(97, 25));

        jLabel3.setBackground(new java.awt.Color(0, 142, 0));
        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(40, 40, 40));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pdf");

        javax.swing.GroupLayout panel_btnçLayout = new javax.swing.GroupLayout(panel_btnç);
        panel_btnç.setLayout(panel_btnçLayout);
        panel_btnçLayout.setHorizontalGroup(
            panel_btnçLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panel_btnçLayout.setVerticalGroup(
            panel_btnçLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panel_btn_pdf.setBackground(new java.awt.Color(51, 50, 55));

        label_btn.setBackground(new java.awt.Color(51, 50, 55));
        label_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pdf_blanco.png"))); // NOI18N
        label_btn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        label_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_btnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_btn_pdfLayout = new javax.swing.GroupLayout(panel_btn_pdf);
        panel_btn_pdf.setLayout(panel_btn_pdfLayout);
        panel_btn_pdfLayout.setHorizontalGroup(
            panel_btn_pdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
        );
        panel_btn_pdfLayout.setVerticalGroup(
            panel_btn_pdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll_detalle, javax.swing.GroupLayout.PREFERRED_SIZE, 1039, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_btnç, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_btn_pdf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scroll_detalle, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(panel_btnç, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(panel_btn_pdf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        panel_principal.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 1160, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseClicked
        Compra_realizadas menu_compra = new Compra_realizadas();
        menu_compra.setVisible(true);
        menu_compra.setLocationRelativeTo(null);
        //cerrar procesos que quedaron anteriormente
        this.dispose();
    }//GEN-LAST:event_atrasMouseClicked

    private void atrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseEntered
        // TODO add your handling code here: 999999
        panel_atras.setBackground(new Color(0x52aa63));
        atras.setForeground(Color.WHITE);
    }//GEN-LAST:event_atrasMouseEntered

    private void atrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseExited
        // TODO add your handling code here:
        panel_atras.setBackground(new Color(0x5CBD6E));
        atras.setForeground(Color.BLACK);
    }//GEN-LAST:event_atrasMouseExited

    private void label_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_btnMouseEntered
        // TODO add your handling code here:
        /// Cambiar el ícono del JLabel existente (label_btn)
        label_btn.setIcon(new ImageIcon(getClass().getResource("/imagenes/pdf_.png")));

        // Cambiar el color de fondo del panel cuando el mouse entra
        //panel_btn_pdf.setBackground(new Color(0xCF1818));
        
    }//GEN-LAST:event_label_btnMouseEntered

    private void label_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_btnMouseExited
        // TODO add your handling code here:
        label_btn.setIcon(new ImageIcon(getClass().getResource("/imagenes/pdf_blanco.png")));        
    }//GEN-LAST:event_label_btnMouseExited

    private void label_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_btnMouseClicked
        // TODO add your handling code here:
         int filaSeleccionada = tabla_detalles.rowAtPoint(evt.getPoint());
        if (filaSeleccionada != -1) {
            // Obtener el folioCompra de la columna 0 de la fila seleccionada
            int folioCompra = (int) tabla_detalles.getValueAt(filaSeleccionada, 0);
            // Llamar al método para generar el reporte PDF con el folioCompra
            generarReportePDF(folioCompra);
        } else {
            // Si no hay fila seleccionada, puedes mostrar un mensaje
            JOptionPane.showMessageDialog(null, "Por favor, selecciona una fila para generar el reporte.");
        }
    }//GEN-LAST:event_label_btnMouseClicked

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
            java.util.logging.Logger.getLogger(Detalles_compra_realizadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Detalles_compra_realizadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Detalles_compra_realizadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Detalles_compra_realizadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Detalles_compra_realizadas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label_btn;
    private javax.swing.JLabel nombre_usuario_actual;
    private swing.PanelRound panelRound1;
    private swing.PanelRound panel_atras;
    private swing.PanelRound panel_btn_pdf;
    private javax.swing.JPanel panel_btnç;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JScrollPane scroll_detalle;
    private javax.swing.JTable tabla_detalles;
    // End of variables declaration//GEN-END:variables
    ctrl_compra ctr_com = new ctrl_compra();
    public void ListarDetallesCompra(int folioCompra) {
    List<DetalleCompra> listarDetalles = ctr_com.obtenerDetallesCompra(folioCompra);
    modelo = (DefaultTableModel) tabla_detalles.getModel();
    modelo.setRowCount(0); // Limpiar tabla
    for (DetalleCompra detalle : listarDetalles) {
        Object[] fila = new Object[9];
        fila[0] = detalle.getFolio_compra();
        fila[1] = detalle.getNombre_material();
        fila[2] = detalle.getPeso_bruto();
        fila[3] = detalle.getPeso_tara();
        fila[4] = detalle.getPeso_neto();
        fila[5] = detalle.getDescuento_porcentaje();
        fila[6] = detalle.getPrecio_selecionado();
        fila[7] = detalle.getObservacion();
        fila[8] = detalle.getSubtotal();
        modelo.addRow(fila);
    }    
    tabla_detalles.setModel(modelo); // Refresca la tabla con el nuevo modelo
    }
    
    public void Personalizar_tabla(){
    // Configuración de la tabla
    tabla_detalles.setBackground(new Color(0x333237));  // Fondo de las celdas
    tabla_detalles.setForeground(new Color(000,000,000));  // Color del texto de las celdas
    tabla_detalles.setGridColor(new Color(255, 255, 255));  // Líneas de celda más suaves
    tabla_detalles.setRowHeight(20);  // Ajustar la altura de las filas
    tabla_detalles.setFont(new Font("sansserif", Font.PLAIN, 14));  // Fuente general de las celdas
    tabla_detalles.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // Permitir solo una selección de fila
    tabla_detalles.setCellSelectionEnabled(false); // Desactivar selección de celdas
    tabla_detalles.setRowSelectionAllowed(true); // Habilitar la selección por fila
    tabla_detalles.setRowHeight(25);  // Ajustar la altura de las filas
    // Crear un renderizador personalizado para las celdas del contenido Es para el contenido Tabla
    // Configurar el JScrollPane sin borde
    scroll_detalle.setBorder(BorderFactory.createEmptyBorder());
    scroll_detalle.setBackground(new Color(0x333337));
    TableCellRenderer cellRenderer = new DefaultTableCellRenderer() {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            // Establecer los colores para celdas seleccionadas y no seleccionadas
            if (isSelected) {
                label.setBackground(new Color(0, 102, 204));  // Fondo cuando está seleccionada (azul)
                label.setForeground(Color.WHITE);  // Texto cuando está seleccionada (blanco)
            } else {
                label.setBackground(new Color(0x333337));  // Fondo cuando no está seleccionada (blanco)
                label.setForeground(new Color(102,102,102));  // Texto cuando no está seleccionada (negro)
            }

            // Si deseas cambiar el alineamiento del texto
            label.setHorizontalAlignment(JLabel.LEFT);  // Alinear el texto a la izquierda

            label.setOpaque(true);  // Asegurarse de que el fondo se pinte correctamente
            return label;
        }
    };
    // Aplicar el renderizador personalizado a todas las columnas de la tabla
    for (int i = 0; i < tabla_detalles.getColumnCount(); i++) {
        tabla_detalles.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
    }
    //para encabezado de Tabla
    TableCellRenderer headerRenderer = new DefaultTableCellRenderer() {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            label.setBackground(new Color(0,142,0));  // Fondo verde del encabezado                
            label.setForeground(new Color(40,40,40));  // Color del texto del encabezado
            label.setHorizontalAlignment(JLabel.LEFT);  // Centrar el texto
            label.setOpaque(true);  // Asegurarse de que el color de fondo se aplique
            return label;
        }
    };
     // Aplicar el renderizador a cada columna del encabezado
    for (int i = 0; i < tabla_detalles.getColumnModel().getColumnCount(); i++) {
        tabla_detalles.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
    }
    //0,0,0,1                
    //scroll_ventas.setBackground(Color.WHITE);
    scroll_detalle.setBackground(new Color(0x333237));
    scroll_detalle.setForeground(Color.WHITE);
    }
    public void informacion_panel(){
        this.setTitle("DETALLE COMPRA");
        Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/compra1.png"));
        this.setIconImage(icono);
        this.setLocationRelativeTo(null);
    }
    
    //PARA GENERAR REPORTES
    private void generarReportePDF(int folioCompra) {
    try {
        // Ruta relativa del archivo Jasper
        String rutaReporte = "src/reportes/Compras.jasper";

        // Obtener la conexión a la base de datos
        Connection con = conexion.conectar();

        // Parámetros para el reporte
        Map<String, Object> parametros = new HashMap<>();
        parametros.put("folio_compra", folioCompra); // Pasa el parámetro como Integer

        // Cargar el reporte compilado
        JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(rutaReporte);

        // Llenar el reporte con datos
        JasperPrint jp = JasperFillManager.fillReport(jr, parametros, con);

        // Exportar a PDF
        JasperExportManager.exportReportToPdfFile(jp, "reporte_compra_" + folioCompra + ".pdf");
        // Visualizar el reporte
          
        JasperViewer.viewReport(jp, false);

        JOptionPane.showMessageDialog(null, "PDF generado con éxito.");
    } catch (JRException ex) {
        
        System.err.println("Error al generar el reporte: " + ex.getMessage());
        ex.printStackTrace();
    }
    }
    //quedo listo solo revisa el diselo de compra debs incluir lo de precios y ceha que si despues de la compra puede gener el pdf para imprimir o como hacer la conexion con la impresora
    
}
