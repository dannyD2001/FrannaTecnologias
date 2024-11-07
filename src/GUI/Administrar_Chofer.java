package GUI;
import controlador.ctrl_chofer;
import java.awt.Color;
import javax.swing.JOptionPane;
import modelo.Chofer;
import modelo.Vehiculo;
import modelo.usuario;

public class Administrar_Chofer extends javax.swing.JFrame {
    ctrl_chofer ctrlChofer = new ctrl_chofer();
    Chofer chofer = new Chofer();
    public Administrar_Chofer() {
        initComponents();
        ctrlChofer.ConsultarVehiculo(combox_vehiculo); 
        EliminarBorde();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_principal = new javax.swing.JPanel();
        panelRound1 = new swing.PanelRound();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombre_chofer = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        combox_tipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        combox_vehiculo = new javax.swing.JComboBox<>();
        panel_boton = new swing.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        apellido_p = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        panel_atras1 = new swing.PanelRound();
        atras1 = new javax.swing.JLabel();
        titulo_chofer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Panel_principal.setBackground(new java.awt.Color(92, 189, 110));
        Panel_principal.setMaximumSize(new java.awt.Dimension(800, 500));
        Panel_principal.setMinimumSize(new java.awt.Dimension(800, 500));
        Panel_principal.setPreferredSize(new java.awt.Dimension(800, 500));
        Panel_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Chofer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre del chofer");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Telefono del Chofer");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tipo Chofer");

        nombre_chofer.setForeground(new java.awt.Color(0, 0, 0));
        nombre_chofer.setBorder(null);

        telefono.setForeground(new java.awt.Color(0, 0, 0));
        telefono.setBorder(null);

        combox_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Interno" }));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Vehiculo");

        panel_boton.setBackground(new java.awt.Color(92, 189, 110));
        panel_boton.setRoundBottomLeft(20);
        panel_boton.setRoundBottomRight(20);
        panel_boton.setRoundTopLeft(20);
        panel_boton.setRoundTopRight(20);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png"))); // NOI18N
        jLabel5.setToolTipText("");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_botonLayout = new javax.swing.GroupLayout(panel_boton);
        panel_boton.setLayout(panel_botonLayout);
        panel_botonLayout.setHorizontalGroup(
            panel_botonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panel_botonLayout.setVerticalGroup(
            panel_botonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Apellido Paterno");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator3)
                            .addComponent(apellido_p)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(nombre_chofer)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(telefono)
                            .addComponent(jSeparator2))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(combox_tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(combox_vehiculo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(panel_boton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_chofer, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combox_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combox_vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(apellido_p, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(panel_boton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        Panel_principal.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 710, 390));

        jPanel2.setBackground(new java.awt.Color(92, 189, 110));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_atras1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(atras1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        titulo_chofer.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        titulo_chofer.setForeground(new java.awt.Color(0, 0, 0));
        titulo_chofer.setText("Administrar Chofer");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(panel_atras1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 273, Short.MAX_VALUE)
                .addComponent(titulo_chofer, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(233, 233, 233))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_atras1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(titulo_chofer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Panel_principal.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
        panel_boton.setBackground(new Color(0x499758));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:
        panel_boton.setBackground(new Color(0x5CBD6E));
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        ctrl_chofer ctrlChofer = new ctrl_chofer();
        // TODO add your handling code here:
        if(nombre_chofer.getText().isEmpty() || telefono.getText().isEmpty()
                || apellido_p.getText().isEmpty()
                || combox_tipo.getSelectedItem() == null || combox_vehiculo.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos");
            return;
        }
        if(!nombre_chofer.getText().matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+") ||
                !apellido_p.getText().matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")){
            JOptionPane.showMessageDialog(null, "El nombre del chofer y apellido solo debe contener letras y espacios");
            return;
        }
        if(!telefono.getText().matches("\\d{10}")){
            JOptionPane.showMessageDialog(null,"El teléfono debe contener 10 dígitos numéricos y solo debe contener números");
            return;
        }
        //verificar si existe ya el chofer
        if(!ctrlChofer.existeTelefono(telefono.getText().trim())){
            chofer.setNombre(capitalize(nombre_chofer.getText()));
            chofer.setApellido_p(capitalize(apellido_p.getText()));
            chofer.setTelefono_chofer(telefono.getText());            
            //obtener la tipo de chofer selecionado
            String tipoSeleccion = (String) combox_tipo.getSelectedItem();
            chofer.setTipo_chofer(tipoSeleccion);
            //obtener la placa selecionada
            Vehiculo PlacaSelecionada = (Vehiculo) combox_vehiculo.getSelectedItem();
            chofer.setPlaca(PlacaSelecionada.getPlaca());
            //registrar al chofer
            ctrlChofer.RegistrarChofer(chofer);
            
        
        }else{
            JOptionPane.showMessageDialog(null, "El chofer ya existe");
        
        }
        limpiar();
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(Administrar_Chofer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrar_Chofer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrar_Chofer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrar_Chofer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Administrar_Chofer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_principal;
    private javax.swing.JTextField apellido_p;
    private javax.swing.JLabel atras1;
    private javax.swing.JComboBox<String> combox_tipo;
    private javax.swing.JComboBox<String> combox_vehiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField nombre_chofer;
    private swing.PanelRound panelRound1;
    private swing.PanelRound panel_atras1;
    private swing.PanelRound panel_boton;
    private javax.swing.JTextField telefono;
    private javax.swing.JLabel titulo_chofer;
    // End of variables declaration//GEN-END:variables
    public void EliminarBorde(){
        nombre_chofer.setBackground(new java.awt.Color(0,0,0,1));
        telefono.setBackground(new java.awt.Color(0,0,0,1));
    }
    public void limpiar(){
        nombre_chofer.setText("");
        telefono.setText("");
        apellido_p.setText("");
        combox_tipo.setSelectedIndex(-1);
        combox_vehiculo.setSelectedIndex(-1);
    }
        private String capitalize(String str) {
    if (str == null || str.isEmpty()) {
        return str; // Retorna la cadena original si está vacía o es null
    }

    // Dividimos la cadena en palabras usando los espacios como delimitador
    String[] palabras = str.split(" ");
    StringBuilder resultado = new StringBuilder();

    // Iteramos por cada palabra, capitalizamos la primera letra y concatenamos el resto en minúsculas
    for (String palabra : palabras) {
        if (!palabra.isEmpty()) {
            resultado.append(palabra.substring(0, 1).toUpperCase())  // Primera letra en mayúscula
                     .append(palabra.substring(1).toLowerCase())    // Resto en minúsculas
                     .append(" ");  // Agregamos un espacio entre palabras
        }
    }

    // Quitamos el espacio final extra
    return resultado.toString().trim();
    }
}
