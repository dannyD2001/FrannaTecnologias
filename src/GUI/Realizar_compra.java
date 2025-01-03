package GUI;
import Util.AppContext;
import com.formdev.flatlaf.FlatDarkLaf;
import conexion.conexion;
import controlador.ctrl_chofer;
import controlador.ctrl_compra;
import controlador.ctrl_material;
import controlador.ctrl_provedor;
import controlador.ctrl_usuario;
import controlador.ctrl_vehiculo;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import modelo.Chofer;
import modelo.Compra;
import modelo.DetalleCompra;
import modelo.Material;
import modelo.Provedor;
import modelo.Vehiculo;
import modelo.usuario;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
public class Realizar_compra extends javax.swing.JFrame {
    //PARA LOS ICONOS DE LAS ALERTAS DE AVISO 
    Icon error;
    Icon correcto;    
    Icon adve;
    //iNSTANCIANDO LA CLASES  
    //RECUPERACION DEL USUARIO ACTUAL        
    usuario usuarioActual = AppContext.getUsuarioActual();
    ctrl_usuario Ctrl_usu = new ctrl_usuario();
    usuario usuario  = new usuario();
    ctrl_material Ctrl_mat = new ctrl_material();
    Material mat = new Material();
    Provedor provedor = new Provedor();
    ctrl_provedor Ctrl_pro = new ctrl_provedor();
    double TotalPagar = 0.00;
    ctrl_chofer chofer = new ctrl_chofer(); 
    public Realizar_compra() {
        // APLICA EL TEMA OSCURO DE FLATLAFT
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
        }
        //MENCION DE LOS METODOS PARA SU EJECUCUCION
        initComponents();
        personalizar_tabla();
        personalizacion_extra();
        acciones();        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_principal = new javax.swing.JPanel();
        barra = new javax.swing.JPanel();
        panel_fondo = new swing.PanelRound();
        panel_atras = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btn_provedor = new swing.PanelRound();
        label_provedor = new javax.swing.JLabel();
        btn_chofer = new swing.PanelRound();
        label_chofer = new javax.swing.JLabel();
        scroll_compra = new javax.swing.JScrollPane();
        tabla_compra = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        borde_opc = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        peso = new javax.swing.JTextField();
        name_material = new javax.swing.JComboBox<>();
        id_material = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        stock = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        metodo_pago = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        observaciones = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        descuento = new javax.swing.JTextField();
        peso_bruto = new javax.swing.JTextField();
        peso_bruto_text = new javax.swing.JLabel();
        peso_tara = new javax.swing.JLabel();
        peso_tara1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        precioss = new javax.swing.JComboBox<>();
        combox_servicio = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        costo_adicional = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        combox_tipo = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        combox_chofer = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        telefono_chofer = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        nombre_chofer = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        placa_unidad = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        borde_revisor = new javax.swing.JPanel();
        nombre_usuario = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        apellido_paterno = new javax.swing.JTextField();
        id_usuario = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        label_total_pagar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        id_provedor = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        panel_eliminar = new swing.PanelRound();
        label_eliminar = new javax.swing.JLabel();
        panel_adelantos = new javax.swing.JPanel();
        adelantos = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        combox_chofer_e = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1350, 650));
        setMinimumSize(new java.awt.Dimension(1350, 650));
        setUndecorated(true);

        panel_principal.setBackground(new java.awt.Color(48, 56, 65));
        panel_principal.setFocusable(false);
        panel_principal.setMaximumSize(new java.awt.Dimension(1350, 650));
        panel_principal.setMinimumSize(new java.awt.Dimension(1350, 650));
        panel_principal.setPreferredSize(new java.awt.Dimension(1350, 650));
        panel_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barra.setBackground(new java.awt.Color(44, 62, 80));
        barra.setPreferredSize(new java.awt.Dimension(1300, 40));

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
            .addComponent(panel_atras, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        panel_fondoLayout.setVerticalGroup(
            panel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_atras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel15.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Compra Granel");

        btn_provedor.setBackground(new java.awt.Color(44, 62, 80));

        label_provedor.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        label_provedor.setForeground(new java.awt.Color(255, 255, 255));
        label_provedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_provedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas.png"))); // NOI18N
        label_provedor.setText("Agregar Proveedor");
        label_provedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_provedor.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        label_provedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_provedorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_provedorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_provedorMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_provedorLayout = new javax.swing.GroupLayout(btn_provedor);
        btn_provedor.setLayout(btn_provedorLayout);
        btn_provedorLayout.setHorizontalGroup(
            btn_provedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_provedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_provedorLayout.setVerticalGroup(
            btn_provedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_provedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btn_chofer.setBackground(new java.awt.Color(44, 62, 80));

        label_chofer.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        label_chofer.setForeground(new java.awt.Color(255, 255, 255));
        label_chofer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_chofer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas.png"))); // NOI18N
        label_chofer.setText("Agregar Chofer");
        label_chofer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_chofer.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        label_chofer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_choferMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_choferMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_choferMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_choferLayout = new javax.swing.GroupLayout(btn_chofer);
        btn_chofer.setLayout(btn_choferLayout);
        btn_choferLayout.setHorizontalGroup(
            btn_choferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_chofer, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
        );
        btn_choferLayout.setVerticalGroup(
            btn_choferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_chofer, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout barraLayout = new javax.swing.GroupLayout(barra);
        barra.setLayout(barraLayout);
        barraLayout.setHorizontalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraLayout.createSequentialGroup()
                .addComponent(panel_fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 602, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(337, 337, 337)
                .addComponent(btn_chofer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_provedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraLayout.createSequentialGroup()
                .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_provedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_chofer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        panel_principal.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 40));

        scroll_compra.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N

        tabla_compra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Material", "Material", "Peso Bruto(Kg)", "Peso Tara(Kg)", "Peso Neto(Kg)", "DescuentoEn(Kg)", "Descuento (%)", "PesoNetoDescuento", "Precio(Kg)", "Observaciones", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_compra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabla_compra.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tabla_compra.setShowHorizontalLines(false);
        tabla_compra.setSurrendersFocusOnKeystroke(true);
        tabla_compra.getTableHeader().setReorderingAllowed(false);
        scroll_compra.setViewportView(tabla_compra);
        if (tabla_compra.getColumnModel().getColumnCount() > 0) {
            tabla_compra.getColumnModel().getColumn(0).setResizable(false);
            tabla_compra.getColumnModel().getColumn(0).setPreferredWidth(2);
            tabla_compra.getColumnModel().getColumn(1).setResizable(false);
            tabla_compra.getColumnModel().getColumn(1).setPreferredWidth(90);
            tabla_compra.getColumnModel().getColumn(2).setResizable(false);
            tabla_compra.getColumnModel().getColumn(2).setPreferredWidth(15);
            tabla_compra.getColumnModel().getColumn(3).setResizable(false);
            tabla_compra.getColumnModel().getColumn(3).setPreferredWidth(15);
            tabla_compra.getColumnModel().getColumn(4).setResizable(false);
            tabla_compra.getColumnModel().getColumn(4).setPreferredWidth(15);
            tabla_compra.getColumnModel().getColumn(5).setResizable(false);
            tabla_compra.getColumnModel().getColumn(5).setPreferredWidth(25);
            tabla_compra.getColumnModel().getColumn(6).setResizable(false);
            tabla_compra.getColumnModel().getColumn(6).setPreferredWidth(25);
            tabla_compra.getColumnModel().getColumn(7).setResizable(false);
            tabla_compra.getColumnModel().getColumn(7).setPreferredWidth(40);
            tabla_compra.getColumnModel().getColumn(8).setResizable(false);
            tabla_compra.getColumnModel().getColumn(8).setPreferredWidth(10);
            tabla_compra.getColumnModel().getColumn(9).setResizable(false);
            tabla_compra.getColumnModel().getColumn(9).setPreferredWidth(35);
            tabla_compra.getColumnModel().getColumn(10).setResizable(false);
            tabla_compra.getColumnModel().getColumn(10).setPreferredWidth(20);
        }

        panel_principal.add(scroll_compra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 1310, 310));

        jButton1.setBackground(new java.awt.Color(48, 56, 65));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/impresora_.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel_principal.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 580, 100, 60));

        borde_opc.setBackground(new java.awt.Color(48, 56, 65));
        borde_opc.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10)))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nombre Material");

        peso.setEditable(false);
        peso.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        peso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        peso.setBorder(null);
        peso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        peso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pesoMousePressed(evt);
            }
        });
        peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoActionPerformed(evt);
            }
        });
        peso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pesoKeyPressed(evt);
            }
        });

        name_material.setBackground(new java.awt.Color(48, 56, 65));
        name_material.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_materialActionPerformed(evt);
            }
        });

        id_material.setEditable(false);
        id_material.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_material.setBorder(null);
        id_material.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_materialActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel3.setText("C. Material");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Peso Neto");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/money-bag_2953423.png"))); // NOI18N
        jLabel5.setText("Precio (kg)");

        stock.setEditable(false);
        stock.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        stock.setBorder(null);
        stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel1.setText("Stock Disponible ");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mate_reciclaje.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/kg_terceario.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/stock_maater.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/code_materi.png"))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(48, 56, 65));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle Pago", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10)))); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(312, 50));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel16.setText("Método de Pago");

        metodo_pago.setBackground(new java.awt.Color(48, 56, 65));
        metodo_pago.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        metodo_pago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Transferencia", "Efectivo" }));
        metodo_pago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel19.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel19.setText("Estatus ");

        status.setBackground(new java.awt.Color(48, 56, 65));
        status.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendiente", "Pagado" }));
        status.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(metodo_pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel19)
                .addGap(0, 0, 0)
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(metodo_pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel19)
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(48, 56, 65));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Observaciónes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10)))); // NOI18N

        observaciones.setBorder(null);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(observaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jSeparator4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel2.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel2.setText("Descuento (%)");

        descuento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        descuento.setText("0 ");
        descuento.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        descuento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                descuentoFocusGained(evt);
            }
        });
        descuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                descuentoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                descuentoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                descuentoKeyTyped(evt);
            }
        });

        peso_bruto.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        peso_bruto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        peso_bruto.setBorder(null);
        peso_bruto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        peso_bruto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                peso_brutoMousePressed(evt);
            }
        });
        peso_bruto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peso_brutoActionPerformed(evt);
            }
        });
        peso_bruto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                peso_brutoKeyPressed(evt);
            }
        });

        peso_bruto_text.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        peso_bruto_text.setText("      Peso Bruto");

        peso_tara.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        peso_tara.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        peso_tara.setText("Peso Tara");

        peso_tara1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        peso_tara1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        peso_tara1.setText("0.00");
        peso_tara1.setBorder(null);
        peso_tara1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        peso_tara1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                peso_tara1MousePressed(evt);
            }
        });
        peso_tara1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peso_tara1ActionPerformed(evt);
            }
        });
        peso_tara1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                peso_tara1KeyPressed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/kg_terceario.png"))); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/kg_terceario.png"))); // NOI18N

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        precioss.setBackground(new java.awt.Color(48, 56, 65));

        combox_servicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "No", "Si" }));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fletee.png"))); // NOI18N
        jLabel20.setText("Servicio Flete");

        costo_adicional.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        costo_adicional.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        costo_adicional.setBorder(null);
        costo_adicional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                costo_adicionalMousePressed(evt);
            }
        });
        costo_adicional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costo_adicionalActionPerformed(evt);
            }
        });
        costo_adicional.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                costo_adicionalKeyReleased(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Costo Adicional(-)");

        combox_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Externo", "Interno" }));
        combox_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combox_tipoActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel22.setText("Tipo Chofer");

        jLabel23.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel23.setText("Seleccione Chofer");

        telefono_chofer.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        telefono_chofer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        telefono_chofer.setBorder(null);
        telefono_chofer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                telefono_choferKeyPressed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/telephone_9787231 (1).png"))); // NOI18N
        jLabel24.setText("Teléfono Chofer");

        nombre_chofer.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nombre_chofer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombre_chofer.setBorder(null);
        nombre_chofer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_choferActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Nombre Chofer");

        placa_unidad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        placa_unidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        placa_unidad.setBorder(null);

        jLabel26.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Placa de la Unidad");

        javax.swing.GroupLayout borde_opcLayout = new javax.swing.GroupLayout(borde_opc);
        borde_opc.setLayout(borde_opcLayout);
        borde_opcLayout.setHorizontalGroup(
            borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borde_opcLayout.createSequentialGroup()
                .addGroup(borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(borde_opcLayout.createSequentialGroup()
                        .addGroup(borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borde_opcLayout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(borde_opcLayout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addGroup(borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator1)
                                    .addComponent(descuento, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))))
                        .addGap(10, 10, 10)
                        .addComponent(jLabel13)
                        .addGap(10, 10, 10)
                        .addGroup(borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stock))
                        .addGap(18, 18, 18)
                        .addGroup(borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(combox_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(combox_tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combox_chofer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator8)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(telefono_chofer))
                        .addGap(15, 15, 15)
                        .addGroup(borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre_chofer))
                        .addGap(15, 15, 15)
                        .addGroup(borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator6)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(placa_unidad))
                        .addGap(15, 15, 15)
                        .addGroup(borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                .addComponent(costo_adicional))
                            .addComponent(jLabel21))
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addGroup(borde_opcLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(name_material, 0, 140, Short.MAX_VALUE))
                        .addGap(25, 25, 25)
                        .addComponent(jLabel10)
                        .addGap(5, 5, 5)
                        .addGroup(borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(id_material, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(peso_bruto_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator3)
                            .addComponent(peso_bruto, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                        .addGap(25, 25, 25)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(peso_tara, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(borde_opcLayout.createSequentialGroup()
                                .addComponent(peso_tara1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5)
                        .addGroup(borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(peso, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precioss, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        borde_opcLayout.setVerticalGroup(
            borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borde_opcLayout.createSequentialGroup()
                .addGroup(borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borde_opcLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(borde_opcLayout.createSequentialGroup()
                        .addGroup(borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(borde_opcLayout.createSequentialGroup()
                                .addGroup(borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(peso_bruto_text)
                                    .addComponent(peso_tara))
                                .addGroup(borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(borde_opcLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(name_material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(borde_opcLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(precioss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(borde_opcLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(borde_opcLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(id_material, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(peso_bruto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(peso_tara1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(4, 4, 4)))
                .addGroup(borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(borde_opcLayout.createSequentialGroup()
                        .addGroup(borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(borde_opcLayout.createSequentialGroup()
                                .addGroup(borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(borde_opcLayout.createSequentialGroup()
                                        .addComponent(descuento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12))
                    .addGroup(borde_opcLayout.createSequentialGroup()
                        .addGroup(borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(borde_opcLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel21))))
                        .addGroup(borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(borde_opcLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(combox_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combox_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combox_chofer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(borde_opcLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(costo_adicional, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telefono_chofer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombre_chofer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(placa_unidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, 0)
                        .addGroup(borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5)
                            .addGroup(borde_opcLayout.createSequentialGroup()
                                .addGroup(borde_opcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))))
        );

        peso.getAccessibleContext().setAccessibleName("");

        panel_principal.add(borde_opc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 1200, 170));
        borde_opc.getAccessibleContext().setAccessibleName("Opciones:");

        borde_revisor.setBackground(new java.awt.Color(48, 56, 65));
        borde_revisor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Revisado Por", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10))); // NOI18N

        nombre_usuario.setEditable(false);
        nombre_usuario.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        nombre_usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombre_usuario.setBorder(null);
        nombre_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_usuarioActionPerformed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user_20_20.png"))); // NOI18N

        apellido_paterno.setEditable(false);
        apellido_paterno.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        apellido_paterno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        apellido_paterno.setBorder(null);

        id_usuario.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N

        javax.swing.GroupLayout borde_revisorLayout = new javax.swing.GroupLayout(borde_revisor);
        borde_revisor.setLayout(borde_revisorLayout);
        borde_revisorLayout.setHorizontalGroup(
            borde_revisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(borde_revisorLayout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(nombre_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(apellido_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(id_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        borde_revisorLayout.setVerticalGroup(
            borde_revisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borde_revisorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(borde_revisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(borde_revisorLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(borde_revisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id_usuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(borde_revisorLayout.createSequentialGroup()
                                .addComponent(apellido_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(nombre_usuario))))
                .addContainerGap())
        );

        panel_principal.add(borde_revisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 260, 60));

        jPanel1.setBackground(new java.awt.Color(48, 56, 65));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Importe", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Total a Pagar (MXN)");

        label_total_pagar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label_total_pagar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_total_pagar.setText("$ 00.00");
        label_total_pagar.setToolTipText("");
        label_total_pagar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(label_total_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_total_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        panel_principal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 570, 230, 70));

        jPanel2.setBackground(new java.awt.Color(48, 56, 65));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proveedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10)))); // NOI18N

        id_provedor.setBackground(new java.awt.Color(48, 56, 65));
        id_provedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        id_provedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_provedorActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/proveeee.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(id_provedor, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_provedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_principal.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 580, 250, 60));

        jPanel5.setBackground(new java.awt.Color(48, 56, 65));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eliminar Fila", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10)))); // NOI18N

        panel_eliminar.setBackground(new java.awt.Color(106, 154, 176));
        panel_eliminar.setForeground(new java.awt.Color(0, 0, 0));
        panel_eliminar.setPreferredSize(new java.awt.Dimension(79, 40));
        panel_eliminar.setRoundBottomLeft(20);
        panel_eliminar.setRoundBottomRight(20);
        panel_eliminar.setRoundTopLeft(20);
        panel_eliminar.setRoundTopRight(20);

        label_eliminar.setBackground(new java.awt.Color(153, 153, 153));
        label_eliminar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        label_eliminar.setForeground(new java.awt.Color(0, 0, 0));
        label_eliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_eliminar.setText("X");
        label_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_eliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_eliminarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                label_eliminarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panel_eliminarLayout = new javax.swing.GroupLayout(panel_eliminar);
        panel_eliminar.setLayout(panel_eliminarLayout);
        panel_eliminarLayout.setHorizontalGroup(
            panel_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
        );
        panel_eliminarLayout.setVerticalGroup(
            panel_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        panel_principal.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 50, 110, 110));

        panel_adelantos.setBackground(new java.awt.Color(48, 56, 65));
        panel_adelantos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adelantos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10))); // NOI18N

        adelantos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        adelantos.setText("0.00");
        adelantos.setBorder(null);
        adelantos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                adelantosKeyReleased(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("$");

        javax.swing.GroupLayout panel_adelantosLayout = new javax.swing.GroupLayout(panel_adelantos);
        panel_adelantos.setLayout(panel_adelantosLayout);
        panel_adelantosLayout.setHorizontalGroup(
            panel_adelantosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_adelantosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_adelantosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_adelantosLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(adelantos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        panel_adelantosLayout.setVerticalGroup(
            panel_adelantosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_adelantosLayout.createSequentialGroup()
                .addGroup(panel_adelantosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adelantos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_principal.add(panel_adelantos, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 580, 180, 60));

        correo.setEditable(false);
        correo.setBackground(new java.awt.Color(18, 30, 49));
        correo.setBorder(null);
        correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoActionPerformed(evt);
            }
        });
        panel_principal.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 600, 200, 30));

        panel_principal.add(combox_chofer_e, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 190, 90, -1));

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel27.setText("Seleccione Chofer");
        panel_principal.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 170, 90, -1));

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gmail.png"))); // NOI18N
        jLabel28.setText("Correo Electrónico");
        panel_principal.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 570, 200, -1));
        panel_principal.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 630, 200, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 1350, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nombre_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_usuarioActionPerformed
    private void pesoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesoKeyPressed
    private void name_materialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_materialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_materialActionPerformed
    private void descuentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descuentoKeyPressed
        // TODO add your handling code here:    
        //aca
         if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
        // Verificar si el campo no está vacío
        DefaultTableModel modelo = (DefaultTableModel) tabla_compra.getModel();       
        if (!id_material.getText().trim().isEmpty() &&
            precioss.getSelectedItem() != null && // Verificar que se haya seleccionado un precio en el JComboBox
            //!precio_kg1.getText().trim().isEmpty() &&
            !peso_bruto.getText().trim().isEmpty() &&
            !peso_tara1.getText().trim().isEmpty() &&
            !peso.getText().trim().isEmpty() &&
            !descuento.getText().trim().isEmpty()){
            try {
            String observacion =observaciones.getText().trim();
            if (name_material.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Por favor!! Seleccione un material");
            return;
            }               
            peso_bruto.requestFocus(); // Inicializador después del enter
            Material selectedMaterial = (Material) name_material.getSelectedItem();
            int idMaterial = selectedMaterial.getId_material(); // Obtener el ID del material seleccionado
            String nombreMaterial = selectedMaterial.getNombre_material(); // Obtener el nombre del material
            // Obtener los valores ingresados
            double pesoBruto = Double.parseDouble(peso_bruto.getText().trim());
            double pesoTara = Double.parseDouble(peso_tara1.getText().trim());
            double pesoNeto = pesoBruto - pesoTara; // Calcular el peso neto
            // Obtener el precio seleccionado en el JComboBox
            double precio = Double.parseDouble(precioss.getSelectedItem().toString().trim());
            //double precio = Double.parseDouble(precio_kg1.getText().trim());
            double descuentoPorcentaje = Double.parseDouble(descuento.getText().trim()); // Obtener el valor del descuento ingresado en porcentaje

            // Calcular el valor absoluto del peso que se descontó
            double pesoDescontado = pesoNeto * (descuentoPorcentaje / 100.0);
            // Redondear a dos decimales
            pesoDescontado = Math.round(pesoDescontado * 100.0) / 100.0;

            // Calcular el peso con descuento
            double pesoConDescuento = pesoNeto - pesoDescontado;

            // Calcular el subtotal
            double subtotal = pesoConDescuento * precio;

            // Redondear a dos decimales
            double subtotalConDosDecimales = Math.round(subtotal * 100.0) / 100.0;

            // Crear un array con los valores de la fila
            Object[] fila = new Object[11]; // Ahora la fila tiene 9 columnas
            fila[0] = idMaterial;
            fila[1] = nombreMaterial;
            fila[2] = pesoBruto;
            fila[3] = pesoTara;
            fila[4] = pesoNeto;
            fila[5] = pesoDescontado; // Mostrar la cantidad de peso que fue descontado
            fila[6] = descuentoPorcentaje;
            fila[7] = pesoConDescuento; // Mostrar el peso con descuento
            fila[8] = precio; // Incluir el precio por kg
            fila[9] = observacion;
            fila[10] = subtotalConDosDecimales;

            // Agregar la fila al modelo de la tabla
            modelo.insertRow(0, fila);
            tabla_compra.setModel(modelo);
            // Vaciar los campos de texto luego de agregar a la tabla
            limpiar();
            total_pagar();
        } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese valores válidos en los campos numéricos.");
        }   
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
        }
        }
    }//GEN-LAST:event_descuentoKeyPressed
    //private boolean limpiado = false;
    private void pesoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesoMousePressed

    }//GEN-LAST:event_pesoMousePressed
    private void pesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesoActionPerformed

    private void descuentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descuentoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_descuentoKeyReleased

    private void id_materialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_materialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_materialActionPerformed

    private void stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockActionPerformed

    private void descuentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descuentoKeyTyped
        // TODO add your handling code here: 
    }//GEN-LAST:event_descuentoKeyTyped
    private boolean limpiado = false;
    private void descuentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descuentoFocusGained
        // TODO add your handling code here:        
        if (!limpiado) {
        descuento.setText("");  // Limpiar el campo cuando recibe el foco
        limpiado = true;
        }
    }//GEN-LAST:event_descuentoFocusGained

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

    private void panel_atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_atrasMouseClicked
        // TODO add your handling code here:
        Menu_Vista_Compra menu_vista = new Menu_Vista_Compra();
         menu_vista.setVisible(true);
         menu_vista.setLocationRelativeTo(null);
        //cerrar procesos que quedaron anteriormente
        this.dispose(); 
    }//GEN-LAST:event_panel_atrasMouseClicked

    private void label_eliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_eliminarMousePressed
        // TODO add your handling code here:
        try {
        DefaultTableModel modelo = (DefaultTableModel) tabla_compra.getModel();
        int selectedRow = tabla_compra.getSelectedRow(); // Verificar la fila seleccionada        
        if (selectedRow != -1) { // Si hay una fila seleccionada (el valor sería diferente de -1)
            modelo.removeRow(selectedRow);  // Eliminar la fila seleccionada
            total_pagar();  // Recalcular el total
        } else {
            // Si no hay una fila seleccionada, mostramos un mensaje al usuario
            JOptionPane.showMessageDialog(null, "Por favor, selecciona una fila para eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al eliminar la fila: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
            
    }//GEN-LAST:event_label_eliminarMousePressed

    private void label_eliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_eliminarMouseEntered
        // TODO add your handling code here:
        panel_eliminar.setBackground(new Color(0xa30000));
        label_eliminar.setForeground(Color.WHITE);     
    }//GEN-LAST:event_label_eliminarMouseEntered

    private void label_eliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_eliminarMouseExited
        // TODO add your handling code here:
        panel_eliminar.setBackground(new Color(0x6A9AB0));
        label_eliminar.setForeground(Color.BLACK); 
    }//GEN-LAST:event_label_eliminarMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //SE LLAMA LOS METODOS PARA REALIZAR LA COMPRA
        ctrl_material material = new ctrl_material();
        RegistrarCompra();
        material.bucarMaterial(name_material);
        Ctrl_pro.bucarProvedor(id_provedor);
        //correo_electronico();
        //es para la logica del correo
        //String correos = correo.getText();
        /* if(!correos.isEmpty()){
            correo_electronico();
        }*/     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void peso_brutoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peso_brutoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_peso_brutoMousePressed

    private void peso_brutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peso_brutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_peso_brutoActionPerformed

    private void peso_brutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_peso_brutoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_peso_brutoKeyPressed
    private boolean limpiado2 = false;
    private void peso_tara1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peso_tara1MousePressed
        // TODO add your handling code here:
        if(!limpiado2){
           //limpiar el texto
           if(!peso_tara1.getText().equals("")){
               peso_tara1.setText("");
           }
           limpiado2 = true;
       }   
    }//GEN-LAST:event_peso_tara1MousePressed

    private void peso_tara1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peso_tara1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_peso_tara1ActionPerformed

    private void peso_tara1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_peso_tara1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_peso_tara1KeyPressed

    private void id_provedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_provedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_provedorActionPerformed

    private void costo_adicionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costo_adicionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costo_adicionalActionPerformed
    //private boolean limpiado4 =false;
    private void costo_adicionalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_costo_adicionalMousePressed
       // TODO add your handling code here: 
    }//GEN-LAST:event_costo_adicionalMousePressed

    private void costo_adicionalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_costo_adicionalKeyReleased
        // TODO add your handling code here:
        total_pagar();
    }//GEN-LAST:event_costo_adicionalKeyReleased

    private void label_provedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_provedorMouseClicked
        // TODO add your handling code here:
        Administra_Provedor ap = new Administra_Provedor();
        ap.setVentanaOrigen("Realiza_compra");
        ap.setVisible(true);
        ap.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_label_provedorMouseClicked

    private void label_provedorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_provedorMouseEntered
        // TODO add your handling code here:
        btn_provedor.setBackground(new Color(0x415161));
        label_provedor.setForeground(Color.BLACK);
    }//GEN-LAST:event_label_provedorMouseEntered

    private void label_provedorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_provedorMouseExited
        // TODO add your handling code here:
        btn_provedor.setBackground(new Color(0x2C3E50));
        label_provedor.setForeground(Color.WHITE);
    }//GEN-LAST:event_label_provedorMouseExited

    private void nombre_choferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_choferActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_choferActionPerformed

    private void telefono_choferKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefono_choferKeyPressed
        // TODO add your handling code here:
        //aca
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) { // Detectar Enter
        String telefono = telefono_chofer.getText().trim();
        ctrl_chofer controlador = new ctrl_chofer();
        Chofer chofer = controlador.buscarChofer(telefono);
        if (chofer != null) {
            nombre_chofer.setText(chofer.getNombre());
            placa_unidad.setText(chofer.getPlaca());
        }
        }
    }//GEN-LAST:event_telefono_choferKeyPressed

    private void label_choferMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_choferMouseEntered
        // TODO add your handling code here:
        btn_chofer.setBackground(new Color(0x415161));
        label_chofer.setForeground(Color.BLACK);
    }//GEN-LAST:event_label_choferMouseEntered

    private void label_choferMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_choferMouseExited
        // TODO add your handling code here:
        btn_chofer.setBackground(new Color(0x2C3E50));
        label_chofer.setForeground(Color.WHITE);
    }//GEN-LAST:event_label_choferMouseExited

    private void label_choferMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_choferMouseClicked
        // TODO add your handling code here:
        Administrar_Chofer ac = new Administrar_Chofer();
        ac.setVisible(true);
        ac.setVentanaOrigen("Realizar_Compra");
        ac.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_label_choferMouseClicked

    private void adelantosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adelantosKeyReleased
        // TODO add your handling code here:
        total_pagar();
    }//GEN-LAST:event_adelantosKeyReleased

    private void correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoActionPerformed

    }//GEN-LAST:event_correoActionPerformed

    private void combox_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combox_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combox_tipoActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Realizar_compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Realizar_compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Realizar_compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Realizar_compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {                    
                Realizar_compra compra = new Realizar_compra(); 
                compra.setVisible(true);
                compra.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adelantos;
    private javax.swing.JTextField apellido_paterno;
    private javax.swing.JPanel barra;
    private javax.swing.JPanel borde_opc;
    private javax.swing.JPanel borde_revisor;
    private swing.PanelRound btn_chofer;
    private swing.PanelRound btn_provedor;
    private javax.swing.JComboBox<String> combox_chofer;
    private javax.swing.JComboBox<String> combox_chofer_e;
    private javax.swing.JComboBox<String> combox_servicio;
    private javax.swing.JComboBox<String> combox_tipo;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField costo_adicional;
    private javax.swing.JTextField descuento;
    private javax.swing.JTextField id_material;
    private javax.swing.JComboBox<String> id_provedor;
    private javax.swing.JLabel id_usuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel label_chofer;
    private javax.swing.JLabel label_eliminar;
    private javax.swing.JLabel label_provedor;
    private javax.swing.JLabel label_total_pagar;
    private javax.swing.JComboBox<String> metodo_pago;
    private javax.swing.JComboBox<String> name_material;
    private javax.swing.JTextField nombre_chofer;
    private javax.swing.JTextField nombre_usuario;
    private javax.swing.JTextField observaciones;
    private javax.swing.JPanel panel_adelantos;
    private javax.swing.JLabel panel_atras;
    private swing.PanelRound panel_eliminar;
    private swing.PanelRound panel_fondo;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JTextField peso;
    private javax.swing.JTextField peso_bruto;
    private javax.swing.JLabel peso_bruto_text;
    private javax.swing.JLabel peso_tara;
    private javax.swing.JTextField peso_tara1;
    private javax.swing.JTextField placa_unidad;
    private javax.swing.JComboBox<String> precioss;
    private javax.swing.JScrollPane scroll_compra;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JTextField stock;
    private javax.swing.JTable tabla_compra;
    private javax.swing.JTextField telefono_chofer;
    // End of variables declaration//GEN-END:variables
        
    private void total_pagar() {
    TotalPagar = 0.00;
    int numfila = tabla_compra.getRowCount();
    //Sumar los valores de la columna "Precio Total" de la tabla
    for (int i = 0; i < numfila; i++) {
        try {
            Object valor = tabla_compra.getModel().getValueAt(i, 10);           
            if (valor != null && !valor.toString().isEmpty()) {
                double calcular = Double.parseDouble(valor.toString());
                TotalPagar += calcular;
            }
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir el valor a double: " + e.getMessage());
        }
    }
    //para lo del adelantos
    String adelantadoo = adelantos.getText();
    
    // Agregar el Costo Adicional al TotalPagar solo si no está vacío y es un número válido
    String costoAdicionalText = costo_adicional.getText(); // Asegúrate de que "costo_adicional" es el nombre correcto del campo de texto
    
    double costoAdicional = 0.0;
    double adelantado = 0.0;

    // Bandera para validar si alguno de los valores es inválido
    boolean invalidInput = false;

    // Verificar si costo adicional es un número válido
    if (costoAdicionalText != null && !costoAdicionalText.isEmpty() && !costoAdicionalText.equals(".")) {
        if (costoAdicionalText.matches("^[0-9]+(\\.[0-9]+)?$")) {
            costoAdicional = Double.parseDouble(costoAdicionalText);
        }   
        else {
            invalidInput = true;
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor numérico válido para el costo adicional.", "Valor inválido", JOptionPane.WARNING_MESSAGE);
        }
    }

    // Verificar si adelantado es un número válido
    if (adelantadoo != null && !adelantadoo.isEmpty() && !adelantadoo.equals(".")) {
        if (adelantadoo.matches("^[0-9]+(\\.[0-9]+)?$")) {
            adelantado = Double.parseDouble(adelantadoo);
        } 
        else {
            invalidInput = true;
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor numérico válido para el adelanto.", "Valor inválido", JOptionPane.WARNING_MESSAGE);
        }
    }

    // Si ambos son válidos, realizar las operaciones
    if (!invalidInput) {
        // Restar el costo adicional (si está presente) y sumar el adelanto (si está presente)
        TotalPagar = TotalPagar - costoAdicional - adelantado;
    }
    //Asegurarse de que el total no sea negativo
    if (TotalPagar < 0 ) {
        TotalPagar = 0.00;
    }    
    // Actualizar el JLabel con el total formateado
    label_total_pagar.setText(String.format("%,.2f", TotalPagar));
    }
    //Recurso para limpiar al finalizar la compra
    private void limpiar(){
        name_material.setSelectedIndex(0);                
        id_material.setText("");
        //precio_kg1.setText("");
        peso.setText("");
        peso_bruto.setText("");
        peso_tara1.setText("");
        descuento.setText("");
        observaciones.setText("");
    }
    // Método para calcular el peso neto es de ayuda para luego tenerlo 
    private void calcularPesoNeto() {
    try {
        // Obtener los valores de los campos de peso bruto y peso tara
        double pesoBruto = Double.parseDouble(peso_bruto.getText().trim());
        double pesoTara = Double.parseDouble(peso_tara1.getText().trim());

        // Comprobar si el peso bruto es menor que el peso tara
        if (pesoBruto < pesoTara) {
            JOptionPane.showMessageDialog(null, "Error: El peso bruto no puede ser menor que el peso tara.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            // Limpiar los campos o establecer el foco en uno de ellos si es necesario
            peso_bruto.requestFocus();
            return;
        } else {
            // Si la condición es válida, calcular el peso neto
            double pesoNeto = pesoBruto - pesoTara;
            peso.setText(String.valueOf(pesoNeto)); // Mostrar el resultado en el campo "peso"
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Por favor, Complete todos los campos", "Error de entrada", JOptionPane.ERROR_MESSAGE);
    }
    }
    
    // aca modificar los numero de la tabla porque modificare
    private void RegistrarCompra() {
    try {
        // Verifica que haya filas en la tabla de compras
        if (tabla_compra.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No hay Datos Disponibles para Registrar la Compra. Asegúrese de Agregar Elementos a la Tabla.", "Mensaje", JOptionPane.WARNING_MESSAGE, adve);
            return;
        }
        
        // Verificar que el servicio de flete esté seleccionado correctamente
        String servicioFlete = combox_servicio.getSelectedItem().toString();
        if (!servicioFlete.equals("Si") && !servicioFlete.equals("No")) {
            JOptionPane.showMessageDialog(null, "Seleccione una opción válida para el servicio de flete (Sí o No).", "Mensaje", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // Validaciones adicionales según el valor de "Servicio Flete"
        if (servicioFlete.equals("Si")) {
            String costoAdicionalStr = costo_adicional.getText().trim();
            // Verificar que el costo adicional no esté vacío y que sea numérico
            if (costoAdicionalStr.isEmpty() || !esNumeroValido(costoAdicionalStr)) {
                JOptionPane.showMessageDialog(null, "Ingrese un costo adicional válido.", "Mensaje", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }else if(servicioFlete.equals("No")){
             // Verificar que los campos de "Nombre del Chofer", "Teléfono del Chofer", y "Placa de la Unidad" estén llenos
            if(telefono_chofer.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(null,"Ingrese el Telefono del Chofer y de Enter");
                return;
            }
            if (nombre_chofer.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese el nombre del chofer.", "Mensaje", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        
        // Confirmar si se desea realizar la compra
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas realizar la compra?", "Confirmar Compra", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (confirmacion != JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Compra cancelada", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        // Obtener el nombre del usuario desde el campo de texto
        String nombreUsuario = nombre_usuario.getText();
        ctrl_usuario ctrlUsu = new ctrl_usuario();        
        String telefono = ctrlUsu.obtenerusuarioPorNombre(nombreUsuario);

        if (telefono == null) {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
            return; // Salir del método si no se encontró el usuario
        }

        // Obtener el nombre del proveedor y el ID
        String nombreProveedor = id_provedor.getSelectedItem().toString();
        ctrl_provedor ctrlProv = new ctrl_provedor();
        int idProvedor = ctrlProv.obtenerIdProveedorPorNombre(nombreProveedor);
        if (idProvedor == -1) {
            JOptionPane.showMessageDialog(null, "Proveedor no encontrado.");
            return; // Salir del método si no se encontró el proveedor
        }
        // Obtener datos del chofer
        String tipoChofer = combox_tipo.getSelectedItem().toString();
        String telefonoChofer = null;
        String placaVehiculo = null;
        ctrl_chofer ctrlChofer = new ctrl_chofer();
        ctrl_vehiculo ctrlVehiculo = new ctrl_vehiculo();
        //logica para el guardado de la BD en Choferes
        if (tipoChofer.equals("Interno")) {
            // Manejo de chofer interno
            String nombreChofer = combox_chofer.getSelectedItem().toString();
            telefonoChofer = ctrlChofer.obtenerTelefonoChoferInternoPorNombre(nombreChofer);
            if (telefonoChofer == null) {
                JOptionPane.showMessageDialog(null, "Chofer interno no encontrado.");
                return;
            }
        }else{
            // Manejo de chofer externo
            telefonoChofer = telefono_chofer.getText().trim();
            String nombreChofer = capitalize(nombre_chofer.getText().trim()); //aca 
            placaVehiculo = toUpperCaseString(placa_unidad.getText().trim());
            // Verificar si la placa del vehículo existe
            Long idVehiculo = ctrlVehiculo.obtenerIdPorPlaca(placaVehiculo);
            if (idVehiculo == null) {
                Vehiculo nuevoVehiculo = new Vehiculo(placaVehiculo);               
                if (!ctrlVehiculo.registrarVehiculo(nuevoVehiculo)) {
                    //JOptionPane.showMessageDialog(null, "Error al registrar el vehículo.");
                    return;
                }
                //JOptionPane.showMessageDialog(null, "Vehículo registrado exitosamente.");
            }
            // Verificar si el chofer externo ya existe
            Chofer choferExistente = ctrlChofer.buscarChoferExternoPorTelefono(telefonoChofer);
            if (choferExistente == null) {
                // Registrar el chofer si no existe
                Chofer choferExterno = new Chofer(telefonoChofer, nombreChofer, "Externo", placaVehiculo);
                if (!ctrlChofer.RegistrarChofer(choferExterno)) {
                    JOptionPane.showMessageDialog(null, "Error al registrar el chofer externo.");
                    return;
                }
            }else {
                // Si el chofer ya existe, verificar si la placa es diferente
                if (!choferExistente.getPlaca().equals(placaVehiculo)) {
                    // Preguntar si se desea actualizar la placa
                    int opcion = JOptionPane.showConfirmDialog(null, "El chofer ya existe. ¿Desea actualizar la placa a " + placaVehiculo + "?",
                            "Actualizar Placa", JOptionPane.YES_NO_OPTION);
                    if (opcion == JOptionPane.YES_OPTION) {
                        // Actualizar la placa del chofer existente
                        choferExistente.setPlaca(placaVehiculo);
                        if (!ctrlChofer.actualizarChofer(choferExistente)) {
                            JOptionPane.showMessageDialog(null, "Error al actualizar la placa del chofer.");
                            return;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No se registrará el chofer con la nueva placa.");
                        return;
                    }
                }
            }
        }
        
        // Obtener el total de la compra y el costo de flete
        String totalCompraStr = label_total_pagar.getText().replace(",", "");
        double totalCompra = Double.parseDouble(totalCompraStr);     
        double CostoFlete = Double.parseDouble(costo_adicional.getText().trim());
        double adelanto  = Double.parseDouble(adelantos.getText().trim());
        
        // Obtener método de pago, estatus y otros datos
        String metodoPago = metodo_pago.getSelectedItem().toString();
        String estatus = status.getSelectedItem().toString();
        String flete = combox_servicio.getSelectedItem().toString();

        // Crear el objeto Compra con los datos
        Compra compra = new Compra();
        compra.setTotal_compra(totalCompra);
        compra.setId_provedor(idProvedor);
        compra.setTelefono(telefono);
        compra.setMetodo_pago(metodoPago);
        compra.setStatus(estatus);
        compra.setFlete(flete);
        compra.setCosto_flete(CostoFlete);
        compra.setTelefono_chofer(telefonoChofer);
        compra.setAdelanto(adelanto);

        // Registrar la compra y los detalles
        ctrl_compra ctrlCompra = new ctrl_compra();
        
        int folio_compra = ctrlCompra.registrarCompra(compra); // Obtener el folio de la compra registrada
        if (folio_compra != -1) { // Si se registró la compra correctamente
            for (int i = 0; i < tabla_compra.getRowCount(); i++) {
                // Obtener datos de cada fila de la tabla de compras
                int id_material = Integer.parseInt(tabla_compra.getValueAt(i, 0).toString());
                double peso_bruto = Double.parseDouble(tabla_compra.getValueAt(i, 2).toString());
                double peso_tara = Double.parseDouble(tabla_compra.getValueAt(i, 3).toString());
                double peso_neto = Double.parseDouble(tabla_compra.getValueAt(i, 4).toString());
                double descuento = Double.parseDouble(tabla_compra.getValueAt(i, 6).toString());
                String observacion = capitalize(tabla_compra.getValueAt(i, 9).toString().trim());
                double subtotal = Double.parseDouble(tabla_compra.getValueAt(i, 10).toString());
                double precio_seleccionado = Double.parseDouble(tabla_compra.getValueAt(i, 8).toString());

                // Crear el objeto DetalleCompra y registrar el detalle de la compra
                DetalleCompra detalle = new DetalleCompra(folio_compra, id_material, peso_bruto, peso_tara, peso_neto, descuento, observacion, subtotal, precio_seleccionado);
                ctrl_compra ctrlDetalle = new ctrl_compra();
                ctrlDetalle.registrarDetalle(detalle);
            }
            //incluimos lo de pdf y correo
            //int folioComp = folio_compra.intValue();  // Desreferenciar si es un Integer
            byte[] pdfBytes = generarPDF(folio_compra);
            if (pdfBytes == null || pdfBytes.length == 0) {
                JOptionPane.showMessageDialog(null, "Error al generar el PDF. No se enviará el correo.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            // Mostrar mensaje de carga mientras se envía el correo
            JLabel loadingLabel = new JLabel("Enviando correo...", JLabel.CENTER);
            loadingLabel.setIcon(new ImageIcon(getClass().getResource("/imagenes/Loading.gif")));
            JOptionPane loadingMessage = new JOptionPane(loadingLabel, JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION);
            JDialog dialog = loadingMessage.createDialog(this, "Procesando...");
            dialog.setModal(false);
            dialog.setVisible(true);
            // Crear un hilo para enviar el correo
            new Thread(() -> {
                try {
                    correo_electronico(pdfBytes, folio_compra);  // Enviar el correo con el PDF adjunto
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error al enviar el correo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                } finally {
                    dialog.dispose();  // Cerrar el diálogo de carga
                }
            }).start();         
            // Limpiar la tabla y otros campos en la interfaz
            DefaultTableModel modelo = (DefaultTableModel) tabla_compra.getModel();
            modelo.setRowCount(0); // Limpiar todas las filas de la tabla
            id_provedor.setSelectedIndex(0); // Restablecer el JComboBox de proveedor
            label_total_pagar.setText("$ 00.00"); // Restablecer el total a pagar
            costo_adicional.setText("");
            combox_servicio.setSelectedItem("--Seleccionar--");
            telefono_chofer.setText("");
            nombre_chofer.setText("");
            placa_unidad.setText("");
            combox_chofer_e.setSelectedItem("--Seleccionar--");
            combox_chofer.setSelectedItem("--Seleccionar--");
            adelantos.setText("0.00");
            metodo_pago.setSelectedIndex(0);
            status.setSelectedIndex(0);
            Thread.sleep(2000);
            JOptionPane.showMessageDialog(this, "Compra Registrada Exitosamente", "Compra Realizada", JOptionPane.WARNING_MESSAGE, correcto);
        } else {
            JOptionPane.showMessageDialog(null, "Error al registrar la compra.");
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
    }
    //METODO QUE NOS SRIVE PARA CONVERTIR A MAYUSCULA LA PRIMERO LETRA UTIL PARA UNOS CAMPOS
    private String capitalize(String str) {
    if (str == null || str.isEmpty()) {
        return str; // Retorna la cadena original si está vacía o es null
    }
    //UpperCase Mayuscula vs lowerCase minuscula
    return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
    
    //Personalizar tabla
    public void personalizar_tabla(){
        //Personalizamos la tablas 
        tabla_compra.setBackground(new Color(0x333337));  // Fondo de las celdas
        tabla_compra.setForeground(new Color(000,000,000));  // Color del texto de las celdas
        tabla_compra.setGridColor(new Color(0x333337));  // Líneas de celda más suaves
        tabla_compra.setRowHeight(25);  // Ajustar la altura de las filas
        tabla_compra.setFont(new Font("sansserif", Font.PLAIN, 12));//ME PARECE, ES FUENTE DEL CONTENIDO DE LA TABLA
        // Configurar el JScrollPane sin borde
        scroll_compra.setBorder(BorderFactory.createEmptyBorder());
        scroll_compra.setBackground(new Color(0x333337));
        TableCellRenderer cellRenderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                // Establecer los colores para celdas seleccionadas y no seleccionadas
                if (isSelected) {
                    label.setBackground(new Color(0, 102, 204));  // Fondo cuando está seleccionada (azul)
                    label.setForeground(Color.WHITE);  // Texto cuando está seleccionada (blanco)
                } else {
                    //este es el que aplica para el fondo del tabla
                    label.setBackground(new Color(0x333337));  // Fondo cuando no está seleccionada (blanco)
                    label.setForeground(new Color(102,102,102));  // Texto cuando no está seleccionada (negro)
                }
                // Si deseas cambiar el alineamiento del texto
                label.setHorizontalAlignment(JLabel.LEFT);  // Alinear el texto a la izquierda

                label.setOpaque(true);  // Asegurarse de que el fondo se pinte correctamente
                return label;
            }
        };
        // Aplicar el renderizador personalizado a todas las columnas de la tabla
        for (int i = 0; i < tabla_compra.getColumnCount(); i++) {
            tabla_compra.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
        }
        //para encabezado de Tabla
        TableCellRenderer headerRenderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                label.setBackground(new Color(120,171,168));  // Fondo verde del encabezado                
                label.setForeground(new Color(40,40,40));  // Color del texto del encabezado
                label.setHorizontalAlignment(JLabel.LEFT);  // Centrar el texto
                label.setFont((new Font("sansserif", Font.BOLD, 12))); //LA FUENTE DE LA TABLA  TITULO                 
                label.setOpaque(true);  // Asegurarse de que el color de fondo se aplique
                return label;
            }
        };
         // Aplicar el renderizador a cada columna del encabezado
        for (int i = 0; i < tabla_compra.getColumnModel().getColumnCount(); i++) {
            tabla_compra.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        tabla_compra.repaint();
    }
    public void personalizacion_extra(){
        //ICONO DE LA VENTANA JAVA
        this.setTitle("COMPRA");
        Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/compra1.png"));
        this.setIconImage(icono);
        this.setLocationRelativeTo(null);        
        //para el icono JOPtion
        error =new ImageIcon("src/imagenes/error.png");
        correcto = new  ImageIcon("src/imagenes/correcto.png");
        adve = new ImageIcon("src/imagenes/advertencia.png");
        //fondo trasnparente botones para quitar lo blanco
        nombre_usuario.setBackground(new java.awt.Color(0,0,0,1));
        id_usuario.setBackground(new java.awt.Color(0,0,0,1));
        stock.setBackground(new java.awt.Color(0,0,0,1));
        id_material.setBackground(new java.awt.Color(0,0,0,1));
        peso.setBackground(new java.awt.Color(0,0,0,1));
        peso_bruto.setBackground(new java.awt.Color(0,0,0,1));
        peso_tara1.setBackground(new java.awt.Color(0,0,0,1));
        apellido_paterno.setBackground(new java.awt.Color(0,0,0,1));
        descuento.setBackground(new java.awt.Color(0,0,0,1));
        observaciones.setBackground(new java.awt.Color(0,0,0,1));
        costo_adicional.setBackground(new java.awt.Color(0,0,0,1));
        telefono_chofer.setBackground(new java.awt.Color(0,0,0,1));
        nombre_chofer.setBackground(new java.awt.Color(0,0,0,1));
        placa_unidad.setBackground(new java.awt.Color(0,0,0,1));
        adelantos.setBackground(new java.awt.Color(0,0,0,1));
        correo.setBackground(new java.awt.Color(0,0,0,1));
    }
    // Método auxiliar para validar si una cadena es un número válido
    private boolean esNumeroValido(String str) {
    str = str.trim(); // Eliminar espacios en blanco
    // Expresión regular para números con o sin decimales
    return str.matches("\\d+(\\.\\d+)?");
    }
    //esto me sirve para la placa convertir todo a mayuscula 
    private String toUpperCaseString(String str){
        if(str == null || str.isEmpty()){
            return str;//retronar cadena vacia
        }
        return str.toUpperCase();
    }   
    //logica para los action listerner y en general
    public void acciones(){
        // Agregar ActionListener a peso_bruto
        peso_bruto.addActionListener(e -> calcularPesoNeto());
        // Agregar ActionListener a peso_tara1
        peso_tara1.addActionListener(e -> calcularPesoNeto());       
        //Cargar materiales en el JComboBox de material y provedor
        Ctrl_mat.bucarMaterial(name_material);
        Ctrl_pro.bucarProvedor(id_provedor);
        // Configurar el ActionListener para el JComboBox
        peso_bruto.disable();
        peso_tara1.disable();
        descuento.disable();
        metodo_pago.disable();
        status.disable();
        observaciones.disable();   
        combox_tipo.disable();
        //para lo del provedor
        id_provedor.addItemListener(new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                Object itemSeleccionado = id_provedor.getSelectedItem();

                // Verificar que el item seleccionado sea un Proveedor
                if (itemSeleccionado instanceof Provedor) {
                    Provedor proveedorSeleccionado = (Provedor) itemSeleccionado;
                    // Rellenar el JTextField con el correo del proveedor
                    correo.setText(proveedorSeleccionado.getCorreo_electronico());
                } else {
                    // Si no es un proveedor válido, limpiar el JTextField
                    correo.setText("");
                }
            }
        }
        });
                
        //todo para lo de choferes externos
        chofer.bucarChofer(combox_chofer);
        chofer.bucarChoferExterno(combox_chofer_e);
        combox_chofer_e.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                // Verificar que el item seleccionado no sea nulo
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    Object itemSeleccionado = combox_chofer_e.getSelectedItem();

                    // Verificar que el item seleccionado sea un Chofer
                    if (itemSeleccionado instanceof Chofer) {
                        Chofer choferSeleccionado = (Chofer) itemSeleccionado;

                        // Rellenar los JTextField con la información del chofer
                        nombre_chofer.setText(choferSeleccionado.getNombre());
                        telefono_chofer.setText(choferSeleccionado.getTelefono_chofer());
                        placa_unidad.setText(choferSeleccionado.getPlaca());
                    } else {
                        // Si no es un Chofer, limpiar los JTextField
                        nombre_chofer.setText("");
                        telefono_chofer.setText("");
                        placa_unidad.setText("");
                    }
                }
            }
        });

        //Logica del servicio del flete
        combox_servicio.addActionListener(fleteEvent ->{
            String fleteSeleccionado = combox_servicio.getSelectedItem().toString();
            if (fleteSeleccionado.equals("Si")) {
                combox_tipo.setSelectedItem("Interno");
                // Habilitar campos de chofer interno
                combox_chofer.enable();
                combox_chofer_e.disable();
                costo_adicional.enable();
                // Deshabilitar campos para chofer externo
                nombre_chofer.disable();
                telefono_chofer.disable();
                placa_unidad.disable();
                combox_tipo.disable();
            }else if(fleteSeleccionado.equals("No")){
                combox_tipo.setSelectedItem("Externo");
                // Deshabilitar selección de chofer interno y costo adicional
                combox_chofer.disable();
                costo_adicional.disable();
                // Habilitar campos para chofer externo
                nombre_chofer.enable();
                telefono_chofer.enable();
                placa_unidad.enable();
                combox_tipo.disable();
                costo_adicional.setText("0.00");
                combox_chofer_e.enable();
            }else{
                combox_chofer.disable();
                costo_adicional.disable();
                nombre_chofer.disable();
                telefono_chofer.disable();
                placa_unidad.disable();
                combox_tipo.disable();
            }

        });  
        //
        name_material.addActionListener(e -> {
            // Obtener el ítem seleccionado
            Object selectedItem = name_material.getSelectedItem();
            // Verificar si el ítem seleccionado es la opción de "Seleccionar"
           if (selectedItem instanceof String && selectedItem.equals("--Seleccionar--")) {
                // Vaciar los campos de texto
                id_material.setText("");
                precioss.removeAllItems(); // Limpiar precios en el JComboBox
                stock.setText("");
                peso.setText("");
                peso_bruto.setText("");
                peso_tara1.setText("");
                descuento.setText("");
                //como esta en seleccionar que se desabilite
                peso_bruto.disable();
                peso_tara1.disable();
                descuento.disable();
                metodo_pago.disable();
                status.disable();
                observaciones.disable();   
            }                      
            // Si no es nulo y es una instancia de Material, llenar los campos
            else if (selectedItem instanceof Material) {
                Material selectedMaterial = (Material) selectedItem;
                id_material.setText(String.valueOf(selectedMaterial.getId_material())); // Mostrar el ID en el JTextField
                // Poblar el JComboBox con los 5 precios
                precioss.removeAllItems(); // Limpiar precios anteriores
                precioss.addItem(String.valueOf(selectedMaterial.getPrecio_compra()));
                precioss.addItem(String.valueOf(selectedMaterial.getPrecio_compra2()));
                precioss.addItem(String.valueOf(selectedMaterial.getPrecio_compra3()));
                precioss.addItem(String.valueOf(selectedMaterial.getPrecio_compra4()));
                precioss.addItem(String.valueOf(selectedMaterial.getPrecio_compra5()));
                precioss.addItem(String.valueOf(selectedMaterial.getPrecio_compra6()));
                //precio_kg1.setText(String.valueOf(selectedMaterial.getPrecio_compra()));
                stock.setText(String.valueOf(selectedMaterial.getCantidad_kg()));
                peso_bruto.enable();
                peso_tara1.enable();
                descuento.enable();
                metodo_pago.enable();
                status.enable();
                observaciones.enable();
                peso_bruto.requestFocusInWindow();//sirve para colocarte en ese textfield
                //costo_adicional.setText("0.00");
            }
        });
        if (usuarioActual != null) {
           // JOptionPane.showMessageDialog(null,"\"Apellido Paterno:"+ usuarioActual.getApellidoP());
            nombre_usuario.setText(usuarioActual.getNombre());
            apellido_paterno.setText(usuarioActual.getApellidoP());
            id_usuario.setText(String.valueOf(usuarioActual.getTelefono()));
        } else {
            JOptionPane.showMessageDialog(null, "El usuario actual es nulo");
        }
    }
    // Método para validar conexión a Internet
    private boolean hayConexionInternet() {
        try (Socket socket = new Socket()) {
            socket.connect(new InetSocketAddress("8.8.8.8", 53), 3000); // Conectar al DNS de Google
            return true;
        } catch (IOException e) {
            return false;
        }
    }
    //METODO PARA GENERA PDF
    public byte[] generarPDF(int folioCompra) {
    Connection con = null;
    try {
        // Verifica si el archivo Jasper existe
        File jasperFile = new File("src/reportes/Compras_No_Precio.jasper");
        if (!jasperFile.exists()) {
            JOptionPane.showMessageDialog(null, "Archivo .jasper no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        // Parámetros para el reporte Jasper
        Map<String, Object> parametros = new HashMap<>();
        parametros.put("folio_compra", folioCompra);

        // Conexión a la base de datos
        con = conexion.conectar();
        if (con == null) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        // Cargar el reporte compilado
        JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(jasperFile.getPath());

        // Llenar el reporte con datos
        JasperPrint jp = JasperFillManager.fillReport(jr, parametros, con);

        // Verificar si el reporte tiene datos
        if (jp.getPages().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El reporte no tiene datos para mostrar.", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        // Crear un ByteArrayOutputStream para almacenar el PDF en memoria
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        JasperExportManager.exportReportToPdfStream(jp, byteArrayOutputStream);

        // Convertir ByteArrayOutputStream a un arreglo de bytes
        byte[] pdfBytes = byteArrayOutputStream.toByteArray();

        // Verificar si los bytes generados son válidos
        if (pdfBytes == null || pdfBytes.length == 0) {
            JOptionPane.showMessageDialog(null, "El archivo PDF está vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        JOptionPane.showMessageDialog(null, "PDF generado exitosamente en memoria.");
        return pdfBytes;  // Devolver el arreglo de bytes
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al generar el PDF: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
        return null;
    } finally {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    }

    public void correo_electronico(byte[] pdfBytes, int folioCompra) {
    // Si pdfBytes es nulo o vacío, no continuar
    if (pdfBytes == null || pdfBytes.length == 0) {
        JOptionPane.showMessageDialog(null, "El archivo PDF está vacío o no se generó correctamente.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    // Configurar propiedades del servidor SMTP
    Properties props = new Properties();
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.starttls.enable", "true");
    props.put("mail.smtp.port", "587");
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.ssl.protocols", "TLSv1.2");

    // Configurar la cuenta de correo y autenticación
    String correoRemitente = "dannydominguez2701@gmail.com";
    String passwordRemitente = "ohkd bnsk faxx whaz"; // Reemplaza con tu contraseña o App Password

    String correoReceptor = correo.getText().trim(); // Toma el correo receptor desde un campo de texto y lo limpia

    // Validar que el correo del destinatario no esté vacío y tenga formato válido
    if (correoReceptor.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un correo electrónico válido.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        // Validar si hay conexión a Internet
        if (!hayConexionInternet()) {
            JOptionPane.showMessageDialog(null, "No hay conexión a Internet. Verifique su conexión. No se enviará el correo al proveedor.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Asunto del correo
        String asunto = "Compra en Refisa";
        
        // Crear el mensaje de texto sin el total
        String mensaje = "Estimado Proveedor,\n\nAdjunto el reporte de la compra realizada.\n\nGracias por visitarnos.";

        // Crear la sesión de autenticación
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(correoRemitente, passwordRemitente);
            }
        });

        // Crear el mensaje
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(correoRemitente));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(correoReceptor));
        message.setSubject(asunto);

        // Crear el contenido del mensaje
        MimeBodyPart textoParte = new MimeBodyPart();
        textoParte.setText(mensaje);
        // Crear la parte del archivo adjunto usando los bytes del PDF
        MimeBodyPart adjuntoParte = new MimeBodyPart();
        ByteArrayDataSource dataSource = new ByteArrayDataSource(pdfBytes, "application/pdf");
        adjuntoParte.setDataHandler(new DataHandler(dataSource));
        adjuntoParte.setFileName("ReporteCompra_Folio_" +   String.valueOf(folioCompra)  + ".pdf");
        // Combinar texto y adjunto
        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(textoParte);
        multipart.addBodyPart(adjuntoParte);
        // Asignar el contenido al mensaje
        message.setContent(multipart);
        // Enviar el mensaje
        Transport.send(message);
        JOptionPane.showMessageDialog(null, "Correo enviado exitosamente con el archivo adjunto.");
    } catch (AddressException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "La dirección de correo electrónico del destinatario no es válida.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (MessagingException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al enviar el correo. Verifique su conexión a Internet o la configuración de la cuenta.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Se ha producido un error inesperado: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }
}
