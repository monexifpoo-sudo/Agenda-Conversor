
package br.edu.controle;

import br.edu.dao.ContatoDAO;
import br.edu.interfaces.InterfaceControle;
import br.edu.modelo.ContatoModelo;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.SQLException;

public class ContatoControle implements InterfaceControle{

    ContatoModelo cm = new ContatoModelo();
    ContatoDAO cd = new ContatoDAO();
    
    @Override
    public void salvarControle(Object... valor) {
        if ("".equals (valor[0])){
            cm.setid(0);
        } else {
            cm.setid(Integer.parseInt(valor[0].toString()));
        }
        
        cm.setnome((String) valor[1]);
        cm.settelefone((String) valor[2]);
        
        cd.salvarDao(cm);
    }

    @Override
    public void excluirControle(int textoID) {
        cd.excluirDao(textoID);
    }

    @Override
    public void consultarControle(Object... valor) {
        try {
            cd.consultarDao(valor);
        } catch (SQLException erro) {
            Logger.getLogger(ContatoControle.class.getName()).log(Level.SEVERE, null, erro);
    }
        
    }
    
}
