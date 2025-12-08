package br.edu.telas;
import javax.swing.JOptionPane;
public class telaLogin extends javax.swing.JFrame {
    public telaLogin() {
        initComponents();}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundoVisivel = new javax.swing.JPanel();
        nomeUser = new javax.swing.JLabel();
        nomeSenha = new javax.swing.JLabel();
        textoUser = new javax.swing.JTextField();
        entrar = new javax.swing.JButton();
        limpar = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        textoSenha = new javax.swing.JPasswordField();
        iconLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 204));
        setResizable(false);

        fundoVisivel.setBackground(new java.awt.Color(0, 102, 204));
        fundoVisivel.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        fundoVisivel.setPreferredSize(new java.awt.Dimension(820, 500));

        nomeUser.setBackground(new java.awt.Color(0, 102, 204));
        nomeUser.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        nomeUser.setForeground(new java.awt.Color(255, 215, 0));
        nomeUser.setText("Usuário:");
        nomeUser.setIconTextGap(100);

        nomeSenha.setBackground(new java.awt.Color(0, 102, 204));
        nomeSenha.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        nomeSenha.setForeground(new java.awt.Color(255, 215, 0));
        nomeSenha.setText("Senha:");
        nomeSenha.setIconTextGap(100);

        textoUser.setToolTipText("Digite o nome de usuário");
        textoUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoUserActionPerformed(evt);
            }
        });

        entrar.setBackground(new java.awt.Color(102, 153, 255));
        entrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        entrar.setForeground(new java.awt.Color(255, 215, 0));
        entrar.setText("Entrar");
        entrar.setToolTipText("Entra no sistema");
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });

        limpar.setBackground(new java.awt.Color(102, 153, 255));
        limpar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        limpar.setForeground(new java.awt.Color(255, 215, 0));
        limpar.setText("Limpar");
        limpar.setToolTipText("Limpa os campos");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        sair.setBackground(new java.awt.Color(102, 153, 255));
        sair.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sair.setForeground(new java.awt.Color(255, 215, 0));
        sair.setText("Sair");
        sair.setToolTipText("Saia do programa");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        textoSenha.setToolTipText("Digite a senha");
        textoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoSenhaActionPerformed(evt);
            }
        });

        iconLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/imagens/loginAma.png"))); // NOI18N

        javax.swing.GroupLayout fundoVisivelLayout = new javax.swing.GroupLayout(fundoVisivel);
        fundoVisivel.setLayout(fundoVisivelLayout);
        fundoVisivelLayout.setHorizontalGroup(
            fundoVisivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoVisivelLayout.createSequentialGroup()
                .addGroup(fundoVisivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundoVisivelLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(entrar)
                        .addGap(80, 80, 80)
                        .addComponent(limpar)
                        .addGap(85, 85, 85)
                        .addComponent(sair))
                    .addGroup(fundoVisivelLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(fundoVisivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeUser)
                            .addComponent(nomeSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(fundoVisivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(fundoVisivelLayout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(iconLogin)))
                .addContainerGap(239, Short.MAX_VALUE))
        );
        fundoVisivelLayout.setVerticalGroup(
            fundoVisivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoVisivelLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(iconLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(fundoVisivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeUser))
                .addGap(38, 38, 38)
                .addGroup(fundoVisivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeSenha))
                .addGap(51, 51, 51)
                .addGroup(fundoVisivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entrar)
                    .addComponent(limpar)
                    .addComponent(sair))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fundoVisivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fundoVisivel, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textoUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoUserActionPerformed
        textoUser.setToolTipText("Nome usuario");
    }//GEN-LAST:event_textoUserActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        textoUser.setText("");
        textoSenha.setText("");
    }//GEN-LAST:event_limparActionPerformed

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
        if (textoUser.getText().equals("root") && textoSenha.getText().equals("toor")){
            JOptionPane.showMessageDialog(null, "Usuário logado!");
            telaSelecao novaTela = new telaSelecao();
            novaTela.setVisible(true);
            this.dispose(); 
        }
        else {
            JOptionPane.showMessageDialog(null, "Usuário não logado!");
        }
    }//GEN-LAST:event_entrarActionPerformed

    private void textoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoSenhaActionPerformed
        textoSenha.setToolTipText("Senha usuario");
    }//GEN-LAST:event_textoSenhaActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        dispose();
    }//GEN-LAST:event_sairActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaLogin().setVisible(true);}});}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton entrar;
    private javax.swing.JPanel fundoVisivel;
    private javax.swing.JLabel iconLogin;
    private javax.swing.JButton limpar;
    private javax.swing.JLabel nomeSenha;
    private javax.swing.JLabel nomeUser;
    private javax.swing.JButton sair;
    private javax.swing.JPasswordField textoSenha;
    private javax.swing.JTextField textoUser;
    // End of variables declaration//GEN-END:variables
}