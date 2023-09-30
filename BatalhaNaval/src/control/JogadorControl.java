package control;

import model.Tabuleiro;
import view.Janela;

/**
 *
 * @author Arthur
 */
public class JogadorControl {
    
    private Janela origem;

    public JogadorControl(Janela origem) {
        this.origem = origem;
    }
    
    public int[] getAtk() {
        return this.origem.getCoordAtk();
    }
    
    public int[] getParInicial() throws NumberFormatException, StringIndexOutOfBoundsException{
        return TabuleiroControl.convertePosicao(this.origem.getTempCoordNavio());
    }
    
    public boolean getDirecaoNavio() {
        return origem.isTempPosNavio();
    }
}
