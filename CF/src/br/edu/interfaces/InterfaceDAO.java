
package br.edu.interfaces;

import java.sql.SQLException;

public interface InterfaceDAO {
    public void salvarDao(Object... valor);
    public void excluirDao(int textoID);
    public void consultarDao(Object... valor) throws SQLException;
}
