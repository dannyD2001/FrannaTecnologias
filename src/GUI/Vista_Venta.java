package GUI;
import Util.AppContext;
import com.formdev.flatlaf.FlatDarkLaf;
import controlador.ctrl_chofer;
import controlador.ctrl_cliente;
import controlador.ctrl_material;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import modelo.Cliente;
import modelo.Material;
import modelo.usuario;
public class Vista_Venta extends javax.swing.JFrame {
        //instanciando las clase
        ctrl_material Ctrl_mat = new ctrl_material();
        usuario usuario  = new usuario();
        usuario usuarioActual = AppContext.getUsuarioActual();
        Cliente cliente = new Cliente();
        ctrl_cliente Ctrl_cliente = new ctrl_cliente();
        
        ctrl_chofer chofer = new ctrl_chofer();
        
    public Vista_Venta() {
        // Aplica el tema oscuro de FlatLaf
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
        }
        initComponents();
        this.setTitle("VENTA");
        Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/compra1.png"));
        this.setIconImage(icono);
        this.setLocationRelativeTo(null);
        //para los botones de los jtextfield
        nombre_usuario.setBackground(new java.awt.Color(0,0,0,1));
        apellido_paterno.setBackground(new java.awt.Color(0,0,0,1));
        numero_telefonico.setBackground(new java.awt.Color(0,0,0,1));
        if(usuarioActual != null){
        nombre_usuario.setText(usuarioActual.getNombre());
        apellido_paterno.setText(usuarioActual.getApellidoP());
        numero_telefonico.setText(usuarioActual.getTelefono());
        }        
        //Agregar ActionListener a peso_tara1
        peso_tara.addActionListener(e -> calcularPesoNeto());
        // Agregar ActionListener a peso_bruto
        peso_bruto.addActionListener(e -> calcularPesoNeto());
        //cargar material al jcombox
        Ctrl_mat.bucarMaterial(name_material);
        Ctrl_cliente.bucarCliente(combox_cliente);
        
        //cargar el chofer
        chofer.bucarChofer(combox_chofer);
        //aca por defecto desabilamos casi todo 
        //como esta en seleccionar que se desabilite
                peso_bruto.disable();
                peso_tara.disable();
                descuento.disable();
                combox_TipoPago.disable();
                status.disable();
                observaciones.disable();
                combox_servicio.disable();
                combox_tipo.disable();
                combox_chofer.disable();
                nombre_chofer.disable();
                telefono_chofer.disable();
                placa_unidad.disable();
                costo_adicional.disable();
        ///segun el action listener del material
        name_material.addActionListener(e ->{
            Object selectedItem = name_material.getSelectedItem();
            // Verificar si el ítem seleccionado es la opción de "Seleccionar"
            if (selectedItem instanceof String && selectedItem.equals("--Seleccionar--")){
                // Vaciar los campos de texto
                codigo_material.setText("");
                combox_precio.removeAllItems(); // Limpiar precios en el JComboBox
                stock.setText("");
                peso_bruto.setText("");
                peso_tara.setText("");
                peso_neto.setText("");
                descuento.setText("");
                //como esta en seleccionar que se desabilite
                peso_bruto.disable();
                peso_tara.disable();
                descuento.disable();
                combox_TipoPago.disable();
                status.disable();
                observaciones.disable();
                combox_servicio.disable();
                combox_tipo.disable();
                combox_chofer.disable();
                nombre_chofer.disable();
                telefono_chofer.disable();
                combox_precio.disable();
                placa_unidad.disable();
                costo_adicional.disable();
            // Si no es nulo y es una instancia de Material, llenar los campos
            }else if(selectedItem instanceof Material){
                Material selectedMaterial = (Material) selectedItem;
                codigo_material.setText(String.valueOf(selectedMaterial.getId_material())); // Mostrar el ID en el JTextField
                // Poblar el JComboBox con los tres precios
                combox_precio.removeAllItems(); // Limpiar precios anteriores
                combox_precio.addItem(String.valueOf(selectedMaterial.getPrecio_venta()));
                combox_precio.addItem(String.valueOf(selectedMaterial.getPrecio_venta2()));
                combox_precio.addItem(String.valueOf(selectedMaterial.getPrecio_venta3()));
                stock.setText(String.valueOf(selectedMaterial.getCantidad_kg()));
                peso_bruto.enable();
                peso_tara.enable();
                descuento.enable();
                combox_TipoPago.enable();
                status.enable();
                observaciones.enable();
                nombre_chofer.enable();
                telefono_chofer.enable();
                placa_unidad.enable();
                costo_adicional.enable();
                combox_servicio.enable();
                combox_tipo.enable();
                combox_chofer.enable();
                combox_precio.enable();
                // Ahora agregamos la lógica del flete
                combox_servicio.addActionListener(fleteEvent ->{
                    String fleteSeleccionado = combox_servicio.getSelectedItem().toString();
                    if (fleteSeleccionado.equals("Si")) {
                        combox_tipo.setSelectedItem("Interno");
                        // Habilitar campos de chofer interno
                        combox_chofer.enable();
                        costo_adicional.enable();
                        // Deshabilitar campos para chofer externo
                        nombre_chofer.disable();
                        telefono_chofer.disable();
                        placa_unidad.disable();
                        combox_tipo.disable();
                    }else{
                        combox_tipo.setSelectedItem("Externo");
                        // Deshabilitar selección de chofer interno y costo adicional
                        combox_chofer.disable();
                        costo_adicional.disable();
                        // Habilitar campos para chofer externo
                        nombre_chofer.enable();
                        telefono_chofer.enable();
                        placa_unidad.enable();
                        combox_tipo.disable();
                    }
                
                });
                peso_tara.requestFocusInWindow();//sirve para colocarte en ese textfield  
            }
        });
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_principal = new javax.swing.JPanel();
        panel_barra = new javax.swing.JPanel();
        Txt_modulo = new javax.swing.JLabel();
        panel_atras = new swing.PanelRound();
        atras = new javax.swing.JLabel();
        panel_detalles = new javax.swing.JPanel();
        label_material = new javax.swing.JLabel();
        name_material = new javax.swing.JComboBox<>();
        label_nombre_chofer = new javax.swing.JLabel();
        label_telefono = new javax.swing.JLabel();
        label_placa = new javax.swing.JLabel();
        label_codigo_material = new javax.swing.JLabel();
        codigo_material = new javax.swing.JTextField();
        label_pesoTara = new javax.swing.JLabel();
        label_pesoBruto = new javax.swing.JLabel();
        label_pesoNeto = new javax.swing.JLabel();
        peso_tara = new javax.swing.JTextField();
        peso_bruto = new javax.swing.JTextField();
        peso_neto = new javax.swing.JTextField();
        label_precio = new javax.swing.JLabel();
        combox_precio = new javax.swing.JComboBox<>();
        label_seleccion_chofer = new javax.swing.JLabel();
        combox_tipo = new javax.swing.JComboBox<>();
        combox_chofer = new javax.swing.JComboBox<>();
        nombre_chofer = new javax.swing.JTextField();
        telefono_chofer = new javax.swing.JTextField();
        placa_unidad = new javax.swing.JTextField();
        label_stock = new javax.swing.JLabel();
        stock = new javax.swing.JTextField();
        label_costo = new javax.swing.JLabel();
        costo_adicional = new javax.swing.JTextField();
        label_servicio = new javax.swing.JLabel();
        panel_observaciones_descuento = new javax.swing.JPanel();
        observaciones = new javax.swing.JTextField();
        descuento = new javax.swing.JTextField();
        label_descuento = new javax.swing.JLabel();
        panel_pago = new javax.swing.JPanel();
        label_metodo_pago = new javax.swing.JLabel();
        combox_TipoPago = new javax.swing.JComboBox<>();
        status = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        combox_servicio = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panel_eliminar_filas = new javax.swing.JPanel();
        panel_eliminar = new swing.PanelRound();
        label_eliminar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_venta = new javax.swing.JTable();
        panel_importe = new javax.swing.JPanel();
        label_total_pagar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        label_total = new javax.swing.JLabel();
        panel_revisado_por = new javax.swing.JPanel();
        nombre_usuario = new javax.swing.JTextField();
        apellido_paterno = new javax.swing.JTextField();
        numero_telefonico = new javax.swing.JTextField();
        icon_usuario = new javax.swing.JLabel();
        panel_cliente = new javax.swing.JPanel();
        combox_cliente = new javax.swing.JComboBox<>();
        icon_cliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1350, 650));
        setMinimumSize(new java.awt.Dimension(1350, 650));
        setUndecorated(true);
        setResizable(false);

        panel_principal.setBackground(new java.awt.Color(48, 56, 65));
        panel_principal.setMaximumSize(new java.awt.Dimension(1350, 650));
        panel_principal.setMinimumSize(new java.awt.Dimension(1350, 650));
        panel_principal.setPreferredSize(new java.awt.Dimension(1350, 650));
        panel_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_barra.setBackground(new java.awt.Color(44, 62, 80));

        Txt_modulo.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        Txt_modulo.setForeground(new java.awt.Color(255, 255, 255));
        Txt_modulo.setText("Venta Granel");

        panel_atras.setBackground(new java.awt.Color(44, 62, 80));
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
            .addComponent(atras, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        panel_atrasLayout.setVerticalGroup(
            panel_atrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(atras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_barraLayout = new javax.swing.GroupLayout(panel_barra);
        panel_barra.setLayout(panel_barraLayout);
        panel_barraLayout.setHorizontalGroup(
            panel_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_barraLayout.createSequentialGroup()
                .addComponent(panel_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(495, 495, 495)
                .addComponent(Txt_modulo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 699, Short.MAX_VALUE))
        );
        panel_barraLayout.setVerticalGroup(
            panel_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_atras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Txt_modulo, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panel_principal.add(panel_barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 40));

        panel_detalles.setBackground(new java.awt.Color(48, 56, 65));
        panel_detalles.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10)))); // NOI18N

        label_material.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        label_material.setText("Nombre Material ");

        name_material.setBackground(new java.awt.Color(48, 56, 65));
        name_material.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        name_material.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        name_material.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_materialActionPerformed(evt);
            }
        });

        label_nombre_chofer.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        label_nombre_chofer.setText("Nombre del Chofer");

        label_telefono.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        label_telefono.setText("Telefono del Chofer");

        label_placa.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        label_placa.setText("Placa de la Unidad");

        label_codigo_material.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        label_codigo_material.setText("Codigo Material");

        codigo_material.setEditable(false);
        codigo_material.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        codigo_material.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        codigo_material.setBorder(null);
        codigo_material.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigo_materialActionPerformed(evt);
            }
        });

        label_pesoTara.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        label_pesoTara.setText("Peso Tara");

        label_pesoBruto.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        label_pesoBruto.setText("Peso Bruto");

        label_pesoNeto.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        label_pesoNeto.setText("Peso Neto");

        peso_tara.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N

        peso_bruto.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N

        peso_neto.setEditable(false);
        peso_neto.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N

        label_precio.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        label_precio.setText("Precio");

        combox_precio.setBackground(new java.awt.Color(48, 56, 65));
        combox_precio.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        combox_precio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_seleccion_chofer.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        label_seleccion_chofer.setText("Seleccione el Chofer");

        combox_tipo.setBackground(new java.awt.Color(48, 56, 65));
        combox_tipo.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        combox_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Externo", "Interno" }));
        combox_tipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combox_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combox_tipoActionPerformed(evt);
            }
        });

        combox_chofer.setBackground(new java.awt.Color(48, 56, 65));
        combox_chofer.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        combox_chofer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        nombre_chofer.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N

        telefono_chofer.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N

        placa_unidad.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        placa_unidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placa_unidadActionPerformed(evt);
            }
        });

        label_stock.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        label_stock.setText("Stock");

        stock.setEditable(false);
        stock.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        stock.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        stock.setBorder(null);
        stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockActionPerformed(evt);
            }
        });

        label_costo.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        label_costo.setText("Costo Adicional");

        costo_adicional.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        costo_adicional.setText("0.00");
        costo_adicional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                costo_adicionalMousePressed(evt);
            }
        });

        label_servicio.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        label_servicio.setText("Tipo Chofer");

        panel_observaciones_descuento.setBackground(new java.awt.Color(48, 56, 65));
        panel_observaciones_descuento.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Observaciones y Descuento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10)))); // NOI18N

        observaciones.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N

        descuento.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N

        label_descuento.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        label_descuento.setText("Descuento (%)");

        javax.swing.GroupLayout panel_observaciones_descuentoLayout = new javax.swing.GroupLayout(panel_observaciones_descuento);
        panel_observaciones_descuento.setLayout(panel_observaciones_descuentoLayout);
        panel_observaciones_descuentoLayout.setHorizontalGroup(
            panel_observaciones_descuentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_observaciones_descuentoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(label_descuento)
                .addGap(5, 5, 5)
                .addComponent(descuento, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        panel_observaciones_descuentoLayout.setVerticalGroup(
            panel_observaciones_descuentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_observaciones_descuentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_observaciones_descuentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descuento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_descuento))
                .addGap(5, 5, 5))
        );

        panel_pago.setBackground(new java.awt.Color(48, 56, 65));
        panel_pago.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle Pago", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10))); // NOI18N

        label_metodo_pago.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        label_metodo_pago.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_metodo_pago.setText("Metodo Pago");
        label_metodo_pago.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        combox_TipoPago.setBackground(new java.awt.Color(48, 56, 65));
        combox_TipoPago.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        combox_TipoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Transferencia", "Efectivo" }));
        combox_TipoPago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combox_TipoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combox_TipoPagoActionPerformed(evt);
            }
        });

        status.setBackground(new java.awt.Color(48, 56, 65));
        status.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendiente", "Pagado" }));
        status.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel2.setText("Estatus");

        javax.swing.GroupLayout panel_pagoLayout = new javax.swing.GroupLayout(panel_pago);
        panel_pago.setLayout(panel_pagoLayout);
        panel_pagoLayout.setHorizontalGroup(
            panel_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_pagoLayout.createSequentialGroup()
                .addComponent(label_metodo_pago)
                .addGap(1, 1, 1)
                .addComponent(combox_TipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        panel_pagoLayout.setVerticalGroup(
            panel_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_pagoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combox_TipoPago)
                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label_metodo_pago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-weight-kg-24.png"))); // NOI18N

        combox_servicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Si" }));
        combox_servicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setText("Servicio Flete");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/money.png"))); // NOI18N

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-weight-kg-24.png"))); // NOI18N

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-weight-kg-24.png"))); // NOI18N

        javax.swing.GroupLayout panel_detallesLayout = new javax.swing.GroupLayout(panel_detalles);
        panel_detalles.setLayout(panel_detallesLayout);
        panel_detallesLayout.setHorizontalGroup(
            panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_detallesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panel_detallesLayout.createSequentialGroup()
                        .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name_material, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_material))
                        .addGap(43, 43, 43)
                        .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_codigo_material, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_detallesLayout.createSequentialGroup()
                                .addComponent(codigo_material, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, 0)
                        .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_pesoTara, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_detallesLayout.createSequentialGroup()
                                .addComponent(peso_tara, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_pesoBruto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_detallesLayout.createSequentialGroup()
                                .addComponent(peso_bruto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel_detallesLayout.createSequentialGroup()
                        .addComponent(panel_observaciones_descuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combox_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combox_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_detallesLayout.createSequentialGroup()
                        .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(peso_neto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_pesoNeto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_detallesLayout.createSequentialGroup()
                                .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(label_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_detallesLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_detallesLayout.createSequentialGroup()
                                .addComponent(label_seleccion_chofer, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(label_nombre_chofer))
                            .addGroup(panel_detallesLayout.createSequentialGroup()
                                .addComponent(combox_chofer, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(nombre_chofer, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_detallesLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefono_chofer, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_telefono))
                        .addGap(35, 35, 35)
                        .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_placa)
                            .addComponent(placa_unidad, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_costo)
                            .addComponent(costo_adicional, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_detallesLayout.createSequentialGroup()
                        .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combox_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(panel_pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );
        panel_detallesLayout.setVerticalGroup(
            panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_detallesLayout.createSequentialGroup()
                .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panel_detallesLayout.createSequentialGroup()
                            .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(label_material)
                                .addComponent(label_codigo_material)
                                .addComponent(label_pesoTara)
                                .addComponent(label_pesoBruto)
                                .addComponent(label_pesoNeto)
                                .addComponent(label_precio)
                                .addComponent(label_stock))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(peso_tara, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combox_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name_material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(codigo_material, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(peso_neto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(peso_bruto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_detallesLayout.createSequentialGroup()
                        .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_detallesLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_placa)
                                    .addComponent(label_costo)))
                            .addGroup(panel_detallesLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_telefono)
                                    .addComponent(label_nombre_chofer)
                                    .addComponent(label_seleccion_chofer)
                                    .addComponent(label_servicio)
                                    .addComponent(jLabel4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(telefono_chofer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(placa_unidad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(costo_adicional, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(combox_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(combox_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(combox_chofer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nombre_chofer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_detallesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel_observaciones_descuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        panel_principal.add(panel_detalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 1210, 160));

        panel_eliminar_filas.setBackground(new java.awt.Color(48, 56, 65));
        panel_eliminar_filas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eliminar Fila", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10)))); // NOI18N

        panel_eliminar.setBackground(new java.awt.Color(106, 154, 176));
        panel_eliminar.setRoundBottomLeft(20);
        panel_eliminar.setRoundBottomRight(20);
        panel_eliminar.setRoundTopLeft(20);
        panel_eliminar.setRoundTopRight(20);

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
        });

        javax.swing.GroupLayout panel_eliminarLayout = new javax.swing.GroupLayout(panel_eliminar);
        panel_eliminar.setLayout(panel_eliminarLayout);
        panel_eliminarLayout.setHorizontalGroup(
            panel_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );
        panel_eliminarLayout.setVerticalGroup(
            panel_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_eliminar_filasLayout = new javax.swing.GroupLayout(panel_eliminar_filas);
        panel_eliminar_filas.setLayout(panel_eliminar_filasLayout);
        panel_eliminar_filasLayout.setHorizontalGroup(
            panel_eliminar_filasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_eliminar_filasLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(panel_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        panel_eliminar_filasLayout.setVerticalGroup(
            panel_eliminar_filasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_eliminar_filasLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(panel_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        panel_principal.add(panel_eliminar_filas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 60, 100, 150));

        tabla_venta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Material", "Material", "Peso Tara(Kg)", "Peso Bruto(Kg)", "Peso Neto(Kg)", "Descuento(Kg)", "Descuento(%)", "PesoNetoDescuento", "Precio(Kg)", "Observaciones", "Flete", "Costo Flete", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_venta);
        if (tabla_venta.getColumnModel().getColumnCount() > 0) {
            tabla_venta.getColumnModel().getColumn(0).setResizable(false);
            tabla_venta.getColumnModel().getColumn(1).setResizable(false);
            tabla_venta.getColumnModel().getColumn(2).setResizable(false);
            tabla_venta.getColumnModel().getColumn(3).setResizable(false);
        }

        panel_principal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 1310, 260));

        panel_importe.setBackground(new java.awt.Color(48, 56, 65));
        panel_importe.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Importe", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10)))); // NOI18N

        label_total_pagar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label_total_pagar.setText("Total a Pagar");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("IVA");

        label_total.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label_total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_total.setText("$ 00.00");

        javax.swing.GroupLayout panel_importeLayout = new javax.swing.GroupLayout(panel_importe);
        panel_importe.setLayout(panel_importeLayout);
        panel_importeLayout.setHorizontalGroup(
            panel_importeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_importeLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panel_importeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_total_pagar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(label_total, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_importeLayout.setVerticalGroup(
            panel_importeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_importeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_importeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_total_pagar, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addContainerGap())
        );

        panel_principal.add(panel_importe, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 510, 220, 130));

        panel_revisado_por.setBackground(new java.awt.Color(48, 56, 65));
        panel_revisado_por.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Revisado Por", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10)))); // NOI18N

        nombre_usuario.setFont(new java.awt.Font("Berlin Sans FB", 0, 10)); // NOI18N
        nombre_usuario.setBorder(null);

        apellido_paterno.setFont(new java.awt.Font("Berlin Sans FB", 0, 10)); // NOI18N
        apellido_paterno.setBorder(null);

        numero_telefonico.setFont(new java.awt.Font("Berlin Sans FB", 0, 10)); // NOI18N
        numero_telefonico.setBorder(null);

        icon_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/UsuarioPngtree.png"))); // NOI18N
        icon_usuario.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout panel_revisado_porLayout = new javax.swing.GroupLayout(panel_revisado_por);
        panel_revisado_por.setLayout(panel_revisado_porLayout);
        panel_revisado_porLayout.setHorizontalGroup(
            panel_revisado_porLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_revisado_porLayout.createSequentialGroup()
                .addComponent(icon_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombre_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(apellido_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(numero_telefonico, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_revisado_porLayout.setVerticalGroup(
            panel_revisado_porLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_revisado_porLayout.createSequentialGroup()
                .addGroup(panel_revisado_porLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_revisado_porLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_revisado_porLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellido_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numero_telefonico, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(icon_usuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panel_principal.add(panel_revisado_por, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 270, 60));

        panel_cliente.setBackground(new java.awt.Color(48, 56, 65));
        panel_cliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10)))); // NOI18N

        combox_cliente.setBackground(new java.awt.Color(48, 56, 65));
        combox_cliente.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        combox_cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        icon_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon-clientes-24.png"))); // NOI18N

        javax.swing.GroupLayout panel_clienteLayout = new javax.swing.GroupLayout(panel_cliente);
        panel_cliente.setLayout(panel_clienteLayout);
        panel_clienteLayout.setHorizontalGroup(
            panel_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_clienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_cliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combox_cliente, 0, 180, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_clienteLayout.setVerticalGroup(
            panel_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_clienteLayout.createSequentialGroup()
                .addComponent(combox_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_clienteLayout.createSequentialGroup()
                .addComponent(icon_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_principal.add(panel_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 560, 250, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseClicked
        Menu_Vista_Venta menu_vista = new Menu_Vista_Venta();
        menu_vista.setVisible(true);
        menu_vista.setLocationRelativeTo(null);
        //cerrar procesos que quedaron anteriormente
        this.dispose();
    }//GEN-LAST:event_atrasMouseClicked

    private void atrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseEntered
        // TODO add your handling code here: 999999
        panel_atras.setBackground(new Color(0x1e2b38));
        atras.setForeground(Color.WHITE);
    }//GEN-LAST:event_atrasMouseEntered

    private void atrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseExited
        // TODO add your handling code here:
        panel_atras.setBackground(new Color(0x2C3E50));
        atras.setForeground(Color.BLACK);
    }//GEN-LAST:event_atrasMouseExited

    private void combox_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combox_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combox_tipoActionPerformed

    private void stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockActionPerformed

    private void codigo_materialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigo_materialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigo_materialActionPerformed

    private void name_materialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_materialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_materialActionPerformed

    private void placa_unidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placa_unidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placa_unidadActionPerformed

    private void combox_TipoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combox_TipoPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combox_TipoPagoActionPerformed

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
    private boolean limpiado = false;
    private void costo_adicionalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_costo_adicionalMousePressed
        // TODO add your handling code here:
        // Verificar si el campo ha sido limpiado antes
       if(!limpiado){
           //limpiar el texto
           if(!costo_adicional.getText().equals("")){
               costo_adicional.setText("");
           }
           limpiado = true;
       }                       
    }//GEN-LAST:event_costo_adicionalMousePressed

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
            java.util.logging.Logger.getLogger(Vista_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Vista_Venta venta = new Vista_Venta();
                venta.setVisible(true);
                venta.setLocationRelativeTo(null);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Txt_modulo;
    private javax.swing.JTextField apellido_paterno;
    private javax.swing.JLabel atras;
    private javax.swing.JTextField codigo_material;
    private javax.swing.JComboBox<String> combox_TipoPago;
    private javax.swing.JComboBox<String> combox_chofer;
    private javax.swing.JComboBox<String> combox_cliente;
    private javax.swing.JComboBox<String> combox_precio;
    private javax.swing.JComboBox<String> combox_servicio;
    private javax.swing.JComboBox<String> combox_tipo;
    private javax.swing.JTextField costo_adicional;
    private javax.swing.JTextField descuento;
    private javax.swing.JLabel icon_cliente;
    private javax.swing.JLabel icon_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_codigo_material;
    private javax.swing.JLabel label_costo;
    private javax.swing.JLabel label_descuento;
    private javax.swing.JLabel label_eliminar;
    private javax.swing.JLabel label_material;
    private javax.swing.JLabel label_metodo_pago;
    private javax.swing.JLabel label_nombre_chofer;
    private javax.swing.JLabel label_pesoBruto;
    private javax.swing.JLabel label_pesoNeto;
    private javax.swing.JLabel label_pesoTara;
    private javax.swing.JLabel label_placa;
    private javax.swing.JLabel label_precio;
    private javax.swing.JLabel label_seleccion_chofer;
    private javax.swing.JLabel label_servicio;
    private javax.swing.JLabel label_stock;
    private javax.swing.JLabel label_telefono;
    private javax.swing.JLabel label_total;
    private javax.swing.JLabel label_total_pagar;
    private javax.swing.JComboBox<String> name_material;
    private javax.swing.JTextField nombre_chofer;
    private javax.swing.JTextField nombre_usuario;
    private javax.swing.JTextField numero_telefonico;
    private javax.swing.JTextField observaciones;
    private swing.PanelRound panel_atras;
    private javax.swing.JPanel panel_barra;
    private javax.swing.JPanel panel_cliente;
    private javax.swing.JPanel panel_detalles;
    private swing.PanelRound panel_eliminar;
    private javax.swing.JPanel panel_eliminar_filas;
    private javax.swing.JPanel panel_importe;
    private javax.swing.JPanel panel_observaciones_descuento;
    private javax.swing.JPanel panel_pago;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JPanel panel_revisado_por;
    private javax.swing.JTextField peso_bruto;
    private javax.swing.JTextField peso_neto;
    private javax.swing.JTextField peso_tara;
    private javax.swing.JTextField placa_unidad;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JTextField stock;
    private javax.swing.JTable tabla_venta;
    private javax.swing.JTextField telefono_chofer;
    // End of variables declaration//GEN-END:variables
    // Método para calcular el peso neto es de ayuda para luego tenerlo 
    private void calcularPesoNeto() {
    try {
        // Obtener los valores de los campos de peso bruto y peso tara
        double pesoBruto = Double.parseDouble(peso_bruto.getText().trim());
        double pesoTara = Double.parseDouble(peso_tara.getText().trim());

        // Comprobar si el peso bruto es menor que el peso tara
        if (pesoBruto < pesoTara) {
            JOptionPane.showMessageDialog(this, "Error: El peso bruto no puede ser menor que el peso tara.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            // Limpiar los campos o establecer el foco en uno de ellos si es necesario
            peso_tara.requestFocus();
            return;
        } else {
            // Si la condición es válida, calcular el peso neto
            double pesoNeto = pesoBruto - pesoTara;
            peso_neto.setText(String.valueOf(pesoNeto)); // Mostrar el resultado en el campo "peso"
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, Complete todos los campos", "Error de entrada", JOptionPane.ERROR_MESSAGE);
    }
    }
}
