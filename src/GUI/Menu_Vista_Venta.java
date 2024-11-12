package GUI;
import Util.AppContext;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import modelo.usuario;
public class Menu_Vista_Venta extends javax.swing.JFrame {
    public Menu_Vista_Venta() {
        initComponents();
        this.setTitle("MENU VENTA");
        Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/compra1.png"));
        this.setIconImage(icono);
        this.setLocationRelativeTo(null); 
        //metodo para usaurios actual
        usuario_Actual();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        barra = new javax.swing.JPanel();
        panel_atras = new swing.PanelRound();
        atras = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panelRound1 = new swing.PanelRound();
        panel_material = new swing.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        panel_pacas = new swing.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usuario_act = new javax.swing.JLabel();
        panelRound2 = new swing.PanelRound();
        usuario = new javax.swing.JLabel();
        usuario_ = new javax.swing.JTextField();
        usuario_apellido = new javax.swing.JTextField();
        nombre_ = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        panel_menu_compras = new swing.PanelRound();
        label_nombre_comopras = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panel_compras_stock = new swing.PanelRound();
        btn_stock = new javax.swing.JLabel();
        panel_ventas_realizadas = new swing.PanelRound();
        btn_ventas = new javax.swing.JLabel();
        label_inventario_paca = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panel_pagos_pendientes_pacas = new swing.PanelRound();
        label_pagos_pendientes = new javax.swing.JLabel();
        panel_pagos_pendientes_granel = new swing.PanelRound();
        label_pagos_pendientes1 = new javax.swing.JLabel();
        panel_pendientes = new swing.PanelRound();
        btn_pendiente = new javax.swing.JLabel();
        panel_de_cambio_precios = new swing.PanelRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_atras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 40));

        panelRound1.setBackground(new java.awt.Color(82, 170, 99));
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);

        panel_material.setBackground(new java.awt.Color(73, 151, 88));
        panel_material.setRoundBottomLeft(20);
        panel_material.setRoundBottomRight(20);
        panel_material.setRoundTopLeft(20);
        panel_material.setRoundTopRight(20);

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/recycle.png"))); // NOI18N
        jLabel1.setText("Material(Granel)");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_materialLayout = new javax.swing.GroupLayout(panel_material);
        panel_material.setLayout(panel_materialLayout);
        panel_materialLayout.setHorizontalGroup(
            panel_materialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        panel_materialLayout.setVerticalGroup(
            panel_materialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        panel_pacas.setBackground(new java.awt.Color(73, 151, 88));
        panel_pacas.setRoundBottomLeft(20);
        panel_pacas.setRoundBottomRight(20);
        panel_pacas.setRoundTopLeft(20);
        panel_pacas.setRoundTopRight(20);

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-caja-20.png"))); // NOI18N
        jLabel2.setText("Pacas");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_pacasLayout = new javax.swing.GroupLayout(panel_pacas);
        panel_pacas.setLayout(panel_pacasLayout);
        panel_pacasLayout.setHorizontalGroup(
            panel_pacasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        panel_pacasLayout.setVerticalGroup(
            panel_pacasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(panel_material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRound1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel_pacas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(panel_material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(451, Short.MAX_VALUE))
            .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRound1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel_pacas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 400, 660));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto-de-venta.png"))); // NOI18N
        jLabel3.setText("Ola! Realize la Venta ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 250, 50));

        usuario_act.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jPanel1.add(usuario_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, 150, 50));

        panelRound2.setBackground(new java.awt.Color(106, 154, 176));
        panelRound2.setRoundBottomLeft(20);
        panelRound2.setRoundBottomRight(20);
        panelRound2.setRoundTopLeft(20);
        panelRound2.setRoundTopRight(20);

        usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-usuario-20.png"))); // NOI18N
        usuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        usuario_.setEditable(false);
        usuario_.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        usuario_.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usuario_.setBorder(null);

        usuario_apellido.setEditable(false);
        usuario_apellido.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        usuario_apellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usuario_apellido.setBorder(null);

        nombre_.setEditable(false);
        nombre_.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
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

        jPanel1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 160, 140));

        panel_menu_compras.setBackground(new java.awt.Color(170, 205, 177));
        panel_menu_compras.setRoundBottomLeft(20);
        panel_menu_compras.setRoundBottomRight(20);
        panel_menu_compras.setRoundTopLeft(20);
        panel_menu_compras.setRoundTopRight(20);

        label_nombre_comopras.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        label_nombre_comopras.setForeground(new java.awt.Color(50, 50, 50));
        label_nombre_comopras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-compra-24.png"))); // NOI18N
        label_nombre_comopras.setText("Ventas Realizadas(GRANEL)");
        label_nombre_comopras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_nombre_comopras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(50, 50, 50));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-stock-24.png"))); // NOI18N
        jLabel4.setText("Inventario Material(Granel)");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

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

        panel_ventas_realizadas.setBackground(new java.awt.Color(82, 170, 99));
        panel_ventas_realizadas.setRoundBottomLeft(20);
        panel_ventas_realizadas.setRoundBottomRight(20);
        panel_ventas_realizadas.setRoundTopLeft(20);
        panel_ventas_realizadas.setRoundTopRight(20);

        btn_ventas.setForeground(new java.awt.Color(255, 255, 255));
        btn_ventas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_ventas.setText("VENTAS");
        btn_ventas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ventas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ventasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ventasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ventasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_ventas_realizadasLayout = new javax.swing.GroupLayout(panel_ventas_realizadas);
        panel_ventas_realizadas.setLayout(panel_ventas_realizadasLayout);
        panel_ventas_realizadasLayout.setHorizontalGroup(
            panel_ventas_realizadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_ventas, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panel_ventas_realizadasLayout.setVerticalGroup(
            panel_ventas_realizadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_ventas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        label_inventario_paca.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        label_inventario_paca.setForeground(new java.awt.Color(50, 50, 50));
        label_inventario_paca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inventario.png"))); // NOI18N
        label_inventario_paca.setText("Inventario Paca");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(50, 50, 50));
        jLabel5.setText("Ventas Realizadas(PACA)");

        javax.swing.GroupLayout panel_menu_comprasLayout = new javax.swing.GroupLayout(panel_menu_compras);
        panel_menu_compras.setLayout(panel_menu_comprasLayout);
        panel_menu_comprasLayout.setHorizontalGroup(
            panel_menu_comprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menu_comprasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panel_menu_comprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_menu_comprasLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(panel_ventas_realizadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label_nombre_comopras, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(panel_menu_comprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_menu_comprasLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(panel_menu_comprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(panel_menu_comprasLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(panel_compras_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_menu_comprasLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(label_inventario_paca, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        panel_menu_comprasLayout.setVerticalGroup(
            panel_menu_comprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_menu_comprasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panel_menu_comprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_nombre_comopras, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(panel_menu_comprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_compras_stock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_ventas_realizadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(panel_menu_comprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_inventario_paca, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(131, 131, 131))
        );

        jPanel1.add(panel_menu_compras, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 330, 320));

        panel_pagos_pendientes_pacas.setBackground(new java.awt.Color(161, 203, 150));
        panel_pagos_pendientes_pacas.setRoundBottomLeft(20);
        panel_pagos_pendientes_pacas.setRoundBottomRight(20);
        panel_pagos_pendientes_pacas.setRoundTopLeft(20);
        panel_pagos_pendientes_pacas.setRoundTopRight(20);

        label_pagos_pendientes.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        label_pagos_pendientes.setForeground(new java.awt.Color(50, 50, 50));
        label_pagos_pendientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-tarjeta-en-uso-24.png"))); // NOI18N
        label_pagos_pendientes.setText("Pagos Pendientes (PACA)");
        label_pagos_pendientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_pagos_pendientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout panel_pagos_pendientes_pacasLayout = new javax.swing.GroupLayout(panel_pagos_pendientes_pacas);
        panel_pagos_pendientes_pacas.setLayout(panel_pagos_pendientes_pacasLayout);
        panel_pagos_pendientes_pacasLayout.setHorizontalGroup(
            panel_pagos_pendientes_pacasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_pagos_pendientes_pacasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_pagos_pendientes, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_pagos_pendientes_pacasLayout.setVerticalGroup(
            panel_pagos_pendientes_pacasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_pagos_pendientes_pacasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(label_pagos_pendientes, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addGap(86, 86, 86))
        );

        jPanel1.add(panel_pagos_pendientes_pacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, 160, 200));

        panel_pagos_pendientes_granel.setBackground(new java.awt.Color(161, 203, 150));
        panel_pagos_pendientes_granel.setRoundBottomLeft(20);
        panel_pagos_pendientes_granel.setRoundBottomRight(20);
        panel_pagos_pendientes_granel.setRoundTopLeft(20);
        panel_pagos_pendientes_granel.setRoundTopRight(20);

        label_pagos_pendientes1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        label_pagos_pendientes1.setForeground(new java.awt.Color(50, 50, 50));
        label_pagos_pendientes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-tarjeta-en-uso-24.png"))); // NOI18N
        label_pagos_pendientes1.setText("Pagos Pendientes (Granel)");
        label_pagos_pendientes1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_pagos_pendientes1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        panel_pendientes.setBackground(new java.awt.Color(82, 170, 99));
        panel_pendientes.setRoundBottomLeft(20);
        panel_pendientes.setRoundBottomRight(20);
        panel_pendientes.setRoundTopLeft(20);
        panel_pendientes.setRoundTopRight(20);

        btn_pendiente.setForeground(new java.awt.Color(255, 255, 255));
        btn_pendiente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_pendiente.setText("PENDIENTE");
        btn_pendiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_pendiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pendienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_pendienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_pendienteMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_pendientesLayout = new javax.swing.GroupLayout(panel_pendientes);
        panel_pendientes.setLayout(panel_pendientesLayout);
        panel_pendientesLayout.setHorizontalGroup(
            panel_pendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_pendiente, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panel_pendientesLayout.setVerticalGroup(
            panel_pendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_pendiente, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_pagos_pendientes_granelLayout = new javax.swing.GroupLayout(panel_pagos_pendientes_granel);
        panel_pagos_pendientes_granel.setLayout(panel_pagos_pendientes_granelLayout);
        panel_pagos_pendientes_granelLayout.setHorizontalGroup(
            panel_pagos_pendientes_granelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_pagos_pendientes_granelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_pagos_pendientes1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panel_pagos_pendientes_granelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(panel_pendientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_pagos_pendientes_granelLayout.setVerticalGroup(
            panel_pagos_pendientes_granelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_pagos_pendientes_granelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(label_pagos_pendientes1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(panel_pendientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        jPanel1.add(panel_pagos_pendientes_granel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 160, 160));

        panel_de_cambio_precios.setBackground(new java.awt.Color(65, 179, 162));
        panel_de_cambio_precios.setRoundBottomLeft(20);
        panel_de_cambio_precios.setRoundBottomRight(20);
        panel_de_cambio_precios.setRoundTopLeft(20);
        panel_de_cambio_precios.setRoundTopRight(20);

        javax.swing.GroupLayout panel_de_cambio_preciosLayout = new javax.swing.GroupLayout(panel_de_cambio_precios);
        panel_de_cambio_precios.setLayout(panel_de_cambio_preciosLayout);
        panel_de_cambio_preciosLayout.setHorizontalGroup(
            panel_de_cambio_preciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );
        panel_de_cambio_preciosLayout.setVerticalGroup(
            panel_de_cambio_preciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jPanel1.add(panel_de_cambio_precios, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, 330, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
        panel_atras.setBackground(new Color(0x5CBD6E));
        atras.setForeground(Color.WHITE);
    }//GEN-LAST:event_atrasMouseEntered

    private void atrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseExited
        // TODO add your handling code here:
        panel_atras.setBackground(new Color(0x52aa63));
        atras.setForeground(Color.BLACK);

    }//GEN-LAST:event_atrasMouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        Vista_Venta vistaVenta = new Vista_Venta();
        vistaVenta.setVisible(true);
        vistaVenta.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        panel_material.setBackground(new Color(0x3a7846));
        jLabel1.setForeground(new Color(0xcccccc));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
        panel_material.setBackground(new Color(0x499758));
        jLabel1.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel1MouseExited

    private void nombre_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_ActionPerformed

    private void btn_stockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_stockMouseClicked
        // TODO add your handling code here:
        Inventario_Material inventario = new Inventario_Material();
        inventario.setVentanaOrigen("venta");
        inventario.setVisible(true);
        inventario.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btn_stockMouseClicked

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

    private void btn_ventasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ventasMouseEntered
        // TODO add your handling code here:
        btn_ventas.setForeground(new Color(0xcccccc));
        panel_ventas_realizadas.setBackground(new Color(0x499758));
        
    }//GEN-LAST:event_btn_ventasMouseEntered

    private void btn_ventasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ventasMouseExited
        // TODO add your handling code here:
        btn_ventas.setForeground(Color.white);
        panel_ventas_realizadas.setBackground(new Color(0x52aa63));
        
        
    }//GEN-LAST:event_btn_ventasMouseExited

    private void btn_pendienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pendienteMouseEntered
        // TODO add your handling code here:
        btn_pendiente.setForeground(new Color(0xcccccc));
        panel_pendientes.setBackground(new Color(0x499758));
    }//GEN-LAST:event_btn_pendienteMouseEntered

    private void btn_pendienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pendienteMouseExited
        // TODO add your handling code here:
        
        panel_pendientes.setBackground(new Color(0x52aa63));
        btn_pendiente.setForeground(Color.WHITE);
    }//GEN-LAST:event_btn_pendienteMouseExited

    private void btn_ventasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ventasMouseClicked
        // TODO add your handling code here:
        Venta_realizadas ventas = new Venta_realizadas();
        ventas.setVisible(true);
        ventas.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btn_ventasMouseClicked

    private void btn_pendienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pendienteMouseClicked
        // TODO add your handling code here:
        Vista_Pagos_Pendientes_Venta_Granel pagosP = new Vista_Pagos_Pendientes_Venta_Granel();
        pagosP.setVisible(true);
        pagosP.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btn_pendienteMouseClicked

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
            java.util.logging.Logger.getLogger(Menu_Vista_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Vista_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Vista_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Vista_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Vista_Venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atras;
    private javax.swing.JPanel barra;
    private javax.swing.JLabel btn_pendiente;
    private javax.swing.JLabel btn_stock;
    private javax.swing.JLabel btn_ventas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel label_inventario_paca;
    private javax.swing.JLabel label_nombre_comopras;
    private javax.swing.JLabel label_pagos_pendientes;
    private javax.swing.JLabel label_pagos_pendientes1;
    private javax.swing.JTextField nombre_;
    private swing.PanelRound panelRound1;
    private swing.PanelRound panelRound2;
    private swing.PanelRound panel_atras;
    private swing.PanelRound panel_compras_stock;
    private swing.PanelRound panel_de_cambio_precios;
    private swing.PanelRound panel_material;
    private swing.PanelRound panel_menu_compras;
    private swing.PanelRound panel_pacas;
    private swing.PanelRound panel_pagos_pendientes_granel;
    private swing.PanelRound panel_pagos_pendientes_pacas;
    private swing.PanelRound panel_pendientes;
    private swing.PanelRound panel_ventas_realizadas;
    private javax.swing.JLabel usuario;
    private javax.swing.JTextField usuario_;
    private javax.swing.JLabel usuario_act;
    private javax.swing.JTextField usuario_apellido;
    // End of variables declaration//GEN-END:variables
    public void usuario_Actual(){
        // Recuperar usuario actual        
        usuario usuarioActual = AppContext.getUsuarioActual();
        usuario_act.setText(usuarioActual.getNombre());
        //esto es para quitar el contorno de los jtefield
        usuario_.setBackground(new java.awt.Color(0,0,0,1));
        usuario_apellido.setBackground(new java.awt.Color(0,0,0,1));
        nombre_.setBackground(new java.awt.Color(0,0,0,1));
        nombre_.setForeground(new Color(0x323232));
        usuario_.setForeground(new Color(0x323232));
        usuario_apellido.setForeground(new Color(0x323232));
        //asiganado el nombre segun el usuarioACtual 
        usuario_.setText(usuarioActual.getTipo_usuario());
        nombre_.setText(usuarioActual.getNombre());
        usuario_apellido.setText(usuarioActual.getApellidoP());
        
    }
}
