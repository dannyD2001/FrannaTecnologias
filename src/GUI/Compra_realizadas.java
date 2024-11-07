package GUI;
import com.formdev.flatlaf.FlatDarkLaf;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import controlador.ctrl_compra;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import modelo.Compra;
/**
 * @author Danny Dominguez
 */
public class Compra_realizadas extends javax.swing.JFrame {
    Icon senal;
    DefaultTableModel modelo;
    public Compra_realizadas() {
        // Aplica el tema oscuro de FlatLaf
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
        }
        initComponents();
        // Personalizar ambos calendarios con el método
        personalizarCalendario(fecha_inicio);
        personalizarCalendario(fecha_final);
    
        this.setTitle("COMPRAS REALIZADAS");
        Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/compra1.png"));
        this.setIconImage(icono);
        this.setLocationRelativeTo(null);
        ListarCompras();
        //Esto es para un icono de un salida de pantalla
        senal  = new ImageIcon("src/imagenes/senal_alerta(1).png");
        //quitar fondo al buscador de folio
        folio_buscador.setBackground(new java.awt.Color(0,0,0,1));
        // Configuración de la tabla
        //tabla_compras.setSelectionForeground(new Color(102,102,102));
        tabla_compras.setBackground(new Color(0x333333));  // Fondo de las celdas
        tabla_compras.setForeground(new Color(000,000,000));  // Color del texto de las celdas
        tabla_compras.setGridColor(new Color(255, 255, 255));  // Líneas de celda más suaves
        tabla_compras.setRowHeight(20);  // Ajustar la altura de las filas
        tabla_compras.setFont(new Font("sansserif", Font.PLAIN, 14));  // Fuente general de las celdas
        tabla_compras.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // Permitir solo una selección de fila
        tabla_compras.setCellSelectionEnabled(false); // Desactivar selección de celdas
        tabla_compras.setRowSelectionAllowed(true); // Habilitar la selección por fila
        // Crear un renderizador personalizado para garantizar que el color de fondo se respete
        // Crear un renderizador personalizado para las celdas del contenido Es para el contenido Tabla
        TableCellRenderer cellRenderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                // Establecer los colores para celdas seleccionadas y no seleccionadas
                if (isSelected) {
                    label.setBackground(new Color(0, 102, 204));  // Fondo cuando está seleccionada (azul)
                    label.setForeground(Color.WHITE);  // Texto cuando está seleccionada (blanco)
                } else {
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
        for (int i = 0; i < tabla_compras.getColumnCount(); i++) {
            tabla_compras.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
        }
        //para encabezado de Tabla
        TableCellRenderer headerRenderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                label.setBackground(new Color(0,142,0));  // Fondo verde del encabezado                
                label.setForeground(new Color(40,40,40));  // Color del texto del encabezado
                label.setHorizontalAlignment(JLabel.LEFT);  // Centrar el texto
                label.setOpaque(true);  // Asegurarse de que el color de fondo se aplique
                return label;
            }
        };
         // Aplicar el renderizador a cada columna del encabezado
        for (int i = 0; i < tabla_compras.getColumnModel().getColumnCount(); i++) {
            tabla_compras.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        scroll_compras.setBackground(Color.WHITE);
        scroll_compras.setForeground(Color.white);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_secundario = new javax.swing.JPanel();
        barra = new javax.swing.JPanel();
        panel_atras = new swing.PanelRound();
        atras = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panel_principal_busqueda = new swing.PanelRound();
        panel_secundario_busqueda = new javax.swing.JPanel();
        panel_btn = new swing.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        fecha_inicio = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fecha_final = new com.toedter.calendar.JDateChooser();
        panel_btn_restablecer = new swing.PanelRound();
        basura = new javax.swing.JLabel();
        panel_secundario_buscar_folio = new javax.swing.JPanel();
        folio_buscador = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        scroll_compras = new javax.swing.JScrollPane();
        tabla_compras = new javax.swing.JTable();
        panel_ver_detalle = new swing.PanelRound();
        label_detalle = new javax.swing.JLabel();
        panel_anular = new swing.PanelRound();
        label_anular = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setUndecorated(true);
        setResizable(false);

        panel_secundario.setBackground(new java.awt.Color(92, 189, 110));
        panel_secundario.setMinimumSize(new java.awt.Dimension(1200, 600));
        panel_secundario.setPreferredSize(new java.awt.Dimension(1200, 600));
        panel_secundario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barra.setBackground(new java.awt.Color(92, 189, 110));
        barra.setPreferredSize(new java.awt.Dimension(100, 40));

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
            .addComponent(atras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        panel_atrasLayout.setVerticalGroup(
            panel_atrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(atras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Compras Realizadas");

        javax.swing.GroupLayout barraLayout = new javax.swing.GroupLayout(barra);
        barra.setLayout(barraLayout);
        barraLayout.setHorizontalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraLayout.createSequentialGroup()
                .addComponent(panel_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(448, 448, 448)
                .addComponent(jLabel1)
                .addContainerGap(551, Short.MAX_VALUE))
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_atras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panel_secundario.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 40));

        panel_principal_busqueda.setBackground(new java.awt.Color(51, 51, 51));
        panel_principal_busqueda.setRoundBottomLeft(20);
        panel_principal_busqueda.setRoundBottomRight(20);
        panel_principal_busqueda.setRoundTopLeft(20);
        panel_principal_busqueda.setRoundTopRight(20);

        panel_secundario_busqueda.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Por Fecha:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(204, 204, 204))))); // NOI18N
        panel_secundario_busqueda.setMaximumSize(new java.awt.Dimension(500, 65));
        panel_secundario_busqueda.setMinimumSize(new java.awt.Dimension(500, 65));

        panel_btn.setBackground(new java.awt.Color(82, 170, 99));
        panel_btn.setPreferredSize(new java.awt.Dimension(60, 30));
        panel_btn.setRoundBottomLeft(20);
        panel_btn.setRoundBottomRight(20);
        panel_btn.setRoundTopLeft(20);
        panel_btn.setRoundTopRight(20);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-búsqueda-24.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_btnLayout = new javax.swing.GroupLayout(panel_btn);
        panel_btn.setLayout(panel_btnLayout);
        panel_btnLayout.setHorizontalGroup(
            panel_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        panel_btnLayout.setVerticalGroup(
            panel_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel3.setText("Fecha Inicio");

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel4.setText("Fecha Fin");

        panel_btn_restablecer.setBackground(new java.awt.Color(82, 170, 99));
        panel_btn_restablecer.setMinimumSize(new java.awt.Dimension(24, 24));
        panel_btn_restablecer.setPreferredSize(new java.awt.Dimension(68, 35));
        panel_btn_restablecer.setRoundBottomLeft(20);
        panel_btn_restablecer.setRoundBottomRight(20);
        panel_btn_restablecer.setRoundTopLeft(20);
        panel_btn_restablecer.setRoundTopRight(20);

        basura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        basura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar-20.png"))); // NOI18N
        basura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        basura.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        basura.setPreferredSize(new java.awt.Dimension(60, 35));
        basura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                basuraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                basuraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                basuraMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_btn_restablecerLayout = new javax.swing.GroupLayout(panel_btn_restablecer);
        panel_btn_restablecer.setLayout(panel_btn_restablecerLayout);
        panel_btn_restablecerLayout.setHorizontalGroup(
            panel_btn_restablecerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_btn_restablecerLayout.setVerticalGroup(
            panel_btn_restablecerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_secundario_busquedaLayout = new javax.swing.GroupLayout(panel_secundario_busqueda);
        panel_secundario_busqueda.setLayout(panel_secundario_busquedaLayout);
        panel_secundario_busquedaLayout.setHorizontalGroup(
            panel_secundario_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_secundario_busquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(10, 10, 10)
                .addComponent(fecha_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(10, 10, 10)
                .addComponent(fecha_final, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_btn_restablecer, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panel_secundario_busquedaLayout.setVerticalGroup(
            panel_secundario_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_secundario_busquedaLayout.createSequentialGroup()
                .addGroup(panel_secundario_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fecha_final, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fecha_inicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
            .addGroup(panel_secundario_busquedaLayout.createSequentialGroup()
                .addComponent(panel_btn_restablecer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_secundario_buscar_folio.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Por Folio:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(102, 102, 102)))); // NOI18N

        folio_buscador.setBorder(null);
        folio_buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                folio_buscadorActionPerformed(evt);
            }
        });
        folio_buscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                folio_buscadorKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                folio_buscadorKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panel_secundario_buscar_folioLayout = new javax.swing.GroupLayout(panel_secundario_buscar_folio);
        panel_secundario_buscar_folio.setLayout(panel_secundario_buscar_folioLayout);
        panel_secundario_buscar_folioLayout.setHorizontalGroup(
            panel_secundario_buscar_folioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_secundario_buscar_folioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_secundario_buscar_folioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                    .addComponent(folio_buscador))
                .addContainerGap())
        );
        panel_secundario_buscar_folioLayout.setVerticalGroup(
            panel_secundario_buscar_folioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_secundario_buscar_folioLayout.createSequentialGroup()
                .addComponent(folio_buscador)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panel_principal_busquedaLayout = new javax.swing.GroupLayout(panel_principal_busqueda);
        panel_principal_busqueda.setLayout(panel_principal_busquedaLayout);
        panel_principal_busquedaLayout.setHorizontalGroup(
            panel_principal_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_principal_busquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_secundario_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_secundario_buscar_folio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_principal_busquedaLayout.setVerticalGroup(
            panel_principal_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_principal_busquedaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panel_principal_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_secundario_busqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_secundario_buscar_folio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        panel_secundario.add(panel_principal_busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 1160, 90));

        tabla_compras.setFont(new java.awt.Font("Bahnschrift", 0, 10)); // NOI18N
        tabla_compras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Folio", "Fecha", "Provedor", "Total Compra", "Metódo de Pago", "Estatus"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scroll_compras.setViewportView(tabla_compras);
        if (tabla_compras.getColumnModel().getColumnCount() > 0) {
            tabla_compras.getColumnModel().getColumn(0).setPreferredWidth(8);
            tabla_compras.getColumnModel().getColumn(1).setPreferredWidth(80);
            tabla_compras.getColumnModel().getColumn(2).setPreferredWidth(50);
            tabla_compras.getColumnModel().getColumn(3).setPreferredWidth(50);
            tabla_compras.getColumnModel().getColumn(5).setPreferredWidth(10);
        }

        panel_secundario.add(scroll_compras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 1160, 340));

        panel_ver_detalle.setBackground(new java.awt.Color(65, 136, 79));
        panel_ver_detalle.setRoundBottomLeft(20);
        panel_ver_detalle.setRoundBottomRight(20);
        panel_ver_detalle.setRoundTopLeft(20);
        panel_ver_detalle.setRoundTopRight(20);

        label_detalle.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        label_detalle.setForeground(new java.awt.Color(255, 255, 255));
        label_detalle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_detalle.setText("VER DETALLE");
        label_detalle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_detalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_detalleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_detalleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_detalleMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_ver_detalleLayout = new javax.swing.GroupLayout(panel_ver_detalle);
        panel_ver_detalle.setLayout(panel_ver_detalleLayout);
        panel_ver_detalleLayout.setHorizontalGroup(
            panel_ver_detalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_detalle, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panel_ver_detalleLayout.setVerticalGroup(
            panel_ver_detalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_detalle, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panel_secundario.add(panel_ver_detalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 530, -1, 50));

        panel_anular.setBackground(new java.awt.Color(65, 136, 79));
        panel_anular.setRoundBottomLeft(20);
        panel_anular.setRoundBottomRight(20);
        panel_anular.setRoundTopLeft(20);
        panel_anular.setRoundTopRight(20);

        label_anular.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        label_anular.setForeground(new java.awt.Color(255, 255, 255));
        label_anular.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_anular.setText("ANULAR");
        label_anular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_anular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_anularMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_anularMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_anularMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_anularLayout = new javax.swing.GroupLayout(panel_anular);
        panel_anular.setLayout(panel_anularLayout);
        panel_anularLayout.setHorizontalGroup(
            panel_anularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_anular, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panel_anularLayout.setVerticalGroup(
            panel_anularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_anular, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panel_secundario.add(panel_anular, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 530, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_secundario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_secundario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseClicked
        Menu_Vista_Compra menu_compra = new Menu_Vista_Compra();
        menu_compra.setVisible(true);
        menu_compra.setLocationRelativeTo(null);
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

    private void label_detalleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_detalleMouseEntered
        // TODO add your handling code here:
        panel_ver_detalle.setBackground(new Color(0x346c3f));
        label_detalle.setForeground(new Color(0xcccccc));
    }//GEN-LAST:event_label_detalleMouseEntered

    private void label_detalleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_detalleMouseExited
        // TODO add your handling code here:
        panel_ver_detalle.setBackground(new Color(0x41884F));
        label_detalle.setForeground(Color.WHITE);
    }//GEN-LAST:event_label_detalleMouseExited

    private void label_anularMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_anularMouseEntered
        // TODO add your handling code here:
        panel_anular.setBackground(new Color(0x346c3f));
        label_anular.setForeground(new Color(0xcccccc));
    }//GEN-LAST:event_label_anularMouseEntered

    private void label_anularMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_anularMouseExited
        // TODO add your handling code here:
        panel_anular.setBackground(new Color(0x41884F));
        label_anular.setForeground(Color.WHITE);
    }//GEN-LAST:event_label_anularMouseExited

    private void label_detalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_detalleMouseClicked
        // TODO add your handling code here:
        // Obtener la fila seleccionada en la tabla de compras
        int filaSeleccionada = tabla_compras.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Por Favor, Selecciona una Compra.","Alerta",JOptionPane.WARNING_MESSAGE,senal);
            return;
        }
        // Obtener el folio de la compra seleccionada
        int folioCompra = (int) tabla_compras.getValueAt(filaSeleccionada, 0); // Asegúrate de que el folio esté en la primera columna
        // Crear una instancia de la interfaz de Detalle de Compra
        Detalles_compra_realizadas detalleCompraForm = new Detalles_compra_realizadas();

        // Llamar al método que lista los detalles de la compra en esa interfaz
        detalleCompraForm.ListarDetallesCompra(folioCompra);
        // Mostrar la interfaz de Detalle de Compra
        detalleCompraForm.setVisible(true);
        detalleCompraForm.setLocationRelativeTo(null);
        this.dispose();
       
    }//GEN-LAST:event_label_detalleMouseClicked

    private void label_anularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_anularMouseClicked
        // TODO add your handling code here:
        int filaSeleccionada = tabla_compras.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Por Favor, Selecciona una Compra.","Alerta",JOptionPane.WARNING_MESSAGE,senal);
            return;
        }
        
    }//GEN-LAST:event_label_anularMouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        panel_btn.setBackground(new Color(0x499959));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        panel_btn.setBackground(new Color(0x52AA63));
    }//GEN-LAST:event_jLabel2MouseExited

    private void folio_buscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_folio_buscadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_folio_buscadorActionPerformed

    private void folio_buscadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_folio_buscadorKeyPressed

    }//GEN-LAST:event_folio_buscadorKeyPressed

    private void folio_buscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_folio_buscadorKeyReleased
        // TODO add your handling code here:
        String textoFolio = folio_buscador.getText().trim();  // Obtener el texto ingresado y eliminar espacios en blanco
        // Si el campo de texto está vacío, mostrar todos los registros
        if (textoFolio.isEmpty()) {
            buscarFolio(-1);  // Pasar -1 o un valor especial para mostrar todos los registros
        } else {
        try {
            // Intentar convertir el texto a un número entero
            int folio_buscado = Integer.parseInt(textoFolio);            
            // Llama al método para buscar el folio ingresado
            buscarFolio(folio_buscado);
        } catch (NumberFormatException e) {
            // Si el texto no es un número válido, no hacer nada (evitar errores)
            }
        }
    }//GEN-LAST:event_folio_buscadorKeyReleased

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
          // Llamar al método que realiza la búsqueda
        buscarComprasEntreFechas();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void basuraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basuraMouseClicked
        // TODO add your handling code here:
        // Limpiar los JDateChooser
        fecha_inicio.setDate(null);
        fecha_final.setDate(null);
        // Cargar todas las compras sin filtro
        ctrl_compra controlador = new ctrl_compra();
        List<Compra> compras = controlador.ConsultaCompra();
         // Limpiar la tabla
        DefaultTableModel model = (DefaultTableModel) tabla_compras.getModel();
        model.setRowCount(0);
            // Llenar la tabla con todas las compras
        for (Compra compra : compras) {
            Object[] rowData = {
                compra.getFolio_compra(),
                compra.getFecha(),  // Mostrar la fecha completa con la hora
                compra.getNombre_provedor(),
                compra.getTotal_compra(),
                compra.getMetodo_pago(),
                compra.getStatus()
            };
            model.addRow(rowData);
        }
    }//GEN-LAST:event_basuraMouseClicked

    private void basuraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basuraMouseEntered
        // TODO add your handling code here:
        panel_btn_restablecer.setBackground(new Color(0xb70000));
        basura.setForeground(Color.BLACK);
    }//GEN-LAST:event_basuraMouseEntered

    private void basuraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basuraMouseExited
        // TODO add your handling code here:
        panel_btn_restablecer.setBackground(new Color(0x52AA63));
    }//GEN-LAST:event_basuraMouseExited

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
            java.util.logging.Logger.getLogger(Compra_realizadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compra_realizadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compra_realizadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compra_realizadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Compra_realizadas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atras;
    private javax.swing.JPanel barra;
    private javax.swing.JLabel basura;
    private com.toedter.calendar.JDateChooser fecha_final;
    private com.toedter.calendar.JDateChooser fecha_inicio;
    private javax.swing.JTextField folio_buscador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_anular;
    private javax.swing.JLabel label_detalle;
    private swing.PanelRound panel_anular;
    private swing.PanelRound panel_atras;
    private swing.PanelRound panel_btn;
    private swing.PanelRound panel_btn_restablecer;
    private swing.PanelRound panel_principal_busqueda;
    private javax.swing.JPanel panel_secundario;
    private javax.swing.JPanel panel_secundario_buscar_folio;
    private javax.swing.JPanel panel_secundario_busqueda;
    private swing.PanelRound panel_ver_detalle;
    private javax.swing.JScrollPane scroll_compras;
    private javax.swing.JTable tabla_compras;
    // End of variables declaration//GEN-END:variables
    ctrl_compra ctr_com = new ctrl_compra();
    public void ListarCompras(){
        List<Compra> ListarMate = ctr_com.ConsultaCompra();
        modelo  = (DefaultTableModel) tabla_compras.getModel();
        modelo.setRowCount(0);
        Object[] object = new Object[6];
        for (int i = 0; i < ListarMate.size(); i++) {
            object[0] = ListarMate.get(i).getFolio_compra();
            object[1] = ListarMate.get(i).getFecha();
            object[2] = ListarMate.get(i).getNombre_provedor();
            object[3] = ListarMate.get(i).getTotal_compra();
            object[4] = ListarMate.get(i).getMetodo_pago();
            object[5] = ListarMate.get(i).getStatus();           
            modelo.addRow(object);            
        }
        tabla_compras.setModel(modelo);
    }
    //Metodo para la BUSQUEDA POR FOLIO en compras realizadas
    ctrl_compra compra = new ctrl_compra();
    public void buscarFolio(int folio){
        List<Compra> ListaFolio = compra.consultaFolio();
        modelo  = (DefaultTableModel) tabla_compras.getModel();
        modelo.setRowCount(0);
        Object[] object = new  Object[6];
        for (Compra compra : ListaFolio){
            // Si folio es -1, mostrar todos los registros
        // Si no, mostrar solo los registros cuyo folio coincida con el folio buscad
            if(folio == -1 || compra.getFolio_compra() == folio){                            
            object[0] = compra.getFolio_compra();
            object[1] = compra.getFecha();
            object[2] = compra.getNombre_provedor();
            object[3] = compra.getTotal_compra();
            object[4]= compra.getMetodo_pago();
            object[5] = compra.getStatus();
            modelo.addRow(object);            
            }
        }
        tabla_compras.setModel(modelo);
    }
    //esto es para la busqueda por fechas
    private void buscarComprasEntreFechas() {
    // Obtener las fechas desde los JDateChooser
    Date fechaInicio = fecha_inicio.getDate();
    Date fechaFin = fecha_final.getDate();
    ctrl_compra controlador = new ctrl_compra();  // Crear instancia del controlador
    
    // Verificar si ambas fechas han sido seleccionadas
    if (fechaInicio == null || fechaFin == null) {
        // Mostrar mensaje si una de las fechas o ambas no han sido seleccionadas
        JOptionPane.showMessageDialog(null, "Por favor selecciona ambas fechas.", "Error", JOptionPane.ERROR_MESSAGE);
        return;  // Salir del método si no se seleccionaron las fechas
    }
    // Si las fechas están seleccionadas, buscar las compras entre las fechas
    List<Compra> compras = controlador.buscarComprasPorFecha(fechaInicio, fechaFin);
    // Limpiar la tabla
    DefaultTableModel model = (DefaultTableModel) tabla_compras.getModel();
    model.setRowCount(0);
    // Llenar la tabla con los resultados de la búsqueda
    for (Compra compra : compras) {
        try {
            // Obtener la fecha completa (fecha y hora)
            String fechaCompleta = compra.getFecha();  // Aquí no modificamos la fecha
            // Llenar los datos de la tabla
            Object[] rowData = {
                compra.getFolio_compra(),
                fechaCompleta,  // Mostrar la fecha completa con la hora
                compra.getNombre_provedor(),
                compra.getTotal_compra(),
                compra.getMetodo_pago(),
                compra.getStatus()
            };
            model.addRow(rowData);
        } catch (Exception e) {
        }
    }
    }
    //
    private void personalizarCalendario(JDateChooser dateChooser) {
    JCalendar calendar = dateChooser.getJCalendar();
    
    // Configuración del calendario
    calendar.setTodayButtonVisible(true); // Mostrar el botón "Hoy"
    calendar.setWeekOfYearVisible(false); // Ocultar el número de semanas
    calendar.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14)); // Cambiar a Segoe UI Variable
    
    // Personalización de colores
    calendar.setBackground(new Color(43, 43, 43)); // Fondo del calendario oscuro
    calendar.getDayChooser().setBackground(new Color(43, 43, 43)); // Fondo del panel de días oscuro
    calendar.setWeekdayForeground(Color.LIGHT_GRAY); // Días de la semana en gris claro
    calendar.setSundayForeground(new Color(255, 99, 71)); // Domingos en rojo claro
    calendar.setDecorationBackgroundVisible(false); // Eliminar barra superior de decoración

    // Efecto de hover sobre los días
    calendar.getDayChooser().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
            Component component = e.getComponent();
            if (component instanceof JButton) {
                JButton button = (JButton) component;
                button.setBackground(new Color(0, 120, 215)); // Color azul al pasar el mouse
                button.setForeground(Color.WHITE); // Texto en blanco al pasar el mouse
            }
        }

        @Override
        public void mouseExited(MouseEvent e) {
            Component component = e.getComponent();
            if (component instanceof JButton) {
                JButton button = (JButton) component;
                button.setBackground(new Color(43, 43, 43)); // Fondo oscuro
                button.setForeground(Color.LIGHT_GRAY); // Texto en gris claro
            }
        }
    });

    // Ajustar el tamaño de las celdas de día (más grandes y proporcionales)
    int cellWidth = 60; // Ancho de las celdas
    int cellHeight = 60; // Altura de las celdas
    calendar.getDayChooser().setPreferredSize(new Dimension(cellWidth * 7, cellHeight * 6));

    // Eliminar decoraciones del calendario desplegable
    dateChooser.getJCalendar().setBorder(BorderFactory.createEmptyBorder());
}

    //
}
