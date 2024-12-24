package GUI;
import controlador.ctrl_material;
import controlador.ctrl_produccion;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import modelo.Material;
import modelo.Paca;
import modelo.Produccion;
public class Produccion_Paca extends javax.swing.JFrame {
    ctrl_material material = new ctrl_material();
    public Produccion_Paca() {
        initComponents();
        herramientas();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_principal = new javax.swing.JPanel();
        panel_barra = new javax.swing.JPanel();
        panel_fondo = new swing.PanelRound();
        panel_atras = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Produccion = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        combox_material = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        pacas_generadas = new javax.swing.JTextField();
        panel_btn = new swing.PanelRound();
        label_btn = new javax.swing.JLabel();
        stock_disponible = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        panelRound1 = new swing.PanelRound();
        pacas_genero = new javax.swing.JTextField();
        panelRound2 = new swing.PanelRound();
        excedentes = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(950, 700));
        setMinimumSize(new java.awt.Dimension(950, 700));
        setUndecorated(true);
        setResizable(false);

        panel_principal.setBackground(new java.awt.Color(48, 56, 65));
        panel_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_barra.setBackground(new java.awt.Color(44, 62, 80));

        panel_fondo.setBackground(new java.awt.Color(44, 62, 80));
        panel_fondo.setPreferredSize(new java.awt.Dimension(40, 40));
        panel_fondo.setRoundBottomLeft(100);
        panel_fondo.setRoundBottomRight(100);
        panel_fondo.setRoundTopLeft(100);
        panel_fondo.setRoundTopRight(100);

        panel_atras.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panel_atras.setForeground(new java.awt.Color(0, 0, 0));
        panel_atras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel_atras.setText("");
        panel_atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_atras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panel_atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_atrasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_atrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_atrasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_fondoLayout = new javax.swing.GroupLayout(panel_fondo);
        panel_fondo.setLayout(panel_fondoLayout);
        panel_fondoLayout.setHorizontalGroup(
            panel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_atras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        panel_fondoLayout.setVerticalGroup(
            panel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_atras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Modulo de Producción");

        javax.swing.GroupLayout panel_barraLayout = new javax.swing.GroupLayout(panel_barra);
        panel_barra.setLayout(panel_barraLayout);
        panel_barraLayout.setHorizontalGroup(
            panel_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_barraLayout.createSequentialGroup()
                .addComponent(panel_fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 367, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(362, 362, 362))
        );
        panel_barraLayout.setVerticalGroup(
            panel_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel_principal.add(panel_barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Ingrese la Producción en KG ");
        panel_principal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, -1));

        Produccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Produccion.setBorder(null);
        Produccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProduccionActionPerformed(evt);
            }
        });
        Produccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ProduccionKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ProduccionKeyReleased(evt);
            }
        });
        panel_principal.add(Produccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 210, 25));
        panel_principal.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 210, 20));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("Seleccione que Material ");
        panel_principal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, -1));

        panel_principal.add(combox_material, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 150, 25));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("Pacas Generadas");
        panel_principal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, -1, -1));

        pacas_generadas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pacas_generadas.setBorder(null);
        panel_principal.add(pacas_generadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 200, 25));

        panel_btn.setBackground(new java.awt.Color(92, 189, 110));
        panel_btn.setRoundBottomLeft(10);
        panel_btn.setRoundBottomRight(10);
        panel_btn.setRoundTopLeft(10);
        panel_btn.setRoundTopRight(10);

        label_btn.setBackground(new java.awt.Color(92, 189, 110));
        label_btn.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        label_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_btn.setText("GENERAR");
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
        });

        javax.swing.GroupLayout panel_btnLayout = new javax.swing.GroupLayout(panel_btn);
        panel_btn.setLayout(panel_btnLayout);
        panel_btnLayout.setHorizontalGroup(
            panel_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        panel_btnLayout.setVerticalGroup(
            panel_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panel_principal.add(panel_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 150, 50));

        stock_disponible.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        stock_disponible.setBorder(null);
        stock_disponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stock_disponibleActionPerformed(evt);
            }
        });
        panel_principal.add(stock_disponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 120, 70, 25));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setText("Stock Disponible");
        panel_principal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 70, -1, -1));
        panel_principal.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 150, 70, 30));
        panel_principal.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 200, 30));

        panelRound1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pacas Generadas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 10), new java.awt.Color(102, 102, 102))); // NOI18N
        panelRound1.setRoundBottomLeft(10);
        panelRound1.setRoundBottomRight(10);
        panelRound1.setRoundTopLeft(10);
        panelRound1.setRoundTopRight(10);

        pacas_genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacas_generoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pacas_genero, javax.swing.GroupLayout.DEFAULT_SIZE, 886, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pacas_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_principal.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 920, -1));

        panelRound2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Excedente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 10), new java.awt.Color(102, 102, 102))); // NOI18N

        excedentes.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(excedentes, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addComponent(excedentes, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_principal.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 620, 430, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panel_atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_atrasMouseClicked
        // TODO add your handling code here:
        Menu_Vista_Produccion menu_vista = new Menu_Vista_Produccion();
        menu_vista.setVisible(true);
        menu_vista.setLocationRelativeTo(null);
        //cerrar procesos que quedaron anteriormente     
        this.dispose();
    }//GEN-LAST:event_panel_atrasMouseClicked

    private void panel_atrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_atrasMouseEntered
        // TODO add your handling code here:
        panel_fondo.setBackground(new Color(0x1e2b38));
        panel_atras.setForeground(Color.WHITE);
    }//GEN-LAST:event_panel_atrasMouseEntered

    private void panel_atrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_atrasMouseExited
        // TODO add your handling code here:
        panel_fondo.setBackground(new Color(0x2C3E50));
        panel_atras.setForeground(Color.BLACK);

    }//GEN-LAST:event_panel_atrasMouseExited

    private void ProduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProduccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProduccionActionPerformed

    private void stock_disponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stock_disponibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stock_disponibleActionPerformed

    private void ProduccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ProduccionKeyReleased
        try {
        String valorProduccion = Produccion.getText();

        // Verificar si el campo no está vacío
        if (!valorProduccion.isEmpty()) {
            // Validar si el texto es un número antes de intentar convertirlo
            if (isNumeric(valorProduccion)) {
                int kilosProduccion = Integer.parseInt(valorProduccion);

                // Validar que el valor sea positivo
                if (kilosProduccion <= 0) {
                    JOptionPane.showMessageDialog(this,
                            "Por favor, ingrese un valor positivo para la producción.",
                            "Error de Entrada", JOptionPane.ERROR_MESSAGE);
                    resetCampos();
                    return;
                }

                // Generar pesos de pacas
                List<Integer> pesosPacas = distribuirPesosPacas(kilosProduccion);
                List<Integer> pacasValidas = new ArrayList<>();
                double excedenteValor = 0;

                // Filtrar las pacas válidas que no sean menores a 690 kg
                for (int peso : pesosPacas) {
                    if (peso >= 690) {
                        pacasValidas.add(peso);
                    } else {
                        // Sumar al excedente cualquier paca que no cumpla con el mínimo
                        excedenteValor += peso;
                    }
                }

                // Construir el texto para mostrar la distribución de pacas válidas
                StringBuilder distribucion = new StringBuilder();
                for (int i = 0; i < pacasValidas.size(); i++) {
                    distribucion.append(pacasValidas.get(i));
                    if (i < pacasValidas.size() - 1) {
                        distribucion.append(", ");
                    }
                }

                // Mostrar resultados en los campos de texto
                pacas_generadas.setText(String.valueOf(pacasValidas.size())); // Total de pacas válidas
                pacas_genero.setText(distribucion.toString());             // Detalle de las pacas válidas
                excedentes.setText(String.format("%.2f", excedenteValor) + " kg");  // Excedente no utilizado
            } else {
                JOptionPane.showMessageDialog(this,
                        "Por favor, ingrese un valor numérico válido.",
                        "Error de Entrada", JOptionPane.ERROR_MESSAGE);
                resetCampos();
            }
        } else {
            JOptionPane.showMessageDialog(this,
                    "Por favor, ingrese un valor válido para la producción.",
                    "Error de Entrada", JOptionPane.ERROR_MESSAGE);
        }
    } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(this,
                e.getMessage(),
                "Error de Producción", JOptionPane.WARNING_MESSAGE);
        resetCampos();   
    }


    }//GEN-LAST:event_ProduccionKeyReleased

    private void ProduccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ProduccionKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ProduccionKeyPressed

    private void label_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_btnMouseClicked
        try {
          // Validar si no se ha seleccionado un material
        if (combox_material.getSelectedIndex() == -1 || combox_material.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this,
                    "Por favor, seleccione un material antes de continuar.",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
            return; // Salir del método si no hay selección válida
        } 
        // Obtener el objeto Material seleccionado
        Material materialSeleccionado = (Material) combox_material.getSelectedItem();

        // Obtener el id_material usando el método de la instancia
        int idMaterial = ctrl_produccion.obtenerIdMaterialPorNombre(materialSeleccionado);

        // Obtener el valor de kilos de producción que se ingresó en el JTextField (o de otro componente)
        String valorProduccion = pacas_genero.getText().trim();  // El JTextField tiene el valor de los kilos de producción

        // Validar que el valor de producción no esté vacío
        if (valorProduccion.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Por favor, ingrese un valor para la producción.",
                    "Error de Entrada", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar y convertir el valor de producción
        String[] kilosArray = valorProduccion.split(",");  // Dividimos la cadena por comas si es necesario

        // Asegurarse de que todos los valores sean números válidos
        int kilosProduccion = 0;
        for (String kiloStr : kilosArray) {
            try {
                kilosProduccion += Integer.parseInt(kiloStr.trim());  // Convertir cada número y sumarlo
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this,
                        "Por favor, ingrese un valor numérico válido.",
                        "Error de Entrada", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        // Verificar si el valor de producción es positivo
        if (kilosProduccion <= 0) {
            JOptionPane.showMessageDialog(this,
                    "Por favor, ingrese un valor positivo para la producción.",
                    "Error de Entrada", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Crear un objeto Produccion con el material seleccionado y los kilos utilizados
        Produccion produccion = new Produccion();
        produccion.setId_material(idMaterial);  // Usamos el id_material obtenido
        produccion.setKg_utilizados(kilosProduccion);

        // Registrar la producción y obtener el id_produccion
        int idProduccion = ctrl_produccion.registrarProduccion(produccion);
        
        // **Actualizar el material restando los kilos utilizados**
        ctrl_produccion.actualizarMaterial(idMaterial, kilosProduccion); // Llamada estática correcta




        // Generar los pesos de las pacas
        List<Integer> pesosPacas = distribuirPesosPacas(kilosProduccion);  // Método para dividir el total de kilos en pacas

        // Registrar las pacas con el id_produccion obtenido
        ctrl_produccion.registrarPacas(idProduccion, pesosPacas);

        // Mostrar mensaje de éxito
        JOptionPane.showMessageDialog(this, "Producción y pacas registradas exitosamente.");
        reiniciar_campos();
        ctrl_material mate = new ctrl_material();
        mate.bucarMaterial(combox_material);

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this,
                "Hubo un error al registrar la producción o las pacas.",
                "Error", JOptionPane.ERROR_MESSAGE);
    } catch (NumberFormatException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this,
                "Por favor, ingrese un valor numérico válido.",
                "Error de Entrada", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_label_btnMouseClicked

    private void pacas_generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacas_generoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pacas_generoActionPerformed

    private void label_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_btnMouseEntered
        // TODO add your handling code here:
        panel_btn.setBackground(new Color(0x40844d));
    }//GEN-LAST:event_label_btnMouseEntered

    private void label_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_btnMouseExited
        // TODO add your handling code here:
        panel_btn.setBackground(new Color(0x5CBD6E));
    }//GEN-LAST:event_label_btnMouseExited

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
            java.util.logging.Logger.getLogger(Produccion_Paca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produccion_Paca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produccion_Paca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produccion_Paca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Produccion_Paca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Produccion;
    private javax.swing.JComboBox<String> combox_material;
    private javax.swing.JTextField excedentes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel label_btn;
    private javax.swing.JTextField pacas_generadas;
    private javax.swing.JTextField pacas_genero;
    private swing.PanelRound panelRound1;
    private swing.PanelRound panelRound2;
    private javax.swing.JLabel panel_atras;
    private javax.swing.JPanel panel_barra;
    private swing.PanelRound panel_btn;
    private swing.PanelRound panel_fondo;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JTextField stock_disponible;
    // End of variables declaration//GEN-END:variables
    
    public void Extras(){
        Produccion.setBackground(new java.awt.Color(0,0,0,1));
        pacas_generadas.setBackground(new java.awt.Color(0,0,0,1));
        stock_disponible.setBackground(new java.awt.Color(0,0,0,1));
    }
    public void herramientas(){
        
        //construyendo lal logica aca hay que ver si realizar otra cosnukta porquye no funciona
        ctrl_material mate = new ctrl_material();
        stock_disponible.disable();
        Produccion.disable();
        pacas_generadas.disable();
        mate.bucarMaterial(combox_material);
        label_btn.disable();
        panel_btn.disable();
        combox_material.addActionListener(fleteEvent ->{
            
        Object selectedItem = combox_material.getSelectedItem();
        if (selectedItem instanceof String && selectedItem.equals("--Seleccionar--")) {
            Produccion.disable();
            pacas_generadas.disable();
            label_btn.disable();
            panel_btn.disable();
            
        }else if(selectedItem instanceof Material){
            Material selectedMaterial = (Material) selectedItem;
            Produccion.enable();
            pacas_generadas.enable();
            label_btn.enable();
            panel_btn.enable();
            stock_disponible.setText(String.valueOf(selectedMaterial.getCantidad_kg()));        
        }
        
    });   
    }
   //
   private List<Integer> distribuirPesosPacas(int kilosProduccion) {
    List<Integer> pesosPacas = new ArrayList<>();

    // Calcular cuántas pacas de 690 kg se pueden generar
    int numeroPacas = kilosProduccion / 750;

    // Distribuir los kilos de producción entre las pacas
    for (int i = 0; i < numeroPacas; i++) {
        pesosPacas.add(750); // Cada paca tendrá un peso fijo de 690 kg
    }

    // Si sobra algo de producción que no alcanza para una paca válida (menos de 690 kg), se registra como excedente
    int excedente = kilosProduccion % 750;

    if (excedente > 0) {
        pesosPacas.add(excedente);  // El sobrante se agrega al excedente
    }

    return pesosPacas;
}
   // Método auxiliar para verificar si la cadena es un número
    private boolean isNumeric(String str) {
        try {
            Integer.parseInt(str); // Intentar convertir la cadena a un número
            return true;
        } catch (NumberFormatException e) {
            return false; // Si falla la conversión, no es un número
        }
    }

    // Método para reiniciar los campos de texto en caso de error
    private void resetCampos() {
        Produccion.setText("");
        pacas_generadas.setText("");
        pacas_genero.setText("");
        excedentes.setText("");
    }
    private void reiniciar_campos(){
        Produccion.setText("");
        pacas_generadas.setText("");
        stock_disponible.setText("");
        combox_material.setSelectedIndex(0);
        pacas_genero.setText("");
        excedentes.setText("");
    
    }
    //quedo los metodo para realizar pacas ya solo falto incluir las vistas 
}