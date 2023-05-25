/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

/**
 *
 * @author Administrador
 */
public class TelaMenu extends javax.swing.JFrame {

    /**
     * Creates new form TelaMenu
     */
    public TelaMenu() {
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

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuDepartamentos = new javax.swing.JMenu();
        itmCadastrarDepartamento = new javax.swing.JMenuItem();
        itmConsultarDepartamento = new javax.swing.JMenuItem();
        itmExcluirDepartamento = new javax.swing.JMenuItem();
        itmAlterarDepartamento = new javax.swing.JMenuItem();
        itmListarDepartamento = new javax.swing.JMenuItem();
        mnuFuncionarios = new javax.swing.JMenu();
        itmCadastrarFuncionario = new javax.swing.JMenuItem();
        itmAlterarFuncionario = new javax.swing.JMenuItem();
        itmConsultarFuncionario = new javax.swing.JMenuItem();
        itmExcluirFuncionario = new javax.swing.JMenuItem();
        itmListar = new javax.swing.JMenuItem();
        mnuUsuarios = new javax.swing.JMenu();
        itmCadastrarUsuario = new javax.swing.JMenuItem();
        itmConsultarUsuario = new javax.swing.JMenuItem();
        itmAlterarUsuario = new javax.swing.JMenuItem();
        itmExcluirUsuario = new javax.swing.JMenuItem();
        itmListarUsuario = new javax.swing.JMenuItem();
        mnuAjuda = new javax.swing.JMenu();
        itmManualUsuario = new javax.swing.JMenuItem();
        itmSuporte = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal ");
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/cityscape-city-building-architecture-wallpaper-preview.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 710, 430);

        mnuDepartamentos.setText("Departamentos ");

        itmCadastrarDepartamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmCadastrarDepartamento.setText("Cadastrar");
        itmCadastrarDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarDepartamentoActionPerformed(evt);
            }
        });
        mnuDepartamentos.add(itmCadastrarDepartamento);

        itmConsultarDepartamento.setText("Consultar ");
        itmConsultarDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmConsultarDepartamentoActionPerformed(evt);
            }
        });
        mnuDepartamentos.add(itmConsultarDepartamento);

        itmExcluirDepartamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmExcluirDepartamento.setText("Excluir");
        itmExcluirDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirDepartamentoActionPerformed(evt);
            }
        });
        mnuDepartamentos.add(itmExcluirDepartamento);

        itmAlterarDepartamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmAlterarDepartamento.setText("Alterar");
        itmAlterarDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAlterarDepartamentoActionPerformed(evt);
            }
        });
        mnuDepartamentos.add(itmAlterarDepartamento);

        itmListarDepartamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmListarDepartamento.setText("Listar");
        itmListarDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmListarDepartamentoActionPerformed(evt);
            }
        });
        mnuDepartamentos.add(itmListarDepartamento);

        jMenuBar1.add(mnuDepartamentos);

        mnuFuncionarios.setText("Funcionários ");

        itmCadastrarFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmCadastrarFuncionario.setText("Cadastrar");
        itmCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarFuncionarioActionPerformed(evt);
            }
        });
        mnuFuncionarios.add(itmCadastrarFuncionario);

        itmAlterarFuncionario.setText("Alterar");
        mnuFuncionarios.add(itmAlterarFuncionario);

        itmConsultarFuncionario.setText("Consultar");
        mnuFuncionarios.add(itmConsultarFuncionario);

        itmExcluirFuncionario.setText("Excluir");
        mnuFuncionarios.add(itmExcluirFuncionario);

        itmListar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmListar.setText("Listar");
        mnuFuncionarios.add(itmListar);

        jMenuBar1.add(mnuFuncionarios);

        mnuUsuarios.setText("Usuários ");

        itmCadastrarUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmCadastrarUsuario.setText("Casdatrar");
        itmCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarUsuarioActionPerformed(evt);
            }
        });
        mnuUsuarios.add(itmCadastrarUsuario);

        itmConsultarUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmConsultarUsuario.setText("Consultar ");
        itmConsultarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmConsultarUsuarioActionPerformed(evt);
            }
        });
        mnuUsuarios.add(itmConsultarUsuario);

        itmAlterarUsuario.setText("Alterar");
        mnuUsuarios.add(itmAlterarUsuario);

        itmExcluirUsuario.setText("Excluir ");
        mnuUsuarios.add(itmExcluirUsuario);

        itmListarUsuario.setText("Listar");
        mnuUsuarios.add(itmListarUsuario);

        jMenuBar1.add(mnuUsuarios);

        mnuAjuda.setText("Ajuda");

        itmManualUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itmManualUsuario.setText("Manual do usuário");
        mnuAjuda.add(itmManualUsuario);

        itmSuporte.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itmSuporte.setText("Suporte");
        mnuAjuda.add(itmSuporte);

        jMenuBar1.add(mnuAjuda);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(726, 460));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmCadastrarDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarDepartamentoActionPerformed
        
        new TelaControleDepartamento().setVisible(true);
        
    }//GEN-LAST:event_itmCadastrarDepartamentoActionPerformed

    private void itmCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarUsuarioActionPerformed
       new TelaControleUsuario().setVisible(true);
    }//GEN-LAST:event_itmCadastrarUsuarioActionPerformed

    private void itmConsultarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmConsultarUsuarioActionPerformed
        new TelaControleDepartamento().setVisible(true);
    }//GEN-LAST:event_itmConsultarUsuarioActionPerformed

    private void itmConsultarDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmConsultarDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmConsultarDepartamentoActionPerformed

    private void itmCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarFuncionarioActionPerformed
        new TelaCadastroFuncionario().setVisible(true);
    }//GEN-LAST:event_itmCadastrarFuncionarioActionPerformed

    private void itmExcluirDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirDepartamentoActionPerformed
         new TelaControleDepartamento().setVisible(true);
    }//GEN-LAST:event_itmExcluirDepartamentoActionPerformed

    private void itmAlterarDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAlterarDepartamentoActionPerformed
        new TelaControleDepartamento().setVisible(true);
    }//GEN-LAST:event_itmAlterarDepartamentoActionPerformed

    private void itmListarDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmListarDepartamentoActionPerformed
        new TelaListarDepartamentos().setVisible(true);
    }//GEN-LAST:event_itmListarDepartamentoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmAlterarDepartamento;
    private javax.swing.JMenuItem itmAlterarFuncionario;
    private javax.swing.JMenuItem itmAlterarUsuario;
    private javax.swing.JMenuItem itmCadastrarDepartamento;
    private javax.swing.JMenuItem itmCadastrarFuncionario;
    private javax.swing.JMenuItem itmCadastrarUsuario;
    private javax.swing.JMenuItem itmConsultarDepartamento;
    private javax.swing.JMenuItem itmConsultarFuncionario;
    private javax.swing.JMenuItem itmConsultarUsuario;
    private javax.swing.JMenuItem itmExcluirDepartamento;
    private javax.swing.JMenuItem itmExcluirFuncionario;
    private javax.swing.JMenuItem itmExcluirUsuario;
    private javax.swing.JMenuItem itmListar;
    private javax.swing.JMenuItem itmListarDepartamento;
    private javax.swing.JMenuItem itmListarUsuario;
    private javax.swing.JMenuItem itmManualUsuario;
    private javax.swing.JMenuItem itmSuporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuAjuda;
    private javax.swing.JMenu mnuDepartamentos;
    private javax.swing.JMenu mnuFuncionarios;
    private javax.swing.JMenu mnuUsuarios;
    // End of variables declaration//GEN-END:variables
}
