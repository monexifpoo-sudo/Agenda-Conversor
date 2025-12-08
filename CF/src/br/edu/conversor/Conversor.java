

package br.edu.conversor;

import br.edu.telas.telaSelecao;
import javax.swing.JOptionPane;
import java.io.File;
import java.awt.Desktop;

public class Conversor extends javax.swing.JFrame {

    public Conversor() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        boxMoeda = new javax.swing.JComboBox<>();
        boxValor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        boxConvertido = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(835, 520));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("llçç");
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 70));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" CONVERSOR DE MOEDAS");
        jLabel1.setPreferredSize(new java.awt.Dimension(300, 80));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName("CONVERSOR");

        boxMoeda.setBackground(new java.awt.Color(204, 204, 204));
        boxMoeda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dólar para Real", "Euro para Real", "Iene Japonês para Real", "Libra Egípcia para Real", "Peso Mexicano para Real", "Yuan Chinês para Real", "Real para Dólar", "Real para Euro", "Real para Iene Japonês", "Real para Libra Egípcia", "Real para Peso Mexicano", "Real para Yuan Chinês" }));
        boxMoeda.setToolTipText("Selecione a transição monetária");

        boxValor.setBackground(new java.awt.Color(204, 204, 204));
        boxValor.setToolTipText("Digite o valor a ser convertido");

        jButton1.setBackground(new java.awt.Color(140, 137, 137));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Limpar");
        jButton1.setToolTipText("Limpa o valor digitado");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 215, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Converter");
        jButton2.setToolTipText("Realiza a conversão");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField4.setText("Valor convertido:");
        jTextField4.setToolTipText("Valor final da transição");

        boxConvertido.setBackground(new java.awt.Color(204, 204, 204));
        boxConvertido.setToolTipText("Valor final da transição");
        boxConvertido.setPreferredSize(new java.awt.Dimension(163, 31));

        jButton3.setBackground(new java.awt.Color(140, 137, 137));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Limpar");
        jButton3.setToolTipText("Limpa o valor convertido");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(102, 153, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setText("Acessibilidade");
        jButton5.setToolTipText("Vídeo explicativo para pessoas com deficiência auditiva");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Converta Moedas");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Digite o valor");

        jButton4.setBackground(new java.awt.Color(140, 137, 137));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("Voltar");
        jButton4.setToolTipText("Volte a página de seleção");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxMoeda, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boxValor, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(80, 80, 80))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(boxConvertido, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addGap(55, 55, 55))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(318, 318, 318))))
            .addGroup(layout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addComponent(jButton3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxMoeda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(boxValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxConvertido, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        boxValor.setText(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        boxConvertido.setText(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Double reais, euro, dolar, iene, libra, peso, yuan;
        if (boxValor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
            null,
            "Erro!\nCampo de valor está vazio!",
            "Dados inválidos",
            JOptionPane.WARNING_MESSAGE);
            boxValor.requestFocus();
            return;
        } 
        
        String boxV = (String)boxMoeda.getSelectedItem();
        
        if (boxV.equals("Dólar para Real")) {
        
        dolar = Double.parseDouble(boxValor.getText());
        reais = (dolar * 5.27);
        
        boxConvertido.setText(String.valueOf(reais));
    }
        
        if (boxV.equals("Euro para Real")) {
        
        euro = Double.parseDouble(boxValor.getText());
        reais = (euro * 6.12);
        
        boxConvertido.setText(String.valueOf(reais));
    }
        
        if (boxV.equals("Iene Japonês para Real")) {
        
        iene = Double.parseDouble(boxValor.getText());
        reais = (iene * 0.034);
        
        boxConvertido.setText(String.valueOf(reais));
    }
        
        if (boxV.equals("Libra Egípcia para Real")) {
        
        libra = Double.parseDouble(boxValor.getText());
        reais = (libra * 0.11);
        
        boxConvertido.setText(String.valueOf(reais));
    }
        
        if (boxV.equals("Peso Mexicano para Real")) {
        
        peso = Double.parseDouble(boxValor.getText());
        reais = (peso * 0.29);
        
        boxConvertido.setText(String.valueOf(reais));
    }
        
        if (boxV.equals("Yuan Chinês para Real")) {
        
        yuan = Double.parseDouble(boxValor.getText());
        reais = (yuan * 0.76);
        
        boxConvertido.setText(String.valueOf(reais));
    }
        
        if (boxV.equals("Real para Dólar")) {
        
        reais = Double.parseDouble(boxValor.getText());
        dolar = (reais * 0.19);
        
        boxConvertido.setText(String.valueOf(dolar));
    }
        
        if (boxV.equals("Real para Iene Japonês")) {
        
        reais = Double.parseDouble(boxValor.getText());
        iene = (reais * 29.18);
        
        boxConvertido.setText(String.valueOf(iene));
    }
        
        if (boxV.equals("Real para Libra Egípcia")) {
        
        reais = Double.parseDouble(boxValor.getText());
        libra = (reais * 8.96);
        
        boxConvertido.setText(String.valueOf(libra));
    }
        
        if (boxV.equals("Real para Euro")) {
        
        reais = Double.parseDouble(boxValor.getText());
        euro = (reais * 0.16);
        
        boxConvertido.setText(String.valueOf(euro));
    }
        
        if (boxV.equals("Real para Peso Mexicano")) {
        
        reais = Double.parseDouble(boxValor.getText());
        peso = (reais * 3.42);
        
        boxConvertido.setText(String.valueOf(peso));
    }
        
        if (boxV.equals("Real para Yuan Chinês")) {
        
        reais = Double.parseDouble(boxValor.getText());
        yuan = (reais * 1.32);
        
        boxConvertido.setText(String.valueOf(yuan));
    }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
        File video = new File("video/meuVideo.mp4");  // caminho relativo

        if (video.exists()) {
            Desktop.getDesktop().open(video);
        } else {
            JOptionPane.showMessageDialog(this, "Vídeo não encontrado!");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao abrir o vídeo:\n" + e.getMessage());
    }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        telaSelecao novaTela = new telaSelecao();
        novaTela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversor().setVisible(true);
            }
        });
       
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boxConvertido;
    private javax.swing.JComboBox<String> boxMoeda;
    private javax.swing.JTextField boxValor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
