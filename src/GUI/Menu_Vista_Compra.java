package GUI;
import Util.AppContext;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import modelo.usuario;
public class Menu_Vista_Compra extends javax.swing.JFrame {     
    
    public Menu_Vista_Compra() {
        initComponents();
        this.setTitle("MENU COMPRAS");
        Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/compra1.png"));
        this.setIconImage(icono);
        this.setLocationRelativeTo(null);
         //Recuperar usuario actual   
        usuario usuarioActual = AppContext.getUsuarioActual();
        nombre_.setBackground(new java.awt.Color(0,0,0,1));
        usuario_apellido.setBackground(new java.awt.Color(0,0,0,1));
        usuario_.setBackground(new java.awt.Color(0,0,0,1));
        nombre_.setText(usuarioActual.getNombre());
        usuario_.setText(usuarioActual.getTipo_usuario());
        usuario_apellido.setText(usuarioActual.getApellidoM());
        
       nombre_.setForeground(new Color(0x323232));
       usuario_.setForeground(new Color(0x323232));
       usuario_apellido.setForeground(new Color(0x323232));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_principal = new javax.swing.JPanel();
        barra = new javax.swing.JPanel();
        panel_atras = new swing.PanelRound();
        atras = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panel_principal_verde = new swing.PanelRound();
        panel_material = new swing.PanelRound();
        material = new javax.swing.JLabel();
        panel_pacas = new swing.PanelRound();
        pacas = new javax.swing.JLabel();
        panel_logo = new swing.PanelRound();
        panelRound2 = new swing.PanelRound();
        usuario = new javax.swing.JLabel();
        usuario_ = new javax.swing.JTextField();
        usuario_apellido = new javax.swing.JTextField();
        nombre_ = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        panel_menu_graficas = new swing.PanelRound();
        panel_compras_realizadas = new swing.PanelRound();
        btn_compras = new javax.swing.JLabel();
        label_nombre_comopras = new javax.swing.JLabel();
        panel_compras_stock = new swing.PanelRound();
        btn_stock = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelRound1 = new swing.PanelRound();
        jLabel3 = new javax.swing.JLabel();
        panel_actualizar_precios = new swing.PanelRound();
        label_nombre_comopras1 = new javax.swing.JLabel();
        label_nombre_comopras2 = new javax.swing.JLabel();
        panel_actualizar_material = new swing.PanelRound();
        jLabel6 = new javax.swing.JLabel();
        panel_actualizar_paca = new swing.PanelRound();
        jLabel7 = new javax.swing.JLabel();
        panel_pagos_pendientes = new swing.PanelRound();
        label_pagos_pendientes = new javax.swing.JLabel();
        btn_pagos_pendientes = new swing.PanelRound();
        label_pendiente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 950, 700));
        setMinimumSize(new java.awt.Dimension(950, 700));
        setUndecorated(true);
        setSize(new java.awt.Dimension(950, 700));

        panel_principal.setBackground(new java.awt.Color(255, 255, 255));
        panel_principal.setMaximumSize(new java.awt.Dimension(950, 700));
        panel_principal.setMinimumSize(new java.awt.Dimension(950, 700));
        panel_principal.setPreferredSize(new java.awt.Dimension(950, 700));
        panel_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barra.setBackground(new java.awt.Color(82, 170, 99));
        barra.setPreferredSize(new java.awt.Dimension(950, 40));

        panel_atras.setBackground(new java.awt.Color(82, 170, 99));
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
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(panel_atrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(atras, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );
        panel_atrasLayout.setVerticalGroup(
            panel_atrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(panel_atrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(atras, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout barraLayout = new javax.swing.GroupLayout(barra);
        barra.setLayout(barraLayout);
        barraLayout.setHorizontalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
            .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(barraLayout.createSequentialGroup()
                    .addComponent(panel_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 910, Short.MAX_VALUE)))
            .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraLayout.createSequentialGroup()
                    .addGap(0, 400, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_atras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_principal.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 40));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(50, 50, 50));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carrito.png"))); // NOI18N
        jLabel1.setText("Ola! Realiza la Compra");
        panel_principal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 490, 40));

        panel_principal_verde.setBackground(new java.awt.Color(82, 170, 99));
        panel_principal_verde.setRoundBottomRight(25);

        panel_material.setBackground(new java.awt.Color(73, 151, 88));
        panel_material.setRoundBottomLeft(40);
        panel_material.setRoundBottomRight(40);
        panel_material.setRoundTopLeft(40);
        panel_material.setRoundTopRight(40);

        material.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        material.setForeground(new java.awt.Color(50, 50, 50));
        material.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        material.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/recycle.png"))); // NOI18N
        material.setText("Material(Granel)");
        material.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        material.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        material.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        material.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                materialMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                materialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                materialMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_materialLayout = new javax.swing.GroupLayout(panel_material);
        panel_material.setLayout(panel_materialLayout);
        panel_materialLayout.setHorizontalGroup(
            panel_materialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(material, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
        );
        panel_materialLayout.setVerticalGroup(
            panel_materialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(material, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
        );

        panel_pacas.setBackground(new java.awt.Color(73, 151, 88));
        panel_pacas.setRoundBottomLeft(40);
        panel_pacas.setRoundBottomRight(40);
        panel_pacas.setRoundTopLeft(40);
        panel_pacas.setRoundTopRight(40);

        pacas.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        pacas.setForeground(new java.awt.Color(50, 50, 50));
        pacas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pacas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-caja-20.png"))); // NOI18N
        pacas.setText("Paca");
        pacas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pacas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pacas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pacas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pacasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pacasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_pacasLayout = new javax.swing.GroupLayout(panel_pacas);
        panel_pacas.setLayout(panel_pacasLayout);
        panel_pacasLayout.setHorizontalGroup(
            panel_pacasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pacas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
        );
        panel_pacasLayout.setVerticalGroup(
            panel_pacasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pacas, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_principal_verdeLayout = new javax.swing.GroupLayout(panel_principal_verde);
        panel_principal_verde.setLayout(panel_principal_verdeLayout);
        panel_principal_verdeLayout.setHorizontalGroup(
            panel_principal_verdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_principal_verdeLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panel_principal_verdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel_pacas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        panel_principal_verdeLayout.setVerticalGroup(
            panel_principal_verdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_principal_verdeLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(panel_material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(panel_pacas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(286, Short.MAX_VALUE))
        );

        panel_principal.add(panel_principal_verde, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 400, 660));

        panel_logo.setBackground(new java.awt.Color(111, 181, 125));
        panel_logo.setRoundBottomLeft(20);
        panel_logo.setRoundBottomRight(20);
        panel_logo.setRoundTopLeft(20);
        panel_logo.setRoundTopRight(20);

        javax.swing.GroupLayout panel_logoLayout = new javax.swing.GroupLayout(panel_logo);
        panel_logo.setLayout(panel_logoLayout);
        panel_logoLayout.setHorizontalGroup(
            panel_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        panel_logoLayout.setVerticalGroup(
            panel_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        panel_principal.add(panel_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, 160, 190));

        panelRound2.setBackground(new java.awt.Color(106, 154, 176));
        panelRound2.setRoundBottomLeft(20);
        panelRound2.setRoundBottomRight(20);
        panelRound2.setRoundTopLeft(20);
        panelRound2.setRoundTopRight(20);

        usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-usuario-20.png"))); // NOI18N
        usuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        usuario_.setEditable(false);
        usuario_.setBackground(new java.awt.Color(50, 50, 50));
        usuario_.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        usuario_.setForeground(new java.awt.Color(50, 50, 50));
        usuario_.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usuario_.setBorder(null);

        usuario_apellido.setEditable(false);
        usuario_apellido.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        usuario_apellido.setForeground(new java.awt.Color(50, 50, 50));
        usuario_apellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usuario_apellido.setBorder(null);

        nombre_.setEditable(false);
        nombre_.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        nombre_.setForeground(new java.awt.Color(50, 50, 50));
        nombre_.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombre_.setBorder(null);
        nombre_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addComponent(usuario)
                        .addGap(2, 2, 2)
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2)
                            .addComponent(usuario_, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelRound2Layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRound2Layout.createSequentialGroup()
                                .addComponent(nombre_, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(usuario_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuario_, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuario_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        panel_principal.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 160, 140));

        panel_menu_graficas.setBackground(new java.awt.Color(170, 205, 177));
        panel_menu_graficas.setRoundBottomLeft(20);
        panel_menu_graficas.setRoundBottomRight(20);
        panel_menu_graficas.setRoundTopLeft(20);
        panel_menu_graficas.setRoundTopRight(20);

        panel_compras_realizadas.setBackground(new java.awt.Color(82, 170, 99));
        panel_compras_realizadas.setRoundBottomLeft(20);
        panel_compras_realizadas.setRoundBottomRight(20);
        panel_compras_realizadas.setRoundTopLeft(20);
        panel_compras_realizadas.setRoundTopRight(20);

        btn_compras.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btn_compras.setForeground(new java.awt.Color(255, 255, 255));
        btn_compras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_compras.setText("    COMPRAS");
        btn_compras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_compras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_compras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_comprasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_comprasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_comprasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_compras_realizadasLayout = new javax.swing.GroupLayout(panel_compras_realizadas);
        panel_compras_realizadas.setLayout(panel_compras_realizadasLayout);
        panel_compras_realizadasLayout.setHorizontalGroup(
            panel_compras_realizadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_compras, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
        );
        panel_compras_realizadasLayout.setVerticalGroup(
            panel_compras_realizadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_compras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        label_nombre_comopras.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        label_nombre_comopras.setForeground(new java.awt.Color(50, 50, 50));
        label_nombre_comopras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-compra-24.png"))); // NOI18N
        label_nombre_comopras.setText("Compras Realizadas(Granel)");
        label_nombre_comopras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_nombre_comopras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        panel_compras_stock.setBackground(new java.awt.Color(82, 170, 99));
        panel_compras_stock.setRoundBottomLeft(20);
        panel_compras_stock.setRoundBottomRight(20);
        panel_compras_stock.setRoundTopLeft(20);
        panel_compras_stock.setRoundTopRight(20);

        btn_stock.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btn_stock.setForeground(new java.awt.Color(255, 255, 255));
        btn_stock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_stock.setText("STOCK");
        btn_stock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_stock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_stockMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_stockMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_stockMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_compras_stockLayout = new javax.swing.GroupLayout(panel_compras_stock);
        panel_compras_stock.setLayout(panel_compras_stockLayout);
        panel_compras_stockLayout.setHorizontalGroup(
            panel_compras_stockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_stock, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panel_compras_stockLayout.setVerticalGroup(
            panel_compras_stockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_stock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(50, 50, 50));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-stock-24.png"))); // NOI18N
        jLabel4.setText("Inventario Material(Granel)");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(50, 50, 50));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-stock-24.png"))); // NOI18N
        jLabel5.setText("Inventario Paca");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        panelRound1.setBackground(new java.awt.Color(82, 170, 99));
        panelRound1.setPreferredSize(new java.awt.Dimension(99, 39));
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("STOCK");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_menu_graficasLayout = new javax.swing.GroupLayout(panel_menu_graficas);
        panel_menu_graficas.setLayout(panel_menu_graficasLayout);
        panel_menu_graficasLayout.setHorizontalGroup(
            panel_menu_graficasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menu_graficasLayout.createSequentialGroup()
                .addGroup(panel_menu_graficasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_menu_graficasLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(panel_compras_realizadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_menu_graficasLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(label_nombre_comopras, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panel_menu_graficasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_menu_graficasLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_menu_graficasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel_compras_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_menu_graficasLayout.createSequentialGroup()
                .addContainerGap(195, Short.MAX_VALUE)
                .addGroup(panel_menu_graficasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        panel_menu_graficasLayout.setVerticalGroup(
            panel_menu_graficasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_menu_graficasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panel_menu_graficasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(label_nombre_comopras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(panel_menu_graficasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_compras_realizadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_compras_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        panel_principal.add(panel_menu_graficas, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 330, 320));

        panel_actualizar_precios.setBackground(new java.awt.Color(65, 179, 162));
        panel_actualizar_precios.setRoundBottomLeft(20);
        panel_actualizar_precios.setRoundBottomRight(20);
        panel_actualizar_precios.setRoundTopLeft(20);
        panel_actualizar_precios.setRoundTopRight(20);

        label_nombre_comopras1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        label_nombre_comopras1.setForeground(new java.awt.Color(50, 50, 50));
        label_nombre_comopras1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-compra-24.png"))); // NOI18N
        label_nombre_comopras1.setText("Actualizar Precio Paca");
        label_nombre_comopras1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_nombre_comopras1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        label_nombre_comopras2.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        label_nombre_comopras2.setForeground(new java.awt.Color(50, 50, 50));
        label_nombre_comopras2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-compra-24.png"))); // NOI18N
        label_nombre_comopras2.setText("Actualizar Precio Material");
        label_nombre_comopras2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_nombre_comopras2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        panel_actualizar_material.setBackground(new java.awt.Color(82, 170, 99));
        panel_actualizar_material.setPreferredSize(new java.awt.Dimension(99, 39));
        panel_actualizar_material.setRoundBottomLeft(20);
        panel_actualizar_material.setRoundBottomRight(20);
        panel_actualizar_material.setRoundTopLeft(20);
        panel_actualizar_material.setRoundTopRight(20);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ACTUALIZAR");

        javax.swing.GroupLayout panel_actualizar_materialLayout = new javax.swing.GroupLayout(panel_actualizar_material);
        panel_actualizar_material.setLayout(panel_actualizar_materialLayout);
        panel_actualizar_materialLayout.setHorizontalGroup(
            panel_actualizar_materialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
        );
        panel_actualizar_materialLayout.setVerticalGroup(
            panel_actualizar_materialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        panel_actualizar_paca.setBackground(new java.awt.Color(82, 170, 99));
        panel_actualizar_paca.setPreferredSize(new java.awt.Dimension(99, 39));
        panel_actualizar_paca.setRoundBottomLeft(20);
        panel_actualizar_paca.setRoundBottomRight(20);
        panel_actualizar_paca.setRoundTopLeft(20);
        panel_actualizar_paca.setRoundTopRight(20);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ACTUALIZAR");

        javax.swing.GroupLayout panel_actualizar_pacaLayout = new javax.swing.GroupLayout(panel_actualizar_paca);
        panel_actualizar_paca.setLayout(panel_actualizar_pacaLayout);
        panel_actualizar_pacaLayout.setHorizontalGroup(
            panel_actualizar_pacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
        );
        panel_actualizar_pacaLayout.setVerticalGroup(
            panel_actualizar_pacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_actualizar_preciosLayout = new javax.swing.GroupLayout(panel_actualizar_precios);
        panel_actualizar_precios.setLayout(panel_actualizar_preciosLayout);
        panel_actualizar_preciosLayout.setHorizontalGroup(
            panel_actualizar_preciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_actualizar_preciosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panel_actualizar_preciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_nombre_comopras2)
                    .addComponent(panel_actualizar_material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(panel_actualizar_preciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_nombre_comopras1)
                    .addComponent(panel_actualizar_paca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        panel_actualizar_preciosLayout.setVerticalGroup(
            panel_actualizar_preciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_actualizar_preciosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panel_actualizar_preciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_nombre_comopras2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_nombre_comopras1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(panel_actualizar_preciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_actualizar_material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_actualizar_paca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99))
        );

        panel_principal.add(panel_actualizar_precios, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, 330, 190));

        panel_pagos_pendientes.setBackground(new java.awt.Color(161, 203, 150));
        panel_pagos_pendientes.setRoundBottomLeft(20);
        panel_pagos_pendientes.setRoundBottomRight(20);
        panel_pagos_pendientes.setRoundTopLeft(20);
        panel_pagos_pendientes.setRoundTopRight(20);

        label_pagos_pendientes.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        label_pagos_pendientes.setForeground(new java.awt.Color(50, 50, 50));
        label_pagos_pendientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-tarjeta-en-uso-24.png"))); // NOI18N
        label_pagos_pendientes.setText("Pagos Pendientes (Granel)");
        label_pagos_pendientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_pagos_pendientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btn_pagos_pendientes.setBackground(new java.awt.Color(82, 170, 99));
        btn_pagos_pendientes.setPreferredSize(new java.awt.Dimension(99, 39));
        btn_pagos_pendientes.setRoundBottomLeft(20);
        btn_pagos_pendientes.setRoundBottomRight(20);
        btn_pagos_pendientes.setRoundTopLeft(20);
        btn_pagos_pendientes.setRoundTopRight(20);

        label_pendiente.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        label_pendiente.setForeground(new java.awt.Color(255, 255, 255));
        label_pendiente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_pendiente.setText("PENDIENTE");
        label_pendiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_pendiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_pendienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_pendienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_pendienteMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_pagos_pendientesLayout = new javax.swing.GroupLayout(btn_pagos_pendientes);
        btn_pagos_pendientes.setLayout(btn_pagos_pendientesLayout);
        btn_pagos_pendientesLayout.setHorizontalGroup(
            btn_pagos_pendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_pendiente, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
        );
        btn_pagos_pendientesLayout.setVerticalGroup(
            btn_pagos_pendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_pendiente, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_pagos_pendientesLayout = new javax.swing.GroupLayout(panel_pagos_pendientes);
        panel_pagos_pendientes.setLayout(panel_pagos_pendientesLayout);
        panel_pagos_pendientesLayout.setHorizontalGroup(
            panel_pagos_pendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_pagos_pendientesLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(btn_pagos_pendientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(panel_pagos_pendientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_pagos_pendientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_pagos_pendientesLayout.setVerticalGroup(
            panel_pagos_pendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_pagos_pendientesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(label_pagos_pendientes, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_pagos_pendientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        panel_principal.add(panel_pagos_pendientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 160, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setBounds(0, 0, 950, 700);
    }// </editor-fold>//GEN-END:initComponents

    private void materialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_materialMouseEntered
        // TODO add your handling code here:
                // colores al mouse este es al poner el mouse encima
        panel_material.setBackground(new Color(0x3a7846));
        material.setForeground(new Color(0xcccccc));
    }//GEN-LAST:event_materialMouseEntered

    private void materialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_materialMouseExited
        // TODO add your handling code here:
                // para el texxto este para al momento de sacr el mouse 
        panel_material.setBackground(new Color(0x499758));  //color principal
        material.setForeground(new Color(0x323232));       
    }//GEN-LAST:event_materialMouseExited

    private void pacasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pacasMouseExited
        // TODO add your handling code here:ç CC0000
            // al sacar el mouse
        panel_pacas.setBackground(new Color(0x499758));
        pacas.setForeground(new Color(0x323232));        
    }//GEN-LAST:event_pacasMouseExited

    private void pacasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pacasMouseEntered
        // TODO add your handling code here: FF0000
        panel_pacas.setBackground(new Color(0x3a7846));
        pacas.setForeground(new Color(0xcccccc)); 

    }//GEN-LAST:event_pacasMouseEntered

    private void atrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseExited
        // TODO add your handling code here:
        panel_atras.setBackground(new Color(0x52aa63));
        atras.setForeground(Color.BLACK);       
        
    }//GEN-LAST:event_atrasMouseExited

    private void atrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseEntered
        // TODO add your handling code here: 999999
        panel_atras.setBackground(new Color(0x5CBD6E));
        atras.setForeground(Color.WHITE);
    }//GEN-LAST:event_atrasMouseEntered

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

    private void materialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_materialMouseClicked

        Realizar_compra compra = new Realizar_compra();
        compra.setVisible(true);
        compra.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_materialMouseClicked

    private void btn_comprasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_comprasMouseEntered
        // TODO add your handling code here:
        // colores al mouse este es al poner el mouse encima
        panel_compras_realizadas.setBackground(new Color(0x499758));
        btn_compras.setForeground(new Color(0xcccccc));        
    }//GEN-LAST:event_btn_comprasMouseEntered

    private void btn_comprasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_comprasMouseExited
        // TODO add your handling code here:
        // para el texxto este para al momento de sacr el mouse 
        panel_compras_realizadas.setBackground(new Color(0x52aa63));  //color principal
        btn_compras.setForeground(Color.WHITE);    
    }//GEN-LAST:event_btn_comprasMouseExited

    private void btn_stockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_stockMouseEntered
        // TODO add your handling code here:
        panel_compras_stock.setBackground(new Color(0x499758));
        btn_stock.setForeground(new Color(0xcccccc)); 
    }//GEN-LAST:event_btn_stockMouseEntered

    private void btn_stockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_stockMouseExited
        // TODO add your handling code here:
        //aca
        panel_compras_stock.setBackground(new Color(0x52aa63));
        btn_stock.setForeground(Color.WHITE); 
    }//GEN-LAST:event_btn_stockMouseExited

    private void btn_stockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_stockMouseClicked
        // TODO add your handling code here:
        Inventario_Material inventario = new Inventario_Material();
        inventario.setVentanaOrigen("compra");
        inventario.setVisible(true);
        inventario.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btn_stockMouseClicked

    private void nombre_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_ActionPerformed

    private void btn_comprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_comprasMouseClicked
        // TODO add your handling code here:      
        Compra_realizadas comprasRealizadas = new Compra_realizadas();
        comprasRealizadas.setVisible(true);
        comprasRealizadas.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btn_comprasMouseClicked

    private void label_pendienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_pendienteMouseEntered
        // TODO add your handling code here:
        // colores al mouse este es al poner el mouse encima
        btn_pagos_pendientes.setBackground(new Color(0x499758));
        label_pendiente.setForeground(new Color(0xcccccc));    
    }//GEN-LAST:event_label_pendienteMouseEntered

    private void label_pendienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_pendienteMouseExited
        // TODO add your handling code here:
        btn_pagos_pendientes.setBackground(new Color(0x52aa63));
        label_pendiente.setForeground(Color.WHITE); 
    }//GEN-LAST:event_label_pendienteMouseExited

    private void label_pendienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_pendienteMouseClicked
        // TODO add your handling code here:
        Vista_Pagos_Pendientes_Compra_Granel VistaPendiente = new Vista_Pagos_Pendientes_Compra_Granel();
        VistaPendiente.setVisible(true);
        VistaPendiente.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_label_pendienteMouseClicked

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
            java.util.logging.Logger.getLogger(Menu_Vista_Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Vista_Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Vista_Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Vista_Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               
                usuario usuarioActual =new usuario();
                
                Menu_Vista_Compra  menu_compra = new Menu_Vista_Compra();
                menu_compra.setVisible(true);
                menu_compra.setLocationRelativeTo(null);
                AppContext.setUsuarioActual(usuarioActual);
               
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atras;
    private javax.swing.JPanel barra;
    private javax.swing.JLabel btn_compras;
    private swing.PanelRound btn_pagos_pendientes;
    private javax.swing.JLabel btn_stock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel label_nombre_comopras;
    private javax.swing.JLabel label_nombre_comopras1;
    private javax.swing.JLabel label_nombre_comopras2;
    private javax.swing.JLabel label_pagos_pendientes;
    private javax.swing.JLabel label_pendiente;
    private javax.swing.JLabel material;
    private javax.swing.JTextField nombre_;
    private javax.swing.JLabel pacas;
    private swing.PanelRound panelRound1;
    private swing.PanelRound panelRound2;
    private swing.PanelRound panel_actualizar_material;
    private swing.PanelRound panel_actualizar_paca;
    private swing.PanelRound panel_actualizar_precios;
    private swing.PanelRound panel_atras;
    private swing.PanelRound panel_compras_realizadas;
    private swing.PanelRound panel_compras_stock;
    private swing.PanelRound panel_logo;
    private swing.PanelRound panel_material;
    private swing.PanelRound panel_menu_graficas;
    private swing.PanelRound panel_pacas;
    private swing.PanelRound panel_pagos_pendientes;
    private javax.swing.JPanel panel_principal;
    private swing.PanelRound panel_principal_verde;
    private javax.swing.JLabel usuario;
    private javax.swing.JTextField usuario_;
    private javax.swing.JTextField usuario_apellido;
    // End of variables declaration//GEN-END:variables
}
