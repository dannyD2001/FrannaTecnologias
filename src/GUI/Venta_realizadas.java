package GUI;
import com.formdev.flatlaf.FlatDarkLaf;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import controlador.ctrl_venta;
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
import modelo.Venta;
/**
 *
 * @author Danny Dominguez
 */
public class Venta_realizadas extends javax.swing.JFrame {
    ctrl_venta ventas = new ctrl_venta();
    //Declarando una Variable modelo a una clase parte de un biblioteca DefaultTableModel Que permite gestionar datos de una tabla
    DefaultTableModel modelo; //Clase parte de una biblioteca
    
    public Venta_realizadas() {
        // Aplica el tema oscuro de FlatLaf
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
        }
        initComponents();
        informacion_panel();
        eliminar_bordes();
        personalizarCalendario(fecha_inicio);
        personalizarCalendario(fecha_final);
        Personalizar_tabla_calendario();
        ListarVentas();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_principal = new javax.swing.JPanel();
        barra = new javax.swing.JPanel();
        panel_atras = new swing.PanelRound();
        atras = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panel_principal_busqueda = new swing.PanelRound();
        panel_secundario_busqueda = new javax.swing.JPanel();
        fecha_final = new com.toedter.calendar.JDateChooser();
        fecha_inicio = new com.toedter.calendar.JDateChooser();
        label_fecha_inicio = new javax.swing.JLabel();
        label_fecha_fin = new javax.swing.JLabel();
        panel_btn = new swing.PanelRound();
        buscar = new javax.swing.JLabel();
        panel_restablecer = new swing.PanelRound();
        basura = new javax.swing.JLabel();
        panel_secundario_folio = new javax.swing.JPanel();
        folio_buscador = new javax.swing.JTextField();
        separador_folio = new javax.swing.JSeparator();
        scroll_ventas = new javax.swing.JScrollPane();
        table_ventas_realizadas = new javax.swing.JTable();
        panel_detalle = new swing.PanelRound();
        label_detalle = new javax.swing.JLabel();
        panel_anular = new swing.PanelRound();
        label_anular = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 600));
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setUndecorated(true);
        setResizable(false);

        panel_principal.setBackground(new java.awt.Color(92, 189, 110));
        panel_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barra.setBackground(new java.awt.Color(92, 189, 110));

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
            .addComponent(atras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panel_atrasLayout.setVerticalGroup(
            panel_atrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ventas Realizadas");

        javax.swing.GroupLayout barraLayout = new javax.swing.GroupLayout(barra);
        barra.setLayout(barraLayout);
        barraLayout.setHorizontalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraLayout.createSequentialGroup()
                .addComponent(panel_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(534, 534, 534)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(471, Short.MAX_VALUE))
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraLayout.createSequentialGroup()
                .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_atras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_principal.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 40));

        panel_principal_busqueda.setPreferredSize(new java.awt.Dimension(1160, 89));
        panel_principal_busqueda.setRoundBottomLeft(20);
        panel_principal_busqueda.setRoundBottomRight(20);
        panel_principal_busqueda.setRoundTopLeft(20);
        panel_principal_busqueda.setRoundTopRight(20);

        panel_secundario_busqueda.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Por Fecha:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP)));

        label_fecha_inicio.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        label_fecha_inicio.setText("Fecha Inicio");

        label_fecha_fin.setText("Fecha Fin");

        panel_btn.setBackground(new java.awt.Color(92, 189, 110));
        panel_btn.setPreferredSize(new java.awt.Dimension(60, 35));
        panel_btn.setRoundBottomLeft(20);
        panel_btn.setRoundBottomRight(20);
        panel_btn.setRoundTopLeft(20);
        panel_btn.setRoundTopRight(20);

        buscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-búsqueda-24.png"))); // NOI18N
        buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_btnLayout = new javax.swing.GroupLayout(panel_btn);
        panel_btn.setLayout(panel_btnLayout);
        panel_btnLayout.setHorizontalGroup(
            panel_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        panel_btnLayout.setVerticalGroup(
            panel_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        panel_restablecer.setBackground(new java.awt.Color(92, 189, 110));
        panel_restablecer.setMaximumSize(new java.awt.Dimension(60, 36));
        panel_restablecer.setMinimumSize(new java.awt.Dimension(60, 36));
        panel_restablecer.setRoundBottomLeft(20);
        panel_restablecer.setRoundBottomRight(20);
        panel_restablecer.setRoundTopLeft(20);
        panel_restablecer.setRoundTopRight(20);

        basura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        basura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar-20.png"))); // NOI18N
        basura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        javax.swing.GroupLayout panel_restablecerLayout = new javax.swing.GroupLayout(panel_restablecer);
        panel_restablecer.setLayout(panel_restablecerLayout);
        panel_restablecerLayout.setHorizontalGroup(
            panel_restablecerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        panel_restablecerLayout.setVerticalGroup(
            panel_restablecerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_secundario_busquedaLayout = new javax.swing.GroupLayout(panel_secundario_busqueda);
        panel_secundario_busqueda.setLayout(panel_secundario_busquedaLayout);
        panel_secundario_busquedaLayout.setHorizontalGroup(
            panel_secundario_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_secundario_busquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_fecha_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fecha_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_fecha_fin)
                .addGap(9, 9, 9)
                .addComponent(fecha_final, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(panel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(panel_restablecer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        panel_secundario_busquedaLayout.setVerticalGroup(
            panel_secundario_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_secundario_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(label_fecha_fin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fecha_final, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
            .addGroup(panel_secundario_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(label_fecha_inicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fecha_inicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_secundario_busquedaLayout.createSequentialGroup()
                .addGroup(panel_secundario_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel_restablecer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panel_secundario_folio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Por Folio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        folio_buscador.setBorder(null);
        folio_buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                folio_buscadorActionPerformed(evt);
            }
        });
        folio_buscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                folio_buscadorKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panel_secundario_folioLayout = new javax.swing.GroupLayout(panel_secundario_folio);
        panel_secundario_folio.setLayout(panel_secundario_folioLayout);
        panel_secundario_folioLayout.setHorizontalGroup(
            panel_secundario_folioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_secundario_folioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_secundario_folioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(separador_folio)
                    .addComponent(folio_buscador, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        panel_secundario_folioLayout.setVerticalGroup(
            panel_secundario_folioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_secundario_folioLayout.createSequentialGroup()
                .addComponent(folio_buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(separador_folio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_principal_busquedaLayout = new javax.swing.GroupLayout(panel_principal_busqueda);
        panel_principal_busqueda.setLayout(panel_principal_busquedaLayout);
        panel_principal_busquedaLayout.setHorizontalGroup(
            panel_principal_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_principal_busquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_secundario_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(panel_secundario_folio, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        panel_principal_busquedaLayout.setVerticalGroup(
            panel_principal_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_principal_busquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_principal_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_secundario_folio, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(panel_secundario_busqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_principal.add(panel_principal_busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 1160, 89));

        scroll_ventas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        table_ventas_realizadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Folio", "Fecha", "Cliente", "Total Venta", "Metodo Pago", "Estatus", "Flete", "Costo del Flete", "Chofer", "Atendido Por"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scroll_ventas.setViewportView(table_ventas_realizadas);
        if (table_ventas_realizadas.getColumnModel().getColumnCount() > 0) {
            table_ventas_realizadas.getColumnModel().getColumn(0).setPreferredWidth(8);
            table_ventas_realizadas.getColumnModel().getColumn(1).setPreferredWidth(80);
            table_ventas_realizadas.getColumnModel().getColumn(2).setPreferredWidth(40);
            table_ventas_realizadas.getColumnModel().getColumn(3).setPreferredWidth(40);
            table_ventas_realizadas.getColumnModel().getColumn(4).setPreferredWidth(40);
            table_ventas_realizadas.getColumnModel().getColumn(5).setPreferredWidth(30);
            table_ventas_realizadas.getColumnModel().getColumn(6).setPreferredWidth(8);
            table_ventas_realizadas.getColumnModel().getColumn(7).setPreferredWidth(40);
            table_ventas_realizadas.getColumnModel().getColumn(8).setPreferredWidth(40);
            table_ventas_realizadas.getColumnModel().getColumn(9).setPreferredWidth(50);
        }

        panel_principal.add(scroll_ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 1160, 350));

        panel_detalle.setBackground(new java.awt.Color(65, 136, 79));
        panel_detalle.setPreferredSize(new java.awt.Dimension(100, 50));
        panel_detalle.setRoundBottomLeft(40);
        panel_detalle.setRoundBottomRight(40);
        panel_detalle.setRoundTopLeft(40);
        panel_detalle.setRoundTopRight(40);

        label_detalle.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        label_detalle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_detalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bolsa_venta.png"))); // NOI18N
        label_detalle.setText("DETALLE\nVENTA");
        label_detalle.setToolTipText("");
        label_detalle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_detalle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_detalle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        label_detalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_detalleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_detalleMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_detalleLayout = new javax.swing.GroupLayout(panel_detalle);
        panel_detalle.setLayout(panel_detalleLayout);
        panel_detalleLayout.setHorizontalGroup(
            panel_detalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_detalle, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panel_detalleLayout.setVerticalGroup(
            panel_detalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_detalle, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panel_principal.add(panel_detalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 530, 100, 50));

        panel_anular.setBackground(new java.awt.Color(65, 136, 79));
        panel_anular.setPreferredSize(new java.awt.Dimension(100, 50));
        panel_anular.setRoundBottomLeft(40);
        panel_anular.setRoundBottomRight(40);
        panel_anular.setRoundTopLeft(40);
        panel_anular.setRoundTopRight(40);

        label_anular.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        label_anular.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_anular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anular_venta.png"))); // NOI18N
        label_anular.setText("ANULAR VENTA");
        label_anular.setToolTipText("");
        label_anular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_anular.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_anular.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        label_anular.addMouseListener(new java.awt.event.MouseAdapter() {
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

        panel_principal.add(panel_anular, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 530, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseClicked
        Menu_Vista_Venta menu_venta = new Menu_Vista_Venta();
        menu_venta .setVisible(true);
        menu_venta .setLocationRelativeTo(null);
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

    private void folio_buscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_folio_buscadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_folio_buscadorActionPerformed

    private void buscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseEntered
        // TODO add your handling code here:
        panel_btn.setBackground(new Color(0x2d5f37));
    }//GEN-LAST:event_buscarMouseEntered

    private void buscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseExited
        // TODO add your handling code here:
         panel_btn.setBackground(new Color(0x52AA63));
    }//GEN-LAST:event_buscarMouseExited

    private void basuraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basuraMouseEntered
        // TODO add your handling code here:
        panel_restablecer.setBackground(new Color(0xb70000));
    }//GEN-LAST:event_basuraMouseEntered

    private void basuraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basuraMouseExited
        // TODO add your handling code here:
        panel_restablecer.setBackground(new Color(0x52AA63));
    }//GEN-LAST:event_basuraMouseExited

    private void buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseClicked
        // TODO add your handling code here:
        BuscarVentaEntreFechas();
    }//GEN-LAST:event_buscarMouseClicked

    private void basuraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basuraMouseClicked
        // TODO add your handling code here:
        limpiar_buscador_fecha();
    }//GEN-LAST:event_basuraMouseClicked

    private void folio_buscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_folio_buscadorKeyReleased
        // TODO add your handling code here:
        String textoFolio =folio_buscador.getText().trim();
        //verificar si el texto esta vacion
        if(textoFolio.isEmpty()){
            buscarPorFolio(-1);                   
        }else
        {
            try {
                //convertir el texto a numero entero
                int folio_buscado = Integer.parseInt(textoFolio);
                //lamo al metodo
                buscarPorFolio(folio_buscado);
                
            } catch (NumberFormatException e) {
            }        
        }
        
        
    }//GEN-LAST:event_folio_buscadorKeyReleased

    private void label_detalleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_detalleMouseEntered
        // TODO add your handling code here:
        panel_detalle.setBackground(new Color(0x2d5f37));
        label_detalle.setForeground(new Color(0xcccccc));
    }//GEN-LAST:event_label_detalleMouseEntered

    private void label_detalleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_detalleMouseExited
        // TODO add your handling code here:
        panel_detalle.setBackground(new Color(0x41884F));
        label_detalle.setForeground(Color.WHITE);
    }//GEN-LAST:event_label_detalleMouseExited

    private void label_anularMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_anularMouseEntered
        // TODO add your handling code here:
        panel_anular.setBackground(new Color(0x2d5f37));
        label_anular.setForeground(new Color(0xcccccc));
    }//GEN-LAST:event_label_anularMouseEntered

    private void label_anularMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_anularMouseExited
        // TODO add your handling code here:
        panel_anular.setBackground(new Color(0x41884F));
        label_anular.setForeground(Color.WHITE);
    }//GEN-LAST:event_label_anularMouseExited

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
            java.util.logging.Logger.getLogger(Venta_realizadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venta_realizadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venta_realizadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venta_realizadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Venta_realizadas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atras;
    private javax.swing.JPanel barra;
    private javax.swing.JLabel basura;
    private javax.swing.JLabel buscar;
    private com.toedter.calendar.JDateChooser fecha_final;
    private com.toedter.calendar.JDateChooser fecha_inicio;
    private javax.swing.JTextField folio_buscador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label_anular;
    private javax.swing.JLabel label_detalle;
    private javax.swing.JLabel label_fecha_fin;
    private javax.swing.JLabel label_fecha_inicio;
    private swing.PanelRound panel_anular;
    private swing.PanelRound panel_atras;
    private swing.PanelRound panel_btn;
    private swing.PanelRound panel_detalle;
    private javax.swing.JPanel panel_principal;
    private swing.PanelRound panel_principal_busqueda;
    private swing.PanelRound panel_restablecer;
    private javax.swing.JPanel panel_secundario_busqueda;
    private javax.swing.JPanel panel_secundario_folio;
    private javax.swing.JScrollPane scroll_ventas;
    private javax.swing.JSeparator separador_folio;
    private javax.swing.JTable table_ventas_realizadas;
    // End of variables declaration//GEN-END:variables
    public void eliminar_bordes(){
        folio_buscador.setBackground(new java.awt.Color(0,0,0,1));
    
    }
    //Para informacion del panel 
    public void informacion_panel(){
        this.setTitle("VENTAS REALIZADAS");
        Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/compra1.png"));
        this.setIconImage(icono);
        this.setLocationRelativeTo(null);
    }
    //personalizacion del calendario
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
    public void Personalizar_tabla_calendario(){
        // Configuración de la tabla
        table_ventas_realizadas.setBackground(new Color(0x333333));  // Fondo de las celdas
        table_ventas_realizadas.setForeground(new Color(000,000,000));  // Color del texto de las celdas
        table_ventas_realizadas.setGridColor(new Color(255, 255, 255));  // Líneas de celda más suaves
        table_ventas_realizadas.setRowHeight(20);  // Ajustar la altura de las filas
        table_ventas_realizadas.setFont(new Font("sansserif", Font.PLAIN, 14));  // Fuente general de las celdas
        table_ventas_realizadas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // Permitir solo una selección de fila
        table_ventas_realizadas.setCellSelectionEnabled(false); // Desactivar selección de celdas
        table_ventas_realizadas.setRowSelectionAllowed(true); // Habilitar la selección por fila
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
        for (int i = 0; i < table_ventas_realizadas.getColumnCount(); i++) {
            table_ventas_realizadas.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
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
        for (int i = 0; i < table_ventas_realizadas.getColumnModel().getColumnCount(); i++) {
            table_ventas_realizadas.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        //0,0,0,1                
        //scroll_ventas.setBackground(Color.WHITE);
        scroll_ventas.setBackground(new Color(0,0,1));
        scroll_ventas.setForeground(Color.WHITE);
    }
    public void ListarVentas(){
        List<Venta> ListarVenta = ventas.ConsultaVenta();//List es de la bibliote java.util.List
        modelo  = (DefaultTableModel) table_ventas_realizadas.getModel();
        modelo.setRowCount(0);
        Object[] object = new Object[10]; //creando un array llamado object de tamaño ''
        for (int i = 0; i < ListarVenta.size(); i++) { //recorrer cada elemento de la ListVenta para determinar cuantas ventas hay en la lista
            object[0] = ListarVenta.get(i).getFolio_venta(); // obtener el objeto Venta  en la posicion 'x' de la lista  para llamar los metodos de acceso geter 
            object[1] = ListarVenta.get(i).getFecha_venta();
            object[2] = ListarVenta.get(i).getNombre_cliente();
            object[3] = ListarVenta.get(i).getTotal_venta();
            object[4] = ListarVenta.get(i).getMetodo_pago();
            object[5] = ListarVenta.get(i).getStatus();
            object[6] = ListarVenta.get(i).getFlete();
            object[7] = ListarVenta.get(i).getCosto_flete();
            object[8] = ListarVenta.get(i).getNombre_chofer();
            object[9] = ListarVenta.get(i).getNombre_usuario();
            //addColumn es para columnas no para filas ejemplo "ID", "NOMBRE"
            //addRow Ejemplo 1,Jose ,perez, 1,800.00
            modelo.addRow(object); //El row es para añadir filas a una tabla,  Añadir los datos de venta como una nueva fila en el modelo de la tabla  
        }
        table_ventas_realizadas.setModel(modelo); // Configura el modelo de la tabla para mostrar los datos de ventas añadidos    
    }
    public void BuscarVentaEntreFechas(){
    // Obtener las fechas seleccionadas desde los JDateChooser
    //Date es una clase de java.util que representa una fecha y hora específica
    Date fechaInicio = fecha_inicio.getDate(); //getDate metodo para obtener la fecha selecionada
    Date fechaFin = fecha_final.getDate();
    // Verificar si ambas fechas han sido seleccionadas
    if (fechaInicio == null || fechaFin == null) {
        // Mostrar mensaje si una de las fechas o ambas no han sido seleccionadas
        JOptionPane.showMessageDialog(null, "Por favor selecciona ambas fechas.", "Error", JOptionPane.ERROR_MESSAGE);
        return;  // Salir del método si no se seleccionaron las fechas
    }
    
    List<Venta> venta = ventas.buscarVentaPorFecha(fechaInicio, fechaFin);
    // Limpiar la tabla
    DefaultTableModel model = (DefaultTableModel) table_ventas_realizadas.getModel();
    model.setRowCount(0);
    for(Venta ventass : venta){
        try {
            String fechaCompleta = ventass.getFecha_venta();
            // Llenar los datos de la tabla
            Object[] rowData = {
                ventass.getFolio_venta(),
                fechaCompleta,
                ventass.getNombre_cliente(),
                ventass.getTotal_venta(),
                ventass.getMetodo_pago(),
                ventass.getStatus(),
                ventass.getFlete(),
                ventass.getCosto_flete(),
                ventass.getNombre_chofer(),
                ventass.getNombre_usuario()            
            };
            model.addRow(rowData);            
        } catch (Exception e) {
        }
    }
    }
    //limpiar
    public void limpiar_buscador_fecha(){
        // Limpiar los JDateChooser
        fecha_inicio.setDate(null);
        fecha_final.setDate(null);
        // Cargar todas las compras sin filtro
        ctrl_venta venta = new ctrl_venta();
        List<Venta> compras = venta.ConsultaVenta();
         // Limpiar la tabla
        DefaultTableModel model = (DefaultTableModel) table_ventas_realizadas.getModel();
        model.setRowCount(0);
            // Llenar la tabla con todas las compras
        for (Venta ventass : compras) {
            Object[] rowData = {
                ventass.getFolio_venta(),
                ventass.getFecha_venta(),
                ventass.getNombre_cliente(),
                ventass.getTotal_venta(),
                ventass.getMetodo_pago(),
                ventass.getStatus(),
                ventass.getFlete(),
                ventass.getCosto_flete(),
                ventass.getNombre_chofer(),
                ventass.getNombre_usuario()                  
            };
            model.addRow(rowData);
        }
    
    }
    //buscar por folio sigue haciendo eso
    public void buscarPorFolio(int folio){
        List<Venta> ListaFolio = ventas.ConsultaFolio();
        modelo = (DefaultTableModel)table_ventas_realizadas.getModel();
        modelo.setRowCount(0);
        Object[] object = new Object[10];
        for(Venta ventass : ListaFolio){
            // Si folio es -1, mostrar todos los registros
            // Si no, mostrar solo los registros cuyo folio coincida con el folio buscad
            if(folio == -1 || ventass.getFolio_venta() == folio){ //evalua ventass.getFolio_venta() == folio que se agrego para mostar con el folio  asginado
                object[0] = ventass.getFolio_venta(); // obtener el objeto Venta  en la posicion 'x' de la lista  para llamar los metodos de acceso geter 
                object[1] = ventass.getFecha_venta();
                object[2] = ventass.getNombre_cliente();
                object[3] = ventass.getTotal_venta();
                object[4] = ventass.getMetodo_pago();
                object[5] = ventass.getStatus();
                object[6] = ventass.getFlete();
                object[7] = ventass.getCosto_flete();
                object[8] = ventass.getNombre_chofer();
                object[9] = ventass.getNombre_usuario();
                modelo.addRow(object);
            }  
        }
        table_ventas_realizadas.setModel(modelo);
    }
}
