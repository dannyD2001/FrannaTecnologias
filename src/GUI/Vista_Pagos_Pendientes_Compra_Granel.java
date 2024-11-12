package GUI;
import com.formdev.flatlaf.FlatDarkLaf;
import controlador.ctrl_compra;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import modelo.Compra;
public class Vista_Pagos_Pendientes_Compra_Granel extends javax.swing.JFrame {
    public Vista_Pagos_Pendientes_Compra_Granel() {
        // Aplica el tema oscuro de FlatLaf
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
        }
        initComponents();
        //llamar el metodo de pagos pendientes
        cargarPagosPendientesEnTabla();
        personalizar_tabla();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_principal = new javax.swing.JPanel();
        barra_principal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panel_atras = new swing.PanelRound();
        atras = new javax.swing.JLabel();
        btn_pagos_realizados = new swing.PanelRound();
        jLabel3 = new javax.swing.JLabel();
        btn_pago = new swing.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        panel_para_scroll = new swing.PanelRound();
        scroll_panel = new javax.swing.JScrollPane();
        tabla_pagos_pendientes = new javax.swing.JTable();

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

        barra_principal.setBackground(new java.awt.Color(92, 189, 110));
        barra_principal.setPreferredSize(new java.awt.Dimension(1200, 40));

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Pagos Pendientes");

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

        javax.swing.GroupLayout barra_principalLayout = new javax.swing.GroupLayout(barra_principal);
        barra_principal.setLayout(barra_principalLayout);
        barra_principalLayout.setHorizontalGroup(
            barra_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barra_principalLayout.createSequentialGroup()
                .addComponent(panel_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(436, 436, 436)
                .addComponent(jLabel1)
                .addContainerGap(581, Short.MAX_VALUE))
        );
        barra_principalLayout.setVerticalGroup(
            barra_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_atras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel_principal.add(barra_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 40));

        btn_pagos_realizados.setBackground(new java.awt.Color(106, 154, 176));
        btn_pagos_realizados.setRoundBottomLeft(20);
        btn_pagos_realizados.setRoundBottomRight(20);
        btn_pagos_realizados.setRoundTopLeft(20);
        btn_pagos_realizados.setRoundTopRight(20);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PAGOS REALIZADOS");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout btn_pagos_realizadosLayout = new javax.swing.GroupLayout(btn_pagos_realizados);
        btn_pagos_realizados.setLayout(btn_pagos_realizadosLayout);
        btn_pagos_realizadosLayout.setHorizontalGroup(
            btn_pagos_realizadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        btn_pagos_realizadosLayout.setVerticalGroup(
            btn_pagos_realizadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panel_principal.add(btn_pagos_realizados, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 520, 110, 50));

        btn_pago.setBackground(new java.awt.Color(106, 154, 176));
        btn_pago.setRoundBottomLeft(20);
        btn_pago.setRoundBottomRight(20);
        btn_pago.setRoundTopLeft(20);
        btn_pago.setRoundTopRight(20);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MARCAR PAGADO");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout btn_pagoLayout = new javax.swing.GroupLayout(btn_pago);
        btn_pago.setLayout(btn_pagoLayout);
        btn_pagoLayout.setHorizontalGroup(
            btn_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        btn_pagoLayout.setVerticalGroup(
            btn_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panel_principal.add(btn_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 520, 110, 50));

        panel_para_scroll.setBackground(new java.awt.Color(51, 50, 55));
        panel_para_scroll.setRoundBottomLeft(30);
        panel_para_scroll.setRoundBottomRight(30);
        panel_para_scroll.setRoundTopLeft(30);
        panel_para_scroll.setRoundTopRight(30);

        tabla_pagos_pendientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Folio Compra", "Fecha Compra", "Proveedor", "Total Compra", "Método Pago", "Estatus", "Teléfono del Proveedor", "Cuenta Clave"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scroll_panel.setViewportView(tabla_pagos_pendientes);
        if (tabla_pagos_pendientes.getColumnModel().getColumnCount() > 0) {
            tabla_pagos_pendientes.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        javax.swing.GroupLayout panel_para_scrollLayout = new javax.swing.GroupLayout(panel_para_scroll);
        panel_para_scroll.setLayout(panel_para_scrollLayout);
        panel_para_scrollLayout.setHorizontalGroup(
            panel_para_scrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_para_scrollLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1116, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_para_scrollLayout.setVerticalGroup(
            panel_para_scrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_para_scrollLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_principal.add(panel_para_scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 1140, 420));

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
        panel_atras.setBackground(new Color(0x5CBD6E));
        atras.setForeground(Color.BLACK);
    }//GEN-LAST:event_atrasMouseExited

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        // Obtener las filas seleccionadas
        int[] filasSeleccionadas = tabla_pagos_pendientes.getSelectedRows();
        // Verificar si hay filas seleccionadas
        if (filasSeleccionadas.length == 0) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione al menos una fila.");
            return; // Finaliza la ejecución si no hay filas seleccionadas
        }
        // Confirmar la acción
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de marcar estas compras como pagadas?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (confirmacion != JOptionPane.YES_OPTION) {
            return; // Finaliza la ejecución si el usuario selecciona NO o cierra el diálogo
        }
        // Proceder con el cambio de estado solo si se confirma
        ctrl_compra ctrl = new ctrl_compra();
        boolean todosActualizados = true; // Variable para verificar si todas las actualizaciones fueron exitosas
        // Usar una lista para almacenar filas a eliminar
        List<Integer> filasAEliminar = new ArrayList<>();
        // Iterar sobre cada fila seleccionada en orden inverso
        for (int i = filasSeleccionadas.length - 1; i >= 0; i--) {
            int fila = filasSeleccionadas[i];
            // Comprobar si la fila es válida
            if (fila >= 0 && fila < tabla_pagos_pendientes.getRowCount()) {
                // Obtener el folio_compra de la fila seleccionada
                int folio = (int) tabla_pagos_pendientes.getValueAt(fila, 0); // Suponiendo que la columna 0 tiene el folio_compra
                // Llamar al método de ctrl_compra para marcar como pagado
                boolean actualizado = ctrl.marcarComoPagado(folio);
                if (actualizado) {
                    // Si se actualiza con éxito, agregar la fila a la lista de eliminación
                    filasAEliminar.add(fila);
                } else {
                    todosActualizados = false; // Indica que no se pudo actualizar al menos una fila
                }
            }
        }
        // Eliminar las filas después de la iteración para evitar problemas de índice
        for (int fila : filasAEliminar) {
            ((DefaultTableModel) tabla_pagos_pendientes.getModel()).removeRow(fila);
        }
        // Mensaje final sobre el resultado de la acción
        if (todosActualizados) {
            JOptionPane.showMessageDialog(null, "El estado de las compras ha sido actualizado a 'Pagado'.");
        } else {
            JOptionPane.showMessageDialog(null, "Error al actualizar el estado de al menos una compra.");
        }            
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
  
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        // TODO add your handling code here:
        Vista_Pagos_Pagados_Compra_Granel pagosPagados = new Vista_Pagos_Pagados_Compra_Granel();
        pagosPagados.setVisible(true);
        pagosPagados.setLocationRelativeTo(null);
        this.dispose();
        //revisa no apareze la venta de pagos Pagados
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        btn_pago.setBackground(new Color(0x3f5c69));
        jLabel2.setForeground(Color.BLACK);
        
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        btn_pago.setBackground(new Color(0x6A9AB0));
        jLabel2.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
        btn_pagos_realizados.setBackground(new Color(0x3f5c69));
        jLabel3.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
        btn_pagos_realizados.setBackground(new Color(0x6A9AB0));
        jLabel3.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel3MouseExited
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
            java.util.logging.Logger.getLogger(Vista_Pagos_Pendientes_Compra_Granel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Pagos_Pendientes_Compra_Granel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Pagos_Pendientes_Compra_Granel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Pagos_Pendientes_Compra_Granel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Vista_Pagos_Pendientes_Compra_Granel vistaPago = new Vista_Pagos_Pendientes_Compra_Granel();
                vistaPago.setVisible(true);
                vistaPago.setLocationRelativeTo(null);
                vistaPago.dispose();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atras;
    private javax.swing.JPanel barra_principal;
    private swing.PanelRound btn_pago;
    private swing.PanelRound btn_pagos_realizados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private swing.PanelRound panel_atras;
    private swing.PanelRound panel_para_scroll;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JScrollPane scroll_panel;
    private javax.swing.JTable tabla_pagos_pendientes;
    // End of variables declaration//GEN-END:variables
    ctrl_compra ctrlcompra = new ctrl_compra();
    public void cargarPagosPendientesEnTabla() {
    DefaultTableModel modelo = (DefaultTableModel) tabla_pagos_pendientes.getModel();
    modelo.setRowCount(0);  // Limpiar la tabla antes de cargar nuevos datos
    List<Compra> listaCompras = ctrlcompra.obtenerPagosPendientes();

    for (Compra compra : listaCompras) {
        Object[] fila = new Object[8];  // Ajusta el tamaño del array según las columnas que tienes
        fila[0] = compra.getFolio_compra();
        fila[1] = compra.getFecha();
        fila[2] = compra.getNombre_provedor();
        fila[3] = compra.getTotal_compra();
        fila[4] = compra.getMetodo_pago();
        fila[5] = compra.getStatus();
        fila[6] = compra.getTelefono_provedor();
        fila[7] = compra.getReferencia();
        
        modelo.addRow(fila);
    }
    }
    //personalizar tabla
    public void personalizar_tabla(){
        //Personalizamos la tablas 
        tabla_pagos_pendientes.setBackground(new Color(0x333337));  // Fondo de las celdas
        tabla_pagos_pendientes.setForeground(new Color(000,000,000));  // Color del texto de las celdas
        tabla_pagos_pendientes.setGridColor(new Color(0x333337));  // Líneas de celda más suaves
        tabla_pagos_pendientes.setRowHeight(25);  // Ajustar la altura de las filas
        tabla_pagos_pendientes.setFont(new Font("sansserif", Font.PLAIN, 12));//ME PARECE, ES FUENTE DEL CONTENIDO DE LA TABLA
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
        for (int i = 0; i < tabla_pagos_pendientes.getColumnCount(); i++) {
            tabla_pagos_pendientes.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
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
        for (int i = 0; i < tabla_pagos_pendientes.getColumnModel().getColumnCount(); i++) {
            tabla_pagos_pendientes.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
    }
}
