
package br.edu.dao;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
    private static final String driverClass = "com.mysql.cj.jdbc.Driver";
private static final String url = "jdbc:mysql://localhost:3306/bd_poo_majek";
private static final String usuario = "root";
private static final String senha = "toor";

public static Connection abreConexao() {
    Connection con = null;
    try {
        Class.forName(driverClass);
        con = DriverManager.getConnection(url, usuario, senha);
    } catch (ClassNotFoundException | SQLException erro) {
        JOptionPane.showMessageDialog(null, "Erro de conexão com o banco de dados: " + erro);
    }
    return con;
}
}
