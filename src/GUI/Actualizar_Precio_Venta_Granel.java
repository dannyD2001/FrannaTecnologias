package GUI;
import com.formdev.flatlaf.FlatDarkLaf;
import controlador.ctrl_material;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.List;
import java.util.Set;
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
public class Actualizar_Precio_Venta_Granel extends javax.swing.JFrame {

    public Actualizar_Precio_Venta_Granel() {
        // Aplica el tema oscuro de FlatLaf
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
        }
        initComponents();
        eliminar_borde();
        Personalizar_tabla();
        cargarTabla();
        agregarListenerSeleccionTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_principal = new javax.swing.JPanel();
        panel_barra = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panel_atras = new swing.PanelRound();
        atras = new javax.swing.JLabel();
        panel_para_scroll = new swing.PanelRound();
        scroll_panel = new javax.swing.JScrollPane();
        tabla_precios = new javax.swing.JTable();
        panelRound1 = new swing.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        material = new javax.swing.JTextField();
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
        panel_barra.setPreferredSize(new java.awt.Dimension(100, 40));

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/money.png"))); // NOI18N
        jLabel1.setText("Actualizar Precio Para Venta");

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
            .addGroup(panel_barraLayout.createSequentialGroup()
                .addComponent(panel_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(400, 400, 400)
                .addComponent(jLabel1)
                .addContainerGap(500, Short.MAX_VALUE))
        );
        panel_barraLayout.setVerticalGroup(
            panel_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(panel_atras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel_principal.add(panel_barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

        panel_para_scroll.setBackground(new java.awt.Color(51, 50, 55));
        panel_para_scroll.setPreferredSize(new java.awt.Dimension(800, 400));
        panel_para_scroll.setRoundBottomLeft(20);
        panel_para_scroll.setRoundBottomRight(20);
        panel_para_scroll.setRoundTopLeft(20);
        panel_para_scroll.setRoundTopRight(20);

        tabla_precios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Material", "Material", "Precio I", "Precio II", "Precio III"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_precios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabla_precios.getTableHeader().setReorderingAllowed(false);
        scroll_panel.setViewportView(tabla_precios);
        if (tabla_precios.getColumnModel().getColumnCount() > 0) {
            tabla_precios.getColumnModel().getColumn(1).setResizable(false);
            tabla_precios.getColumnModel().getColumn(2).setResizable(false);
            tabla_precios.getColumnModel().getColumn(3).setResizable(false);
            tabla_precios.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout panel_para_scrollLayout = new javax.swing.GroupLayout(panel_para_scroll);
        panel_para_scroll.setLayout(panel_para_scrollLayout);
        panel_para_scrollLayout.setHorizontalGroup(
            panel_para_scrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_para_scrollLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_para_scrollLayout.setVerticalGroup(
            panel_para_scrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_para_scrollLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_principal.add(panel_para_scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 800, 400));

        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Material");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Precio I");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Precio II");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Precio III");

        material.setEditable(false);
        material.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        material.setBorder(null);

        precio1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        precio1.setBorder(null);

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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_btnMouseClicked(evt);
            }
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
            .addComponent(label_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addComponent(panel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1)
                    .addComponent(material)
                    .addComponent(precio1)
                    .addComponent(precio2)
                    .addComponent(precio3, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(material, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precio1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precio2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(precio3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(panel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        panel_principal.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 70, 330, 320));

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
        Menu_Vista_Venta menucompra= new Menu_Vista_Venta();
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

    private void label_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_btnMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_label_btnMouseClicked

    private void label_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_btnMousePressed
        // TODO add your handling code here:
        int Seleccion  = tabla_precios.getSelectedRow();
        if (Seleccion  == -1){
            JOptionPane.showMessageDialog(null, "Seleccion un registro para Actualizar");
            return;
        }
        //validar los campos del texto
        if (!precio1.getText().matches("\\d+(\\.\\d+)?") || 
            !precio2.getText().matches("\\d+(\\.\\d+)?") || 
            !precio3.getText().matches("\\d+(\\.\\d+)?")) {
            JOptionPane.showMessageDialog(this, "Ingrese valores numéricos válidos para los precios.");
            return;
        }
        //
        String nombre = tabla_precios.getValueAt(Seleccion, 1).toString();
        String newprecio = tabla_precios.getValueAt(Seleccion, 2).toString();
        String newprecio2 = tabla_precios.getValueAt(Seleccion, 3).toString();
        String newprecio3 = tabla_precios.getValueAt(Seleccion, 4).toString();
        //compracio del precio ingresado con el que esta en la tabla
        if(material.getText().equals(nombre) &&
                precio1.getText().equals(newprecio) &&
                precio2.getText().equals(newprecio2) &&
                precio3.getText().equals(newprecio3)){
            JOptionPane.showMessageDialog(null, "No hay cambios realizados para Actualizar");
            return;        
        }
        //confirmacion para actualizar 
        // Confirmar antes de actualizar
        int confirm = JOptionPane.showConfirmDialog(this, 
                "¿Está seguro de que quiere realizar el cambio en el precio?", 
                "Confirmar actualización", 
                JOptionPane.YES_NO_OPTION);

        if (confirm != JOptionPane.YES_OPTION) {
            return; // Salir si el usuario selecciona "No"
        }
        //intsnacinado el controlador 
        ctrl_material ctrlmate = new ctrl_material();
        //captura los datos
        int id_materia = Integer.parseInt(tabla_precios.getValueAt(Seleccion, 0).toString());
        String nombree = material.getText();
        double precio_1= Double.parseDouble(precio1.getText());
        double precio_2 = Double.parseDouble(precio2.getText());
        double precio_3 = Double.parseDouble(precio3.getText());
        //crear objeto del material 
        
        Material material = new Material();
        material.setNombre_material(nombree);
        material.setPrecio_venta(precio_1);
        material.setPrecio_venta2(precio_2);
        material.setPrecio_venta3(precio_3);
        material.setId_material(id_materia);
        //actualizar el registro en la base de datos 
        
        if(ctrlmate.actualizarPrecioVenta(material)){
            JOptionPane.showMessageDialog(null, "Precio Actualizado correctamente");
            cargarTabla();
        
        }else{
            JOptionPane.showMessageDialog(null, "Error al Actualizar el precio");
        }
        
    }//GEN-LAST:event_label_btnMousePressed

    private void label_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_btnMouseEntered
        // TODO add your handling code here:
        //4a7537
        panel_btn.setBackground(new Color(0x4a7537));
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
            java.util.logging.Logger.getLogger(Actualizar_Precio_Venta_Granel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actualizar_Precio_Venta_Granel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actualizar_Precio_Venta_Granel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actualizar_Precio_Venta_Granel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Actualizar_Precio_Venta_Granel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atras;
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
    private javax.swing.JTextField material;
    private swing.PanelRound panelRound1;
    private swing.PanelRound panel_atras;
    private javax.swing.JPanel panel_barra;
    private swing.PanelRound panel_btn;
    private swing.PanelRound panel_para_scroll;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JTextField precio1;
    private javax.swing.JTextField precio2;
    private javax.swing.JTextField precio3;
    private javax.swing.JScrollPane scroll_panel;
    private javax.swing.JTable tabla_precios;
    // End of variables declaration//GEN-END:variables
    public void eliminar_borde(){
        material.setBackground(new java.awt.Color(0,0,0,1));
        precio1.setBackground(new java.awt.Color(0,0,0,1));
        precio2.setBackground(new java.awt.Color(0,0,0,1));
        precio3.setBackground(new java.awt.Color(0,0,0,1));
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
    //para cargar tabla
    private void cargarTabla() {
    ctrl_material controlador = new ctrl_material();
    List<Material> listaMateriales = controlador.consultarMateriales2();

    DefaultTableModel modelo = (DefaultTableModel) tabla_precios.getModel();
    modelo.setRowCount(0); // Limpiar la tabla

    for (Material material : listaMateriales) {
        modelo.addRow(new Object[]{
            material.getId_material(),
            material.getNombre_material(),
            material.getPrecio_venta(),
            material.getPrecio_venta2(),
            material.getPrecio_venta3()
        });
    }
    }
    private void agregarListenerSeleccionTabla() {
    tabla_precios.getSelectionModel().addListSelectionListener(e -> {
        if (!e.getValueIsAdjusting()) { // Evitar múltiples eventos al mismo tiempo
            int selectedRow = tabla_precios.getSelectedRow();
            if (selectedRow != -1) {
                // Rellenar los JTextField con los datos de la fila seleccionada
                material.setText(tabla_precios.getValueAt(selectedRow, 1).toString());
                precio1.setText(tabla_precios.getValueAt(selectedRow, 2).toString());
                precio2.setText(tabla_precios.getValueAt(selectedRow, 3).toString());
                precio3.setText(tabla_precios.getValueAt(selectedRow, 4).toString());
            }
        }
    });
    }
    
    //aca para venta actualizar ya esta la consulta solo falta la logia en el presed del boton checa mañana
    
}
