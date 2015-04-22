
package admin;

import dao.PessoaDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Pessoa;

public class pessoaManter extends javax.swing.JFrame {

    List<Pessoa> lista;
    Integer posicao;
    
    public pessoaManter() {
        initComponents();
          PessoaDAO dao = new PessoaDAO();
        lista = dao.listar();
        posicao = 0;
      
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnprimeiro1 = new javax.swing.JButton();
        btnanterior1 = new javax.swing.JButton();
        btnproximo1 = new javax.swing.JButton();
        btnultimo1 = new javax.swing.JButton();
        lblcodigo1 = new javax.swing.JLabel();
        lblnome1 = new javax.swing.JLabel();
        lblsexo1 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
        sexo = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        btncadastrar1 = new javax.swing.JButton();
        btnexcluir1 = new javax.swing.JButton();
        btnconsultar1 = new javax.swing.JButton();
        btnlimpar1 = new javax.swing.JButton();
        btnirlistagem1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Navegação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        btnprimeiro1.setText("Primeiro");
        btnprimeiro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprimeiro1ActionPerformed(evt);
            }
        });

        btnanterior1.setText("Anterior");
        btnanterior1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnanterior1ActionPerformed(evt);
            }
        });

        btnproximo1.setText("Proximo");
        btnproximo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproximo1ActionPerformed(evt);
            }
        });

        btnultimo1.setText("Ultimo");
        btnultimo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnultimo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnprimeiro1)
                .addGap(47, 47, 47)
                .addComponent(btnanterior1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btnproximo1)
                .addGap(37, 37, 37)
                .addComponent(btnultimo1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnprimeiro1)
                    .addComponent(btnproximo1)
                    .addComponent(btnanterior1)
                    .addComponent(btnultimo1))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        lblcodigo1.setText("Codigo :");

        lblnome1.setText("Nome :");

        lblsexo1.setText("Sexo :");

        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Feminino", "Masculino" }));
        sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ações ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        btncadastrar1.setText("Cadastrar");
        btncadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadastrar1ActionPerformed(evt);
            }
        });

        btnexcluir1.setText("Excluir");
        btnexcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluir1ActionPerformed(evt);
            }
        });

        btnconsultar1.setText("Consultar");
        btnconsultar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultar1ActionPerformed(evt);
            }
        });

        btnlimpar1.setText("Limpar");
        btnlimpar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpar1ActionPerformed(evt);
            }
        });

        btnirlistagem1.setText("Ir para listagem");
        btnirlistagem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnirlistagem1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btncadastrar1)
                .addGap(14, 14, 14)
                .addComponent(btnexcluir1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnlimpar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnconsultar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(btnirlistagem1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncadastrar1)
                    .addComponent(btnconsultar1)
                    .addComponent(btnexcluir1)
                    .addComponent(btnlimpar1)
                    .addComponent(btnirlistagem1))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblcodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblnome1)
                                    .addComponent(lblsexo1))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nome)
                                    .addComponent(sexo, 0, 337, Short.MAX_VALUE)
                                    .addComponent(codigo)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcodigo1)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnome1)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsexo1)
                    .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void sexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexoActionPerformed

    private void btnprimeiro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprimeiro1ActionPerformed
      if (lista.size() > 0)
      {
      posicao = 0 ;
     
     Pessoa elemento = lista.get(0);
     codigo.setText(elemento.getCodigo().toString());
     nome.setText(elemento.getNome());
     sexo.setSelectedItem(elemento.getSexo());
     
    }                                    

    }//GEN-LAST:event_btnprimeiro1ActionPerformed

    private void btncadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadastrar1ActionPerformed
        Pessoa item = new Pessoa();
        if(nome.getText().isEmpty() || sexo.getSelectedIndex()==0)
        {
              JOptionPane.showMessageDialog(null, "Preencha todos os campos! ");
            
        }
        else 
        {
      item.setNome(nome.getText());
//      item.setCodigo(Integer.parseInt(codigo.getText()));
      item.setSexo(sexo.getSelectedItem().toString());
      PessoaDAO  dao = new PessoaDAO();
      //chama o inserir
      boolean deucerto= dao.inserir(item);
      if(deucerto==true)
      {
          JOptionPane.showMessageDialog(rootPane, "Cadastrado com sucesso");
      }
      else
      {
          JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar");
      }
      lista.add(item); 
      Limpar();
        }
    }//GEN-LAST:event_btncadastrar1ActionPerformed

    private void btnexcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluir1ActionPerformed
       if (nome.getText().isEmpty()== false){
          PessoaDAO dao = new PessoaDAO();
         
         Boolean deucerto = dao.excluir(lista.get(posicao));
         if(deucerto == true)
         {
             JOptionPane.showMessageDialog(rootPane, "excluido com sucesso");
             
         lista= dao.listar();
           Limpar();
         }
         else {
             JOptionPane.showMessageDialog(rootPane, "erro ao excluir");
         }
        
        }
        
   
    }//GEN-LAST:event_btnexcluir1ActionPerformed

    private void btnconsultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultar1ActionPerformed
        String nome1 = JOptionPane.showInputDialog("digite o nome :");
         boolean encontrou = false;
         Pessoa elemento = lista.get(0);
         for (Pessoa pessoa : lista) {
             if (nome1.equals(pessoa.getNome()))
             {
                 encontrou = true ; 
                 break;
             }
         }
         if (encontrou == true)
         {
             JOptionPane.showMessageDialog(null," achou");
             codigo.setText(elemento.getCodigo().toString());
             nome.setText(elemento.getNome());
             sexo.setSelectedItem(elemento.getSexo());
         }
         else
         {
             JOptionPane.showMessageDialog(null,"  nao achou");
         }
       
    }//GEN-LAST:event_btnconsultar1ActionPerformed

    private void btnlimpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpar1ActionPerformed
         codigo.setText(null);
    nome.setText(null);
    sexo.setSelectedIndex(0);
    }//GEN-LAST:event_btnlimpar1ActionPerformed

    private void btnanterior1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanterior1ActionPerformed
              
    if (lista.size() > 0 && posicao > 0)
    {
        posicao = posicao - 1 ;
        Pessoa elemento = lista.get(posicao);
        codigo.setText(elemento.getCodigo().toString());
        nome.setText(elemento.getNome());
        sexo.setSelectedItem(elemento.getSexo());
     
    }
    else{
        JOptionPane.showMessageDialog(null,"nao tem anterior");
    }
    
    }//GEN-LAST:event_btnanterior1ActionPerformed

    private void btnproximo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproximo1ActionPerformed
            if (lista.size() > 0)
          if (posicao != (lista.size()-1 ))
      
          {
          posicao = posicao + 1;
            
     Pessoa elemento = lista.get(posicao);
     codigo.setText(elemento.getCodigo().toString());
     nome.setText(elemento.getNome());
     sexo.setSelectedItem(elemento.getSexo());
   
          } 
          else 
          {
              JOptionPane.showMessageDialog(null," nao tem proximo");
          }
    }//GEN-LAST:event_btnproximo1ActionPerformed

    private void btnultimo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnultimo1ActionPerformed
        if(lista.size() > 0 )
    {
        posicao = lista.size() -1;
      Pessoa elemento = lista.get(posicao);
     codigo.setText(elemento.getCodigo().toString());
     nome.setText(elemento.getNome());
     sexo.setSelectedItem(elemento.getSexo());
    }
    }//GEN-LAST:event_btnultimo1ActionPerformed

    private void btnirlistagem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnirlistagem1ActionPerformed
         pessoaListar tela = new pessoaListar();
      tela.setVisible(true);
     
    }//GEN-LAST:event_btnirlistagem1ActionPerformed

    private void Limpar (){
    codigo.setText(null);
    nome.setText(null);
    sexo.setSelectedIndex(0);
    }
    
    
    
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
            java.util.logging.Logger.getLogger(pessoaManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pessoaManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pessoaManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pessoaManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pessoaManter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnanterior1;
    private javax.swing.JButton btncadastrar1;
    private javax.swing.JButton btnconsultar1;
    private javax.swing.JButton btnexcluir1;
    private javax.swing.JButton btnirlistagem1;
    private javax.swing.JButton btnlimpar1;
    private javax.swing.JButton btnprimeiro1;
    private javax.swing.JButton btnproximo1;
    private javax.swing.JButton btnultimo1;
    private javax.swing.JTextField codigo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblcodigo1;
    private javax.swing.JLabel lblnome1;
    private javax.swing.JLabel lblsexo1;
    private javax.swing.JTextField nome;
    private javax.swing.JComboBox sexo;
    // End of variables declaration//GEN-END:variables
}
