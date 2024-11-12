package GUI;
import Util.AppContext;
import com.formdev.flatlaf.FlatDarkLaf;
import controlador.ctrl_material;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.text.Normalizer;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import modelo.Material;
import modelo.usuario;
public class Inventario_Material extends javax.swing.JFrame {
    DefaultTableModel modelo;
    public Inventario_Material() {
        // Aplica el tema oscuro de FlatLaf
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
        }        
        initComponents();
        ListarMateria();
        //quitar fondo de textfield
        texto_busqueda.setBackground(new java.awt.Color(0,0,0,1));
        //Recuperar usuario actual   
        usuario usuarioActual = AppContext.getUsuarioActual();
        //para el usuario
        nombre_usuario.setText(usuarioActual.getNombre());
        personalizar_tabla();
   

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panel_principal = new javax.swing.JPanel();
        barra = new javax.swing.JPanel();
        panel_atras = new swing.PanelRound();
        atras = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelRound1 = new swing.PanelRound();
        scroll_material = new javax.swing.JScrollPane();
        tabla_material = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        panelRound2 = new swing.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombre_usuario = new javax.swing.JLabel();
        texto_busqueda = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        panel_busqueda = new swing.PanelRound();
        busqueda = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 600));
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setUndecorated(true);

        panel_principal.setBackground(new java.awt.Color(92, 189, 110));
        panel_principal.setMaximumSize(new java.awt.Dimension(1200, 600));
        panel_principal.setMinimumSize(new java.awt.Dimension(1200, 600));
        panel_principal.setPreferredSize(new java.awt.Dimension(1200, 600));
        panel_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barra.setBackground(new java.awt.Color(92, 189, 110));
        barra.setPreferredSize(new java.awt.Dimension(700, 40));

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
        jLabel1.setText("Stock Materiales(granel)");

        javax.swing.GroupLayout barraLayout = new javax.swing.GroupLayout(barra);
        barra.setLayout(barraLayout);
        barraLayout.setHorizontalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraLayout.createSequentialGroup()
                .addComponent(panel_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 440, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(23, 23, 23))
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(panel_atras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel_principal.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 40));

        panelRound1.setBackground(new java.awt.Color(51, 50, 55));
        panelRound1.setRoundBottomLeft(30);
        panelRound1.setRoundBottomRight(30);
        panelRound1.setRoundTopLeft(30);
        panelRound1.setRoundTopRight(30);

        scroll_material.setBackground(new java.awt.Color(51, 50, 55));
        scroll_material.setBorder(null);

        tabla_material.setBackground(new java.awt.Color(51, 50, 55));
        tabla_material.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tabla_material.setForeground(new java.awt.Color(255, 255, 255));
        tabla_material.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Material", "Stock(Kg)", "Unidad de Medida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_material.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabla_material.setFocusable(false);
        tabla_material.setGridColor(new java.awt.Color(255, 255, 255));
        tabla_material.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tabla_material.setRowHeight(25);
        tabla_material.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tabla_material.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tabla_material.setShowVerticalLines(false);
        tabla_material.getTableHeader().setReorderingAllowed(false);
        scroll_material.setViewportView(tabla_material);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(127, 127, 127));
        jLabel4.setText("Standard Table ");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
            .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRound1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(scroll_material, javax.swing.GroupLayout.DEFAULT_SIZE, 1126, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRound1Layout.createSequentialGroup()
                    .addGap(192, 192, 192)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(813, Short.MAX_VALUE)))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
            .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRound1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(scroll_material, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRound1Layout.createSequentialGroup()
                    .addGap(172, 172, 172)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(173, 173, 173)))
        );

        panel_principal.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 1150, 390));

        panelRound2.setBackground(new java.awt.Color(51, 50, 55));
        panelRound2.setRoundBottomLeft(40);
        panelRound2.setRoundBottomRight(40);
        panelRound2.setRoundTopLeft(40);
        panelRound2.setRoundTopRight(40);

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("¡Hola,");

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Aquí está tu inventario actualizado.");

        nombre_usuario.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        nombre_usuario.setForeground(new java.awt.Color(255, 255, 255));
        nombre_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        texto_busqueda.setForeground(new java.awt.Color(255, 255, 255));
        texto_busqueda.setText("Ingrese el Nombre del Material");
        texto_busqueda.setBorder(null);
        texto_busqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                texto_busquedaMousePressed(evt);
            }
        });
        texto_busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                texto_busquedaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                texto_busquedaKeyReleased(evt);
            }
        });

        panel_busqueda.setBackground(new java.awt.Color(82, 170, 99));
        panel_busqueda.setRoundBottomLeft(15);
        panel_busqueda.setRoundBottomRight(15);
        panel_busqueda.setRoundTopLeft(15);
        panel_busqueda.setRoundTopRight(15);

        busqueda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        busqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-búsqueda-24.png"))); // NOI18N
        busqueda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        busqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                busquedaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                busquedaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                busquedaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_busquedaLayout = new javax.swing.GroupLayout(panel_busqueda);
        panel_busqueda.setLayout(panel_busquedaLayout);
        panel_busquedaLayout.setHorizontalGroup(
            panel_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(busqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
        );
        panel_busquedaLayout.setVerticalGroup(
            panel_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(busqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(texto_busqueda)
                            .addComponent(jSeparator1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(0, 174, Short.MAX_VALUE))))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(nombre_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(texto_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panel_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_principal.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 500, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1200, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseClicked
        if ("compra".equals(ventanaOrigen)) { // Verifica si se vino de compras
            
            Menu_Vista_Compra compra = new Menu_Vista_Compra();
            compra.setVisible(true);
            compra.setLocationRelativeTo(null); // Opcional: centra la ventana en pantalla
        } 
        else if ("venta".equals(ventanaOrigen)) { // Verifica si se vino de ventas
            Menu_Vista_Venta venta = new Menu_Vista_Venta();
            venta.setVisible(true);
            venta.setLocationRelativeTo(null); // Opcional: centra la ventana en pantalla
        }
    this.dispose(); // Cierra la ventana actual de inventario
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

    private void busquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_busquedaMouseClicked
        // Obtén el texto del campo de búsqueda
        String nombreBuscado = texto_busqueda.getText(); 
        // Llama al método para buscar el material
        BuscarMateria(nombreBuscado);  
    }//GEN-LAST:event_busquedaMouseClicked

    private void busquedaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_busquedaMouseEntered
        // TODO add your handling code here:
         // TODO add your handling code here:
        // colores al mouse este es al poner el mouse encima
        panel_busqueda.setBackground(new Color(0x499758));
        busqueda.setForeground(new Color(0xcccccc));
    }//GEN-LAST:event_busquedaMouseEntered

    private void busquedaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_busquedaMouseExited
        // TODO add your handling code here:
        panel_busqueda.setBackground(new Color(0x52aa63));  //color principal
        busqueda.setForeground(Color.WHITE);    
    }//GEN-LAST:event_busquedaMouseExited

    private void texto_busquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texto_busquedaKeyPressed
        // TODO add your handling code here: 
    }//GEN-LAST:event_texto_busquedaKeyPressed

    private void texto_busquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texto_busquedaKeyReleased
        // TODO add your handling code here:
        String nombreBuscado = texto_busqueda.getText(); 
        // Llama al método para buscar el material
        BuscarMateria(nombreBuscado); 
    }//GEN-LAST:event_texto_busquedaKeyReleased
    private boolean limpiado = false;
    private void texto_busquedaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_texto_busquedaMousePressed
        // TODO add your handling code here:
        if(!limpiado){
           //limpiar el texto
           if(!texto_busqueda.getText().equals("")){
               texto_busqueda.setText("");
           }
           limpiado = true;
       }  
        
    }//GEN-LAST:event_texto_busquedaMousePressed

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
            java.util.logging.Logger.getLogger(Inventario_Material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventario_Material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventario_Material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario_Material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventario_Material().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atras;
    private javax.swing.JPanel barra;
    private javax.swing.JLabel busqueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nombre_usuario;
    private swing.PanelRound panelRound1;
    private swing.PanelRound panelRound2;
    private swing.PanelRound panel_atras;
    private swing.PanelRound panel_busqueda;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JScrollPane scroll_material;
    private javax.swing.JTable tabla_material;
    private javax.swing.JTextField texto_busqueda;
    // End of variables declaration//GEN-END:variables
    ctrl_material material = new ctrl_material();
    public void ListarMateria(){  //cuando el void se importa el util y si es List el awv
        List<Material> ListarMate = material.ConsultaMaterial();
        modelo  = (DefaultTableModel) tabla_material.getModel();
        modelo.setRowCount(0);  // Limpia el modelo antes de agregar nuevas filas
        //DefaultTableModel modelo = (DefaultTableModel) tabla_material.getModel();
        Object[] object = new  Object[4];
        for (int i = 0; i < ListarMate.size(); i++) {
            object[0] = ListarMate.get(i).getId_material();
            object[1] = ListarMate.get(i).getNombre_material();
            object[2] = ListarMate.get(i).getCantidad_kg();
            object[3] = ListarMate.get(i).getUnidad_de_medida();
            modelo.addRow(object);            
        }
        tabla_material.setModel(modelo);
    }
    
    
    //busqueda 
    public void BuscarMateria(String nombreBuscado) {
    List<Material> ListarMate = material.ConsultaMaterial();
    modelo = (DefaultTableModel) tabla_material.getModel();
    modelo.setRowCount(0);  // Limpia el modelo antes de agregar nuevas filas
    Object[] object = new Object[4];
    // Normaliza el término de búsqueda (elimina acentos y convierte a minúsculas)
    String nombreBuscadoNormalizado = removerAcentos(nombreBuscado.toLowerCase());
    for (Material material : ListarMate) {
        // Normaliza el nombre del material para comparar sin acentos y en minúsculas
        String nombreMaterialNormalizado = removerAcentos(material.getNombre_material().toLowerCase());
        // Verifica si el nombre del material comienza con el término de búsqueda
        if (nombreMaterialNormalizado.startsWith(nombreBuscadoNormalizado)) {
            object[0] = material.getId_material();
            object[1] = material.getNombre_material();
            object[2] = material.getCantidad_kg();
            object[3] = material.getUnidad_de_medida();
            modelo.addRow(object);
        }
    }
    tabla_material.setModel(modelo);
    }

    //Lo use para eliminar tildes en la busqueda
    public String removerAcentos(String texto) {
    if (texto == null) {
        return null;
    }
    // Normaliza el texto en forma NFD (descompone los caracteres con acentos)
    texto = Normalizer.normalize(texto, Normalizer.Form.NFD);
    // Elimina los caracteres diacríticos (acentos, tildes, etc.)
    texto = texto.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    return texto;
    }
    //extra para las ventanas
    private String ventanaOrigen; // Agrega esta línea
    public void setVentanaOrigen(String origen) {
    this.ventanaOrigen = origen;
    }
    //personalizar tabla
    public void personalizar_tabla(){
        //Personalizamos la tablas 
        tabla_material.setBackground(new Color(0x333337));  // Fondo de las celdas
        tabla_material.setForeground(new Color(000,000,000));  // Color del texto de las celdas
        tabla_material.setGridColor(new Color(255, 255, 255));  // Líneas de celda más suaves
        tabla_material.setRowHeight(25);  // Ajustar la altura de las filas
        tabla_material.setFont(new Font("sansserif", Font.PLAIN, 12));//ME PARECE, ES FUENTE DEL CONTENIDO DE LA TABLA
        tabla_material.setBorder(null); // Quitar el borde externo de la tabla
        // Configurar la tabla sin borde
        tabla_material.setBorder(BorderFactory.createEmptyBorder());
        // Configurar el JScrollPane sin borde
        scroll_material.setBorder(BorderFactory.createEmptyBorder());
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
        for (int i = 0; i < tabla_material.getColumnCount(); i++) {
            tabla_material.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
        }
        //para encabezado de Tabla
        TableCellRenderer headerRenderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                label.setBackground(new Color(000,204,000));  // Fondo verde del encabezado                
                label.setForeground(new Color(40,40,40));  // Color del texto del encabezado
                label.setHorizontalAlignment(JLabel.LEFT);  // Centrar el texto
                label.setFont((new Font("sansserif", Font.BOLD, 12))); //LA FUENTE DE LA TABLA  TITULO                 
                label.setOpaque(true);  // Asegurarse de que el color de fondo se aplique
                return label;
            }
        };
         // Aplicar el renderizador a cada columna del encabezado
        for (int i = 0; i < tabla_material.getColumnModel().getColumnCount(); i++) {
            tabla_material.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        
    }
}
