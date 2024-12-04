package GUI;
import controlador.ctrl_provedor;
import java.awt.Color;
import javax.swing.JOptionPane;
import modelo.Provedor;
import modelo.usuario;

public class Administra_Provedor extends javax.swing.JFrame {
    public Administra_Provedor() {
        initComponents();
        EliminarBorde();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panel_atras1 = new swing.PanelRound();
        atras1 = new javax.swing.JLabel();
        panelRound1 = new swing.PanelRound();
        jPanel3 = new javax.swing.JPanel();
        nombre_texto = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        telefono_texto = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        ciudad_texto = new javax.swing.JLabel();
        ciudad = new javax.swing.JTextField();
        panel_boton = new swing.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        referencia_texto = new javax.swing.JLabel();
        referencia = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(92, 189, 110));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(92, 189, 110));
        jPanel2.setPreferredSize(new java.awt.Dimension(700, 40));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hombre.png"))); // NOI18N
        jLabel1.setText("Agregar Proveedor");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(panel_atras1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(256, 256, 256)
                .addComponent(jLabel1)
                .addContainerGap(332, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_atras1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro Proveedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(102, 102, 102)))); // NOI18N

        nombre_texto.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        nombre_texto.setForeground(new java.awt.Color(0, 0, 0));
        nombre_texto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre_texto.setText("Nombre");

        nombre.setForeground(new java.awt.Color(0, 0, 0));
        nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombre.setBorder(null);
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        telefono_texto.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        telefono_texto.setForeground(new java.awt.Color(0, 0, 0));
        telefono_texto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        telefono_texto.setText("Teléfono");

        telefono.setForeground(new java.awt.Color(0, 0, 0));
        telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        telefono.setBorder(null);

        ciudad_texto.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        ciudad_texto.setForeground(new java.awt.Color(0, 0, 0));
        ciudad_texto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ciudad_texto.setText("Ciudad");

        ciudad.setForeground(new java.awt.Color(0, 0, 0));
        ciudad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ciudad.setBorder(null);

        panel_boton.setBackground(new java.awt.Color(92, 189, 110));
        panel_boton.setRoundBottomLeft(20);
        panel_boton.setRoundBottomRight(20);
        panel_boton.setRoundTopLeft(20);
        panel_boton.setRoundTopRight(20);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
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

        referencia_texto.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        referencia_texto.setForeground(new java.awt.Color(0, 0, 0));
        referencia_texto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        referencia_texto.setText("Referencia");

        referencia.setForeground(new java.awt.Color(0, 0, 0));
        referencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        referencia.setBorder(null);
        referencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                referenciaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Correo Electrónico");

        correo.setForeground(new java.awt.Color(0, 0, 0));
        correo.setBorder(null);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(referencia_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(ciudad)
                                    .addComponent(ciudad_texto, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addComponent(panel_boton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(referencia, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nombre)
                                    .addComponent(nombre_texto, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(telefono)
                                        .addComponent(telefono_texto, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_texto)
                    .addComponent(telefono_texto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(referencia_texto)
                            .addComponent(ciudad_texto)))
                    .addComponent(panel_boton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(referencia, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 700, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        // 1 paso instancair el controlador y el modelo
        Provedor provedor = new Provedor();
        ctrl_provedor controlador = new ctrl_provedor();        
        //validamos que no haigan campos vacios
        if (nombre.getText().isEmpty() || telefono.getText().isEmpty() || ciudad.getText().isEmpty() || referencia.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, llena todos los Campos");
            return;
            
        } 
        //validar que el telfono tenga numero y no caracter
        if (telefono.getText().matches("\\d+"))
        {
            //verificar si el telefono tiene 10 
            if (!telefono.getText().matches("\\d{10}")){
                 JOptionPane.showMessageDialog(null, "El teléfono debe contener 10 dígitos numéricos.");
                 return;
            
            }    
        }else{
            JOptionPane.showMessageDialog(null, "El campo de teléfono solo debe contener números");
            return;
            
        }
        //verificar que texto tenga carcateres y espacios
        if (!nombre.getText().matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")){
            JOptionPane.showMessageDialog(null, "el nombre solo debe contener letras y espacios");
            return;
        }
        if(!ciudad.getText().matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")){
            JOptionPane.showMessageDialog(null, "la ciudad solo debe contener letras y espcios");
            return;
        }
        if(!referencia.getText().matches("\\d{18}")){            
            JOptionPane.showMessageDialog(null, "La referencia debe contener 18 Digitos y solo debe contener números");
            return;
        }
            
        //formatear  el nombre y ciudad y telefono    
        provedor.setNombre(capitalize(nombre.getText().trim()));
        provedor.setTelefono(capitalize(telefono.getText().trim()));
        provedor.setCiudad(capitalize(ciudad.getText().trim()));
        provedor.setReferencia(capitalize(referencia.getText().trim()));
        provedor.setCorreo_electronico(capitalize(correo.getText().trim()));
         // Llamar al método agregarUsuarios del controlador
        boolean resultado = controlador.RegistarProvedor(provedor);        
        if(resultado){
            JOptionPane.showMessageDialog(null,"Provedor registrado"); 
            nombre.setText("");
            telefono.setText("");
            ciudad.setText("");
            referencia.setText("");
            correo.setText("");
        }else{
        
            JOptionPane.showMessageDialog(null,"Erro al guardar");
        }
    }//GEN-LAST:event_jLabel5MousePressed
    private void atras1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atras1MouseClicked
        // TODO add your handling code here:
        if("Principal".equals(ventanaOrigen)){
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
        }else if("Realiza_compra".equals(ventanaOrigen)){
            Realizar_compra rc = new Realizar_compra();
            rc.setVisible(true);
            rc.setLocationRelativeTo(null);
        }
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

    private void referenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_referenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_referenciaActionPerformed

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
        panel_boton.setBackground(new Color(0x499758));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:
        panel_boton.setBackground(new Color(0x5CBD6E));
    }//GEN-LAST:event_jLabel5MouseExited
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
            java.util.logging.Logger.getLogger(Administra_Provedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administra_Provedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administra_Provedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administra_Provedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Administra_Provedor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atras1;
    private javax.swing.JTextField ciudad;
    private javax.swing.JLabel ciudad_texto;
    private javax.swing.JTextField correo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel nombre_texto;
    private swing.PanelRound panelRound1;
    private swing.PanelRound panel_atras1;
    private swing.PanelRound panel_boton;
    private javax.swing.JTextField referencia;
    private javax.swing.JLabel referencia_texto;
    private javax.swing.JTextField telefono;
    private javax.swing.JLabel telefono_texto;
    // End of variables declaration//GEN-END:variables
    private String capitalize(String str) {
    if (str == null || str.isEmpty()) {
        return str; // Retorna la cadena original si está vacía o es null
    }
    return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
    public void EliminarBorde(){
        nombre.setBackground(new java.awt.Color(0,0,0,1));
        telefono.setBackground(new java.awt.Color(0,0,0,1));
        referencia.setBackground(new java.awt.Color(0,0,0,1));
        ciudad.setBackground(new java.awt.Color(0,0,0,1));   
        correo.setBackground(new java.awt.Color(0,0,0,1));
    }
    //extra para las ventanas
    private String ventanaOrigen; // Agrega esta línea
    public void setVentanaOrigen(String origen) {
    this.ventanaOrigen = origen;
    }
    
}
