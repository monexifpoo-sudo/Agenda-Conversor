
package br.edu.telas;

import br.edu.conversor.Conversor;
import br.edu.visao.Principal;

public class telaSelecao extends javax.swing.JFrame {

    public telaSelecao() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaDaSelecao = new javax.swing.JPanel();
        voltar = new javax.swing.JButton();
        agenda = new javax.swing.JButton();
        conversor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 204));
        setPreferredSize(new java.awt.Dimension(835, 520));
        setResizable(false);

        telaDaSelecao.setBackground(new java.awt.Color(0, 102, 204));
        telaDaSelecao.setPreferredSize(new java.awt.Dimension(835, 520));

        voltar.setBackground(new java.awt.Color(102, 153, 255));
        voltar.setForeground(new java.awt.Color(255, 215, 0));
        voltar.setText("Voltar");
        voltar.setToolTipText("Retorna a tela de login ");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        agenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/imagens/iconAgenda.png"))); // NOI18N
        agenda.setToolTipText("Clique para abrir a agenda");
        agenda.setBorder(null);
        agenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agendaActionPerformed(evt);
            }
        });

        conversor.setBackground(new java.awt.Color(0, 0, 0));
        conversor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/imagens/iconConversor.png"))); // NOI18N
        conversor.setToolTipText("Clique para abrir o conversor");
        conversor.setBorder(null);
        conversor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conversorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout telaDaSelecaoLayout = new javax.swing.GroupLayout(telaDaSelecao);
        telaDaSelecao.setLayout(telaDaSelecaoLayout);
        telaDaSelecaoLayout.setHorizontalGroup(
            telaDaSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaDaSelecaoLayout.createSequentialGroup()
                .addGap(348, 348, 348)
                .addComponent(voltar)
                .addContainerGap(358, Short.MAX_VALUE))
            .addGroup(telaDaSelecaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(agenda)
                .addGap(153, 153, 153)
                .addComponent(conversor)
                .addGap(166, 166, 166))
        );
        telaDaSelecaoLayout.setVerticalGroup(
            telaDaSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaDaSelecaoLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(telaDaSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(agenda)
                    .addComponent(conversor))
                .addGap(60, 60, 60)
                .addComponent(voltar)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(telaDaSelecao, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(telaDaSelecao, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        telaLogin novaTela = new telaLogin();
        novaTela.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_voltarActionPerformed

    private void conversorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conversorActionPerformed
        Conversor novaTela = new Conversor();
        novaTela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_conversorActionPerformed

    private void agendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agendaActionPerformed
        Principal novaTela = new Principal();
        novaTela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_agendaActionPerformed

    
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaSelecao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agenda;
    private javax.swing.JButton conversor;
    private javax.swing.JPanel telaDaSelecao;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
