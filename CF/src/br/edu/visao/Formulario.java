package br.edu.visao;

import br.edu.util.Tabela;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

abstract public class Formulario extends javax.swing.JInternalFrame {
    abstract public void iniciarComponentes();
    abstract public void salvarVisao();
    abstract public void criarTabela();
    abstract public void consultaVisao();
    abstract public void atualizarFormulario();
    abstract public void excluirVisao();
    
    JTable tabela;
    DefaultTableModel modelo = new DefaultTableModel();
    Tabela utilTabela = new Tabela();

    public Formulario() {
        initComponents();
        habilitaBotoes(true);
        textoID.setEnabled(false);
        textoNome.setEnabled(false);
        textoTelefone.setEnabled(false);
        habilitaCampos(false);
        criarTabela();
        
        textoBuscar.addKeyListener(
            new KeyAdapter() {
                public void keyReleased(KeyEvent e) {
                    consultaVisao();
        }
    });

        tabela.addMouseListener(
            new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    atualizarFormulario();
              
               
        }
    });
        tabela.addKeyListener(
            new KeyAdapter() {
                public void keyReleased(KeyEvent e) {
                    atualizarFormulario();
        }
    });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botoes = new javax.swing.JPanel();
        novo = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        fechar = new javax.swing.JButton();
        formulario = new javax.swing.JPanel();
        id = new javax.swing.JLabel();
        textoID = new javax.swing.JTextField();
        textoNome = new javax.swing.JTextField();
        textoTelefone = new javax.swing.JTextField();
        nome = new javax.swing.JLabel();
        telefone = new javax.swing.JLabel();
        consultafundo = new javax.swing.JPanel();
        buscar = new javax.swing.JLabel();
        textoBuscar = new javax.swing.JTextField();
        consulta = new javax.swing.JPanel();

        setBackground(new java.awt.Color(140, 137, 137));
        setPreferredSize(new java.awt.Dimension(835, 520));

        botoes.setBackground(new java.awt.Color(140, 137, 137));

        novo.setBackground(new java.awt.Color(102, 153, 255));
        novo.setForeground(new java.awt.Color(255, 215, 0));
        novo.setText("Novo");
        novo.setToolTipText("Criar um novo contato");
        novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoActionPerformed(evt);
            }
        });

        alterar.setBackground(new java.awt.Color(102, 153, 255));
        alterar.setForeground(new java.awt.Color(255, 215, 0));
        alterar.setText("Alterar");
        alterar.setToolTipText("Altere um contato");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        excluir.setBackground(new java.awt.Color(102, 153, 255));
        excluir.setForeground(new java.awt.Color(255, 215, 0));
        excluir.setText("Excluir");
        excluir.setToolTipText("Exclua um contato");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        salvar.setBackground(new java.awt.Color(102, 153, 255));
        salvar.setForeground(new java.awt.Color(255, 215, 0));
        salvar.setText("Salvar");
        salvar.setToolTipText("Salve o contato");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        cancelar.setBackground(new java.awt.Color(102, 153, 255));
        cancelar.setForeground(new java.awt.Color(255, 215, 0));
        cancelar.setText("Cancelar");
        cancelar.setToolTipText("Cancele a ação");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        fechar.setBackground(new java.awt.Color(102, 153, 255));
        fechar.setForeground(new java.awt.Color(255, 215, 0));
        fechar.setText("Fechar");
        fechar.setToolTipText("Retorne a tela principal");
        fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botoesLayout = new javax.swing.GroupLayout(botoes);
        botoes.setLayout(botoesLayout);
        botoesLayout.setHorizontalGroup(
            botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botoesLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(novo)
                .addGap(73, 73, 73)
                .addComponent(alterar)
                .addGap(83, 83, 83)
                .addComponent(excluir)
                .addGap(47, 47, 47)
                .addComponent(salvar)
                .addGap(46, 46, 46)
                .addComponent(cancelar)
                .addGap(36, 36, 36)
                .addComponent(fechar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botoesLayout.setVerticalGroup(
            botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botoesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novo)
                    .addComponent(alterar)
                    .addComponent(excluir)
                    .addComponent(salvar)
                    .addComponent(cancelar)
                    .addComponent(fechar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        formulario.setBackground(new java.awt.Color(140, 137, 137));
        formulario.setForeground(new java.awt.Color(255, 255, 255));

        id.setForeground(new java.awt.Color(255, 215, 0));
        id.setText("ID");

        textoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoIDActionPerformed(evt);
            }
        });

        textoNome.setToolTipText("Digite o nome do contato");
        textoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNomeActionPerformed(evt);
            }
        });

        textoTelefone.setToolTipText("Digite o número do contato");

        nome.setForeground(new java.awt.Color(255, 215, 0));
        nome.setText("Nome");

        telefone.setForeground(new java.awt.Color(255, 215, 0));
        telefone.setText("Telefone");

        javax.swing.GroupLayout formularioLayout = new javax.swing.GroupLayout(formulario);
        formulario.setLayout(formularioLayout);
        formularioLayout.setHorizontalGroup(
            formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id))
                .addGap(56, 56, 56)
                .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome)
                    .addComponent(textoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefone))
                .addGap(60, 60, Short.MAX_VALUE))
        );
        formularioLayout.setVerticalGroup(
            formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id)
                    .addComponent(nome)
                    .addComponent(telefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        consultafundo.setBackground(new java.awt.Color(140, 137, 137));

        buscar.setForeground(new java.awt.Color(255, 215, 0));
        buscar.setText("Buscar");

        textoBuscar.setToolTipText("Pesquise o contato");

        consulta.setBackground(new java.awt.Color(140, 137, 137));

        javax.swing.GroupLayout consultaLayout = new javax.swing.GroupLayout(consulta);
        consulta.setLayout(consultaLayout);
        consultaLayout.setHorizontalGroup(
            consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
        );
        consultaLayout.setVerticalGroup(
            consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 135, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout consultafundoLayout = new javax.swing.GroupLayout(consultafundo);
        consultafundo.setLayout(consultafundoLayout);
        consultafundoLayout.setHorizontalGroup(
            consultafundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultafundoLayout.createSequentialGroup()
                .addGroup(consultafundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(consultafundoLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(buscar)
                        .addGap(18, 18, 18)
                        .addComponent(textoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(consultafundoLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        consultafundoLayout.setVerticalGroup(
            consultafundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultafundoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(consultafundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar)
                    .addComponent(textoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(formulario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(consultafundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(botoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consultafundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharActionPerformed
        dispose();
    }//GEN-LAST:event_fecharActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        habilitaBotoes(true);
        habilitaCampos(false);
        salvarVisao();
        consultaVisao();
    }//GEN-LAST:event_salvarActionPerformed

    private void novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoActionPerformed
        habilitaBotoes(false);
        habilitaCampos(true);
        limpaCampo();
        textoNome.requestFocus();
    }//GEN-LAST:event_novoActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        habilitaBotoes(false);
        habilitaCampos(true);
        textoNome.requestFocus();
    }//GEN-LAST:event_alterarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        limpaCampo();
        habilitaBotoes(true);
        habilitaCampos(false);
    }//GEN-LAST:event_cancelarActionPerformed

    private void textoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoIDActionPerformed

    private void textoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNomeActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        excluirVisao();
        consultaVisao();
        limpaCampo();
        habilitaBotoes(true);
        habilitaCampos(false);


    }//GEN-LAST:event_excluirActionPerformed

    public void habilitaBotoes (boolean estado){
        novo.setEnabled(estado);
        alterar.setEnabled(!estado);
        excluir.setEnabled(!estado);
        salvar.setEnabled(!estado);
        cancelar.setEnabled(!estado);
    }
    public void habilitaCampos (boolean estado) {
        textoNome.setEnabled(estado);
        textoTelefone.setEnabled(estado);
    }
    public void limpaCampo(){
        textoID.setText("");
        textoNome.setText("");
        textoTelefone.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterar;
    private javax.swing.JPanel botoes;
    private javax.swing.JLabel buscar;
    private javax.swing.JButton cancelar;
    public javax.swing.JPanel consulta;
    public javax.swing.JPanel consultafundo;
    private javax.swing.JButton excluir;
    private javax.swing.JButton fechar;
    private javax.swing.JPanel formulario;
    private javax.swing.JLabel id;
    private javax.swing.JLabel nome;
    private javax.swing.JButton novo;
    private javax.swing.JButton salvar;
    private javax.swing.JLabel telefone;
    public javax.swing.JTextField textoBuscar;
    public javax.swing.JTextField textoID;
    public javax.swing.JTextField textoNome;
    public javax.swing.JTextField textoTelefone;
    // End of variables declaration//GEN-END:variables
}

