
package br.edu.visao;

import br.edu.telas.telaSelecao;
import br.edu.util.PosicaoFormulario;

public class Principal extends javax.swing.JFrame {
    
    PosicaoFormulario form = new PosicaoFormulario();
    
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        barradeMenu = new javax.swing.JMenuBar();
        criar = new javax.swing.JMenu();
        Contato = new javax.swing.JMenuItem();
        sair = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda de Contatos");
        setBackground(new java.awt.Color(0, 102, 204));
        setResizable(false);

        desktop.setBackground(new java.awt.Color(0, 102, 204));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 835, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 497, Short.MAX_VALUE)
        );

        barradeMenu.setBackground(new java.awt.Color(140, 137, 137));

        criar.setBackground(new java.awt.Color(102, 153, 255));
        criar.setForeground(new java.awt.Color(255, 215, 0));
        criar.setText("Criar");
        criar.setToolTipText("Crie um novo contato");

        Contato.setBackground(new java.awt.Color(102, 153, 255));
        Contato.setForeground(new java.awt.Color(255, 215, 0));
        Contato.setText("Contato");
        Contato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContatoActionPerformed(evt);
            }
        });
        criar.add(Contato);

        barradeMenu.add(criar);

        sair.setBackground(new java.awt.Color(102, 153, 255));
        sair.setForeground(new java.awt.Color(255, 215, 0));
        sair.setText("Sair");

        jMenuItem1.setBackground(new java.awt.Color(102, 153, 255));
        jMenuItem1.setForeground(new java.awt.Color(255, 215, 0));
        jMenuItem1.setText("Página de Seleção");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        sair.add(jMenuItem1);

        barradeMenu.add(sair);

        setJMenuBar(barradeMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContatoActionPerformed
        ContatoVisao tela;
        form.abrirFormulario(tela = new ContatoVisao(), desktop);
    }//GEN-LAST:event_ContatoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        telaSelecao novaTela = new telaSelecao();
        novaTela.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_jMenuItem1ActionPerformed

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Contato;
    private javax.swing.JMenuBar barradeMenu;
    private javax.swing.JMenu criar;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu sair;
    // End of variables declaration//GEN-END:variables
}
