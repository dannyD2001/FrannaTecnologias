package GUI;
import conexion.conexion;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import modelo.usuario;
public class Mostrar_Usuario extends javax.swing.JFrame {
    conexion enlace=new conexion();
    Connection enlazar = enlace.conectar();
    public void MostrarUsuario() {
        DefaultTableModel talumno = new DefaultTableModel();
        talumno.addColumn("Telefono");
        talumno.addColumn("Nombre");
        talumno.addColumn("Apellido Paterno");
        talumno.addColumn("Apellido Materno");
        talumno.addColumn("Contraseña");
        talumno.addColumn("Tipo Usuario");
        Tabla_usuario.setModel(talumno);

        String sql = "SELECT  telefono, nombre, apellido_p, apellido_m, contraseña, tipo_usuario FROM usuario";
        try (PreparedStatement ps = enlazar.prepareStatement(sql)) {
            ResultSet resultado = ps.executeQuery();
            String[] datos = new String[6];
            while (resultado.next()) {
                datos[0] = resultado.getString("telefono");
                datos[1] = resultado.getString("nombre");
                datos[2] = resultado.getString("apellido_p");
                datos[3] = resultado.getString("apellido_m");
                datos[4] = resultado.getString("contraseña");
                datos[5] = resultado.getString("tipo_usuario");
                talumno.addRow(datos);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta: " + e.getMessage());
        } 
    }
    public Mostrar_Usuario() {
        initComponents();
        MostrarUsuario();
        // Eliminar el borde del JScrollPane
        scroll_material.setBorder(BorderFactory.createEmptyBorder());  // Elimina el borde del JScrollPane
        // Selección solo de filas
        Tabla_usuario.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);  // Permitir seleccionar solo una fila a la vez
        // Personalizar el encabezado de la tabla
        //Personalizamos la tablas 
        Tabla_usuario.setBackground(Color.WHITE);  // Fondo de las celdas
        Tabla_usuario.setForeground(new Color(000,000,000));  // Color del texto de las celdas
        Tabla_usuario.setGridColor(new Color(255, 255, 255));  // Líneas de celda más suaves
        Tabla_usuario.setRowHeight(25);  // Ajustar la altura de las filas
        Tabla_usuario.setFont(new Font("sansserif", Font.PLAIN, 12));
        Tabla_usuario.setOpaque(false);
        TableCellRenderer cellRenderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                // Establecer los colores para celdas seleccionadas y no seleccionadas
                if (isSelected) {
                    label.setBackground(new Color(0, 102, 204));  // Fondo cuando está seleccionada (azul)
                    label.setForeground(Color.WHITE);  // Texto cuando está seleccionada (blanco)
                } else {
                    label.setBackground(Color.WHITE);  // Fondo cuando no está seleccionada (blanco)
                    label.setForeground(new Color(102,102,102));  // Texto cuando no está seleccionada (negro)
                }
                // Si deseas cambiar el alineamiento del texto
                label.setHorizontalAlignment(JLabel.LEFT);  // Alinear el texto a la izquierda

                label.setOpaque(true);  // Asegurarse de que el fondo se pinte correctamente
                return label;
            }
        };
        // Aplicar el renderizador personalizado a todas las columnas de la tabla
        for (int i = 0; i < Tabla_usuario.getColumnCount(); i++) {
            Tabla_usuario.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
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
        for (int i = 0; i < Tabla_usuario.getColumnModel().getColumnCount(); i++) {
            Tabla_usuario.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }       
        // Crear una barra de desplazamiento personalizada para reducir su grosor
        JScrollBar verticalScrollBar = new JScrollBar(JScrollBar.VERTICAL) {
        @Override
        public Dimension getPreferredSize() {
            return new Dimension(10, super.getPreferredSize().height);  // Ajusta el ancho aquí (en este caso, 8 píxeles)
        }
        };

        JScrollBar horizontalScrollBar = new JScrollBar(JScrollBar.HORIZONTAL) {
        @Override
        public Dimension getPreferredSize() {
            return new Dimension(super.getPreferredSize().width, 8);  // Ajusta el grosor de la barra horizontal aquí
        }
        };
        
        // Aplicar las barras de desplazamiento personalizadas al JScrollPane
        scroll_material.setBackground(Color.WHITE);
        scroll_material.setForeground(Color.white);
        scroll_material.setVerticalScrollBar(verticalScrollBar);
        scroll_material.setHorizontalScrollBar(horizontalScrollBar);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        panel_principal = new javax.swing.JPanel();
        panel_barra = new javax.swing.JPanel();
        usuario_modulo = new javax.swing.JLabel();
        panel_atras = new swing.PanelRound();
        atras = new javax.swing.JLabel();
        border1 = new swing.border();
        jPanel2 = new javax.swing.JPanel();
        scroll_material = new javax.swing.JScrollPane();
        Tabla_usuario = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 221, 87));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));

        panel_principal.setBackground(new java.awt.Color(92, 189, 110));
        panel_principal.setMaximumSize(new java.awt.Dimension(800, 500));
        panel_principal.setMinimumSize(new java.awt.Dimension(800, 500));
        panel_principal.setPreferredSize(new java.awt.Dimension(800, 500));
        panel_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_barra.setBackground(new java.awt.Color(92, 189, 110));
        panel_barra.setPreferredSize(new java.awt.Dimension(700, 40));

        usuario_modulo.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        usuario_modulo.setForeground(new java.awt.Color(255, 255, 255));
        usuario_modulo.setText("Usuarios Registrados");

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

        javax.swing.GroupLayout panel_barraLayout = new javax.swing.GroupLayout(panel_barra);
        panel_barra.setLayout(panel_barraLayout);
        panel_barraLayout.setHorizontalGroup(
            panel_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_barraLayout.createSequentialGroup()
                .addComponent(panel_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(236, 236, 236)
                .addComponent(usuario_modulo)
                .addContainerGap(352, Short.MAX_VALUE))
        );
        panel_barraLayout.setVerticalGroup(
            panel_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usuario_modulo, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(panel_atras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel_principal.add(panel_barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        border1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuarios Registrados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(102, 102, 102)))); // NOI18N

        scroll_material.setBackground(new java.awt.Color(255, 255, 255));
        scroll_material.setForeground(new java.awt.Color(255, 255, 255));

        Tabla_usuario.setBackground(new java.awt.Color(255, 255, 255));
        Tabla_usuario.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Tabla_usuario.setForeground(new java.awt.Color(0, 0, 0));
        Tabla_usuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tabla_usuario.setEnabled(false);
        Tabla_usuario.setGridColor(new java.awt.Color(255, 255, 255));
        Tabla_usuario.setRowHeight(25);
        Tabla_usuario.setRowSelectionAllowed(false);
        Tabla_usuario.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Tabla_usuario.setShowHorizontalLines(false);
        Tabla_usuario.getTableHeader().setReorderingAllowed(false);
        scroll_material.setViewportView(Tabla_usuario);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll_material, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scroll_material, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout border1Layout = new javax.swing.GroupLayout(border1);
        border1.setLayout(border1Layout);
        border1Layout.setHorizontalGroup(
            border1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(border1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        border1Layout.setVerticalGroup(
            border1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(border1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        panel_principal.add(border1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 760, 420));

        jLabel1.setBackground(new java.awt.Color(255, 221, 87));
        panel_principal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 700, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(Mostrar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mostrar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mostrar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mostrar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mostrar_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla_usuario;
    private javax.swing.JLabel atras;
    private swing.border border1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private swing.PanelRound panel_atras;
    private javax.swing.JPanel panel_barra;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JScrollPane scroll_material;
    private javax.swing.JLabel usuario_modulo;
    // End of variables declaration//GEN-END:variables
}
