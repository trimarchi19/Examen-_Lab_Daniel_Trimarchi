/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_daniel_trimarchi;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author X
 */
public class Main extends javax.swing.JFrame {

    adminUsuario au;
    adminAlbum aa;

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        au = new adminUsuario("./usuarios.cbm");
        aa = new adminAlbum("./albums.cbm");
        au.cargarArchivo();
        aa.cargarArchivo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        log = new javax.swing.JDialog();
        guardar = new javax.swing.JDialog();
        nom = new javax.swing.JTextField();
        us = new javax.swing.JTextField();
        edad = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        album = new javax.swing.JDialog();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        art = new javax.swing.JTextField();
        albumn = new javax.swing.JTextField();
        cancion = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        genero = new javax.swing.JTextField();
        ncancion = new javax.swing.JTextField();
        c_art = new javax.swing.JTextField();
        cb_album = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        duracion1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jDialog5 = new javax.swing.JDialog();
        jTextField1 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        javax.swing.GroupLayout logLayout = new javax.swing.GroupLayout(log.getContentPane());
        log.getContentPane().setLayout(logLayout);
        logLayout.setHorizontalGroup(
            logLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );
        logLayout.setVerticalGroup(
            logLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        guardar.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        guardar.getContentPane().add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 55, 113, 42));
        guardar.getContentPane().add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 103, 113, 42));
        guardar.getContentPane().add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 113, 42));
        guardar.getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 113, 42));

        jLabel1.setText("Crear Usuario");
        guardar.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 11, 144, 38));

        jLabel3.setText("Nombre");
        guardar.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 95, 52));

        jLabel4.setText("Edad");
        guardar.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 95, 52));

        jLabel5.setText("Password");
        guardar.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 95, 52));

        jLabel6.setText("Username");
        guardar.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 95, 52));

        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        guardar.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 313, 90, 40));

        album.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("Crear Album");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        album.getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 118, 38));

        jLabel7.setText("Nombre Del Album");
        album.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 89, 96, 42));

        jLabel8.setText("Artista");
        album.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 11, 96, 42));
        album.getContentPane().add(art, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 12, 136, 41));
        album.getContentPane().add(albumn, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 98, 136, 41));

        cancion.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel9.setText("Crear Cancion");
        cancion.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 92, 50));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel10.setText("Album");
        cancion.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 92, 50));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel11.setText("Genero");
        cancion.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 100, 40));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel12.setText("Artista");
        cancion.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 91, 92, 50));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel13.setText("Nombre");
        cancion.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 35, 92, 50));
        cancion.getContentPane().add(genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 103, 40));
        cancion.getContentPane().add(ncancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 46, 103, 40));
        cancion.getContentPane().add(c_art, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 103, 40));

        cb_album.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        cancion.getContentPane().add(cb_album, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 110, 40));

        jButton4.setText("Crear Cancion");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        cancion.getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 110, 40));
        cancion.getContentPane().add(duracion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 103, 40));

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel14.setText("Duracion (Seg)");
        cancion.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 218, 100, 40));

        javax.swing.GroupLayout jDialog5Layout = new javax.swing.GroupLayout(jDialog5.getContentPane());
        jDialog5.getContentPane().setLayout(jDialog5Layout);
        jDialog5Layout.setHorizontalGroup(
            jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog5Layout.setVerticalGroup(
            jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton1.setText("Usuarios");
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 80, 89, 67));

        jToggleButton4.setText("Albums");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 80, 89, 67));

        jToggleButton5.setText("Guardar Usuario");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 80, -1, 67));

        jToggleButton6.setText("Cargar Usuarios");
        getContentPane().add(jToggleButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 182, 120, 62));

        jToggleButton7.setText("Log in");
        getContentPane().add(jToggleButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 182, 89, 62));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Menu Principal");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 11, 204, 42));

        jButton3.setText("Canciones");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 178, 89, 71));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nombre = nom.getText();
        String ed = edad.getText();
        String password = pass.getText();
        String user = us.getText();
        nom.setText("");
        us.setText("");
        pass.setText("");
        edad.setText("");
        Usuario temp = new Usuario(nombre, ed, user, password);
        adminUsuario au = new adminUsuario("./usuarios.cbm");
        au.setPersona(temp);
        au.escribirArchivo();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        // TODO add your handling code here:
        guardar.setModal(true);
        guardar.pack();
        guardar.setAlwaysOnTop(true);
        guardar.setVisible(true);
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
        album.setModal(true);
        album.pack();
        album.setAlwaysOnTop(true);
        album.setVisible(true);
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            String artista = art.getText();
            String nombre_album = albumn.getText();
            art.setText("");
            albumn.setText("");
            Album ab = new Album(artista, nombre_album);
            DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_album.getModel();
            modelo.addElement(ab);
            cb_album.setModel(modelo);
            JOptionPane.showMessageDialog(null, "Creacion del Album Exitosa");
            boolean existe = false;
            for (int i = 0; i < aa.getListAlbum().size(); i++) {
                if (aa.getListAlbum().get(i).equals(ab)) {
                    System.out.println("Este Album ya Existe");
                    existe = true;
                }
            }
            if (existe == false) {
                aa.getListAlbum().add(ab);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        cancion.setModal(true);
        cancion.pack();
        cancion.setAlwaysOnTop(true);
        cancion.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {
            DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_album.getModel();
            if (modelo.getSelectedItem() instanceof Album) {
                Album alb = (Album) modelo.getSelectedItem();
                String artista = c_art.getText();
                String Cancion = ncancion.getText();
                int dura = Integer.parseInt(genero.getText());
                String gener = genero.getText();
                Cancion temps = new Cancion(Cancion, artista, alb, dura, gener);
                boolean existe=false;
                for (int i = 0; i < aa.getListAlbum().size(); i++) {
                    if (aa.getListAlbum().get(i).equals(alb)) {
                        existe = true;
                        System.out.println("ENtrooo y Encontro");
                        aa.getListAlbum().get(i).getCancion().add(temps);
                    }
                }
                aa.getListAlbum().add(alb);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog album;
    private javax.swing.JTextField albumn;
    private javax.swing.JTextField art;
    private javax.swing.JTextField c_art;
    private javax.swing.JDialog cancion;
    private javax.swing.JComboBox<String> cb_album;
    private javax.swing.JTextField duracion1;
    private javax.swing.JTextField edad;
    private javax.swing.JTextField genero;
    private javax.swing.JDialog guardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDialog jDialog5;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JDialog log;
    private javax.swing.JTextField ncancion;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField pass;
    private javax.swing.JTextField us;
    // End of variables declaration//GEN-END:variables
}