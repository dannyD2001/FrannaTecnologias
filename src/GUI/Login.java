package GUI;
import Util.AppContext;
import com.formdev.flatlaf.FlatDarkLaf;
import controlador.ctrl_usuario;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import modelo.usuario;
public class Login extends javax.swing.JFrame {
    Icon Bienvenido;
    int mouseX, mouseY;
    public Login() {
        // Aplica el tema oscuro de FlatLaf
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
        }
        initComponents(); 
        this.setTitle("LOGIN");
        Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/icnonos_veentanas.png"));
        this.setIconImage(icono);
        this.setLocationRelativeTo(null);
        jTextField_usuario.setBackground(new java.awt.Color(0,0,0,1));
        jPasswordField_contraseña.setBackground(new java.awt.Color(0,0,0,1));
        //esto es para poner iconos a JOption
        Bienvenido = new ImageIcon("src/Imagenes/icono_saludo_50x50.png");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        fondo_boton = new swing.PanelRound();
        entrar_btn = new javax.swing.JLabel();
        barra_salida = new javax.swing.JPanel();
        iconos_salidas = new javax.swing.JPanel();
        btn_salir = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPasswordField_contraseña = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField_usuario = new javax.swing.JTextField();
        iconPasswordJL = new javax.swing.JLabel();
        iconUserJL = new javax.swing.JLabel();
        bienvenidosJL = new javax.swing.JLabel();
        logoJL = new javax.swing.JLabel();
        bgJL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo_boton.setBackground(new java.awt.Color(27, 94, 32));
        fondo_boton.setPreferredSize(new java.awt.Dimension(130, 40));
        fondo_boton.setRoundBottomLeft(20);
        fondo_boton.setRoundBottomRight(20);
        fondo_boton.setRoundTopLeft(20);
        fondo_boton.setRoundTopRight(20);

        entrar_btn.setFont(new java.awt.Font("Bernard MT Condensed", 0, 14)); // NOI18N
        entrar_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        entrar_btn.setText("ENTRAR");
        entrar_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrar_btn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entrar_btnFocusGained(evt);
            }
        });
        entrar_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrar_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                entrar_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                entrar_btnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                entrar_btnMousePressed(evt);
            }
        });

        javax.swing.GroupLayout fondo_botonLayout = new javax.swing.GroupLayout(fondo_boton);
        fondo_boton.setLayout(fondo_botonLayout);
        fondo_botonLayout.setHorizontalGroup(
            fondo_botonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(fondo_botonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fondo_botonLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(entrar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        fondo_botonLayout.setVerticalGroup(
            fondo_botonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(fondo_botonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fondo_botonLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(entrar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        bg.add(fondo_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        barra_salida.setBackground(new java.awt.Color(207, 241, 164));
        barra_salida.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barra_salidaMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                barra_salidaMouseMoved(evt);
            }
        });
        barra_salida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barra_salidaMousePressed(evt);
            }
        });

        iconos_salidas.setBackground(new java.awt.Color(207, 241, 164));

        btn_salir.setBackground(new java.awt.Color(169, 242, 163));
        btn_salir.setForeground(new java.awt.Color(0, 0, 0));
        btn_salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_salir.setText("X");
        btn_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_salirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_salirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout iconos_salidasLayout = new javax.swing.GroupLayout(iconos_salidas);
        iconos_salidas.setLayout(iconos_salidasLayout);
        iconos_salidasLayout.setHorizontalGroup(
            iconos_salidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iconos_salidasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        iconos_salidasLayout.setVerticalGroup(
            iconos_salidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout barra_salidaLayout = new javax.swing.GroupLayout(barra_salida);
        barra_salida.setLayout(barra_salidaLayout);
        barra_salidaLayout.setHorizontalGroup(
            barra_salidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barra_salidaLayout.createSequentialGroup()
                .addGap(0, 610, Short.MAX_VALUE)
                .addComponent(iconos_salidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barra_salidaLayout.setVerticalGroup(
            barra_salidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconos_salidas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(barra_salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 30));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 240, -1));

        jPasswordField_contraseña.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField_contraseña.setForeground(new java.awt.Color(0, 0, 0));
        jPasswordField_contraseña.setText(" contraseña");
        jPasswordField_contraseña.setBorder(null);
        jPasswordField_contraseña.setOpaque(false);
        jPasswordField_contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPasswordField_contraseñaMousePressed(evt);
            }
        });
        bg.add(jPasswordField_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 240, 30));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 240, 10));

        jTextField_usuario.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_usuario.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_usuario.setText(" Ingrese su numero Telefonico");
        jTextField_usuario.setBorder(null);
        jTextField_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField_usuario.setOpaque(false);
        jTextField_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField_usuarioMousePressed(evt);
            }
        });
        jTextField_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_usuarioActionPerformed(evt);
            }
        });
        bg.add(jTextField_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 240, 30));

        iconPasswordJL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pngwing.png"))); // NOI18N
        bg.add(iconPasswordJL, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 40, 30));

        iconUserJL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/UsuarioPngtree.png"))); // NOI18N
        bg.add(iconUserJL, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 40, 30));

        bienvenidosJL.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        bienvenidosJL.setForeground(new java.awt.Color(0, 0, 0));
        bienvenidosJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bienvenidosJL.setText("Iniciar Sesíon");
        bg.add(bienvenidosJL, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 110, 40));

        logoJL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo1.png"))); // NOI18N
        logoJL.setText("jLabel3");
        bg.add(logoJL, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 400, 180));

        bgJL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos_login.jpg"))); // NOI18N
        bg.add(bgJL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barra_salidaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_salidaMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_barra_salidaMousePressed

    private void barra_salidaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_salidaMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_barra_salidaMouseMoved

    private void barra_salidaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_salidaMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x- mouseX,y- mouseY);
    }//GEN-LAST:event_barra_salidaMouseDragged

    private void btn_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btn_salirMouseClicked

    private void btn_salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseEntered
        iconos_salidas.setBackground(Color.red);
        btn_salir.setForeground(Color.WHITE);
    }//GEN-LAST:event_btn_salirMouseEntered

    private void btn_salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseExited
        iconos_salidas.setBackground(new Color(0xCFF1A4));
         btn_salir.setForeground(Color.BLACK);
        
    }//GEN-LAST:event_btn_salirMouseExited

    private void entrar_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrar_btnMouseEntered
        fondo_boton.setBackground(new Color(0x66bb6a));
        entrar_btn.setForeground(Color.WHITE);
    }//GEN-LAST:event_entrar_btnMouseEntered

    private void entrar_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrar_btnMouseExited
        fondo_boton.setBackground(new Color(0x1b5e20));
        entrar_btn.setForeground(Color.BLACK);
    }//GEN-LAST:event_entrar_btnMouseExited

    // Variable para verificar si el campo ya ha sido limpiado
    
    private boolean limpiado = false;
    private void jTextField_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_usuarioMousePressed
    // Verificar si el campo ha sido limpiado antes
       if(!limpiado){
           //limpiar el texto
           if(!jTextField_usuario.getText().equals("")){
               jTextField_usuario.setText("");
           }
           limpiado = true;
       }
    }//GEN-LAST:event_jTextField_usuarioMousePressed
    private boolean limpiado2 = false;
    private void jPasswordField_contraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField_contraseñaMousePressed
       // Verificar si el campo ha sido limpiado antes
       if(!limpiado2){
           //limpiar el texto
           jPasswordField_contraseña.setText("");
           limpiado2 = true;
       }
    }//GEN-LAST:event_jPasswordField_contraseñaMousePressed

    private void entrar_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrar_btnMouseClicked
       
    }//GEN-LAST:event_entrar_btnMouseClicked

    private void entrar_btnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entrar_btnFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_entrar_btnFocusGained

    private void entrar_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrar_btnMousePressed
         this.Login();
    }//GEN-LAST:event_entrar_btnMousePressed

    private void jTextField_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_usuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login login = new Login();
                login.setVisible(true);
                login.setLocationRelativeTo(null); //para centar el panel de salida
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barra_salida;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bgJL;
    private javax.swing.JLabel bienvenidosJL;
    private javax.swing.JLabel btn_salir;
    private javax.swing.JLabel entrar_btn;
    private swing.PanelRound fondo_boton;
    private javax.swing.JLabel iconPasswordJL;
    private javax.swing.JLabel iconUserJL;
    private javax.swing.JPanel iconos_salidas;
    private javax.swing.JPasswordField jPasswordField_contraseña;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField_usuario;
    private javax.swing.JLabel logoJL;
    // End of variables declaration//GEN-END:variables
    private void Login() {
    if (!jTextField_usuario.getText().isEmpty() && !jPasswordField_contraseña.getText().isEmpty()) {
        // Instanciando el método
        ctrl_usuario controlUsuario = new ctrl_usuario();
        usuario Usuario = new usuario();
        
        String telefonoStr = jTextField_usuario.getText().trim();
        
        // Validar que el número de teléfono sea un número
        if (telefonoStr.matches("\\d+")) { // Solo permite dígitos
            Usuario.setTelefono((telefonoStr));
            //Usuario.setTelefono( Long.parseLong(telefonoStr)); //aca
        } else {
            JOptionPane.showMessageDialog(null, "El número de teléfono debe ser numérico");
            return; // Salir si no es un número
        }
        
        
        Usuario.setContraseña(jPasswordField_contraseña.getText().trim());
        
        // Pasamos el objeto Usuario a la clase Principal
        if (controlUsuario.loginUsuario(Usuario)) {
            //logica aca
             // Registrar inicio de sesión en la base de datos el campo inicio_sesion
            boolean inicioRegistrado = controlUsuario.registrarInicioSesion(Usuario.getTelefono());            
            if (!inicioRegistrado) {
                JOptionPane.showMessageDialog(this, "Error al registrar el inicio de sesión.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            AppContext.setUsuarioActual(Usuario);
            Principal principal = new Principal(Usuario);
            principal.setVisible(true);
            principal.setLocationRelativeTo(null);
            this.dispose();
            
            JLabel label = new JLabel("Bienvenido: " + Usuario.getNombre());
            label.setFont(new Font("Baskerville Old Face", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(null, label, "FRANNA TECNOLOGÍAS AVANZADAS", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o Contraseña Incorrecto");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Ingrese sus Credenciales");
    }
}

}

