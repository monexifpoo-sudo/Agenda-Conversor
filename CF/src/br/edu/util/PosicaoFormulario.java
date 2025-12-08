
package br.edu.util;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class PosicaoFormulario {
    public void abrirFormulario(JInternalFrame janela, JDesktopPane desktop){
        int lDesk = desktop.getWidth();
        int aDesk = desktop.getHeight();
        int lIFrame = janela.getWidth();
        int aIFrame = janela.getHeight();
        
        janela.setLocation(lDesk / 5 - lIFrame / 5, aDesk / 5 - aIFrame/ 5);
        desktop.add(janela);
        janela.setVisible(true);
    }
}
