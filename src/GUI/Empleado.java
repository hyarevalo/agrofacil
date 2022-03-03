/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import clases.Conexion;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



/**
 *
 * @author Antonio
 */
public class Empleado extends javax.swing.JPanel {
public static String patron = "dd/MM/yyyy";

    public static String sfecha;
    public static DateFormat formato1;
    
    /**
     * Creates new form Principal
     */
    public Empleado() {
        initComponents();
        
    }
    

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_agrofacil = new javax.swing.JPanel();
        empleado = new javax.swing.JLabel();
        icono = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        apellido = new javax.swing.JLabel();
        cedula = new javax.swing.JLabel();
        direccion = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        fecha_ingreso = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();
        ingrese_nombre = new javax.swing.JTextField();
        ingrese_cedula = new javax.swing.JTextField();
        ingrese_apellido = new javax.swing.JTextField();
        ingrese_telefono = new javax.swing.JTextField();
        ingrese_email = new javax.swing.JTextField();
        ingrese_direccion = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        panel_buscar = new javax.swing.JPanel();
        buscar = new javax.swing.JLabel();
        icono_buscar = new javax.swing.JLabel();
        panel_agregar = new javax.swing.JPanel();
        agregar = new javax.swing.JLabel();
        icono_agregar = new javax.swing.JLabel();
        panel_modificar = new javax.swing.JPanel();
        modificar = new javax.swing.JLabel();
        icono_modificar = new javax.swing.JLabel();
        panel_mostrar = new javax.swing.JPanel();
        mostrar = new javax.swing.JLabel();
        icono_mostrar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_agrofacil.setBackground(new java.awt.Color(0, 204, 0));
        panel_agrofacil.setLayout(null);

        empleado.setFont(new java.awt.Font("Leelawadee UI", 3, 48)); // NOI18N
        empleado.setForeground(new java.awt.Color(255, 255, 255));
        empleado.setText("EMPLEADO");
        panel_agrofacil.add(empleado);
        empleado.setBounds(220, 20, 260, 64);

        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_login1.png"))); // NOI18N
        panel_agrofacil.add(icono);
        icono.setBounds(610, 10, 107, 95);

        add(panel_agrofacil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 110));

        nombre.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        nombre.setText("NOMBRE DEL EMPLEADO");
        add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        apellido.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        apellido.setText("APELLIDO DEL EMPLEADO");
        add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

        cedula.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        cedula.setText("CEDULA DE CIUDADANIA");
        add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        direccion.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        direccion.setText("DIRECCIÓN DEL EMPLEADO");
        add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        telefono.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        telefono.setText("TELÉFONO DEL EMPLEADO");
        add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, -1));

        email.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        email.setText("E-MAIL  DEL EMPLEADO");
        add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, -1, -1));

        fecha_ingreso.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        fecha_ingreso.setText(" FECHA DE INGRESO DEL EMPLEADO");
        add(fecha_ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));
        add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 140, 30));

        ingrese_nombre.setForeground(new java.awt.Color(153, 153, 153));
        ingrese_nombre.setText("Ingrese el nombre");
        ingrese_nombre.setBorder(null);
        ingrese_nombre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingrese_nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ingrese_nombreMousePressed(evt);
            }
        });
        add(ingrese_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 130, 30));

        ingrese_cedula.setForeground(new java.awt.Color(153, 153, 153));
        ingrese_cedula.setText("Ingrese numero de cedula");
        ingrese_cedula.setBorder(null);
        ingrese_cedula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingrese_cedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ingrese_cedulaMousePressed(evt);
            }
        });
        add(ingrese_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 200, 30));

        ingrese_apellido.setForeground(new java.awt.Color(153, 153, 153));
        ingrese_apellido.setText("Ingrese los apellidos");
        ingrese_apellido.setBorder(null);
        ingrese_apellido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingrese_apellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ingrese_apellidoMousePressed(evt);
            }
        });
        ingrese_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingrese_apellidoActionPerformed(evt);
            }
        });
        add(ingrese_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 160, 30));

        ingrese_telefono.setForeground(new java.awt.Color(153, 153, 153));
        ingrese_telefono.setText("Ingrese el numero de telefono");
        ingrese_telefono.setBorder(null);
        ingrese_telefono.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingrese_telefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ingrese_telefonoMousePressed(evt);
            }
        });
        add(ingrese_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 190, 30));

        ingrese_email.setForeground(new java.awt.Color(153, 153, 153));
        ingrese_email.setText("Ingrese el @email");
        ingrese_email.setBorder(null);
        ingrese_email.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingrese_email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ingrese_emailMousePressed(evt);
            }
        });
        add(ingrese_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 190, 30));

        ingrese_direccion.setForeground(new java.awt.Color(153, 153, 153));
        ingrese_direccion.setText("Ingrese direccion de residencia");
        ingrese_direccion.setBorder(null);
        ingrese_direccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingrese_direccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ingrese_direccionMousePressed(evt);
            }
        });
        add(ingrese_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 200, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 250, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 202, 220, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 250, -1));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 352, 250, 10));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 220, -1));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 220, -1));

        panel_buscar.setBackground(new java.awt.Color(51, 204, 0));
        panel_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_buscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_buscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_buscarMouseExited(evt);
            }
        });

        buscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setText("Buscar");
        buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        icono_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.png"))); // NOI18N

        javax.swing.GroupLayout panel_buscarLayout = new javax.swing.GroupLayout(panel_buscar);
        panel_buscar.setLayout(panel_buscarLayout);
        panel_buscarLayout.setHorizontalGroup(
            panel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_buscarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(icono_buscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscar)
                .addContainerGap())
        );
        panel_buscarLayout.setVerticalGroup(
            panel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(icono_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(panel_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 100, 40));

        panel_agregar.setBackground(new java.awt.Color(51, 204, 0));
        panel_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_agregarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_agregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_agregarMouseExited(evt);
            }
        });

        agregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        agregar.setForeground(new java.awt.Color(255, 255, 255));
        agregar.setText("Agregar");
        agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        icono_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-agregar.png"))); // NOI18N

        javax.swing.GroupLayout panel_agregarLayout = new javax.swing.GroupLayout(panel_agregar);
        panel_agregar.setLayout(panel_agregarLayout);
        panel_agregarLayout.setHorizontalGroup(
            panel_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_agregarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(icono_agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_agregarLayout.setVerticalGroup(
            panel_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(icono_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(panel_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 120, 40));

        panel_modificar.setBackground(new java.awt.Color(51, 204, 0));
        panel_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_modificarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_modificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_modificarMouseExited(evt);
            }
        });

        modificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        modificar.setForeground(new java.awt.Color(255, 255, 255));
        modificar.setText("Modificar");
        modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        icono_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N

        javax.swing.GroupLayout panel_modificarLayout = new javax.swing.GroupLayout(panel_modificar);
        panel_modificar.setLayout(panel_modificarLayout);
        panel_modificarLayout.setHorizontalGroup(
            panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_modificarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(icono_modificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_modificarLayout.setVerticalGroup(
            panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(icono_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(panel_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 110, 40));

        panel_mostrar.setBackground(new java.awt.Color(51, 204, 0));
        panel_mostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_mostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_mostrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_mostrarMouseExited(evt);
            }
        });

        mostrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mostrar.setForeground(new java.awt.Color(255, 255, 255));
        mostrar.setText("Mostrar");
        mostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        icono_mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu.png"))); // NOI18N

        javax.swing.GroupLayout panel_mostrarLayout = new javax.swing.GroupLayout(panel_mostrar);
        panel_mostrar.setLayout(panel_mostrarLayout);
        panel_mostrarLayout.setHorizontalGroup(
            panel_mostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_mostrarLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(icono_mostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_mostrarLayout.setVerticalGroup(
            panel_mostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mostrar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(icono_mostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(panel_mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, -1, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void ingrese_nombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingrese_nombreMousePressed

        if(ingrese_nombre.getText().equals("Ingrese el nombre")){
            ingrese_nombre.setText("");
            ingrese_nombre.setForeground(Color.black);
        }

        if(ingrese_cedula. getText().isEmpty()){
            ingrese_cedula.setText("Ingrese numero de cedula");
            ingrese_cedula.setForeground(Color.gray);
        }

        if(ingrese_apellido. getText().isEmpty()){
            ingrese_apellido.setText("Ingrese los apellidos");
            ingrese_apellido.setForeground(Color.gray);
        }

        if(ingrese_telefono. getText().isEmpty()){
            ingrese_telefono.setText("Ingrese el numero de telefono");
            ingrese_telefono.setForeground(Color.gray);
        }

        if(ingrese_direccion. getText().isEmpty()){
            ingrese_direccion.setText("Ingrese direccion de residencia");
            ingrese_direccion.setForeground(Color.gray);
        }

        if(ingrese_email. getText().isEmpty()){
            ingrese_email.setText("Ingrese el @email");
            ingrese_email.setForeground(Color.gray);
        }

    }//GEN-LAST:event_ingrese_nombreMousePressed

    private void ingrese_cedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingrese_cedulaMousePressed

        if(ingrese_nombre. getText().isEmpty()){
            ingrese_nombre.setText("Ingrese el nombre");
            ingrese_nombre.setForeground(Color.gray);
        }

        if(ingrese_cedula.getText().equals("Ingrese numero de cedula")){
            ingrese_cedula.setText("");
            ingrese_cedula.setForeground(Color.black);
        }

        if(ingrese_apellido. getText().isEmpty()){
            ingrese_apellido.setText("Ingrese los apellidos");
            ingrese_apellido.setForeground(Color.gray);
        }

        if(ingrese_telefono. getText().isEmpty()){
            ingrese_telefono.setText("Ingrese el numero de telefono");
            ingrese_telefono.setForeground(Color.gray);
        }

        if(ingrese_direccion. getText().isEmpty()){
            ingrese_direccion.setText("Ingrese direccion de residencia");
            ingrese_direccion.setForeground(Color.gray);
        }

        if(ingrese_email. getText().isEmpty()){
            ingrese_email.setText("Ingrese el @email");
            ingrese_email.setForeground(Color.gray);
        }
    }//GEN-LAST:event_ingrese_cedulaMousePressed

    private void ingrese_apellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingrese_apellidoMousePressed

        if(ingrese_nombre. getText().isEmpty()){
            ingrese_nombre.setText("Ingrese el nombre");
            ingrese_nombre.setForeground(Color.gray);
        }

        if(ingrese_cedula. getText().isEmpty()){
            ingrese_cedula.setText("Ingrese numero de cedula");
            ingrese_cedula.setForeground(Color.gray);
        }

        if(ingrese_apellido.getText().equals("Ingrese los apellidos")){
            ingrese_apellido.setText("");
            ingrese_apellido.setForeground(Color.black);
        }

        if(ingrese_telefono. getText().isEmpty()){
            ingrese_telefono.setText("Ingrese el numero de telefono");
            ingrese_telefono.setForeground(Color.gray);
        }

        if(ingrese_direccion. getText().isEmpty()){
            ingrese_direccion.setText("Ingrese direccion de residencia");
            ingrese_direccion.setForeground(Color.gray);
        }

        if(ingrese_email. getText().isEmpty()){
            ingrese_email.setText("Ingrese el @email");
            ingrese_email.setForeground(Color.gray);
        }
    }//GEN-LAST:event_ingrese_apellidoMousePressed

    private void ingrese_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingrese_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingrese_apellidoActionPerformed

    private void ingrese_telefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingrese_telefonoMousePressed

        if(ingrese_nombre. getText().isEmpty()){
            ingrese_nombre.setText("Ingrese el nombre");
            ingrese_nombre.setForeground(Color.gray);
        }

        if(ingrese_cedula. getText().isEmpty()){
            ingrese_cedula.setText("");
            ingrese_cedula.setForeground(Color.gray);
        }

        if(ingrese_apellido. getText().isEmpty()){
            ingrese_apellido.setText("Ingrese los apellidos");
            ingrese_apellido.setForeground(Color.gray);
        }

        if(ingrese_telefono.getText().equals("Ingrese el numero de telefono")){
            ingrese_telefono.setText("");
            ingrese_telefono.setForeground(Color.black);
        }

        if(ingrese_direccion. getText().isEmpty()){
            ingrese_direccion.setText("Ingrese direccion de residencia");
            ingrese_direccion.setForeground(Color.gray);
        }

        if(ingrese_email. getText().isEmpty()){
            ingrese_email.setText("Ingrese el @email");
            ingrese_email.setForeground(Color.gray);
        }
    }//GEN-LAST:event_ingrese_telefonoMousePressed

    private void ingrese_emailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingrese_emailMousePressed
        if(ingrese_nombre. getText().isEmpty()){
            ingrese_nombre.setText("Ingrese el nombre");
            ingrese_nombre.setForeground(Color.gray);
        }

        if(ingrese_cedula. getText().isEmpty()){
            ingrese_cedula.setText("");
            ingrese_cedula.setForeground(Color.gray);
        }

        if(ingrese_apellido. getText().isEmpty()){
            ingrese_apellido.setText("Ingrese los apellidos");
            ingrese_apellido.setForeground(Color.gray);
        }

        if(ingrese_telefono. getText().isEmpty()){
            ingrese_telefono.setText("Ingrese el numero de telefono");
            ingrese_telefono.setForeground(Color.gray);
        }

        if(ingrese_direccion. getText().isEmpty()){
            ingrese_direccion.setText("Ingrese direccion de residencia");
            ingrese_direccion.setForeground(Color.gray);
        }

        if(ingrese_email.getText().equals("Ingrese el @email")){
            ingrese_email.setText("");
            ingrese_email.setForeground(Color.black);
        }
    }//GEN-LAST:event_ingrese_emailMousePressed

    private void ingrese_direccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingrese_direccionMousePressed
        if(ingrese_nombre. getText().isEmpty()){
            ingrese_nombre.setText("Ingrese el nombre");
            ingrese_nombre.setForeground(Color.gray);
        }

        if(ingrese_cedula. getText().isEmpty()){
            ingrese_cedula.setText("");
            ingrese_cedula.setForeground(Color.gray);
        }

        if(ingrese_apellido. getText().isEmpty()){
            ingrese_apellido.setText("Ingrese los apellidos");
            ingrese_apellido.setForeground(Color.gray);
        }

        if(ingrese_telefono. getText().isEmpty()){
            ingrese_telefono.setText("Ingrese el numero de telefono");
            ingrese_telefono.setForeground(Color.gray);
        }

        if(ingrese_direccion.getText().equals("Ingrese direccion de residencia")){
            ingrese_direccion.setText("");
            ingrese_direccion.setForeground(Color.black);
        }

        if(ingrese_email. getText().isEmpty()){
            ingrese_email.setText("Ingrese el @email");
            ingrese_email.setForeground(Color.gray);
        }
    }//GEN-LAST:event_ingrese_direccionMousePressed

    private void panel_buscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_buscarMouseEntered
        panel_buscar.setBackground(Color.orange);
    }//GEN-LAST:event_panel_buscarMouseEntered

    private void panel_buscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_buscarMouseExited
        panel_buscar.setBackground(new Color(51,204,0));
    }//GEN-LAST:event_panel_buscarMouseExited

    private void panel_agregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_agregarMouseEntered
        panel_agregar.setBackground(Color.orange);
    }//GEN-LAST:event_panel_agregarMouseEntered

    private void panel_agregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_agregarMouseExited
        panel_agregar.setBackground(new Color(51,204,0));
    }//GEN-LAST:event_panel_agregarMouseExited

    private void panel_modificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_modificarMouseEntered
        panel_modificar.setBackground(Color.orange);
    }//GEN-LAST:event_panel_modificarMouseEntered

    private void panel_modificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_modificarMouseExited
        panel_modificar.setBackground(new Color(51,204,0));
    }//GEN-LAST:event_panel_modificarMouseExited

    private void panel_mostrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_mostrarMouseEntered
        panel_mostrar.setBackground(Color.orange);
    }//GEN-LAST:event_panel_mostrarMouseEntered

    private void panel_mostrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_mostrarMouseExited
        panel_mostrar.setBackground(new Color(51,204,0));
    }//GEN-LAST:event_panel_mostrarMouseExited

    private void panel_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_agregarMouseClicked
        try {
            Conexion con = new Conexion();
            con.ConexionPostgres();
            
            formato1= DateFormat.getDateInstance();
            sfecha = formato1.format(fecha.getDate());
            
            if(ingrese_email.getText().contains("@") && ingrese_email.getText().contains(".")){
                if(ingrese_telefono.getText().length()==10){
                    String query = "INSERT INTO empleado VALUES ("+ Long.parseLong(ingrese_cedula.getText().trim())+",'"+ ingrese_nombre.getText().trim()+"','"+ ingrese_apellido.getText().trim()+"',"+ Long.parseLong(ingrese_telefono.getText().trim())+",'"+ ingrese_email.getText().trim()+"','"+ ingrese_direccion.getText().trim()+"','"+ sfecha +"')";
                    JOptionPane.showMessageDialog(this, "Registro exitoso");
                    con.actualizar(query);
                    
                    con.cerrar();
                    ingrese_cedula.setText(null);
                    ingrese_nombre.setText(null);
                    ingrese_apellido.setText(null);
                    ingrese_telefono.setText(null);
                    ingrese_email.setText(null);
                    ingrese_direccion.setText(null);
                    fecha.setDate(null);
                }                
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_panel_agregarMouseClicked

    private void panel_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_buscarMouseClicked
    try {
        Conexion con = new Conexion();
        con.ConexionPostgres();
        
        String query = "SELECT * FROM Empleado WHERE cedula_empleado ="+ Long.parseLong(ingrese_cedula.getText().trim());
        ResultSet rs = con.consultar(query);
        
        if (rs.next()){
            
            ingrese_cedula.setText(rs.getString("cedula_empleado"));
            ingrese_nombre.setText(rs.getString("nombre1_empleado"));
            ingrese_apellido.setText(rs.getString("apellido1_empleado"));
            ingrese_telefono.setText(rs.getString("telefono_empleado"));
            ingrese_email.setText(rs.getString("correo_empleado"));
            ingrese_direccion.setText(rs.getString("direccion_empleado"));
            fecha.setDate(rs.getDate("fecha_ingreso_empleado")); 
        }
        else{
            JOptionPane.showMessageDialog(this,"N0 existe el empleado");
        }
            ingrese_cedula.setForeground(Color.BLACK);
            ingrese_nombre.setForeground(Color.BLACK);
            ingrese_apellido.setForeground(Color.BLACK);
            ingrese_telefono.setForeground(Color.BLACK);
            ingrese_email.setForeground(Color.BLACK);
            ingrese_direccion.setForeground(Color.BLACK);
            fecha.setForeground(Color.BLACK);
            
            con.cerrar();
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_panel_buscarMouseClicked

    private void panel_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_modificarMouseClicked
    try {
        Conexion con = new Conexion();
        con.ConexionPostgres();
        
        formato1= DateFormat.getDateInstance();
        sfecha = formato1.format(fecha.getDate());
        
        String query = "UPDATE empleado SET nombre1_empleado ='" + ingrese_nombre.getText().trim()+"', apellido1_empleado ='" + ingrese_apellido.getText().trim()+"', telefono_empleado = "+ Long.parseLong(ingrese_telefono.getText().trim())+", correo_empleado ='"+ ingrese_email.getText().trim()+"', direccion_empleado = '"+ ingrese_direccion.getText().trim()+"', fecha_ingreso_empleado = '"+ sfecha +"' WHERE cedula_empleado = "+ Long.parseLong(ingrese_cedula.getText().trim());
        JOptionPane.showMessageDialog(this,"Datos actualizados!");
        con.actualizar(query);
        
        con.cerrar();
        ingrese_cedula.setText(null);
        ingrese_nombre.setText(null);
        ingrese_apellido.setText(null);
        ingrese_telefono.setText(null);
        ingrese_email.setText(null);
        ingrese_direccion.setText(null);
        fecha.setDate(null);
        
             
        
        } catch (ClassNotFoundException ex) {
        Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_panel_modificarMouseClicked

    // SUBIR   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agregar;
    private javax.swing.JLabel apellido;
    private javax.swing.JLabel buscar;
    private javax.swing.JLabel cedula;
    private javax.swing.JLabel direccion;
    private javax.swing.JLabel email;
    private javax.swing.JLabel empleado;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel fecha_ingreso;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel icono_agregar;
    private javax.swing.JLabel icono_buscar;
    private javax.swing.JLabel icono_modificar;
    private javax.swing.JLabel icono_mostrar;
    private javax.swing.JTextField ingrese_apellido;
    private javax.swing.JTextField ingrese_cedula;
    private javax.swing.JTextField ingrese_direccion;
    private javax.swing.JTextField ingrese_email;
    private javax.swing.JTextField ingrese_nombre;
    private javax.swing.JTextField ingrese_telefono;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel modificar;
    private javax.swing.JLabel mostrar;
    private javax.swing.JLabel nombre;
    private javax.swing.JPanel panel_agregar;
    private javax.swing.JPanel panel_agrofacil;
    private javax.swing.JPanel panel_buscar;
    private javax.swing.JPanel panel_modificar;
    private javax.swing.JPanel panel_mostrar;
    private javax.swing.JLabel telefono;
    // End of variables declaration//GEN-END:variables
}