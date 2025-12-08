
package br.edu.visao;

import br.edu.controle.ContatoControle;
import javax.swing.table.DefaultTableModel;

public class ContatoVisao extends Formulario {
    public ContatoVisao (){
        setTitle("Cadastro de Contatos: ");
        consultaVisao();
}
    ContatoControle cc = new ContatoControle();
    
    @Override
    public void salvarVisao(){
         cc.salvarControle(textoID.getText(), textoNome.getText(), textoTelefone.getText());
    }

    @Override
    public void iniciarComponentes() {

    }

    @Override
    public void criarTabela() {
        tabela = utilTabela.criarTabela(
                consulta,
                new Object [] {30,100, 100},
                new Object [] {"centro", "esquerda", "direita"},
                new Object [] {"ID", "NOME", "TELEFONE"});
        modelo = (DefaultTableModel) tabela.getModel();
    }

    @Override
    public void consultaVisao() {
        modelo.setNumRows(0);
        cc.consultarControle(textoBuscar.getText(), modelo);
    }

    @Override
    public void atualizarFormulario() {
        habilitaBotoes(false);
        textoID.setText((String) tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
        textoNome.setText((String) tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
        textoTelefone.setText((String) tabela.getValueAt(tabela.getSelectedRow(), 2).toString());
    }

    @Override
    public void excluirVisao() {
        cc.excluirControle(Integer.parseInt(textoID.getText()));
    }
}