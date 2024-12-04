package GUI;
import Util.AppContext;
import com.formdev.flatlaf.FlatDarkLaf;
import controlador.ctrl_venta;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import modelo.DetalleVenta;
import modelo.usuario;
public class Detalle_venta_realizadas extends javax.swing.JFrame {
    DefaultTableModel modelo;
    //Para el usuario Actual
    usuario usuarioActual = AppContext.getUsuarioActual();
    public Detalle_venta_realizadas() {
        // Aplica el tema oscuro de FlatLaf
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
        }
        initComponents();        
        Personalizar_tabla();
        informacion_panel();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_principal = new javax.swing.JPanel();
        panel_barra = new javax.swing.JPanel();
        panel_atras = new swing.PanelRound();
        atras = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        usuario_persona = new javax.swing.JLabel();
        scroll_detalle = new javax.swing.JScrollPane();
        tabla_detalles = new javax.swing.JTable();
        saludo = new javax.swing.JLabel();
        apellido_actual = new javax.swing.JLabel();
        nombre_actual = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 600));
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setUndecorated(true);
        setResizable(false);

        panel_principal.setBackground(new java.awt.Color(92, 189, 110));
        panel_principal.setMaximumSize(new java.awt.Dimension(1200, 600));
        panel_principal.setMinimumSize(new java.awt.Dimension(1200, 600));
        panel_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_barra.setBackground(new java.awt.Color(92, 189, 110));

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
            .addComponent(atras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        panel_atrasLayout.setVerticalGroup(
            panel_atrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(atras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Detalle de la Venta");

        usuario_persona.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        usuario_persona.setForeground(new java.awt.Color(204, 0, 0));
        usuario_persona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-usuario-20.png"))); // NOI18N

        javax.swing.GroupLayout panel_barraLayout = new javax.swing.GroupLayout(panel_barra);
        panel_barra.setLayout(panel_barraLayout);
        panel_barraLayout.setHorizontalGroup(
            panel_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_barraLayout.createSequentialGroup()
                .addComponent(panel_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(471, 471, 471)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 415, Short.MAX_VALUE)
                .addComponent(usuario_persona, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_barraLayout.setVerticalGroup(
            panel_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_atras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(usuario_persona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel_principal.add(panel_barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 40));

        tabla_detalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Folio", "Material Granel", "Peso Bruto(Kg)", "Peso Tara(Kg)", "Peso Neto(Kg)", "Descuento en (%)", "Precio ($)", "Observación", "Subtotal"
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
            tabla_detalles.getColumnModel().getColumn(8).setResizable(false);
        }

        panel_principal.add(scroll_detalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 1140, 470));

        saludo.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        saludo.setForeground(new java.awt.Color(0, 0, 0));
        saludo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-usuario-20.png"))); // NOI18N
        saludo.setText("Ola Buenas!");
        panel_principal.add(saludo, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, 130, 40));

        apellido_actual.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        apellido_actual.setForeground(new java.awt.Color(204, 0, 0));
        panel_principal.add(apellido_actual, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 60, 120, 40));

        nombre_actual.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        nombre_actual.setForeground(new java.awt.Color(204, 0, 0));
        panel_principal.add(nombre_actual, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 60, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseClicked
        Venta_realizadas menu_venta = new Venta_realizadas();
        menu_venta.setVisible(true);
        menu_venta.setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(Detalle_venta_realizadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Detalle_venta_realizadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Detalle_venta_realizadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Detalle_venta_realizadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Detalle_venta_realizadas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellido_actual;
    private javax.swing.JLabel atras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nombre_actual;
    private swing.PanelRound panel_atras;
    private javax.swing.JPanel panel_barra;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JLabel saludo;
    private javax.swing.JScrollPane scroll_detalle;
    private javax.swing.JTable tabla_detalles;
    private javax.swing.JLabel usuario_persona;
    // End of variables declaration//GEN-END:variables
    //
    public void Personalizar_tabla(){
    // Configuración de la tabla
    tabla_detalles.setBackground(new Color(0x333333));  // Fondo de las celdas
    tabla_detalles.setForeground(new Color(000,000,000));  // Color del texto de las celdas
    tabla_detalles.setGridColor(new Color(255, 255, 255));  // Líneas de celda más suaves
    tabla_detalles.setRowHeight(20);  // Ajustar la altura de las filas
    tabla_detalles.setFont(new Font("sansserif", Font.PLAIN, 14));  // Fuente general de las celdas
    tabla_detalles.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // Permitir solo una selección de fila
    tabla_detalles.setCellSelectionEnabled(false); // Desactivar selección de celdas
    tabla_detalles.setRowSelectionAllowed(true); // Habilitar la selección por fila
    // Crear un renderizador personalizado para las celdas del contenido Es para el contenido Tabla
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
    scroll_detalle.setBackground(new Color(0,0,1));
    scroll_detalle.setForeground(Color.WHITE);
    }
    public void informacion_panel(){
        this.setTitle("DETALLE VENTA");
        Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/compra1.png"));
        this.setIconImage(icono);
        this.setLocationRelativeTo(null);
        //Para un jTextFiel
        nombre_actual.setText(usuarioActual.getNombre());
        apellido_actual.setText(usuarioActual.getApellidoP());
        usuario_persona.setText(usuarioActual.getTipo_usuario());
        
        
    }
    ctrl_venta ctrl_venta = new ctrl_venta();
    //Proceder por aca deje el boton de detalle directo peor hay que ver la logica
    public void ListarDetallesVenta(int folioVenta) {
    List<DetalleVenta> listarDetalles = ctrl_venta.obtenerDetallesVenta(folioVenta);
    modelo = (DefaultTableModel) tabla_detalles.getModel();
    modelo.setRowCount(0); // Limpiar tabla
    for (DetalleVenta detalle : listarDetalles) {
        Object[] fila = new Object[9];
        fila[0] = detalle.getFolio_venta();
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
}
