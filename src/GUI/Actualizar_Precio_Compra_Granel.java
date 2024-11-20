package GUI;
import com.formdev.flatlaf.FlatDarkLaf;
import controlador.ctrl_material;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import modelo.Material;

public class Actualizar_Precio_Compra_Granel extends javax.swing.JFrame {
    public Actualizar_Precio_Compra_Granel() {
        // Aplica el tema oscuro de FlatLaf
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
        }
        initComponents();
        cargarTabla();
        Personalizar_tabla();
        agregarListenerSeleccionTabla();
        opciones_extras();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_principal = new javax.swing.JPanel();
        panel_barra = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panel_atras1 = new swing.PanelRound();
        atras1 = new javax.swing.JLabel();
        panel_para_tabla = new swing.PanelRound();
        scroll_panel = new javax.swing.JScrollPane();
        tabla_precios = new javax.swing.JTable();
        panel_datos_cambios = new swing.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        precio1 = new javax.swing.JTextField();
        precio2 = new javax.swing.JTextField();
        precio3 = new javax.swing.JTextField();
        panel_btn = new swing.PanelRound();
        label_btn = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

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

        jLabel5.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Actualizar Precio Para Compra");

        panel_atras1.setBackground(new java.awt.Color(92, 189, 110));
        panel_atras1.setPreferredSize(new java.awt.Dimension(70, 40));
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
            .addComponent(atras1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        panel_atras1Layout.setVerticalGroup(
            panel_atras1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(atras1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_barraLayout = new javax.swing.GroupLayout(panel_barra);
        panel_barra.setLayout(panel_barraLayout);
        panel_barraLayout.setHorizontalGroup(
            panel_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_barraLayout.createSequentialGroup()
                .addComponent(panel_atras1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(411, 411, 411)
                .addComponent(jLabel5)
                .addContainerGap(502, Short.MAX_VALUE))
        );
        panel_barraLayout.setVerticalGroup(
            panel_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panel_atras1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        panel_principal.add(panel_barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 40));

        panel_para_tabla.setBackground(new java.awt.Color(51, 50, 55));
        panel_para_tabla.setMaximumSize(new java.awt.Dimension(800, 400));
        panel_para_tabla.setMinimumSize(new java.awt.Dimension(800, 400));
        panel_para_tabla.setRoundBottomLeft(30);
        panel_para_tabla.setRoundBottomRight(30);
        panel_para_tabla.setRoundTopLeft(30);
        panel_para_tabla.setRoundTopRight(30);

        scroll_panel.setBackground(new java.awt.Color(51, 50, 55));

        tabla_precios.setBackground(new java.awt.Color(51, 50, 55));
        tabla_precios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Material", "Material", "Precio I", "Precio II", "Precio III"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scroll_panel.setViewportView(tabla_precios);
        if (tabla_precios.getColumnModel().getColumnCount() > 0) {
            tabla_precios.getColumnModel().getColumn(0).setResizable(false);
            tabla_precios.getColumnModel().getColumn(1).setResizable(false);
            tabla_precios.getColumnModel().getColumn(2).setResizable(false);
            tabla_precios.getColumnModel().getColumn(3).setResizable(false);
            tabla_precios.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout panel_para_tablaLayout = new javax.swing.GroupLayout(panel_para_tabla);
        panel_para_tabla.setLayout(panel_para_tablaLayout);
        panel_para_tablaLayout.setHorizontalGroup(
            panel_para_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_para_tablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_para_tablaLayout.setVerticalGroup(
            panel_para_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_para_tablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_principal.add(panel_para_tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 800, 400));

        panel_datos_cambios.setBackground(new java.awt.Color(51, 50, 55));
        panel_datos_cambios.setRoundBottomLeft(30);
        panel_datos_cambios.setRoundBottomRight(30);
        panel_datos_cambios.setRoundTopLeft(30);
        panel_datos_cambios.setRoundTopRight(30);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Material");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Precio I");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Precio II");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Precio III");

        nombre.setEditable(false);
        nombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        nombre.setBorder(null);
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        precio1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        precio1.setBorder(null);
        precio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio1ActionPerformed(evt);
            }
        });

        precio2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        precio2.setBorder(null);

        precio3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        precio3.setBorder(null);

        panel_btn.setBackground(new java.awt.Color(106, 168, 79));
        panel_btn.setRoundBottomLeft(20);
        panel_btn.setRoundBottomRight(20);
        panel_btn.setRoundTopLeft(20);
        panel_btn.setRoundTopRight(20);

        label_btn.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        label_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_btn.setText("ACTUALIZAR");
        label_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_btnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                label_btnMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panel_btnLayout = new javax.swing.GroupLayout(panel_btn);
        panel_btn.setLayout(panel_btnLayout);
        panel_btnLayout.setHorizontalGroup(
            panel_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panel_btnLayout.setVerticalGroup(
            panel_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_datos_cambiosLayout = new javax.swing.GroupLayout(panel_datos_cambios);
        panel_datos_cambios.setLayout(panel_datos_cambiosLayout);
        panel_datos_cambiosLayout.setHorizontalGroup(
            panel_datos_cambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datos_cambiosLayout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addComponent(panel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
            .addGroup(panel_datos_cambiosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_datos_cambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(panel_datos_cambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(precio1)
                    .addComponent(precio2)
                    .addComponent(precio3)
                    .addComponent(nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator4))
                .addContainerGap())
        );
        panel_datos_cambiosLayout.setVerticalGroup(
            panel_datos_cambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datos_cambiosLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panel_datos_cambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nombre)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_datos_cambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precio1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(panel_datos_cambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precio2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(panel_datos_cambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precio3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        panel_principal.add(panel_datos_cambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 80, 310, 340));

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

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void precio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precio1ActionPerformed

    private void label_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_btnMousePressed
        // Verificar si hay una fila seleccionada
        int selectedRow = tabla_precios.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un registro para actualizar.");
            return;
        }

        // Validar los campos de texto
        if (!precio1.getText().matches("\\d+(\\.\\d+)?") || 
            !precio2.getText().matches("\\d+(\\.\\d+)?") || 
            !precio3.getText().matches("\\d+(\\.\\d+)?")) {
            JOptionPane.showMessageDialog(this, "Ingrese valores numéricos válidos para los precios.");
            return;
        }

        // Obtener los valores actuales de la fila seleccionada
        String nombreTabla = tabla_precios.getValueAt(selectedRow, 1).toString();
        String precio1Tabla = tabla_precios.getValueAt(selectedRow, 2).toString();
        String precio2Tabla = tabla_precios.getValueAt(selectedRow, 3).toString();
        String precio3Tabla = tabla_precios.getValueAt(selectedRow, 4).toString();

        // Comparar los valores originales con los valores ingresados
        if (nombre.getText().equals(nombreTabla) &&
            precio1.getText().equals(precio1Tabla) &&
            precio2.getText().equals(precio2Tabla) &&
            precio3.getText().equals(precio3Tabla)) {
            JOptionPane.showMessageDialog(this, "No hay cambios realizados para actualizar.");
            return;
        }

        // Confirmar antes de actualizar
        int confirm = JOptionPane.showConfirmDialog(this, 
                "¿Está seguro de que quiere realizar el cambio en el precio?", 
                "Confirmar actualización", 
                JOptionPane.YES_NO_OPTION);

        if (confirm != JOptionPane.YES_OPTION) {
            return; // Salir si el usuario selecciona "No"
        }

        // Capturar los datos de los JTextField
        String nombreMaterial = nombre.getText();
        double precioI = Double.parseDouble(precio1.getText());
        double precioII = Double.parseDouble(precio2.getText());
        double precioIII = Double.parseDouble(precio3.getText());
        int idMaterial = Integer.parseInt(tabla_precios.getValueAt(selectedRow, 0).toString()); // ID columna  0
        ctrl_material materiales = new ctrl_material();
        // Crear objeto Material
        Material material = new Material();
        material.setNombre_material(nombreMaterial);
        material.setPrecio_compra(precioI);
        material.setPrecio_compra2(precioII);
        material.setPrecio_compra3(precioIII);
        material.setId_material(idMaterial);
        
        // Actualizar el registro en la base de datos
        if (materiales.actualizarPrecio(material)) {
            JOptionPane.showMessageDialog(this, "Precio actualizado correctamente.");
            cargarTabla(); // Método que recarga los datos en la tabla
        } else {
            JOptionPane.showMessageDialog(this, "Error al actualizar el precio.");
        }
    }//GEN-LAST:event_label_btnMousePressed

    private void atras1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atras1MouseClicked
        Menu_Vista_Compra menucompra= new Menu_Vista_Compra();
        menucompra.setVisible(true);
        menucompra.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_atras1MouseClicked

    private void atras1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atras1MouseEntered
        // TODO add your handling code here: 999999
        panel_atras1.setBackground(new Color(0xA0A580));
        atras1.setForeground(Color.WHITE);
    }//GEN-LAST:event_atras1MouseEntered

    private void atras1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atras1MouseExited
        // TODO add your handling code here:
        panel_atras1.setBackground(new Color(0x5CBD6E));
        atras1.setForeground(Color.BLACK);
    }//GEN-LAST:event_atras1MouseExited

    private void label_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_btnMouseEntered
        // TODO add your handling code here:
        panel_btn.setBackground(new Color(0x54863f));
        label_btn.setForeground(Color.BLACK);
        
    }//GEN-LAST:event_label_btnMouseEntered

    private void label_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_btnMouseExited
        // TODO add your handling code here:
        panel_btn.setBackground(new Color(0x6aa84f));
        label_btn.setForeground(Color.WHITE);
    }//GEN-LAST:event_label_btnMouseExited

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
            java.util.logging.Logger.getLogger(Actualizar_Precio_Compra_Granel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actualizar_Precio_Compra_Granel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actualizar_Precio_Compra_Granel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actualizar_Precio_Compra_Granel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Actualizar_Precio_Compra_Granel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atras1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel label_btn;
    private javax.swing.JTextField nombre;
    private swing.PanelRound panel_atras1;
    private javax.swing.JPanel panel_barra;
    private swing.PanelRound panel_btn;
    private swing.PanelRound panel_datos_cambios;
    private swing.PanelRound panel_para_tabla;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JTextField precio1;
    private javax.swing.JTextField precio2;
    private javax.swing.JTextField precio3;
    private javax.swing.JScrollPane scroll_panel;
    private javax.swing.JTable tabla_precios;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
    ctrl_material controlador = new ctrl_material();
    List<Material> listaMateriales = controlador.consultarMateriales();

    DefaultTableModel modelo = (DefaultTableModel) tabla_precios.getModel();
    modelo.setRowCount(0); // Limpiar la tabla

    for (Material material : listaMateriales) {
        modelo.addRow(new Object[]{
            material.getId_material(),
            material.getNombre_material(),
            material.getPrecio_compra(),
            material.getPrecio_compra2(),
            material.getPrecio_compra3()
        });
    }
    }
    //personalizar tabla
    public void Personalizar_tabla(){
    // Configuración de la tabla
    tabla_precios.setBackground(new Color(0x333237));  // Fondo de las celdas
    tabla_precios.setForeground(new Color(000,000,000));  // Color del texto de las celdas
    tabla_precios.setGridColor(new Color(255, 255, 255));  // Líneas de celda más suaves
    tabla_precios.setRowHeight(20);  // Ajustar la altura de las filas
    tabla_precios.setFont(new Font("sansserif", Font.PLAIN, 14));  // Fuente general de las celdas
    tabla_precios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // Permitir solo una selección de fila
    tabla_precios.setCellSelectionEnabled(false); // Desactivar selección de celdas
    tabla_precios.setRowSelectionAllowed(true); // Habilitar la selección por fila
    // Configurar el JScrollPane sin borde
    scroll_panel.setBorder(BorderFactory.createEmptyBorder());
    scroll_panel.setBackground(new Color(0x333237));
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
    for (int i = 0; i < tabla_precios.getColumnCount(); i++) {
        tabla_precios.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
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
    for (int i = 0; i < tabla_precios.getColumnModel().getColumnCount(); i++) {
        tabla_precios.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
    }
    //0,0,0,1                
    //scroll_ventas.setBackground(Color.WHITE);
    scroll_panel.setBackground(new Color(0,0,1));
    scroll_panel.setForeground(Color.WHITE);
    }
    private void agregarListenerSeleccionTabla() {
    tabla_precios.getSelectionModel().addListSelectionListener(e -> {
        if (!e.getValueIsAdjusting()) { // Evitar múltiples eventos al mismo tiempo
            int selectedRow = tabla_precios.getSelectedRow();
            if (selectedRow != -1) {
                // Rellenar los JTextField con los datos de la fila seleccionada
                nombre.setText(tabla_precios.getValueAt(selectedRow, 1).toString());
                precio1.setText(tabla_precios.getValueAt(selectedRow, 2).toString());
                precio2.setText(tabla_precios.getValueAt(selectedRow, 3).toString());
                precio3.setText(tabla_precios.getValueAt(selectedRow, 4).toString());
            }
        }
    });
    }
    public void opciones_extras(){
        nombre.setBackground(new java.awt.Color(0,0,0,1));
        precio1.setBackground(new java.awt.Color(0,0,0,1));
        precio2.setBackground(new java.awt.Color(0,0,0,1));
        precio3.setBackground(new java.awt.Color(0,0,0,1));
    }

}
