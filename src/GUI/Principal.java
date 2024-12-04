package GUI;
import Util.AppContext;
import com.formdev.flatlaf.FlatDarkLaf;
import controlador.ctrl_usuario;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Window;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import modelo.usuario;
public class Principal extends javax.swing.JFrame {
    usuario Usuario = new usuario();
    public Principal(usuario Usuario) {
        // Aplica el tema oscuro de FlatLaf
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
        }
        initComponents();
        //ICONO DE LA VENTANA JAVA
        this.setTitle("PRINCIPAL");
        Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/icnonos_veentanas.png"));
        this.setIconImage(icono);
        this.setLocationRelativeTo(null);  
         this.Usuario = AppContext.getUsuarioActual();
        configurarPermisos();
        // para mostrar el nombre en el menu    
        //Recuperar usuario actual   
        usuario usuarioActual = AppContext.getUsuarioActual();
        //JOptionPane.showMessageDialog(null,"Bienvenido al Sistema: "+usuarioActual.getNombre()); 
        if (usuarioActual != null) {
            //asignale el nombre
           sesion.setText(usuarioActual.getNombre());
        } else {
            JOptionPane.showMessageDialog(null, "El usuario actual es nulo");
        }
        
        jMenuBar1 = new JMenuBar();
        jMenuBar1.setBackground(new Color(0x5CBD6E)); // Cambiar el color de fondo
        menu_usuario.setBackground(new Color(0x5CBD6E)); // Color de fondo del menú
        jMenuItem2.setBackground(new Color(0x5CBD6E)); // Color de fondo del JMenuItem


        
    
    }
    public void actualizarPermisos() {
        configurarPermisos();
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelAcciones = new javax.swing.JPanel();
        panelCompra = new javax.swing.JPanel();
        labelCompra = new javax.swing.JLabel();
        panelVentas = new javax.swing.JPanel();
        labelVenta = new javax.swing.JLabel();
        panelInventarios = new javax.swing.JPanel();
        labelInventario = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_usuario = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        categoria = new javax.swing.JMenu();
        menu_agregarcategoria = new javax.swing.JMenuItem();
        provedor = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        sesion = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 700));
        setUndecorated(true);
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(92, 189, 110));
        panelPrincipal.setMaximumSize(new java.awt.Dimension(950, 700));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(950, 700));
        panelPrincipal.setName("sss"); // NOI18N
        panelPrincipal.setPreferredSize(new java.awt.Dimension(950, 700));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 2, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 290, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 2, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/avanzdas_principal.png"))); // NOI18N
        panelPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 180, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_grande.png"))); // NOI18N
        panelPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 190, 400, 190));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 2, 30)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/franna_principal.png"))); // NOI18N
        panelPrincipal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 340, 80));

        panelAcciones.setBackground(new java.awt.Color(0, 0, 0));
        panelAcciones.setPreferredSize(new java.awt.Dimension(530, 850));

        panelCompra.setBackground(new java.awt.Color(180, 227, 128));
        panelCompra.setForeground(new java.awt.Color(46, 125, 50));
        panelCompra.setPreferredSize(new java.awt.Dimension(160, 700));
        panelCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelCompraMousePressed(evt);
            }
        });

        labelCompra.setBackground(new java.awt.Color(46, 125, 50));
        labelCompra.setForeground(new java.awt.Color(0, 0, 0));
        labelCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/compra1.png"))); // NOI18N
        labelCompra.setText("Compra");
        labelCompra.setToolTipText("");
        labelCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelCompra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelCompra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        labelCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCompraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelCompraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelCompraMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelCompraMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelCompraLayout = new javax.swing.GroupLayout(panelCompra);
        panelCompra.setLayout(panelCompraLayout);
        panelCompraLayout.setHorizontalGroup(
            panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panelCompraLayout.setVerticalGroup(
            panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelVentas.setBackground(new java.awt.Color(64, 165, 120));
        panelVentas.setPreferredSize(new java.awt.Dimension(160, 79));

        labelVenta.setBackground(new java.awt.Color(120, 144, 156));
        labelVenta.setForeground(new java.awt.Color(0, 0, 0));
        labelVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Venta.png"))); // NOI18N
        labelVenta.setText("Venta");
        labelVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelVenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelVenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        labelVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelVentaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelVentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelVentaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelVentasLayout = new javax.swing.GroupLayout(panelVentas);
        panelVentas.setLayout(panelVentasLayout);
        panelVentasLayout.setHorizontalGroup(
            panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panelVentasLayout.setVerticalGroup(
            panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelInventarios.setBackground(new java.awt.Color(0, 103, 105));
        panelInventarios.setPreferredSize(new java.awt.Dimension(160, 700));

        labelInventario.setForeground(new java.awt.Color(0, 0, 0));
        labelInventario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inventario1.png"))); // NOI18N
        labelInventario.setText("Producción Pacas");
        labelInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelInventario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelInventario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        labelInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelInventarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelInventarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelInventarioMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelInventariosLayout = new javax.swing.GroupLayout(panelInventarios);
        panelInventarios.setLayout(panelInventariosLayout);
        panelInventariosLayout.setHorizontalGroup(
            panelInventariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInventariosLayout.createSequentialGroup()
                .addComponent(labelInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 46, Short.MAX_VALUE))
        );
        panelInventariosLayout.setVerticalGroup(
            panelInventariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelInventario, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelAccionesLayout = new javax.swing.GroupLayout(panelAcciones);
        panelAcciones.setLayout(panelAccionesLayout);
        panelAccionesLayout.setHorizontalGroup(
            panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAccionesLayout.createSequentialGroup()
                .addComponent(panelCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelInventarios, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
        );
        panelAccionesLayout.setVerticalGroup(
            panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addGroup(panelAccionesLayout.createSequentialGroup()
                .addComponent(panelInventarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelPrincipal.add(panelAcciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 530, 700));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        panelPrincipal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 210, 42));

        jMenuBar1.setMaximumSize(new java.awt.Dimension(950, 39));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(950, 39));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(950, 40));

        menu_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar_usuario1.png"))); // NOI18N
        menu_usuario.setText("Usuario  ");
        menu_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_usuario.setFont(new java.awt.Font("Bell MT", 0, 15)); // NOI18N

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas.png"))); // NOI18N
        jMenuItem2.setText("Agregar Usuarios");
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menu_usuario.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consulta.png"))); // NOI18N
        jMenuItem3.setText("Mostrar usuarios");
        jMenuItem3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menu_usuario.add(jMenuItem3);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registros-24.png"))); // NOI18N
        jMenuItem9.setText("Ultimos Registros");
        jMenuItem9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        menu_usuario.add(jMenuItem9);

        jMenuBar1.add(menu_usuario);

        categoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/categorias1.png"))); // NOI18N
        categoria.setText("Categoría  ");
        categoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        categoria.setFont(new java.awt.Font("Bell MT", 0, 15)); // NOI18N

        menu_agregarcategoria.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        menu_agregarcategoria.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        menu_agregarcategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas.png"))); // NOI18N
        menu_agregarcategoria.setText("Agregar Categoría");
        menu_agregarcategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_agregarcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_agregarcategoriaActionPerformed(evt);
            }
        });
        categoria.add(menu_agregarcategoria);

        jMenuBar1.add(categoria);

        provedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/proveedor-1.png"))); // NOI18N
        provedor.setText("Proveedor  ");
        provedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        provedor.setFont(new java.awt.Font("Bell MT", 0, 15)); // NOI18N

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas.png"))); // NOI18N
        jMenuItem4.setText("Agregar provedor");
        jMenuItem4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        provedor.add(jMenuItem4);

        jMenuItem11.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consulta.png"))); // NOI18N
        jMenuItem11.setText("Mostrar Proveedor");
        jMenuItem11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        provedor.add(jMenuItem11);

        jMenuBar1.add(provedor);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/adquisitivo.png"))); // NOI18N
        jMenu1.setText("Cliente   ");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("Bell MT", 0, 15)); // NOI18N

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas.png"))); // NOI18N
        jMenuItem5.setText("Agregar Cliente");
        jMenuItem5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botella-de-reciclaje (1).png"))); // NOI18N
        jMenu2.setText("Material  ");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.setFont(new java.awt.Font("Bell MT", 0, 15)); // NOI18N

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas.png"))); // NOI18N
        jMenuItem6.setText("Agregar Material");
        jMenuItem6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem10.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consulta.png"))); // NOI18N
        jMenuItem10.setText("Mostrar Materiales");
        jMenuItem10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chofer_01.png"))); // NOI18N
        jMenu3.setText("Chofer");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.setFont(new java.awt.Font("Bell MT", 0, 15)); // NOI18N

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas.png"))); // NOI18N
        jMenuItem7.setText("Agregar Chofer");
        jMenuItem7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vehiculo01.png"))); // NOI18N
        jMenu4.setText("Vehículo");
        jMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu4.setFont(new java.awt.Font("Bell MT", 0, 15)); // NOI18N

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas.png"))); // NOI18N
        jMenuItem8.setText("Agregar Vehículo");
        jMenuItem8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuBar1.add(jMenu4);

        sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario_esquina.png"))); // NOI18N
        sesion.setText("Sesión      ");
        sesion.setToolTipText("");
        sesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sesion.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        sesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iniciar-sesion.png"))); // NOI18N
        jMenuItem1.setText("Cerrar Sesión");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        sesion.add(jMenuItem1);

        jMenuBar1.add(sesion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(950, 700));
    }// </editor-fold>//GEN-END:initComponents
     boolean loginOpen = false;
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ctrl_usuario ctrlUsuario = new ctrl_usuario();
        //Recuperar usuario actual   
        usuario usuarioActual = AppContext.getUsuarioActual();
        String Usuarioo = usuarioActual.getTelefono();
        boolean actualizado = ctrlUsuario.registrarUltimoAcceso(Usuarioo);
        if (!actualizado) {
        JOptionPane.showMessageDialog(this, "No se pudo registrar el último acceso.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        // Verificar si ya hay una instancia visible de Login
        Window[] windows = Window.getWindows(); // Obtiene todas las ventanas abiertas en la aplicación
        for (Window window : windows) {
            if (window instanceof Login && window.isVisible()) {
            loginOpen = true; // Login ya está abierto y visible
            window.toFront(); // Traer al frente si ya está abierto
            break; // Salir del bucle, no es necesario continuar
            }
        }
        //Si no hay ninguno abierto, crear una nueva instancia
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        // Cerrar la ventana actual (el panel principal)
        this.dispose();    
      
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void labelCompraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCompraMouseEntered
        // colores al mouse este es al poner el mouse encima
        panelCompra.setBackground(new Color(0xa2cc73));
        labelCompra.setForeground(Color.WHITE);
    }//GEN-LAST:event_labelCompraMouseEntered

    private void panelCompraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCompraMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_panelCompraMousePressed

    private void labelCompraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCompraMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelCompraMousePressed

    private void labelCompraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCompraMouseExited
        // para el texxto este para al momento de sacr el mouse 
        panelCompra.setBackground(new Color(0xb4e380));
        labelCompra.setForeground(Color.BLACK);
    }//GEN-LAST:event_labelCompraMouseExited

    private void labelVentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelVentaMouseEntered
        // al poner el mause encima
        panelVentas.setBackground(new Color(0x40a578));
        labelVenta.setForeground(Color.WHITE);     
    }//GEN-LAST:event_labelVentaMouseEntered

    private void labelVentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelVentaMouseExited
        // al sacar el mouse
        panelVentas.setBackground(new Color(0x39946c));
        labelVenta.setForeground(Color.BLACK);
    }//GEN-LAST:event_labelVentaMouseExited

    private void labelInventarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelInventarioMouseEntered
        // al pasar encima el mouse
        panelInventarios.setBackground(new Color(0x006769));
        labelInventario.setForeground(Color.WHITE);
        
    }//GEN-LAST:event_labelInventarioMouseEntered

    private void labelInventarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelInventarioMouseExited
        // al  sacar el mouse encima
        panelInventarios.setBackground(new Color(0x005c5e));
        labelInventario.setForeground(Color.BLACK);
    }//GEN-LAST:event_labelInventarioMouseExited

    private void labelVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelVentaMouseClicked
        // al dar click
        Menu_Vista_Venta vistaVenta = new Menu_Vista_Venta();
        vistaVenta.setVisible(true);
        vistaVenta.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_labelVentaMouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        Administrar_usuario administrar_usuario = new Administrar_usuario();
        administrar_usuario.setVisible(true);
        administrar_usuario.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Mostrar_Usuario mostrar = new Mostrar_Usuario();
        mostrar.setVisible(true);
        
        mostrar.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void labelCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCompraMouseClicked
        // TODO add your handling code here:
        // al dar click
        Menu_Vista_Compra vista_compra = new Menu_Vista_Compra();
        vista_compra.setVisible(true);
        vista_compra.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_labelCompraMouseClicked

    private void menu_agregarcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_agregarcategoriaActionPerformed
        // TODO add your handling code here:
        Administrar_Categoria categoria = new Administrar_Categoria();
        categoria.setVisible(true);
        categoria.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_menu_agregarcategoriaActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        Administra_Provedor provedor = new Administra_Provedor();
        provedor.setVentanaOrigen("Principal");
        provedor.setLocationRelativeTo(null);
        provedor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        Administrar_Material vista_material = new Administrar_Material();
        vista_material.setLocationRelativeTo(null);
        vista_material.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void labelInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelInventarioMouseClicked
        // TODO add your handling code here:
               // al dar click
        Menu_Vista_Produccion Administar_inventario = new Menu_Vista_Produccion();
        Administar_inventario.setVisible(true);
        Administar_inventario.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_labelInventarioMouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        Administrar_Cliente administrar_cliente = new  Administrar_Cliente();
        administrar_cliente.setVisible(true);
        administrar_cliente.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        Administrar_Chofer vista_chofer = new Administrar_Chofer();
        vista_chofer.setVisible(true);
        vista_chofer.setVentanaOrigen("Principal");
        vista_chofer.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        Administrar_Vehiculo vista_vehi = new Administrar_Vehiculo();
        vista_vehi.setLocationRelativeTo(null);
        vista_vehi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        Ultimo_Acceso ultimo = new Ultimo_Acceso();
        ultimo.setVisible(true);
        ultimo.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        Mostrar_Material mm = new Mostrar_Material();
        mm.setVisible(true);
        mm.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        Mostrar_Proveedor mp = new Mostrar_Proveedor();
        mp.setVisible(true);
        mp.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                usuario Usuario = new usuario();
                Principal principal = new Principal(Usuario); // Asegúrate de pasar un objeto usuario válido
                principal.setVisible(true);
                principal.setLocationRelativeTo(null); 
               
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu categoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JLabel labelCompra;
    private javax.swing.JLabel labelInventario;
    private javax.swing.JLabel labelVenta;
    private javax.swing.JMenuItem menu_agregarcategoria;
    private javax.swing.JMenu menu_usuario;
    private javax.swing.JPanel panelAcciones;
    private javax.swing.JPanel panelCompra;
    private javax.swing.JPanel panelInventarios;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelVentas;
    private javax.swing.JMenu provedor;
    private javax.swing.JMenu sesion;
    // End of variables declaration//GEN-END:variables

    private void configurarPermisos() {
                // Verificar el tipo de usuario
        if ("Administrador".equals(Usuario.getTipo_usuario()) || "Programador".equals(Usuario.getTipo_usuario())) {
            // Si es administrador, habilitar el menú de usuarios
            menu_usuario.setEnabled(true);
       
        } else {
            // Si no es administrador, deshabilitar el menú de usuarios
            menu_usuario.setEnabled(false);
        }
    }
    //revisa lo del ultima vez de usuario y avanza con lo de cambiar pecios 
    //
}
