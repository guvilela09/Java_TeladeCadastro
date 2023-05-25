
package telas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaListarDepartamentos extends javax.swing.JFrame {

    
    public TelaListarDepartamentos() {
        initComponents();
    try {
            // - Indicar o nome da classe do driver que está na library do projeto
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_quartas", "root", "212303");
            //Buscar todos os departamentos na tabela
            PreparedStatement st = conectado.prepareStatement("SELECT * FROM departamento");
            ResultSet departamentos = st.executeQuery(); // Executa o Select na tabela
            //Obter o modelo (ou molde) da  tabela tblDepartamentos do form
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblDepartamentos.getModel();
            //Limpa ou zera a tabela tblDepartamentos do form
            modeloTabela.setRowCount(0);
            //Passar por cada linha de departamento, até terminar 
            while (departamentos.next()) {
               Object dados[] = {
                departamentos.getString("codigo"),
                departamentos.getString("nome"),
                departamentos.getString("cidade"),
                departamentos.getString("telefone"),
               };
               //Jogar no tblDepartamentos
               modeloTabela.addRow(dados);
               cmbCidade.addItem(departamentos.getString("cidade"));
            }

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }    
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDepartamentos = new javax.swing.JTable();
        lblCidade = new javax.swing.JLabel();
        cmbCidade = new javax.swing.JComboBox<>();

        setTitle("Listagem de departamentos");
        getContentPane().setLayout(null);

        tblDepartamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Cidade", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDepartamentos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 50, 650, 260);

        lblCidade.setText("Cidade");
        getContentPane().add(lblCidade);
        lblCidade.setBounds(20, 20, 50, 20);

        cmbCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCidadeActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCidade);
        cmbCidade.setBounds(70, 20, 110, 20);

        setSize(new java.awt.Dimension(682, 376));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCidadeActionPerformed
          try {
            // - Indicar o nome da classe do driver que está na library do projeto
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_quartas", "root", "212303");
            //Buscar todos os departamentos na tabela
            PreparedStatement st = conectado.prepareStatement("SELECT * FROM departamento WHERE cidade= ? ");
            st.setString(1, cmbCidade.getSelectedItem().toString());
            ResultSet departamentos = st.executeQuery(); // Executa o Select na tabela
            //Obter o modelo (ou molde) da  tabela tblDepartamentos do form
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblDepartamentos.getModel();
            //Limpa ou zera a tabela tblDepartamentos do form
            modeloTabela.setRowCount(0);
            //Passar por cada linha de departamento, até terminar 
            while (departamentos.next()) {
               Object dados[] = {
                departamentos.getString("codigo"),
                departamentos.getString("nome"),
                departamentos.getString("cidade"),
                departamentos.getString("telefone"),
               };
               //Jogar no tblDepartamentos
               modeloTabela.addRow(dados);
               
            }

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_cmbCidadeActionPerformed

  
    public static void main(String args[]) {

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaListarDepartamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbCidade;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JTable tblDepartamentos;
    // End of variables declaration//GEN-END:variables
}
