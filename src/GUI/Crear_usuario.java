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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



/**
 *
 * @author Antonio
 */
public class Crear_usuario extends javax.swing.JPanel {

    
    /**
     * Creates new form Principal
     */
    public Crear_usuario() {
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
        usuario = new javax.swing.JLabel();
        contraseña = new javax.swing.JLabel();
        confi_contraseña = new javax.swing.JLabel();
        cree_usuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        cree_contraseña = new javax.swing.JPasswordField();
        confirmar_contraseña = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        crear = new javax.swing.JPanel();
        crear_cuenta = new javax.swing.JLabel();
        icono_usuario = new javax.swing.JLabel();
        icono_contraseña = new javax.swing.JLabel();
        icono_conficontraseña = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_agrofacil.setBackground(new java.awt.Color(0, 204, 0));
        panel_agrofacil.setLayout(null);

        empleado.setFont(new java.awt.Font("Leelawadee UI", 3, 48)); // NOI18N
        empleado.setForeground(new java.awt.Color(255, 255, 255));
        empleado.setText("CREAR CUENTA");
        panel_agrofacil.add(empleado);
        empleado.setBounds(160, 20, 380, 64);

        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_login1.png"))); // NOI18N
        panel_agrofacil.add(icono);
        icono.setBounds(610, 10, 107, 95);

        add(panel_agrofacil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 110));

        usuario.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        usuario.setText("CREE UN USUARIO");
        add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, 30));

        contraseña.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        contraseña.setText("CREE UNA CONTRASEÑA");
        add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, 30));

        confi_contraseña.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        confi_contraseña.setText("CONFIRMAR CONTRASEÑA");
        confi_contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                confi_contraseñaMousePressed(evt);
            }
        });
        add(confi_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, 40));

        cree_usuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cree_usuario.setForeground(new java.awt.Color(153, 153, 153));
        cree_usuario.setText("Cree un usuario");
        cree_usuario.setBorder(null);
        cree_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cree_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cree_usuarioMousePressed(evt);
            }
        });
        add(cree_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 260, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 250, 10));

        cree_contraseña.setForeground(new java.awt.Color(153, 153, 153));
        cree_contraseña.setText("********");
        cree_contraseña.setBorder(null);
        cree_contraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cree_contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cree_contraseñaMousePressed(evt);
            }
        });
        add(cree_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 110, 30));

        confirmar_contraseña.setForeground(new java.awt.Color(153, 153, 153));
        confirmar_contraseña.setText("********");
        confirmar_contraseña.setBorder(null);
        confirmar_contraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirmar_contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                confirmar_contraseñaMousePressed(evt);
            }
        });
        add(confirmar_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 324, 90, 30));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 250, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 250, 10));

        crear.setBackground(new java.awt.Color(51, 204, 0));
        crear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                crearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                crearMouseExited(evt);
            }
        });

        crear_cuenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        crear_cuenta.setForeground(new java.awt.Color(255, 255, 255));
        crear_cuenta.setText("     Crear cuenta");

        javax.swing.GroupLayout crearLayout = new javax.swing.GroupLayout(crear);
        crear.setLayout(crearLayout);
        crearLayout.setHorizontalGroup(
            crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(crear_cuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        crearLayout.setVerticalGroup(
            crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(crear_cuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        add(crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 130, 40));

        icono_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user.png"))); // NOI18N
        add(icono_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, 30));

        icono_contraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lock.png"))); // NOI18N
        add(icono_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, 30));

        icono_conficontraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lock.png"))); // NOI18N
        add(icono_conficontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void confi_contraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confi_contraseñaMousePressed

    }//GEN-LAST:event_confi_contraseñaMousePressed

    private void cree_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cree_usuarioMousePressed
        if(cree_usuario.getText().equals("Cree un usuario")){
            cree_usuario.setText("");
            cree_usuario.setForeground(Color.black);
        }

        if(String.valueOf(cree_contraseña.getPassword()).isEmpty()){
            cree_contraseña.setText("********");
            cree_contraseña.setForeground(Color.gray);
        }

        if(String.valueOf(confirmar_contraseña.getPassword()).isEmpty()){
            confirmar_contraseña.setText("********");
            confirmar_contraseña.setForeground(Color.gray);
        }

    }//GEN-LAST:event_cree_usuarioMousePressed

    private void cree_contraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cree_contraseñaMousePressed
        if(String.valueOf(cree_contraseña.getPassword()).equals("********")){
            cree_contraseña.setText("");
            cree_contraseña.setForeground(Color.black);
        }

        if(cree_usuario.getText().isEmpty()){
            cree_usuario.setText("Cree un usuario");
            cree_usuario.setForeground(Color.gray);
        }

        if(String.valueOf(confirmar_contraseña.getPassword()).isEmpty()){
            confirmar_contraseña.setText("********");
            confirmar_contraseña.setForeground(Color.gray);
        }
    }//GEN-LAST:event_cree_contraseñaMousePressed

    private void confirmar_contraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmar_contraseñaMousePressed
        if(String.valueOf(confirmar_contraseña.getPassword()).equals("********")){
            confirmar_contraseña.setText("");
            confirmar_contraseña.setForeground(Color.black);
        }

        if(cree_usuario.getText().isEmpty()){
            cree_usuario.setText("Cree un usuario");
            cree_usuario.setForeground(Color.gray);
        }

        if(String.valueOf(cree_contraseña.getPassword()).isEmpty()){
            cree_contraseña.setText("********");
            cree_contraseña.setForeground(Color.gray);
        }
    }//GEN-LAST:event_confirmar_contraseñaMousePressed

    private void crearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearMouseEntered
        crear.setBackground(Color.orange);
    }//GEN-LAST:event_crearMouseEntered

    private void crearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearMouseExited
        crear.setBackground(new Color(51,204,0));
    }//GEN-LAST:event_crearMouseExited

    private void crearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearMouseClicked
        try {
            Conexion con = new Conexion();
            con.ConexionPostgres();
            String pass1= String.valueOf(cree_contraseña.getPassword());
            String pass2= String.valueOf(confirmar_contraseña.getPassword());
            
            if(pass1.equals(pass2)){
                String query ="insert into usuario values('"+cree_usuario.getText()+"',"+String.valueOf(cree_contraseña.getPassword())+"')";
                JOptionPane.showMessageDialog(this, "¡Cuenta creada con exito!");
                
                con.actualizar(query);
            }
            else{
                JOptionPane.showMessageDialog(this,"¡Cuenta creada exitosamente!");
            }
            
            con.cerrar();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Crear_usuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Crear_usuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Crear_usuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Crear_usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_crearMouseClicked

    // SUBIR   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel confi_contraseña;
    private javax.swing.JPasswordField confirmar_contraseña;
    private javax.swing.JLabel contraseña;
    private javax.swing.JPanel crear;
    private javax.swing.JLabel crear_cuenta;
    private javax.swing.JPasswordField cree_contraseña;
    private javax.swing.JTextField cree_usuario;
    private javax.swing.JLabel empleado;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel icono_conficontraseña;
    private javax.swing.JLabel icono_contraseña;
    private javax.swing.JLabel icono_usuario;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel panel_agrofacil;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
