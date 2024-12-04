package GUI;
import com.formdev.flatlaf.FlatDarkLaf;
import controlador.ctrl_venta;
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
import modelo.Venta;
public class Vista_Pagos_Pendientes_Venta_Granel extends javax.swing.JFrame {
    ctrl_venta ctrl = new ctrl_venta();
    public Vista_Pagos_Pendientes_Venta_Granel() {
        // Aplica el tema oscuro de FlatLaf
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
        }
        initComponents();
        personalizar_tabla();
        cargarPagosPendientesEnTabla();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_principal = new javax.swing.JPanel();
        panel_barra = new javax.swing.JPanel();
        panel_atras = new swing.PanelRound();
        atras = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panel_pagos_hechos = new swing.PanelRound();
        label_realizados = new javax.swing.JLabel();
        panel_pagos_pendientes = new swing.PanelRound();
        lable_pagados = new javax.swing.JLabel();
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

        panel_barra.setBackground(new java.awt.Color(92, 189, 110));
        panel_barra.setMaximumSize(new java.awt.Dimension(1200, 40));
        panel_barra.setMinimumSize(new java.awt.Dimension(1200, 40));

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
            .addComponent(atras, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pago-pendiente.png"))); // NOI18N
        jLabel1.setText("Pagos Pendientes");

        javax.swing.GroupLayout panel_barraLayout = new javax.swing.GroupLayout(panel_barra);
        panel_barra.setLayout(panel_barraLayout);
        panel_barraLayout.setHorizontalGroup(
            panel_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_barraLayout.createSequentialGroup()
                .addComponent(panel_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(444, 444, 444)
                .addComponent(jLabel1)
                .addContainerGap(545, Short.MAX_VALUE))
        );
        panel_barraLayout.setVerticalGroup(
            panel_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_atras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel_principal.add(panel_barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 40));

        panel_pagos_hechos.setBackground(new java.awt.Color(106, 154, 176));
        panel_pagos_hechos.setMaximumSize(new java.awt.Dimension(125, 50));
        panel_pagos_hechos.setMinimumSize(new java.awt.Dimension(125, 50));
        panel_pagos_hechos.setRoundBottomLeft(20);
        panel_pagos_hechos.setRoundBottomRight(20);
        panel_pagos_hechos.setRoundTopLeft(20);
        panel_pagos_hechos.setRoundTopRight(20);

        label_realizados.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        label_realizados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hecho-24.png"))); // NOI18N
        label_realizados.setText("PAGOS REALIZADOS");
        label_realizados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_realizados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_realizadosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_realizadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_realizadosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_pagos_hechosLayout = new javax.swing.GroupLayout(panel_pagos_hechos);
        panel_pagos_hechos.setLayout(panel_pagos_hechosLayout);
        panel_pagos_hechosLayout.setHorizontalGroup(
            panel_pagos_hechosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_realizados, javax.swing.GroupLayout.PREFERRED_SIZE, 125, Short.MAX_VALUE)
        );
        panel_pagos_hechosLayout.setVerticalGroup(
            panel_pagos_hechosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_realizados, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panel_principal.add(panel_pagos_hechos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 520, 125, 50));

        panel_pagos_pendientes.setBackground(new java.awt.Color(106, 154, 176));
        panel_pagos_pendientes.setMaximumSize(new java.awt.Dimension(125, 50));
        panel_pagos_pendientes.setMinimumSize(new java.awt.Dimension(125, 50));
        panel_pagos_pendientes.setRoundBottomLeft(20);
        panel_pagos_pendientes.setRoundBottomRight(20);
        panel_pagos_pendientes.setRoundTopLeft(20);
        panel_pagos_pendientes.setRoundTopRight(20);

        lable_pagados.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lable_pagados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-tarjeta-en-uso-24.png"))); // NOI18N
        lable_pagados.setText("MARCAR PAGADO");
        lable_pagados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lable_pagados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lable_pagadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lable_pagadosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lable_pagadosMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panel_pagos_pendientesLayout = new javax.swing.GroupLayout(panel_pagos_pendientes);
        panel_pagos_pendientes.setLayout(panel_pagos_pendientesLayout);
        panel_pagos_pendientesLayout.setHorizontalGroup(
            panel_pagos_pendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lable_pagados, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        panel_pagos_pendientesLayout.setVerticalGroup(
            panel_pagos_pendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lable_pagados, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panel_principal.add(panel_pagos_pendientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 520, 125, 50));

        panel_para_scroll.setBackground(new java.awt.Color(51, 50, 55));
        panel_para_scroll.setRoundBottomLeft(30);
        panel_para_scroll.setRoundBottomRight(30);
        panel_para_scroll.setRoundTopLeft(30);
        panel_para_scroll.setRoundTopRight(30);

        scroll_panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tabla_pagos_pendientes.setBackground(new java.awt.Color(51, 51, 55));
        tabla_pagos_pendientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Folio Venta", "Fecha y Hora Venta", "Cliente", "Total Venta", "Método Pago", "Estatus", "Teléfono del Cliente", "Cuenta Clave"
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

        javax.swing.GroupLayout panel_para_scrollLayout = new javax.swing.GroupLayout(panel_para_scroll);
        panel_para_scroll.setLayout(panel_para_scrollLayout);
        panel_para_scrollLayout.setHorizontalGroup(
            panel_para_scrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1130, Short.MAX_VALUE)
            .addGroup(panel_para_scrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_para_scrollLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(scroll_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1106, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        panel_para_scrollLayout.setVerticalGroup(
            panel_para_scrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
            .addGroup(panel_para_scrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_para_scrollLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(scroll_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        panel_principal.add(panel_para_scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 1130, 440));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseClicked
        Menu_Vista_Venta menuventa= new Menu_Vista_Venta();
        menuventa.setVisible(true);
        menuventa.setLocationRelativeTo(null);
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

    private void lable_pagadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lable_pagadosMouseEntered
        // TODO add your handling code here:
        panel_pagos_pendientes.setBackground(new Color(0x3f5c69));
        lable_pagados.setForeground(Color.BLACK);
    }//GEN-LAST:event_lable_pagadosMouseEntered

    private void lable_pagadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lable_pagadosMouseExited
        // TODO add your handling code here:
        panel_pagos_pendientes.setBackground(new Color(0x6A9AB0));
        lable_pagados.setForeground(Color.WHITE);
    }//GEN-LAST:event_lable_pagadosMouseExited

    private void lable_pagadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lable_pagadosMousePressed
        // TODO add your handling code here:
        int[] FilasSeleccionadas = tabla_pagos_pendientes.getSelectedRows();
        //verificar si hay filas seleccionadas
        if (FilasSeleccionadas.length == 0){
            JOptionPane.showMessageDialog(null, "Por favor, Seleccione al menos una fila");
            return;
        }
        //confirmacion de la accion 
        int Confirmacion = JOptionPane.showConfirmDialog(null, "¿Estas seguro de marcar esta venta como pagado?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if(Confirmacion != JOptionPane.YES_OPTION){
            return; //cerrar si el usuario selecciona no  
        }
        //  procedemos al cambio a Paagado si el usuario Dice "SI"
        
        boolean TodosActualizados = true;// Variable para verificar si todas las actualizaciones fueron exitosas
        // Usar una lista para almacenar filas a eliminar
        List<Integer> filasAEliminar = new ArrayList<>();
        // Iterar sobre cada fila seleccionada en orden inverso
        for(int i = FilasSeleccionadas.length -1; i>=0; i--){
            int Fila = FilasSeleccionadas[i];
            //comprobar si la fila es valida 
            if(Fila >= 0 && Fila< tabla_pagos_pendientes.getRowCount()){
                //obtener el folio de la tabla
                int Folio = (int)tabla_pagos_pendientes.getValueAt(Fila, 0);
                // Llamar al método de ctrl_compra para marcar como pagado                
                boolean Actualizado = ctrl.MarcarComoPagado(Folio);
                if(Actualizado){
                    filasAEliminar.add(Fila);
                }else{
                    TodosActualizados = false;
                }                    
            }
        }
        // Eliminar las filas después de la iteración para evitar problemas de índice
        for(int fila : filasAEliminar){
            ((DefaultTableModel) tabla_pagos_pendientes.getModel()).removeRow(fila);
        }
        // Mensaje final sobre el resultado de la acción
        if (TodosActualizados) {
            JOptionPane.showMessageDialog(null, "El estado de la Venta ha sido actualizado a 'Pagado'.");
        } else {
            JOptionPane.showMessageDialog(null, "Error al actualizar el estado de al menos una venta.");
        } 
    }//GEN-LAST:event_lable_pagadosMousePressed

    private void label_realizadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_realizadosMouseEntered
        // TODO add your handling code here:
        panel_pagos_hechos.setBackground(new Color(0x3f5c69));
        label_realizados.setForeground(Color.BLACK);
        
    }//GEN-LAST:event_label_realizadosMouseEntered

    private void label_realizadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_realizadosMouseExited
        // TODO add your handling code here:
        panel_pagos_hechos.setBackground(new Color(0x6A9AB0));
        label_realizados.setForeground(Color.WHITE);
    }//GEN-LAST:event_label_realizadosMouseExited

    private void label_realizadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_realizadosMouseClicked
        // TODO add your handling code here:
        Vista_Pagos_Pagados_Venta_Granel pagados = new  Vista_Pagos_Pagados_Venta_Granel();
        pagados.setVisible(true);
        pagados.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_label_realizadosMouseClicked

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
            java.util.logging.Logger.getLogger(Vista_Pagos_Pendientes_Venta_Granel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Pagos_Pendientes_Venta_Granel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Pagos_Pendientes_Venta_Granel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Pagos_Pendientes_Venta_Granel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Vista_Pagos_Pendientes_Venta_Granel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label_realizados;
    private javax.swing.JLabel lable_pagados;
    private swing.PanelRound panel_atras;
    private javax.swing.JPanel panel_barra;
    private swing.PanelRound panel_pagos_hechos;
    private swing.PanelRound panel_pagos_pendientes;
    private swing.PanelRound panel_para_scroll;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JScrollPane scroll_panel;
    private javax.swing.JTable tabla_pagos_pendientes;
    // End of variables declaration//GEN-END:variables
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
    ctrl_venta ctrlventas = new ctrl_venta();
    public void cargarPagosPendientesEnTabla(){
        DefaultTableModel modelo = (DefaultTableModel) tabla_pagos_pendientes.getModel();
        modelo.setRowCount(0);  // Limpiar la tabla antes de cargar nuevos datos
        List<Venta> listaventa = ctrlventas.obtenerPagosPendientes();
        for (Venta venta : listaventa) {
        Object[] fila = new Object[8];  // Ajusta el tamaño del array según las columnas que tienes
        fila[0] = venta.getFolio_venta();
        fila[1] = venta.getFecha_venta();
        fila[2] = venta.getNombre_cliente();
        fila[3] = venta.getTotal_venta();
        fila[4] = venta.getMetodo_pago();
        fila[5] = venta.getStatus();
        fila[6] = venta.getTelefono();
        fila[7] = venta.getReferencia();
        modelo.addRow(fila);
    } 
    }
   
}
