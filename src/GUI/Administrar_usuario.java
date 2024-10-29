package GUI;
import controlador.ctrl_agregar_usuario;
import java.awt.Color;
import javax.swing.JOptionPane;
import modelo.usuario;
public class Administrar_usuario extends javax.swing.JFrame {
    public Administrar_usuario() {
        initComponents();
        nombre.setBackground(new java.awt.Color(0,0,0,1));
        apellidoP_usuario.setBackground(new java.awt.Color(0,0,0,1));
        apellidoM_usuario.setBackground(new java.awt.Color(0,0,0,1));
        telefono_usuario.setBackground(new java.awt.Color(0,0,0,1));
        contraseña_usuario.setBackground(new java.awt.Color(0,0,0,1));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        panel_principal = new javax.swing.JPanel();
        panel_barra = new javax.swing.JPanel();
        panel_atras = new swing.PanelRound();
        atras = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        panelRound1 = new swing.PanelRound();
        panel_registro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        apellidoP_usuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        tipo_usuario = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        apellidoM_usuario = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        telefono_usuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        panel_boton = new swing.PanelRound();
        label = new javax.swing.JLabel();
        contraseña_usuario = new javax.swing.JPasswordField();
        contraseña_usuario1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setUndecorated(true);
        setSize(new java.awt.Dimension(800, 500));

        panel_principal.setBackground(new java.awt.Color(92, 189, 110));
        panel_principal.setMaximumSize(new java.awt.Dimension(800, 500));
        panel_principal.setMinimumSize(new java.awt.Dimension(800, 500));
        panel_principal.setPreferredSize(new java.awt.Dimension(800, 500));
        panel_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_barra.setBackground(new java.awt.Color(92, 189, 110));
        panel_barra.setMaximumSize(new java.awt.Dimension(700, 450));
        panel_barra.setMinimumSize(new java.awt.Dimension(700, 40));
        panel_barra.setPreferredSize(new java.awt.Dimension(700, 40));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_atrasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_atrasLayout.setVerticalGroup(
            panel_atrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(atras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Registro Usuario");

        javax.swing.GroupLayout panel_barraLayout = new javax.swing.GroupLayout(panel_barra);
        panel_barra.setLayout(panel_barraLayout);
        panel_barraLayout.setHorizontalGroup(
            panel_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_barraLayout.createSequentialGroup()
                .addComponent(panel_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 271, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(261, 261, 261))
        );
        panel_barraLayout.setVerticalGroup(
            panel_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_atras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel_principal.add(panel_barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 40));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);

        panel_registro.setBackground(new java.awt.Color(255, 255, 255));
        panel_registro.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(102, 102, 102)))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre");

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setForeground(new java.awt.Color(0, 0, 0));
        nombre.setBorder(null);
        nombre.setOpaque(false);
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Apellido Paterno");

        apellidoP_usuario.setForeground(new java.awt.Color(0, 0, 0));
        apellidoP_usuario.setBorder(null);
        apellidoP_usuario.setOpaque(false);
        apellidoP_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoP_usuarioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Contraseña");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Tipo de usuario");

        tipo_usuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleado", "Administrador" }));
        tipo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_usuarioActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Apellido Materno");

        apellidoM_usuario.setForeground(new java.awt.Color(0, 0, 0));
        apellidoM_usuario.setBorder(null);
        apellidoM_usuario.setOpaque(false);
        apellidoM_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoM_usuarioActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Telefono");

        telefono_usuario.setForeground(new java.awt.Color(0, 0, 0));
        telefono_usuario.setBorder(null);
        telefono_usuario.setOpaque(false);
        telefono_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefono_usuarioActionPerformed(evt);
            }
        });

        panel_boton.setBackground(new java.awt.Color(82, 170, 99));
        panel_boton.setRoundBottomLeft(20);
        panel_boton.setRoundBottomRight(20);
        panel_boton.setRoundTopLeft(20);
        panel_boton.setRoundTopRight(20);

        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png"))); // NOI18N
        label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panel_botonLayout = new javax.swing.GroupLayout(panel_boton);
        panel_boton.setLayout(panel_botonLayout);
        panel_botonLayout.setHorizontalGroup(
            panel_botonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panel_botonLayout.setVerticalGroup(
            panel_botonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        contraseña_usuario.setBackground(new java.awt.Color(255, 255, 255));
        contraseña_usuario.setForeground(new java.awt.Color(0, 0, 0));
        contraseña_usuario.setBorder(null);

        contraseña_usuario1.setBorder(null);
        contraseña_usuario1.setOpaque(false);
        contraseña_usuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseña_usuario1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_registroLayout = new javax.swing.GroupLayout(panel_registro);
        panel_registro.setLayout(panel_registroLayout);
        panel_registroLayout.setHorizontalGroup(
            panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_registroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_registroLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_registroLayout.createSequentialGroup()
                                .addComponent(apellidoM_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefono_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(291, 291, 291))
                    .addGroup(panel_registroLayout.createSequentialGroup()
                        .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_registroLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(contraseña_usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel_registroLayout.createSequentialGroup()
                                        .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(contraseña_usuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tipo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panel_registroLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(apellidoP_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(panel_registroLayout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(panel_boton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_registroLayout.setVerticalGroup(
            panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_registroLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidoP_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidoM_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefono_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contraseña_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(contraseña_usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel_boton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(panel_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(panel_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_principal.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 760, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void apellidoP_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoP_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoP_usuarioActionPerformed

    private void apellidoM_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoM_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoM_usuarioActionPerformed

    private void telefono_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefono_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefono_usuarioActionPerformed

    private void tipo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipo_usuarioActionPerformed

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

    private void labelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMousePressed
        AgregarUsu();
    }//GEN-LAST:event_labelMousePressed

    private void contraseña_usuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseña_usuario1ActionPerformed
    }//GEN-LAST:event_contraseña_usuario1ActionPerformed

    private void labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMouseEntered
        // TODO add your handling code here:
        panel_boton.setBackground(new Color(0x499758));
    }//GEN-LAST:event_labelMouseEntered

    private void labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMouseExited
        // TODO add your handling code here:
        panel_boton.setBackground(new Color(0x5CBD6E));
    }//GEN-LAST:event_labelMouseExited
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
            java.util.logging.Logger.getLogger(Administrar_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrar_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrar_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrar_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Administrar_usuario().setVisible(true);
                Administrar_usuario administrar_usuario = new Administrar_usuario();
                administrar_usuario.setVisible(true);
                administrar_usuario.setLocationRelativeTo(null);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoM_usuario;
    private javax.swing.JTextField apellidoP_usuario;
    private javax.swing.JLabel atras;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPasswordField contraseña_usuario;
    private javax.swing.JTextField contraseña_usuario1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel label;
    private javax.swing.JTextField nombre;
    private swing.PanelRound panelRound1;
    private swing.PanelRound panel_atras;
    private javax.swing.JPanel panel_barra;
    private swing.PanelRound panel_boton;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JPanel panel_registro;
    private javax.swing.JTextField telefono_usuario;
    private javax.swing.JComboBox<String> tipo_usuario;
    // End of variables declaration//GEN-END:variables
    
    
    private void AgregarUsu() {
    // Validar que no falten campos
    if (nombre.getText().isEmpty() || apellidoP_usuario.getText().isEmpty() || apellidoM_usuario.getText().isEmpty()
            || telefono_usuario.getText().isEmpty() || contraseña_usuario.getText().isEmpty()
            || tipo_usuario.getSelectedItem() == null) {

        // Mostrar mensaje de error indicando que faltan campos
        JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
        return;
    }
    // Validar que el teléfono contenga solo números usando una expresión regula
    //matches  usa para comprobar si la cadena completa coincide con la expresión regular
    //expresion regular es \d+ que es cualquier digitos decimal
    if (telefono_usuario.getText().matches("\\d+")) {
        // Validar que el teléfono no contenga exactamente 10 dígitos numéricos
        if (!telefono_usuario.getText().matches("\\d{10}")) {
            JOptionPane.showMessageDialog(null, "El teléfono debe contener 10 dígitos numéricos.");
            return;
        }
    } else {
        JOptionPane.showMessageDialog(null, "El campo de teléfono solo debe contener números.");
        return;
    }

    // Validar que el nombre no contenga letras y espacios
    if (!nombre.getText().matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
        JOptionPane.showMessageDialog(null, "El nombre solo debe contener letras y espacios.");
        return;
    }
    // Validar que el apellido paterno no contenga letras y espacios
    if (!apellidoP_usuario.getText().matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
        JOptionPane.showMessageDialog(null, "El apellido paterno solo debe contener letras y espacios.");
        return;
    }
    // Validar que el apellido materno no contenga letras y espacios
    if (!apellidoM_usuario.getText().matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
        JOptionPane.showMessageDialog(null, "El apellido materno solo debe contener letras y espacios.");
        return;
    }
    // Instanciar el controlador
    ctrl_agregar_usuario controlUsuario = new ctrl_agregar_usuario();
    // Crear un nuevo objeto usuario y asignar valores
    usuario Usuario = new usuario();
     Usuario.setTelefono((telefono_usuario.getText())); 
    // Parsear el teléfono a Long, ahora sabemos que es seguro
   // Usuario.setTelefono(Long.parseLong(telefono_usuario.getText()));//aca
    // Formatear los nombres y apellidos
    Usuario.setNombre(capitalize(nombre.getText().trim()));
    Usuario.setApellidoP(capitalize(apellidoP_usuario.getText().trim()));
    Usuario.setApellidoM(capitalize(apellidoM_usuario.getText().trim()));
    // Asignar la contraseña y tipo de usuario
    Usuario.setContraseña(contraseña_usuario.getText().trim());
    Usuario.setTipo_usuario(capitalize(tipo_usuario.getSelectedItem().toString()));
    // Llamar al método agregarUsuarios del controlador
    boolean resultado = controlUsuario.agregarUsuarios(Usuario);
    if (resultado) {
        // Mostrar mensaje de éxito
        JOptionPane.showMessageDialog(null, "Usuario agregado correctamente");
        // Limpiar los campos
        telefono_usuario.setText("");
        nombre.setText("");
        apellidoP_usuario.setText("");
        apellidoM_usuario.setText("");
        contraseña_usuario.setText("");
        tipo_usuario.setSelectedIndex(0);
    } else {
        // Mostrar mensaje de error
        JOptionPane.showMessageDialog(null, "Error al agregar usuario.");
    }
    }
// Método para capitalizar la primera letra de cada palabra
    private String capitalize(String input) {
    String[] words = input.split("\\s+");
    StringBuilder capitalized = new StringBuilder();
    for (String word : words) {
        if (word.length() > 0) {
            capitalized.append(Character.toUpperCase(word.charAt(0)));
            capitalized.append(word.substring(1).toLowerCase());
            capitalized.append(" ");
        }
    }
    return capitalized.toString().trim();
    }
}