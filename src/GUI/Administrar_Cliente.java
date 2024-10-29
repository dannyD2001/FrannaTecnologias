package GUI;
import com.formdev.flatlaf.FlatDarkLaf;
import controlador.ctrl_cliente;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import modelo.Cliente;
import modelo.usuario;
public class Administrar_Cliente extends javax.swing.JFrame {
    public Administrar_Cliente() {
        // Aplica el tema oscuro de FlatLaf
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
        }
        initComponents();
        EliminarBorde();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_principal = new javax.swing.JPanel();
        panel_barra = new javax.swing.JPanel();
        panel_atras = new swing.PanelRound();
        atras = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panel_ = new swing.PanelRound();
        subpanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nombre_cliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        telefono_cliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ciudad_cliente = new javax.swing.JTextField();
        panel_boton = new swing.PanelRound();
        icon_btn = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        apellido_p = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setUndecorated(true);
        setResizable(false);

        panel_principal.setBackground(new java.awt.Color(92, 189, 110));
        panel_principal.setMaximumSize(new java.awt.Dimension(800, 500));
        panel_principal.setMinimumSize(new java.awt.Dimension(800, 500));

        panel_barra.setBackground(new java.awt.Color(92, 189, 110));

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
            .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panel_atrasLayout.setVerticalGroup(
            panel_atrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(atras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Administar Cliente");

        javax.swing.GroupLayout panel_barraLayout = new javax.swing.GroupLayout(panel_barra);
        panel_barra.setLayout(panel_barraLayout);
        panel_barraLayout.setHorizontalGroup(
            panel_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_barraLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panel_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(284, 284, 284)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_barraLayout.setVerticalGroup(
            panel_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_barraLayout.createSequentialGroup()
                .addGroup(panel_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_atras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        panel_.setBackground(new java.awt.Color(255, 255, 255));
        panel_.setRoundBottomLeft(20);
        panel_.setRoundBottomRight(20);
        panel_.setRoundTopLeft(20);
        panel_.setRoundTopRight(20);

        subpanel.setBackground(new java.awt.Color(255, 255, 255));
        subpanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(102, 102, 102)))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre");

        nombre_cliente.setForeground(new java.awt.Color(0, 0, 0));
        nombre_cliente.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Telefono");

        telefono_cliente.setForeground(new java.awt.Color(0, 0, 0));
        telefono_cliente.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Ciudad");

        ciudad_cliente.setForeground(new java.awt.Color(0, 0, 0));
        ciudad_cliente.setBorder(null);
        ciudad_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciudad_clienteActionPerformed(evt);
            }
        });

        panel_boton.setBackground(new java.awt.Color(92, 189, 110));
        panel_boton.setRoundBottomLeft(20);
        panel_boton.setRoundBottomRight(20);
        panel_boton.setRoundTopLeft(20);
        panel_boton.setRoundTopRight(20);

        icon_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png"))); // NOI18N
        icon_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icon_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icon_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icon_btnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_botonLayout = new javax.swing.GroupLayout(panel_boton);
        panel_boton.setLayout(panel_botonLayout);
        panel_botonLayout.setHorizontalGroup(
            panel_botonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panel_botonLayout.setVerticalGroup(
            panel_botonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Apellido Paterno");

        apellido_p.setForeground(new java.awt.Color(0, 0, 0));
        apellido_p.setBorder(null);

        javax.swing.GroupLayout subpanelLayout = new javax.swing.GroupLayout(subpanel);
        subpanel.setLayout(subpanelLayout);
        subpanelLayout.setHorizontalGroup(
            subpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subpanelLayout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(panel_boton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(subpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, subpanelLayout.createSequentialGroup()
                        .addComponent(nombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(30, 30, 30)
                .addGroup(subpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(apellido_p)
                    .addComponent(jSeparator2))
                .addGap(30, 30, 30)
                .addGroup(subpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(telefono_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(jSeparator3))
                .addGap(30, 30, 30)
                .addGroup(subpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ciudad_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jSeparator4))
                .addGap(180, 180, 180))
        );
        subpanelLayout.setVerticalGroup(
            subpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subpanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(subpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(subpanelLayout.createSequentialGroup()
                        .addGroup(subpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(27, 27, 27)
                        .addGroup(subpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefono_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ciudad_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellido_p, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(subpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(panel_boton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );

        javax.swing.GroupLayout panel_Layout = new javax.swing.GroupLayout(panel_);
        panel_.setLayout(panel_Layout);
        panel_Layout.setHorizontalGroup(
            panel_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(subpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panel_Layout.setVerticalGroup(
            panel_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(subpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout panel_principalLayout = new javax.swing.GroupLayout(panel_principal);
        panel_principal.setLayout(panel_principalLayout);
        panel_principalLayout.setHorizontalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_principalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addComponent(panel_barra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_principalLayout.setVerticalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_principalLayout.createSequentialGroup()
                .addComponent(panel_barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseClicked
        usuario usuarioActual = new usuario();
        Principal principal = new Principal(usuarioActual);
        principal.setVisible(true);
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

    private void ciudad_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciudad_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ciudad_clienteActionPerformed

    private void icon_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_btnMouseClicked
        // TODO add your handling code here:
        Cliente cliente = new Cliente();
        ctrl_cliente contrCliente = new ctrl_cliente();

        // Verificar que todos los campos estén llenos
        if (nombre_cliente.getText().isEmpty() || telefono_cliente.getText().isEmpty() || ciudad_cliente.getText().isEmpty() || apellido_p.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, completa todos los campos");
            return;
        }

        // Validaciones de caracteres y números
        if (!nombre_cliente.getText().matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+") || !ciudad_cliente.getText().matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+") || !apellido_p.getText().matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
            JOptionPane.showMessageDialog(null, "Los campos de nombre, apellido y ciudad solo deben contener caracteres");
            return;
        }

        if (!telefono_cliente.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "El teléfono solo debe contener números");
            return;
        }

        if (!telefono_cliente.getText().matches("\\d{10}")) {
            JOptionPane.showMessageDialog(null, "El teléfono debe contener 10 dígitos numéricos");
            return;
        }

        // Verificar si el cliente ya está registrado
        if (!contrCliente.existeCliente(telefono_cliente.getText().trim())) {
            // Si no existe, registrar el cliente
            cliente.setNombre_cliente(capitalize(nombre_cliente.getText()));
            cliente.setApellido_p(capitalize(apellido_p.getText()));
            cliente.setTelefono(telefono_cliente.getText().trim());  // El teléfono no requiere capitalización
            cliente.setCiudad(capitalize(ciudad_cliente.getText()));

            // Registrar el cliente en la base de datos
            if (contrCliente.registrarCliente(cliente)) {
                //JOptionPane.showMessageDialog(null, "Cliente registrado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "Error al registrar el cliente");
            }
        } else {
            // Si el cliente ya existe, mostrar un mensaje y detener la ejecución
            JOptionPane.showMessageDialog(null, "El cliente ya existe");
            return;
        }

        limpiar();  // Limpiar los campos si el cliente fue registrado correctamente
    }//GEN-LAST:event_icon_btnMouseClicked

    private void icon_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_btnMouseEntered
        // TODO add your handling code here:
        panel_boton.setBackground(new Color(0x499758));
    }//GEN-LAST:event_icon_btnMouseEntered

    private void icon_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_btnMouseExited
        // TODO add your handling code here:
        panel_boton.setBackground(new Color(0x5CBD6E));
    }//GEN-LAST:event_icon_btnMouseExited
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
            java.util.logging.Logger.getLogger(Administrar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrar_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido_p;
    private javax.swing.JLabel atras;
    private javax.swing.JTextField ciudad_cliente;
    private javax.swing.JLabel icon_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField nombre_cliente;
    private swing.PanelRound panel_;
    private swing.PanelRound panel_atras;
    private javax.swing.JPanel panel_barra;
    private swing.PanelRound panel_boton;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JPanel subpanel;
    private javax.swing.JTextField telefono_cliente;
    // End of variables declaration//GEN-END:variables
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

    private void limpiar(){
        nombre_cliente.setText("");
        apellido_p.setText("");
        telefono_cliente.setText("");
        ciudad_cliente.setText("");
   
    }
    public void EliminarBorde(){
        nombre_cliente.setBackground(new java.awt.Color(0,0,0,1));
        apellido_p.setBackground(new java.awt.Color(0,0,0,1));
        telefono_cliente.setBackground(new java.awt.Color(0,0,0,1));
        ciudad_cliente.setBackground(new java.awt.Color(0,0,0,1));    
    }
}
