package GUI;
import controlador.ctrl_material;
import java.awt.Color;
import javax.swing.JOptionPane;
import modelo.Categoria;
import modelo.Material;
import modelo.usuario;
public class Administrar_Material extends javax.swing.JFrame {
    ctrl_material Ctrl_mat = new ctrl_material();
    Material mat = new Material();

    public Administrar_Material() {
        initComponents();
        this.setLocationRelativeTo(null);
        Ctrl_mat.ConsultarCategoria(combox_categoria); 
        EliminarBorde();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panel_atras = new swing.PanelRound();
        atras = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panelRound1 = new swing.PanelRound();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nombre_material = new javax.swing.JTextField();
        precio_compra = new javax.swing.JTextField();
        precio_venta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        stock = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        combox_categoria = new javax.swing.JComboBox<>();
        panel_boton1 = new swing.PanelRound();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        precio_compra2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        precio_compra3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        precio_venta2 = new javax.swing.JTextField();
        precio_venta3 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        precio_compra4 = new javax.swing.JTextField();
        precio_compra5 = new javax.swing.JTextField();
        precio_compra6 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(850, 500));
        setMinimumSize(new java.awt.Dimension(850, 500));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(92, 189, 110));
        jPanel1.setMaximumSize(new java.awt.Dimension(850, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(850, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(92, 189, 110));
        jPanel2.setMaximumSize(new java.awt.Dimension(850, 40));
        jPanel2.setMinimumSize(new java.awt.Dimension(850, 40));

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

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Registro Material");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(panel_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(291, 291, 291)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 373, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_atras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 40));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro Material", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(102, 102, 102))))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(700, 358));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nombre del Material");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Precio Compra I");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Precio de venta I");

        nombre_material.setForeground(new java.awt.Color(0, 0, 0));
        nombre_material.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombre_material.setBorder(null);
        nombre_material.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_materialActionPerformed(evt);
            }
        });

        precio_compra.setForeground(new java.awt.Color(0, 0, 0));
        precio_compra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        precio_compra.setBorder(null);
        precio_compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio_compraActionPerformed(evt);
            }
        });

        precio_venta.setForeground(new java.awt.Color(0, 0, 0));
        precio_venta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        precio_venta.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Stock disponible");

        stock.setForeground(new java.awt.Color(0, 0, 0));
        stock.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        stock.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Categoría");

        combox_categoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combox_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combox_categoriaActionPerformed(evt);
            }
        });

        panel_boton1.setBackground(new java.awt.Color(92, 189, 110));
        panel_boton1.setMinimumSize(new java.awt.Dimension(100, 39));
        panel_boton1.setPreferredSize(new java.awt.Dimension(24, 24));
        panel_boton1.setRoundBottomLeft(20);
        panel_boton1.setRoundBottomRight(20);
        panel_boton1.setRoundTopLeft(20);
        panel_boton1.setRoundTopRight(20);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png"))); // NOI18N
        jLabel6.setToolTipText("");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });

        javax.swing.GroupLayout panel_boton1Layout = new javax.swing.GroupLayout(panel_boton1);
        panel_boton1.setLayout(panel_boton1Layout);
        panel_boton1Layout.setHorizontalGroup(
            panel_boton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panel_boton1Layout.setVerticalGroup(
            panel_boton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Precio Compra II");

        precio_compra2.setForeground(new java.awt.Color(0, 0, 0));
        precio_compra2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        precio_compra2.setBorder(null);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Precio Compra III");

        precio_compra3.setForeground(new java.awt.Color(0, 0, 0));
        precio_compra3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        precio_compra3.setBorder(null);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Precio de Venta II");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Precio de Venta III");

        precio_venta2.setForeground(new java.awt.Color(0, 0, 0));
        precio_venta2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        precio_venta2.setBorder(null);

        precio_venta3.setForeground(new java.awt.Color(0, 0, 0));
        precio_venta3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        precio_venta3.setBorder(null);

        precio_compra4.setForeground(new java.awt.Color(0, 0, 0));
        precio_compra4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        precio_compra4.setBorder(null);
        precio_compra4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio_compra4ActionPerformed(evt);
            }
        });

        precio_compra5.setForeground(new java.awt.Color(0, 0, 0));
        precio_compra5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        precio_compra5.setBorder(null);

        precio_compra6.setForeground(new java.awt.Color(0, 0, 0));
        precio_compra6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        precio_compra6.setBorder(null);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Precio de Compra IV");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Precio Compra V");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Precio Compra VI");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator12)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre_material, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stock, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(precio_compra4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(28, 28, 28)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator10)
                                    .addComponent(jSeparator6)
                                    .addComponent(precio_venta)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(precio_compra, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(precio_compra5, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSeparator13))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(precio_venta2)
                                    .addComponent(jSeparator7)
                                    .addComponent(precio_compra6, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(precio_compra2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSeparator11)
                                    .addComponent(jSeparator14))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combox_categoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jSeparator15, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(precio_compra3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addGap(12, 12, 12)
                                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jSeparator8)
                                                        .addComponent(precio_venta3, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)))))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(60, 60, 60))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(panel_boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_material, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precio_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precio_compra2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precio_compra3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel2))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precio_compra4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precio_compra5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precio_compra6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combox_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel10))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(precio_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(precio_venta2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(precio_venta3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                    .addComponent(jSeparator5)
                    .addComponent(jSeparator6)
                    .addComponent(jSeparator7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(panel_boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 810, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombre_materialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_materialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_materialActionPerformed

    private void combox_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combox_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combox_categoriaActionPerformed

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

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        //instancias
        ctrl_material controlador_material = new ctrl_material ();
        
        // Verifica si algún campo está vacío
        if (stock.getText().isEmpty() || nombre_material.getText().isEmpty()
            || precio_compra.getText().isEmpty() || precio_venta.getText().isEmpty() 
            || precio_compra2.getText().isEmpty() || precio_compra3.getText().isEmpty()
            ||combox_categoria.getSelectedItem() == null
            || precio_venta2.getText().isEmpty() || precio_venta3.getText().isEmpty()
            || precio_compra4.getText().isEmpty() || precio_compra5.getText().isEmpty()
            || precio_compra6.getText().isEmpty()){

            // Muestra un mensaje general indicando que falta información
            JOptionPane.showMessageDialog(null, "Por favor, completa todos los campos.");
        //condicion para que los campos sean numeros    

        } else {
        if (!nombre_material.getText().matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")){
                
            JOptionPane.showMessageDialog(null, "El nombre de la materia solo debe contener caracteres ");
            return;
        }
        if (!precio_compra.getText().matches("\\d+(\\.\\d+)?") || 
            !precio_compra2.getText().matches("\\d+(\\.\\d+)?") || 
            !precio_compra3.getText().matches("\\d+(\\.\\d+)?") || 
            !precio_venta.getText().matches("\\d+(\\.\\d+)?") || 
            !stock.getText().matches("\\d+") ||
            !precio_venta2.getText().matches("\\d+(\\.\\d+)?") ||
            !precio_venta3.getText().matches("\\d+(\\.\\d+)?") ||
            !precio_compra4.getText().matches("\\d+(\\.\\d+)?") ||
            !precio_compra5.getText().matches("\\d+(\\.\\d+)?") ||
            !precio_compra6.getText().matches("\\d+(\\.\\d+)?")){
            JOptionPane.showMessageDialog(null, "Deben Contener Numeros");
            return;
        
        }
            //revisa lo del numero y caracteres que te diga que es campo debe ser caractr y igual con numeros
            
            // Si todos los campos están llenos, procedemos con el registro del material
            if (!controlador_material.existeMaterial(nombre_material.getText().trim())) {  //trim para eliminar espacios               
                // Configuración de los datos del material
                mat.setNombre_material(capitalize(nombre_material.getText()));
                mat.setCantidad_kg(Integer.parseInt(stock.getText()));
                mat.setPrecio_compra(Double.parseDouble(precio_compra.getText()));
                mat.setPrecio_compra2(Double.parseDouble(precio_compra2.getText()));
                mat.setPrecio_compra3(Double.parseDouble(precio_compra3.getText()));
                mat.setPrecio_venta(Double.parseDouble(precio_venta.getText()));
                mat.setPrecio_venta2(Double.parseDouble(precio_venta2.getText()));
                mat.setPrecio_venta3(Double.parseDouble(precio_venta3.getText()));
                mat.setPrecio_compra4(Double.parseDouble(precio_compra4.getText()));
                mat.setPrecio_compra5(Double.parseDouble(precio_compra5.getText()));
                mat.setPrecio_compra6(Double.parseDouble(precio_compra6.getText()));

                // Obtener la categoría seleccionada del comboBox
                Categoria categoriaSeleccionada = (Categoria) combox_categoria.getSelectedItem();
                mat.setId_categoria(categoriaSeleccionada.getId_categoria()); 

                // Registrar el material
                Ctrl_mat.RegistrarMateria(mat);

                // Mostrar mensaje de éxito
                JOptionPane.showMessageDialog(null, "Material registrado correctamente");

            } else {
                // Si el material ya existe
                JOptionPane.showMessageDialog(null, "El material ya existe");
            }
        }
    limpiar();
    }//GEN-LAST:event_jLabel6MousePressed

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered

        panel_boton1.setBackground(new Color(0x499758));
          
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        // TODO add your handling code here:
        panel_boton1.setBackground(new Color(0x5CBD6E));
              
    }//GEN-LAST:event_jLabel6MouseExited

    private void precio_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio_compraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precio_compraActionPerformed

    private void precio_compra4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio_compra4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precio_compra4ActionPerformed
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
            java.util.logging.Logger.getLogger(Administrar_Material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrar_Material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrar_Material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrar_Material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Administrar_Material().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atras;
    private javax.swing.JComboBox<String> combox_categoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField nombre_material;
    private swing.PanelRound panelRound1;
    private swing.PanelRound panel_atras;
    private swing.PanelRound panel_boton1;
    private javax.swing.JTextField precio_compra;
    private javax.swing.JTextField precio_compra2;
    private javax.swing.JTextField precio_compra3;
    private javax.swing.JTextField precio_compra4;
    private javax.swing.JTextField precio_compra5;
    private javax.swing.JTextField precio_compra6;
    private javax.swing.JTextField precio_venta;
    private javax.swing.JTextField precio_venta2;
    private javax.swing.JTextField precio_venta3;
    private javax.swing.JTextField stock;
    // End of variables declaration//GEN-END:variables
    private String capitalize(String str) {
    if (str == null || str.isEmpty()) {
        
        return str; // Retorna la cadena original si está vacía o es null
    }
    //UpperCase Mayuscula vs lowerCase minuscula
    return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
    private void limpiar(){
        //LIMPIAR
        nombre_material.setText("");
        precio_compra.setText("");
        precio_venta.setText("");
        stock.setText("");
        //selecionar el primer elemento
        combox_categoria.setSelectedIndex(-1);
        precio_compra2.setText("");
        precio_compra3.setText("");
        precio_venta2.setText("");
        precio_venta3.setText("");
        precio_compra4.setText("");
        precio_compra5.setText("");
        precio_compra6.setText("");
    }
    public void EliminarBorde(){
        nombre_material.setBackground(new java.awt.Color(0,0,0,1));
        precio_compra.setBackground(new java.awt.Color(0,0,0,1));
        precio_compra2.setBackground(new java.awt.Color(0,0,0,1));
        precio_compra3.setBackground(new java.awt.Color(0,0,0,1));
        precio_compra4.setBackground(new java.awt.Color(0,0,0,1));
        precio_compra5.setBackground(new java.awt.Color(0,0,0,1));
        precio_compra6.setBackground(new java.awt.Color(0,0,0,1));
        stock.setBackground(new java.awt.Color(0,0,0,1));
        precio_venta.setBackground(new java.awt.Color(0,0,0,1));
        precio_venta2.setBackground(new java.awt.Color(0,0,0,1));
        precio_venta3.setBackground(new java.awt.Color(0,0,0,1));        
    }
}
