package br.edu.dao;

import br.edu.interfaces.InterfaceDAO;
import br.edu.modelo.ContatoModelo;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class ContatoDAO implements InterfaceDAO{

    String sql;
    PreparedStatement stm;
    ResultSet resultado;
    
    @Override
    public void consultarDao(Object... valor) throws SQLException {
    DefaultTableModel tabela = (DefaultTableModel) valor[1];
    String texto = (String) valor[0];

    if (texto == null || texto.trim().equals("")) {
        sql = "SELECT * FROM contato";
        stm = ConexaoBanco.abreConexao().prepareStatement(sql);
    } else {
        sql = "SELECT * FROM contato WHERE nome LIKE ? OR telefone LIKE ?";
        stm = ConexaoBanco.abreConexao().prepareStatement(sql);
        stm.setString(1, "%" + texto + "%");
        stm.setString(2, "%" + texto + "%");
    }

    resultado = stm.executeQuery();

    while (resultado.next()) {
        tabela.addRow(new Object[]{
            resultado.getInt("id"),
            resultado.getString("nome"),
            resultado.getString("telefone")
        });
    }
    stm.close();
}
    
    @Override
    public void salvarDao(Object... valor) {

    ContatoModelo cm = (ContatoModelo) valor[0];

    if (cm.getid() == 0) {
        sql = "INSERT INTO contato (nome, telefone) VALUES (?, ?)";
    } else {
        sql = "UPDATE contato SET nome=?, telefone=? WHERE id=?";
    }

    try {
        stm = ConexaoBanco.abreConexao().prepareStatement(sql);

        stm.setString(1, cm.getnome());
        stm.setString(2, cm.gettelefone());

        if (cm.getid() > 0)
            stm.setInt(3, cm.getid());

        stm.execute();
        stm.close();
        JOptionPane.showMessageDialog(null, "Registro Gravado.");

    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Erro: " + erro);
    }
}
    @Override
    public void excluirDao(int textoID) {
        sql = "DELETE FROM contato WHERE id=?";
        try{
            stm = ConexaoBanco.abreConexao().prepareStatement(sql);
            stm.setInt(1, textoID);
            stm.execute();
            stm.close();
            JOptionPane.showMessageDialog(null, "Registro Excluído.");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao tentar excluir o contato." + e);
        }
}}
