/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controller.ClienteController;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import model.Cliente;
import util.ButtonColumnCellRenderer;
import util.TableModelCliente;

/**
 *
 * @author User
 */
public class ScreenCliente extends javax.swing.JFrame {

    ClienteController clienteController = new ClienteController();
    
    TableModelCliente clienteModel;
    
    public ScreenCliente() {
        initComponents();
        initDataController();
        initComponetsModel();
        decorateTableTask();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblControleDeClientes = new javax.swing.JLabel();
        lblBusqueCliente = new javax.swing.JLabel();
        txtBuscaCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCliente = new javax.swing.JTable();
        lblAviso = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnBusca = new javax.swing.JButton();
        btnVoltarPainel = new javax.swing.JButton();
        Image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(10, 77, 104));
        jPanel1.setLayout(null);

        lblControleDeClientes.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblControleDeClientes.setForeground(new java.awt.Color(255, 255, 255));
        lblControleDeClientes.setText("Controle de Clientes");
        jPanel1.add(lblControleDeClientes);
        lblControleDeClientes.setBounds(245, 50, 234, 32);

        lblBusqueCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblBusqueCliente.setText("Busque o Cliente");
        jPanel1.add(lblBusqueCliente);
        lblBusqueCliente.setBounds(300, 110, 95, 16);

        txtBuscaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaClienteActionPerformed(evt);
            }
        });
        jPanel1.add(txtBuscaCliente);
        txtBuscaCliente.setBounds(260, 132, 182, 32);

        tableCliente.setBackground(new java.awt.Color(255, 255, 255));
        tableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CPF", "Nome Completo", "Editar", "Excluir"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCliente.setGridColor(new java.awt.Color(255, 255, 255));
        tableCliente.setRowHeight(35);
        tableCliente.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCliente);
        if (tableCliente.getColumnModel().getColumnCount() > 0) {
            tableCliente.getColumnModel().getColumn(0).setResizable(false);
            tableCliente.getColumnModel().getColumn(1).setResizable(false);
            tableCliente.getColumnModel().getColumn(2).setResizable(false);
            tableCliente.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(86, 220, 528, 178);

        lblAviso.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAviso.setForeground(new java.awt.Color(255, 255, 255));
        lblAviso.setText("O cliente n�o est� aparecendo?");
        jPanel1.add(lblAviso);
        lblAviso.setBounds(170, 430, 230, 19);

        btnCadastrar.setBackground(new java.awt.Color(0, 46, 116));
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar);
        btnCadastrar.setBounds(420, 420, 95, 43);

        btnBusca.setBackground(new java.awt.Color(0, 46, 116));
        btnBusca.setForeground(new java.awt.Color(255, 255, 255));
        btnBusca.setText("Buscar");
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });
        jPanel1.add(btnBusca);
        btnBusca.setBounds(315, 170, 71, 32);

        btnVoltarPainel.setBackground(new java.awt.Color(0, 46, 116));
        btnVoltarPainel.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltarPainel.setText("Voltar para o Painel");
        btnVoltarPainel.setBorder(null);
        btnVoltarPainel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarPainelActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltarPainel);
        btnVoltarPainel.setBounds(233, 471, 200, 80);

        Image.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background5.png"))); // NOI18N
        jPanel1.add(Image);
        Image.setBounds(0, 0, 730, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableClienteMouseClicked
        
        int rowIndex = tableCliente.rowAtPoint(evt.getPoint());
        int columnIndex = tableCliente.columnAtPoint(evt.getPoint());
        
        Cliente cliente = clienteModel.getClientes().get(rowIndex);
        
        
        switch(columnIndex) {
            case 2 :         
                QueryScreenCliente queryScreenCliente = new QueryScreenCliente(this,rootPaneCheckingEnabled);
                
                queryScreenCliente.getTxtNome().setText(cliente.getNomeCliente());
                queryScreenCliente.getTxtEndereco().setText(cliente.getEndereco());
                queryScreenCliente.getTxtEstado().setText(cliente.getUf());
                queryScreenCliente.getTxtTelefone().setText(cliente.getTelefone());
                queryScreenCliente.getTxtCpf().setText(cliente.getCpf());
                queryScreenCliente.getTxtEmail().setText(cliente.getEmail());
                queryScreenCliente.getLblShowId().setText(Integer.toString(cliente.getId()));
                
                queryScreenCliente.setVisible(true);
                
                queryScreenCliente.addWindowListener(new WindowAdapter() {
            
                        public void windowClosed(WindowEvent e) {
                
                        initDataController();
                        initComponetsModel();
                        decorateTableTask();
                         }
                    }) ;
               break;
            case 3 :
                 
               int resposta = JOptionPane.showOptionDialog(this,"Voc� realmente deseja apagar esse cliente?","Confirma��o",
           JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
            null,
            new String[]{"Sim", "N�o"},
            "Sim"
        );
        
        // Verifica qual bot�o foi pressionado
        if (resposta == JOptionPane.YES_OPTION) {
            clienteController.removeById(cliente.getId());
            clienteModel.getClientes().remove(cliente);
            initDataController();
            initComponetsModel();
            decorateTableTask();
        } 
            break; 
        }
    }//GEN-LAST:event_tableClienteMouseClicked

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
              
        RegistrationScreenCliente registrationScreenCliente = new RegistrationScreenCliente(this, rootPaneCheckingEnabled);
        
        
        registrationScreenCliente.setVisible(true);
        
        registrationScreenCliente.addWindowListener(new WindowAdapter() {
            
        public void windowClosed(WindowEvent e) {
                
        initDataController();
        initComponetsModel();
        decorateTableTask();
                         }
        }) ;
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnVoltarPainelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarPainelActionPerformed
        // TODO add your handling code here:
        
        ScreenPainel painelScreen = new ScreenPainel();
        dispose();
        painelScreen.setVisible(true);
    }//GEN-LAST:event_btnVoltarPainelActionPerformed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed

        initComponetsModel(txtBuscaCliente.getText());
        decorateTableTask();

    }//GEN-LAST:event_btnBuscaActionPerformed

    private void txtBuscaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaClienteActionPerformed

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
                new ScreenCliente().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Image;
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnVoltarPainel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JLabel lblBusqueCliente;
    private javax.swing.JLabel lblControleDeClientes;
    private javax.swing.JTable tableCliente;
    private javax.swing.JTextField txtBuscaCliente;
    // End of variables declaration//GEN-END:variables
 
     public void decorateTableTask() {
         

         
         tableCliente.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
         tableCliente.getTableHeader().setBackground(new Color(42, 47, 79));
         tableCliente.getTableHeader().setForeground(new Color(255, 255, 255));
         tableCliente.setAutoCreateRowSorter(true);
         
         lblAviso.setForeground(Color.WHITE);
         lblBusqueCliente.setForeground(Color.WHITE);
        lblControleDeClientes.setForeground(Color.WHITE);
         
        tableCliente.getTableHeader().setReorderingAllowed(false);
        tableCliente.setRowHeight(40);
        tableCliente.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        tableCliente.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
         
         tableCliente.getColumnModel().getColumn(2).setCellRenderer(new ButtonColumnCellRenderer("edit"));
         tableCliente.getColumnModel().getColumn(3).setCellRenderer(new ButtonColumnCellRenderer("delete"));

     }
     
     public void initDataController() {
         
         clienteController = new ClienteController();
     }
     
     public void initComponetsModel() {

         clienteModel = new TableModelCliente();
         tableCliente.setModel(clienteModel);
         
          loadClientes();   
     }
     
       public void initComponetsModel(String data) {

         clienteModel = new TableModelCliente();
         tableCliente.setModel(clienteModel);
         
          loadClientes(data);   
     }
     
     public void loadClientes() {
         
       List<Cliente> clientes = clienteController.getAll();
       clienteModel.setClientes(clientes);
     }
     
     public void loadClientes(String data) {
         
       List<Cliente> clientes = clienteController.getAllByCpfOrName(data);
       clienteModel.setClientes(clientes);
     }
}