package GUI;

import com.formdev.flatlaf.FlatDarkLaf;
import controlador.ctrl_usuario;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import modelo.usuario;
public class Ultimo_Acceso extends javax.swing.JFrame {
    public Ultimo_Acceso() {
        // Aplica el tema oscuro de FlatLaf
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
        }
        initComponents();
        cargarAccesoTabla();
        personalizar_tabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_principal = new javax.swing.JPanel();
        panel_barra = new javax.swing.JPanel();
        panel_atras1 = new swing.PanelRound();
        atras1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelRound1 = new swing.PanelRound();
        scroll_panel = new javax.swing.JScrollPane();
        tabla_registros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setUndecorated(true);
        setResizable(false);

        panel_principal.setBackground(new java.awt.Color(92, 189, 110));
        panel_principal.setMinimumSize(new java.awt.Dimension(800, 500));
        panel_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_barra.setBackground(new java.awt.Color(92, 189, 110));

        panel_atras1.setBackground(new java.awt.Color(92, 189, 110));
        panel_atras1.setPreferredSize(new java.awt.Dimension(40, 40));
        panel_atras1.setRoundBottomLeft(100);
        panel_atras1.setRoundBottomRight(100);
        panel_atras1.setRoundTopLeft(100);
        panel_atras1.setRoundTopRight(100);

        atras1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        atras1.setForeground(new java.awt.Color(0, 0, 0));
        atras1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        atras1.setText(" ");
        atras1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atras1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atras1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                atras1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                atras1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_atras1Layout = new javax.swing.GroupLayout(panel_atras1);
        panel_atras1.setLayout(panel_atras1Layout);
        panel_atras1Layout.setHorizontalGroup(
            panel_atras1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_atras1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(atras1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_atras1Layout.setVerticalGroup(
            panel_atras1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(atras1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registros_usaurioss.png"))); // NOI18N
        jLabel1.setText("Registros Usuarios");

        javax.swing.GroupLayout panel_barraLayout = new javax.swing.GroupLayout(panel_barra);
        panel_barra.setLayout(panel_barraLayout);
        panel_barraLayout.setHorizontalGroup(
            panel_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_barraLayout.createSequentialGroup()
                .addComponent(panel_atras1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(290, 290, 290)
                .addComponent(jLabel1)
                .addContainerGap(289, Short.MAX_VALUE))
        );
        panel_barraLayout.setVerticalGroup(
            panel_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_barraLayout.createSequentialGroup()
                .addGroup(panel_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_atras1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panel_principal.add(panel_barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        panelRound1.setBackground(new java.awt.Color(51, 50, 55));
        panelRound1.setRoundBottomLeft(30);
        panelRound1.setRoundBottomRight(30);
        panelRound1.setRoundTopLeft(30);
        panelRound1.setRoundTopRight(30);

        scroll_panel.setBackground(new java.awt.Color(51, 50, 55));

        tabla_registros.setBackground(new java.awt.Color(51, 50, 55));
        tabla_registros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido Paterno", "Apellido Materno", "Inicio Sesión", "Ultimo Acceso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scroll_panel.setViewportView(tabla_registros);
        if (tabla_registros.getColumnModel().getColumnCount() > 0) {
            tabla_registros.getColumnModel().getColumn(0).setResizable(false);
            tabla_registros.getColumnModel().getColumn(1).setResizable(false);
            tabla_registros.getColumnModel().getColumn(2).setResizable(false);
            tabla_registros.getColumnModel().getColumn(3).setResizable(false);
            tabla_registros.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_principal.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 740, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atras1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atras1MouseClicked
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
    }//GEN-LAST:event_atras1MouseClicked

    private void atras1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atras1MouseEntered
        // TODO add your handling code here: 999999
        panel_atras1.setBackground(new Color(0x52aa63));
        atras1.setForeground(Color.WHITE);
    }//GEN-LAST:event_atras1MouseEntered

    private void atras1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atras1MouseExited
        // TODO add your handling code here:
        panel_atras1.setBackground(new Color(0x5CBD6E));
        atras1.setForeground(Color.BLACK);
    }//GEN-LAST:event_atras1MouseExited

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
            java.util.logging.Logger.getLogger(Ultimo_Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ultimo_Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ultimo_Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ultimo_Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ultimo_Acceso().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atras1;
    private javax.swing.JLabel jLabel1;
    private swing.PanelRound panelRound1;
    private swing.PanelRound panel_atras1;
    private javax.swing.JPanel panel_barra;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JScrollPane scroll_panel;
    private javax.swing.JTable tabla_registros;
    // End of variables declaration//GEN-END:variables
    public void cargarAccesoTabla(){
        ctrl_usuario ctrl = new ctrl_usuario();
        DefaultTableModel modelo = (DefaultTableModel) tabla_registros.getModel();
        modelo.setRowCount(0);  // Limpiar la tabla antes de cargar nuevos datos
        List<usuario> listausu = ctrl.ConsultaAcceso();
        for (usuario usuarioss : listausu) {
        Object[] fila = new Object[8]; 
        fila[0] = usuarioss.getNombre();
        fila[1] = usuarioss.getApellidoP();
        fila[2] = usuarioss.getApellidoM();
        fila[3] = usuarioss.getInicio_sesion();
        fila[4] = usuarioss.getUltimo_acceso();
        modelo.addRow(fila);        
        }    
    }
    //personalizar tabla
    public void personalizar_tabla(){
        //Personalizamos la tablas 
        tabla_registros.setBackground(new Color(0x333337));  // Fondo de las celdas
        tabla_registros.setForeground(new Color(000,000,000));  // Color del texto de las celdas
        tabla_registros.setGridColor(new Color(0x333337));  // Líneas de celda más suaves
        tabla_registros.setRowHeight(25);  // Ajustar la altura de las filas
        tabla_registros.setFont(new Font("sansserif", Font.PLAIN, 12));//ME PARECE, ES FUENTE DEL CONTENIDO DE LA TABLA
        // Configurar el JScrollPane sin borde
        scroll_panel.setBorder(BorderFactory.createEmptyBorder());
        scroll_panel.setBackground(new Color(0x333337));
        TableCellRenderer cellRenderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                // Establecer los colores para celdas seleccionadas y no seleccionadas
                if (isSelected) {
                    label.setBackground(new Color(0, 102, 204));  // Fondo cuando está seleccionada (azul)
                    label.setForeground(Color.WHITE);  // Texto cuando está seleccionada (blanco)
                } else {
                    //este es el que aplica para el fondo del tabla
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
        for (int i = 0; i < tabla_registros.getColumnCount(); i++) {
            tabla_registros.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
        }
        //para encabezado de Tabla
        TableCellRenderer headerRenderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                label.setBackground(new Color(120,171,168));  // Fondo verde del encabezado                
                label.setForeground(new Color(40,40,40));  // Color del texto del encabezado
                label.setHorizontalAlignment(JLabel.LEFT);  // Centrar el texto
                label.setFont((new Font("sansserif", Font.BOLD, 12))); //LA FUENTE DE LA TABLA  TITULO                 
                label.setOpaque(true);  // Asegurarse de que el color de fondo se aplique
                return label;
            }
        };
         // Aplicar el renderizador a cada columna del encabezado
        for (int i = 0; i < tabla_registros.getColumnModel().getColumnCount(); i++) {
            tabla_registros.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
    }
}
