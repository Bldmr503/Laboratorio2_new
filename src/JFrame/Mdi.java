/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame;

import java.awt.Dimension;

/**
 *
 * @author Eduardo
 */
public class Mdi extends javax.swing.JFrame {

    /**
     * Creates new form Mdi
     */
    public Mdi() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        RegistrarMenuItem = new javax.swing.JMenuItem();
        detalleMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        AgregarMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Mdi.jpg"))); // NOI18N
        desktopPane.add(jLabel1);
        jLabel1.setBounds(0, 0, 760, 530);

        getContentPane().add(desktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 752, 529));

        fileMenu.setMnemonic('f');
        fileMenu.setText("Medicamentos");

        RegistrarMenuItem.setMnemonic('o');
        RegistrarMenuItem.setText("Registrar Medicamento");
        RegistrarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(RegistrarMenuItem);

        detalleMenuItem.setText("Detalle Medicamento");
        detalleMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detalleMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(detalleMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Usuarios");

        AgregarMenuItem.setMnemonic('t');
        AgregarMenuItem.setText("Agregar Usuario");
        AgregarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(AgregarMenuItem);

        menuBar.add(editMenu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarMenuItemActionPerformed
        Registro rg = new Registro();
       rg.setVisible(true);
    }//GEN-LAST:event_RegistrarMenuItemActionPerformed

    private void AgregarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarMenuItemActionPerformed
        Agregarusers adduser = new Agregarusers();
        desktopPane.add(adduser);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = adduser.getSize();
        adduser.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);        
        adduser.show();
    }//GEN-LAST:event_AgregarMenuItemActionPerformed

    private void detalleMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detalleMenuItemActionPerformed
       detalle_medicamentos dtmed = new detalle_medicamentos();
       desktopPane.add(dtmed);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = dtmed.getSize();
        dtmed.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);        
        dtmed.show();
    }//GEN-LAST:event_detalleMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(Mdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mdi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AgregarMenuItem;
    private javax.swing.JMenuItem RegistrarMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem detalleMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
