package GUI;
import Util.AppContext;
import com.formdev.flatlaf.FlatDarkLaf;
import controlador.ctrl_chofer;
import controlador.ctrl_cliente;
import controlador.ctrl_material;
import controlador.ctrl_usuario;
import controlador.ctrl_vehiculo;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import modelo.Chofer;
import modelo.Cliente;
import modelo.DetalleVenta;
import modelo.Material;
import modelo.Venta;
import modelo.usuario;
import controlador.ctrl_venta;
import java.awt.Component;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import modelo.Vehiculo;
    public class Vista_Venta extends javax.swing.JFrame {
        //iconos
        Icon error;
        Icon correcto;   
        //instanciando las clase
        ctrl_material Ctrl_mat = new ctrl_material();
        usuario usuario  = new usuario();
        usuario usuarioActual = AppContext.getUsuarioActual();
        Cliente cliente = new Cliente();
        ctrl_cliente Ctrl_cliente = new ctrl_cliente();
        ctrl_venta ctrlVenta = new ctrl_venta();
        ctrl_chofer chofer = new ctrl_chofer();
        double TotalPagar = 0.00;
        ctrl_vehiculo ctrlVehiculo = new ctrl_vehiculo();
        Vehiculo auto = new Vehiculo();
    public Vista_Venta() {
        // Aplica el tema oscuro de FlatLaf
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
        }
        initComponents();
        borrar_bordes();
        utilidades();
        personalizar_tabla();
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
        combox_tipo.disable();
        // Ahora La lógica del flete
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
                costo_adicional.setText("0.00");
            }

        });  
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
               // combox_servicio.disable();
                combox_tipo.disable();
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
                combox_servicio.enable();              
                combox_precio.enable();                
                peso_tara.requestFocusInWindow();//sirve para colocarte en ese textfield  
            }
        });               
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_secundario = new javax.swing.JPanel();
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
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
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
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        panel_eliminar_filas = new javax.swing.JPanel();
        panel_eliminar = new swing.PanelRound();
        label_eliminar = new javax.swing.JLabel();
        scroll_venta = new javax.swing.JScrollPane();
        tabla_venta = new javax.swing.JTable();
        panel_importe = new javax.swing.JPanel();
        label_total_pagar = new javax.swing.JLabel();
        label_total = new javax.swing.JLabel();
        panel_revisado_por = new javax.swing.JPanel();
        nombre_usuario = new javax.swing.JTextField();
        apellido_paterno = new javax.swing.JTextField();
        numero_telefonico = new javax.swing.JTextField();
        icon_usuario = new javax.swing.JLabel();
        panel_cliente = new javax.swing.JPanel();
        combox_cliente = new javax.swing.JComboBox<>();
        icon_cliente = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1350, 650));
        setMinimumSize(new java.awt.Dimension(1350, 650));
        setUndecorated(true);
        setResizable(false);

        panel_secundario.setBackground(new java.awt.Color(48, 56, 65));
        panel_secundario.setMaximumSize(new java.awt.Dimension(1350, 650));
        panel_secundario.setMinimumSize(new java.awt.Dimension(1350, 650));
        panel_secundario.setPreferredSize(new java.awt.Dimension(1350, 650));
        panel_secundario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        panel_secundario.add(panel_barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 40));

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
        label_nombre_chofer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_nombre_chofer.setText("Nombre Chofer");

        label_telefono.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        label_telefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_telefono.setText("Teléfono del Chofer");

        label_placa.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        label_placa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_placa.setText("Placa de la Unidad");

        label_codigo_material.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        label_codigo_material.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
        label_pesoTara.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_pesoTara.setText("Peso Tara");

        label_pesoBruto.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        label_pesoBruto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_pesoBruto.setText("Peso Bruto");

        label_pesoNeto.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        label_pesoNeto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_pesoNeto.setText("Peso Neto");

        peso_tara.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        peso_tara.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        peso_tara.setBorder(null);

        peso_bruto.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        peso_bruto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        peso_bruto.setBorder(null);

        peso_neto.setEditable(false);
        peso_neto.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        peso_neto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        peso_neto.setBorder(null);

        label_precio.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        label_precio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_precio.setText("Precio");

        combox_precio.setBackground(new java.awt.Color(48, 56, 65));
        combox_precio.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        combox_precio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_seleccion_chofer.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        label_seleccion_chofer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
        nombre_chofer.setBorder(null);

        telefono_chofer.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        telefono_chofer.setBorder(null);
        telefono_chofer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                telefono_choferKeyPressed(evt);
            }
        });

        placa_unidad.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        placa_unidad.setBorder(null);
        placa_unidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placa_unidadActionPerformed(evt);
            }
        });

        label_stock.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        label_stock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
        costo_adicional.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        costo_adicional.setText("0.00");
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

        label_servicio.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        label_servicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_servicio.setText("Tipo Chofer");

        panel_observaciones_descuento.setBackground(new java.awt.Color(48, 56, 65));
        panel_observaciones_descuento.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Observaciones y Descuento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10)))); // NOI18N

        observaciones.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        observaciones.setBorder(null);

        descuento.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        descuento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        descuento.setBorder(null);
        descuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                descuentoKeyPressed(evt);
            }
        });

        label_descuento.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        label_descuento.setText("Descuento (%)");

        javax.swing.GroupLayout panel_observaciones_descuentoLayout = new javax.swing.GroupLayout(panel_observaciones_descuento);
        panel_observaciones_descuento.setLayout(panel_observaciones_descuentoLayout);
        panel_observaciones_descuentoLayout.setHorizontalGroup(
            panel_observaciones_descuentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_observaciones_descuentoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(panel_observaciones_descuentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator9)
                    .addComponent(observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(label_descuento)
                .addGap(5, 5, 5)
                .addGroup(panel_observaciones_descuentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator8)
                    .addComponent(descuento, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panel_observaciones_descuentoLayout.setVerticalGroup(
            panel_observaciones_descuentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_observaciones_descuentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_observaciones_descuentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descuento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_descuento))
                .addGap(0, 0, 0)
                .addGroup(panel_observaciones_descuentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                    .addComponent(jSeparator8)))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        combox_servicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "No", "Si" }));
        combox_servicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
                .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_detallesLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name_material, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_material))
                        .addGap(40, 40, 40)
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
                                .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(peso_tara, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                                .addGap(4, 4, 4)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_pesoBruto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_detallesLayout.createSequentialGroup()
                                .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(peso_bruto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                                .addGap(4, 4, 4)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel_detallesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel_observaciones_descuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combox_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combox_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_detallesLayout.createSequentialGroup()
                        .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_detallesLayout.createSequentialGroup()
                                .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(peso_neto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_pesoNeto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_detallesLayout.createSequentialGroup()
                                        .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(label_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel_detallesLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combox_chofer, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_seleccion_chofer, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefono_chofer, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_telefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_detallesLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombre_chofer, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_nombre_chofer, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(placa_unidad, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)))
                            .addGroup(panel_detallesLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combox_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel_detallesLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(costo_adicional, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_costo, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panel_detallesLayout.setVerticalGroup(
            panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_detallesLayout.createSequentialGroup()
                .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_detallesLayout.createSequentialGroup()
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
                                        .addComponent(peso_tara, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(combox_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(name_material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(codigo_material, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(peso_neto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(peso_bruto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator6)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_detallesLayout.createSequentialGroup()
                        .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_detallesLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_telefono)
                                    .addComponent(label_nombre_chofer)
                                    .addComponent(label_seleccion_chofer)
                                    .addComponent(label_servicio)
                                    .addComponent(jLabel4)
                                    .addComponent(label_placa)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_detallesLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_costo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(costo_adicional, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combox_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(combox_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(combox_chofer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telefono_chofer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nombre_chofer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(placa_unidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, 0)
                        .addGroup(panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_detallesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel_observaciones_descuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        panel_secundario.add(panel_detalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 1210, 180));

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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                label_eliminarMousePressed(evt);
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

        panel_secundario.add(panel_eliminar_filas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 60, 100, 150));

        tabla_venta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Material", "Material", "Peso Tara(Kg)", "Peso Bruto(Kg)", "Peso Neto(Kg)", "Descuento(Kg)", "Descuento(%)", "PesoNetoDescuento", "Precio(Kg)", "Observaciones", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scroll_venta.setViewportView(tabla_venta);
        if (tabla_venta.getColumnModel().getColumnCount() > 0) {
            tabla_venta.getColumnModel().getColumn(0).setResizable(false);
            tabla_venta.getColumnModel().getColumn(1).setResizable(false);
            tabla_venta.getColumnModel().getColumn(2).setResizable(false);
            tabla_venta.getColumnModel().getColumn(3).setResizable(false);
            tabla_venta.getColumnModel().getColumn(4).setResizable(false);
            tabla_venta.getColumnModel().getColumn(5).setResizable(false);
            tabla_venta.getColumnModel().getColumn(6).setResizable(false);
            tabla_venta.getColumnModel().getColumn(7).setResizable(false);
            tabla_venta.getColumnModel().getColumn(8).setResizable(false);
            tabla_venta.getColumnModel().getColumn(9).setResizable(false);
            tabla_venta.getColumnModel().getColumn(10).setResizable(false);
        }

        panel_secundario.add(scroll_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 1310, 290));

        panel_importe.setBackground(new java.awt.Color(48, 56, 65));
        panel_importe.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Importe", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10)))); // NOI18N

        label_total_pagar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label_total_pagar.setText("Total a Pagar");

        label_total.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label_total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_total.setText("$ 00.00");

        javax.swing.GroupLayout panel_importeLayout = new javax.swing.GroupLayout(panel_importe);
        panel_importe.setLayout(panel_importeLayout);
        panel_importeLayout.setHorizontalGroup(
            panel_importeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_importeLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(label_total_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(label_total, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_importeLayout.setVerticalGroup(
            panel_importeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_importeLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(panel_importeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_total_pagar, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addContainerGap())
        );

        panel_secundario.add(panel_importe, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 550, 220, 90));

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

        panel_secundario.add(panel_revisado_por, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 270, 60));

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

        panel_secundario.add(panel_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 560, 250, 60));

        jButton1.setText("VENTA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel_secundario.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 580, 120, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panel_secundario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panel_secundario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void descuentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descuentoKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
        DefaultTableModel modelo = (DefaultTableModel) tabla_venta.getModel();
        
        // Verificar que todos los campos necesarios no estén vacíos
        if (!codigo_material.getText().trim().isEmpty() &&
            combox_precio.getSelectedItem() != null &&
            !peso_bruto.getText().trim().isEmpty() &&
            !peso_tara.getText().trim().isEmpty() &&
            !peso_neto.getText().trim().isEmpty() &&
            !descuento.getText().trim().isEmpty()) {
            try {
                String observacioness = observaciones.getText().trim();
                
                if (name_material.getSelectedItem() == null) {                        
                    JOptionPane.showMessageDialog(null, "Por favor!! Seleccione un material");
                    return;
                }
                
                // Inicializador después del enter
                peso_tara.requestFocus(); 
                
                // Obtener datos del material
                Material selectedMaterial = (Material) name_material.getSelectedItem();
                int idMaterial = selectedMaterial.getId_material(); 
                String nombreMaterial = selectedMaterial.getNombre_material();
                
                // Obtener valores de los campos
                double pesoBruto = Double.parseDouble(peso_bruto.getText().trim());
                double pesoTara = Double.parseDouble(peso_tara.getText().trim());
                double pesoNeto = pesoBruto - pesoTara;
                double precio = Double.parseDouble(combox_precio.getSelectedItem().toString().trim());
                double descuentoPorcentaje = Double.parseDouble(descuento.getText().trim());
                
                // Calcular el peso descontado y el peso con descuento
                double pesoDescontado = pesoNeto * (descuentoPorcentaje / 100.0);
                pesoDescontado = Math.round(pesoDescontado * 100.0) / 100.0;
                double pesoConDescuento = pesoNeto - pesoDescontado;
                
                // Calcular el subtotal
                double subtotal = pesoConDescuento * precio;
                double subtotalConDosDecimales = Math.round(subtotal * 100.0) / 100.0;

                // Obtener el stock disponible del campo correspondiente
                double stockDisponible = Double.parseDouble(stock.getText().trim());
                
                // Validación: verificar si el peso neto supera el stock disponible
                if (pesoNeto > stockDisponible) {
                    JOptionPane.showMessageDialog(null, "Stock insuficiente. No se puede agregar a la tabla.", "Stock insuficiente", JOptionPane.WARNING_MESSAGE);
                    return; // No agregar la fila y salir de la función
                }
                
                // Crear un array con los valores de la fila
                Object[] fila = new Object[11];
                fila[0] = idMaterial;
                fila[1] = nombreMaterial;
                fila[2] = pesoBruto;
                fila[3] = pesoTara;
                fila[4] = pesoNeto;
                fila[5] = pesoDescontado;
                fila[6] = descuentoPorcentaje;
                fila[7] = pesoConDescuento;
                fila[8] = precio;
                fila[9] = observacioness;
                fila[10] = subtotalConDosDecimales;
                
                // Agregar la fila al modelo de la tabla
                modelo.insertRow(0, fila);
                tabla_venta.setModel(modelo);
                
                // Limpiar los campos luego de agregar a la tabla
                limpiar();
                total_pagar();
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese valores válidos en los campos numéricos.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
        }
    } 
        
    }//GEN-LAST:event_descuentoKeyPressed

    private void label_eliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_eliminarMousePressed
        // TODO add your handling code here:
            // TODO add your handling code here:
        try {
        DefaultTableModel modelo = (DefaultTableModel) tabla_venta.getModel();
        int selectedRow = tabla_venta.getSelectedRow(); // Verificar la fila seleccionada        
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

    private void costo_adicionalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_costo_adicionalKeyReleased
        // TODO add your handling code here:
        total_pagar();
    }//GEN-LAST:event_costo_adicionalKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ctrl_material material = new ctrl_material();
        RegistrarVenta();
        material.bucarMaterial(name_material);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void costo_adicionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costo_adicionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costo_adicionalActionPerformed

    private void telefono_choferKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefono_choferKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) { // Detectar Enter
        String telefono = telefono_chofer.getText().trim();
        ctrl_chofer controlador = new ctrl_chofer();
        Chofer chofer = controlador.buscarChofer(telefono);
        if (chofer != null) {
            nombre_chofer.setText(chofer.getNombre());
            //apellido_chofer.setText(chofer.getApellido_p());
            placa_unidad.setText(chofer.getPlaca());
        }
        }
    }//GEN-LAST:event_telefono_choferKeyPressed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
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
    private javax.swing.JPanel panel_revisado_por;
    private javax.swing.JPanel panel_secundario;
    private javax.swing.JTextField peso_bruto;
    private javax.swing.JTextField peso_neto;
    private javax.swing.JTextField peso_tara;
    private javax.swing.JTextField placa_unidad;
    private javax.swing.JScrollPane scroll_venta;
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
    
    private void limpiar(){
        name_material.setSelectedIndex(0);                
        codigo_material.setText("");
        //combox_precio.setSelectedIndex(0); 
        peso_neto.setText("");
        peso_bruto.setText("");
        peso_tara.setText("");
        descuento.setText("");
        observaciones.setText("");
    }
    // total aplicado el flete
    private void total_pagar() {
    TotalPagar = 0.00;
    int numfila = tabla_venta.getRowCount();

    // Sumar los valores de la columna "Precio Total" de la tabla
    for (int i = 0; i < numfila; i++) {
        try {
            Object valor = tabla_venta.getModel().getValueAt(i, 10);
            if (valor != null && !valor.toString().isEmpty()) {
                double calcular = Double.parseDouble(valor.toString());
                TotalPagar += calcular;
            }
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir el valor a double: " + e.getMessage());
        }
    }

    // Agregar el Costo Adicional al TotalPagar solo si no está vacío y es un número válido
    String costoAdicionalText = costo_adicional.getText(); // Asegúrate de que "costo_adicional" es el nombre correcto del campo de texto
    if (costoAdicionalText != null && !costoAdicionalText.isEmpty() && !costoAdicionalText.equals(".")) {
        try {
            // Verificar si el valor es un número decimal válido
            if (costoAdicionalText.matches("^[0-9]+(\\.[0-9]+)?$")) {
                double costoAdicional = Double.parseDouble(costoAdicionalText);
                TotalPagar += costoAdicional;
            } else {
                // Mostrar un mensaje de advertencia al usuario si el formato no es válido
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor numérico válido para el costo adicional.", "Valor inválido", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error al convertir el costo adicional a número: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Asegurarse de que el total no sea negativo
    if (TotalPagar < 0) {
        TotalPagar = 0.00;
    }

    // Actualizar el JLabel con el total formateado
    label_total.setText(String.format("%,.2f", TotalPagar));
    }
    ///en prueba
    private void RegistrarVenta() {
    try {
        // Verificar que haya productos en la tabla de ventas
        if (tabla_venta.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No hay productos para registrar la venta. Asegúrese de agregar productos a la tabla.", "Mensaje", JOptionPane.WARNING_MESSAGE);
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
            // Verificar que se haya seleccionado un chofer
            if (combox_chofer.getSelectedItem() == null || combox_chofer.getSelectedItem().toString().equals("--Seleccionar--")) {
                JOptionPane.showMessageDialog(null, "Seleccione un chofer.", "Mensaje", JOptionPane.WARNING_MESSAGE);
                return;
            }
            // Verificar que el campo de "Costo Adicional" tenga un valor válido
            String costoAdicionalStr = costo_adicional.getText().trim();
            if (costoAdicionalStr.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese un costo adicional válido", "Mensaje", JOptionPane.WARNING_MESSAGE);
                return;
            }

        } else if (servicioFlete.equals("No")) {
            // Verificar que los campos de "Nombre del Chofer", "Teléfono del Chofer", y "Placa de la Unidad" estén llenos
            if (nombre_chofer.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese el nombre del chofer.", "Mensaje", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (telefono_chofer.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese el teléfono del chofer.", "Mensaje", JOptionPane.WARNING_MESSAGE);
                return;
            }
            /*if (placa_unidad.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese la placa de la unidad.", "Mensaje", JOptionPane.WARNING_MESSAGE);
                return;
            }*/            
        }
        // Confirmar si se desea realizar la venta
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Desea realizar la venta?", "Confirmar Venta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (confirmacion != JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Venta cancelada.", "Cancelar", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        // Obtener el nombre de usuario
        String nombreUsuario = nombre_usuario.getText();
        ctrl_usuario ctrlUsu = new ctrl_usuario();
        String telefonoUsuario = ctrlUsu.obtenerusuarioPorNombre(nombreUsuario);
        if (telefonoUsuario == null) {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
            return; 
        }

        // Obtener nombre del cliente desde el ComboBox 
        String nombreCliente = combox_cliente.getSelectedItem().toString();
        ctrl_cliente ctrlCliente = new ctrl_cliente();
        int idCliente = ctrlCliente.obtenerIdClientePorNombre(nombreCliente);
        
        if (idCliente == -1) {
            JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
            return;
            }
        // Obtener datos del chofer
        String tipoChofer = combox_tipo.getSelectedItem().toString();
        String telefonoChofer = null;
        String placaVehiculo = null;
        ctrl_chofer ctrlChofer = new ctrl_chofer();
        ctrl_vehiculo ctrlVehiculo = new ctrl_vehiculo();

        if (tipoChofer.equals("Interno")) {
            // Manejo de chofer interno
            String nombreChofer = combox_chofer.getSelectedItem().toString();
            telefonoChofer = ctrlChofer.obtenerTelefonoChoferInternoPorNombre(nombreChofer);
            if (telefonoChofer == null) {
                JOptionPane.showMessageDialog(null, "Chofer interno no encontrado.");
                return;
            }
        } else {
            // Manejo de chofer externo
            String nombreChofer = capitalize(nombre_chofer.getText().trim()); //aca 
            telefonoChofer = telefono_chofer.getText().trim();
            placaVehiculo = toUpperCaseString(placa_unidad.getText().trim());

            // Verificar si la placa del vehículo existe
            Long idVehiculo = ctrlVehiculo.obtenerIdPorPlaca(placaVehiculo);
            if (idVehiculo == null) {
                Vehiculo nuevoVehiculo = new Vehiculo(placaVehiculo);
                //nuevoVehiculo.setPlaca(toUpperCaseString(placa_unidad.getText()));
                
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
                Chofer choferExterno = new Chofer(telefonoChofer, nombreChofer,"Externo", placaVehiculo);
                if (!ctrlChofer.RegistrarChofer(choferExterno)) {
                    JOptionPane.showMessageDialog(null, "Error al registrar el chofer externo.");
                    return;
                }
            } else {
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

        // Obtener otros datos de la venta
        double totalVenta = Double.parseDouble(label_total.getText().replace(",", ""));
        String metodoPago = combox_TipoPago.getSelectedItem().toString();
        String estatus = status.getSelectedItem().toString();
        String flete = combox_servicio.getSelectedItem().toString();
        double costo = Double.parseDouble(costo_adicional.getText().replace(",", ""));
        
        // Crear objeto Venta y configurar sus valores
        Venta venta = new Venta();
        venta.setTotal_venta(totalVenta);
        venta.setId_cliente(idCliente);
        venta.setTelefono(telefonoUsuario); // Teléfono del usuario
        venta.setMetodo_pago(metodoPago);
        venta.setStatus(estatus);
        venta.setFlete(flete);
        venta.setCosto_flete(costo);
        venta.setTelefono_chofer(telefonoChofer); // Teléfono del chofer

        // Registrar la venta en la base de datos
        int folio_venta = ctrlVenta.registrarVenta(venta);
        if (folio_venta == -1) {
            JOptionPane.showMessageDialog(null, "Error al registrar la venta.");
            return;
        }

        // Registrar los detalles de la venta
        for (int i = 0; i < tabla_venta.getRowCount(); i++) {
            int id_material = Integer.parseInt(tabla_venta.getValueAt(i, 0).toString());
            double peso_bruto = Double.parseDouble(tabla_venta.getValueAt(i, 2).toString());
            double peso_tara = Double.parseDouble(tabla_venta.getValueAt(i, 3).toString());
            double peso_neto = Double.parseDouble(tabla_venta.getValueAt(i, 4).toString());
            double descuento = Double.parseDouble(tabla_venta.getValueAt(i, 6).toString());
            String observacion = capitalize(tabla_venta.getValueAt(i, 9).toString().trim());
            double subtotal = Double.parseDouble(tabla_venta.getValueAt(i, 10).toString());
            double precio_seleccionado = Double.parseDouble(tabla_venta.getValueAt(i, 8).toString());

            // Crear el objeto DetalleVenta
            DetalleVenta detalleventa = new DetalleVenta(folio_venta, id_material, peso_bruto, peso_tara, peso_neto, descuento, observacion, subtotal, precio_seleccionado);

            // Registrar el detalle de la venta
            ctrl_venta ctrlDetalle = new ctrl_venta();
            int filasAfectadas = ctrlDetalle.registrarDetalle(detalleventa); // Captura el número de filas afectadas

            // Verificar si el registro fue exitoso
            if (filasAfectadas <= 0) {
                JOptionPane.showMessageDialog(null, "Error al registrar el detalle de la venta para el material ID: " + id_material);
                return; // Salir del método si hubo un error
            }
        }

        // Limpiar la tabla de venta y restablecer otros componentes
        DefaultTableModel modelo = (DefaultTableModel) tabla_venta.getModel();
        modelo.setRowCount(0); // Limpiar todas las filas de la tabla de venta
        combox_cliente.setSelectedIndex(0); // Restablecer el JComboBox de cliente
        label_total.setText("$ 00.00"); // Restablecer el total a pagar
        costo_adicional.setText("0.00"); // Restablecer costo adicional
        combox_servicio.setSelectedItem("No"); // Restablecer servicio
        nombre_chofer.setText(""); // Limpiar campos de chofer
        telefono_chofer.setText("");
        placa_unidad.setText("");
        combox_chofer.setSelectedIndex(0); // Restablecer selección de chofer

        JOptionPane.showMessageDialog(this, "Venta Registrada Exitosamente", "Venta Realizada", JOptionPane.INFORMATION_MESSAGE);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
    }

    private String capitalize(String str) {
    if (str == null || str.isEmpty()) {
            return str; // Retorna la cadena original si está vacía o es null
        }
    //UpperCase Mayuscula vs lowerCase minuscula
    return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
        //esto me sirve para la placa convertir todo a mayuscula 
    private String toUpperCaseString(String str){
        if(str == null || str.isEmpty()){
            return str;//retronar cadena vacia
        }
        return str.toUpperCase();
    }
    public void borrar_bordes(){
        //para los botones de los jtextfield del usuario
        nombre_usuario.setBackground(new java.awt.Color(0,0,0,1));
        apellido_paterno.setBackground(new java.awt.Color(0,0,0,1));
        numero_telefonico.setBackground(new java.awt.Color(0,0,0,1));
        //para los botonoes del menu barra
        peso_tara.setBackground(new java.awt.Color(0,0,0,1));
        peso_bruto.setBackground(new java.awt.Color(0,0,0,1));
        nombre_chofer.setBackground(new java.awt.Color(0,0,0,1));
        telefono_chofer.setBackground(new java.awt.Color(0,0,0,1));
        placa_unidad.setBackground(new java.awt.Color(0,0,0,1));
        costo_adicional.setBackground(new java.awt.Color(0,0,0,1));
        observaciones.setBackground(new java.awt.Color(0,0,0,1));
        descuento.setBackground(new java.awt.Color(0,0,0,1));
    }
    public void utilidades(){
        this.setTitle("VENTA");
        Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/compra1.png"));
        this.setIconImage(icono);
        this.setLocationRelativeTo(null);
        correcto = new  ImageIcon("src/imagenes/correcto.png");
    }
    public void personalizar_tabla(){
        //Personalizamos la tablas 
        tabla_venta.setBackground(new Color(0x333337));  // Fondo de las celdas
        tabla_venta.setForeground(new Color(000,000,000));  // Color del texto de las celdas
        tabla_venta.setGridColor(new Color(0x333337));  // Líneas de celda más suaves
        tabla_venta.setRowHeight(25);  // Ajustar la altura de las filas
        tabla_venta.setFont(new Font("sansserif", Font.PLAIN, 12));//ME PARECE, ES FUENTE DEL CONTENIDO DE LA TABLA
        // Configurar el JScrollPane sin borde
        scroll_venta.setBorder(BorderFactory.createEmptyBorder());
        scroll_venta.setBackground(new Color(0x333337));
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
        for (int i = 0; i < tabla_venta.getColumnCount(); i++) {
            tabla_venta.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
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
        for (int i = 0; i < tabla_venta.getColumnModel().getColumnCount(); i++) {
            tabla_venta.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        tabla_venta.repaint();
    }
}