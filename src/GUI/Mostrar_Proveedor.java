package GUI;
import com.formdev.flatlaf.FlatDarkLaf;
import controlador.ctrl_provedor;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import modelo.Provedor;
import modelo.usuario;
public class Mostrar_Proveedor extends javax.swing.JFrame {
    public Mostrar_Proveedor() {
        // Aplica el tema oscuro de FlatLaf
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
        }
        initComponents();
        Personalizar_tabla();
        CargarTabla();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_principal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        panel_atras = new swing.PanelRound();
        atras = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panel_tabla = new swing.PanelRound();
        scroll_panel = new javax.swing.JScrollPane();
        tabla_provedor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panel_principal.setBackground(new java.awt.Color(92, 189, 110));
        panel_principal.setMaximumSize(new java.awt.Dimension(800, 500));
        panel_principal.setMinimumSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(92, 189, 110));
        jPanel1.setMaximumSize(new java.awt.Dimension(32767, 40));
        jPanel1.setMinimumSize(new java.awt.Dimension(100, 40));

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
            .addComponent(atras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Proveedores Registrados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panel_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(271, 271, 271)
                .addComponent(jLabel1)
                .addContainerGap(288, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_atras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel_tabla.setRoundBottomLeft(10);
        panel_tabla.setRoundBottomRight(10);
        panel_tabla.setRoundTopLeft(10);
        panel_tabla.setRoundTopRight(10);

        tabla_provedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Teléfono", "Ciudad", "Correo Electrónico"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_provedor.getTableHeader().setReorderingAllowed(false);
        scroll_panel.setViewportView(tabla_provedor);
        if (tabla_provedor.getColumnModel().getColumnCount() > 0) {
            tabla_provedor.getColumnModel().getColumn(0).setResizable(false);
            tabla_provedor.getColumnModel().getColumn(0).setPreferredWidth(4);
            tabla_provedor.getColumnModel().getColumn(1).setResizable(false);
            tabla_provedor.getColumnModel().getColumn(1).setPreferredWidth(20);
            tabla_provedor.getColumnModel().getColumn(2).setResizable(false);
            tabla_provedor.getColumnModel().getColumn(2).setPreferredWidth(10);
            tabla_provedor.getColumnModel().getColumn(3).setResizable(false);
            tabla_provedor.getColumnModel().getColumn(3).setPreferredWidth(10);
            tabla_provedor.getColumnModel().getColumn(4).setResizable(false);
            tabla_provedor.getColumnModel().getColumn(4).setPreferredWidth(40);
        }

        javax.swing.GroupLayout panel_tablaLayout = new javax.swing.GroupLayout(panel_tabla);
        panel_tabla.setLayout(panel_tablaLayout);
        panel_tablaLayout.setHorizontalGroup(
            panel_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll_panel)
                .addContainerGap())
        );
        panel_tablaLayout.setVerticalGroup(
            panel_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_principalLayout = new javax.swing.GroupLayout(panel_principal);
        panel_principal.setLayout(panel_principalLayout);
        panel_principalLayout.setHorizontalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_principalLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panel_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_tabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_principalLayout.setVerticalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_principalLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseClicked
        // TODO add your handling code here:
        // instnaciar el usuario
        usuario usuarioActual =new usuario();
        //insatncia a principal y pasa el modelo usuario para saber quien es y se sepa quien regresa a principal
        Principal principal = new Principal(usuarioActual);
        //es un metodo que esta en princiapal que se encarga de verficar que usuario es por eso se le pasa atualizar a principal
        //sabiendo que principal ya sabe quie es el usuario principal
        principal.actualizarPermisos();
        //es para mostar el menu princiapal
        principal.setVisible(true);
        //para poner el jframe centrado en la pantalla
        principal.setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(Mostrar_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mostrar_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mostrar_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mostrar_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Mostrar_Proveedor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private swing.PanelRound panel_atras;
    private javax.swing.JPanel panel_principal;
    private swing.PanelRound panel_tabla;
    private javax.swing.JScrollPane scroll_panel;
    private javax.swing.JTable tabla_provedor;
    // End of variables declaration//GEN-END:variables
    public void CargarTabla(){
    ctrl_provedor controlador = new ctrl_provedor();
    List<Provedor> listaMateriales = controlador.Consultaprovedor();

    DefaultTableModel modelo = (DefaultTableModel) tabla_provedor.getModel();
    modelo.setRowCount(0); // Limpiar la tabla
    for (Provedor prove : listaMateriales) {
    modelo.addRow(new Object[]{
        prove.getId_provedor(),
        prove.getNombre(),
        prove.getTelefono(),
        prove.getCiudad(),
        prove.getCorreo_electronico()
    });
    }    
    }
    public void Personalizar_tabla(){
    // Configuración de la tabla
    tabla_provedor.setBackground(new Color(0x333237));  // Fondo de las celdas
    tabla_provedor.setForeground(new Color(000,000,000));  // Color del texto de las celdas
    tabla_provedor.setGridColor(new Color(255, 255, 255));  // Líneas de celda más suaves
    tabla_provedor.setRowHeight(20);  // Ajustar la altura de las filas
    tabla_provedor.setFont(new Font("sansserif", Font.PLAIN, 14));  // Fuente general de las celdas
    tabla_provedor.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // Permitir solo una selección de fila
    tabla_provedor.setCellSelectionEnabled(false); // Desactivar selección de celdas
    tabla_provedor.setRowSelectionAllowed(true); // Habilitar la selección por fila
    // Configurar el JScrollPane sin borde
   tabla_provedor.setBorder(BorderFactory.createEmptyBorder());
    tabla_provedor.setBackground(new Color(0x333237));
    // Configurar el JScrollPane sin borde
    scroll_panel.setBorder(BorderFactory.createEmptyBorder());
    scroll_panel.setBackground(new Color(0x333337));
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
                label.setBackground(new Color(0x333237));  // Fondo cuando no está seleccionada (blanco)
                label.setForeground(new Color(102,102,102));  // Texto cuando no está seleccionada (negro)
            }

            // Si deseas cambiar el alineamiento del texto
            label.setHorizontalAlignment(JLabel.LEFT);  // Alinear el texto a la izquierda

            label.setOpaque(true);  // Asegurarse de que el fondo se pinte correctamente
            return label;
        }
    };
    // Aplicar el renderizador personalizado a todas las columnas de la tabla
    for (int i = 0; i < tabla_provedor.getColumnCount(); i++) {
        tabla_provedor.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
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
    for (int i = 0; i < tabla_provedor.getColumnModel().getColumnCount(); i++) {
        tabla_provedor.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
    }
    //0,0,0,1                
    //scroll_ventas.setBackground(Color.WHITE);
    scroll_panel.setBackground(new Color(0,0,1));
    scroll_panel.setForeground(Color.WHITE);
    }
}
