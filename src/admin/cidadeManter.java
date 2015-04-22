package admin;

import dao.CidadeDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Cidade;

public class cidadeManter extends javax.swing.JFrame {
     List<Cidade> lista;
    Integer posicao;
    public cidadeManter() {
        initComponents();  
        CidadeDAO dao = new CidadeDAO();
        lista = dao.listar();
        posicao = 0;
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        lblcodigo = new javax.swing.JLabel();
        lblnome = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnprimeiro = new javax.swing.JButton();
        btnanterior = new javax.swing.JButton();
        btnproximo = new javax.swing.JButton();
        btnultimo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btncadastrar = new javax.swing.JButton();
        btnexcluir = new javax.swing.JButton();
        btnlimpar = new javax.swing.JButton();
        btnconsultar = new javax.swing.JButton();
        btnlistagem = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblcodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblcodigo.setText("Codigo  :");

        lblnome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblnome.setText("Nome :");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Navegação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 0, 0));

        btnprimeiro.setForeground(new java.awt.Color(255, 0, 0));
        btnprimeiro.setText("Primeiro");
        btnprimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprimeiroActionPerformed(evt);
            }
        });

        btnanterior.setForeground(new java.awt.Color(255, 0, 0));
        btnanterior.setText("Anterior");
        btnanterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnanteriorActionPerformed(evt);
            }
        });

        btnproximo.setForeground(new java.awt.Color(255, 0, 0));
        btnproximo.setText("Próximo");
        btnproximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproximoActionPerformed(evt);
            }
        });

        btnultimo.setForeground(new java.awt.Color(255, 0, 0));
        btnultimo.setText("Último");
        btnultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnultimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnprimeiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnanterior)
                .addGap(22, 22, 22)
                .addComponent(btnproximo)
                .addGap(18, 18, 18)
                .addComponent(btnultimo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnprimeiro)
                    .addComponent(btnproximo)
                    .addComponent(btnanterior)
                    .addComponent(btnultimo))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 0, 0));

        btncadastrar.setForeground(new java.awt.Color(255, 0, 0));
        btncadastrar.setText("Cadastrar");
        btncadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadastrarActionPerformed(evt);
            }
        });

        btnexcluir.setForeground(new java.awt.Color(255, 0, 0));
        btnexcluir.setText("Excluir");
        btnexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirActionPerformed(evt);
            }
        });

        btnlimpar.setForeground(new java.awt.Color(255, 0, 0));
        btnlimpar.setText("Limpar");
        btnlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimparActionPerformed(evt);
            }
        });

        btnconsultar.setForeground(new java.awt.Color(255, 0, 0));
        btnconsultar.setText("Consultar");
        btnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarActionPerformed(evt);
            }
        });

        btnlistagem.setForeground(new java.awt.Color(0, 0, 204));
        btnlistagem.setText("Listagem");
        btnlistagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnlistagem)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btncadastrar)
                        .addGap(15, 15, 15)
                        .addComponent(btnexcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnlimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnconsultar)))
                .addGap(0, 16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncadastrar)
                    .addComponent(btnlimpar)
                    .addComponent(btnexcluir)
                    .addComponent(btnconsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(btnlistagem)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcodigo)
                    .addComponent(lblnome))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(codigo)
                    .addComponent(nome, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addContainerGap(138, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcodigo)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnprimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprimeiroActionPerformed
       if (lista.size() > 0)
      {
      posicao = 0 ;
     
     Cidade elemento = lista.get(0);
     codigo.setText(elemento.getCodigo().toString());
     nome.setText(elemento.getNome());
      }
     
    }//GEN-LAST:event_btnprimeiroActionPerformed

    private void btncadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadastrarActionPerformed
         Cidade ci = new Cidade();
         
        if(nome.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "preencha todos os campos obrigatorios");
            
        }
        else 
        {
      ci.setNome(nome.getText());
     ci.setCodigo(Integer.parseInt(codigo.getText()));
     
      CidadeDAO  dao = new CidadeDAO();
      
      boolean deucerto= dao.inserir(ci);
      if(deucerto==true)
      {
          JOptionPane.showMessageDialog(rootPane, "Cadastrado com sucesso");
      }
      else
      {
          JOptionPane.showMessageDialog(rootPane, " Cadastro não efetuado!");
      }
      lista.add(ci); 
      Limpar();
         }
    }//GEN-LAST:event_btncadastrarActionPerformed

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
       if (nome.getText().isEmpty()== false){
          CidadeDAO dao = new CidadeDAO();
         
         Boolean deucerto = dao.excluir(lista.get(posicao));
         if(deucerto == true)
         {
             JOptionPane.showMessageDialog(rootPane, "Excluído com sucesso");
             
         lista= dao.listar();
           Limpar();
         }
         else {
             JOptionPane.showMessageDialog(rootPane, "Erro ao excluir");
          }
       }
    }//GEN-LAST:event_btnexcluirActionPerformed

    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
         String nome1 = JOptionPane.showInputDialog("Digite O Nome Da Cidade :");
         boolean encontrou = false;
        Cidade elemento = lista.get(0);
         for (Cidade cidade : lista) {
             if (nome1.equals(cidade.getNome()))
             {
                 encontrou = true ; 
                 break;
             }
         }
         if (encontrou == true)
         {
             JOptionPane.showMessageDialog(null," ACHOU!");
             codigo.setText(elemento.getCodigo().toString());
             nome.setText(elemento.getNome());
         }
         else
         {
             JOptionPane.showMessageDialog(null," NÃO  ACHOU!");
         }
    }//GEN-LAST:event_btnconsultarActionPerformed

    private void btnlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimparActionPerformed
        codigo.setText(null);
        nome.setText(null);
    
    }//GEN-LAST:event_btnlimparActionPerformed

    private void btnanteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanteriorActionPerformed
        if (lista.size() > 0 && posicao > 0)
    {
        posicao = posicao - 1 ;
        Cidade elemento = lista.get(posicao);
        codigo.setText(elemento.getCodigo().toString());
        nome.setText(elemento.getNome());
        
    }
    else{
        JOptionPane.showMessageDialog(null,"NÃO EXISTE ANTERIOR!");
    }
    
    }//GEN-LAST:event_btnanteriorActionPerformed

    private void btnproximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproximoActionPerformed
        if (lista.size() > 0)
          if (posicao != (lista.size()-1 ))
      
          {
          posicao = posicao + 1;
            
     Cidade elemento = lista.get(posicao);
     codigo.setText(elemento.getCodigo().toString());
     nome.setText(elemento.getNome());
     
   
          } 
          else 
          {
              JOptionPane.showMessageDialog(null," NÃO EXISTE PRÓXIMO!");
          }
    }//GEN-LAST:event_btnproximoActionPerformed

    private void btnultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnultimoActionPerformed
       if(lista.size() > 0 )
    {
        posicao = lista.size() -1;
      Cidade elemento = lista.get(posicao);
     codigo.setText(elemento.getCodigo().toString());
     nome.setText(elemento.getNome());
     
    }
    }//GEN-LAST:event_btnultimoActionPerformed

    private void btnlistagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistagemActionPerformed
        cidadeListar tela = new cidadeListar();
      tela.setVisible(true);
     
    }//GEN-LAST:event_btnlistagemActionPerformed
      private void Limpar (){
      codigo.setText(null);
       nome.setText(null);
       
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
            java.util.logging.Logger.getLogger(cidadeManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cidadeManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cidadeManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cidadeManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cidadeManter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnanterior;
    private javax.swing.JButton btncadastrar;
    private javax.swing.JButton btnconsultar;
    private javax.swing.JButton btnexcluir;
    private javax.swing.JButton btnlimpar;
    private javax.swing.JButton btnlistagem;
    private javax.swing.JButton btnprimeiro;
    private javax.swing.JButton btnproximo;
    private javax.swing.JButton btnultimo;
    private javax.swing.JTextField codigo;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblcodigo;
    private javax.swing.JLabel lblnome;
    private javax.swing.JTextField nome;
    // End of variables declaration//GEN-END:variables

    private Object getCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
