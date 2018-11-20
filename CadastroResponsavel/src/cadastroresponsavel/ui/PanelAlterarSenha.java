package cadastroresponsavel.ui;

import cadastroresponsavel.controller.UsuarioController;
import cadastroresponsavel.model.Usuario;
import javax.swing.*;

public class PanelAlterarSenha extends javax.swing.JPanel {

    public PanelAlterarSenha() {
        initComponents();
    }

    PanelAlterarSenha(Usuario usuario) {
        initComponents();
        tfProntuario.setText(usuario.getProntuario());
        tfNome.setText(usuario.getNome());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfSenha = new javax.swing.JPasswordField();
        lbSenha = new javax.swing.JLabel();
        btAlterar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        tfSenhaRepetir = new javax.swing.JPasswordField();
        lbSenhaRepetir = new javax.swing.JLabel();
        lbProntuario = new javax.swing.JLabel();
        tfProntuario = new javax.swing.JTextField();
        tfNovaSenha = new javax.swing.JPasswordField();
        lbNovaSenha = new javax.swing.JLabel();

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Alterar Senha");

        lbNome.setText("Nome:");

        tfNome.setEnabled(false);

        lbSenha.setText("Senha:");

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        lbSenhaRepetir.setText("Nova Senha (repetir):");

        lbProntuario.setText("Prontuário:");

        tfProntuario.setEnabled(false);

        lbNovaSenha.setText("Nova Senha:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbSenha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbSenhaRepetir)
                                    .addComponent(lbNovaSenha, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfSenhaRepetir, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbNome)
                                .addGap(18, 18, 18)
                                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbProntuario)
                                .addGap(18, 18, 18)
                                .addComponent(tfProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btAlterar)
                .addGap(18, 18, 18)
                .addComponent(btLimpar)
                .addGap(18, 18, 18)
                .addComponent(btCancelar)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProntuario)
                    .addComponent(tfProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSenha)
                    .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNovaSenha)
                    .addComponent(tfNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSenhaRepetir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSenhaRepetir))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAlterar)
                    .addComponent(btCancelar)
                    .addComponent(btLimpar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        String prontuario, nome; 
        char[] senha, novasenha, repnovasenha;
        
        nome = tfNome.getText();
        prontuario = tfProntuario.getText();
        senha = tfSenha.getPassword();
        novasenha = tfNovaSenha.getPassword();
        repnovasenha = tfSenhaRepetir.getPassword();
        
        if(String.valueOf(novasenha).compareTo(String.valueOf(repnovasenha)) == 0){
            Usuario usuario = new Usuario(prontuario, nome, String.valueOf(senha));
            
            UsuarioController uc = new UsuarioController();
            if(uc.alterarsenha(usuario, String.valueOf(novasenha))){
                JOptionPane.showMessageDialog(null, "Senha alterada com sucesso!!");
            }else{
                JOptionPane.showMessageDialog(null, "A senha não pôde ser alterada!! Verifique os dados inseridos, por favor.");
                tfSenha.setText("");
                tfNovaSenha.setText("");
                tfSenhaRepetir.setText("");
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "As senhas não são iguais!!");
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        tfSenha.setText("");
        tfNovaSenha.setText("");
        tfSenhaRepetir.setText("");
    }//GEN-LAST:event_btLimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNovaSenha;
    private javax.swing.JLabel lbProntuario;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbSenhaRepetir;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField tfNome;
    private javax.swing.JPasswordField tfNovaSenha;
    private javax.swing.JTextField tfProntuario;
    private javax.swing.JPasswordField tfSenha;
    private javax.swing.JPasswordField tfSenhaRepetir;
    // End of variables declaration//GEN-END:variables
}
